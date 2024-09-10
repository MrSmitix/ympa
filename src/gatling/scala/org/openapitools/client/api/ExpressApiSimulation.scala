package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ExpressApiSimulation extends Simulation {

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
    val addHiddenOffersPerSecond = config.getDouble("performance.operationsPerSecond.addHiddenOffers") * rateMultiplier * instanceMultiplier
    val addOffersToArchivePerSecond = config.getDouble("performance.operationsPerSecond.addOffersToArchive") * rateMultiplier * instanceMultiplier
    val calculateTariffsPerSecond = config.getDouble("performance.operationsPerSecond.calculateTariffs") * rateMultiplier * instanceMultiplier
    val confirmBusinessPricesPerSecond = config.getDouble("performance.operationsPerSecond.confirmBusinessPrices") * rateMultiplier * instanceMultiplier
    val confirmCampaignPricesPerSecond = config.getDouble("performance.operationsPerSecond.confirmCampaignPrices") * rateMultiplier * instanceMultiplier
    val createChatPerSecond = config.getDouble("performance.operationsPerSecond.createChat") * rateMultiplier * instanceMultiplier
    val deleteCampaignOffersPerSecond = config.getDouble("performance.operationsPerSecond.deleteCampaignOffers") * rateMultiplier * instanceMultiplier
    val deleteGoodsFeedbackCommentPerSecond = config.getDouble("performance.operationsPerSecond.deleteGoodsFeedbackComment") * rateMultiplier * instanceMultiplier
    val deleteHiddenOffersPerSecond = config.getDouble("performance.operationsPerSecond.deleteHiddenOffers") * rateMultiplier * instanceMultiplier
    val deleteOffersPerSecond = config.getDouble("performance.operationsPerSecond.deleteOffers") * rateMultiplier * instanceMultiplier
    val deleteOffersFromArchivePerSecond = config.getDouble("performance.operationsPerSecond.deleteOffersFromArchive") * rateMultiplier * instanceMultiplier
    val deletePromoOffersPerSecond = config.getDouble("performance.operationsPerSecond.deletePromoOffers") * rateMultiplier * instanceMultiplier
    val generateBoostConsolidatedReportPerSecond = config.getDouble("performance.operationsPerSecond.generateBoostConsolidatedReport") * rateMultiplier * instanceMultiplier
    val generateCompetitorsPositionReportPerSecond = config.getDouble("performance.operationsPerSecond.generateCompetitorsPositionReport") * rateMultiplier * instanceMultiplier
    val generateGoodsFeedbackReportPerSecond = config.getDouble("performance.operationsPerSecond.generateGoodsFeedbackReport") * rateMultiplier * instanceMultiplier
    val generateGoodsRealizationReportPerSecond = config.getDouble("performance.operationsPerSecond.generateGoodsRealizationReport") * rateMultiplier * instanceMultiplier
    val generateMassOrderLabelsReportPerSecond = config.getDouble("performance.operationsPerSecond.generateMassOrderLabelsReport") * rateMultiplier * instanceMultiplier
    val generateOrderLabelPerSecond = config.getDouble("performance.operationsPerSecond.generateOrderLabel") * rateMultiplier * instanceMultiplier
    val generateOrderLabelsPerSecond = config.getDouble("performance.operationsPerSecond.generateOrderLabels") * rateMultiplier * instanceMultiplier
    val generatePricesReportPerSecond = config.getDouble("performance.operationsPerSecond.generatePricesReport") * rateMultiplier * instanceMultiplier
    val generateShelfsStatisticsReportPerSecond = config.getDouble("performance.operationsPerSecond.generateShelfsStatisticsReport") * rateMultiplier * instanceMultiplier
    val generateShowsSalesReportPerSecond = config.getDouble("performance.operationsPerSecond.generateShowsSalesReport") * rateMultiplier * instanceMultiplier
    val generateStocksOnWarehousesReportPerSecond = config.getDouble("performance.operationsPerSecond.generateStocksOnWarehousesReport") * rateMultiplier * instanceMultiplier
    val generateUnitedMarketplaceServicesReportPerSecond = config.getDouble("performance.operationsPerSecond.generateUnitedMarketplaceServicesReport") * rateMultiplier * instanceMultiplier
    val generateUnitedNettingReportPerSecond = config.getDouble("performance.operationsPerSecond.generateUnitedNettingReport") * rateMultiplier * instanceMultiplier
    val generateUnitedOrdersReportPerSecond = config.getDouble("performance.operationsPerSecond.generateUnitedOrdersReport") * rateMultiplier * instanceMultiplier
    val getAllOffersPerSecond = config.getDouble("performance.operationsPerSecond.getAllOffers") * rateMultiplier * instanceMultiplier
    val getBidsInfoForBusinessPerSecond = config.getDouble("performance.operationsPerSecond.getBidsInfoForBusiness") * rateMultiplier * instanceMultiplier
    val getBidsRecommendationsPerSecond = config.getDouble("performance.operationsPerSecond.getBidsRecommendations") * rateMultiplier * instanceMultiplier
    val getBusinessQuarantineOffersPerSecond = config.getDouble("performance.operationsPerSecond.getBusinessQuarantineOffers") * rateMultiplier * instanceMultiplier
    val getBusinessSettingsPerSecond = config.getDouble("performance.operationsPerSecond.getBusinessSettings") * rateMultiplier * instanceMultiplier
    val getCampaignPerSecond = config.getDouble("performance.operationsPerSecond.getCampaign") * rateMultiplier * instanceMultiplier
    val getCampaignLoginsPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignLogins") * rateMultiplier * instanceMultiplier
    val getCampaignOffersPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignOffers") * rateMultiplier * instanceMultiplier
    val getCampaignQuarantineOffersPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignQuarantineOffers") * rateMultiplier * instanceMultiplier
    val getCampaignRegionPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignRegion") * rateMultiplier * instanceMultiplier
    val getCampaignSettingsPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignSettings") * rateMultiplier * instanceMultiplier
    val getCampaignsPerSecond = config.getDouble("performance.operationsPerSecond.getCampaigns") * rateMultiplier * instanceMultiplier
    val getCampaignsByLoginPerSecond = config.getDouble("performance.operationsPerSecond.getCampaignsByLogin") * rateMultiplier * instanceMultiplier
    val getCategoriesMaxSaleQuantumPerSecond = config.getDouble("performance.operationsPerSecond.getCategoriesMaxSaleQuantum") * rateMultiplier * instanceMultiplier
    val getCategoriesTreePerSecond = config.getDouble("performance.operationsPerSecond.getCategoriesTree") * rateMultiplier * instanceMultiplier
    val getCategoryContentParametersPerSecond = config.getDouble("performance.operationsPerSecond.getCategoryContentParameters") * rateMultiplier * instanceMultiplier
    val getChatHistoryPerSecond = config.getDouble("performance.operationsPerSecond.getChatHistory") * rateMultiplier * instanceMultiplier
    val getChatsPerSecond = config.getDouble("performance.operationsPerSecond.getChats") * rateMultiplier * instanceMultiplier
    val getDeliveryServicesPerSecond = config.getDouble("performance.operationsPerSecond.getDeliveryServices") * rateMultiplier * instanceMultiplier
    val getFeedPerSecond = config.getDouble("performance.operationsPerSecond.getFeed") * rateMultiplier * instanceMultiplier
    val getFeedIndexLogsPerSecond = config.getDouble("performance.operationsPerSecond.getFeedIndexLogs") * rateMultiplier * instanceMultiplier
    val getFeedbackAndCommentUpdatesPerSecond = config.getDouble("performance.operationsPerSecond.getFeedbackAndCommentUpdates") * rateMultiplier * instanceMultiplier
    val getFeedsPerSecond = config.getDouble("performance.operationsPerSecond.getFeeds") * rateMultiplier * instanceMultiplier
    val getGoodsFeedbackCommentsPerSecond = config.getDouble("performance.operationsPerSecond.getGoodsFeedbackComments") * rateMultiplier * instanceMultiplier
    val getGoodsFeedbacksPerSecond = config.getDouble("performance.operationsPerSecond.getGoodsFeedbacks") * rateMultiplier * instanceMultiplier
    val getGoodsStatsPerSecond = config.getDouble("performance.operationsPerSecond.getGoodsStats") * rateMultiplier * instanceMultiplier
    val getHiddenOffersPerSecond = config.getDouble("performance.operationsPerSecond.getHiddenOffers") * rateMultiplier * instanceMultiplier
    val getOfferCardsContentStatusPerSecond = config.getDouble("performance.operationsPerSecond.getOfferCardsContentStatus") * rateMultiplier * instanceMultiplier
    val getOfferMappingEntriesPerSecond = config.getDouble("performance.operationsPerSecond.getOfferMappingEntries") * rateMultiplier * instanceMultiplier
    val getOfferMappingsPerSecond = config.getDouble("performance.operationsPerSecond.getOfferMappings") * rateMultiplier * instanceMultiplier
    val getOfferRecommendationsPerSecond = config.getDouble("performance.operationsPerSecond.getOfferRecommendations") * rateMultiplier * instanceMultiplier
    val getOffersPerSecond = config.getDouble("performance.operationsPerSecond.getOffers") * rateMultiplier * instanceMultiplier
    val getOrderPerSecond = config.getDouble("performance.operationsPerSecond.getOrder") * rateMultiplier * instanceMultiplier
    val getOrderBusinessBuyerInfoPerSecond = config.getDouble("performance.operationsPerSecond.getOrderBusinessBuyerInfo") * rateMultiplier * instanceMultiplier
    val getOrderBusinessDocumentsInfoPerSecond = config.getDouble("performance.operationsPerSecond.getOrderBusinessDocumentsInfo") * rateMultiplier * instanceMultiplier
    val getOrderLabelsDataPerSecond = config.getDouble("performance.operationsPerSecond.getOrderLabelsData") * rateMultiplier * instanceMultiplier
    val getOrdersPerSecond = config.getDouble("performance.operationsPerSecond.getOrders") * rateMultiplier * instanceMultiplier
    val getOrdersStatsPerSecond = config.getDouble("performance.operationsPerSecond.getOrdersStats") * rateMultiplier * instanceMultiplier
    val getPricesPerSecond = config.getDouble("performance.operationsPerSecond.getPrices") * rateMultiplier * instanceMultiplier
    val getPricesByOfferIdsPerSecond = config.getDouble("performance.operationsPerSecond.getPricesByOfferIds") * rateMultiplier * instanceMultiplier
    val getPromoOffersPerSecond = config.getDouble("performance.operationsPerSecond.getPromoOffers") * rateMultiplier * instanceMultiplier
    val getPromosPerSecond = config.getDouble("performance.operationsPerSecond.getPromos") * rateMultiplier * instanceMultiplier
    val getQualityRatingDetailsPerSecond = config.getDouble("performance.operationsPerSecond.getQualityRatingDetails") * rateMultiplier * instanceMultiplier
    val getQualityRatingsPerSecond = config.getDouble("performance.operationsPerSecond.getQualityRatings") * rateMultiplier * instanceMultiplier
    val getReportInfoPerSecond = config.getDouble("performance.operationsPerSecond.getReportInfo") * rateMultiplier * instanceMultiplier
    val getReturnPerSecond = config.getDouble("performance.operationsPerSecond.getReturn") * rateMultiplier * instanceMultiplier
    val getReturnApplicationPerSecond = config.getDouble("performance.operationsPerSecond.getReturnApplication") * rateMultiplier * instanceMultiplier
    val getReturnPhotoPerSecond = config.getDouble("performance.operationsPerSecond.getReturnPhoto") * rateMultiplier * instanceMultiplier
    val getReturnsPerSecond = config.getDouble("performance.operationsPerSecond.getReturns") * rateMultiplier * instanceMultiplier
    val getStocksPerSecond = config.getDouble("performance.operationsPerSecond.getStocks") * rateMultiplier * instanceMultiplier
    val getSuggestedOfferMappingEntriesPerSecond = config.getDouble("performance.operationsPerSecond.getSuggestedOfferMappingEntries") * rateMultiplier * instanceMultiplier
    val getSuggestedOfferMappingsPerSecond = config.getDouble("performance.operationsPerSecond.getSuggestedOfferMappings") * rateMultiplier * instanceMultiplier
    val getSuggestedPricesPerSecond = config.getDouble("performance.operationsPerSecond.getSuggestedPrices") * rateMultiplier * instanceMultiplier
    val getWarehousesPerSecond = config.getDouble("performance.operationsPerSecond.getWarehouses") * rateMultiplier * instanceMultiplier
    val provideOrderItemIdentifiersPerSecond = config.getDouble("performance.operationsPerSecond.provideOrderItemIdentifiers") * rateMultiplier * instanceMultiplier
    val putBidsForBusinessPerSecond = config.getDouble("performance.operationsPerSecond.putBidsForBusiness") * rateMultiplier * instanceMultiplier
    val putBidsForCampaignPerSecond = config.getDouble("performance.operationsPerSecond.putBidsForCampaign") * rateMultiplier * instanceMultiplier
    val refreshFeedPerSecond = config.getDouble("performance.operationsPerSecond.refreshFeed") * rateMultiplier * instanceMultiplier
    val searchRegionChildrenPerSecond = config.getDouble("performance.operationsPerSecond.searchRegionChildren") * rateMultiplier * instanceMultiplier
    val searchRegionsByIdPerSecond = config.getDouble("performance.operationsPerSecond.searchRegionsById") * rateMultiplier * instanceMultiplier
    val searchRegionsByNamePerSecond = config.getDouble("performance.operationsPerSecond.searchRegionsByName") * rateMultiplier * instanceMultiplier
    val sendFileToChatPerSecond = config.getDouble("performance.operationsPerSecond.sendFileToChat") * rateMultiplier * instanceMultiplier
    val sendMessageToChatPerSecond = config.getDouble("performance.operationsPerSecond.sendMessageToChat") * rateMultiplier * instanceMultiplier
    val setFeedParamsPerSecond = config.getDouble("performance.operationsPerSecond.setFeedParams") * rateMultiplier * instanceMultiplier
    val setOrderBoxLayoutPerSecond = config.getDouble("performance.operationsPerSecond.setOrderBoxLayout") * rateMultiplier * instanceMultiplier
    val setOrderShipmentBoxesPerSecond = config.getDouble("performance.operationsPerSecond.setOrderShipmentBoxes") * rateMultiplier * instanceMultiplier
    val skipGoodsFeedbacksReactionPerSecond = config.getDouble("performance.operationsPerSecond.skipGoodsFeedbacksReaction") * rateMultiplier * instanceMultiplier
    val updateBusinessPricesPerSecond = config.getDouble("performance.operationsPerSecond.updateBusinessPrices") * rateMultiplier * instanceMultiplier
    val updateCampaignOffersPerSecond = config.getDouble("performance.operationsPerSecond.updateCampaignOffers") * rateMultiplier * instanceMultiplier
    val updateGoodsFeedbackCommentPerSecond = config.getDouble("performance.operationsPerSecond.updateGoodsFeedbackComment") * rateMultiplier * instanceMultiplier
    val updateOfferContentPerSecond = config.getDouble("performance.operationsPerSecond.updateOfferContent") * rateMultiplier * instanceMultiplier
    val updateOfferMappingEntriesPerSecond = config.getDouble("performance.operationsPerSecond.updateOfferMappingEntries") * rateMultiplier * instanceMultiplier
    val updateOfferMappingsPerSecond = config.getDouble("performance.operationsPerSecond.updateOfferMappings") * rateMultiplier * instanceMultiplier
    val updateOrderItemsPerSecond = config.getDouble("performance.operationsPerSecond.updateOrderItems") * rateMultiplier * instanceMultiplier
    val updateOrderStatusPerSecond = config.getDouble("performance.operationsPerSecond.updateOrderStatus") * rateMultiplier * instanceMultiplier
    val updateOrderStatusesPerSecond = config.getDouble("performance.operationsPerSecond.updateOrderStatuses") * rateMultiplier * instanceMultiplier
    val updatePricesPerSecond = config.getDouble("performance.operationsPerSecond.updatePrices") * rateMultiplier * instanceMultiplier
    val updatePromoOffersPerSecond = config.getDouble("performance.operationsPerSecond.updatePromoOffers") * rateMultiplier * instanceMultiplier
    val updateStocksPerSecond = config.getDouble("performance.operationsPerSecond.updateStocks") * rateMultiplier * instanceMultiplier
    val verifyOrderEacPerSecond = config.getDouble("performance.operationsPerSecond.verifyOrderEac") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val addHiddenOffersPATHFeeder = csv(userDataDirectory + File.separator + "addHiddenOffers-pathParams.csv").random
    val addOffersToArchivePATHFeeder = csv(userDataDirectory + File.separator + "addOffersToArchive-pathParams.csv").random
    val confirmBusinessPricesPATHFeeder = csv(userDataDirectory + File.separator + "confirmBusinessPrices-pathParams.csv").random
    val confirmCampaignPricesPATHFeeder = csv(userDataDirectory + File.separator + "confirmCampaignPrices-pathParams.csv").random
    val createChatPATHFeeder = csv(userDataDirectory + File.separator + "createChat-pathParams.csv").random
    val deleteCampaignOffersPATHFeeder = csv(userDataDirectory + File.separator + "deleteCampaignOffers-pathParams.csv").random
    val deleteGoodsFeedbackCommentPATHFeeder = csv(userDataDirectory + File.separator + "deleteGoodsFeedbackComment-pathParams.csv").random
    val deleteHiddenOffersPATHFeeder = csv(userDataDirectory + File.separator + "deleteHiddenOffers-pathParams.csv").random
    val deleteOffersPATHFeeder = csv(userDataDirectory + File.separator + "deleteOffers-pathParams.csv").random
    val deleteOffersFromArchivePATHFeeder = csv(userDataDirectory + File.separator + "deleteOffersFromArchive-pathParams.csv").random
    val deletePromoOffersPATHFeeder = csv(userDataDirectory + File.separator + "deletePromoOffers-pathParams.csv").random
    val generateBoostConsolidatedReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateBoostConsolidatedReport-queryParams.csv").random
    val generateCompetitorsPositionReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateCompetitorsPositionReport-queryParams.csv").random
    val generateGoodsFeedbackReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateGoodsFeedbackReport-queryParams.csv").random
    val generateGoodsRealizationReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateGoodsRealizationReport-queryParams.csv").random
    val generateMassOrderLabelsReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateMassOrderLabelsReport-queryParams.csv").random
    val generateOrderLabelQUERYFeeder = csv(userDataDirectory + File.separator + "generateOrderLabel-queryParams.csv").random
    val generateOrderLabelPATHFeeder = csv(userDataDirectory + File.separator + "generateOrderLabel-pathParams.csv").random
    val generateOrderLabelsQUERYFeeder = csv(userDataDirectory + File.separator + "generateOrderLabels-queryParams.csv").random
    val generateOrderLabelsPATHFeeder = csv(userDataDirectory + File.separator + "generateOrderLabels-pathParams.csv").random
    val generatePricesReportQUERYFeeder = csv(userDataDirectory + File.separator + "generatePricesReport-queryParams.csv").random
    val generateShelfsStatisticsReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateShelfsStatisticsReport-queryParams.csv").random
    val generateShowsSalesReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateShowsSalesReport-queryParams.csv").random
    val generateStocksOnWarehousesReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateStocksOnWarehousesReport-queryParams.csv").random
    val generateUnitedMarketplaceServicesReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateUnitedMarketplaceServicesReport-queryParams.csv").random
    val generateUnitedNettingReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateUnitedNettingReport-queryParams.csv").random
    val generateUnitedOrdersReportQUERYFeeder = csv(userDataDirectory + File.separator + "generateUnitedOrdersReport-queryParams.csv").random
    val getAllOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getAllOffers-queryParams.csv").random
    val getAllOffersPATHFeeder = csv(userDataDirectory + File.separator + "getAllOffers-pathParams.csv").random
    val getBidsInfoForBusinessQUERYFeeder = csv(userDataDirectory + File.separator + "getBidsInfoForBusiness-queryParams.csv").random
    val getBidsInfoForBusinessPATHFeeder = csv(userDataDirectory + File.separator + "getBidsInfoForBusiness-pathParams.csv").random
    val getBidsRecommendationsPATHFeeder = csv(userDataDirectory + File.separator + "getBidsRecommendations-pathParams.csv").random
    val getBusinessQuarantineOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getBusinessQuarantineOffers-queryParams.csv").random
    val getBusinessQuarantineOffersPATHFeeder = csv(userDataDirectory + File.separator + "getBusinessQuarantineOffers-pathParams.csv").random
    val getBusinessSettingsPATHFeeder = csv(userDataDirectory + File.separator + "getBusinessSettings-pathParams.csv").random
    val getCampaignPATHFeeder = csv(userDataDirectory + File.separator + "getCampaign-pathParams.csv").random
    val getCampaignLoginsPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignLogins-pathParams.csv").random
    val getCampaignOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getCampaignOffers-queryParams.csv").random
    val getCampaignOffersPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignOffers-pathParams.csv").random
    val getCampaignQuarantineOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getCampaignQuarantineOffers-queryParams.csv").random
    val getCampaignQuarantineOffersPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignQuarantineOffers-pathParams.csv").random
    val getCampaignRegionPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignRegion-pathParams.csv").random
    val getCampaignSettingsPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignSettings-pathParams.csv").random
    val getCampaignsQUERYFeeder = csv(userDataDirectory + File.separator + "getCampaigns-queryParams.csv").random
    val getCampaignsByLoginQUERYFeeder = csv(userDataDirectory + File.separator + "getCampaignsByLogin-queryParams.csv").random
    val getCampaignsByLoginPATHFeeder = csv(userDataDirectory + File.separator + "getCampaignsByLogin-pathParams.csv").random
    val getCategoryContentParametersPATHFeeder = csv(userDataDirectory + File.separator + "getCategoryContentParameters-pathParams.csv").random
    val getChatHistoryQUERYFeeder = csv(userDataDirectory + File.separator + "getChatHistory-queryParams.csv").random
    val getChatHistoryPATHFeeder = csv(userDataDirectory + File.separator + "getChatHistory-pathParams.csv").random
    val getChatsQUERYFeeder = csv(userDataDirectory + File.separator + "getChats-queryParams.csv").random
    val getChatsPATHFeeder = csv(userDataDirectory + File.separator + "getChats-pathParams.csv").random
    val getFeedPATHFeeder = csv(userDataDirectory + File.separator + "getFeed-pathParams.csv").random
    val getFeedIndexLogsQUERYFeeder = csv(userDataDirectory + File.separator + "getFeedIndexLogs-queryParams.csv").random
    val getFeedIndexLogsPATHFeeder = csv(userDataDirectory + File.separator + "getFeedIndexLogs-pathParams.csv").random
    val getFeedbackAndCommentUpdatesQUERYFeeder = csv(userDataDirectory + File.separator + "getFeedbackAndCommentUpdates-queryParams.csv").random
    val getFeedbackAndCommentUpdatesPATHFeeder = csv(userDataDirectory + File.separator + "getFeedbackAndCommentUpdates-pathParams.csv").random
    val getFeedsPATHFeeder = csv(userDataDirectory + File.separator + "getFeeds-pathParams.csv").random
    val getGoodsFeedbackCommentsQUERYFeeder = csv(userDataDirectory + File.separator + "getGoodsFeedbackComments-queryParams.csv").random
    val getGoodsFeedbackCommentsPATHFeeder = csv(userDataDirectory + File.separator + "getGoodsFeedbackComments-pathParams.csv").random
    val getGoodsFeedbacksQUERYFeeder = csv(userDataDirectory + File.separator + "getGoodsFeedbacks-queryParams.csv").random
    val getGoodsFeedbacksPATHFeeder = csv(userDataDirectory + File.separator + "getGoodsFeedbacks-pathParams.csv").random
    val getGoodsStatsPATHFeeder = csv(userDataDirectory + File.separator + "getGoodsStats-pathParams.csv").random
    val getHiddenOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getHiddenOffers-queryParams.csv").random
    val getHiddenOffersPATHFeeder = csv(userDataDirectory + File.separator + "getHiddenOffers-pathParams.csv").random
    val getOfferCardsContentStatusQUERYFeeder = csv(userDataDirectory + File.separator + "getOfferCardsContentStatus-queryParams.csv").random
    val getOfferCardsContentStatusPATHFeeder = csv(userDataDirectory + File.separator + "getOfferCardsContentStatus-pathParams.csv").random
    val getOfferMappingEntriesQUERYFeeder = csv(userDataDirectory + File.separator + "getOfferMappingEntries-queryParams.csv").random
    val getOfferMappingEntriesPATHFeeder = csv(userDataDirectory + File.separator + "getOfferMappingEntries-pathParams.csv").random
    val getOfferMappingsQUERYFeeder = csv(userDataDirectory + File.separator + "getOfferMappings-queryParams.csv").random
    val getOfferMappingsPATHFeeder = csv(userDataDirectory + File.separator + "getOfferMappings-pathParams.csv").random
    val getOfferRecommendationsQUERYFeeder = csv(userDataDirectory + File.separator + "getOfferRecommendations-queryParams.csv").random
    val getOfferRecommendationsPATHFeeder = csv(userDataDirectory + File.separator + "getOfferRecommendations-pathParams.csv").random
    val getOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getOffers-queryParams.csv").random
    val getOffersPATHFeeder = csv(userDataDirectory + File.separator + "getOffers-pathParams.csv").random
    val getOrderPATHFeeder = csv(userDataDirectory + File.separator + "getOrder-pathParams.csv").random
    val getOrderBusinessBuyerInfoPATHFeeder = csv(userDataDirectory + File.separator + "getOrderBusinessBuyerInfo-pathParams.csv").random
    val getOrderBusinessDocumentsInfoPATHFeeder = csv(userDataDirectory + File.separator + "getOrderBusinessDocumentsInfo-pathParams.csv").random
    val getOrderLabelsDataPATHFeeder = csv(userDataDirectory + File.separator + "getOrderLabelsData-pathParams.csv").random
    val getOrdersQUERYFeeder = csv(userDataDirectory + File.separator + "getOrders-queryParams.csv").random
    val getOrdersPATHFeeder = csv(userDataDirectory + File.separator + "getOrders-pathParams.csv").random
    val getOrdersStatsQUERYFeeder = csv(userDataDirectory + File.separator + "getOrdersStats-queryParams.csv").random
    val getOrdersStatsPATHFeeder = csv(userDataDirectory + File.separator + "getOrdersStats-pathParams.csv").random
    val getPricesQUERYFeeder = csv(userDataDirectory + File.separator + "getPrices-queryParams.csv").random
    val getPricesPATHFeeder = csv(userDataDirectory + File.separator + "getPrices-pathParams.csv").random
    val getPricesByOfferIdsQUERYFeeder = csv(userDataDirectory + File.separator + "getPricesByOfferIds-queryParams.csv").random
    val getPricesByOfferIdsPATHFeeder = csv(userDataDirectory + File.separator + "getPricesByOfferIds-pathParams.csv").random
    val getPromoOffersQUERYFeeder = csv(userDataDirectory + File.separator + "getPromoOffers-queryParams.csv").random
    val getPromoOffersPATHFeeder = csv(userDataDirectory + File.separator + "getPromoOffers-pathParams.csv").random
    val getPromosPATHFeeder = csv(userDataDirectory + File.separator + "getPromos-pathParams.csv").random
    val getQualityRatingDetailsPATHFeeder = csv(userDataDirectory + File.separator + "getQualityRatingDetails-pathParams.csv").random
    val getQualityRatingsPATHFeeder = csv(userDataDirectory + File.separator + "getQualityRatings-pathParams.csv").random
    val getReportInfoPATHFeeder = csv(userDataDirectory + File.separator + "getReportInfo-pathParams.csv").random
    val getReturnPATHFeeder = csv(userDataDirectory + File.separator + "getReturn-pathParams.csv").random
    val getReturnApplicationPATHFeeder = csv(userDataDirectory + File.separator + "getReturnApplication-pathParams.csv").random
    val getReturnPhotoPATHFeeder = csv(userDataDirectory + File.separator + "getReturnPhoto-pathParams.csv").random
    val getReturnsQUERYFeeder = csv(userDataDirectory + File.separator + "getReturns-queryParams.csv").random
    val getReturnsPATHFeeder = csv(userDataDirectory + File.separator + "getReturns-pathParams.csv").random
    val getStocksQUERYFeeder = csv(userDataDirectory + File.separator + "getStocks-queryParams.csv").random
    val getStocksPATHFeeder = csv(userDataDirectory + File.separator + "getStocks-pathParams.csv").random
    val getSuggestedOfferMappingEntriesPATHFeeder = csv(userDataDirectory + File.separator + "getSuggestedOfferMappingEntries-pathParams.csv").random
    val getSuggestedOfferMappingsPATHFeeder = csv(userDataDirectory + File.separator + "getSuggestedOfferMappings-pathParams.csv").random
    val getSuggestedPricesPATHFeeder = csv(userDataDirectory + File.separator + "getSuggestedPrices-pathParams.csv").random
    val getWarehousesPATHFeeder = csv(userDataDirectory + File.separator + "getWarehouses-pathParams.csv").random
    val provideOrderItemIdentifiersPATHFeeder = csv(userDataDirectory + File.separator + "provideOrderItemIdentifiers-pathParams.csv").random
    val putBidsForBusinessPATHFeeder = csv(userDataDirectory + File.separator + "putBidsForBusiness-pathParams.csv").random
    val putBidsForCampaignPATHFeeder = csv(userDataDirectory + File.separator + "putBidsForCampaign-pathParams.csv").random
    val refreshFeedPATHFeeder = csv(userDataDirectory + File.separator + "refreshFeed-pathParams.csv").random
    val searchRegionChildrenQUERYFeeder = csv(userDataDirectory + File.separator + "searchRegionChildren-queryParams.csv").random
    val searchRegionChildrenPATHFeeder = csv(userDataDirectory + File.separator + "searchRegionChildren-pathParams.csv").random
    val searchRegionsByIdPATHFeeder = csv(userDataDirectory + File.separator + "searchRegionsById-pathParams.csv").random
    val searchRegionsByNameQUERYFeeder = csv(userDataDirectory + File.separator + "searchRegionsByName-queryParams.csv").random
    val sendFileToChatQUERYFeeder = csv(userDataDirectory + File.separator + "sendFileToChat-queryParams.csv").random
    val sendFileToChatPATHFeeder = csv(userDataDirectory + File.separator + "sendFileToChat-pathParams.csv").random
    val sendMessageToChatQUERYFeeder = csv(userDataDirectory + File.separator + "sendMessageToChat-queryParams.csv").random
    val sendMessageToChatPATHFeeder = csv(userDataDirectory + File.separator + "sendMessageToChat-pathParams.csv").random
    val setFeedParamsPATHFeeder = csv(userDataDirectory + File.separator + "setFeedParams-pathParams.csv").random
    val setOrderBoxLayoutPATHFeeder = csv(userDataDirectory + File.separator + "setOrderBoxLayout-pathParams.csv").random
    val setOrderShipmentBoxesPATHFeeder = csv(userDataDirectory + File.separator + "setOrderShipmentBoxes-pathParams.csv").random
    val skipGoodsFeedbacksReactionPATHFeeder = csv(userDataDirectory + File.separator + "skipGoodsFeedbacksReaction-pathParams.csv").random
    val updateBusinessPricesPATHFeeder = csv(userDataDirectory + File.separator + "updateBusinessPrices-pathParams.csv").random
    val updateCampaignOffersPATHFeeder = csv(userDataDirectory + File.separator + "updateCampaignOffers-pathParams.csv").random
    val updateGoodsFeedbackCommentPATHFeeder = csv(userDataDirectory + File.separator + "updateGoodsFeedbackComment-pathParams.csv").random
    val updateOfferContentPATHFeeder = csv(userDataDirectory + File.separator + "updateOfferContent-pathParams.csv").random
    val updateOfferMappingEntriesPATHFeeder = csv(userDataDirectory + File.separator + "updateOfferMappingEntries-pathParams.csv").random
    val updateOfferMappingsPATHFeeder = csv(userDataDirectory + File.separator + "updateOfferMappings-pathParams.csv").random
    val updateOrderItemsPATHFeeder = csv(userDataDirectory + File.separator + "updateOrderItems-pathParams.csv").random
    val updateOrderStatusPATHFeeder = csv(userDataDirectory + File.separator + "updateOrderStatus-pathParams.csv").random
    val updateOrderStatusesPATHFeeder = csv(userDataDirectory + File.separator + "updateOrderStatuses-pathParams.csv").random
    val updatePricesPATHFeeder = csv(userDataDirectory + File.separator + "updatePrices-pathParams.csv").random
    val updatePromoOffersPATHFeeder = csv(userDataDirectory + File.separator + "updatePromoOffers-pathParams.csv").random
    val updateStocksPATHFeeder = csv(userDataDirectory + File.separator + "updateStocks-pathParams.csv").random
    val verifyOrderEacPATHFeeder = csv(userDataDirectory + File.separator + "verifyOrderEac-pathParams.csv").random

    // Setup all scenarios

    
    val scnaddHiddenOffers = scenario("addHiddenOffersSimulation")
        .feed(addHiddenOffersPATHFeeder)
        .exec(http("addHiddenOffers")
        .httpRequest("POST","/campaigns/${campaignId}/hidden-offers")
)

    // Run scnaddHiddenOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaddHiddenOffers.inject(
        rampUsersPerSec(1) to(addHiddenOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(addHiddenOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(addHiddenOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
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

    
    val scncalculateTariffs = scenario("calculateTariffsSimulation")
        .exec(http("calculateTariffs")
        .httpRequest("POST","/tariffs/calculate")
)

    // Run scncalculateTariffs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncalculateTariffs.inject(
        rampUsersPerSec(1) to(calculateTariffsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(calculateTariffsPerSecond) during(durationSeconds),
        rampUsersPerSec(calculateTariffsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfirmBusinessPrices = scenario("confirmBusinessPricesSimulation")
        .feed(confirmBusinessPricesPATHFeeder)
        .exec(http("confirmBusinessPrices")
        .httpRequest("POST","/businesses/${businessId}/price-quarantine/confirm")
)

    // Run scnconfirmBusinessPrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfirmBusinessPrices.inject(
        rampUsersPerSec(1) to(confirmBusinessPricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(confirmBusinessPricesPerSecond) during(durationSeconds),
        rampUsersPerSec(confirmBusinessPricesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfirmCampaignPrices = scenario("confirmCampaignPricesSimulation")
        .feed(confirmCampaignPricesPATHFeeder)
        .exec(http("confirmCampaignPrices")
        .httpRequest("POST","/campaigns/${campaignId}/price-quarantine/confirm")
)

    // Run scnconfirmCampaignPrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfirmCampaignPrices.inject(
        rampUsersPerSec(1) to(confirmCampaignPricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(confirmCampaignPricesPerSecond) during(durationSeconds),
        rampUsersPerSec(confirmCampaignPricesPerSecond) to(1) during(rampDownSeconds)
    )

    
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

    
    val scndeleteCampaignOffers = scenario("deleteCampaignOffersSimulation")
        .feed(deleteCampaignOffersPATHFeeder)
        .exec(http("deleteCampaignOffers")
        .httpRequest("POST","/campaigns/${campaignId}/offers/delete")
)

    // Run scndeleteCampaignOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteCampaignOffers.inject(
        rampUsersPerSec(1) to(deleteCampaignOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteCampaignOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteCampaignOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
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

    
    val scndeleteHiddenOffers = scenario("deleteHiddenOffersSimulation")
        .feed(deleteHiddenOffersPATHFeeder)
        .exec(http("deleteHiddenOffers")
        .httpRequest("POST","/campaigns/${campaignId}/hidden-offers/delete")
)

    // Run scndeleteHiddenOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteHiddenOffers.inject(
        rampUsersPerSec(1) to(deleteHiddenOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteHiddenOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteHiddenOffersPerSecond) to(1) during(rampDownSeconds)
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

    
    val scndeletePromoOffers = scenario("deletePromoOffersSimulation")
        .feed(deletePromoOffersPATHFeeder)
        .exec(http("deletePromoOffers")
        .httpRequest("POST","/businesses/${businessId}/promos/offers/delete")
)

    // Run scndeletePromoOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeletePromoOffers.inject(
        rampUsersPerSec(1) to(deletePromoOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deletePromoOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(deletePromoOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
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

    
    val scngenerateOrderLabel = scenario("generateOrderLabelSimulation")
        .feed(generateOrderLabelQUERYFeeder)
        .feed(generateOrderLabelPATHFeeder)
        .exec(http("generateOrderLabel")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}/delivery/shipments/${shipmentId}/boxes/${boxId}/label")
        .queryParam("format","${format}")
)

    // Run scngenerateOrderLabel with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateOrderLabel.inject(
        rampUsersPerSec(1) to(generateOrderLabelPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateOrderLabelPerSecond) during(durationSeconds),
        rampUsersPerSec(generateOrderLabelPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerateOrderLabels = scenario("generateOrderLabelsSimulation")
        .feed(generateOrderLabelsQUERYFeeder)
        .feed(generateOrderLabelsPATHFeeder)
        .exec(http("generateOrderLabels")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}/delivery/labels")
        .queryParam("format","${format}")
)

    // Run scngenerateOrderLabels with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerateOrderLabels.inject(
        rampUsersPerSec(1) to(generateOrderLabelsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generateOrderLabelsPerSecond) during(durationSeconds),
        rampUsersPerSec(generateOrderLabelsPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetAllOffers = scenario("getAllOffersSimulation")
        .feed(getAllOffersQUERYFeeder)
        .feed(getAllOffersPATHFeeder)
        .exec(http("getAllOffers")
        .httpRequest("GET","/campaigns/${campaignId}/offers/all")
        .queryParam("feedId","${feedId}")
        .queryParam("chunk","${chunk}")
)

    // Run scngetAllOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAllOffers.inject(
        rampUsersPerSec(1) to(getAllOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAllOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getAllOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetBidsInfoForBusiness = scenario("getBidsInfoForBusinessSimulation")
        .feed(getBidsInfoForBusinessQUERYFeeder)
        .feed(getBidsInfoForBusinessPATHFeeder)
        .exec(http("getBidsInfoForBusiness")
        .httpRequest("POST","/businesses/${businessId}/bids/info")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetBidsInfoForBusiness with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBidsInfoForBusiness.inject(
        rampUsersPerSec(1) to(getBidsInfoForBusinessPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBidsInfoForBusinessPerSecond) during(durationSeconds),
        rampUsersPerSec(getBidsInfoForBusinessPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetBidsRecommendations = scenario("getBidsRecommendationsSimulation")
        .feed(getBidsRecommendationsPATHFeeder)
        .exec(http("getBidsRecommendations")
        .httpRequest("POST","/businesses/${businessId}/bids/recommendations")
)

    // Run scngetBidsRecommendations with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBidsRecommendations.inject(
        rampUsersPerSec(1) to(getBidsRecommendationsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBidsRecommendationsPerSecond) during(durationSeconds),
        rampUsersPerSec(getBidsRecommendationsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetBusinessQuarantineOffers = scenario("getBusinessQuarantineOffersSimulation")
        .feed(getBusinessQuarantineOffersQUERYFeeder)
        .feed(getBusinessQuarantineOffersPATHFeeder)
        .exec(http("getBusinessQuarantineOffers")
        .httpRequest("POST","/businesses/${businessId}/price-quarantine")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetBusinessQuarantineOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBusinessQuarantineOffers.inject(
        rampUsersPerSec(1) to(getBusinessQuarantineOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBusinessQuarantineOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getBusinessQuarantineOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetBusinessSettings = scenario("getBusinessSettingsSimulation")
        .feed(getBusinessSettingsPATHFeeder)
        .exec(http("getBusinessSettings")
        .httpRequest("POST","/businesses/${businessId}/settings")
)

    // Run scngetBusinessSettings with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBusinessSettings.inject(
        rampUsersPerSec(1) to(getBusinessSettingsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBusinessSettingsPerSecond) during(durationSeconds),
        rampUsersPerSec(getBusinessSettingsPerSecond) to(1) during(rampDownSeconds)
    )

    
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

    
    val scngetCampaignOffers = scenario("getCampaignOffersSimulation")
        .feed(getCampaignOffersQUERYFeeder)
        .feed(getCampaignOffersPATHFeeder)
        .exec(http("getCampaignOffers")
        .httpRequest("POST","/campaigns/${campaignId}/offers")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetCampaignOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCampaignOffers.inject(
        rampUsersPerSec(1) to(getCampaignOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCampaignOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getCampaignOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCampaignQuarantineOffers = scenario("getCampaignQuarantineOffersSimulation")
        .feed(getCampaignQuarantineOffersQUERYFeeder)
        .feed(getCampaignQuarantineOffersPATHFeeder)
        .exec(http("getCampaignQuarantineOffers")
        .httpRequest("POST","/campaigns/${campaignId}/price-quarantine")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetCampaignQuarantineOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCampaignQuarantineOffers.inject(
        rampUsersPerSec(1) to(getCampaignQuarantineOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCampaignQuarantineOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getCampaignQuarantineOffersPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetCategoriesMaxSaleQuantum = scenario("getCategoriesMaxSaleQuantumSimulation")
        .exec(http("getCategoriesMaxSaleQuantum")
        .httpRequest("POST","/categories/max-sale-quantum")
)

    // Run scngetCategoriesMaxSaleQuantum with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCategoriesMaxSaleQuantum.inject(
        rampUsersPerSec(1) to(getCategoriesMaxSaleQuantumPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCategoriesMaxSaleQuantumPerSecond) during(durationSeconds),
        rampUsersPerSec(getCategoriesMaxSaleQuantumPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCategoriesTree = scenario("getCategoriesTreeSimulation")
        .exec(http("getCategoriesTree")
        .httpRequest("POST","/categories/tree")
)

    // Run scngetCategoriesTree with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCategoriesTree.inject(
        rampUsersPerSec(1) to(getCategoriesTreePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCategoriesTreePerSecond) during(durationSeconds),
        rampUsersPerSec(getCategoriesTreePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCategoryContentParameters = scenario("getCategoryContentParametersSimulation")
        .feed(getCategoryContentParametersPATHFeeder)
        .exec(http("getCategoryContentParameters")
        .httpRequest("POST","/category/${categoryId}/parameters")
)

    // Run scngetCategoryContentParameters with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCategoryContentParameters.inject(
        rampUsersPerSec(1) to(getCategoryContentParametersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCategoryContentParametersPerSecond) during(durationSeconds),
        rampUsersPerSec(getCategoryContentParametersPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetDeliveryServices = scenario("getDeliveryServicesSimulation")
        .exec(http("getDeliveryServices")
        .httpRequest("GET","/delivery/services")
)

    // Run scngetDeliveryServices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDeliveryServices.inject(
        rampUsersPerSec(1) to(getDeliveryServicesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDeliveryServicesPerSecond) during(durationSeconds),
        rampUsersPerSec(getDeliveryServicesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFeed = scenario("getFeedSimulation")
        .feed(getFeedPATHFeeder)
        .exec(http("getFeed")
        .httpRequest("GET","/campaigns/${campaignId}/feeds/${feedId}")
)

    // Run scngetFeed with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFeed.inject(
        rampUsersPerSec(1) to(getFeedPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFeedPerSecond) during(durationSeconds),
        rampUsersPerSec(getFeedPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFeedIndexLogs = scenario("getFeedIndexLogsSimulation")
        .feed(getFeedIndexLogsQUERYFeeder)
        .feed(getFeedIndexLogsPATHFeeder)
        .exec(http("getFeedIndexLogs")
        .httpRequest("GET","/campaigns/${campaignId}/feeds/${feedId}/index-logs")
        .queryParam("status","${status}")
        .queryParam("published_time_from","${published_time_from}")
        .queryParam("limit","${limit}")
        .queryParam("published_time_to","${published_time_to}")
)

    // Run scngetFeedIndexLogs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFeedIndexLogs.inject(
        rampUsersPerSec(1) to(getFeedIndexLogsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFeedIndexLogsPerSecond) during(durationSeconds),
        rampUsersPerSec(getFeedIndexLogsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFeedbackAndCommentUpdates = scenario("getFeedbackAndCommentUpdatesSimulation")
        .feed(getFeedbackAndCommentUpdatesQUERYFeeder)
        .feed(getFeedbackAndCommentUpdatesPATHFeeder)
        .exec(http("getFeedbackAndCommentUpdates")
        .httpRequest("GET","/campaigns/${campaignId}/feedback/updates")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
        .queryParam("from_date","${from_date}")
)

    // Run scngetFeedbackAndCommentUpdates with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFeedbackAndCommentUpdates.inject(
        rampUsersPerSec(1) to(getFeedbackAndCommentUpdatesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFeedbackAndCommentUpdatesPerSecond) during(durationSeconds),
        rampUsersPerSec(getFeedbackAndCommentUpdatesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFeeds = scenario("getFeedsSimulation")
        .feed(getFeedsPATHFeeder)
        .exec(http("getFeeds")
        .httpRequest("GET","/campaigns/${campaignId}/feeds")
)

    // Run scngetFeeds with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFeeds.inject(
        rampUsersPerSec(1) to(getFeedsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFeedsPerSecond) during(durationSeconds),
        rampUsersPerSec(getFeedsPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetGoodsStats = scenario("getGoodsStatsSimulation")
        .feed(getGoodsStatsPATHFeeder)
        .exec(http("getGoodsStats")
        .httpRequest("POST","/campaigns/${campaignId}/stats/skus")
)

    // Run scngetGoodsStats with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetGoodsStats.inject(
        rampUsersPerSec(1) to(getGoodsStatsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getGoodsStatsPerSecond) during(durationSeconds),
        rampUsersPerSec(getGoodsStatsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetHiddenOffers = scenario("getHiddenOffersSimulation")
        .feed(getHiddenOffersQUERYFeeder)
        .feed(getHiddenOffersPATHFeeder)
        .exec(http("getHiddenOffers")
        .httpRequest("GET","/campaigns/${campaignId}/hidden-offers")
        .queryParam("offer_id","${offer_id}")
        .queryParam("page_token","${page_token}")
        .queryParam("offset","${offset}")
        .queryParam("pageSize","${pageSize}")
        .queryParam("limit","${limit}")
        .queryParam("page","${page}")
)

    // Run scngetHiddenOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetHiddenOffers.inject(
        rampUsersPerSec(1) to(getHiddenOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getHiddenOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getHiddenOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOfferCardsContentStatus = scenario("getOfferCardsContentStatusSimulation")
        .feed(getOfferCardsContentStatusQUERYFeeder)
        .feed(getOfferCardsContentStatusPATHFeeder)
        .exec(http("getOfferCardsContentStatus")
        .httpRequest("POST","/businesses/${businessId}/offer-cards")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetOfferCardsContentStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOfferCardsContentStatus.inject(
        rampUsersPerSec(1) to(getOfferCardsContentStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOfferCardsContentStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(getOfferCardsContentStatusPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOfferMappingEntries = scenario("getOfferMappingEntriesSimulation")
        .feed(getOfferMappingEntriesQUERYFeeder)
        .feed(getOfferMappingEntriesPATHFeeder)
        .exec(http("getOfferMappingEntries")
        .httpRequest("GET","/campaigns/${campaignId}/offer-mapping-entries")
        .queryParam("page_token","${page_token}")
        .queryParam("availability","${availability}")
        .queryParam("shop_sku","${shop_sku}")
        .queryParam("status","${status}")
        .queryParam("limit","${limit}")
        .queryParam("category_id","${category_id}")
        .queryParam("mapping_kind","${mapping_kind}")
        .queryParam("offer_id","${offer_id}")
        .queryParam("vendor","${vendor}")
)

    // Run scngetOfferMappingEntries with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOfferMappingEntries.inject(
        rampUsersPerSec(1) to(getOfferMappingEntriesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOfferMappingEntriesPerSecond) during(durationSeconds),
        rampUsersPerSec(getOfferMappingEntriesPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetOfferRecommendations = scenario("getOfferRecommendationsSimulation")
        .feed(getOfferRecommendationsQUERYFeeder)
        .feed(getOfferRecommendationsPATHFeeder)
        .exec(http("getOfferRecommendations")
        .httpRequest("POST","/businesses/${businessId}/offers/recommendations")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetOfferRecommendations with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOfferRecommendations.inject(
        rampUsersPerSec(1) to(getOfferRecommendationsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOfferRecommendationsPerSecond) during(durationSeconds),
        rampUsersPerSec(getOfferRecommendationsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOffers = scenario("getOffersSimulation")
        .feed(getOffersQUERYFeeder)
        .feed(getOffersPATHFeeder)
        .exec(http("getOffers")
        .httpRequest("GET","/campaigns/${campaignId}/offers")
        .queryParam("pageSize","${pageSize}")
        .queryParam("feedId","${feedId}")
        .queryParam("currency","${currency}")
        .queryParam("matched","${matched}")
        .queryParam("shopCategoryId","${shopCategoryId}")
        .queryParam("query","${query}")
        .queryParam("page","${page}")
)

    // Run scngetOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOffers.inject(
        rampUsersPerSec(1) to(getOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getOffersPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetOrderBusinessBuyerInfo = scenario("getOrderBusinessBuyerInfoSimulation")
        .feed(getOrderBusinessBuyerInfoPATHFeeder)
        .exec(http("getOrderBusinessBuyerInfo")
        .httpRequest("POST","/campaigns/${campaignId}/orders/${orderId}/business-buyer")
)

    // Run scngetOrderBusinessBuyerInfo with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOrderBusinessBuyerInfo.inject(
        rampUsersPerSec(1) to(getOrderBusinessBuyerInfoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOrderBusinessBuyerInfoPerSecond) during(durationSeconds),
        rampUsersPerSec(getOrderBusinessBuyerInfoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOrderBusinessDocumentsInfo = scenario("getOrderBusinessDocumentsInfoSimulation")
        .feed(getOrderBusinessDocumentsInfoPATHFeeder)
        .exec(http("getOrderBusinessDocumentsInfo")
        .httpRequest("POST","/campaigns/${campaignId}/orders/${orderId}/documents")
)

    // Run scngetOrderBusinessDocumentsInfo with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOrderBusinessDocumentsInfo.inject(
        rampUsersPerSec(1) to(getOrderBusinessDocumentsInfoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOrderBusinessDocumentsInfoPerSecond) during(durationSeconds),
        rampUsersPerSec(getOrderBusinessDocumentsInfoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOrderLabelsData = scenario("getOrderLabelsDataSimulation")
        .feed(getOrderLabelsDataPATHFeeder)
        .exec(http("getOrderLabelsData")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}/delivery/labels/data")
)

    // Run scngetOrderLabelsData with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOrderLabelsData.inject(
        rampUsersPerSec(1) to(getOrderLabelsDataPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOrderLabelsDataPerSecond) during(durationSeconds),
        rampUsersPerSec(getOrderLabelsDataPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetOrdersStats = scenario("getOrdersStatsSimulation")
        .feed(getOrdersStatsQUERYFeeder)
        .feed(getOrdersStatsPATHFeeder)
        .exec(http("getOrdersStats")
        .httpRequest("POST","/campaigns/${campaignId}/stats/orders")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetOrdersStats with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOrdersStats.inject(
        rampUsersPerSec(1) to(getOrdersStatsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOrdersStatsPerSecond) during(durationSeconds),
        rampUsersPerSec(getOrdersStatsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPrices = scenario("getPricesSimulation")
        .feed(getPricesQUERYFeeder)
        .feed(getPricesPATHFeeder)
        .exec(http("getPrices")
        .httpRequest("GET","/campaigns/${campaignId}/offer-prices")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
        .queryParam("archived","${archived}")
)

    // Run scngetPrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPrices.inject(
        rampUsersPerSec(1) to(getPricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPricesPerSecond) during(durationSeconds),
        rampUsersPerSec(getPricesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPricesByOfferIds = scenario("getPricesByOfferIdsSimulation")
        .feed(getPricesByOfferIdsQUERYFeeder)
        .feed(getPricesByOfferIdsPATHFeeder)
        .exec(http("getPricesByOfferIds")
        .httpRequest("POST","/campaigns/${campaignId}/offer-prices")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetPricesByOfferIds with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPricesByOfferIds.inject(
        rampUsersPerSec(1) to(getPricesByOfferIdsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPricesByOfferIdsPerSecond) during(durationSeconds),
        rampUsersPerSec(getPricesByOfferIdsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPromoOffers = scenario("getPromoOffersSimulation")
        .feed(getPromoOffersQUERYFeeder)
        .feed(getPromoOffersPATHFeeder)
        .exec(http("getPromoOffers")
        .httpRequest("POST","/businesses/${businessId}/promos/offers")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetPromoOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPromoOffers.inject(
        rampUsersPerSec(1) to(getPromoOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPromoOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(getPromoOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPromos = scenario("getPromosSimulation")
        .feed(getPromosPATHFeeder)
        .exec(http("getPromos")
        .httpRequest("POST","/businesses/${businessId}/promos")
)

    // Run scngetPromos with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPromos.inject(
        rampUsersPerSec(1) to(getPromosPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPromosPerSecond) during(durationSeconds),
        rampUsersPerSec(getPromosPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetQualityRatingDetails = scenario("getQualityRatingDetailsSimulation")
        .feed(getQualityRatingDetailsPATHFeeder)
        .exec(http("getQualityRatingDetails")
        .httpRequest("POST","/campaigns/${campaignId}/ratings/quality/details")
)

    // Run scngetQualityRatingDetails with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetQualityRatingDetails.inject(
        rampUsersPerSec(1) to(getQualityRatingDetailsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getQualityRatingDetailsPerSecond) during(durationSeconds),
        rampUsersPerSec(getQualityRatingDetailsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetQualityRatings = scenario("getQualityRatingsSimulation")
        .feed(getQualityRatingsPATHFeeder)
        .exec(http("getQualityRatings")
        .httpRequest("POST","/businesses/${businessId}/ratings/quality")
)

    // Run scngetQualityRatings with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetQualityRatings.inject(
        rampUsersPerSec(1) to(getQualityRatingsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getQualityRatingsPerSecond) during(durationSeconds),
        rampUsersPerSec(getQualityRatingsPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetReturn = scenario("getReturnSimulation")
        .feed(getReturnPATHFeeder)
        .exec(http("getReturn")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}")
)

    // Run scngetReturn with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetReturn.inject(
        rampUsersPerSec(1) to(getReturnPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getReturnPerSecond) during(durationSeconds),
        rampUsersPerSec(getReturnPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetReturnApplication = scenario("getReturnApplicationSimulation")
        .feed(getReturnApplicationPATHFeeder)
        .exec(http("getReturnApplication")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/application")
)

    // Run scngetReturnApplication with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetReturnApplication.inject(
        rampUsersPerSec(1) to(getReturnApplicationPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getReturnApplicationPerSecond) during(durationSeconds),
        rampUsersPerSec(getReturnApplicationPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetReturnPhoto = scenario("getReturnPhotoSimulation")
        .feed(getReturnPhotoPATHFeeder)
        .exec(http("getReturnPhoto")
        .httpRequest("GET","/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision/${itemId}/image/${imageHash}")
)

    // Run scngetReturnPhoto with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetReturnPhoto.inject(
        rampUsersPerSec(1) to(getReturnPhotoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getReturnPhotoPerSecond) during(durationSeconds),
        rampUsersPerSec(getReturnPhotoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetReturns = scenario("getReturnsSimulation")
        .feed(getReturnsQUERYFeeder)
        .feed(getReturnsPATHFeeder)
        .exec(http("getReturns")
        .httpRequest("GET","/campaigns/${campaignId}/returns")
        .queryParam("page_token","${page_token}")
        .queryParam("type","${type}")
        .queryParam("orderIds","${orderIds}")
        .queryParam("from_date","${from_date}")
        .queryParam("fromDate","${fromDate}")
        .queryParam("to_date","${to_date}")
        .queryParam("limit","${limit}")
        .queryParam("toDate","${toDate}")
        .queryParam("statuses","${statuses}")
)

    // Run scngetReturns with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetReturns.inject(
        rampUsersPerSec(1) to(getReturnsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getReturnsPerSecond) during(durationSeconds),
        rampUsersPerSec(getReturnsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetStocks = scenario("getStocksSimulation")
        .feed(getStocksQUERYFeeder)
        .feed(getStocksPATHFeeder)
        .exec(http("getStocks")
        .httpRequest("POST","/campaigns/${campaignId}/offers/stocks")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
)

    // Run scngetStocks with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetStocks.inject(
        rampUsersPerSec(1) to(getStocksPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getStocksPerSecond) during(durationSeconds),
        rampUsersPerSec(getStocksPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetSuggestedOfferMappingEntries = scenario("getSuggestedOfferMappingEntriesSimulation")
        .feed(getSuggestedOfferMappingEntriesPATHFeeder)
        .exec(http("getSuggestedOfferMappingEntries")
        .httpRequest("POST","/campaigns/${campaignId}/offer-mapping-entries/suggestions")
)

    // Run scngetSuggestedOfferMappingEntries with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSuggestedOfferMappingEntries.inject(
        rampUsersPerSec(1) to(getSuggestedOfferMappingEntriesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSuggestedOfferMappingEntriesPerSecond) during(durationSeconds),
        rampUsersPerSec(getSuggestedOfferMappingEntriesPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetSuggestedPrices = scenario("getSuggestedPricesSimulation")
        .feed(getSuggestedPricesPATHFeeder)
        .exec(http("getSuggestedPrices")
        .httpRequest("POST","/campaigns/${campaignId}/offer-prices/suggestions")
)

    // Run scngetSuggestedPrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSuggestedPrices.inject(
        rampUsersPerSec(1) to(getSuggestedPricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSuggestedPricesPerSecond) during(durationSeconds),
        rampUsersPerSec(getSuggestedPricesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetWarehouses = scenario("getWarehousesSimulation")
        .feed(getWarehousesPATHFeeder)
        .exec(http("getWarehouses")
        .httpRequest("GET","/businesses/${businessId}/warehouses")
)

    // Run scngetWarehouses with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetWarehouses.inject(
        rampUsersPerSec(1) to(getWarehousesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getWarehousesPerSecond) during(durationSeconds),
        rampUsersPerSec(getWarehousesPerSecond) to(1) during(rampDownSeconds)
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

    
    val scnputBidsForBusiness = scenario("putBidsForBusinessSimulation")
        .feed(putBidsForBusinessPATHFeeder)
        .exec(http("putBidsForBusiness")
        .httpRequest("PUT","/businesses/${businessId}/bids")
)

    // Run scnputBidsForBusiness with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnputBidsForBusiness.inject(
        rampUsersPerSec(1) to(putBidsForBusinessPerSecond) during(rampUpSeconds),
        constantUsersPerSec(putBidsForBusinessPerSecond) during(durationSeconds),
        rampUsersPerSec(putBidsForBusinessPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnputBidsForCampaign = scenario("putBidsForCampaignSimulation")
        .feed(putBidsForCampaignPATHFeeder)
        .exec(http("putBidsForCampaign")
        .httpRequest("PUT","/campaigns/${campaignId}/bids")
)

    // Run scnputBidsForCampaign with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnputBidsForCampaign.inject(
        rampUsersPerSec(1) to(putBidsForCampaignPerSecond) during(rampUpSeconds),
        constantUsersPerSec(putBidsForCampaignPerSecond) during(durationSeconds),
        rampUsersPerSec(putBidsForCampaignPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnrefreshFeed = scenario("refreshFeedSimulation")
        .feed(refreshFeedPATHFeeder)
        .exec(http("refreshFeed")
        .httpRequest("POST","/campaigns/${campaignId}/feeds/${feedId}/refresh")
)

    // Run scnrefreshFeed with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnrefreshFeed.inject(
        rampUsersPerSec(1) to(refreshFeedPerSecond) during(rampUpSeconds),
        constantUsersPerSec(refreshFeedPerSecond) during(durationSeconds),
        rampUsersPerSec(refreshFeedPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsearchRegionChildren = scenario("searchRegionChildrenSimulation")
        .feed(searchRegionChildrenQUERYFeeder)
        .feed(searchRegionChildrenPATHFeeder)
        .exec(http("searchRegionChildren")
        .httpRequest("GET","/regions/${regionId}/children")
        .queryParam("pageSize","${pageSize}")
        .queryParam("page","${page}")
)

    // Run scnsearchRegionChildren with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsearchRegionChildren.inject(
        rampUsersPerSec(1) to(searchRegionChildrenPerSecond) during(rampUpSeconds),
        constantUsersPerSec(searchRegionChildrenPerSecond) during(durationSeconds),
        rampUsersPerSec(searchRegionChildrenPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsearchRegionsById = scenario("searchRegionsByIdSimulation")
        .feed(searchRegionsByIdPATHFeeder)
        .exec(http("searchRegionsById")
        .httpRequest("GET","/regions/${regionId}")
)

    // Run scnsearchRegionsById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsearchRegionsById.inject(
        rampUsersPerSec(1) to(searchRegionsByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(searchRegionsByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(searchRegionsByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsearchRegionsByName = scenario("searchRegionsByNameSimulation")
        .feed(searchRegionsByNameQUERYFeeder)
        .exec(http("searchRegionsByName")
        .httpRequest("GET","/regions")
        .queryParam("page_token","${page_token}")
        .queryParam("limit","${limit}")
        .queryParam("name","${name}")
)

    // Run scnsearchRegionsByName with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsearchRegionsByName.inject(
        rampUsersPerSec(1) to(searchRegionsByNamePerSecond) during(rampUpSeconds),
        constantUsersPerSec(searchRegionsByNamePerSecond) during(durationSeconds),
        rampUsersPerSec(searchRegionsByNamePerSecond) to(1) during(rampDownSeconds)
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

    
    val scnsetFeedParams = scenario("setFeedParamsSimulation")
        .feed(setFeedParamsPATHFeeder)
        .exec(http("setFeedParams")
        .httpRequest("POST","/campaigns/${campaignId}/feeds/${feedId}/params")
)

    // Run scnsetFeedParams with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsetFeedParams.inject(
        rampUsersPerSec(1) to(setFeedParamsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(setFeedParamsPerSecond) during(durationSeconds),
        rampUsersPerSec(setFeedParamsPerSecond) to(1) during(rampDownSeconds)
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

    
    val scnupdateBusinessPrices = scenario("updateBusinessPricesSimulation")
        .feed(updateBusinessPricesPATHFeeder)
        .exec(http("updateBusinessPrices")
        .httpRequest("POST","/businesses/${businessId}/offer-prices/updates")
)

    // Run scnupdateBusinessPrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateBusinessPrices.inject(
        rampUsersPerSec(1) to(updateBusinessPricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateBusinessPricesPerSecond) during(durationSeconds),
        rampUsersPerSec(updateBusinessPricesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateCampaignOffers = scenario("updateCampaignOffersSimulation")
        .feed(updateCampaignOffersPATHFeeder)
        .exec(http("updateCampaignOffers")
        .httpRequest("POST","/campaigns/${campaignId}/offers/update")
)

    // Run scnupdateCampaignOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateCampaignOffers.inject(
        rampUsersPerSec(1) to(updateCampaignOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateCampaignOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(updateCampaignOffersPerSecond) to(1) during(rampDownSeconds)
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

    
    val scnupdateOfferContent = scenario("updateOfferContentSimulation")
        .feed(updateOfferContentPATHFeeder)
        .exec(http("updateOfferContent")
        .httpRequest("POST","/businesses/${businessId}/offer-cards/update")
)

    // Run scnupdateOfferContent with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateOfferContent.inject(
        rampUsersPerSec(1) to(updateOfferContentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateOfferContentPerSecond) during(durationSeconds),
        rampUsersPerSec(updateOfferContentPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateOfferMappingEntries = scenario("updateOfferMappingEntriesSimulation")
        .feed(updateOfferMappingEntriesPATHFeeder)
        .exec(http("updateOfferMappingEntries")
        .httpRequest("POST","/campaigns/${campaignId}/offer-mapping-entries/updates")
)

    // Run scnupdateOfferMappingEntries with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateOfferMappingEntries.inject(
        rampUsersPerSec(1) to(updateOfferMappingEntriesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateOfferMappingEntriesPerSecond) during(durationSeconds),
        rampUsersPerSec(updateOfferMappingEntriesPerSecond) to(1) during(rampDownSeconds)
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

    
    val scnupdatePrices = scenario("updatePricesSimulation")
        .feed(updatePricesPATHFeeder)
        .exec(http("updatePrices")
        .httpRequest("POST","/campaigns/${campaignId}/offer-prices/updates")
)

    // Run scnupdatePrices with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdatePrices.inject(
        rampUsersPerSec(1) to(updatePricesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updatePricesPerSecond) during(durationSeconds),
        rampUsersPerSec(updatePricesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdatePromoOffers = scenario("updatePromoOffersSimulation")
        .feed(updatePromoOffersPATHFeeder)
        .exec(http("updatePromoOffers")
        .httpRequest("POST","/businesses/${businessId}/promos/offers/update")
)

    // Run scnupdatePromoOffers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdatePromoOffers.inject(
        rampUsersPerSec(1) to(updatePromoOffersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updatePromoOffersPerSecond) during(durationSeconds),
        rampUsersPerSec(updatePromoOffersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateStocks = scenario("updateStocksSimulation")
        .feed(updateStocksPATHFeeder)
        .exec(http("updateStocks")
        .httpRequest("PUT","/campaigns/${campaignId}/offers/stocks")
)

    // Run scnupdateStocks with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateStocks.inject(
        rampUsersPerSec(1) to(updateStocksPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateStocksPerSecond) during(durationSeconds),
        rampUsersPerSec(updateStocksPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnverifyOrderEac = scenario("verifyOrderEacSimulation")
        .feed(verifyOrderEacPATHFeeder)
        .exec(http("verifyOrderEac")
        .httpRequest("PUT","/campaigns/${campaignId}/orders/${orderId}/verifyEac")
)

    // Run scnverifyOrderEac with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnverifyOrderEac.inject(
        rampUsersPerSec(1) to(verifyOrderEacPerSecond) during(rampUpSeconds),
        constantUsersPerSec(verifyOrderEacPerSecond) during(durationSeconds),
        rampUsersPerSec(verifyOrderEacPerSecond) to(1) during(rampDownSeconds)
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
