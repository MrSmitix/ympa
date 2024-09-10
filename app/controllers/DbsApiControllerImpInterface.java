package controllers;

import apimodels.AcceptOrderCancellationRequest;
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
import apimodels.ChangeOutletRequest;
import apimodels.ConfirmPricesRequest;
import apimodels.CreateChatRequest;
import apimodels.CreateChatResponse;
import apimodels.CreateOutletResponse;
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
import apimodels.GenerateMassOrderLabelsRequest;
import apimodels.GeneratePricesReportRequest;
import apimodels.GenerateReportResponse;
import apimodels.GenerateShelfsStatisticsRequest;
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
import apimodels.GetModelsOffersResponse;
import apimodels.GetModelsRequest;
import apimodels.GetModelsResponse;
import apimodels.GetOfferCardsContentStatusRequest;
import apimodels.GetOfferCardsContentStatusResponse;
import apimodels.GetOfferMappingEntriesResponse;
import apimodels.GetOfferMappingsRequest;
import apimodels.GetOfferMappingsResponse;
import apimodels.GetOfferRecommendationsRequest;
import apimodels.GetOfferRecommendationsResponse;
import apimodels.GetOffersResponse;
import apimodels.GetOrderBuyerInfoResponse;
import apimodels.GetOrderLabelsDataResponse;
import apimodels.GetOrderResponse;
import apimodels.GetOrdersResponse;
import apimodels.GetOrdersStatsRequest;
import apimodels.GetOrdersStatsResponse;
import apimodels.GetOutletLicensesResponse;
import apimodels.GetOutletResponse;
import apimodels.GetOutletsResponse;
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
import apimodels.ProvideOrderDigitalCodesRequest;
import apimodels.ProvideOrderItemIdentifiersRequest;
import apimodels.ProvideOrderItemIdentifiersResponse;
import apimodels.PutSkuBidsRequest;
import apimodels.RefundStatusType;
import apimodels.ReportFormatType;
import apimodels.ReturnType;
import apimodels.SearchModelsResponse;
import apimodels.SendMessageToChatRequest;
import java.util.Set;
import apimodels.SetFeedParamsRequest;
import apimodels.SetOrderBoxLayoutRequest;
import apimodels.SetOrderBoxLayoutResponse;
import apimodels.SetOrderDeliveryDateRequest;
import apimodels.SetOrderDeliveryTrackCodeRequest;
import apimodels.SetOrderShipmentBoxesRequest;
import apimodels.SetOrderShipmentBoxesResponse;
import apimodels.SetReturnDecisionRequest;
import apimodels.SkipGoodsFeedbackReactionRequest;
import apimodels.SortOrderType;
import apimodels.SuggestPricesRequest;
import apimodels.SuggestPricesResponse;
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
import apimodels.UpdateOrderStorageLimitRequest;
import apimodels.UpdateOutletLicenseRequest;
import apimodels.UpdatePricesRequest;
import apimodels.UpdatePromoOffersRequest;
import apimodels.UpdatePromoOffersResponse;
import apimodels.UpdateStocksRequest;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class DbsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result acceptOrderCancellationHttp(Http.Request request, Long campaignId, Long orderId, AcceptOrderCancellationRequest acceptOrderCancellationRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = acceptOrderCancellation(request, campaignId, orderId, acceptOrderCancellationRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse acceptOrderCancellation(Http.Request request, Long campaignId, Long orderId, AcceptOrderCancellationRequest acceptOrderCancellationRequest) throws Exception;

    public Result addHiddenOffersHttp(Http.Request request, Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = addHiddenOffers(request, campaignId, addHiddenOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse addHiddenOffers(Http.Request request, Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) throws Exception;

    public Result addOffersToArchiveHttp(Http.Request request, Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        AddOffersToArchiveResponse obj = addOffersToArchive(request, businessId, addOffersToArchiveRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AddOffersToArchiveResponse addOffersToArchive(Http.Request request, Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) throws Exception;

    public Result calculateTariffsHttp(Http.Request request, CalculateTariffsRequest calculateTariffsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        CalculateTariffsResponse obj = calculateTariffs(request, calculateTariffsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CalculateTariffsResponse calculateTariffs(Http.Request request, CalculateTariffsRequest calculateTariffsRequest) throws Exception;

    public Result confirmBusinessPricesHttp(Http.Request request, Long businessId, ConfirmPricesRequest confirmPricesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = confirmBusinessPrices(request, businessId, confirmPricesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse confirmBusinessPrices(Http.Request request, Long businessId, ConfirmPricesRequest confirmPricesRequest) throws Exception;

    public Result confirmCampaignPricesHttp(Http.Request request, Long campaignId, ConfirmPricesRequest confirmPricesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = confirmCampaignPrices(request, campaignId, confirmPricesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse confirmCampaignPrices(Http.Request request, Long campaignId, ConfirmPricesRequest confirmPricesRequest) throws Exception;

    public Result createChatHttp(Http.Request request, Long businessId, CreateChatRequest createChatRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        CreateChatResponse obj = createChat(request, businessId, createChatRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateChatResponse createChat(Http.Request request, Long businessId, CreateChatRequest createChatRequest) throws Exception;

    public Result createOutletHttp(Http.Request request, Long campaignId, ChangeOutletRequest changeOutletRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        CreateOutletResponse obj = createOutlet(request, campaignId, changeOutletRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateOutletResponse createOutlet(Http.Request request, Long campaignId, ChangeOutletRequest changeOutletRequest) throws Exception;

    public Result deleteCampaignOffersHttp(Http.Request request, Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        DeleteCampaignOffersResponse obj = deleteCampaignOffers(request, campaignId, deleteCampaignOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteCampaignOffersResponse deleteCampaignOffers(Http.Request request, Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) throws Exception;

    public Result deleteGoodsFeedbackCommentHttp(Http.Request request, Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = deleteGoodsFeedbackComment(request, businessId, deleteGoodsFeedbackCommentRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse deleteGoodsFeedbackComment(Http.Request request, Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) throws Exception;

    public Result deleteHiddenOffersHttp(Http.Request request, Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = deleteHiddenOffers(request, campaignId, deleteHiddenOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse deleteHiddenOffers(Http.Request request, Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) throws Exception;

    public Result deleteOffersHttp(Http.Request request, Long businessId, DeleteOffersRequest deleteOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        DeleteOffersResponse obj = deleteOffers(request, businessId, deleteOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteOffersResponse deleteOffers(Http.Request request, Long businessId, DeleteOffersRequest deleteOffersRequest) throws Exception;

    public Result deleteOffersFromArchiveHttp(Http.Request request, Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        DeleteOffersFromArchiveResponse obj = deleteOffersFromArchive(request, businessId, deleteOffersFromArchiveRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteOffersFromArchiveResponse deleteOffersFromArchive(Http.Request request, Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) throws Exception;

    public Result deleteOutletHttp(Http.Request request, Long campaignId, Long outletId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = deleteOutlet(request, campaignId, outletId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse deleteOutlet(Http.Request request, Long campaignId, Long outletId) throws Exception;

    public Result deleteOutletLicensesHttp(Http.Request request, Long campaignId, Set<Long> ids) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = deleteOutletLicenses(request, campaignId, ids);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse deleteOutletLicenses(Http.Request request, Long campaignId, Set<Long> ids) throws Exception;

    public Result deletePromoOffersHttp(Http.Request request, Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        DeletePromoOffersResponse obj = deletePromoOffers(request, businessId, deletePromoOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeletePromoOffersResponse deletePromoOffers(Http.Request request, Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) throws Exception;

    public Result generateBoostConsolidatedReportHttp(Http.Request request, GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateBoostConsolidatedReport(request, generateBoostConsolidatedRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateBoostConsolidatedReport(Http.Request request, GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) throws Exception;

    public Result generateCompetitorsPositionReportHttp(Http.Request request, GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateCompetitorsPositionReport(request, generateCompetitorsPositionReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateCompetitorsPositionReport(Http.Request request, GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) throws Exception;

    public Result generateGoodsFeedbackReportHttp(Http.Request request, GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateGoodsFeedbackReport(request, generateGoodsFeedbackRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateGoodsFeedbackReport(Http.Request request, GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) throws Exception;

    public Result generateMassOrderLabelsReportHttp(Http.Request request, GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateMassOrderLabelsReport(request, generateMassOrderLabelsRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateMassOrderLabelsReport(Http.Request request, GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) throws Exception;

    public Result generateOrderLabelHttp(Http.Request request, Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = generateOrderLabel(request, campaignId, orderId, shipmentId, boxId, format);

        return ok(obj);

    }

    public abstract InputStream generateOrderLabel(Http.Request request, Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) throws Exception;

    public Result generateOrderLabelsHttp(Http.Request request, Long campaignId, Long orderId, PageFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = generateOrderLabels(request, campaignId, orderId, format);

        return ok(obj);

    }

    public abstract InputStream generateOrderLabels(Http.Request request, Long campaignId, Long orderId, PageFormatType format) throws Exception;

    public Result generatePricesReportHttp(Http.Request request, GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generatePricesReport(request, generatePricesReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generatePricesReport(Http.Request request, GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) throws Exception;

    public Result generateShelfsStatisticsReportHttp(Http.Request request, GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateShelfsStatisticsReport(request, generateShelfsStatisticsRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateShelfsStatisticsReport(Http.Request request, GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) throws Exception;

    public Result generateShowsSalesReportHttp(Http.Request request, GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateShowsSalesReport(request, generateShowsSalesReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateShowsSalesReport(Http.Request request, GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) throws Exception;

    public Result generateStocksOnWarehousesReportHttp(Http.Request request, GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateStocksOnWarehousesReport(request, generateStocksOnWarehousesReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateStocksOnWarehousesReport(Http.Request request, GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) throws Exception;

    public Result generateUnitedMarketplaceServicesReportHttp(Http.Request request, GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateUnitedMarketplaceServicesReport(request, generateUnitedMarketplaceServicesReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateUnitedMarketplaceServicesReport(Http.Request request, GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) throws Exception;

    public Result generateUnitedNettingReportHttp(Http.Request request, GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateUnitedNettingReport(request, generateUnitedNettingReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateUnitedNettingReport(Http.Request request, GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) throws Exception;

    public Result generateUnitedOrdersReportHttp(Http.Request request, GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateUnitedOrdersReport(request, generateUnitedOrdersRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateUnitedOrdersReport(Http.Request request, GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) throws Exception;

    public Result getAllOffersHttp(Http.Request request, Long campaignId, Long feedId, Integer chunk) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetAllOffersResponse obj = getAllOffers(request, campaignId, feedId, chunk);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetAllOffersResponse getAllOffers(Http.Request request, Long campaignId, Long feedId, Integer chunk) throws Exception;

    public Result getBidsInfoForBusinessHttp(Http.Request request, Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetBidsInfoResponse obj = getBidsInfoForBusiness(request, businessId, pageToken, limit, getBidsInfoRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBidsInfoResponse getBidsInfoForBusiness(Http.Request request, Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) throws Exception;

    public Result getBidsRecommendationsHttp(Http.Request request, Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetBidsRecommendationsResponse obj = getBidsRecommendations(request, businessId, getBidsRecommendationsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBidsRecommendationsResponse getBidsRecommendations(Http.Request request, Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) throws Exception;

    public Result getBusinessQuarantineOffersHttp(Http.Request request, Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetQuarantineOffersResponse obj = getBusinessQuarantineOffers(request, businessId, getQuarantineOffersRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetQuarantineOffersResponse getBusinessQuarantineOffers(Http.Request request, Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) throws Exception;

    public Result getBusinessSettingsHttp(Http.Request request, Long businessId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetBusinessSettingsResponse obj = getBusinessSettings(request, businessId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBusinessSettingsResponse getBusinessSettings(Http.Request request, Long businessId) throws Exception;

    public Result getCampaignHttp(Http.Request request, Long campaignId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignResponse obj = getCampaign(request, campaignId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignResponse getCampaign(Http.Request request, Long campaignId) throws Exception;

    public Result getCampaignLoginsHttp(Http.Request request, Long campaignId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignLoginsResponse obj = getCampaignLogins(request, campaignId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignLoginsResponse getCampaignLogins(Http.Request request, Long campaignId) throws Exception;

    public Result getCampaignOffersHttp(Http.Request request, Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignOffersResponse obj = getCampaignOffers(request, campaignId, getCampaignOffersRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignOffersResponse getCampaignOffers(Http.Request request, Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) throws Exception;

    public Result getCampaignQuarantineOffersHttp(Http.Request request, Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetQuarantineOffersResponse obj = getCampaignQuarantineOffers(request, campaignId, getQuarantineOffersRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetQuarantineOffersResponse getCampaignQuarantineOffers(Http.Request request, Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) throws Exception;

    public Result getCampaignRegionHttp(Http.Request request, Long campaignId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignRegionResponse obj = getCampaignRegion(request, campaignId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignRegionResponse getCampaignRegion(Http.Request request, Long campaignId) throws Exception;

    public Result getCampaignSettingsHttp(Http.Request request, Long campaignId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignSettingsResponse obj = getCampaignSettings(request, campaignId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignSettingsResponse getCampaignSettings(Http.Request request, Long campaignId) throws Exception;

    public Result getCampaignsHttp(Http.Request request,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignsResponse obj = getCampaigns(request, page, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignsResponse getCampaigns(Http.Request request,  @Max(10000)Integer page, Integer pageSize) throws Exception;

    public Result getCampaignsByLoginHttp(Http.Request request, String login,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignsResponse obj = getCampaignsByLogin(request, login, page, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignsResponse getCampaignsByLogin(Http.Request request, String login,  @Max(10000)Integer page, Integer pageSize) throws Exception;

    public Result getCategoriesMaxSaleQuantumHttp(Http.Request request, GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCategoriesMaxSaleQuantumResponse obj = getCategoriesMaxSaleQuantum(request, getCategoriesMaxSaleQuantumRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(Http.Request request, GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) throws Exception;

    public Result getCategoriesTreeHttp(Http.Request request, GetCategoriesRequest getCategoriesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCategoriesResponse obj = getCategoriesTree(request, getCategoriesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCategoriesResponse getCategoriesTree(Http.Request request, GetCategoriesRequest getCategoriesRequest) throws Exception;

    public Result getCategoryContentParametersHttp(Http.Request request, Long categoryId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCategoryContentParametersResponse obj = getCategoryContentParameters(request, categoryId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCategoryContentParametersResponse getCategoryContentParameters(Http.Request request, Long categoryId) throws Exception;

    public Result getChatHistoryHttp(Http.Request request, Long businessId, @NotNull Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetChatHistoryResponse obj = getChatHistory(request, businessId, chatId, getChatHistoryRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetChatHistoryResponse getChatHistory(Http.Request request, Long businessId, @NotNull Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) throws Exception;

    public Result getChatsHttp(Http.Request request, Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetChatsResponse obj = getChats(request, businessId, getChatsRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetChatsResponse getChats(Http.Request request, Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) throws Exception;

    public Result getDeliveryServicesHttp(Http.Request request) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetDeliveryServicesResponse obj = getDeliveryServices(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetDeliveryServicesResponse getDeliveryServices(Http.Request request) throws Exception;

    public Result getFeedHttp(Http.Request request, Long campaignId, Long feedId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetFeedResponse obj = getFeed(request, campaignId, feedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetFeedResponse getFeed(Http.Request request, Long campaignId, Long feedId) throws Exception;

    public Result getFeedIndexLogsHttp(Http.Request request, Long campaignId, Long feedId, Integer limit, OffsetDateTime publishedTimeFrom, OffsetDateTime publishedTimeTo, FeedIndexLogsStatusType status) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetFeedIndexLogsResponse obj = getFeedIndexLogs(request, campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetFeedIndexLogsResponse getFeedIndexLogs(Http.Request request, Long campaignId, Long feedId, Integer limit, OffsetDateTime publishedTimeFrom, OffsetDateTime publishedTimeTo, FeedIndexLogsStatusType status) throws Exception;

    public Result getFeedbackAndCommentUpdatesHttp(Http.Request request, Long campaignId, String pageToken, Integer limit, LocalDate fromDate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetFeedbackListResponse obj = getFeedbackAndCommentUpdates(request, campaignId, pageToken, limit, fromDate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetFeedbackListResponse getFeedbackAndCommentUpdates(Http.Request request, Long campaignId, String pageToken, Integer limit, LocalDate fromDate) throws Exception;

    public Result getFeedsHttp(Http.Request request, Long campaignId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetFeedsResponse obj = getFeeds(request, campaignId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetFeedsResponse getFeeds(Http.Request request, Long campaignId) throws Exception;

    public Result getGoodsFeedbackCommentsHttp(Http.Request request, Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetGoodsFeedbackCommentsResponse obj = getGoodsFeedbackComments(request, businessId, getGoodsFeedbackCommentsRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetGoodsFeedbackCommentsResponse getGoodsFeedbackComments(Http.Request request, Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) throws Exception;

    public Result getGoodsFeedbacksHttp(Http.Request request, Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetGoodsFeedbackResponse obj = getGoodsFeedbacks(request, businessId, pageToken, limit, getGoodsFeedbackRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetGoodsFeedbackResponse getGoodsFeedbacks(Http.Request request, Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) throws Exception;

    public Result getGoodsStatsHttp(Http.Request request, Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetGoodsStatsResponse obj = getGoodsStats(request, campaignId, getGoodsStatsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetGoodsStatsResponse getGoodsStats(Http.Request request, Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest) throws Exception;

    public Result getHiddenOffersHttp(Http.Request request, Long campaignId, List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId, String pageToken, Integer limit, Integer offset,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetHiddenOffersResponse obj = getHiddenOffers(request, campaignId, offerId, pageToken, limit, offset, page, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetHiddenOffersResponse getHiddenOffers(Http.Request request, Long campaignId, List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId, String pageToken, Integer limit, Integer offset,  @Max(10000)Integer page, Integer pageSize) throws Exception;

    public Result getModelHttp(Http.Request request,  @Min(0)Long modelId, @NotNull Long regionId, CurrencyType currency) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetModelsResponse obj = getModel(request, modelId, regionId, currency);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetModelsResponse getModel(Http.Request request,  @Min(0)Long modelId, @NotNull Long regionId, CurrencyType currency) throws Exception;

    public Result getModelOffersHttp(Http.Request request,  @Min(0)Long modelId, @NotNull Long regionId, CurrencyType currency, SortOrderType orderByPrice, Integer count,  @Max(10000)Integer page) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetModelsOffersResponse obj = getModelOffers(request, modelId, regionId, currency, orderByPrice, count, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetModelsOffersResponse getModelOffers(Http.Request request,  @Min(0)Long modelId, @NotNull Long regionId, CurrencyType currency, SortOrderType orderByPrice, Integer count,  @Max(10000)Integer page) throws Exception;

    public Result getModelsHttp(Http.Request request, @NotNull Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetModelsResponse obj = getModels(request, regionId, getModelsRequest, currency);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetModelsResponse getModels(Http.Request request, @NotNull Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency) throws Exception;

    public Result getModelsOffersHttp(Http.Request request, @NotNull Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, SortOrderType orderByPrice) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetModelsOffersResponse obj = getModelsOffers(request, regionId, getModelsRequest, currency, orderByPrice);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetModelsOffersResponse getModelsOffers(Http.Request request, @NotNull Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, SortOrderType orderByPrice) throws Exception;

    public Result getOfferCardsContentStatusHttp(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOfferCardsContentStatusResponse obj = getOfferCardsContentStatus(request, businessId, pageToken, limit, getOfferCardsContentStatusRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOfferCardsContentStatusResponse getOfferCardsContentStatus(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) throws Exception;

    public Result getOfferMappingEntriesHttp(Http.Request request, Long campaignId, List<String> offerId, List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOfferMappingEntriesResponse obj = getOfferMappingEntries(request, campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOfferMappingEntriesResponse getOfferMappingEntries(Http.Request request, Long campaignId, List<String> offerId, List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) throws Exception;

    public Result getOfferMappingsHttp(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOfferMappingsResponse obj = getOfferMappings(request, businessId, pageToken, limit, getOfferMappingsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOfferMappingsResponse getOfferMappings(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) throws Exception;

    public Result getOfferRecommendationsHttp(Http.Request request, Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOfferRecommendationsResponse obj = getOfferRecommendations(request, businessId, getOfferRecommendationsRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOfferRecommendationsResponse getOfferRecommendations(Http.Request request, Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) throws Exception;

    public Result getOffersHttp(Http.Request request, Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOffersResponse obj = getOffers(request, campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOffersResponse getOffers(Http.Request request, Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched,  @Max(10000)Integer page, Integer pageSize) throws Exception;

    public Result getOrderHttp(Http.Request request, Long campaignId, Long orderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOrderResponse obj = getOrder(request, campaignId, orderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOrderResponse getOrder(Http.Request request, Long campaignId, Long orderId) throws Exception;

    public Result getOrderBusinessBuyerInfoHttp(Http.Request request, Long campaignId, Long orderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetBusinessBuyerInfoResponse obj = getOrderBusinessBuyerInfo(request, campaignId, orderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBusinessBuyerInfoResponse getOrderBusinessBuyerInfo(Http.Request request, Long campaignId, Long orderId) throws Exception;

    public Result getOrderBusinessDocumentsInfoHttp(Http.Request request, Long campaignId, Long orderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetBusinessDocumentsInfoResponse obj = getOrderBusinessDocumentsInfo(request, campaignId, orderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBusinessDocumentsInfoResponse getOrderBusinessDocumentsInfo(Http.Request request, Long campaignId, Long orderId) throws Exception;

    public Result getOrderBuyerInfoHttp(Http.Request request, Long campaignId, Long orderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOrderBuyerInfoResponse obj = getOrderBuyerInfo(request, campaignId, orderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOrderBuyerInfoResponse getOrderBuyerInfo(Http.Request request, Long campaignId, Long orderId) throws Exception;

    public Result getOrderLabelsDataHttp(Http.Request request, Long campaignId, Long orderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOrderLabelsDataResponse obj = getOrderLabelsData(request, campaignId, orderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOrderLabelsDataResponse getOrderLabelsData(Http.Request request, Long campaignId, Long orderId) throws Exception;

    public Result getOrdersHttp(Http.Request request, Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, LocalDate fromDate, LocalDate toDate, LocalDate supplierShipmentDateFrom, LocalDate supplierShipmentDateTo, OffsetDateTime updatedAtFrom, OffsetDateTime updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType,  @Max(10000)Integer page, Integer pageSize, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOrdersResponse obj = getOrders(request, campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOrdersResponse getOrders(Http.Request request, Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, LocalDate fromDate, LocalDate toDate, LocalDate supplierShipmentDateFrom, LocalDate supplierShipmentDateTo, OffsetDateTime updatedAtFrom, OffsetDateTime updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType,  @Max(10000)Integer page, Integer pageSize, String pageToken, Integer limit) throws Exception;

    public Result getOrdersStatsHttp(Http.Request request, Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOrdersStatsResponse obj = getOrdersStats(request, campaignId, pageToken, limit, getOrdersStatsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOrdersStatsResponse getOrdersStats(Http.Request request, Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) throws Exception;

    public Result getOutletHttp(Http.Request request, Long campaignId, Long outletId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOutletResponse obj = getOutlet(request, campaignId, outletId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOutletResponse getOutlet(Http.Request request, Long campaignId, Long outletId) throws Exception;

    public Result getOutletLicensesHttp(Http.Request request, Long campaignId, Set<Long> outletIds, Set<Long> ids) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOutletLicensesResponse obj = getOutletLicenses(request, campaignId, outletIds, ids);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOutletLicensesResponse getOutletLicenses(Http.Request request, Long campaignId, Set<Long> outletIds, Set<Long> ids) throws Exception;

    public Result getOutletsHttp(Http.Request request, Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOutletsResponse obj = getOutlets(request, campaignId, pageToken, regionId, shopOutletCode, regionId2);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOutletsResponse getOutlets(Http.Request request, Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2) throws Exception;

    public Result getPricesHttp(Http.Request request, Long campaignId, String pageToken, Integer limit, Boolean archived) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetPricesResponse obj = getPrices(request, campaignId, pageToken, limit, archived);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetPricesResponse getPrices(Http.Request request, Long campaignId, String pageToken, Integer limit, Boolean archived) throws Exception;

    public Result getPricesByOfferIdsHttp(Http.Request request, Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetPricesByOfferIdsResponse obj = getPricesByOfferIds(request, campaignId, pageToken, limit, getPricesByOfferIdsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetPricesByOfferIdsResponse getPricesByOfferIds(Http.Request request, Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) throws Exception;

    public Result getPromoOffersHttp(Http.Request request, Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetPromoOffersResponse obj = getPromoOffers(request, businessId, getPromoOffersRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetPromoOffersResponse getPromoOffers(Http.Request request, Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) throws Exception;

    public Result getPromosHttp(Http.Request request, Long businessId, GetPromosRequest getPromosRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetPromosResponse obj = getPromos(request, businessId, getPromosRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetPromosResponse getPromos(Http.Request request, Long businessId, GetPromosRequest getPromosRequest) throws Exception;

    public Result getQualityRatingDetailsHttp(Http.Request request, Long campaignId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetQualityRatingDetailsResponse obj = getQualityRatingDetails(request, campaignId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetQualityRatingDetailsResponse getQualityRatingDetails(Http.Request request, Long campaignId) throws Exception;

    public Result getQualityRatingsHttp(Http.Request request, Long businessId, GetQualityRatingRequest getQualityRatingRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetQualityRatingResponse obj = getQualityRatings(request, businessId, getQualityRatingRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetQualityRatingResponse getQualityRatings(Http.Request request, Long businessId, GetQualityRatingRequest getQualityRatingRequest) throws Exception;

    public Result getReportInfoHttp(Http.Request request, String reportId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetReportInfoResponse obj = getReportInfo(request, reportId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetReportInfoResponse getReportInfo(Http.Request request, String reportId) throws Exception;

    public Result getReturnHttp(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetReturnResponse obj = getReturn(request, campaignId, orderId, returnId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetReturnResponse getReturn(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception;

    public Result getReturnApplicationHttp(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = getReturnApplication(request, campaignId, orderId, returnId);

        return ok(obj);

    }

    public abstract InputStream getReturnApplication(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception;

    public Result getReturnPhotoHttp(Http.Request request, Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = getReturnPhoto(request, campaignId, orderId, returnId, itemId, imageHash);

        return ok(obj);

    }

    public abstract InputStream getReturnPhoto(Http.Request request, Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) throws Exception;

    public Result getReturnsHttp(Http.Request request, Long campaignId, String pageToken, Integer limit,    @Size(max=50)List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetReturnsResponse obj = getReturns(request, campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetReturnsResponse getReturns(Http.Request request, Long campaignId, String pageToken, Integer limit,    @Size(max=50)List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2) throws Exception;

    public Result getStocksHttp(Http.Request request, Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetWarehouseStocksResponse obj = getStocks(request, campaignId, pageToken, limit, getWarehouseStocksRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetWarehouseStocksResponse getStocks(Http.Request request, Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) throws Exception;

    public Result getSuggestedOfferMappingEntriesHttp(Http.Request request, Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetSuggestedOfferMappingEntriesResponse obj = getSuggestedOfferMappingEntries(request, campaignId, getSuggestedOfferMappingEntriesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetSuggestedOfferMappingEntriesResponse getSuggestedOfferMappingEntries(Http.Request request, Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) throws Exception;

    public Result getSuggestedOfferMappingsHttp(Http.Request request, Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetSuggestedOfferMappingsResponse obj = getSuggestedOfferMappings(request, businessId, getSuggestedOfferMappingsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetSuggestedOfferMappingsResponse getSuggestedOfferMappings(Http.Request request, Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) throws Exception;

    public Result getSuggestedPricesHttp(Http.Request request, Long campaignId, SuggestPricesRequest suggestPricesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        SuggestPricesResponse obj = getSuggestedPrices(request, campaignId, suggestPricesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SuggestPricesResponse getSuggestedPrices(Http.Request request, Long campaignId, SuggestPricesRequest suggestPricesRequest) throws Exception;

    public Result getWarehousesHttp(Http.Request request, Long businessId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetWarehousesResponse obj = getWarehouses(request, businessId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetWarehousesResponse getWarehouses(Http.Request request, Long businessId) throws Exception;

    public Result provideOrderDigitalCodesHttp(Http.Request request, Long campaignId, Long orderId, ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = provideOrderDigitalCodes(request, campaignId, orderId, provideOrderDigitalCodesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse provideOrderDigitalCodes(Http.Request request, Long campaignId, Long orderId, ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest) throws Exception;

    public Result provideOrderItemIdentifiersHttp(Http.Request request, Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        ProvideOrderItemIdentifiersResponse obj = provideOrderItemIdentifiers(request, campaignId, orderId, provideOrderItemIdentifiersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProvideOrderItemIdentifiersResponse provideOrderItemIdentifiers(Http.Request request, Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) throws Exception;

    public Result putBidsForBusinessHttp(Http.Request request, Long businessId, PutSkuBidsRequest putSkuBidsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = putBidsForBusiness(request, businessId, putSkuBidsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse putBidsForBusiness(Http.Request request, Long businessId, PutSkuBidsRequest putSkuBidsRequest) throws Exception;

    public Result putBidsForCampaignHttp(Http.Request request, Long campaignId, PutSkuBidsRequest putSkuBidsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = putBidsForCampaign(request, campaignId, putSkuBidsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse putBidsForCampaign(Http.Request request, Long campaignId, PutSkuBidsRequest putSkuBidsRequest) throws Exception;

    public Result refreshFeedHttp(Http.Request request, Long campaignId, Long feedId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = refreshFeed(request, campaignId, feedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse refreshFeed(Http.Request request, Long campaignId, Long feedId) throws Exception;

    public Result searchModelsHttp(Http.Request request, @NotNull String query, @NotNull Long regionId, CurrencyType currency,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        SearchModelsResponse obj = searchModels(request, query, regionId, currency, page, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SearchModelsResponse searchModels(Http.Request request, @NotNull String query, @NotNull Long regionId, CurrencyType currency,  @Max(10000)Integer page, Integer pageSize) throws Exception;

    public Result searchRegionChildrenHttp(Http.Request request, Long regionId,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetRegionWithChildrenResponse obj = searchRegionChildren(request, regionId, page, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetRegionWithChildrenResponse searchRegionChildren(Http.Request request, Long regionId,  @Max(10000)Integer page, Integer pageSize) throws Exception;

    public Result searchRegionsByIdHttp(Http.Request request, Long regionId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetRegionsResponse obj = searchRegionsById(request, regionId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetRegionsResponse searchRegionsById(Http.Request request, Long regionId) throws Exception;

    public Result searchRegionsByNameHttp(Http.Request request, @NotNull String name, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetRegionsResponse obj = searchRegionsByName(request, name, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetRegionsResponse searchRegionsByName(Http.Request request, @NotNull String name, String pageToken, Integer limit) throws Exception;

    public Result sendFileToChatHttp(Http.Request request, Long businessId, @NotNull Long chatId, Http.MultipartFormData.FilePart<TemporaryFile> _file) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = sendFileToChat(request, businessId, chatId, _file);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse sendFileToChat(Http.Request request, Long businessId, @NotNull Long chatId, Http.MultipartFormData.FilePart<TemporaryFile> _file) throws Exception;

    public Result sendMessageToChatHttp(Http.Request request, Long businessId, @NotNull Long chatId, SendMessageToChatRequest sendMessageToChatRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = sendMessageToChat(request, businessId, chatId, sendMessageToChatRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse sendMessageToChat(Http.Request request, Long businessId, @NotNull Long chatId, SendMessageToChatRequest sendMessageToChatRequest) throws Exception;

    public Result setFeedParamsHttp(Http.Request request, Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = setFeedParams(request, campaignId, feedId, setFeedParamsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse setFeedParams(Http.Request request, Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) throws Exception;

    public Result setOrderBoxLayoutHttp(Http.Request request, Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        SetOrderBoxLayoutResponse obj = setOrderBoxLayout(request, campaignId, orderId, setOrderBoxLayoutRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SetOrderBoxLayoutResponse setOrderBoxLayout(Http.Request request, Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) throws Exception;

    public Result setOrderDeliveryDateHttp(Http.Request request, Long campaignId, Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = setOrderDeliveryDate(request, campaignId, orderId, setOrderDeliveryDateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse setOrderDeliveryDate(Http.Request request, Long campaignId, Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest) throws Exception;

    public Result setOrderDeliveryTrackCodeHttp(Http.Request request, Long campaignId, Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = setOrderDeliveryTrackCode(request, campaignId, orderId, setOrderDeliveryTrackCodeRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse setOrderDeliveryTrackCode(Http.Request request, Long campaignId, Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest) throws Exception;

    public Result setOrderShipmentBoxesHttp(Http.Request request, Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        SetOrderShipmentBoxesResponse obj = setOrderShipmentBoxes(request, campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SetOrderShipmentBoxesResponse setOrderShipmentBoxes(Http.Request request, Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) throws Exception;

    public Result setReturnDecisionHttp(Http.Request request, Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = setReturnDecision(request, campaignId, orderId, returnId, setReturnDecisionRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse setReturnDecision(Http.Request request, Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest) throws Exception;

    public Result skipGoodsFeedbacksReactionHttp(Http.Request request, Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = skipGoodsFeedbacksReaction(request, businessId, skipGoodsFeedbackReactionRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse skipGoodsFeedbacksReaction(Http.Request request, Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) throws Exception;

    public Result submitReturnDecisionHttp(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = submitReturnDecision(request, campaignId, orderId, returnId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse submitReturnDecision(Http.Request request, Long campaignId, Long orderId, Long returnId) throws Exception;

    public Result updateBusinessPricesHttp(Http.Request request, Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateBusinessPrices(request, businessId, updateBusinessPricesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateBusinessPrices(Http.Request request, Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) throws Exception;

    public Result updateCampaignOffersHttp(Http.Request request, Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateCampaignOffers(request, campaignId, updateCampaignOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateCampaignOffers(Http.Request request, Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) throws Exception;

    public Result updateGoodsFeedbackCommentHttp(Http.Request request, Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdateGoodsFeedbackCommentResponse obj = updateGoodsFeedbackComment(request, businessId, updateGoodsFeedbackCommentRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateGoodsFeedbackCommentResponse updateGoodsFeedbackComment(Http.Request request, Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) throws Exception;

    public Result updateOfferContentHttp(Http.Request request, Long businessId, UpdateOfferContentRequest updateOfferContentRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdateOfferContentResponse obj = updateOfferContent(request, businessId, updateOfferContentRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateOfferContentResponse updateOfferContent(Http.Request request, Long businessId, UpdateOfferContentRequest updateOfferContentRequest) throws Exception;

    public Result updateOfferMappingEntriesHttp(Http.Request request, Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateOfferMappingEntries(request, campaignId, updateOfferMappingEntryRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateOfferMappingEntries(Http.Request request, Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) throws Exception;

    public Result updateOfferMappingsHttp(Http.Request request, Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdateOfferMappingsResponse obj = updateOfferMappings(request, businessId, updateOfferMappingsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateOfferMappingsResponse updateOfferMappings(Http.Request request, Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) throws Exception;

    public Result updateOrderItemsHttp(Http.Request request, Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        updateOrderItems(request, campaignId, orderId, updateOrderItemRequest);
        return ok();

    }

    public abstract void updateOrderItems(Http.Request request, Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) throws Exception;

    public Result updateOrderStatusHttp(Http.Request request, Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdateOrderStatusResponse obj = updateOrderStatus(request, campaignId, orderId, updateOrderStatusRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateOrderStatusResponse updateOrderStatus(Http.Request request, Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) throws Exception;

    public Result updateOrderStatusesHttp(Http.Request request, Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdateOrderStatusesResponse obj = updateOrderStatuses(request, campaignId, updateOrderStatusesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateOrderStatusesResponse updateOrderStatuses(Http.Request request, Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) throws Exception;

    public Result updateOrderStorageLimitHttp(Http.Request request, Long campaignId, Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateOrderStorageLimit(request, campaignId, orderId, updateOrderStorageLimitRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateOrderStorageLimit(Http.Request request, Long campaignId, Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest) throws Exception;

    public Result updateOutletHttp(Http.Request request, Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateOutlet(request, campaignId, outletId, changeOutletRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateOutlet(Http.Request request, Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest) throws Exception;

    public Result updateOutletLicensesHttp(Http.Request request, Long campaignId, UpdateOutletLicenseRequest updateOutletLicenseRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateOutletLicenses(request, campaignId, updateOutletLicenseRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateOutletLicenses(Http.Request request, Long campaignId, UpdateOutletLicenseRequest updateOutletLicenseRequest) throws Exception;

    public Result updatePricesHttp(Http.Request request, Long campaignId, UpdatePricesRequest updatePricesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updatePrices(request, campaignId, updatePricesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updatePrices(Http.Request request, Long campaignId, UpdatePricesRequest updatePricesRequest) throws Exception;

    public Result updatePromoOffersHttp(Http.Request request, Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdatePromoOffersResponse obj = updatePromoOffers(request, businessId, updatePromoOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdatePromoOffersResponse updatePromoOffers(Http.Request request, Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) throws Exception;

    public Result updateStocksHttp(Http.Request request, Long campaignId, UpdateStocksRequest updateStocksRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateStocks(request, campaignId, updateStocksRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateStocks(Http.Request request, Long campaignId, UpdateStocksRequest updateStocksRequest) throws Exception;

}
