package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class GoodsFeedbackApiSimulation extends Simulation {

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
    val deleteGoodsFeedbackCommentPerSecond = config.getDouble("performance.operationsPerSecond.deleteGoodsFeedbackComment") * rateMultiplier * instanceMultiplier
    val getGoodsFeedbackCommentsPerSecond = config.getDouble("performance.operationsPerSecond.getGoodsFeedbackComments") * rateMultiplier * instanceMultiplier
    val getGoodsFeedbacksPerSecond = config.getDouble("performance.operationsPerSecond.getGoodsFeedbacks") * rateMultiplier * instanceMultiplier
    val skipGoodsFeedbacksReactionPerSecond = config.getDouble("performance.operationsPerSecond.skipGoodsFeedbacksReaction") * rateMultiplier * instanceMultiplier
    val updateGoodsFeedbackCommentPerSecond = config.getDouble("performance.operationsPerSecond.updateGoodsFeedbackComment") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val deleteGoodsFeedbackCommentPATHFeeder = csv(userDataDirectory + File.separator + "deleteGoodsFeedbackComment-pathParams.csv").random
    val getGoodsFeedbackCommentsQUERYFeeder = csv(userDataDirectory + File.separator + "getGoodsFeedbackComments-queryParams.csv").random
    val getGoodsFeedbackCommentsPATHFeeder = csv(userDataDirectory + File.separator + "getGoodsFeedbackComments-pathParams.csv").random
    val getGoodsFeedbacksQUERYFeeder = csv(userDataDirectory + File.separator + "getGoodsFeedbacks-queryParams.csv").random
    val getGoodsFeedbacksPATHFeeder = csv(userDataDirectory + File.separator + "getGoodsFeedbacks-pathParams.csv").random
    val skipGoodsFeedbacksReactionPATHFeeder = csv(userDataDirectory + File.separator + "skipGoodsFeedbacksReaction-pathParams.csv").random
    val updateGoodsFeedbackCommentPATHFeeder = csv(userDataDirectory + File.separator + "updateGoodsFeedbackComment-pathParams.csv").random

    // Setup all scenarios

    
    val scndeleteGoodsFeedbackComment = scenario("deleteGoodsFeedbackCommentSimulation")
        .feed(deleteGoodsFeedbackCommentPATHFeeder)
        .exec(http("deleteGoodsFeedbackComment")
        .httpRequest("POST","/businesses/${businessId}/goods-feedback/comments/delete")
)

    // Run scndeleteGoodsFeedbackComment with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteGoodsFeedbackComment.inject(
        rampUsersPerSec(1) to(deleteGoodsFeedbackCommentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteGoodsFeedbackCommentPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteGoodsFeedbackCommentPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetGoodsFeedbackComments = scenario("getGoodsFeedbackCommentsSimulation")
        .feed(getGoodsFeedbackCommentsQUERYFeeder)
        .feed(getGoodsFeedbackCommentsPATHFeeder)
        .exec(http("getGoodsFeedbackComments")
        .httpRequest("POST","/businesses/${businessId}/goods-feedback/comments")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetGoodsFeedbackComments with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetGoodsFeedbackComments.inject(
        rampUsersPerSec(1) to(getGoodsFeedbackCommentsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getGoodsFeedbackCommentsPerSecond) during(durationSeconds),
        rampUsersPerSec(getGoodsFeedbackCommentsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetGoodsFeedbacks = scenario("getGoodsFeedbacksSimulation")
        .feed(getGoodsFeedbacksQUERYFeeder)
        .feed(getGoodsFeedbacksPATHFeeder)
        .exec(http("getGoodsFeedbacks")
        .httpRequest("POST","/businesses/${businessId}/goods-feedback")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetGoodsFeedbacks with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetGoodsFeedbacks.inject(
        rampUsersPerSec(1) to(getGoodsFeedbacksPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getGoodsFeedbacksPerSecond) during(durationSeconds),
        rampUsersPerSec(getGoodsFeedbacksPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnskipGoodsFeedbacksReaction = scenario("skipGoodsFeedbacksReactionSimulation")
        .feed(skipGoodsFeedbacksReactionPATHFeeder)
        .exec(http("skipGoodsFeedbacksReaction")
        .httpRequest("POST","/businesses/${businessId}/goods-feedback/skip-reaction")
)

    // Run scnskipGoodsFeedbacksReaction with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnskipGoodsFeedbacksReaction.inject(
        rampUsersPerSec(1) to(skipGoodsFeedbacksReactionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(skipGoodsFeedbacksReactionPerSecond) during(durationSeconds),
        rampUsersPerSec(skipGoodsFeedbacksReactionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateGoodsFeedbackComment = scenario("updateGoodsFeedbackCommentSimulation")
        .feed(updateGoodsFeedbackCommentPATHFeeder)
        .exec(http("updateGoodsFeedbackComment")
        .httpRequest("POST","/businesses/${businessId}/goods-feedback/comments/update")
)

    // Run scnupdateGoodsFeedbackComment with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateGoodsFeedbackComment.inject(
        rampUsersPerSec(1) to(updateGoodsFeedbackCommentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateGoodsFeedbackCommentPerSecond) during(durationSeconds),
        rampUsersPerSec(updateGoodsFeedbackCommentPerSecond) to(1) during(rampDownSeconds)
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
