package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ShipmentsApiSimulation extends Simulation {

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
    val confirmShipmentPerSecond = config.getDouble("performance.operationsPerSecond.confirmShipment") * rateMultiplier * instanceMultiplier
    val downloadShipmentActPerSecond = config.getDouble("performance.operationsPerSecond.downloadShipmentAct") * rateMultiplier * instanceMultiplier
    val downloadShipmentDiscrepancyActPerSecond = config.getDouble("performance.operationsPerSecond.downloadShipmentDiscrepancyAct") * rateMultiplier * instanceMultiplier
    val downloadShipmentInboundActPerSecond = config.getDouble("performance.operationsPerSecond.downloadShipmentInboundAct") * rateMultiplier * instanceMultiplier
    val downloadShipmentPalletLabelsPerSecond = config.getDouble("performance.operationsPerSecond.downloadShipmentPalletLabels") * rateMultiplier * instanceMultiplier
    val downloadShipmentReceptionTransferActPerSecond = config.getDouble("performance.operationsPerSecond.downloadShipmentReceptionTransferAct") * rateMultiplier * instanceMultiplier
    val downloadShipmentTransportationWaybillPerSecond = config.getDouble("performance.operationsPerSecond.downloadShipmentTransportationWaybill") * rateMultiplier * instanceMultiplier
    val getShipmentPerSecond = config.getDouble("performance.operationsPerSecond.getShipment") * rateMultiplier * instanceMultiplier
    val getShipmentOrdersInfoPerSecond = config.getDouble("performance.operationsPerSecond.getShipmentOrdersInfo") * rateMultiplier * instanceMultiplier
    val searchShipmentsPerSecond = config.getDouble("performance.operationsPerSecond.searchShipments") * rateMultiplier * instanceMultiplier
    val setShipmentPalletsCountPerSecond = config.getDouble("performance.operationsPerSecond.setShipmentPalletsCount") * rateMultiplier * instanceMultiplier
    val transferOrdersFromShipmentPerSecond = config.getDouble("performance.operationsPerSecond.transferOrdersFromShipment") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val confirmShipmentPATHFeeder = csv(userDataDirectory + File.separator + "confirmShipment-pathParams.csv").random
    val downloadShipmentActPATHFeeder = csv(userDataDirectory + File.separator + "downloadShipmentAct-pathParams.csv").random
    val downloadShipmentDiscrepancyActPATHFeeder = csv(userDataDirectory + File.separator + "downloadShipmentDiscrepancyAct-pathParams.csv").random
    val downloadShipmentInboundActPATHFeeder = csv(userDataDirectory + File.separator + "downloadShipmentInboundAct-pathParams.csv").random
    val downloadShipmentPalletLabelsQUERYFeeder = csv(userDataDirectory + File.separator + "downloadShipmentPalletLabels-queryParams.csv").random
    val downloadShipmentPalletLabelsPATHFeeder = csv(userDataDirectory + File.separator + "downloadShipmentPalletLabels-pathParams.csv").random
    val downloadShipmentReceptionTransferActQUERYFeeder = csv(userDataDirectory + File.separator + "downloadShipmentReceptionTransferAct-queryParams.csv").random
    val downloadShipmentReceptionTransferActPATHFeeder = csv(userDataDirectory + File.separator + "downloadShipmentReceptionTransferAct-pathParams.csv").random
    val downloadShipmentTransportationWaybillPATHFeeder = csv(userDataDirectory + File.separator + "downloadShipmentTransportationWaybill-pathParams.csv").random
    val getShipmentQUERYFeeder = csv(userDataDirectory + File.separator + "getShipment-queryParams.csv").random
    val getShipmentPATHFeeder = csv(userDataDirectory + File.separator + "getShipment-pathParams.csv").random
    val getShipmentOrdersInfoPATHFeeder = csv(userDataDirectory + File.separator + "getShipmentOrdersInfo-pathParams.csv").random
    val searchShipmentsQUERYFeeder = csv(userDataDirectory + File.separator + "searchShipments-queryParams.csv").random
    val searchShipmentsPATHFeeder = csv(userDataDirectory + File.separator + "searchShipments-pathParams.csv").random
    val setShipmentPalletsCountPATHFeeder = csv(userDataDirectory + File.separator + "setShipmentPalletsCount-pathParams.csv").random
    val transferOrdersFromShipmentPATHFeeder = csv(userDataDirectory + File.separator + "transferOrdersFromShipment-pathParams.csv").random

    // Setup all scenarios

    
    val scnconfirmShipment = scenario("confirmShipmentSimulation")
        .feed(confirmShipmentPATHFeeder)
        .exec(http("confirmShipment")
        .httpRequest("POST","/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/confirm")
)

    // Run scnconfirmShipment with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfirmShipment.inject(
        rampUsersPerSec(1) to(confirmShipmentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(confirmShipmentPerSecond) during(durationSeconds),
        rampUsersPerSec(confirmShipmentPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndownloadShipmentAct = scenario("downloadShipmentActSimulation")
        .feed(downloadShipmentActPATHFeeder)
        .exec(http("downloadShipmentAct")
        .httpRequest("GET","/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/act")
)

    // Run scndownloadShipmentAct with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndownloadShipmentAct.inject(
        rampUsersPerSec(1) to(downloadShipmentActPerSecond) during(rampUpSeconds),
        constantUsersPerSec(downloadShipmentActPerSecond) during(durationSeconds),
        rampUsersPerSec(downloadShipmentActPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndownloadShipmentDiscrepancyAct = scenario("downloadShipmentDiscrepancyActSimulation")
        .feed(downloadShipmentDiscrepancyActPATHFeeder)
        .exec(http("downloadShipmentDiscrepancyAct")
        .httpRequest("GET","/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/discrepancy-act")
)

    // Run scndownloadShipmentDiscrepancyAct with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndownloadShipmentDiscrepancyAct.inject(
        rampUsersPerSec(1) to(downloadShipmentDiscrepancyActPerSecond) during(rampUpSeconds),
        constantUsersPerSec(downloadShipmentDiscrepancyActPerSecond) during(durationSeconds),
        rampUsersPerSec(downloadShipmentDiscrepancyActPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndownloadShipmentInboundAct = scenario("downloadShipmentInboundActSimulation")
        .feed(downloadShipmentInboundActPATHFeeder)
        .exec(http("downloadShipmentInboundAct")
        .httpRequest("GET","/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/inbound-act")
)

    // Run scndownloadShipmentInboundAct with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndownloadShipmentInboundAct.inject(
        rampUsersPerSec(1) to(downloadShipmentInboundActPerSecond) during(rampUpSeconds),
        constantUsersPerSec(downloadShipmentInboundActPerSecond) during(durationSeconds),
        rampUsersPerSec(downloadShipmentInboundActPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndownloadShipmentPalletLabels = scenario("downloadShipmentPalletLabelsSimulation")
        .feed(downloadShipmentPalletLabelsQUERYFeeder)
        .feed(downloadShipmentPalletLabelsPATHFeeder)
        .exec(http("downloadShipmentPalletLabels")
        .httpRequest("GET","/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/pallet/labels")
        .queryParam("format","${format}")
)

    // Run scndownloadShipmentPalletLabels with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndownloadShipmentPalletLabels.inject(
        rampUsersPerSec(1) to(downloadShipmentPalletLabelsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(downloadShipmentPalletLabelsPerSecond) during(durationSeconds),
        rampUsersPerSec(downloadShipmentPalletLabelsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndownloadShipmentReceptionTransferAct = scenario("downloadShipmentReceptionTransferActSimulation")
        .feed(downloadShipmentReceptionTransferActQUERYFeeder)
        .feed(downloadShipmentReceptionTransferActPATHFeeder)
        .exec(http("downloadShipmentReceptionTransferAct")
        .httpRequest("GET","/campaigns/${campaignId}/shipments/reception-transfer-act")
        .queryParam("warehouse_id","${warehouse_id}")
)

    // Run scndownloadShipmentReceptionTransferAct with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndownloadShipmentReceptionTransferAct.inject(
        rampUsersPerSec(1) to(downloadShipmentReceptionTransferActPerSecond) during(rampUpSeconds),
        constantUsersPerSec(downloadShipmentReceptionTransferActPerSecond) during(durationSeconds),
        rampUsersPerSec(downloadShipmentReceptionTransferActPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndownloadShipmentTransportationWaybill = scenario("downloadShipmentTransportationWaybillSimulation")
        .feed(downloadShipmentTransportationWaybillPATHFeeder)
        .exec(http("downloadShipmentTransportationWaybill")
        .httpRequest("GET","/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/transportation-waybill")
)

    // Run scndownloadShipmentTransportationWaybill with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndownloadShipmentTransportationWaybill.inject(
        rampUsersPerSec(1) to(downloadShipmentTransportationWaybillPerSecond) during(rampUpSeconds),
        constantUsersPerSec(downloadShipmentTransportationWaybillPerSecond) during(durationSeconds),
        rampUsersPerSec(downloadShipmentTransportationWaybillPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetShipment = scenario("getShipmentSimulation")
        .feed(getShipmentQUERYFeeder)
        .feed(getShipmentPATHFeeder)
        .exec(http("getShipment")
        .httpRequest("GET","/campaigns/${campaignId}/first-mile/shipments/${shipmentId}")
        .queryParam("cancelledOrders","${cancelledOrders}")
)

    // Run scngetShipment with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetShipment.inject(
        rampUsersPerSec(1) to(getShipmentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getShipmentPerSecond) during(durationSeconds),
        rampUsersPerSec(getShipmentPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetShipmentOrdersInfo = scenario("getShipmentOrdersInfoSimulation")
        .feed(getShipmentOrdersInfoPATHFeeder)
        .exec(http("getShipmentOrdersInfo")
        .httpRequest("GET","/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/orders/info")
)

    // Run scngetShipmentOrdersInfo with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetShipmentOrdersInfo.inject(
        rampUsersPerSec(1) to(getShipmentOrdersInfoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getShipmentOrdersInfoPerSecond) during(durationSeconds),
        rampUsersPerSec(getShipmentOrdersInfoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsearchShipments = scenario("searchShipmentsSimulation")
        .feed(searchShipmentsQUERYFeeder)
        .feed(searchShipmentsPATHFeeder)
        .exec(http("searchShipments")
        .httpRequest("PUT","/campaigns/${campaignId}/first-mile/shipments")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scnsearchShipments with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsearchShipments.inject(
        rampUsersPerSec(1) to(searchShipmentsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(searchShipmentsPerSecond) during(durationSeconds),
        rampUsersPerSec(searchShipmentsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsetShipmentPalletsCount = scenario("setShipmentPalletsCountSimulation")
        .feed(setShipmentPalletsCountPATHFeeder)
        .exec(http("setShipmentPalletsCount")
        .httpRequest("PUT","/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/pallets")
)

    // Run scnsetShipmentPalletsCount with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsetShipmentPalletsCount.inject(
        rampUsersPerSec(1) to(setShipmentPalletsCountPerSecond) during(rampUpSeconds),
        constantUsersPerSec(setShipmentPalletsCountPerSecond) during(durationSeconds),
        rampUsersPerSec(setShipmentPalletsCountPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scntransferOrdersFromShipment = scenario("transferOrdersFromShipmentSimulation")
        .feed(transferOrdersFromShipmentPATHFeeder)
        .exec(http("transferOrdersFromShipment")
        .httpRequest("POST","/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/orders/transfer")
)

    // Run scntransferOrdersFromShipment with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntransferOrdersFromShipment.inject(
        rampUsersPerSec(1) to(transferOrdersFromShipmentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(transferOrdersFromShipmentPerSecond) during(durationSeconds),
        rampUsersPerSec(transferOrdersFromShipmentPerSecond) to(1) during(rampDownSeconds)
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
