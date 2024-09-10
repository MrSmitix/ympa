package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class PricesApiSimulation extends Simulation {

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
    val getPricesPerSecond = config.getDouble("performance.operationsPerSecond.getPrices") * rateMultiplier * instanceMultiplier
    val getPricesByOfferIdsPerSecond = config.getDouble("performance.operationsPerSecond.getPricesByOfferIds") * rateMultiplier * instanceMultiplier
    val getSuggestedPricesPerSecond = config.getDouble("performance.operationsPerSecond.getSuggestedPrices") * rateMultiplier * instanceMultiplier
    val updateBusinessPricesPerSecond = config.getDouble("performance.operationsPerSecond.updateBusinessPrices") * rateMultiplier * instanceMultiplier
    val updatePricesPerSecond = config.getDouble("performance.operationsPerSecond.updatePrices") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val getPricesQUERYFeeder = csv(userDataDirectory + File.separator + "getPrices-queryParams.csv").random
    val getPricesPATHFeeder = csv(userDataDirectory + File.separator + "getPrices-pathParams.csv").random
    val getPricesByOfferIdsQUERYFeeder = csv(userDataDirectory + File.separator + "getPricesByOfferIds-queryParams.csv").random
    val getPricesByOfferIdsPATHFeeder = csv(userDataDirectory + File.separator + "getPricesByOfferIds-pathParams.csv").random
    val getSuggestedPricesPATHFeeder = csv(userDataDirectory + File.separator + "getSuggestedPrices-pathParams.csv").random
    val updateBusinessPricesPATHFeeder = csv(userDataDirectory + File.separator + "updateBusinessPrices-pathParams.csv").random
    val updatePricesPATHFeeder = csv(userDataDirectory + File.separator + "updatePrices-pathParams.csv").random

    // Setup all scenarios

    
    val scngetPrices = scenario("getPricesSimulation")
        .feed(getPricesQUERYFeeder)
        .feed(getPricesPATHFeeder)
        .exec(http("getPrices")
        .httpRequest("GET","/campaigns/${campaignId}/offer-prices")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
        .queryParam("archived","${archived}")
)

    // Run scngetPrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPrices.inject(
        rampUsersPerSec(1) to(getPricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPricesPerSecond) during(durationSeconds),
        rampUsersPerSec(getPricesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPricesByOfferIds = scenario("getPricesByOfferIdsSimulation")
        .feed(getPricesByOfferIdsQUERYFeeder)
        .feed(getPricesByOfferIdsPATHFeeder)
        .exec(http("getPricesByOfferIds")
        .httpRequest("POST","/campaigns/${campaignId}/offer-prices")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetPricesByOfferIds with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPricesByOfferIds.inject(
        rampUsersPerSec(1) to(getPricesByOfferIdsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPricesByOfferIdsPerSecond) during(durationSeconds),
        rampUsersPerSec(getPricesByOfferIdsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetSuggestedPrices = scenario("getSuggestedPricesSimulation")
        .feed(getSuggestedPricesPATHFeeder)
        .exec(http("getSuggestedPrices")
        .httpRequest("POST","/campaigns/${campaignId}/offer-prices/suggestions")
)

    // Run scngetSuggestedPrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSuggestedPrices.inject(
        rampUsersPerSec(1) to(getSuggestedPricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSuggestedPricesPerSecond) during(durationSeconds),
        rampUsersPerSec(getSuggestedPricesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateBusinessPrices = scenario("updateBusinessPricesSimulation")
        .feed(updateBusinessPricesPATHFeeder)
        .exec(http("updateBusinessPrices")
        .httpRequest("POST","/businesses/${businessId}/offer-prices/updates")
)

    // Run scnupdateBusinessPrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateBusinessPrices.inject(
        rampUsersPerSec(1) to(updateBusinessPricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateBusinessPricesPerSecond) during(durationSeconds),
        rampUsersPerSec(updateBusinessPricesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdatePrices = scenario("updatePricesSimulation")
        .feed(updatePricesPATHFeeder)
        .exec(http("updatePrices")
        .httpRequest("POST","/campaigns/${campaignId}/offer-prices/updates")
)

    // Run scnupdatePrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdatePrices.inject(
        rampUsersPerSec(1) to(updatePricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updatePricesPerSecond) during(durationSeconds),
        rampUsersPerSec(updatePricesPerSecond) to(1) during(rampDownSeconds)
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
