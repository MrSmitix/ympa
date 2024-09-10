package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class OrdersApiSimulation extends Simulation {

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
    val acceptOrderCancellationPerSecond = config.getDouble("performance.operationsPerSecond.acceptOrderCancellation") * rateMultiplier * instanceMultiplier
    val getOrderPerSecond = config.getDouble("performance.operationsPerSecond.getOrder") * rateMultiplier * instanceMultiplier
    val getOrdersPerSecond = config.getDouble("performance.operationsPerSecond.getOrders") * rateMultiplier * instanceMultiplier
    val provideOrderDigitalCodesPerSecond = config.getDouble("performance.operationsPerSecond.provideOrderDigitalCodes") * rateMultiplier * instanceMultiplier
    val provideOrderItemIdentifiersPerSecond = config.getDouble("performance.operationsPerSecond.provideOrderItemIdentifiers") * rateMultiplier * instanceMultiplier
    val setOrderBoxLayoutPerSecond = config.getDouble("performance.operationsPerSecond.setOrderBoxLayout") * rateMultiplier * instanceMultiplier
    val setOrderShipmentBoxesPerSecond = config.getDouble("performance.operationsPerSecond.setOrderShipmentBoxes") * rateMultiplier * instanceMultiplier
    val updateOrderItemsPerSecond = config.getDouble("performance.operationsPerSecond.updateOrderItems") * rateMultiplier * instanceMultiplier
    val updateOrderStatusPerSecond = config.getDouble("performance.operationsPerSecond.updateOrderStatus") * rateMultiplier * instanceMultiplier
    val updateOrderStatusesPerSecond = config.getDouble("performance.operationsPerSecond.updateOrderStatuses") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val acceptOrderCancellationPATHFeeder = csv(userDataDirectory + File.separator + "acceptOrderCancellation-pathParams.csv").random
    val getOrderPATHFeeder = csv(userDataDirectory + File.separator + "getOrder-pathParams.csv").random
    val getOrdersQUERYFeeder = csv(userDataDirectory + File.separator + "getOrders-queryParams.csv").random
    val getOrdersPATHFeeder = csv(userDataDirectory + File.separator + "getOrders-pathParams.csv").random
    val provideOrderDigitalCodesPATHFeeder = csv(userDataDirectory + File.separator + "provideOrderDigitalCodes-pathParams.csv").random
    val provideOrderItemIdentifiersPATHFeeder = csv(userDataDirectory + File.separator + "provideOrderItemIdentifiers-pathParams.csv").random
    val setOrderBoxLayoutPATHFeeder = csv(userDataDirectory + File.separator + "setOrderBoxLayout-pathParams.csv").random
    val setOrderShipmentBoxesPATHFeeder = csv(userDataDirectory + File.separator + "setOrderShipmentBoxes-pathParams.csv").random
    val updateOrderItemsPATHFeeder = csv(userDataDirectory + File.separator + "updateOrderItems-pathParams.csv").random
    val updateOrderStatusPATHFeeder = csv(userDataDirectory + File.separator + "updateOrderStatus-pathParams.csv").random
    val updateOrderStatusesPATHFeeder = csv(userDataDirectory + File.separator + "updateOrderStatuses-pathParams.csv").random

    // Setup all scenarios

    
    val scnacceptOrderCancellation = scenario("acceptOrderCancellationSimulation")
        .feed(acceptOrderCancellationPATHFeeder)
        .exec(http("acceptOrderCancellation")
        .httpRequest("PUT","/campaigns/${campaignId}/orders/${orderId}/cancellation/accept")
)

    // Run scnacceptOrderCancellation with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnacceptOrderCancellation.inject(
        rampUsersPerSec(1) to(acceptOrderCancellationPerSecond) during(rampUpSeconds),
        constantUsersPerSec(acceptOrderCancellationPerSecond) during(durationSeconds),
        rampUsersPerSec(acceptOrderCancellationPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOrder = scenario("getOrderSimulation")
        .feed(getOrderPATHFeeder)
        .exec(http("getOrder")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}")
)

    // Run scngetOrder with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOrder.inject(
        rampUsersPerSec(1) to(getOrderPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOrderPerSecond) during(durationSeconds),
        rampUsersPerSec(getOrderPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOrders = scenario("getOrdersSimulation")
        .feed(getOrdersQUERYFeeder)
        .feed(getOrdersPATHFeeder)
        .exec(http("getOrders")
        .httpRequest("GET","/campaigns/${campaignId}/orders")
        .queryParam("updatedAtFrom","${updatedAtFrom}")
        .queryParam("page_token","${page_token}")
        .queryParam("pageSize","${pageSize}")
        .queryParam("onlyWaitingForCancellationApprove","${onlyWaitingForCancellationApprove}")
        .queryParam("orderIds","${orderIds}")
        .queryParam("status","${status}")
        .queryParam("supplierShipmentDateFrom","${supplierShipmentDateFrom}")
        .queryParam("supplierShipmentDateTo","${supplierShipmentDateTo}")
        .queryParam("page","${page}")
        .queryParam("hasCis","${hasCis}")
        .queryParam("onlyEstimatedDelivery","${onlyEstimatedDelivery}")
        .queryParam("substatus","${substatus}")
        .queryParam("toDate","${toDate}")
        .queryParam("buyerType","${buyerType}")
        .queryParam("fromDate","${fromDate}")
        .queryParam("limit","${limit}")
        .queryParam("fake","${fake}")
        .queryParam("updatedAtTo","${updatedAtTo}")
        .queryParam("dispatchType","${dispatchType}")
)

    // Run scngetOrders with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOrders.inject(
        rampUsersPerSec(1) to(getOrdersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOrdersPerSecond) during(durationSeconds),
        rampUsersPerSec(getOrdersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnprovideOrderDigitalCodes = scenario("provideOrderDigitalCodesSimulation")
        .feed(provideOrderDigitalCodesPATHFeeder)
        .exec(http("provideOrderDigitalCodes")
        .httpRequest("POST","/campaigns/${campaignId}/orders/${orderId}/deliverDigitalGoods")
)

    // Run scnprovideOrderDigitalCodes with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnprovideOrderDigitalCodes.inject(
        rampUsersPerSec(1) to(provideOrderDigitalCodesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(provideOrderDigitalCodesPerSecond) during(durationSeconds),
        rampUsersPerSec(provideOrderDigitalCodesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnprovideOrderItemIdentifiers = scenario("provideOrderItemIdentifiersSimulation")
        .feed(provideOrderItemIdentifiersPATHFeeder)
        .exec(http("provideOrderItemIdentifiers")
        .httpRequest("PUT","/campaigns/${campaignId}/orders/${orderId}/identifiers")
)

    // Run scnprovideOrderItemIdentifiers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnprovideOrderItemIdentifiers.inject(
        rampUsersPerSec(1) to(provideOrderItemIdentifiersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(provideOrderItemIdentifiersPerSecond) during(durationSeconds),
        rampUsersPerSec(provideOrderItemIdentifiersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsetOrderBoxLayout = scenario("setOrderBoxLayoutSimulation")
        .feed(setOrderBoxLayoutPATHFeeder)
        .exec(http("setOrderBoxLayout")
        .httpRequest("PUT","/campaigns/${campaignId}/orders/${orderId}/boxes")
)

    // Run scnsetOrderBoxLayout with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsetOrderBoxLayout.inject(
        rampUsersPerSec(1) to(setOrderBoxLayoutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(setOrderBoxLayoutPerSecond) during(durationSeconds),
        rampUsersPerSec(setOrderBoxLayoutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsetOrderShipmentBoxes = scenario("setOrderShipmentBoxesSimulation")
        .feed(setOrderShipmentBoxesPATHFeeder)
        .exec(http("setOrderShipmentBoxes")
        .httpRequest("PUT","/campaigns/${campaignId}/orders/${orderId}/delivery/shipments/${shipmentId}/boxes")
)

    // Run scnsetOrderShipmentBoxes with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsetOrderShipmentBoxes.inject(
        rampUsersPerSec(1) to(setOrderShipmentBoxesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(setOrderShipmentBoxesPerSecond) during(durationSeconds),
        rampUsersPerSec(setOrderShipmentBoxesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateOrderItems = scenario("updateOrderItemsSimulation")
        .feed(updateOrderItemsPATHFeeder)
        .exec(http("updateOrderItems")
        .httpRequest("PUT","/campaigns/${campaignId}/orders/${orderId}/items")
)

    // Run scnupdateOrderItems with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateOrderItems.inject(
        rampUsersPerSec(1) to(updateOrderItemsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateOrderItemsPerSecond) during(durationSeconds),
        rampUsersPerSec(updateOrderItemsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateOrderStatus = scenario("updateOrderStatusSimulation")
        .feed(updateOrderStatusPATHFeeder)
        .exec(http("updateOrderStatus")
        .httpRequest("PUT","/campaigns/${campaignId}/orders/${orderId}/status")
)

    // Run scnupdateOrderStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateOrderStatus.inject(
        rampUsersPerSec(1) to(updateOrderStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateOrderStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(updateOrderStatusPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateOrderStatuses = scenario("updateOrderStatusesSimulation")
        .feed(updateOrderStatusesPATHFeeder)
        .exec(http("updateOrderStatuses")
        .httpRequest("POST","/campaigns/${campaignId}/orders/status-update")
)

    // Run scnupdateOrderStatuses with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateOrderStatuses.inject(
        rampUsersPerSec(1) to(updateOrderStatusesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateOrderStatusesPerSecond) during(durationSeconds),
        rampUsersPerSec(updateOrderStatusesPerSecond) to(1) during(rampDownSeconds)
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
