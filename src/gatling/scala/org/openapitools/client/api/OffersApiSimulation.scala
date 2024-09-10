package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class OffersApiSimulation extends Simulation {

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
    val deleteCampaignOffersPerSecond = config.getDouble("performance.operationsPerSecond.deleteCampaignOffers") * rateMultiplier * instanceMultiplier
    val getAllOffersPerSecond = config.getDouble("performance.operationsPerSecond.getAllOffers") * rateMultiplier * instanceMultiplier
    val getCampaignOffersPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignOffers") * rateMultiplier * instanceMultiplier
    val getOfferRecommendationsPerSecond = config.getDouble("performance.operationsPerSecond.getOfferRecommendations") * rateMultiplier * instanceMultiplier
    val getOffersPerSecond = config.getDouble("performance.operationsPerSecond.getOffers") * rateMultiplier * instanceMultiplier
    val updateCampaignOffersPerSecond = config.getDouble("performance.operationsPerSecond.updateCampaignOffers") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val deleteCampaignOffersPATHFeeder = csv(userDataDirectory + File.separator + "deleteCampaignOffers-pathParams.csv").random
    val getAllOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getAllOffers-queryParams.csv").random
    val getAllOffersPATHFeeder = csv(userDataDirectory + File.separator + "getAllOffers-pathParams.csv").random
    val getCampaignOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getCampaignOffers-queryParams.csv").random
    val getCampaignOffersPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignOffers-pathParams.csv").random
    val getOfferRecommendationsQUERYFeeder = csv(userDataDirectory + File.separator + "getOfferRecommendations-queryParams.csv").random
    val getOfferRecommendationsPATHFeeder = csv(userDataDirectory + File.separator + "getOfferRecommendations-pathParams.csv").random
    val getOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getOffers-queryParams.csv").random
    val getOffersPATHFeeder = csv(userDataDirectory + File.separator + "getOffers-pathParams.csv").random
    val updateCampaignOffersPATHFeeder = csv(userDataDirectory + File.separator + "updateCampaignOffers-pathParams.csv").random

    // Setup all scenarios

    
    val scndeleteCampaignOffers = scenario("deleteCampaignOffersSimulation")
        .feed(deleteCampaignOffersPATHFeeder)
        .exec(http("deleteCampaignOffers")
        .httpRequest("POST","/campaigns/${campaignId}/offers/delete")
)

    // Run scndeleteCampaignOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteCampaignOffers.inject(
        rampUsersPerSec(1) to(deleteCampaignOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteCampaignOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteCampaignOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAllOffers = scenario("getAllOffersSimulation")
        .feed(getAllOffersQUERYFeeder)
        .feed(getAllOffersPATHFeeder)
        .exec(http("getAllOffers")
        .httpRequest("GET","/campaigns/${campaignId}/offers/all")
        .queryParam("feedId","${feedId}")
        .queryParam("chunk","${chunk}")
)

    // Run scngetAllOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAllOffers.inject(
        rampUsersPerSec(1) to(getAllOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAllOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getAllOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCampaignOffers = scenario("getCampaignOffersSimulation")
        .feed(getCampaignOffersQUERYFeeder)
        .feed(getCampaignOffersPATHFeeder)
        .exec(http("getCampaignOffers")
        .httpRequest("POST","/campaigns/${campaignId}/offers")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetCampaignOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCampaignOffers.inject(
        rampUsersPerSec(1) to(getCampaignOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCampaignOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getCampaignOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOfferRecommendations = scenario("getOfferRecommendationsSimulation")
        .feed(getOfferRecommendationsQUERYFeeder)
        .feed(getOfferRecommendationsPATHFeeder)
        .exec(http("getOfferRecommendations")
        .httpRequest("POST","/businesses/${businessId}/offers/recommendations")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetOfferRecommendations with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOfferRecommendations.inject(
        rampUsersPerSec(1) to(getOfferRecommendationsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOfferRecommendationsPerSecond) during(durationSeconds),
        rampUsersPerSec(getOfferRecommendationsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOffers = scenario("getOffersSimulation")
        .feed(getOffersQUERYFeeder)
        .feed(getOffersPATHFeeder)
        .exec(http("getOffers")
        .httpRequest("GET","/campaigns/${campaignId}/offers")
        .queryParam("pageSize","${pageSize}")
        .queryParam("feedId","${feedId}")
        .queryParam("currency","${currency}")
        .queryParam("matched","${matched}")
        .queryParam("shopCategoryId","${shopCategoryId}")
        .queryParam("query","${query}")
        .queryParam("page","${page}")
)

    // Run scngetOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOffers.inject(
        rampUsersPerSec(1) to(getOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateCampaignOffers = scenario("updateCampaignOffersSimulation")
        .feed(updateCampaignOffersPATHFeeder)
        .exec(http("updateCampaignOffers")
        .httpRequest("POST","/campaigns/${campaignId}/offers/update")
)

    // Run scnupdateCampaignOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateCampaignOffers.inject(
        rampUsersPerSec(1) to(updateCampaignOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateCampaignOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(updateCampaignOffersPerSecond) to(1) during(rampDownSeconds)
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
