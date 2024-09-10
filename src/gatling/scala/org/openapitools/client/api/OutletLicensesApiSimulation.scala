package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class OutletLicensesApiSimulation extends Simulation {

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
    val deleteOutletLicensesPerSecond = config.getDouble("performance.operationsPerSecond.deleteOutletLicenses") * rateMultiplier * instanceMultiplier
    val getOutletLicensesPerSecond = config.getDouble("performance.operationsPerSecond.getOutletLicenses") * rateMultiplier * instanceMultiplier
    val updateOutletLicensesPerSecond = config.getDouble("performance.operationsPerSecond.updateOutletLicenses") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val deleteOutletLicensesQUERYFeeder = csv(userDataDirectory + File.separator + "deleteOutletLicenses-queryParams.csv").random
    val deleteOutletLicensesPATHFeeder = csv(userDataDirectory + File.separator + "deleteOutletLicenses-pathParams.csv").random
    val getOutletLicensesQUERYFeeder = csv(userDataDirectory + File.separator + "getOutletLicenses-queryParams.csv").random
    val getOutletLicensesPATHFeeder = csv(userDataDirectory + File.separator + "getOutletLicenses-pathParams.csv").random
    val updateOutletLicensesPATHFeeder = csv(userDataDirectory + File.separator + "updateOutletLicenses-pathParams.csv").random

    // Setup all scenarios

    
    val scndeleteOutletLicenses = scenario("deleteOutletLicensesSimulation")
        .feed(deleteOutletLicensesQUERYFeeder)
        .feed(deleteOutletLicensesPATHFeeder)
        .exec(http("deleteOutletLicenses")
        .httpRequest("DELETE","/campaigns/${campaignId}/outlets/licenses")
        .queryParam("ids","${ids}")
)

    // Run scndeleteOutletLicenses with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteOutletLicenses.inject(
        rampUsersPerSec(1) to(deleteOutletLicensesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteOutletLicensesPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteOutletLicensesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOutletLicenses = scenario("getOutletLicensesSimulation")
        .feed(getOutletLicensesQUERYFeeder)
        .feed(getOutletLicensesPATHFeeder)
        .exec(http("getOutletLicenses")
        .httpRequest("GET","/campaigns/${campaignId}/outlets/licenses")
        .queryParam("outletIds","${outletIds}")
        .queryParam("ids","${ids}")
)

    // Run scngetOutletLicenses with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOutletLicenses.inject(
        rampUsersPerSec(1) to(getOutletLicensesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOutletLicensesPerSecond) during(durationSeconds),
        rampUsersPerSec(getOutletLicensesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateOutletLicenses = scenario("updateOutletLicensesSimulation")
        .feed(updateOutletLicensesPATHFeeder)
        .exec(http("updateOutletLicenses")
        .httpRequest("POST","/campaigns/${campaignId}/outlets/licenses")
)

    // Run scnupdateOutletLicenses with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateOutletLicenses.inject(
        rampUsersPerSec(1) to(updateOutletLicensesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateOutletLicensesPerSecond) during(durationSeconds),
        rampUsersPerSec(updateOutletLicensesPerSecond) to(1) during(rampDownSeconds)
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
