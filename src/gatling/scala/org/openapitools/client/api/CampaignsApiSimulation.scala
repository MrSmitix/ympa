package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class CampaignsApiSimulation extends Simulation {

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
    val getCampaignPerSecond = config.getDouble("performance.operationsPerSecond.getCampaign") * rateMultiplier * instanceMultiplier
    val getCampaignLoginsPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignLogins") * rateMultiplier * instanceMultiplier
    val getCampaignRegionPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignRegion") * rateMultiplier * instanceMultiplier
    val getCampaignSettingsPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignSettings") * rateMultiplier * instanceMultiplier
    val getCampaignsPerSecond = config.getDouble("performance.operationsPerSecond.getCampaigns") * rateMultiplier * instanceMultiplier
    val getCampaignsByLoginPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignsByLogin") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val getCampaignPATHFeeder = csv(userDataDirectory + File.separator + "getCampaign-pathParams.csv").random
    val getCampaignLoginsPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignLogins-pathParams.csv").random
    val getCampaignRegionPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignRegion-pathParams.csv").random
    val getCampaignSettingsPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignSettings-pathParams.csv").random
    val getCampaignsQUERYFeeder = csv(userDataDirectory + File.separator + "getCampaigns-queryParams.csv").random
    val getCampaignsByLoginQUERYFeeder = csv(userDataDirectory + File.separator + "getCampaignsByLogin-queryParams.csv").random
    val getCampaignsByLoginPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignsByLogin-pathParams.csv").random

    // Setup all scenarios

    
    val scngetCampaign = scenario("getCampaignSimulation")
        .feed(getCampaignPATHFeeder)
        .exec(http("getCampaign")
        .httpRequest("GET","/campaigns/${campaignId}")
)

    // Run scngetCampaign with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCampaign.inject(
        rampUsersPerSec(1) to(getCampaignPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCampaignPerSecond) during(durationSeconds),
        rampUsersPerSec(getCampaignPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCampaignLogins = scenario("getCampaignLoginsSimulation")
        .feed(getCampaignLoginsPATHFeeder)
        .exec(http("getCampaignLogins")
        .httpRequest("GET","/campaigns/${campaignId}/logins")
)

    // Run scngetCampaignLogins with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCampaignLogins.inject(
        rampUsersPerSec(1) to(getCampaignLoginsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCampaignLoginsPerSecond) during(durationSeconds),
        rampUsersPerSec(getCampaignLoginsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCampaignRegion = scenario("getCampaignRegionSimulation")
        .feed(getCampaignRegionPATHFeeder)
        .exec(http("getCampaignRegion")
        .httpRequest("GET","/campaigns/${campaignId}/region")
)

    // Run scngetCampaignRegion with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCampaignRegion.inject(
        rampUsersPerSec(1) to(getCampaignRegionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCampaignRegionPerSecond) during(durationSeconds),
        rampUsersPerSec(getCampaignRegionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCampaignSettings = scenario("getCampaignSettingsSimulation")
        .feed(getCampaignSettingsPATHFeeder)
        .exec(http("getCampaignSettings")
        .httpRequest("GET","/campaigns/${campaignId}/settings")
)

    // Run scngetCampaignSettings with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCampaignSettings.inject(
        rampUsersPerSec(1) to(getCampaignSettingsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCampaignSettingsPerSecond) during(durationSeconds),
        rampUsersPerSec(getCampaignSettingsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCampaigns = scenario("getCampaignsSimulation")
        .feed(getCampaignsQUERYFeeder)
        .exec(http("getCampaigns")
        .httpRequest("GET","/campaigns")
        .queryParam("pageSize","${pageSize}")
        .queryParam("page","${page}")
)

    // Run scngetCampaigns with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCampaigns.inject(
        rampUsersPerSec(1) to(getCampaignsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCampaignsPerSecond) during(durationSeconds),
        rampUsersPerSec(getCampaignsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCampaignsByLogin = scenario("getCampaignsByLoginSimulation")
        .feed(getCampaignsByLoginQUERYFeeder)
        .feed(getCampaignsByLoginPATHFeeder)
        .exec(http("getCampaignsByLogin")
        .httpRequest("GET","/campaigns/by_login/${login}")
        .queryParam("pageSize","${pageSize}")
        .queryParam("page","${page}")
)

    // Run scngetCampaignsByLogin with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCampaignsByLogin.inject(
        rampUsersPerSec(1) to(getCampaignsByLoginPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCampaignsByLoginPerSecond) during(durationSeconds),
        rampUsersPerSec(getCampaignsByLoginPerSecond) to(1) during(rampDownSeconds)
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
