package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ModelsApiSimulation extends Simulation {

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
    val getModelPerSecond = config.getDouble("performance.operationsPerSecond.getModel") * rateMultiplier * instanceMultiplier
    val getModelOffersPerSecond = config.getDouble("performance.operationsPerSecond.getModelOffers") * rateMultiplier * instanceMultiplier
    val getModelsPerSecond = config.getDouble("performance.operationsPerSecond.getModels") * rateMultiplier * instanceMultiplier
    val getModelsOffersPerSecond = config.getDouble("performance.operationsPerSecond.getModelsOffers") * rateMultiplier * instanceMultiplier
    val searchModelsPerSecond = config.getDouble("performance.operationsPerSecond.searchModels") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val getModelQUERYFeeder = csv(userDataDirectory + File.separator + "getModel-queryParams.csv").random
    val getModelPATHFeeder = csv(userDataDirectory + File.separator + "getModel-pathParams.csv").random
    val getModelOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getModelOffers-queryParams.csv").random
    val getModelOffersPATHFeeder = csv(userDataDirectory + File.separator + "getModelOffers-pathParams.csv").random
    val getModelsQUERYFeeder = csv(userDataDirectory + File.separator + "getModels-queryParams.csv").random
    val getModelsOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getModelsOffers-queryParams.csv").random
    val searchModelsQUERYFeeder = csv(userDataDirectory + File.separator + "searchModels-queryParams.csv").random

    // Setup all scenarios

    
    val scngetModel = scenario("getModelSimulation")
        .feed(getModelQUERYFeeder)
        .feed(getModelPATHFeeder)
        .exec(http("getModel")
        .httpRequest("GET","/models/${modelId}")
        .queryParam("currency","${currency}")
        .queryParam("regionId","${regionId}")
)

    // Run scngetModel with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetModel.inject(
        rampUsersPerSec(1) to(getModelPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getModelPerSecond) during(durationSeconds),
        rampUsersPerSec(getModelPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetModelOffers = scenario("getModelOffersSimulation")
        .feed(getModelOffersQUERYFeeder)
        .feed(getModelOffersPATHFeeder)
        .exec(http("getModelOffers")
        .httpRequest("GET","/models/${modelId}/offers")
        .queryParam("count","${count}")
        .queryParam("currency","${currency}")
        .queryParam("orderByPrice","${orderByPrice}")
        .queryParam("page","${page}")
        .queryParam("regionId","${regionId}")
)

    // Run scngetModelOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetModelOffers.inject(
        rampUsersPerSec(1) to(getModelOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getModelOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getModelOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetModels = scenario("getModelsSimulation")
        .feed(getModelsQUERYFeeder)
        .exec(http("getModels")
        .httpRequest("POST","/models")
        .queryParam("currency","${currency}")
        .queryParam("regionId","${regionId}")
)

    // Run scngetModels with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetModels.inject(
        rampUsersPerSec(1) to(getModelsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getModelsPerSecond) during(durationSeconds),
        rampUsersPerSec(getModelsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetModelsOffers = scenario("getModelsOffersSimulation")
        .feed(getModelsOffersQUERYFeeder)
        .exec(http("getModelsOffers")
        .httpRequest("POST","/models/offers")
        .queryParam("currency","${currency}")
        .queryParam("orderByPrice","${orderByPrice}")
        .queryParam("regionId","${regionId}")
)

    // Run scngetModelsOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetModelsOffers.inject(
        rampUsersPerSec(1) to(getModelsOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getModelsOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getModelsOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsearchModels = scenario("searchModelsSimulation")
        .feed(searchModelsQUERYFeeder)
        .exec(http("searchModels")
        .httpRequest("GET","/models")
        .queryParam("pageSize","${pageSize}")
        .queryParam("query","${query}")
        .queryParam("currency","${currency}")
        .queryParam("page","${page}")
        .queryParam("regionId","${regionId}")
)

    // Run scnsearchModels with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsearchModels.inject(
        rampUsersPerSec(1) to(searchModelsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(searchModelsPerSecond) during(durationSeconds),
        rampUsersPerSec(searchModelsPerSecond) to(1) during(rampDownSeconds)
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
