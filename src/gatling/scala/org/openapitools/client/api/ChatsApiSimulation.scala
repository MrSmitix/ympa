package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ChatsApiSimulation extends Simulation {

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
    val createChatPerSecond = config.getDouble("performance.operationsPerSecond.createChat") * rateMultiplier * instanceMultiplier
    val getChatHistoryPerSecond = config.getDouble("performance.operationsPerSecond.getChatHistory") * rateMultiplier * instanceMultiplier
    val getChatsPerSecond = config.getDouble("performance.operationsPerSecond.getChats") * rateMultiplier * instanceMultiplier
    val sendFileToChatPerSecond = config.getDouble("performance.operationsPerSecond.sendFileToChat") * rateMultiplier * instanceMultiplier
    val sendMessageToChatPerSecond = config.getDouble("performance.operationsPerSecond.sendMessageToChat") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val createChatPATHFeeder = csv(userDataDirectory + File.separator + "createChat-pathParams.csv").random
    val getChatHistoryQUERYFeeder = csv(userDataDirectory + File.separator + "getChatHistory-queryParams.csv").random
    val getChatHistoryPATHFeeder = csv(userDataDirectory + File.separator + "getChatHistory-pathParams.csv").random
    val getChatsQUERYFeeder = csv(userDataDirectory + File.separator + "getChats-queryParams.csv").random
    val getChatsPATHFeeder = csv(userDataDirectory + File.separator + "getChats-pathParams.csv").random
    val sendFileToChatQUERYFeeder = csv(userDataDirectory + File.separator + "sendFileToChat-queryParams.csv").random
    val sendFileToChatPATHFeeder = csv(userDataDirectory + File.separator + "sendFileToChat-pathParams.csv").random
    val sendMessageToChatQUERYFeeder = csv(userDataDirectory + File.separator + "sendMessageToChat-queryParams.csv").random
    val sendMessageToChatPATHFeeder = csv(userDataDirectory + File.separator + "sendMessageToChat-pathParams.csv").random

    // Setup all scenarios

    
    val scncreateChat = scenario("createChatSimulation")
        .feed(createChatPATHFeeder)
        .exec(http("createChat")
        .httpRequest("POST","/businesses/${businessId}/chats/new")
)

    // Run scncreateChat with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateChat.inject(
        rampUsersPerSec(1) to(createChatPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createChatPerSecond) during(durationSeconds),
        rampUsersPerSec(createChatPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetChatHistory = scenario("getChatHistorySimulation")
        .feed(getChatHistoryQUERYFeeder)
        .feed(getChatHistoryPATHFeeder)
        .exec(http("getChatHistory")
        .httpRequest("POST","/businesses/${businessId}/chats/history")
        .queryParam("chatId","${chatId}")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetChatHistory with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetChatHistory.inject(
        rampUsersPerSec(1) to(getChatHistoryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getChatHistoryPerSecond) during(durationSeconds),
        rampUsersPerSec(getChatHistoryPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetChats = scenario("getChatsSimulation")
        .feed(getChatsQUERYFeeder)
        .feed(getChatsPATHFeeder)
        .exec(http("getChats")
        .httpRequest("POST","/businesses/${businessId}/chats")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetChats with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetChats.inject(
        rampUsersPerSec(1) to(getChatsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getChatsPerSecond) during(durationSeconds),
        rampUsersPerSec(getChatsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsendFileToChat = scenario("sendFileToChatSimulation")
        .feed(sendFileToChatQUERYFeeder)
        .feed(sendFileToChatPATHFeeder)
        .exec(http("sendFileToChat")
        .httpRequest("POST","/businesses/${businessId}/chats/file/send")
        .queryParam("chatId","${chatId}")
)

    // Run scnsendFileToChat with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsendFileToChat.inject(
        rampUsersPerSec(1) to(sendFileToChatPerSecond) during(rampUpSeconds),
        constantUsersPerSec(sendFileToChatPerSecond) during(durationSeconds),
        rampUsersPerSec(sendFileToChatPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsendMessageToChat = scenario("sendMessageToChatSimulation")
        .feed(sendMessageToChatQUERYFeeder)
        .feed(sendMessageToChatPATHFeeder)
        .exec(http("sendMessageToChat")
        .httpRequest("POST","/businesses/${businessId}/chats/message")
        .queryParam("chatId","${chatId}")
)

    // Run scnsendMessageToChat with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsendMessageToChat.inject(
        rampUsersPerSec(1) to(sendMessageToChatPerSecond) during(rampUpSeconds),
        constantUsersPerSec(sendMessageToChatPerSecond) during(durationSeconds),
        rampUsersPerSec(sendMessageToChatPerSecond) to(1) during(rampDownSeconds)
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
