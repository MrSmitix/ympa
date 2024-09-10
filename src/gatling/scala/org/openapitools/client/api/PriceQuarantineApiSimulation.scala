package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class PriceQuarantineApiSimulation extends Simulation {

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
    val confirmBusinessPricesPerSecond = config.getDouble("performance.operationsPerSecond.confirmBusinessPrices") * rateMultiplier * instanceMultiplier
    val confirmCampaignPricesPerSecond = config.getDouble("performance.operationsPerSecond.confirmCampaignPrices") * rateMultiplier * instanceMultiplier
    val getBusinessQuarantineOffersPerSecond = config.getDouble("performance.operationsPerSecond.getBusinessQuarantineOffers") * rateMultiplier * instanceMultiplier
    val getCampaignQuarantineOffersPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignQuarantineOffers") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val confirmBusinessPricesPATHFeeder = csv(userDataDirectory + File.separator + "confirmBusinessPrices-pathParams.csv").random
    val confirmCampaignPricesPATHFeeder = csv(userDataDirectory + File.separator + "confirmCampaignPrices-pathParams.csv").random
    val getBusinessQuarantineOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getBusinessQuarantineOffers-queryParams.csv").random
    val getBusinessQuarantineOffersPATHFeeder = csv(userDataDirectory + File.separator + "getBusinessQuarantineOffers-pathParams.csv").random
    val getCampaignQuarantineOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getCampaignQuarantineOffers-queryParams.csv").random
    val getCampaignQuarantineOffersPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignQuarantineOffers-pathParams.csv").random

    // Setup all scenarios

    
    val scnconfirmBusinessPrices = scenario("confirmBusinessPricesSimulation")
        .feed(confirmBusinessPricesPATHFeeder)
        .exec(http("confirmBusinessPrices")
        .httpRequest("POST","/businesses/${businessId}/price-quarantine/confirm")
)

    // Run scnconfirmBusinessPrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfirmBusinessPrices.inject(
        rampUsersPerSec(1) to(confirmBusinessPricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(confirmBusinessPricesPerSecond) during(durationSeconds),
        rampUsersPerSec(confirmBusinessPricesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfirmCampaignPrices = scenario("confirmCampaignPricesSimulation")
        .feed(confirmCampaignPricesPATHFeeder)
        .exec(http("confirmCampaignPrices")
        .httpRequest("POST","/campaigns/${campaignId}/price-quarantine/confirm")
)

    // Run scnconfirmCampaignPrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfirmCampaignPrices.inject(
        rampUsersPerSec(1) to(confirmCampaignPricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(confirmCampaignPricesPerSecond) during(durationSeconds),
        rampUsersPerSec(confirmCampaignPricesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetBusinessQuarantineOffers = scenario("getBusinessQuarantineOffersSimulation")
        .feed(getBusinessQuarantineOffersQUERYFeeder)
        .feed(getBusinessQuarantineOffersPATHFeeder)
        .exec(http("getBusinessQuarantineOffers")
        .httpRequest("POST","/businesses/${businessId}/price-quarantine")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetBusinessQuarantineOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBusinessQuarantineOffers.inject(
        rampUsersPerSec(1) to(getBusinessQuarantineOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBusinessQuarantineOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getBusinessQuarantineOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCampaignQuarantineOffers = scenario("getCampaignQuarantineOffersSimulation")
        .feed(getCampaignQuarantineOffersQUERYFeeder)
        .feed(getCampaignQuarantineOffersPATHFeeder)
        .exec(http("getCampaignQuarantineOffers")
        .httpRequest("POST","/campaigns/${campaignId}/price-quarantine")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetCampaignQuarantineOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCampaignQuarantineOffers.inject(
        rampUsersPerSec(1) to(getCampaignQuarantineOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCampaignQuarantineOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getCampaignQuarantineOffersPerSecond) to(1) during(rampDownSeconds)
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
