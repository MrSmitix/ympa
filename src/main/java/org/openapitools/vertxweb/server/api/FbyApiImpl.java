package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AddHiddenOffersRequest;
import org.openapitools.vertxweb.server.model.AddOffersToArchiveRequest;
import org.openapitools.vertxweb.server.model.AddOffersToArchiveResponse;
import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.CalculateTariffsRequest;
import org.openapitools.vertxweb.server.model.CalculateTariffsResponse;
import org.openapitools.vertxweb.server.model.ConfirmPricesRequest;
import org.openapitools.vertxweb.server.model.CreateChatRequest;
import org.openapitools.vertxweb.server.model.CreateChatResponse;
import org.openapitools.vertxweb.server.model.CurrencyType;
import org.openapitools.vertxweb.server.model.DeleteCampaignOffersRequest;
import org.openapitools.vertxweb.server.model.DeleteCampaignOffersResponse;
import org.openapitools.vertxweb.server.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.vertxweb.server.model.DeleteHiddenOffersRequest;
import org.openapitools.vertxweb.server.model.DeleteOffersFromArchiveRequest;
import org.openapitools.vertxweb.server.model.DeleteOffersFromArchiveResponse;
import org.openapitools.vertxweb.server.model.DeleteOffersRequest;
import org.openapitools.vertxweb.server.model.DeleteOffersResponse;
import org.openapitools.vertxweb.server.model.DeletePromoOffersRequest;
import org.openapitools.vertxweb.server.model.DeletePromoOffersResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.FeedIndexLogsStatusType;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.GenerateBoostConsolidatedRequest;
import org.openapitools.vertxweb.server.model.GenerateCompetitorsPositionReportRequest;
import org.openapitools.vertxweb.server.model.GenerateGoodsFeedbackRequest;
import org.openapitools.vertxweb.server.model.GenerateGoodsMovementReportRequest;
import org.openapitools.vertxweb.server.model.GenerateGoodsRealizationReportRequest;
import org.openapitools.vertxweb.server.model.GenerateGoodsTurnoverRequest;
import org.openapitools.vertxweb.server.model.GeneratePricesReportRequest;
import org.openapitools.vertxweb.server.model.GenerateReportResponse;
import org.openapitools.vertxweb.server.model.GenerateShelfsStatisticsRequest;
import org.openapitools.vertxweb.server.model.GenerateShowsSalesReportRequest;
import org.openapitools.vertxweb.server.model.GenerateStocksOnWarehousesReportRequest;
import org.openapitools.vertxweb.server.model.GenerateUnitedMarketplaceServicesReportRequest;
import org.openapitools.vertxweb.server.model.GenerateUnitedNettingReportRequest;
import org.openapitools.vertxweb.server.model.GenerateUnitedOrdersRequest;
import org.openapitools.vertxweb.server.model.GetAllOffersResponse;
import org.openapitools.vertxweb.server.model.GetBidsInfoRequest;
import org.openapitools.vertxweb.server.model.GetBidsInfoResponse;
import org.openapitools.vertxweb.server.model.GetBidsRecommendationsRequest;
import org.openapitools.vertxweb.server.model.GetBidsRecommendationsResponse;
import org.openapitools.vertxweb.server.model.GetBusinessBuyerInfoResponse;
import org.openapitools.vertxweb.server.model.GetBusinessDocumentsInfoResponse;
import org.openapitools.vertxweb.server.model.GetBusinessSettingsResponse;
import org.openapitools.vertxweb.server.model.GetCampaignLoginsResponse;
import org.openapitools.vertxweb.server.model.GetCampaignOffersRequest;
import org.openapitools.vertxweb.server.model.GetCampaignOffersResponse;
import org.openapitools.vertxweb.server.model.GetCampaignRegionResponse;
import org.openapitools.vertxweb.server.model.GetCampaignResponse;
import org.openapitools.vertxweb.server.model.GetCampaignSettingsResponse;
import org.openapitools.vertxweb.server.model.GetCampaignsResponse;
import org.openapitools.vertxweb.server.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.vertxweb.server.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.vertxweb.server.model.GetCategoriesRequest;
import org.openapitools.vertxweb.server.model.GetCategoriesResponse;
import org.openapitools.vertxweb.server.model.GetCategoryContentParametersResponse;
import org.openapitools.vertxweb.server.model.GetChatHistoryRequest;
import org.openapitools.vertxweb.server.model.GetChatHistoryResponse;
import org.openapitools.vertxweb.server.model.GetChatsRequest;
import org.openapitools.vertxweb.server.model.GetChatsResponse;
import org.openapitools.vertxweb.server.model.GetFeedIndexLogsResponse;
import org.openapitools.vertxweb.server.model.GetFeedResponse;
import org.openapitools.vertxweb.server.model.GetFeedbackListResponse;
import org.openapitools.vertxweb.server.model.GetFeedsResponse;
import org.openapitools.vertxweb.server.model.GetFulfillmentWarehousesResponse;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackRequest;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackResponse;
import org.openapitools.vertxweb.server.model.GetGoodsStatsRequest;
import org.openapitools.vertxweb.server.model.GetGoodsStatsResponse;
import org.openapitools.vertxweb.server.model.GetHiddenOffersResponse;
import org.openapitools.vertxweb.server.model.GetOfferCardsContentStatusRequest;
import org.openapitools.vertxweb.server.model.GetOfferCardsContentStatusResponse;
import org.openapitools.vertxweb.server.model.GetOfferMappingEntriesResponse;
import org.openapitools.vertxweb.server.model.GetOfferMappingsRequest;
import org.openapitools.vertxweb.server.model.GetOfferMappingsResponse;
import org.openapitools.vertxweb.server.model.GetOfferRecommendationsRequest;
import org.openapitools.vertxweb.server.model.GetOfferRecommendationsResponse;
import org.openapitools.vertxweb.server.model.GetOffersResponse;
import org.openapitools.vertxweb.server.model.GetOrderResponse;
import org.openapitools.vertxweb.server.model.GetOrdersResponse;
import org.openapitools.vertxweb.server.model.GetOrdersStatsRequest;
import org.openapitools.vertxweb.server.model.GetOrdersStatsResponse;
import org.openapitools.vertxweb.server.model.GetPricesByOfferIdsRequest;
import org.openapitools.vertxweb.server.model.GetPricesByOfferIdsResponse;
import org.openapitools.vertxweb.server.model.GetPricesResponse;
import org.openapitools.vertxweb.server.model.GetPromoOffersRequest;
import org.openapitools.vertxweb.server.model.GetPromoOffersResponse;
import org.openapitools.vertxweb.server.model.GetPromosRequest;
import org.openapitools.vertxweb.server.model.GetPromosResponse;
import org.openapitools.vertxweb.server.model.GetQualityRatingRequest;
import org.openapitools.vertxweb.server.model.GetQualityRatingResponse;
import org.openapitools.vertxweb.server.model.GetQuarantineOffersRequest;
import org.openapitools.vertxweb.server.model.GetQuarantineOffersResponse;
import org.openapitools.vertxweb.server.model.GetRegionWithChildrenResponse;
import org.openapitools.vertxweb.server.model.GetRegionsResponse;
import org.openapitools.vertxweb.server.model.GetReportInfoResponse;
import org.openapitools.vertxweb.server.model.GetReturnResponse;
import org.openapitools.vertxweb.server.model.GetReturnsResponse;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingEntriesResponse;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.vertxweb.server.model.GetWarehouseStocksRequest;
import org.openapitools.vertxweb.server.model.GetWarehouseStocksResponse;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.OfferAvailabilityStatusType;
import org.openapitools.vertxweb.server.model.OfferMappingKindType;
import org.openapitools.vertxweb.server.model.OfferProcessingStatusType;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.OrderBuyerType;
import org.openapitools.vertxweb.server.model.OrderDeliveryDispatchType;
import org.openapitools.vertxweb.server.model.OrderStatusType;
import org.openapitools.vertxweb.server.model.OrderSubstatusType;
import org.openapitools.vertxweb.server.model.PutSkuBidsRequest;
import org.openapitools.vertxweb.server.model.RefundStatusType;
import org.openapitools.vertxweb.server.model.ReportFormatType;
import org.openapitools.vertxweb.server.model.ReturnType;
import org.openapitools.vertxweb.server.model.SendMessageToChatRequest;
import java.util.Set;
import org.openapitools.vertxweb.server.model.SetFeedParamsRequest;
import org.openapitools.vertxweb.server.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.vertxweb.server.model.SuggestPricesRequest;
import org.openapitools.vertxweb.server.model.SuggestPricesResponse;
import org.openapitools.vertxweb.server.model.UpdateBusinessPricesRequest;
import org.openapitools.vertxweb.server.model.UpdateCampaignOffersRequest;
import org.openapitools.vertxweb.server.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.vertxweb.server.model.UpdateGoodsFeedbackCommentResponse;
import org.openapitools.vertxweb.server.model.UpdateOfferContentRequest;
import org.openapitools.vertxweb.server.model.UpdateOfferContentResponse;
import org.openapitools.vertxweb.server.model.UpdateOfferMappingEntryRequest;
import org.openapitools.vertxweb.server.model.UpdateOfferMappingsRequest;
import org.openapitools.vertxweb.server.model.UpdateOfferMappingsResponse;
import org.openapitools.vertxweb.server.model.UpdatePricesRequest;
import org.openapitools.vertxweb.server.model.UpdatePromoOffersRequest;
import org.openapitools.vertxweb.server.model.UpdatePromoOffersResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class FbyApiImpl implements FbyApi {
    public Future<ApiResponse<EmptyApiResponse>> addHiddenOffers(Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AddOffersToArchiveResponse>> addOffersToArchive(Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CalculateTariffsResponse>> calculateTariffs(CalculateTariffsRequest calculateTariffsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> confirmBusinessPrices(Long businessId, ConfirmPricesRequest confirmPricesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> confirmCampaignPrices(Long campaignId, ConfirmPricesRequest confirmPricesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateChatResponse>> createChat(Long businessId, CreateChatRequest createChatRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteCampaignOffersResponse>> deleteCampaignOffers(Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> deleteGoodsFeedbackComment(Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> deleteHiddenOffers(Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteOffersResponse>> deleteOffers(Long businessId, DeleteOffersRequest deleteOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteOffersFromArchiveResponse>> deleteOffersFromArchive(Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeletePromoOffersResponse>> deletePromoOffers(Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateGoodsMovementReport(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generatePricesReport(GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateShowsSalesReport(GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateUnitedNettingReport(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerateReportResponse>> generateUnitedOrdersReport(GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetAllOffersResponse>> getAllOffers(Long campaignId, Long feedId, Integer chunk) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetBidsInfoResponse>> getBidsInfoForBusiness(Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetBidsRecommendationsResponse>> getBidsRecommendations(Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetQuarantineOffersResponse>> getBusinessQuarantineOffers(Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetBusinessSettingsResponse>> getBusinessSettings(Long businessId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignResponse>> getCampaign(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignLoginsResponse>> getCampaignLogins(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignOffersResponse>> getCampaignOffers(Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetQuarantineOffersResponse>> getCampaignQuarantineOffers(Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignRegionResponse>> getCampaignRegion(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignSettingsResponse>> getCampaignSettings(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignsResponse>> getCampaigns(Integer page, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignsResponse>> getCampaignsByLogin(String login, Integer page, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCategoriesMaxSaleQuantumResponse>> getCategoriesMaxSaleQuantum(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCategoriesResponse>> getCategoriesTree(GetCategoriesRequest getCategoriesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCategoryContentParametersResponse>> getCategoryContentParameters(Long categoryId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetChatHistoryResponse>> getChatHistory(Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetChatsResponse>> getChats(Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetFeedResponse>> getFeed(Long campaignId, Long feedId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetFeedIndexLogsResponse>> getFeedIndexLogs(Long campaignId, Long feedId, Integer limit, OffsetDateTime publishedTimeFrom, OffsetDateTime publishedTimeTo, FeedIndexLogsStatusType status) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetFeedbackListResponse>> getFeedbackAndCommentUpdates(Long campaignId, String pageToken, Integer limit, LocalDate fromDate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetFeedsResponse>> getFeeds(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetFulfillmentWarehousesResponse>> getFulfillmentWarehouses() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetGoodsFeedbackCommentsResponse>> getGoodsFeedbackComments(Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetGoodsFeedbackResponse>> getGoodsFeedbacks(Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetGoodsStatsResponse>> getGoodsStats(Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetHiddenOffersResponse>> getHiddenOffers(Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOfferCardsContentStatusResponse>> getOfferCardsContentStatus(Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOfferMappingEntriesResponse>> getOfferMappingEntries(Long campaignId, List<String> offerId, List<String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOfferMappingsResponse>> getOfferMappings(Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOfferRecommendationsResponse>> getOfferRecommendations(Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOffersResponse>> getOffers(Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOrderResponse>> getOrder(Long campaignId, Long orderId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetBusinessBuyerInfoResponse>> getOrderBusinessBuyerInfo(Long campaignId, Long orderId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetBusinessDocumentsInfoResponse>> getOrderBusinessDocumentsInfo(Long campaignId, Long orderId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOrdersResponse>> getOrders(Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, LocalDate fromDate, LocalDate toDate, LocalDate supplierShipmentDateFrom, LocalDate supplierShipmentDateTo, OffsetDateTime updatedAtFrom, OffsetDateTime updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOrdersStatsResponse>> getOrdersStats(Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetPricesResponse>> getPrices(Long campaignId, String pageToken, Integer limit, Boolean archived) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetPricesByOfferIdsResponse>> getPricesByOfferIds(Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetPromoOffersResponse>> getPromoOffers(Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetPromosResponse>> getPromos(Long businessId, GetPromosRequest getPromosRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetQualityRatingResponse>> getQualityRatings(Long businessId, GetQualityRatingRequest getQualityRatingRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetReportInfoResponse>> getReportInfo(String reportId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetReturnResponse>> getReturn(Long campaignId, Long orderId, Long returnId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FileUpload>> getReturnPhoto(Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetReturnsResponse>> getReturns(Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetWarehouseStocksResponse>> getStocks(Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetSuggestedOfferMappingEntriesResponse>> getSuggestedOfferMappingEntries(Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetSuggestedOfferMappingsResponse>> getSuggestedOfferMappings(Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<SuggestPricesResponse>> getSuggestedPrices(Long campaignId, SuggestPricesRequest suggestPricesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> putBidsForBusiness(Long businessId, PutSkuBidsRequest putSkuBidsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> putBidsForCampaign(Long campaignId, PutSkuBidsRequest putSkuBidsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> refreshFeed(Long campaignId, Long feedId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetRegionWithChildrenResponse>> searchRegionChildren(Long regionId, Integer page, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetRegionsResponse>> searchRegionsById(Long regionId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetRegionsResponse>> searchRegionsByName(String name, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> sendFileToChat(Long businessId, Long chatId, FileUpload _file) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> sendMessageToChat(Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> setFeedParams(Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> skipGoodsFeedbacksReaction(Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> updateBusinessPrices(Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> updateCampaignOffers(Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateGoodsFeedbackCommentResponse>> updateGoodsFeedbackComment(Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateOfferContentResponse>> updateOfferContent(Long businessId, UpdateOfferContentRequest updateOfferContentRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> updateOfferMappingEntries(Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateOfferMappingsResponse>> updateOfferMappings(Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> updatePrices(Long campaignId, UpdatePricesRequest updatePricesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdatePromoOffersResponse>> updatePromoOffers(Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
