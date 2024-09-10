package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class OrderDeliveryApiSimulation extends Simulation {

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
    val getOrderBuyerInfoPerSecond = config.getDouble("performance.operationsPerSecond.getOrderBuyerInfo") * rateMultiplier * instanceMultiplier
    val setOrderDeliveryDatePerSecond = config.getDouble("performance.operationsPerSecond.setOrderDeliveryDate") * rateMultiplier * instanceMultiplier
    val setOrderDeliveryTrackCodePerSecond = config.getDouble("performance.operationsPerSecond.setOrderDeliveryTrackCode") * rateMultiplier * instanceMultiplier
    val updateOrderStorageLimitPerSecond = config.getDouble("performance.operationsPerSecond.updateOrderStorageLimit") * rateMultiplier * instanceMultiplier
    val verifyOrderEacPerSecond = config.getDouble("performance.operationsPerSecond.verifyOrderEac") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val getOrderBuyerInfoPATHFeeder = csv(userDataDirectory + File.separator + "getOrderBuyerInfo-pathParams.csv").random
    val setOrderDeliveryDatePATHFeeder = csv(userDataDirectory + File.separator + "setOrderDeliveryDate-pathParams.csv").random
    val setOrderDeliveryTrackCodePATHFeeder = csv(userDataDirectory + File.separator + "setOrderDeliveryTrackCode-pathParams.csv").random
    val updateOrderStorageLimitPATHFeeder = csv(userDataDirectory + File.separator + "updateOrderStorageLimit-pathParams.csv").random
    val verifyOrderEacPATHFeeder = csv(userDataDirectory + File.separator + "verifyOrderEac-pathParams.csv").random

    // Setup all scenarios

    
    val scngetOrderBuyerInfo = scenario("getOrderBuyerInfoSimulation")
        .feed(getOrderBuyerInfoPATHFeeder)
        .exec(http("getOrderBuyerInfo")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}/buyer")
)

    // Run scngetOrderBuyerInfo with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOrderBuyerInfo.inject(
        rampUsersPerSec(1) to(getOrderBuyerInfoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOrderBuyerInfoPerSecond) during(durationSeconds),
        rampUsersPerSec(getOrderBuyerInfoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsetOrderDeliveryDate = scenario("setOrderDeliveryDateSimulation")
        .feed(setOrderDeliveryDatePATHFeeder)
        .exec(http("setOrderDeliveryDate")
        .httpRequest("PUT","/campaigns/${campaignId}/orders/${orderId}/delivery/date")
)

    // Run scnsetOrderDeliveryDate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsetOrderDeliveryDate.inject(
        rampUsersPerSec(1) to(setOrderDeliveryDatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(setOrderDeliveryDatePerSecond) during(durationSeconds),
        rampUsersPerSec(setOrderDeliveryDatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsetOrderDeliveryTrackCode = scenario("setOrderDeliveryTrackCodeSimulation")
        .feed(setOrderDeliveryTrackCodePATHFeeder)
        .exec(http("setOrderDeliveryTrackCode")
        .httpRequest("POST","/campaigns/${campaignId}/orders/${orderId}/delivery/track")
)

    // Run scnsetOrderDeliveryTrackCode with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsetOrderDeliveryTrackCode.inject(
        rampUsersPerSec(1) to(setOrderDeliveryTrackCodePerSecond) during(rampUpSeconds),
        constantUsersPerSec(setOrderDeliveryTrackCodePerSecond) during(durationSeconds),
        rampUsersPerSec(setOrderDeliveryTrackCodePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateOrderStorageLimit = scenario("updateOrderStorageLimitSimulation")
        .feed(updateOrderStorageLimitPATHFeeder)
        .exec(http("updateOrderStorageLimit")
        .httpRequest("PUT","/campaigns/${campaignId}/orders/${orderId}/delivery/storage-limit")
)

    // Run scnupdateOrderStorageLimit with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateOrderStorageLimit.inject(
        rampUsersPerSec(1) to(updateOrderStorageLimitPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateOrderStorageLimitPerSecond) during(durationSeconds),
        rampUsersPerSec(updateOrderStorageLimitPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnverifyOrderEac = scenario("verifyOrderEacSimulation")
        .feed(verifyOrderEacPATHFeeder)
        .exec(http("verifyOrderEac")
        .httpRequest("PUT","/campaigns/${campaignId}/orders/${orderId}/verifyEac")
)

    // Run scnverifyOrderEac with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnverifyOrderEac.inject(
        rampUsersPerSec(1) to(verifyOrderEacPerSecond) during(rampUpSeconds),
        constantUsersPerSec(verifyOrderEacPerSecond) during(durationSeconds),
        rampUsersPerSec(verifyOrderEacPerSecond) to(1) during(rampDownSeconds)
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
