package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class PromosApiSimulation extends Simulation {

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
    val deletePromoOffersPerSecond = config.getDouble("performance.operationsPerSecond.deletePromoOffers") * rateMultiplier * instanceMultiplier
    val getPromoOffersPerSecond = config.getDouble("performance.operationsPerSecond.getPromoOffers") * rateMultiplier * instanceMultiplier
    val getPromosPerSecond = config.getDouble("performance.operationsPerSecond.getPromos") * rateMultiplier * instanceMultiplier
    val updatePromoOffersPerSecond = config.getDouble("performance.operationsPerSecond.updatePromoOffers") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val deletePromoOffersPATHFeeder = csv(userDataDirectory + File.separator + "deletePromoOffers-pathParams.csv").random
    val getPromoOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getPromoOffers-queryParams.csv").random
    val getPromoOffersPATHFeeder = csv(userDataDirectory + File.separator + "getPromoOffers-pathParams.csv").random
    val getPromosPATHFeeder = csv(userDataDirectory + File.separator + "getPromos-pathParams.csv").random
    val updatePromoOffersPATHFeeder = csv(userDataDirectory + File.separator + "updatePromoOffers-pathParams.csv").random

    // Setup all scenarios

    
    val scndeletePromoOffers = scenario("deletePromoOffersSimulation")
        .feed(deletePromoOffersPATHFeeder)
        .exec(http("deletePromoOffers")
        .httpRequest("POST","/businesses/${businessId}/promos/offers/delete")
)

    // Run scndeletePromoOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeletePromoOffers.inject(
        rampUsersPerSec(1) to(deletePromoOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deletePromoOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(deletePromoOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPromoOffers = scenario("getPromoOffersSimulation")
        .feed(getPromoOffersQUERYFeeder)
        .feed(getPromoOffersPATHFeeder)
        .exec(http("getPromoOffers")
        .httpRequest("POST","/businesses/${businessId}/promos/offers")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetPromoOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPromoOffers.inject(
        rampUsersPerSec(1) to(getPromoOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPromoOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getPromoOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPromos = scenario("getPromosSimulation")
        .feed(getPromosPATHFeeder)
        .exec(http("getPromos")
        .httpRequest("POST","/businesses/${businessId}/promos")
)

    // Run scngetPromos with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPromos.inject(
        rampUsersPerSec(1) to(getPromosPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPromosPerSecond) during(durationSeconds),
        rampUsersPerSec(getPromosPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdatePromoOffers = scenario("updatePromoOffersSimulation")
        .feed(updatePromoOffersPATHFeeder)
        .exec(http("updatePromoOffers")
        .httpRequest("POST","/businesses/${businessId}/promos/offers/update")
)

    // Run scnupdatePromoOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdatePromoOffers.inject(
        rampUsersPerSec(1) to(updatePromoOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updatePromoOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(updatePromoOffersPerSecond) to(1) during(rampDownSeconds)
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
