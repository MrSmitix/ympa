package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ReportsApiSimulation extends Simulation {

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
    val generateBoostConsolidatedReportPerSecond = config.getDouble("performance.operationsPerSecond.generateBoostConsolidatedReport") * rateMultiplier * instanceMultiplier
    val generateCompetitorsPositionReportPerSecond = config.getDouble("performance.operationsPerSecond.generateCompetitorsPositionReport") * rateMultiplier * instanceMultiplier
    val generateGoodsFeedbackReportPerSecond = config.getDouble("performance.operationsPerSecond.generateGoodsFeedbackReport") * rateMultiplier * instanceMultiplier
    val generateGoodsMovementReportPerSecond = config.getDouble("performance.operationsPerSecond.generateGoodsMovementReport") * rateMultiplier * instanceMultiplier
    val generateGoodsRealizationReportPerSecond = config.getDouble("performance.operationsPerSecond.generateGoodsRealizationReport") * rateMultiplier * instanceMultiplier
    val generateGoodsTurnoverReportPerSecond = config.getDouble("performance.operationsPerSecond.generateGoodsTurnoverReport") * rateMultiplier * instanceMultiplier
    val generateMassOrderLabelsReportPerSecond = config.getDouble("performance.operationsPerSecond.generateMassOrderLabelsReport") * rateMultiplier * instanceMultiplier
    val generatePricesReportPerSecond = config.getDouble("performance.operationsPerSecond.generatePricesReport") * rateMultiplier * instanceMultiplier
    val generateShelfsStatisticsReportPerSecond = config.getDouble("performance.operationsPerSecond.generateShelfsStatisticsReport") * rateMultiplier * instanceMultiplier
    val generateShipmentListDocumentReportPerSecond = config.getDouble("performance.operationsPerSecond.generateShipmentListDocumentReport") * rateMultiplier * instanceMultiplier
    val generateShowsSalesReportPerSecond = config.getDouble("performance.operationsPerSecond.generateShowsSalesReport") * rateMultiplier * instanceMultiplier
    val generateStocksOnWarehousesReportPerSecond = config.getDouble("performance.operationsPerSecond.generateStocksOnWarehousesReport") * rateMultiplier * instanceMultiplier
    val generateUnitedMarketplaceServicesReportPerSecond = config.getDouble("performance.operationsPerSecond.generateUnitedMarketplaceServicesReport") * rateMultiplier * instanceMultiplier
    val generateUnitedNettingReportPerSecond = config.getDouble("performance.operationsPerSecond.generateUnitedNettingReport") * rateMultiplier * instanceMultiplier
    val generateUnitedOrdersReportPerSecond = config.getDouble("performance.operationsPerSecond.generateUnitedOrdersReport") * rateMultiplier * instanceMultiplier
    val getReportInfoPerSecond = config.getDouble("performance.operationsPerSecond.getReportInfo") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val generateBoostConsolidatedReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateBoostConsolidatedReport-queryParams.csv").random
    val generateCompetitorsPositionReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateCompetitorsPositionReport-queryParams.csv").random
    val generateGoodsFeedbackReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateGoodsFeedbackReport-queryParams.csv").random
    val generateGoodsMovementReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateGoodsMovementReport-queryParams.csv").random
    val generateGoodsRealizationReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateGoodsRealizationReport-queryParams.csv").random
    val generateGoodsTurnoverReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateGoodsTurnoverReport-queryParams.csv").random
    val generateMassOrderLabelsReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateMassOrderLabelsReport-queryParams.csv").random
    val generatePricesReportQUERYFeeder = csv(userDataDirectory + File.separator + "generatePricesReport-queryParams.csv").random
    val generateShelfsStatisticsReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateShelfsStatisticsReport-queryParams.csv").random
    val generateShowsSalesReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateShowsSalesReport-queryParams.csv").random
    val generateStocksOnWarehousesReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateStocksOnWarehousesReport-queryParams.csv").random
    val generateUnitedMarketplaceServicesReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateUnitedMarketplaceServicesReport-queryParams.csv").random
    val generateUnitedNettingReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateUnitedNettingReport-queryParams.csv").random
    val generateUnitedOrdersReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateUnitedOrdersReport-queryParams.csv").random
    val getReportInfoPATHFeeder = csv(userDataDirectory + File.separator + "getReportInfo-pathParams.csv").random

    // Setup all scenarios

    
    val scngenerateBoostConsolidatedReport = scenario("generateBoostConsolidatedReportSimulation")
        .feed(generateBoostConsolidatedReportQUERYFeeder)
        .exec(http("generateBoostConsolidatedReport")
        .httpRequest("POST","/reports/boost-consolidated/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateBoostConsolidatedReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateBoostConsolidatedReport.inject(
        rampUsersPerSec(1) to(generateBoostConsolidatedReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateBoostConsolidatedReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateBoostConsolidatedReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateCompetitorsPositionReport = scenario("generateCompetitorsPositionReportSimulation")
        .feed(generateCompetitorsPositionReportQUERYFeeder)
        .exec(http("generateCompetitorsPositionReport")
        .httpRequest("POST","/reports/competitors-position/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateCompetitorsPositionReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateCompetitorsPositionReport.inject(
        rampUsersPerSec(1) to(generateCompetitorsPositionReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateCompetitorsPositionReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateCompetitorsPositionReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateGoodsFeedbackReport = scenario("generateGoodsFeedbackReportSimulation")
        .feed(generateGoodsFeedbackReportQUERYFeeder)
        .exec(http("generateGoodsFeedbackReport")
        .httpRequest("POST","/reports/goods-feedback/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateGoodsFeedbackReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateGoodsFeedbackReport.inject(
        rampUsersPerSec(1) to(generateGoodsFeedbackReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateGoodsFeedbackReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateGoodsFeedbackReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateGoodsMovementReport = scenario("generateGoodsMovementReportSimulation")
        .feed(generateGoodsMovementReportQUERYFeeder)
        .exec(http("generateGoodsMovementReport")
        .httpRequest("POST","/reports/goods-movement/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateGoodsMovementReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateGoodsMovementReport.inject(
        rampUsersPerSec(1) to(generateGoodsMovementReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateGoodsMovementReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateGoodsMovementReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateGoodsRealizationReport = scenario("generateGoodsRealizationReportSimulation")
        .feed(generateGoodsRealizationReportQUERYFeeder)
        .exec(http("generateGoodsRealizationReport")
        .httpRequest("POST","/reports/goods-realization/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateGoodsRealizationReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateGoodsRealizationReport.inject(
        rampUsersPerSec(1) to(generateGoodsRealizationReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateGoodsRealizationReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateGoodsRealizationReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateGoodsTurnoverReport = scenario("generateGoodsTurnoverReportSimulation")
        .feed(generateGoodsTurnoverReportQUERYFeeder)
        .exec(http("generateGoodsTurnoverReport")
        .httpRequest("POST","/reports/goods-turnover/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateGoodsTurnoverReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateGoodsTurnoverReport.inject(
        rampUsersPerSec(1) to(generateGoodsTurnoverReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateGoodsTurnoverReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateGoodsTurnoverReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateMassOrderLabelsReport = scenario("generateMassOrderLabelsReportSimulation")
        .feed(generateMassOrderLabelsReportQUERYFeeder)
        .exec(http("generateMassOrderLabelsReport")
        .httpRequest("POST","/reports/documents/labels/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateMassOrderLabelsReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateMassOrderLabelsReport.inject(
        rampUsersPerSec(1) to(generateMassOrderLabelsReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateMassOrderLabelsReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateMassOrderLabelsReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngeneratePricesReport = scenario("generatePricesReportSimulation")
        .feed(generatePricesReportQUERYFeeder)
        .exec(http("generatePricesReport")
        .httpRequest("POST","/reports/prices/generate")
        .queryParam("format","${format}")
)

    // Run scngeneratePricesReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngeneratePricesReport.inject(
        rampUsersPerSec(1) to(generatePricesReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generatePricesReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generatePricesReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateShelfsStatisticsReport = scenario("generateShelfsStatisticsReportSimulation")
        .feed(generateShelfsStatisticsReportQUERYFeeder)
        .exec(http("generateShelfsStatisticsReport")
        .httpRequest("POST","/reports/shelf-statistics/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateShelfsStatisticsReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateShelfsStatisticsReport.inject(
        rampUsersPerSec(1) to(generateShelfsStatisticsReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateShelfsStatisticsReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateShelfsStatisticsReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateShipmentListDocumentReport = scenario("generateShipmentListDocumentReportSimulation")
        .exec(http("generateShipmentListDocumentReport")
        .httpRequest("POST","/reports/documents/shipment-list/generate")
)

    // Run scngenerateShipmentListDocumentReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateShipmentListDocumentReport.inject(
        rampUsersPerSec(1) to(generateShipmentListDocumentReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateShipmentListDocumentReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateShipmentListDocumentReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateShowsSalesReport = scenario("generateShowsSalesReportSimulation")
        .feed(generateShowsSalesReportQUERYFeeder)
        .exec(http("generateShowsSalesReport")
        .httpRequest("POST","/reports/shows-sales/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateShowsSalesReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateShowsSalesReport.inject(
        rampUsersPerSec(1) to(generateShowsSalesReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateShowsSalesReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateShowsSalesReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateStocksOnWarehousesReport = scenario("generateStocksOnWarehousesReportSimulation")
        .feed(generateStocksOnWarehousesReportQUERYFeeder)
        .exec(http("generateStocksOnWarehousesReport")
        .httpRequest("POST","/reports/stocks-on-warehouses/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateStocksOnWarehousesReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateStocksOnWarehousesReport.inject(
        rampUsersPerSec(1) to(generateStocksOnWarehousesReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateStocksOnWarehousesReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateStocksOnWarehousesReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateUnitedMarketplaceServicesReport = scenario("generateUnitedMarketplaceServicesReportSimulation")
        .feed(generateUnitedMarketplaceServicesReportQUERYFeeder)
        .exec(http("generateUnitedMarketplaceServicesReport")
        .httpRequest("POST","/reports/united-marketplace-services/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateUnitedMarketplaceServicesReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateUnitedMarketplaceServicesReport.inject(
        rampUsersPerSec(1) to(generateUnitedMarketplaceServicesReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateUnitedMarketplaceServicesReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateUnitedMarketplaceServicesReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateUnitedNettingReport = scenario("generateUnitedNettingReportSimulation")
        .feed(generateUnitedNettingReportQUERYFeeder)
        .exec(http("generateUnitedNettingReport")
        .httpRequest("POST","/reports/united-netting/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateUnitedNettingReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateUnitedNettingReport.inject(
        rampUsersPerSec(1) to(generateUnitedNettingReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateUnitedNettingReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateUnitedNettingReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateUnitedOrdersReport = scenario("generateUnitedOrdersReportSimulation")
        .feed(generateUnitedOrdersReportQUERYFeeder)
        .exec(http("generateUnitedOrdersReport")
        .httpRequest("POST","/reports/united-orders/generate")
        .queryParam("format","${format}")
)

    // Run scngenerateUnitedOrdersReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateUnitedOrdersReport.inject(
        rampUsersPerSec(1) to(generateUnitedOrdersReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateUnitedOrdersReportPerSecond) during(durationSeconds),
        rampUsersPerSec(generateUnitedOrdersReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetReportInfo = scenario("getReportInfoSimulation")
        .feed(getReportInfoPATHFeeder)
        .exec(http("getReportInfo")
        .httpRequest("GET","/reports/info/${reportId}")
)

    // Run scngetReportInfo with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetReportInfo.inject(
        rampUsersPerSec(1) to(getReportInfoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getReportInfoPerSecond) during(durationSeconds),
        rampUsersPerSec(getReportInfoPerSecond) to(1) during(rampDownSeconds)
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
