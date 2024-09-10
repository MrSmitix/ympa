package org.openapitools.server.api;

import org.openapitools.server.model.AddHiddenOffersRequest;
import org.openapitools.server.model.AddOffersToArchiveRequest;
import org.openapitools.server.model.AddOffersToArchiveResponse;
import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.CalculateTariffsRequest;
import org.openapitools.server.model.CalculateTariffsResponse;
import java.util.stream.Collectors;
import org.openapitools.server.model.ConfirmPricesRequest;
import org.openapitools.server.model.CreateChatRequest;
import org.openapitools.server.model.CreateChatResponse;
import org.openapitools.server.model.CurrencyType;
import org.openapitools.server.model.DeleteCampaignOffersRequest;
import org.openapitools.server.model.DeleteCampaignOffersResponse;
import org.openapitools.server.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.server.model.DeleteHiddenOffersRequest;
import org.openapitools.server.model.DeleteOffersFromArchiveRequest;
import org.openapitools.server.model.DeleteOffersFromArchiveResponse;
import org.openapitools.server.model.DeleteOffersRequest;
import org.openapitools.server.model.DeleteOffersResponse;
import org.openapitools.server.model.DeletePromoOffersRequest;
import org.openapitools.server.model.DeletePromoOffersResponse;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.FeedIndexLogsStatusType;
import java.io.File;
import org.openapitools.server.model.GenerateBoostConsolidatedRequest;
import org.openapitools.server.model.GenerateCompetitorsPositionReportRequest;
import org.openapitools.server.model.GenerateGoodsFeedbackRequest;
import org.openapitools.server.model.GenerateGoodsRealizationReportRequest;
import org.openapitools.server.model.GenerateMassOrderLabelsRequest;
import org.openapitools.server.model.GeneratePricesReportRequest;
import org.openapitools.server.model.GenerateReportResponse;
import org.openapitools.server.model.GenerateShelfsStatisticsRequest;
import org.openapitools.server.model.GenerateShowsSalesReportRequest;
import org.openapitools.server.model.GenerateStocksOnWarehousesReportRequest;
import org.openapitools.server.model.GenerateUnitedMarketplaceServicesReportRequest;
import org.openapitools.server.model.GenerateUnitedNettingReportRequest;
import org.openapitools.server.model.GenerateUnitedOrdersRequest;
import org.openapitools.server.model.GetAllOffersResponse;
import org.openapitools.server.model.GetBidsInfoRequest;
import org.openapitools.server.model.GetBidsInfoResponse;
import org.openapitools.server.model.GetBidsRecommendationsRequest;
import org.openapitools.server.model.GetBidsRecommendationsResponse;
import org.openapitools.server.model.GetBusinessBuyerInfoResponse;
import org.openapitools.server.model.GetBusinessDocumentsInfoResponse;
import org.openapitools.server.model.GetBusinessSettingsResponse;
import org.openapitools.server.model.GetCampaignLoginsResponse;
import org.openapitools.server.model.GetCampaignOffersRequest;
import org.openapitools.server.model.GetCampaignOffersResponse;
import org.openapitools.server.model.GetCampaignRegionResponse;
import org.openapitools.server.model.GetCampaignResponse;
import org.openapitools.server.model.GetCampaignSettingsResponse;
import org.openapitools.server.model.GetCampaignsResponse;
import org.openapitools.server.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.server.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.server.model.GetCategoriesRequest;
import org.openapitools.server.model.GetCategoriesResponse;
import org.openapitools.server.model.GetCategoryContentParametersResponse;
import org.openapitools.server.model.GetChatHistoryRequest;
import org.openapitools.server.model.GetChatHistoryResponse;
import org.openapitools.server.model.GetChatsRequest;
import org.openapitools.server.model.GetChatsResponse;
import org.openapitools.server.model.GetDeliveryServicesResponse;
import org.openapitools.server.model.GetFeedIndexLogsResponse;
import org.openapitools.server.model.GetFeedResponse;
import org.openapitools.server.model.GetFeedbackListResponse;
import org.openapitools.server.model.GetFeedsResponse;
import org.openapitools.server.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.server.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.server.model.GetGoodsFeedbackRequest;
import org.openapitools.server.model.GetGoodsFeedbackResponse;
import org.openapitools.server.model.GetGoodsStatsRequest;
import org.openapitools.server.model.GetGoodsStatsResponse;
import org.openapitools.server.model.GetHiddenOffersResponse;
import org.openapitools.server.model.GetOfferCardsContentStatusRequest;
import org.openapitools.server.model.GetOfferCardsContentStatusResponse;
import org.openapitools.server.model.GetOfferMappingEntriesResponse;
import org.openapitools.server.model.GetOfferMappingsRequest;
import org.openapitools.server.model.GetOfferMappingsResponse;
import org.openapitools.server.model.GetOfferRecommendationsRequest;
import org.openapitools.server.model.GetOfferRecommendationsResponse;
import org.openapitools.server.model.GetOffersResponse;
import org.openapitools.server.model.GetOrderLabelsDataResponse;
import org.openapitools.server.model.GetOrderResponse;
import org.openapitools.server.model.GetOrdersResponse;
import org.openapitools.server.model.GetOrdersStatsRequest;
import org.openapitools.server.model.GetOrdersStatsResponse;
import org.openapitools.server.model.GetPricesByOfferIdsRequest;
import org.openapitools.server.model.GetPricesByOfferIdsResponse;
import org.openapitools.server.model.GetPricesResponse;
import org.openapitools.server.model.GetPromoOffersRequest;
import org.openapitools.server.model.GetPromoOffersResponse;
import org.openapitools.server.model.GetPromosRequest;
import org.openapitools.server.model.GetPromosResponse;
import org.openapitools.server.model.GetQualityRatingDetailsResponse;
import org.openapitools.server.model.GetQualityRatingRequest;
import org.openapitools.server.model.GetQualityRatingResponse;
import org.openapitools.server.model.GetQuarantineOffersRequest;
import org.openapitools.server.model.GetQuarantineOffersResponse;
import org.openapitools.server.model.GetRegionWithChildrenResponse;
import org.openapitools.server.model.GetRegionsResponse;
import org.openapitools.server.model.GetReportInfoResponse;
import org.openapitools.server.model.GetReturnResponse;
import org.openapitools.server.model.GetReturnsResponse;
import org.openapitools.server.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.server.model.GetSuggestedOfferMappingEntriesResponse;
import org.openapitools.server.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.server.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.server.model.GetWarehouseStocksRequest;
import org.openapitools.server.model.GetWarehouseStocksResponse;
import org.openapitools.server.model.GetWarehousesResponse;
import java.util.HexFormat;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import io.helidon.http.media.multipart.MultiPart;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.OfferAvailabilityStatusType;
import org.openapitools.server.model.OfferMappingKindType;
import org.openapitools.server.model.OfferProcessingStatusType;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.server.model.OrderBuyerType;
import org.openapitools.server.model.OrderDeliveryDispatchType;
import org.openapitools.server.model.OrderStatusType;
import org.openapitools.server.model.OrderSubstatusType;
import org.openapitools.server.model.PageFormatType;
import io.helidon.common.parameters.Parameters;
import org.openapitools.server.model.ProvideOrderItemIdentifiersRequest;
import org.openapitools.server.model.ProvideOrderItemIdentifiersResponse;
import org.openapitools.server.model.PutSkuBidsRequest;
import io.helidon.http.media.multipart.ReadablePart;
import org.openapitools.server.model.RefundStatusType;
import org.openapitools.server.model.ReportFormatType;
import org.openapitools.server.model.ReturnType;
import org.openapitools.server.model.SendMessageToChatRequest;
import java.util.Set;
import org.openapitools.server.model.SetFeedParamsRequest;
import org.openapitools.server.model.SetOrderBoxLayoutRequest;
import org.openapitools.server.model.SetOrderBoxLayoutResponse;
import org.openapitools.server.model.SetOrderShipmentBoxesRequest;
import org.openapitools.server.model.SetOrderShipmentBoxesResponse;
import org.openapitools.server.model.SkipGoodsFeedbackReactionRequest;
import io.helidon.http.Status;
import org.openapitools.server.model.SuggestPricesRequest;
import org.openapitools.server.model.SuggestPricesResponse;
import org.openapitools.server.model.UpdateBusinessPricesRequest;
import org.openapitools.server.model.UpdateCampaignOffersRequest;
import org.openapitools.server.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.server.model.UpdateGoodsFeedbackCommentResponse;
import org.openapitools.server.model.UpdateOfferContentRequest;
import org.openapitools.server.model.UpdateOfferContentResponse;
import org.openapitools.server.model.UpdateOfferMappingEntryRequest;
import org.openapitools.server.model.UpdateOfferMappingsRequest;
import org.openapitools.server.model.UpdateOfferMappingsResponse;
import org.openapitools.server.model.UpdateOrderItemRequest;
import org.openapitools.server.model.UpdateOrderStatusRequest;
import org.openapitools.server.model.UpdateOrderStatusResponse;
import org.openapitools.server.model.UpdateOrderStatusesRequest;
import org.openapitools.server.model.UpdateOrderStatusesResponse;
import org.openapitools.server.model.UpdatePricesRequest;
import org.openapitools.server.model.UpdatePromoOffersRequest;
import org.openapitools.server.model.UpdatePromoOffersResponse;
import org.openapitools.server.model.UpdateStocksRequest;
import io.helidon.common.mapper.Value;
import org.openapitools.server.model.VerifyOrderEacRequest;
import org.openapitools.server.model.VerifyOrderEacResponse;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class ExpressServiceImpl implements ExpressService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void addHiddenOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void addOffersToArchive(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void calculateTariffs(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void confirmBusinessPrices(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void confirmCampaignPrices(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void createChat(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deleteCampaignOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deleteGoodsFeedbackComment(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deleteHiddenOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deleteOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deleteOffersFromArchive(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deletePromoOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateBoostConsolidatedReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateCompetitorsPositionReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateGoodsFeedbackReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateGoodsRealizationReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateMassOrderLabelsReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateOrderLabel(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateOrderLabels(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generatePricesReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateShelfsStatisticsReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateShowsSalesReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateStocksOnWarehousesReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateUnitedMarketplaceServicesReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateUnitedNettingReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void generateUnitedOrdersReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getAllOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getBidsInfoForBusiness(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getBidsRecommendations(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getBusinessQuarantineOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getBusinessSettings(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCampaign(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCampaignLogins(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCampaignOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCampaignQuarantineOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCampaignRegion(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCampaignSettings(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCampaigns(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCampaignsByLogin(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCategoriesMaxSaleQuantum(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCategoriesTree(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCategoryContentParameters(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getChatHistory(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getChats(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getDeliveryServices(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getFeed(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getFeedIndexLogs(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getFeedbackAndCommentUpdates(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getFeeds(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getGoodsFeedbackComments(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getGoodsFeedbacks(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getGoodsStats(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getHiddenOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOfferCardsContentStatus(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOfferMappingEntries(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOfferMappings(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOfferRecommendations(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOrder(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOrderBusinessBuyerInfo(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOrderBusinessDocumentsInfo(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOrderLabelsData(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOrders(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOrdersStats(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getPrices(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getPricesByOfferIds(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getPromoOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getPromos(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getQualityRatingDetails(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getQualityRatings(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getReportInfo(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getReturn(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getReturnApplication(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getReturnPhoto(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getReturns(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getStocks(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getSuggestedOfferMappingEntries(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getSuggestedOfferMappings(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getSuggestedPrices(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getWarehouses(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void provideOrderItemIdentifiers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void putBidsForBusiness(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void putBidsForCampaign(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void refreshFeed(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void searchRegionChildren(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void searchRegionsById(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void searchRegionsByName(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void sendFileToChat(ServerRequest request, ServerResponse response) {
        MultiPart multiPart = request.content().as(MultiPart.class);
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void sendMessageToChat(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void setFeedParams(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void setOrderBoxLayout(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void setOrderShipmentBoxes(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void skipGoodsFeedbacksReaction(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateBusinessPrices(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateCampaignOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateGoodsFeedbackComment(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOfferContent(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOfferMappingEntries(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOfferMappings(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOrderItems(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOrderStatus(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOrderStatuses(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updatePrices(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updatePromoOffers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateStocks(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void verifyOrderEac(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service ExpressService is down. Goodbye!");
    }

}
