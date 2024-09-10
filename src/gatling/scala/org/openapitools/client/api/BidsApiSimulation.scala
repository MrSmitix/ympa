package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class BidsApiSimulation extends Simulation {

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
    val getBidsInfoForBusinessPerSecond = config.getDouble("performance.operationsPerSecond.getBidsInfoForBusiness") * rateMultiplier * instanceMultiplier
    val getBidsRecommendationsPerSecond = config.getDouble("performance.operationsPerSecond.getBidsRecommendations") * rateMultiplier * instanceMultiplier
    val putBidsForBusinessPerSecond = config.getDouble("performance.operationsPerSecond.putBidsForBusiness") * rateMultiplier * instanceMultiplier
    val putBidsForCampaignPerSecond = config.getDouble("performance.operationsPerSecond.putBidsForCampaign") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val getBidsInfoForBusinessQUERYFeeder = csv(userDataDirectory + File.separator + "getBidsInfoForBusiness-queryParams.csv").random
    val getBidsInfoForBusinessPATHFeeder = csv(userDataDirectory + File.separator + "getBidsInfoForBusiness-pathParams.csv").random
    val getBidsRecommendationsPATHFeeder = csv(userDataDirectory + File.separator + "getBidsRecommendations-pathParams.csv").random
    val putBidsForBusinessPATHFeeder = csv(userDataDirectory + File.separator + "putBidsForBusiness-pathParams.csv").random
    val putBidsForCampaignPATHFeeder = csv(userDataDirectory + File.separator + "putBidsForCampaign-pathParams.csv").random

    // Setup all scenarios

    
    val scngetBidsInfoForBusiness = scenario("getBidsInfoForBusinessSimulation")
        .feed(getBidsInfoForBusinessQUERYFeeder)
        .feed(getBidsInfoForBusinessPATHFeeder)
        .exec(http("getBidsInfoForBusiness")
        .httpRequest("POST","/businesses/${businessId}/bids/info")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetBidsInfoForBusiness with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBidsInfoForBusiness.inject(
        rampUsersPerSec(1) to(getBidsInfoForBusinessPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBidsInfoForBusinessPerSecond) during(durationSeconds),
        rampUsersPerSec(getBidsInfoForBusinessPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetBidsRecommendations = scenario("getBidsRecommendationsSimulation")
        .feed(getBidsRecommendationsPATHFeeder)
        .exec(http("getBidsRecommendations")
        .httpRequest("POST","/businesses/${businessId}/bids/recommendations")
)

    // Run scngetBidsRecommendations with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBidsRecommendations.inject(
        rampUsersPerSec(1) to(getBidsRecommendationsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBidsRecommendationsPerSecond) during(durationSeconds),
        rampUsersPerSec(getBidsRecommendationsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnputBidsForBusiness = scenario("putBidsForBusinessSimulation")
        .feed(putBidsForBusinessPATHFeeder)
        .exec(http("putBidsForBusiness")
        .httpRequest("PUT","/businesses/${businessId}/bids")
)

    // Run scnputBidsForBusiness with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnputBidsForBusiness.inject(
        rampUsersPerSec(1) to(putBidsForBusinessPerSecond) during(rampUpSeconds),
        constantUsersPerSec(putBidsForBusinessPerSecond) during(durationSeconds),
        rampUsersPerSec(putBidsForBusinessPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnputBidsForCampaign = scenario("putBidsForCampaignSimulation")
        .feed(putBidsForCampaignPATHFeeder)
        .exec(http("putBidsForCampaign")
        .httpRequest("PUT","/campaigns/${campaignId}/bids")
)

    // Run scnputBidsForCampaign with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnputBidsForCampaign.inject(
        rampUsersPerSec(1) to(putBidsForCampaignPerSecond) during(rampUpSeconds),
        constantUsersPerSec(putBidsForCampaignPerSecond) during(durationSeconds),
        rampUsersPerSec(putBidsForCampaignPerSecond) to(1) during(rampDownSeconds)
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
