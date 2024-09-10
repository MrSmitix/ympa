package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class OutletsApiSimulation extends Simulation {

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
    val createOutletPerSecond = config.getDouble("performance.operationsPerSecond.createOutlet") * rateMultiplier * instanceMultiplier
    val deleteOutletPerSecond = config.getDouble("performance.operationsPerSecond.deleteOutlet") * rateMultiplier * instanceMultiplier
    val getOutletPerSecond = config.getDouble("performance.operationsPerSecond.getOutlet") * rateMultiplier * instanceMultiplier
    val getOutletsPerSecond = config.getDouble("performance.operationsPerSecond.getOutlets") * rateMultiplier * instanceMultiplier
    val updateOutletPerSecond = config.getDouble("performance.operationsPerSecond.updateOutlet") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val createOutletPATHFeeder = csv(userDataDirectory + File.separator + "createOutlet-pathParams.csv").random
    val deleteOutletPATHFeeder = csv(userDataDirectory + File.separator + "deleteOutlet-pathParams.csv").random
    val getOutletPATHFeeder = csv(userDataDirectory + File.separator + "getOutlet-pathParams.csv").random
    val getOutletsQUERYFeeder = csv(userDataDirectory + File.separator + "getOutlets-queryParams.csv").random
    val getOutletsPATHFeeder = csv(userDataDirectory + File.separator + "getOutlets-pathParams.csv").random
    val updateOutletPATHFeeder = csv(userDataDirectory + File.separator + "updateOutlet-pathParams.csv").random

    // Setup all scenarios

    
    val scncreateOutlet = scenario("createOutletSimulation")
        .feed(createOutletPATHFeeder)
        .exec(http("createOutlet")
        .httpRequest("POST","/campaigns/${campaignId}/outlets")
)

    // Run scncreateOutlet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateOutlet.inject(
        rampUsersPerSec(1) to(createOutletPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createOutletPerSecond) during(durationSeconds),
        rampUsersPerSec(createOutletPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteOutlet = scenario("deleteOutletSimulation")
        .feed(deleteOutletPATHFeeder)
        .exec(http("deleteOutlet")
        .httpRequest("DELETE","/campaigns/${campaignId}/outlets/${outletId}")
)

    // Run scndeleteOutlet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteOutlet.inject(
        rampUsersPerSec(1) to(deleteOutletPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteOutletPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteOutletPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOutlet = scenario("getOutletSimulation")
        .feed(getOutletPATHFeeder)
        .exec(http("getOutlet")
        .httpRequest("GET","/campaigns/${campaignId}/outlets/${outletId}")
)

    // Run scngetOutlet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOutlet.inject(
        rampUsersPerSec(1) to(getOutletPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOutletPerSecond) during(durationSeconds),
        rampUsersPerSec(getOutletPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOutlets = scenario("getOutletsSimulation")
        .feed(getOutletsQUERYFeeder)
        .feed(getOutletsPATHFeeder)
        .exec(http("getOutlets")
        .httpRequest("GET","/campaigns/${campaignId}/outlets")
        .queryParam("page_token","${page_token}")
        .queryParam("region_id","${region_id}")
        .queryParam("shop_outlet_code","${shop_outlet_code}")
        .queryParam("regionId","${regionId}")
)

    // Run scngetOutlets with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOutlets.inject(
        rampUsersPerSec(1) to(getOutletsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOutletsPerSecond) during(durationSeconds),
        rampUsersPerSec(getOutletsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateOutlet = scenario("updateOutletSimulation")
        .feed(updateOutletPATHFeeder)
        .exec(http("updateOutlet")
        .httpRequest("PUT","/campaigns/${campaignId}/outlets/${outletId}")
)

    // Run scnupdateOutlet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateOutlet.inject(
        rampUsersPerSec(1) to(updateOutletPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateOutletPerSecond) during(durationSeconds),
        rampUsersPerSec(updateOutletPerSecond) to(1) during(rampDownSeconds)
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
