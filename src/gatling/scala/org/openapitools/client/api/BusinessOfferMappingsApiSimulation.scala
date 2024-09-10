package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class BusinessOfferMappingsApiSimulation extends Simulation {

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
    val addOffersToArchivePerSecond = config.getDouble("performance.operationsPerSecond.addOffersToArchive") * rateMultiplier * instanceMultiplier
    val deleteOffersPerSecond = config.getDouble("performance.operationsPerSecond.deleteOffers") * rateMultiplier * instanceMultiplier
    val deleteOffersFromArchivePerSecond = config.getDouble("performance.operationsPerSecond.deleteOffersFromArchive") * rateMultiplier * instanceMultiplier
    val getOfferMappingsPerSecond = config.getDouble("performance.operationsPerSecond.getOfferMappings") * rateMultiplier * instanceMultiplier
    val getSuggestedOfferMappingsPerSecond = config.getDouble("performance.operationsPerSecond.getSuggestedOfferMappings") * rateMultiplier * instanceMultiplier
    val updateOfferMappingsPerSecond = config.getDouble("performance.operationsPerSecond.updateOfferMappings") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val addOffersToArchivePATHFeeder = csv(userDataDirectory + File.separator + "addOffersToArchive-pathParams.csv").random
    val deleteOffersPATHFeeder = csv(userDataDirectory + File.separator + "deleteOffers-pathParams.csv").random
    val deleteOffersFromArchivePATHFeeder = csv(userDataDirectory + File.separator + "deleteOffersFromArchive-pathParams.csv").random
    val getOfferMappingsQUERYFeeder = csv(userDataDirectory + File.separator + "getOfferMappings-queryParams.csv").random
    val getOfferMappingsPATHFeeder = csv(userDataDirectory + File.separator + "getOfferMappings-pathParams.csv").random
    val getSuggestedOfferMappingsPATHFeeder = csv(userDataDirectory + File.separator + "getSuggestedOfferMappings-pathParams.csv").random
    val updateOfferMappingsPATHFeeder = csv(userDataDirectory + File.separator + "updateOfferMappings-pathParams.csv").random

    // Setup all scenarios

    
    val scnaddOffersToArchive = scenario("addOffersToArchiveSimulation")
        .feed(addOffersToArchivePATHFeeder)
        .exec(http("addOffersToArchive")
        .httpRequest("POST","/businesses/${businessId}/offer-mappings/archive")
)

    // Run scnaddOffersToArchive with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaddOffersToArchive.inject(
        rampUsersPerSec(1) to(addOffersToArchivePerSecond) during(rampUpSeconds),
        constantUsersPerSec(addOffersToArchivePerSecond) during(durationSeconds),
        rampUsersPerSec(addOffersToArchivePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteOffers = scenario("deleteOffersSimulation")
        .feed(deleteOffersPATHFeeder)
        .exec(http("deleteOffers")
        .httpRequest("POST","/businesses/${businessId}/offer-mappings/delete")
)

    // Run scndeleteOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteOffers.inject(
        rampUsersPerSec(1) to(deleteOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteOffersFromArchive = scenario("deleteOffersFromArchiveSimulation")
        .feed(deleteOffersFromArchivePATHFeeder)
        .exec(http("deleteOffersFromArchive")
        .httpRequest("POST","/businesses/${businessId}/offer-mappings/unarchive")
)

    // Run scndeleteOffersFromArchive with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteOffersFromArchive.inject(
        rampUsersPerSec(1) to(deleteOffersFromArchivePerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteOffersFromArchivePerSecond) during(durationSeconds),
        rampUsersPerSec(deleteOffersFromArchivePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOfferMappings = scenario("getOfferMappingsSimulation")
        .feed(getOfferMappingsQUERYFeeder)
        .feed(getOfferMappingsPATHFeeder)
        .exec(http("getOfferMappings")
        .httpRequest("POST","/businesses/${businessId}/offer-mappings")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetOfferMappings with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOfferMappings.inject(
        rampUsersPerSec(1) to(getOfferMappingsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOfferMappingsPerSecond) during(durationSeconds),
        rampUsersPerSec(getOfferMappingsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetSuggestedOfferMappings = scenario("getSuggestedOfferMappingsSimulation")
        .feed(getSuggestedOfferMappingsPATHFeeder)
        .exec(http("getSuggestedOfferMappings")
        .httpRequest("POST","/businesses/${businessId}/offer-mappings/suggestions")
)

    // Run scngetSuggestedOfferMappings with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSuggestedOfferMappings.inject(
        rampUsersPerSec(1) to(getSuggestedOfferMappingsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSuggestedOfferMappingsPerSecond) during(durationSeconds),
        rampUsersPerSec(getSuggestedOfferMappingsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateOfferMappings = scenario("updateOfferMappingsSimulation")
        .feed(updateOfferMappingsPATHFeeder)
        .exec(http("updateOfferMappings")
        .httpRequest("POST","/businesses/${businessId}/offer-mappings/update")
)

    // Run scnupdateOfferMappings with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateOfferMappings.inject(
        rampUsersPerSec(1) to(updateOfferMappingsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateOfferMappingsPerSecond) during(durationSeconds),
        rampUsersPerSec(updateOfferMappingsPerSecond) to(1) during(rampDownSeconds)
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
