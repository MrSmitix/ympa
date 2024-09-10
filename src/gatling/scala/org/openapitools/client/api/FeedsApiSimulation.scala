package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class FeedsApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("https://api.partner.market.yandex.ru")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val getFeedPerSecond = config.getDouble("performance.operationsPerSecond.getFeed") * rateMultiplier * instanceMultiplier
    val getFeedIndexLogsPerSecond = config.getDouble("performance.operationsPerSecond.getFeedIndexLogs") * rateMultiplier * instanceMultiplier
    val getFeedsPerSecond = config.getDouble("performance.operationsPerSecond.getFeeds") * rateMultiplier * instanceMultiplier
    val refreshFeedPerSecond = config.getDouble("performance.operationsPerSecond.refreshFeed") * rateMultiplier * instanceMultiplier
    val setFeedParamsPerSecond = config.getDouble("performance.operationsPerSecond.setFeedParams") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val getFeedPATHFeeder = csv(userDataDirectory + File.separator + "getFeed-pathParams.csv").random
    val getFeedIndexLogsQUERYFeeder = csv(userDataDirectory + File.separator + "getFeedIndexLogs-queryParams.csv").random
    val getFeedIndexLogsPATHFeeder = csv(userDataDirectory + File.separator + "getFeedIndexLogs-pathParams.csv").random
    val getFeedsPATHFeeder = csv(userDataDirectory + File.separator + "getFeeds-pathParams.csv").random
    val refreshFeedPATHFeeder = csv(userDataDirectory + File.separator + "refreshFeed-pathParams.csv").random
    val setFeedParamsPATHFeeder = csv(userDataDirectory + File.separator + "setFeedParams-pathParams.csv").random

    // Setup all scenarios

    
    val scngetFeed = scenario("getFeedSimulation")
        .feed(getFeedPATHFeeder)
        .exec(http("getFeed")
        .httpRequest("GET","/campaigns/${campaignId}/feeds/${feedId}")
)

    // Run scngetFeed with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFeed.inject(
        rampUsersPerSec(1) to(getFeedPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFeedPerSecond) during(durationSeconds),
        rampUsersPerSec(getFeedPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFeedIndexLogs = scenario("getFeedIndexLogsSimulation")
        .feed(getFeedIndexLogsQUERYFeeder)
        .feed(getFeedIndexLogsPATHFeeder)
        .exec(http("getFeedIndexLogs")
        .httpRequest("GET","/campaigns/${campaignId}/feeds/${feedId}/index-logs")
        .queryParam("status","${status}")
        .queryParam("published_time_from","${published_time_from}")
        .queryParam("limit","${limit}")
        .queryParam("published_time_to","${published_time_to}")
)

    // Run scngetFeedIndexLogs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFeedIndexLogs.inject(
        rampUsersPerSec(1) to(getFeedIndexLogsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFeedIndexLogsPerSecond) during(durationSeconds),
        rampUsersPerSec(getFeedIndexLogsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFeeds = scenario("getFeedsSimulation")
        .feed(getFeedsPATHFeeder)
        .exec(http("getFeeds")
        .httpRequest("GET","/campaigns/${campaignId}/feeds")
)

    // Run scngetFeeds with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFeeds.inject(
        rampUsersPerSec(1) to(getFeedsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFeedsPerSecond) during(durationSeconds),
        rampUsersPerSec(getFeedsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnrefreshFeed = scenario("refreshFeedSimulation")
        .feed(refreshFeedPATHFeeder)
        .exec(http("refreshFeed")
        .httpRequest("POST","/campaigns/${campaignId}/feeds/${feedId}/refresh")
)

    // Run scnrefreshFeed with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnrefreshFeed.inject(
        rampUsersPerSec(1) to(refreshFeedPerSecond) during(rampUpSeconds),
        constantUsersPerSec(refreshFeedPerSecond) during(durationSeconds),
        rampUsersPerSec(refreshFeedPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsetFeedParams = scenario("setFeedParamsSimulation")
        .feed(setFeedParamsPATHFeeder)
        .exec(http("setFeedParams")
        .httpRequest("POST","/campaigns/${campaignId}/feeds/${feedId}/params")
)

    // Run scnsetFeedParams with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsetFeedParams.inject(
        rampUsersPerSec(1) to(setFeedParamsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(setFeedParamsPerSecond) during(durationSeconds),
        rampUsersPerSec(setFeedParamsPerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
