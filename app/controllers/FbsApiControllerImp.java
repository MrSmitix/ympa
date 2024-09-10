package controllers;

import apimodels.AddHiddenOffersRequest;
import apimodels.AddOffersToArchiveRequest;
import apimodels.AddOffersToArchiveResponse;
import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.CalculateTariffsRequest;
import apimodels.CalculateTariffsResponse;
import apimodels.ConfirmPricesRequest;
import apimodels.ConfirmShipmentRequest;
import apimodels.CreateChatRequest;
import apimodels.CreateChatResponse;
import apimodels.CurrencyType;
import apimodels.DeleteCampaignOffersRequest;
import apimodels.DeleteCampaignOffersResponse;
import apimodels.DeleteGoodsFeedbackCommentRequest;
import apimodels.DeleteHiddenOffersRequest;
import apimodels.DeleteOffersFromArchiveRequest;
import apimodels.DeleteOffersFromArchiveResponse;
import apimodels.DeleteOffersRequest;
import apimodels.DeleteOffersResponse;
import apimodels.DeletePromoOffersRequest;
import apimodels.DeletePromoOffersResponse;
import apimodels.EmptyApiResponse;
import apimodels.FeedIndexLogsStatusType;
import apimodels.GenerateBoostConsolidatedRequest;
import apimodels.GenerateCompetitorsPositionReportRequest;
import apimodels.GenerateGoodsFeedbackRequest;
import apimodels.GenerateGoodsRealizationReportRequest;
import apimodels.GenerateMassOrderLabelsRequest;
import apimodels.GeneratePricesReportRequest;
import apimodels.GenerateReportResponse;
import apimodels.GenerateShelfsStatisticsRequest;
import apimodels.GenerateShipmentListDocumentReportRequest;
import apimodels.GenerateShowsSalesReportRequest;
import apimodels.GenerateStocksOnWarehousesReportRequest;
import apimodels.GenerateUnitedMarketplaceServicesReportRequest;
import apimodels.GenerateUnitedNettingReportRequest;
import apimodels.GenerateUnitedOrdersRequest;
import apimodels.GetAllOffersResponse;
import apimodels.GetBidsInfoRequest;
import apimodels.GetBidsInfoResponse;
import apimodels.GetBidsRecommendationsRequest;
import apimodels.GetBidsRecommendationsResponse;
import apimodels.GetBusinessBuyerInfoResponse;
import apimodels.GetBusinessDocumentsInfoResponse;
import apimodels.GetBusinessSettingsResponse;
import apimodels.GetCampaignLoginsResponse;
import apimodels.GetCampaignOffersRequest;
import apimodels.GetCampaignOffersResponse;
import apimodels.GetCampaignRegionResponse;
import apimodels.GetCampaignResponse;
import apimodels.GetCampaignSettingsResponse;
import apimodels.GetCampaignsResponse;
import apimodels.GetCategoriesMaxSaleQuantumRequest;
import apimodels.GetCategoriesMaxSaleQuantumResponse;
import apimodels.GetCategoriesRequest;
import apimodels.GetCategoriesResponse;
import apimodels.GetCategoryContentParametersResponse;
import apimodels.GetChatHistoryRequest;
import apimodels.GetChatHistoryResponse;
import apimodels.GetChatsRequest;
import apimodels.GetChatsResponse;
import apimodels.GetDeliveryServicesResponse;
import apimodels.GetFeedIndexLogsResponse;
import apimodels.GetFeedResponse;
import apimodels.GetFeedbackListResponse;
import apimodels.GetFeedsResponse;
import apimodels.GetGoodsFeedbackCommentsRequest;
import apimodels.GetGoodsFeedbackCommentsResponse;
import apimodels.GetGoodsFeedbackRequest;
import apimodels.GetGoodsFeedbackResponse;
import apimodels.GetGoodsStatsRequest;
import apimodels.GetGoodsStatsResponse;
import apimodels.GetHiddenOffersResponse;
import apimodels.GetOfferCardsContentStatusRequest;
import apimodels.GetOfferCardsContentStatusResponse;
import apimodels.GetOfferMappingEntriesResponse;
import apimodels.GetOfferMappingsRequest;
import apimodels.GetOfferMappingsResponse;
import apimodels.GetOfferRecommendationsRequest;
import apimodels.GetOfferRecommendationsResponse;
import apimodels.GetOffersResponse;
import apimodels.GetOrderLabelsDataResponse;
import apimodels.GetOrderResponse;
import apimodels.GetOrdersResponse;
import apimodels.GetOrdersStatsRequest;
import apimodels.GetOrdersStatsResponse;
import apimodels.GetPricesByOfferIdsRequest;
import apimodels.GetPricesByOfferIdsResponse;
import apimodels.GetPricesResponse;
import apimodels.GetPromoOffersRequest;
import apimodels.GetPromoOffersResponse;
import apimodels.GetPromosRequest;
import apimodels.GetPromosResponse;
import apimodels.GetQualityRatingDetailsResponse;
import apimodels.GetQualityRatingRequest;
import apimodels.GetQualityRatingResponse;
import apimodels.GetQuarantineOffersRequest;
import apimodels.GetQuarantineOffersResponse;
import apimodels.GetRegionWithChildrenResponse;
import apimodels.GetRegionsResponse;
import apimodels.GetReportInfoResponse;
import apimodels.GetReturnResponse;
import apimodels.GetReturnsResponse;
import apimodels.GetShipmentOrdersInfoResponse;
import apimodels.GetShipmentResponse;
import apimodels.GetSuggestedOfferMappingEntriesRequest;
import apimodels.GetSuggestedOfferMappingEntriesResponse;
import apimodels.GetSuggestedOfferMappingsRequest;
import apimodels.GetSuggestedOfferMappingsResponse;
import apimodels.GetWarehouseStocksRequest;
import apimodels.GetWarehouseStocksResponse;
import apimodels.GetWarehousesResponse;
import java.io.InputStream;
import java.time.LocalDate;
import apimodels.OfferAvailabilityStatusType;
import apimodels.OfferMappingKindType;
import apimodels.OfferProcessingStatusType;
import java.time.OffsetDateTime;
import apimodels.OrderBuyerType;
import apimodels.OrderDeliveryDispatchType;
import apimodels.OrderStatusType;
import apimodels.OrderSubstatusType;
import apimodels.PageFormatType;
import apimodels.ProvideOrderItemIdentifiersRequest;
import apimodels.ProvideOrderItemIdentifiersResponse;
import apimodels.PutSkuBidsRequest;
import apimodels.RefundStatusType;
import apimodels.ReportFormatType;
import apimodels.ReturnType;
import apimodels.SearchShipmentsRequest;
import apimodels.SearchShipmentsResponse;
import apimodels.SendMessageToChatRequest;
import java.util.Set;
import apimodels.SetFeedParamsRequest;
import apimodels.SetOrderBoxLayoutRequest;
import apimodels.SetOrderBoxLayoutResponse;
import apimodels.SetOrderShipmentBoxesRequest;
import apimodels.SetOrderShipmentBoxesResponse;
import apimodels.SetShipmentPalletsCountRequest;
import apimodels.ShipmentPalletLabelPageFormatType;
import apimodels.SkipGoodsFeedbackReactionRequest;
import apimodels.SuggestPricesRequest;
import apimodels.SuggestPricesResponse;
import apimodels.TransferOrdersFromShipmentRequest;
import apimodels.UpdateBusinessPricesRequest;
import apimodels.UpdateCampaignOffersRequest;
import apimodels.UpdateGoodsFeedbackCommentRequest;
import apimodels.UpdateGoodsFeedbackCommentResponse;
import apimodels.UpdateOfferContentRequest;
import apimodels.UpdateOfferContentResponse;
import apimodels.UpdateOfferMappingEntryRequest;
import apimodels.UpdateOfferMappingsRequest;
import apimodels.UpdateOfferMappingsResponse;
import apimodels.UpdateOrderItemRequest;
import apimodels.UpdateOrderStatusRequest;
import apimodels.UpdateOrderStatusResponse;
import apimodels.UpdateOrderStatusesRequest;
import apimodels.UpdateOrderStatusesResponse;
import apimodels.UpdatePricesRequest;
import apimodels.UpdatePromoOffersRequest;
import apimodels.UpdatePromoOffersResponse;
import apimodels.UpdateStocksRequest;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FbsApiControllerImp extends FbsApiControllerImpInterface {
    @Override
    public EmptyApiResponse addHiddenOffers(Http.Request request, Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public AddOffersToArchiveResponse addOffersToArchive(Http.Request request, Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) throws Exception {
        //Do your magic!!!
        return new AddOffersToArchiveResponse();
    }

    @Override
    public CalculateTariffsResponse calculateTariffs(Http.Request request, CalculateTariffsRequest calculateTariffsRequest) throws Exception {
        //Do your magic!!!
        return new CalculateTariffsResponse();
    }

    @Override
    public EmptyApiResponse confirmBusinessPrices(Http.Request request, Long businessId, ConfirmPricesRequest confirmPricesRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse confirmCampaignPrices(Http.Request request, Long campaignId, ConfirmPricesRequest confirmPricesRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse confirmShipment(Http.Request request, Long campaignId, Long shipmentId, ConfirmShipmentRequest confirmShipmentRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public CreateChatResponse createChat(Http.Request request, Long businessId, CreateChatRequest createChatRequest) throws Exception {
        //Do your magic!!!
        return new CreateChatResponse();
    }

    @Override
    public DeleteCampaignOffersResponse deleteCampaignOffers(Http.Request request, Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) throws Exception {
        //Do your magic!!!
        return new DeleteCampaignOffersResponse();
    }

    @Override
    public EmptyApiResponse deleteGoodsFeedbackComment(Http.Request request, Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse deleteHiddenOffers(Http.Request request, Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public DeleteOffersResponse deleteOffers(Http.Request request, Long businessId, DeleteOffersRequest deleteOffersRequest) throws Exception {
        //Do your magic!!!
        return new DeleteOffersResponse();
    }

    @Override
    public DeleteOffersFromArchiveResponse deleteOffersFromArchive(Http.Request request, Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) throws Exception {
        //Do your magic!!!
        return new DeleteOffersFromArchiveResponse();
    }

    @Override
    public DeletePromoOffersResponse deletePromoOffers(Http.Request request, Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) throws Exception {
        //Do your magic!!!
        return new DeletePromoOffersResponse();
    }

    @Override
    public InputStream downloadShipmentAct(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream downloadShipmentDiscrepancyAct(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream downloadShipmentInboundAct(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream downloadShipmentPalletLabels(Http.Request request, Long campaignId, Long shipmentId, ShipmentPalletLabelPageFormatType format) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream downloadShipmentReceptionTransferAct(Http.Request request, Long campaignId, Integer warehouseId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream downloadShipmentTransportationWaybill(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public GenerateReportResponse generateBoostConsolidatedReport(Http.Request request, GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateCompetitorsPositionReport(Http.Request request, GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateGoodsFeedbackReport(Http.Request request, GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateGoodsRealizationReport(Http.Request request, GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateMassOrderLabelsReport(Http.Request request, GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public InputStream generateOrderLabel(Http.Request request, Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream generateOrderLabels(Http.Request request, Long campaignId, Long orderId, PageFormatType format) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public GenerateReportResponse generatePricesReport(Http.Request request, GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateShelfsStatisticsReport(Http.Request request, GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateShipmentListDocumentReport(Http.Request request, GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateShowsSalesReport(Http.Request request, GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateStocksOnWarehousesReport(Http.Request request, GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateUnitedMarketplaceServicesReport(Http.Request request, GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateUnitedNettingReport(Http.Request request, GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateUnitedOrdersReport(Http.Request request, GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GetAllOffersResponse getAllOffers(Http.Request request, Long campaignId, Long feedId, Integer chunk) throws Exception {
        //Do your magic!!!
        return new GetAllOffersResponse();
    }

    @Override
    public GetBidsInfoResponse getBidsInfoForBusiness(Http.Request request, Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) throws Exception {
        //Do your magic!!!
        return new GetBidsInfoResponse();
    }

    @Override
    public GetBidsRecommendationsResponse getBidsRecommendations(Http.Request request, Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) throws Exception {
        //Do your magic!!!
        return new GetBidsRecommendationsResponse();
    }

    @Override
    public GetQuarantineOffersResponse getBusinessQuarantineOffers(Http.Request request, Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetQuarantineOffersResponse();
    }

    @Override
    public GetBusinessSettingsResponse getBusinessSettings(Http.Request request, Long businessId) throws Exception {
        //Do your magic!!!
        return new GetBusinessSettingsResponse();
    }

    @Override
    public GetCampaignResponse getCampaign(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetCampaignResponse();
    }

    @Override
    public GetCampaignLoginsResponse getCampaignLogins(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetCampaignLoginsResponse();
    }

    @Override
    public GetCampaignOffersResponse getCampaignOffers(Http.Request request, Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetCampaignOffersResponse();
    }

    @Override
    public GetQuarantineOffersResponse getCampaignQuarantineOffers(Http.Request request, Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetQuarantineOffersResponse();
    }

    @Override
    public GetCampaignRegionResponse getCampaignRegion(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetCampaignRegionResponse();
    }

    @Override
    public GetCampaignSettingsResponse getCampaignSettings(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetCampaignSettingsResponse();
    }

    @Override
    public GetCampaignsResponse getCampaigns(Http.Request request,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetCampaignsResponse();
    }

    @Override
    public GetCampaignsResponse getCampaignsByLogin(Http.Request request, String login,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetCampaignsResponse();
    }

    @Override
    public GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(Http.Request request, GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) throws Exception {
        //Do your magic!!!
        return new GetCategoriesMaxSaleQuantumResponse();
    }

    @Override
    public GetCategoriesResponse getCategoriesTree(Http.Request request, GetCategoriesRequest getCategoriesRequest) throws Exception {
        //Do your magic!!!
        return new GetCategoriesResponse();
    }

    @Override
    public GetCategoryContentParametersResponse getCategoryContentParameters(Http.Request request, Long categoryId) throws Exception {
        //Do your magic!!!
        return new GetCategoryContentParametersResponse();
    }

    @Override
    public GetChatHistoryResponse getChatHistory(Http.Request request, Long businessId, @NotNull Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetChatHistoryResponse();
    }

    @Override
    public GetChatsResponse getChats(Http.Request request, Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetChatsResponse();
    }

    @Override
    public GetDeliveryServicesResponse getDeliveryServices(Http.Request request) throws Exception {
        //Do your magic!!!
        return new GetDeliveryServicesResponse();
    }

    @Override
    public GetFeedResponse getFeed(Http.Request request, Long campaignId, Long feedId) throws Exception {
        //Do your magic!!!
        return new GetFeedResponse();
    }

    @Override
    public GetFeedIndexLogsResponse getFeedIndexLogs(Http.Request request, Long campaignId, Long feedId, Integer limit, OffsetDateTime publishedTimeFrom, OffsetDateTime publishedTimeTo, FeedIndexLogsStatusType status) throws Exception {
        //Do your magic!!!
        return new GetFeedIndexLogsResponse();
    }

    @Override
    public GetFeedbackListResponse getFeedbackAndCommentUpdates(Http.Request request, Long campaignId, String pageToken, Integer limit, LocalDate fromDate) throws Exception {
        //Do your magic!!!
        return new GetFeedbackListResponse();
    }

    @Override
    public GetFeedsResponse getFeeds(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetFeedsResponse();
    }

    @Override
    public GetGoodsFeedbackCommentsResponse getGoodsFeedbackComments(Http.Request request, Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetGoodsFeedbackCommentsResponse();
    }

    @Override
    public GetGoodsFeedbackResponse getGoodsFeedbacks(Http.Request request, Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) throws Exception {
        //Do your magic!!!
        return new GetGoodsFeedbackResponse();
    }

    @Override
    public GetGoodsStatsResponse getGoodsStats(Http.Request request, Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest) throws Exception {
        //Do your magic!!!
        return new GetGoodsStatsResponse();
    }

    @Override
    public GetHiddenOffersResponse getHiddenOffers(Http.Request request, Long campaignId, List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId, String pageToken, Integer limit, Integer offset,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetHiddenOffersResponse();
    }

    @Override
    public GetOfferCardsContentStatusResponse getOfferCardsContentStatus(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) throws Exception {
        //Do your magic!!!
        return new GetOfferCardsContentStatusResponse();
    }

    @Override
    public GetOfferMappingEntriesResponse getOfferMappingEntries(Http.Request request, Long campaignId, List<String> offerId, List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetOfferMappingEntriesResponse();
    }

    @Override
    public GetOfferMappingsResponse getOfferMappings(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) throws Exception {
        //Do your magic!!!
        return new GetOfferMappingsResponse();
    }

    @Override
    public GetOfferRecommendationsResponse getOfferRecommendations(Http.Request request, Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetOfferRecommendationsResponse();
    }

    @Override
    public GetOffersResponse getOffers(Http.Request request, Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetOffersResponse();
    }

    @Override
    public GetOrderResponse getOrder(Http.Request request, Long campaignId, Long orderId) throws Exception {
        //Do your magic!!!
        return new GetOrderResponse();
    }

    @Override
    public GetBusinessBuyerInfoResponse getOrderBusinessBuyerInfo(Http.Request request, Long campaignId, Long orderId) throws Exception {
        //Do your magic!!!
        return new GetBusinessBuyerInfoResponse();
    }

    @Override
    public GetBusinessDocumentsInfoResponse getOrderBusinessDocumentsInfo(Http.Request request, Long campaignId, Long orderId) throws Exception {
        //Do your magic!!!
        return new GetBusinessDocumentsInfoResponse();
    }

    @Override
    public GetOrderLabelsDataResponse getOrderLabelsData(Http.Request request, Long campaignId, Long orderId) throws Exception {
        //Do your magic!!!
        return new GetOrderLabelsDataResponse();
    }

    @Override
    public GetOrdersResponse getOrders(Http.Request request, Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, LocalDate fromDate, LocalDate toDate, LocalDate supplierShipmentDateFrom, LocalDate supplierShipmentDateTo, OffsetDateTime updatedAtFrom, OffsetDateTime updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType,  @Max(10000)Integer page, Integer pageSize, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetOrdersResponse();
    }

    @Override
    public GetOrdersStatsResponse getOrdersStats(Http.Request request, Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) throws Exception {
        //Do your magic!!!
        return new GetOrdersStatsResponse();
    }

    @Override
    public GetPricesResponse getPrices(Http.Request request, Long campaignId, String pageToken, Integer limit, Boolean archived) throws Exception {
        //Do your magic!!!
        return new GetPricesResponse();
    }

    @Override
    public GetPricesByOfferIdsResponse getPricesByOfferIds(Http.Request request, Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) throws Exception {
        //Do your magic!!!
        return new GetPricesByOfferIdsResponse();
    }

    @Override
    public GetPromoOffersResponse getPromoOffers(Http.Request request, Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetPromoOffersResponse();
    }

    @Override
    public GetPromosResponse getPromos(Http.Request request, Long businessId, GetPromosRequest getPromosRequest) throws Exception {
        //Do your magic!!!
        return new GetPromosResponse();
    }

    @Override
    public GetQualityRatingDetailsResponse getQualityRatingDetails(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetQualityRatingDetailsResponse();
    }

    @Override
    public GetQualityRatingResponse getQualityRatings(Http.Request request, Long businessId, GetQualityRatingRequest getQualityRatingRequest) throws Exception {
        //Do your magic!!!
        return new GetQualityRatingResponse();
    }

    @Override
    public GetReportInfoResponse getReportInfo(Http.Request request, String reportId) throws Exception {
        //Do your magic!!!
        return new GetReportInfoResponse();
    }

    @Override
    public GetReturnResponse getReturn(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        //Do your magic!!!
        return new GetReturnResponse();
    }

    @Override
    public InputStream getReturnApplication(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream getReturnPhoto(Http.Request request, Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public GetReturnsResponse getReturns(Http.Request request, Long campaignId, String pageToken, Integer limit,    @Size(max=50)List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2) throws Exception {
        //Do your magic!!!
        return new GetReturnsResponse();
    }

    @Override
    public GetShipmentResponse getShipment(Http.Request request, Long campaignId, Long shipmentId, Boolean cancelledOrders) throws Exception {
        //Do your magic!!!
        return new GetShipmentResponse();
    }

    @Override
    public GetShipmentOrdersInfoResponse getShipmentOrdersInfo(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        //Do your magic!!!
        return new GetShipmentOrdersInfoResponse();
    }

    @Override
    public GetWarehouseStocksResponse getStocks(Http.Request request, Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) throws Exception {
        //Do your magic!!!
        return new GetWarehouseStocksResponse();
    }

    @Override
    public GetSuggestedOfferMappingEntriesResponse getSuggestedOfferMappingEntries(Http.Request request, Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) throws Exception {
        //Do your magic!!!
        return new GetSuggestedOfferMappingEntriesResponse();
    }

    @Override
    public GetSuggestedOfferMappingsResponse getSuggestedOfferMappings(Http.Request request, Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) throws Exception {
        //Do your magic!!!
        return new GetSuggestedOfferMappingsResponse();
    }

    @Override
    public SuggestPricesResponse getSuggestedPrices(Http.Request request, Long campaignId, SuggestPricesRequest suggestPricesRequest) throws Exception {
        //Do your magic!!!
        return new SuggestPricesResponse();
    }

    @Override
    public GetWarehousesResponse getWarehouses(Http.Request request, Long businessId) throws Exception {
        //Do your magic!!!
        return new GetWarehousesResponse();
    }

    @Override
    public ProvideOrderItemIdentifiersResponse provideOrderItemIdentifiers(Http.Request request, Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) throws Exception {
        //Do your magic!!!
        return new ProvideOrderItemIdentifiersResponse();
    }

    @Override
    public EmptyApiResponse putBidsForBusiness(Http.Request request, Long businessId, PutSkuBidsRequest putSkuBidsRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse putBidsForCampaign(Http.Request request, Long campaignId, PutSkuBidsRequest putSkuBidsRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse refreshFeed(Http.Request request, Long campaignId, Long feedId) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public GetRegionWithChildrenResponse searchRegionChildren(Http.Request request, Long regionId,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetRegionWithChildrenResponse();
    }

    @Override
    public GetRegionsResponse searchRegionsById(Http.Request request, Long regionId) throws Exception {
        //Do your magic!!!
        return new GetRegionsResponse();
    }

    @Override
    public GetRegionsResponse searchRegionsByName(Http.Request request, @NotNull String name, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetRegionsResponse();
    }

    @Override
    public SearchShipmentsResponse searchShipments(Http.Request request, Long campaignId, SearchShipmentsRequest searchShipmentsRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new SearchShipmentsResponse();
    }

    @Override
    public EmptyApiResponse sendFileToChat(Http.Request request, Long businessId, @NotNull Long chatId, Http.MultipartFormData.FilePart<TemporaryFile> _file) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse sendMessageToChat(Http.Request request, Long businessId, @NotNull Long chatId, SendMessageToChatRequest sendMessageToChatRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse setFeedParams(Http.Request request, Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public SetOrderBoxLayoutResponse setOrderBoxLayout(Http.Request request, Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) throws Exception {
        //Do your magic!!!
        return new SetOrderBoxLayoutResponse();
    }

    @Override
    public SetOrderShipmentBoxesResponse setOrderShipmentBoxes(Http.Request request, Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) throws Exception {
        //Do your magic!!!
        return new SetOrderShipmentBoxesResponse();
    }

    @Override
    public EmptyApiResponse setShipmentPalletsCount(Http.Request request, Long campaignId, Long shipmentId, SetShipmentPalletsCountRequest setShipmentPalletsCountRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse skipGoodsFeedbacksReaction(Http.Request request, Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse transferOrdersFromShipment(Http.Request request, Long campaignId, Long shipmentId, TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse updateBusinessPrices(Http.Request request, Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse updateCampaignOffers(Http.Request request, Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public UpdateGoodsFeedbackCommentResponse updateGoodsFeedbackComment(Http.Request request, Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) throws Exception {
        //Do your magic!!!
        return new UpdateGoodsFeedbackCommentResponse();
    }

    @Override
    public UpdateOfferContentResponse updateOfferContent(Http.Request request, Long businessId, UpdateOfferContentRequest updateOfferContentRequest) throws Exception {
        //Do your magic!!!
        return new UpdateOfferContentResponse();
    }

    @Override
    public EmptyApiResponse updateOfferMappingEntries(Http.Request request, Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public UpdateOfferMappingsResponse updateOfferMappings(Http.Request request, Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) throws Exception {
        //Do your magic!!!
        return new UpdateOfferMappingsResponse();
    }

    @Override
    public void updateOrderItems(Http.Request request, Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) throws Exception {
        //Do your magic!!!
    }

    @Override
    public UpdateOrderStatusResponse updateOrderStatus(Http.Request request, Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) throws Exception {
        //Do your magic!!!
        return new UpdateOrderStatusResponse();
    }

    @Override
    public UpdateOrderStatusesResponse updateOrderStatuses(Http.Request request, Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) throws Exception {
        //Do your magic!!!
        return new UpdateOrderStatusesResponse();
    }

    @Override
    public EmptyApiResponse updatePrices(Http.Request request, Long campaignId, UpdatePricesRequest updatePricesRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public UpdatePromoOffersResponse updatePromoOffers(Http.Request request, Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) throws Exception {
        //Do your magic!!!
        return new UpdatePromoOffersResponse();
    }

    @Override
    public EmptyApiResponse updateStocks(Http.Request request, Long campaignId, UpdateStocksRequest updateStocksRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

}
