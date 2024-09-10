package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ReturnsApiSimulation extends Simulation {

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
    val getReturnPerSecond = config.getDouble("performance.operationsPerSecond.getReturn") * rateMultiplier * instanceMultiplier
    val getReturnApplicationPerSecond = config.getDouble("performance.operationsPerSecond.getReturnApplication") * rateMultiplier * instanceMultiplier
    val getReturnPhotoPerSecond = config.getDouble("performance.operationsPerSecond.getReturnPhoto") * rateMultiplier * instanceMultiplier
    val getReturnsPerSecond = config.getDouble("performance.operationsPerSecond.getReturns") * rateMultiplier * instanceMultiplier
    val setReturnDecisionPerSecond = config.getDouble("performance.operationsPerSecond.setReturnDecision") * rateMultiplier * instanceMultiplier
    val submitReturnDecisionPerSecond = config.getDouble("performance.operationsPerSecond.submitReturnDecision") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val getReturnPATHFeeder = csv(userDataDirectory + File.separator + "getReturn-pathParams.csv").random
    val getReturnApplicationPATHFeeder = csv(userDataDirectory + File.separator + "getReturnApplication-pathParams.csv").random
    val getReturnPhotoPATHFeeder = csv(userDataDirectory + File.separator + "getReturnPhoto-pathParams.csv").random
    val getReturnsQUERYFeeder = csv(userDataDirectory + File.separator + "getReturns-queryParams.csv").random
    val getReturnsPATHFeeder = csv(userDataDirectory + File.separator + "getReturns-pathParams.csv").random
    val setReturnDecisionPATHFeeder = csv(userDataDirectory + File.separator + "setReturnDecision-pathParams.csv").random
    val submitReturnDecisionPATHFeeder = csv(userDataDirectory + File.separator + "submitReturnDecision-pathParams.csv").random

    // Setup all scenarios

    
    val scngetReturn = scenario("getReturnSimulation")
        .feed(getReturnPATHFeeder)
        .exec(http("getReturn")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}")
)

    // Run scngetReturn with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetReturn.inject(
        rampUsersPerSec(1) to(getReturnPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getReturnPerSecond) during(durationSeconds),
        rampUsersPerSec(getReturnPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetReturnApplication = scenario("getReturnApplicationSimulation")
        .feed(getReturnApplicationPATHFeeder)
        .exec(http("getReturnApplication")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/application")
)

    // Run scngetReturnApplication with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetReturnApplication.inject(
        rampUsersPerSec(1) to(getReturnApplicationPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getReturnApplicationPerSecond) during(durationSeconds),
        rampUsersPerSec(getReturnApplicationPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetReturnPhoto = scenario("getReturnPhotoSimulation")
        .feed(getReturnPhotoPATHFeeder)
        .exec(http("getReturnPhoto")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision/${itemId}/image/${imageHash}")
)

    // Run scngetReturnPhoto with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetReturnPhoto.inject(
        rampUsersPerSec(1) to(getReturnPhotoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getReturnPhotoPerSecond) during(durationSeconds),
        rampUsersPerSec(getReturnPhotoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetReturns = scenario("getReturnsSimulation")
        .feed(getReturnsQUERYFeeder)
        .feed(getReturnsPATHFeeder)
        .exec(http("getReturns")
        .httpRequest("GET","/campaigns/${campaignId}/returns")
        .queryParam("page_token","${page_token}")
        .queryParam("type","${type}")
        .queryParam("orderIds","${orderIds}")
        .queryParam("from_date","${from_date}")
        .queryParam("fromDate","${fromDate}")
        .queryParam("to_date","${to_date}")
        .queryParam("limit","${limit}")
        .queryParam("toDate","${toDate}")
        .queryParam("statuses","${statuses}")
)

    // Run scngetReturns with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetReturns.inject(
        rampUsersPerSec(1) to(getReturnsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getReturnsPerSecond) during(durationSeconds),
        rampUsersPerSec(getReturnsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsetReturnDecision = scenario("setReturnDecisionSimulation")
        .feed(setReturnDecisionPATHFeeder)
        .exec(http("setReturnDecision")
        .httpRequest("POST","/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision")
)

    // Run scnsetReturnDecision with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsetReturnDecision.inject(
        rampUsersPerSec(1) to(setReturnDecisionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(setReturnDecisionPerSecond) during(durationSeconds),
        rampUsersPerSec(setReturnDecisionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsubmitReturnDecision = scenario("submitReturnDecisionSimulation")
        .feed(submitReturnDecisionPATHFeeder)
        .exec(http("submitReturnDecision")
        .httpRequest("POST","/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision/submit")
)

    // Run scnsubmitReturnDecision with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsubmitReturnDecision.inject(
        rampUsersPerSec(1) to(submitReturnDecisionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(submitReturnDecisionPerSecond) during(durationSeconds),
        rampUsersPerSec(submitReturnDecisionPerSecond) to(1) during(rampDownSeconds)
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
