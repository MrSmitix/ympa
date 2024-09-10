package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AddHiddenOffersRequest;
import org.openapitools.server.api.model.AddOffersToArchiveRequest;
import org.openapitools.server.api.model.AddOffersToArchiveResponse;
import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.CalculateTariffsRequest;
import org.openapitools.server.api.model.CalculateTariffsResponse;
import org.openapitools.server.api.model.ConfirmPricesRequest;
import org.openapitools.server.api.model.CreateChatRequest;
import org.openapitools.server.api.model.CreateChatResponse;
import org.openapitools.server.api.model.CurrencyType;
import org.openapitools.server.api.model.DeleteCampaignOffersRequest;
import org.openapitools.server.api.model.DeleteCampaignOffersResponse;
import org.openapitools.server.api.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.server.api.model.DeleteHiddenOffersRequest;
import org.openapitools.server.api.model.DeleteOffersFromArchiveRequest;
import org.openapitools.server.api.model.DeleteOffersFromArchiveResponse;
import org.openapitools.server.api.model.DeleteOffersRequest;
import org.openapitools.server.api.model.DeleteOffersResponse;
import org.openapitools.server.api.model.DeletePromoOffersRequest;
import org.openapitools.server.api.model.DeletePromoOffersResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.FeedIndexLogsStatusType;
import java.io.File;
import org.openapitools.server.api.model.GenerateBoostConsolidatedRequest;
import org.openapitools.server.api.model.GenerateCompetitorsPositionReportRequest;
import org.openapitools.server.api.model.GenerateGoodsFeedbackRequest;
import org.openapitools.server.api.model.GenerateGoodsMovementReportRequest;
import org.openapitools.server.api.model.GenerateGoodsRealizationReportRequest;
import org.openapitools.server.api.model.GenerateGoodsTurnoverRequest;
import org.openapitools.server.api.model.GeneratePricesReportRequest;
import org.openapitools.server.api.model.GenerateReportResponse;
import org.openapitools.server.api.model.GenerateShelfsStatisticsRequest;
import org.openapitools.server.api.model.GenerateShowsSalesReportRequest;
import org.openapitools.server.api.model.GenerateStocksOnWarehousesReportRequest;
import org.openapitools.server.api.model.GenerateUnitedMarketplaceServicesReportRequest;
import org.openapitools.server.api.model.GenerateUnitedNettingReportRequest;
import org.openapitools.server.api.model.GenerateUnitedOrdersRequest;
import org.openapitools.server.api.model.GetAllOffersResponse;
import org.openapitools.server.api.model.GetBidsInfoRequest;
import org.openapitools.server.api.model.GetBidsInfoResponse;
import org.openapitools.server.api.model.GetBidsRecommendationsRequest;
import org.openapitools.server.api.model.GetBidsRecommendationsResponse;
import org.openapitools.server.api.model.GetBusinessBuyerInfoResponse;
import org.openapitools.server.api.model.GetBusinessDocumentsInfoResponse;
import org.openapitools.server.api.model.GetBusinessSettingsResponse;
import org.openapitools.server.api.model.GetCampaignLoginsResponse;
import org.openapitools.server.api.model.GetCampaignOffersRequest;
import org.openapitools.server.api.model.GetCampaignOffersResponse;
import org.openapitools.server.api.model.GetCampaignRegionResponse;
import org.openapitools.server.api.model.GetCampaignResponse;
import org.openapitools.server.api.model.GetCampaignSettingsResponse;
import org.openapitools.server.api.model.GetCampaignsResponse;
import org.openapitools.server.api.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.server.api.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.server.api.model.GetCategoriesRequest;
import org.openapitools.server.api.model.GetCategoriesResponse;
import org.openapitools.server.api.model.GetCategoryContentParametersResponse;
import org.openapitools.server.api.model.GetChatHistoryRequest;
import org.openapitools.server.api.model.GetChatHistoryResponse;
import org.openapitools.server.api.model.GetChatsRequest;
import org.openapitools.server.api.model.GetChatsResponse;
import org.openapitools.server.api.model.GetFeedIndexLogsResponse;
import org.openapitools.server.api.model.GetFeedResponse;
import org.openapitools.server.api.model.GetFeedbackListResponse;
import org.openapitools.server.api.model.GetFeedsResponse;
import org.openapitools.server.api.model.GetFulfillmentWarehousesResponse;
import org.openapitools.server.api.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.server.api.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.server.api.model.GetGoodsFeedbackRequest;
import org.openapitools.server.api.model.GetGoodsFeedbackResponse;
import org.openapitools.server.api.model.GetGoodsStatsRequest;
import org.openapitools.server.api.model.GetGoodsStatsResponse;
import org.openapitools.server.api.model.GetHiddenOffersResponse;
import org.openapitools.server.api.model.GetOfferCardsContentStatusRequest;
import org.openapitools.server.api.model.GetOfferCardsContentStatusResponse;
import org.openapitools.server.api.model.GetOfferMappingEntriesResponse;
import org.openapitools.server.api.model.GetOfferMappingsRequest;
import org.openapitools.server.api.model.GetOfferMappingsResponse;
import org.openapitools.server.api.model.GetOfferRecommendationsRequest;
import org.openapitools.server.api.model.GetOfferRecommendationsResponse;
import org.openapitools.server.api.model.GetOffersResponse;
import org.openapitools.server.api.model.GetOrderResponse;
import org.openapitools.server.api.model.GetOrdersResponse;
import org.openapitools.server.api.model.GetOrdersStatsRequest;
import org.openapitools.server.api.model.GetOrdersStatsResponse;
import org.openapitools.server.api.model.GetPricesByOfferIdsRequest;
import org.openapitools.server.api.model.GetPricesByOfferIdsResponse;
import org.openapitools.server.api.model.GetPricesResponse;
import org.openapitools.server.api.model.GetPromoOffersRequest;
import org.openapitools.server.api.model.GetPromoOffersResponse;
import org.openapitools.server.api.model.GetPromosRequest;
import org.openapitools.server.api.model.GetPromosResponse;
import org.openapitools.server.api.model.GetQualityRatingRequest;
import org.openapitools.server.api.model.GetQualityRatingResponse;
import org.openapitools.server.api.model.GetQuarantineOffersRequest;
import org.openapitools.server.api.model.GetQuarantineOffersResponse;
import org.openapitools.server.api.model.GetRegionWithChildrenResponse;
import org.openapitools.server.api.model.GetRegionsResponse;
import org.openapitools.server.api.model.GetReportInfoResponse;
import org.openapitools.server.api.model.GetReturnResponse;
import org.openapitools.server.api.model.GetReturnsResponse;
import org.openapitools.server.api.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.server.api.model.GetSuggestedOfferMappingEntriesResponse;
import org.openapitools.server.api.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.server.api.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.server.api.model.GetWarehouseStocksRequest;
import org.openapitools.server.api.model.GetWarehouseStocksResponse;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OfferAvailabilityStatusType;
import org.openapitools.server.api.model.OfferMappingKindType;
import org.openapitools.server.api.model.OfferProcessingStatusType;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.OrderBuyerType;
import org.openapitools.server.api.model.OrderDeliveryDispatchType;
import org.openapitools.server.api.model.OrderStatusType;
import org.openapitools.server.api.model.OrderSubstatusType;
import org.openapitools.server.api.model.PutSkuBidsRequest;
import org.openapitools.server.api.model.RefundStatusType;
import org.openapitools.server.api.model.ReportFormatType;
import org.openapitools.server.api.model.ReturnType;
import org.openapitools.server.api.model.SendMessageToChatRequest;
import java.util.Set;
import org.openapitools.server.api.model.SetFeedParamsRequest;
import org.openapitools.server.api.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.server.api.model.SuggestPricesRequest;
import org.openapitools.server.api.model.SuggestPricesResponse;
import org.openapitools.server.api.model.UpdateBusinessPricesRequest;
import org.openapitools.server.api.model.UpdateCampaignOffersRequest;
import org.openapitools.server.api.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.server.api.model.UpdateGoodsFeedbackCommentResponse;
import org.openapitools.server.api.model.UpdateOfferContentRequest;
import org.openapitools.server.api.model.UpdateOfferContentResponse;
import org.openapitools.server.api.model.UpdateOfferMappingEntryRequest;
import org.openapitools.server.api.model.UpdateOfferMappingsRequest;
import org.openapitools.server.api.model.UpdateOfferMappingsResponse;
import org.openapitools.server.api.model.UpdatePricesRequest;
import org.openapitools.server.api.model.UpdatePromoOffersRequest;
import org.openapitools.server.api.model.UpdatePromoOffersResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface FbyApi  {
    //addHiddenOffers
    void addHiddenOffers(Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //addOffersToArchive
    void addOffersToArchive(Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest, Handler<AsyncResult<AddOffersToArchiveResponse>> handler);

    //calculateTariffs
    void calculateTariffs(CalculateTariffsRequest calculateTariffsRequest, Handler<AsyncResult<CalculateTariffsResponse>> handler);

    //confirmBusinessPrices
    void confirmBusinessPrices(Long businessId, ConfirmPricesRequest confirmPricesRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //confirmCampaignPrices
    void confirmCampaignPrices(Long campaignId, ConfirmPricesRequest confirmPricesRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //createChat
    void createChat(Long businessId, CreateChatRequest createChatRequest, Handler<AsyncResult<CreateChatResponse>> handler);

    //deleteCampaignOffers
    void deleteCampaignOffers(Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest, Handler<AsyncResult<DeleteCampaignOffersResponse>> handler);

    //deleteGoodsFeedbackComment
    void deleteGoodsFeedbackComment(Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //deleteHiddenOffers
    void deleteHiddenOffers(Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //deleteOffers
    void deleteOffers(Long businessId, DeleteOffersRequest deleteOffersRequest, Handler<AsyncResult<DeleteOffersResponse>> handler);

    //deleteOffersFromArchive
    void deleteOffersFromArchive(Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest, Handler<AsyncResult<DeleteOffersFromArchiveResponse>> handler);

    //deletePromoOffers
    void deletePromoOffers(Long businessId, DeletePromoOffersRequest deletePromoOffersRequest, Handler<AsyncResult<DeletePromoOffersResponse>> handler);

    //generateBoostConsolidatedReport
    void generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateCompetitorsPositionReport
    void generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateGoodsFeedbackReport
    void generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateGoodsMovementReport
    void generateGoodsMovementReport(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateGoodsRealizationReport
    void generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateGoodsTurnoverReport
    void generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generatePricesReport
    void generatePricesReport(GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateShelfsStatisticsReport
    void generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateShowsSalesReport
    void generateShowsSalesReport(GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateStocksOnWarehousesReport
    void generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateUnitedMarketplaceServicesReport
    void generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateUnitedNettingReport
    void generateUnitedNettingReport(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateUnitedOrdersReport
    void generateUnitedOrdersReport(GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //getAllOffers
    void getAllOffers(Long campaignId, Long feedId, Integer chunk, Handler<AsyncResult<GetAllOffersResponse>> handler);

    //getBidsInfoForBusiness
    void getBidsInfoForBusiness(Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest, Handler<AsyncResult<GetBidsInfoResponse>> handler);

    //getBidsRecommendations
    void getBidsRecommendations(Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest, Handler<AsyncResult<GetBidsRecommendationsResponse>> handler);

    //getBusinessQuarantineOffers
    void getBusinessQuarantineOffers(Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, Handler<AsyncResult<GetQuarantineOffersResponse>> handler);

    //getBusinessSettings
    void getBusinessSettings(Long businessId, Handler<AsyncResult<GetBusinessSettingsResponse>> handler);

    //getCampaign
    void getCampaign(Long campaignId, Handler<AsyncResult<GetCampaignResponse>> handler);

    //getCampaignLogins
    void getCampaignLogins(Long campaignId, Handler<AsyncResult<GetCampaignLoginsResponse>> handler);

    //getCampaignOffers
    void getCampaignOffers(Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit, Handler<AsyncResult<GetCampaignOffersResponse>> handler);

    //getCampaignQuarantineOffers
    void getCampaignQuarantineOffers(Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, Handler<AsyncResult<GetQuarantineOffersResponse>> handler);

    //getCampaignRegion
    void getCampaignRegion(Long campaignId, Handler<AsyncResult<GetCampaignRegionResponse>> handler);

    //getCampaignSettings
    void getCampaignSettings(Long campaignId, Handler<AsyncResult<GetCampaignSettingsResponse>> handler);

    //getCampaigns
    void getCampaigns(Integer page, Integer pageSize, Handler<AsyncResult<GetCampaignsResponse>> handler);

    //getCampaignsByLogin
    void getCampaignsByLogin(String login, Integer page, Integer pageSize, Handler<AsyncResult<GetCampaignsResponse>> handler);

    //getCategoriesMaxSaleQuantum
    void getCategoriesMaxSaleQuantum(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest, Handler<AsyncResult<GetCategoriesMaxSaleQuantumResponse>> handler);

    //getCategoriesTree
    void getCategoriesTree(GetCategoriesRequest getCategoriesRequest, Handler<AsyncResult<GetCategoriesResponse>> handler);

    //getCategoryContentParameters
    void getCategoryContentParameters(Long categoryId, Handler<AsyncResult<GetCategoryContentParametersResponse>> handler);

    //getChatHistory
    void getChatHistory(Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit, Handler<AsyncResult<GetChatHistoryResponse>> handler);

    //getChats
    void getChats(Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit, Handler<AsyncResult<GetChatsResponse>> handler);

    //getFeed
    void getFeed(Long campaignId, Long feedId, Handler<AsyncResult<GetFeedResponse>> handler);

    //getFeedIndexLogs
    void getFeedIndexLogs(Long campaignId, Long feedId, Integer limit, OffsetDateTime publishedTimeFrom, OffsetDateTime publishedTimeTo, FeedIndexLogsStatusType status, Handler<AsyncResult<GetFeedIndexLogsResponse>> handler);

    //getFeedbackAndCommentUpdates
    void getFeedbackAndCommentUpdates(Long campaignId, String pageToken, Integer limit, LocalDate fromDate, Handler<AsyncResult<GetFeedbackListResponse>> handler);

    //getFeeds
    void getFeeds(Long campaignId, Handler<AsyncResult<GetFeedsResponse>> handler);

    //getFulfillmentWarehouses
    void getFulfillmentWarehouses(Handler<AsyncResult<GetFulfillmentWarehousesResponse>> handler);

    //getGoodsFeedbackComments
    void getGoodsFeedbackComments(Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit, Handler<AsyncResult<GetGoodsFeedbackCommentsResponse>> handler);

    //getGoodsFeedbacks
    void getGoodsFeedbacks(Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest, Handler<AsyncResult<GetGoodsFeedbackResponse>> handler);

    //getGoodsStats
    void getGoodsStats(Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest, Handler<AsyncResult<GetGoodsStatsResponse>> handler);

    //getHiddenOffers
    void getHiddenOffers(Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize, Handler<AsyncResult<GetHiddenOffersResponse>> handler);

    //getOfferCardsContentStatus
    void getOfferCardsContentStatus(Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest, Handler<AsyncResult<GetOfferCardsContentStatusResponse>> handler);

    //getOfferMappingEntries
    void getOfferMappingEntries(Long campaignId, List<String> offerId, List<String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit, Handler<AsyncResult<GetOfferMappingEntriesResponse>> handler);

    //getOfferMappings
    void getOfferMappings(Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest, Handler<AsyncResult<GetOfferMappingsResponse>> handler);

    //getOfferRecommendations
    void getOfferRecommendations(Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit, Handler<AsyncResult<GetOfferRecommendationsResponse>> handler);

    //getOffers
    void getOffers(Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize, Handler<AsyncResult<GetOffersResponse>> handler);

    //getOrder
    void getOrder(Long campaignId, Long orderId, Handler<AsyncResult<GetOrderResponse>> handler);

    //getOrderBusinessBuyerInfo
    void getOrderBusinessBuyerInfo(Long campaignId, Long orderId, Handler<AsyncResult<GetBusinessBuyerInfoResponse>> handler);

    //getOrderBusinessDocumentsInfo
    void getOrderBusinessDocumentsInfo(Long campaignId, Long orderId, Handler<AsyncResult<GetBusinessDocumentsInfoResponse>> handler);

    //getOrders
    void getOrders(Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, LocalDate fromDate, LocalDate toDate, LocalDate supplierShipmentDateFrom, LocalDate supplierShipmentDateTo, OffsetDateTime updatedAtFrom, OffsetDateTime updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit, Handler<AsyncResult<GetOrdersResponse>> handler);

    //getOrdersStats
    void getOrdersStats(Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest, Handler<AsyncResult<GetOrdersStatsResponse>> handler);

    //getPrices
    void getPrices(Long campaignId, String pageToken, Integer limit, Boolean archived, Handler<AsyncResult<GetPricesResponse>> handler);

    //getPricesByOfferIds
    void getPricesByOfferIds(Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest, Handler<AsyncResult<GetPricesByOfferIdsResponse>> handler);

    //getPromoOffers
    void getPromoOffers(Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit, Handler<AsyncResult<GetPromoOffersResponse>> handler);

    //getPromos
    void getPromos(Long businessId, GetPromosRequest getPromosRequest, Handler<AsyncResult<GetPromosResponse>> handler);

    //getQualityRatings
    void getQualityRatings(Long businessId, GetQualityRatingRequest getQualityRatingRequest, Handler<AsyncResult<GetQualityRatingResponse>> handler);

    //getReportInfo
    void getReportInfo(String reportId, Handler<AsyncResult<GetReportInfoResponse>> handler);

    //getReturn
    void getReturn(Long campaignId, Long orderId, Long returnId, Handler<AsyncResult<GetReturnResponse>> handler);

    //getReturnPhoto
    void getReturnPhoto(Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash, Handler<AsyncResult<File>> handler);

    //getReturns
    void getReturns(Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2, Handler<AsyncResult<GetReturnsResponse>> handler);

    //getStocks
    void getStocks(Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest, Handler<AsyncResult<GetWarehouseStocksResponse>> handler);

    //getSuggestedOfferMappingEntries
    void getSuggestedOfferMappingEntries(Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest, Handler<AsyncResult<GetSuggestedOfferMappingEntriesResponse>> handler);

    //getSuggestedOfferMappings
    void getSuggestedOfferMappings(Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest, Handler<AsyncResult<GetSuggestedOfferMappingsResponse>> handler);

    //getSuggestedPrices
    void getSuggestedPrices(Long campaignId, SuggestPricesRequest suggestPricesRequest, Handler<AsyncResult<SuggestPricesResponse>> handler);

    //putBidsForBusiness
    void putBidsForBusiness(Long businessId, PutSkuBidsRequest putSkuBidsRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //putBidsForCampaign
    void putBidsForCampaign(Long campaignId, PutSkuBidsRequest putSkuBidsRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //refreshFeed
    void refreshFeed(Long campaignId, Long feedId, Handler<AsyncResult<EmptyApiResponse>> handler);

    //searchRegionChildren
    void searchRegionChildren(Long regionId, Integer page, Integer pageSize, Handler<AsyncResult<GetRegionWithChildrenResponse>> handler);

    //searchRegionsById
    void searchRegionsById(Long regionId, Handler<AsyncResult<GetRegionsResponse>> handler);

    //searchRegionsByName
    void searchRegionsByName(String name, String pageToken, Integer limit, Handler<AsyncResult<GetRegionsResponse>> handler);

    //sendFileToChat
    void sendFileToChat(Long businessId, Long chatId, File _file, Handler<AsyncResult<EmptyApiResponse>> handler);

    //sendMessageToChat
    void sendMessageToChat(Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //setFeedParams
    void setFeedParams(Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //skipGoodsFeedbacksReaction
    void skipGoodsFeedbacksReaction(Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //updateBusinessPrices
    void updateBusinessPrices(Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //updateCampaignOffers
    void updateCampaignOffers(Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //updateGoodsFeedbackComment
    void updateGoodsFeedbackComment(Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest, Handler<AsyncResult<UpdateGoodsFeedbackCommentResponse>> handler);

    //updateOfferContent
    void updateOfferContent(Long businessId, UpdateOfferContentRequest updateOfferContentRequest, Handler<AsyncResult<UpdateOfferContentResponse>> handler);

    //updateOfferMappingEntries
    void updateOfferMappingEntries(Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //updateOfferMappings
    void updateOfferMappings(Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest, Handler<AsyncResult<UpdateOfferMappingsResponse>> handler);

    //updatePrices
    void updatePrices(Long campaignId, UpdatePricesRequest updatePricesRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //updatePromoOffers
    void updatePromoOffers(Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest, Handler<AsyncResult<UpdatePromoOffersResponse>> handler);

}
