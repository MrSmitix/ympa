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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DbsApiController extends Controller {
    private final DbsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DbsApiController(Config configuration, DbsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result acceptOrderCancellation(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeacceptOrderCancellationRequest = request.body().asJson();
        AcceptOrderCancellationRequest acceptOrderCancellationRequest;
        if (nodeacceptOrderCancellationRequest != null) {
            acceptOrderCancellationRequest = mapper.readValue(nodeacceptOrderCancellationRequest.toString(), AcceptOrderCancellationRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(acceptOrderCancellationRequest);
            }
        } else {
            throw new IllegalArgumentException("'AcceptOrderCancellationRequest' parameter is required");
        }
        return imp.acceptOrderCancellationHttp(request, campaignId, orderId, acceptOrderCancellationRequest);
    }

    @ApiAction
    public Result addHiddenOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeaddHiddenOffersRequest = request.body().asJson();
        AddHiddenOffersRequest addHiddenOffersRequest;
        if (nodeaddHiddenOffersRequest != null) {
            addHiddenOffersRequest = mapper.readValue(nodeaddHiddenOffersRequest.toString(), AddHiddenOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(addHiddenOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'AddHiddenOffersRequest' parameter is required");
        }
        return imp.addHiddenOffersHttp(request, campaignId, addHiddenOffersRequest);
    }

    @ApiAction
    public Result addOffersToArchive(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeaddOffersToArchiveRequest = request.body().asJson();
        AddOffersToArchiveRequest addOffersToArchiveRequest;
        if (nodeaddOffersToArchiveRequest != null) {
            addOffersToArchiveRequest = mapper.readValue(nodeaddOffersToArchiveRequest.toString(), AddOffersToArchiveRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(addOffersToArchiveRequest);
            }
        } else {
            throw new IllegalArgumentException("'AddOffersToArchiveRequest' parameter is required");
        }
        return imp.addOffersToArchiveHttp(request, businessId, addOffersToArchiveRequest);
    }

    @ApiAction
    public Result calculateTariffs(Http.Request request) throws Exception {
        JsonNode nodecalculateTariffsRequest = request.body().asJson();
        CalculateTariffsRequest calculateTariffsRequest;
        if (nodecalculateTariffsRequest != null) {
            calculateTariffsRequest = mapper.readValue(nodecalculateTariffsRequest.toString(), CalculateTariffsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(calculateTariffsRequest);
            }
        } else {
            throw new IllegalArgumentException("'CalculateTariffsRequest' parameter is required");
        }
        return imp.calculateTariffsHttp(request, calculateTariffsRequest);
    }

    @ApiAction
    public Result confirmBusinessPrices(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeconfirmPricesRequest = request.body().asJson();
        ConfirmPricesRequest confirmPricesRequest;
        if (nodeconfirmPricesRequest != null) {
            confirmPricesRequest = mapper.readValue(nodeconfirmPricesRequest.toString(), ConfirmPricesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(confirmPricesRequest);
            }
        } else {
            throw new IllegalArgumentException("'ConfirmPricesRequest' parameter is required");
        }
        return imp.confirmBusinessPricesHttp(request, businessId, confirmPricesRequest);
    }

    @ApiAction
    public Result confirmCampaignPrices(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeconfirmPricesRequest = request.body().asJson();
        ConfirmPricesRequest confirmPricesRequest;
        if (nodeconfirmPricesRequest != null) {
            confirmPricesRequest = mapper.readValue(nodeconfirmPricesRequest.toString(), ConfirmPricesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(confirmPricesRequest);
            }
        } else {
            throw new IllegalArgumentException("'ConfirmPricesRequest' parameter is required");
        }
        return imp.confirmCampaignPricesHttp(request, campaignId, confirmPricesRequest);
    }

    @ApiAction
    public Result createChat(Http.Request request, Long businessId) throws Exception {
        JsonNode nodecreateChatRequest = request.body().asJson();
        CreateChatRequest createChatRequest;
        if (nodecreateChatRequest != null) {
            createChatRequest = mapper.readValue(nodecreateChatRequest.toString(), CreateChatRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createChatRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateChatRequest' parameter is required");
        }
        return imp.createChatHttp(request, businessId, createChatRequest);
    }

    @ApiAction
    public Result createOutlet(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodechangeOutletRequest = request.body().asJson();
        ChangeOutletRequest changeOutletRequest;
        if (nodechangeOutletRequest != null) {
            changeOutletRequest = mapper.readValue(nodechangeOutletRequest.toString(), ChangeOutletRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(changeOutletRequest);
            }
        } else {
            throw new IllegalArgumentException("'ChangeOutletRequest' parameter is required");
        }
        return imp.createOutletHttp(request, campaignId, changeOutletRequest);
    }

    @ApiAction
    public Result deleteCampaignOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodedeleteCampaignOffersRequest = request.body().asJson();
        DeleteCampaignOffersRequest deleteCampaignOffersRequest;
        if (nodedeleteCampaignOffersRequest != null) {
            deleteCampaignOffersRequest = mapper.readValue(nodedeleteCampaignOffersRequest.toString(), DeleteCampaignOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteCampaignOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeleteCampaignOffersRequest' parameter is required");
        }
        return imp.deleteCampaignOffersHttp(request, campaignId, deleteCampaignOffersRequest);
    }

    @ApiAction
    public Result deleteGoodsFeedbackComment(Http.Request request, Long businessId) throws Exception {
        JsonNode nodedeleteGoodsFeedbackCommentRequest = request.body().asJson();
        DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest;
        if (nodedeleteGoodsFeedbackCommentRequest != null) {
            deleteGoodsFeedbackCommentRequest = mapper.readValue(nodedeleteGoodsFeedbackCommentRequest.toString(), DeleteGoodsFeedbackCommentRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteGoodsFeedbackCommentRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeleteGoodsFeedbackCommentRequest' parameter is required");
        }
        return imp.deleteGoodsFeedbackCommentHttp(request, businessId, deleteGoodsFeedbackCommentRequest);
    }

    @ApiAction
    public Result deleteHiddenOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodedeleteHiddenOffersRequest = request.body().asJson();
        DeleteHiddenOffersRequest deleteHiddenOffersRequest;
        if (nodedeleteHiddenOffersRequest != null) {
            deleteHiddenOffersRequest = mapper.readValue(nodedeleteHiddenOffersRequest.toString(), DeleteHiddenOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteHiddenOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeleteHiddenOffersRequest' parameter is required");
        }
        return imp.deleteHiddenOffersHttp(request, campaignId, deleteHiddenOffersRequest);
    }

    @ApiAction
    public Result deleteOffers(Http.Request request, Long businessId) throws Exception {
        JsonNode nodedeleteOffersRequest = request.body().asJson();
        DeleteOffersRequest deleteOffersRequest;
        if (nodedeleteOffersRequest != null) {
            deleteOffersRequest = mapper.readValue(nodedeleteOffersRequest.toString(), DeleteOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeleteOffersRequest' parameter is required");
        }
        return imp.deleteOffersHttp(request, businessId, deleteOffersRequest);
    }

    @ApiAction
    public Result deleteOffersFromArchive(Http.Request request, Long businessId) throws Exception {
        JsonNode nodedeleteOffersFromArchiveRequest = request.body().asJson();
        DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest;
        if (nodedeleteOffersFromArchiveRequest != null) {
            deleteOffersFromArchiveRequest = mapper.readValue(nodedeleteOffersFromArchiveRequest.toString(), DeleteOffersFromArchiveRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteOffersFromArchiveRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeleteOffersFromArchiveRequest' parameter is required");
        }
        return imp.deleteOffersFromArchiveHttp(request, businessId, deleteOffersFromArchiveRequest);
    }

    @ApiAction
    public Result deleteOutlet(Http.Request request, Long campaignId,Long outletId) throws Exception {
        return imp.deleteOutletHttp(request, campaignId, outletId);
    }

    @ApiAction
    public Result deleteOutletLicenses(Http.Request request, Long campaignId) throws Exception {
        String[] idsArray = request.queryString().get("ids");
        List<String> idsList = OpenAPIUtils.parametersToList("csv", idsArray);
        Set<Long> ids = new LinkedHashSet<>();
        for (String curParam : idsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                ids.add(Long.parseLong(curParam));
            }
        }
        return imp.deleteOutletLicensesHttp(request, campaignId, ids);
    }

    @ApiAction
    public Result deletePromoOffers(Http.Request request, Long businessId) throws Exception {
        JsonNode nodedeletePromoOffersRequest = request.body().asJson();
        DeletePromoOffersRequest deletePromoOffersRequest;
        if (nodedeletePromoOffersRequest != null) {
            deletePromoOffersRequest = mapper.readValue(nodedeletePromoOffersRequest.toString(), DeletePromoOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deletePromoOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeletePromoOffersRequest' parameter is required");
        }
        return imp.deletePromoOffersHttp(request, businessId, deletePromoOffersRequest);
    }

    @ApiAction
    public Result generateBoostConsolidatedReport(Http.Request request) throws Exception {
        JsonNode nodegenerateBoostConsolidatedRequest = request.body().asJson();
        GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest;
        if (nodegenerateBoostConsolidatedRequest != null) {
            generateBoostConsolidatedRequest = mapper.readValue(nodegenerateBoostConsolidatedRequest.toString(), GenerateBoostConsolidatedRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateBoostConsolidatedRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateBoostConsolidatedRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateBoostConsolidatedReportHttp(request, generateBoostConsolidatedRequest, format);
    }

    @ApiAction
    public Result generateCompetitorsPositionReport(Http.Request request) throws Exception {
        JsonNode nodegenerateCompetitorsPositionReportRequest = request.body().asJson();
        GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest;
        if (nodegenerateCompetitorsPositionReportRequest != null) {
            generateCompetitorsPositionReportRequest = mapper.readValue(nodegenerateCompetitorsPositionReportRequest.toString(), GenerateCompetitorsPositionReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateCompetitorsPositionReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateCompetitorsPositionReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateCompetitorsPositionReportHttp(request, generateCompetitorsPositionReportRequest, format);
    }

    @ApiAction
    public Result generateGoodsFeedbackReport(Http.Request request) throws Exception {
        JsonNode nodegenerateGoodsFeedbackRequest = request.body().asJson();
        GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest;
        if (nodegenerateGoodsFeedbackRequest != null) {
            generateGoodsFeedbackRequest = mapper.readValue(nodegenerateGoodsFeedbackRequest.toString(), GenerateGoodsFeedbackRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateGoodsFeedbackRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateGoodsFeedbackRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateGoodsFeedbackReportHttp(request, generateGoodsFeedbackRequest, format);
    }

    @ApiAction
    public Result generateMassOrderLabelsReport(Http.Request request) throws Exception {
        JsonNode nodegenerateMassOrderLabelsRequest = request.body().asJson();
        GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest;
        if (nodegenerateMassOrderLabelsRequest != null) {
            generateMassOrderLabelsRequest = mapper.readValue(nodegenerateMassOrderLabelsRequest.toString(), GenerateMassOrderLabelsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateMassOrderLabelsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateMassOrderLabelsRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        PageFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateMassOrderLabelsReportHttp(request, generateMassOrderLabelsRequest, format);
    }

    @ApiAction
    public Result generateOrderLabel(Http.Request request, Long campaignId,Long orderId,Long shipmentId,Long boxId) throws Exception {
        String valueformat = request.getQueryString("format");
        PageFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateOrderLabelHttp(request, campaignId, orderId, shipmentId, boxId, format);
    }

    @ApiAction
    public Result generateOrderLabels(Http.Request request, Long campaignId,Long orderId) throws Exception {
        String valueformat = request.getQueryString("format");
        PageFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateOrderLabelsHttp(request, campaignId, orderId, format);
    }

    @ApiAction
    public Result generatePricesReport(Http.Request request) throws Exception {
        JsonNode nodegeneratePricesReportRequest = request.body().asJson();
        GeneratePricesReportRequest generatePricesReportRequest;
        if (nodegeneratePricesReportRequest != null) {
            generatePricesReportRequest = mapper.readValue(nodegeneratePricesReportRequest.toString(), GeneratePricesReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generatePricesReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GeneratePricesReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generatePricesReportHttp(request, generatePricesReportRequest, format);
    }

    @ApiAction
    public Result generateShelfsStatisticsReport(Http.Request request) throws Exception {
        JsonNode nodegenerateShelfsStatisticsRequest = request.body().asJson();
        GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest;
        if (nodegenerateShelfsStatisticsRequest != null) {
            generateShelfsStatisticsRequest = mapper.readValue(nodegenerateShelfsStatisticsRequest.toString(), GenerateShelfsStatisticsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateShelfsStatisticsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateShelfsStatisticsRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateShelfsStatisticsReportHttp(request, generateShelfsStatisticsRequest, format);
    }

    @ApiAction
    public Result generateShowsSalesReport(Http.Request request) throws Exception {
        JsonNode nodegenerateShowsSalesReportRequest = request.body().asJson();
        GenerateShowsSalesReportRequest generateShowsSalesReportRequest;
        if (nodegenerateShowsSalesReportRequest != null) {
            generateShowsSalesReportRequest = mapper.readValue(nodegenerateShowsSalesReportRequest.toString(), GenerateShowsSalesReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateShowsSalesReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateShowsSalesReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateShowsSalesReportHttp(request, generateShowsSalesReportRequest, format);
    }

    @ApiAction
    public Result generateStocksOnWarehousesReport(Http.Request request) throws Exception {
        JsonNode nodegenerateStocksOnWarehousesReportRequest = request.body().asJson();
        GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest;
        if (nodegenerateStocksOnWarehousesReportRequest != null) {
            generateStocksOnWarehousesReportRequest = mapper.readValue(nodegenerateStocksOnWarehousesReportRequest.toString(), GenerateStocksOnWarehousesReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateStocksOnWarehousesReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateStocksOnWarehousesReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateStocksOnWarehousesReportHttp(request, generateStocksOnWarehousesReportRequest, format);
    }

    @ApiAction
    public Result generateUnitedMarketplaceServicesReport(Http.Request request) throws Exception {
        JsonNode nodegenerateUnitedMarketplaceServicesReportRequest = request.body().asJson();
        GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest;
        if (nodegenerateUnitedMarketplaceServicesReportRequest != null) {
            generateUnitedMarketplaceServicesReportRequest = mapper.readValue(nodegenerateUnitedMarketplaceServicesReportRequest.toString(), GenerateUnitedMarketplaceServicesReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateUnitedMarketplaceServicesReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateUnitedMarketplaceServicesReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateUnitedMarketplaceServicesReportHttp(request, generateUnitedMarketplaceServicesReportRequest, format);
    }

    @ApiAction
    public Result generateUnitedNettingReport(Http.Request request) throws Exception {
        JsonNode nodegenerateUnitedNettingReportRequest = request.body().asJson();
        GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest;
        if (nodegenerateUnitedNettingReportRequest != null) {
            generateUnitedNettingReportRequest = mapper.readValue(nodegenerateUnitedNettingReportRequest.toString(), GenerateUnitedNettingReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateUnitedNettingReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateUnitedNettingReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateUnitedNettingReportHttp(request, generateUnitedNettingReportRequest, format);
    }

    @ApiAction
    public Result generateUnitedOrdersReport(Http.Request request) throws Exception {
        JsonNode nodegenerateUnitedOrdersRequest = request.body().asJson();
        GenerateUnitedOrdersRequest generateUnitedOrdersRequest;
        if (nodegenerateUnitedOrdersRequest != null) {
            generateUnitedOrdersRequest = mapper.readValue(nodegenerateUnitedOrdersRequest.toString(), GenerateUnitedOrdersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateUnitedOrdersRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateUnitedOrdersRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateUnitedOrdersReportHttp(request, generateUnitedOrdersRequest, format);
    }

    @ApiAction
    public Result getAllOffers(Http.Request request, Long campaignId) throws Exception {
        String valuefeedId = request.getQueryString("feedId");
        Long feedId;
        if (valuefeedId != null) {
            feedId = Long.parseLong(valuefeedId);
        } else {
            feedId = null;
        }
        String valuechunk = request.getQueryString("chunk");
        Integer chunk;
        if (valuechunk != null) {
            chunk = Integer.parseInt(valuechunk);
        } else {
            chunk = null;
        }
        return imp.getAllOffersHttp(request, campaignId, feedId, chunk);
    }

    @ApiAction
    public Result getBidsInfoForBusiness(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetBidsInfoRequest = request.body().asJson();
        GetBidsInfoRequest getBidsInfoRequest;
        if (nodegetBidsInfoRequest != null) {
            getBidsInfoRequest = mapper.readValue(nodegetBidsInfoRequest.toString(), GetBidsInfoRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getBidsInfoRequest);
            }
        } else {
            getBidsInfoRequest = null;
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getBidsInfoForBusinessHttp(request, businessId, pageToken, limit, getBidsInfoRequest);
    }

    @ApiAction
    public Result getBidsRecommendations(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetBidsRecommendationsRequest = request.body().asJson();
        GetBidsRecommendationsRequest getBidsRecommendationsRequest;
        if (nodegetBidsRecommendationsRequest != null) {
            getBidsRecommendationsRequest = mapper.readValue(nodegetBidsRecommendationsRequest.toString(), GetBidsRecommendationsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getBidsRecommendationsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetBidsRecommendationsRequest' parameter is required");
        }
        return imp.getBidsRecommendationsHttp(request, businessId, getBidsRecommendationsRequest);
    }

    @ApiAction
    public Result getBusinessQuarantineOffers(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetQuarantineOffersRequest = request.body().asJson();
        GetQuarantineOffersRequest getQuarantineOffersRequest;
        if (nodegetQuarantineOffersRequest != null) {
            getQuarantineOffersRequest = mapper.readValue(nodegetQuarantineOffersRequest.toString(), GetQuarantineOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getQuarantineOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetQuarantineOffersRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getBusinessQuarantineOffersHttp(request, businessId, getQuarantineOffersRequest, pageToken, limit);
    }

    @ApiAction
    public Result getBusinessSettings(Http.Request request, Long businessId) throws Exception {
        return imp.getBusinessSettingsHttp(request, businessId);
    }

    @ApiAction
    public Result getCampaign(Http.Request request, Long campaignId) throws Exception {
        return imp.getCampaignHttp(request, campaignId);
    }

    @ApiAction
    public Result getCampaignLogins(Http.Request request, Long campaignId) throws Exception {
        return imp.getCampaignLoginsHttp(request, campaignId);
    }

    @ApiAction
    public Result getCampaignOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetCampaignOffersRequest = request.body().asJson();
        GetCampaignOffersRequest getCampaignOffersRequest;
        if (nodegetCampaignOffersRequest != null) {
            getCampaignOffersRequest = mapper.readValue(nodegetCampaignOffersRequest.toString(), GetCampaignOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getCampaignOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetCampaignOffersRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getCampaignOffersHttp(request, campaignId, getCampaignOffersRequest, pageToken, limit);
    }

    @ApiAction
    public Result getCampaignQuarantineOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetQuarantineOffersRequest = request.body().asJson();
        GetQuarantineOffersRequest getQuarantineOffersRequest;
        if (nodegetQuarantineOffersRequest != null) {
            getQuarantineOffersRequest = mapper.readValue(nodegetQuarantineOffersRequest.toString(), GetQuarantineOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getQuarantineOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetQuarantineOffersRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getCampaignQuarantineOffersHttp(request, campaignId, getQuarantineOffersRequest, pageToken, limit);
    }

    @ApiAction
    public Result getCampaignRegion(Http.Request request, Long campaignId) throws Exception {
        return imp.getCampaignRegionHttp(request, campaignId);
    }

    @ApiAction
    public Result getCampaignSettings(Http.Request request, Long campaignId) throws Exception {
        return imp.getCampaignSettingsHttp(request, campaignId);
    }

    @ApiAction
    public Result getCampaigns(Http.Request request) throws Exception {
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        String valuepageSize = request.getQueryString("pageSize");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = null;
        }
        return imp.getCampaignsHttp(request, page, pageSize);
    }

    @ApiAction
    public Result getCampaignsByLogin(Http.Request request, String login) throws Exception {
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        String valuepageSize = request.getQueryString("pageSize");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = null;
        }
        return imp.getCampaignsByLoginHttp(request, login, page, pageSize);
    }

    @ApiAction
    public Result getCategoriesMaxSaleQuantum(Http.Request request) throws Exception {
        JsonNode nodegetCategoriesMaxSaleQuantumRequest = request.body().asJson();
        GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest;
        if (nodegetCategoriesMaxSaleQuantumRequest != null) {
            getCategoriesMaxSaleQuantumRequest = mapper.readValue(nodegetCategoriesMaxSaleQuantumRequest.toString(), GetCategoriesMaxSaleQuantumRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getCategoriesMaxSaleQuantumRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetCategoriesMaxSaleQuantumRequest' parameter is required");
        }
        return imp.getCategoriesMaxSaleQuantumHttp(request, getCategoriesMaxSaleQuantumRequest);
    }

    @ApiAction
    public Result getCategoriesTree(Http.Request request) throws Exception {
        JsonNode nodegetCategoriesRequest = request.body().asJson();
        GetCategoriesRequest getCategoriesRequest;
        if (nodegetCategoriesRequest != null) {
            getCategoriesRequest = mapper.readValue(nodegetCategoriesRequest.toString(), GetCategoriesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getCategoriesRequest);
            }
        } else {
            getCategoriesRequest = null;
        }
        return imp.getCategoriesTreeHttp(request, getCategoriesRequest);
    }

    @ApiAction
    public Result getCategoryContentParameters(Http.Request request, Long categoryId) throws Exception {
        return imp.getCategoryContentParametersHttp(request, categoryId);
    }

    @ApiAction
    public Result getChatHistory(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetChatHistoryRequest = request.body().asJson();
        GetChatHistoryRequest getChatHistoryRequest;
        if (nodegetChatHistoryRequest != null) {
            getChatHistoryRequest = mapper.readValue(nodegetChatHistoryRequest.toString(), GetChatHistoryRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getChatHistoryRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetChatHistoryRequest' parameter is required");
        }
        String valuechatId = request.getQueryString("chatId");
        Long chatId;
        if (valuechatId != null) {
            chatId = Long.parseLong(valuechatId);
        } else {
            throw new IllegalArgumentException("'chatId' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getChatHistoryHttp(request, businessId, chatId, getChatHistoryRequest, pageToken, limit);
    }

    @ApiAction
    public Result getChats(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetChatsRequest = request.body().asJson();
        GetChatsRequest getChatsRequest;
        if (nodegetChatsRequest != null) {
            getChatsRequest = mapper.readValue(nodegetChatsRequest.toString(), GetChatsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getChatsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetChatsRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getChatsHttp(request, businessId, getChatsRequest, pageToken, limit);
    }

    @ApiAction
    public Result getDeliveryServices(Http.Request request) throws Exception {
        return imp.getDeliveryServicesHttp(request);
    }

    @ApiAction
    public Result getFeed(Http.Request request, Long campaignId,Long feedId) throws Exception {
        return imp.getFeedHttp(request, campaignId, feedId);
    }

    @ApiAction
    public Result getFeedIndexLogs(Http.Request request, Long campaignId,Long feedId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuepublishedTimeFrom = request.getQueryString("published_time_from");
        OffsetDateTime publishedTimeFrom;
        if (valuepublishedTimeFrom != null) {
            publishedTimeFrom = OffsetDateTime.parse(valuepublishedTimeFrom);
        } else {
            publishedTimeFrom = null;
        }
        String valuepublishedTimeTo = request.getQueryString("published_time_to");
        OffsetDateTime publishedTimeTo;
        if (valuepublishedTimeTo != null) {
            publishedTimeTo = OffsetDateTime.parse(valuepublishedTimeTo);
        } else {
            publishedTimeTo = null;
        }
        String valuestatus = request.getQueryString("status");
        FeedIndexLogsStatusType status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            status = null;
        }
        return imp.getFeedIndexLogsHttp(request, campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status);
    }

    @ApiAction
    public Result getFeedbackAndCommentUpdates(Http.Request request, Long campaignId) throws Exception {
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuefromDate = request.getQueryString("from_date");
        LocalDate fromDate;
        if (valuefromDate != null) {
            fromDate = LocalDate.parse(valuefromDate);
        } else {
            fromDate = null;
        }
        return imp.getFeedbackAndCommentUpdatesHttp(request, campaignId, pageToken, limit, fromDate);
    }

    @ApiAction
    public Result getFeeds(Http.Request request, Long campaignId) throws Exception {
        return imp.getFeedsHttp(request, campaignId);
    }

    @ApiAction
    public Result getGoodsFeedbackComments(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetGoodsFeedbackCommentsRequest = request.body().asJson();
        GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest;
        if (nodegetGoodsFeedbackCommentsRequest != null) {
            getGoodsFeedbackCommentsRequest = mapper.readValue(nodegetGoodsFeedbackCommentsRequest.toString(), GetGoodsFeedbackCommentsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getGoodsFeedbackCommentsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetGoodsFeedbackCommentsRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getGoodsFeedbackCommentsHttp(request, businessId, getGoodsFeedbackCommentsRequest, pageToken, limit);
    }

    @ApiAction
    public Result getGoodsFeedbacks(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetGoodsFeedbackRequest = request.body().asJson();
        GetGoodsFeedbackRequest getGoodsFeedbackRequest;
        if (nodegetGoodsFeedbackRequest != null) {
            getGoodsFeedbackRequest = mapper.readValue(nodegetGoodsFeedbackRequest.toString(), GetGoodsFeedbackRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getGoodsFeedbackRequest);
            }
        } else {
            getGoodsFeedbackRequest = null;
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getGoodsFeedbacksHttp(request, businessId, pageToken, limit, getGoodsFeedbackRequest);
    }

    @ApiAction
    public Result getGoodsStats(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetGoodsStatsRequest = request.body().asJson();
        GetGoodsStatsRequest getGoodsStatsRequest;
        if (nodegetGoodsStatsRequest != null) {
            getGoodsStatsRequest = mapper.readValue(nodegetGoodsStatsRequest.toString(), GetGoodsStatsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getGoodsStatsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetGoodsStatsRequest' parameter is required");
        }
        return imp.getGoodsStatsHttp(request, campaignId, getGoodsStatsRequest);
    }

    @ApiAction
    public Result getHiddenOffers(Http.Request request, Long campaignId) throws Exception {
        String[] offerIdArray = request.queryString().get("offer_id");
        List<String> offerIdList = OpenAPIUtils.parametersToList("csv", offerIdArray);
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId = new ArrayList<>();
        for (String curParam : offerIdList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                offerId.add(curParam);
            }
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        String valuepageSize = request.getQueryString("pageSize");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = null;
        }
        return imp.getHiddenOffersHttp(request, campaignId, offerId, pageToken, limit, offset, page, pageSize);
    }

    @ApiAction
    public Result getModel(Http.Request request,  @Min(0)Long modelId) throws Exception {
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        return imp.getModelHttp(request, modelId, regionId, currency);
    }

    @ApiAction
    public Result getModelOffers(Http.Request request,  @Min(0)Long modelId) throws Exception {
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        String valueorderByPrice = request.getQueryString("orderByPrice");
        SortOrderType orderByPrice;
        if (valueorderByPrice != null) {
            orderByPrice = valueorderByPrice;
        } else {
            orderByPrice = null;
        }
        String valuecount = request.getQueryString("count");
        Integer count;
        if (valuecount != null) {
            count = Integer.parseInt(valuecount);
        } else {
            count = 10;
        }
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        return imp.getModelOffersHttp(request, modelId, regionId, currency, orderByPrice, count, page);
    }

    @ApiAction
    public Result getModels(Http.Request request) throws Exception {
        JsonNode nodegetModelsRequest = request.body().asJson();
        GetModelsRequest getModelsRequest;
        if (nodegetModelsRequest != null) {
            getModelsRequest = mapper.readValue(nodegetModelsRequest.toString(), GetModelsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getModelsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetModelsRequest' parameter is required");
        }
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        return imp.getModelsHttp(request, regionId, getModelsRequest, currency);
    }

    @ApiAction
    public Result getModelsOffers(Http.Request request) throws Exception {
        JsonNode nodegetModelsRequest = request.body().asJson();
        GetModelsRequest getModelsRequest;
        if (nodegetModelsRequest != null) {
            getModelsRequest = mapper.readValue(nodegetModelsRequest.toString(), GetModelsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getModelsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetModelsRequest' parameter is required");
        }
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        String valueorderByPrice = request.getQueryString("orderByPrice");
        SortOrderType orderByPrice;
        if (valueorderByPrice != null) {
            orderByPrice = valueorderByPrice;
        } else {
            orderByPrice = null;
        }
        return imp.getModelsOffersHttp(request, regionId, getModelsRequest, currency, orderByPrice);
    }

    @ApiAction
    public Result getOfferCardsContentStatus(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetOfferCardsContentStatusRequest = request.body().asJson();
        GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest;
        if (nodegetOfferCardsContentStatusRequest != null) {
            getOfferCardsContentStatusRequest = mapper.readValue(nodegetOfferCardsContentStatusRequest.toString(), GetOfferCardsContentStatusRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getOfferCardsContentStatusRequest);
            }
        } else {
            getOfferCardsContentStatusRequest = null;
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getOfferCardsContentStatusHttp(request, businessId, pageToken, limit, getOfferCardsContentStatusRequest);
    }

    @ApiAction
    public Result getOfferMappingEntries(Http.Request request, Long campaignId) throws Exception {
        String[] offerIdArray = request.queryString().get("offer_id");
        List<String> offerIdList = OpenAPIUtils.parametersToList("csv", offerIdArray);
        List<String> offerId = new ArrayList<>();
        for (String curParam : offerIdList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                offerId.add(curParam);
            }
        }
        String[] shopSkuArray = request.queryString().get("shop_sku");
        List<String> shopSkuList = OpenAPIUtils.parametersToList("csv", shopSkuArray);
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku = new ArrayList<>();
        for (String curParam : shopSkuList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                shopSku.add(curParam);
            }
        }
        String valuemappingKind = request.getQueryString("mapping_kind");
        OfferMappingKindType mappingKind;
        if (valuemappingKind != null) {
            mappingKind = valuemappingKind;
        } else {
            mappingKind = null;
        }
        String[] statusArray = request.queryString().get("status");
        List<String> statusList = OpenAPIUtils.parametersToList("csv", statusArray);
        List<OfferProcessingStatusType> status = new ArrayList<>();
        for (String curParam : statusList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                status.add(curParam);
            }
        }
        String[] availabilityArray = request.queryString().get("availability");
        List<String> availabilityList = OpenAPIUtils.parametersToList("csv", availabilityArray);
        List<OfferAvailabilityStatusType> availability = new ArrayList<>();
        for (String curParam : availabilityList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                availability.add(curParam);
            }
        }
        String[] categoryIdArray = request.queryString().get("category_id");
        List<String> categoryIdList = OpenAPIUtils.parametersToList("csv", categoryIdArray);
        List<Integer> categoryId = new ArrayList<>();
        for (String curParam : categoryIdList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                categoryId.add(Integer.parseInt(curParam));
            }
        }
        String[] vendorArray = request.queryString().get("vendor");
        List<String> vendorList = OpenAPIUtils.parametersToList("csv", vendorArray);
        List<String> vendor = new ArrayList<>();
        for (String curParam : vendorList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                vendor.add(curParam);
            }
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getOfferMappingEntriesHttp(request, campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit);
    }

    @ApiAction
    public Result getOfferMappings(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetOfferMappingsRequest = request.body().asJson();
        GetOfferMappingsRequest getOfferMappingsRequest;
        if (nodegetOfferMappingsRequest != null) {
            getOfferMappingsRequest = mapper.readValue(nodegetOfferMappingsRequest.toString(), GetOfferMappingsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getOfferMappingsRequest);
            }
        } else {
            getOfferMappingsRequest = null;
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getOfferMappingsHttp(request, businessId, pageToken, limit, getOfferMappingsRequest);
    }

    @ApiAction
    public Result getOfferRecommendations(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetOfferRecommendationsRequest = request.body().asJson();
        GetOfferRecommendationsRequest getOfferRecommendationsRequest;
        if (nodegetOfferRecommendationsRequest != null) {
            getOfferRecommendationsRequest = mapper.readValue(nodegetOfferRecommendationsRequest.toString(), GetOfferRecommendationsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getOfferRecommendationsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetOfferRecommendationsRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getOfferRecommendationsHttp(request, businessId, getOfferRecommendationsRequest, pageToken, limit);
    }

    @ApiAction
    public Result getOffers(Http.Request request, Long campaignId) throws Exception {
        String valuequery = request.getQueryString("query");
        String query;
        if (valuequery != null) {
            query = valuequery;
        } else {
            query = null;
        }
        String valuefeedId = request.getQueryString("feedId");
        Long feedId;
        if (valuefeedId != null) {
            feedId = Long.parseLong(valuefeedId);
        } else {
            feedId = null;
        }
        String valueshopCategoryId = request.getQueryString("shopCategoryId");
        String shopCategoryId;
        if (valueshopCategoryId != null) {
            shopCategoryId = valueshopCategoryId;
        } else {
            shopCategoryId = null;
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        String valuematched = request.getQueryString("matched");
        Boolean matched;
        if (valuematched != null) {
            matched = Boolean.valueOf(valuematched);
        } else {
            matched = null;
        }
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        String valuepageSize = request.getQueryString("pageSize");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = null;
        }
        return imp.getOffersHttp(request, campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize);
    }

    @ApiAction
    public Result getOrder(Http.Request request, Long campaignId,Long orderId) throws Exception {
        return imp.getOrderHttp(request, campaignId, orderId);
    }

    @ApiAction
    public Result getOrderBusinessBuyerInfo(Http.Request request, Long campaignId,Long orderId) throws Exception {
        return imp.getOrderBusinessBuyerInfoHttp(request, campaignId, orderId);
    }

    @ApiAction
    public Result getOrderBusinessDocumentsInfo(Http.Request request, Long campaignId,Long orderId) throws Exception {
        return imp.getOrderBusinessDocumentsInfoHttp(request, campaignId, orderId);
    }

    @ApiAction
    public Result getOrderBuyerInfo(Http.Request request, Long campaignId,Long orderId) throws Exception {
        return imp.getOrderBuyerInfoHttp(request, campaignId, orderId);
    }

    @ApiAction
    public Result getOrderLabelsData(Http.Request request, Long campaignId,Long orderId) throws Exception {
        return imp.getOrderLabelsDataHttp(request, campaignId, orderId);
    }

    @ApiAction
    public Result getOrders(Http.Request request, Long campaignId) throws Exception {
        String[] orderIdsArray = request.queryString().get("orderIds");
        List<String> orderIdsList = OpenAPIUtils.parametersToList("csv", orderIdsArray);
        List<Long> orderIds = new ArrayList<>();
        for (String curParam : orderIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                orderIds.add(Long.parseLong(curParam));
            }
        }
        String[] statusArray = request.queryString().get("status");
        List<String> statusList = OpenAPIUtils.parametersToList("csv", statusArray);
        Set<OrderStatusType> status = new LinkedHashSet<>();
        for (String curParam : statusList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                status.add(curParam);
            }
        }
        String[] substatusArray = request.queryString().get("substatus");
        List<String> substatusList = OpenAPIUtils.parametersToList("csv", substatusArray);
        Set<OrderSubstatusType> substatus = new LinkedHashSet<>();
        for (String curParam : substatusList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                substatus.add(curParam);
            }
        }
        String valuefromDate = request.getQueryString("fromDate");
        LocalDate fromDate;
        if (valuefromDate != null) {
            fromDate = LocalDate.parse(valuefromDate);
        } else {
            fromDate = null;
        }
        String valuetoDate = request.getQueryString("toDate");
        LocalDate toDate;
        if (valuetoDate != null) {
            toDate = LocalDate.parse(valuetoDate);
        } else {
            toDate = null;
        }
        String valuesupplierShipmentDateFrom = request.getQueryString("supplierShipmentDateFrom");
        LocalDate supplierShipmentDateFrom;
        if (valuesupplierShipmentDateFrom != null) {
            supplierShipmentDateFrom = LocalDate.parse(valuesupplierShipmentDateFrom);
        } else {
            supplierShipmentDateFrom = null;
        }
        String valuesupplierShipmentDateTo = request.getQueryString("supplierShipmentDateTo");
        LocalDate supplierShipmentDateTo;
        if (valuesupplierShipmentDateTo != null) {
            supplierShipmentDateTo = LocalDate.parse(valuesupplierShipmentDateTo);
        } else {
            supplierShipmentDateTo = null;
        }
        String valueupdatedAtFrom = request.getQueryString("updatedAtFrom");
        OffsetDateTime updatedAtFrom;
        if (valueupdatedAtFrom != null) {
            updatedAtFrom = OffsetDateTime.parse(valueupdatedAtFrom);
        } else {
            updatedAtFrom = null;
        }
        String valueupdatedAtTo = request.getQueryString("updatedAtTo");
        OffsetDateTime updatedAtTo;
        if (valueupdatedAtTo != null) {
            updatedAtTo = OffsetDateTime.parse(valueupdatedAtTo);
        } else {
            updatedAtTo = null;
        }
        String valuedispatchType = request.getQueryString("dispatchType");
        OrderDeliveryDispatchType dispatchType;
        if (valuedispatchType != null) {
            dispatchType = valuedispatchType;
        } else {
            dispatchType = null;
        }
        String valuefake = request.getQueryString("fake");
        Boolean fake;
        if (valuefake != null) {
            fake = Boolean.valueOf(valuefake);
        } else {
            fake = false;
        }
        String valuehasCis = request.getQueryString("hasCis");
        Boolean hasCis;
        if (valuehasCis != null) {
            hasCis = Boolean.valueOf(valuehasCis);
        } else {
            hasCis = false;
        }
        String valueonlyWaitingForCancellationApprove = request.getQueryString("onlyWaitingForCancellationApprove");
        Boolean onlyWaitingForCancellationApprove;
        if (valueonlyWaitingForCancellationApprove != null) {
            onlyWaitingForCancellationApprove = Boolean.valueOf(valueonlyWaitingForCancellationApprove);
        } else {
            onlyWaitingForCancellationApprove = false;
        }
        String valueonlyEstimatedDelivery = request.getQueryString("onlyEstimatedDelivery");
        Boolean onlyEstimatedDelivery;
        if (valueonlyEstimatedDelivery != null) {
            onlyEstimatedDelivery = Boolean.valueOf(valueonlyEstimatedDelivery);
        } else {
            onlyEstimatedDelivery = false;
        }
        String valuebuyerType = request.getQueryString("buyerType");
        OrderBuyerType buyerType;
        if (valuebuyerType != null) {
            buyerType = valuebuyerType;
        } else {
            buyerType = null;
        }
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        String valuepageSize = request.getQueryString("pageSize");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = null;
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getOrdersHttp(request, campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit);
    }

    @ApiAction
    public Result getOrdersStats(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetOrdersStatsRequest = request.body().asJson();
        GetOrdersStatsRequest getOrdersStatsRequest;
        if (nodegetOrdersStatsRequest != null) {
            getOrdersStatsRequest = mapper.readValue(nodegetOrdersStatsRequest.toString(), GetOrdersStatsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getOrdersStatsRequest);
            }
        } else {
            getOrdersStatsRequest = null;
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getOrdersStatsHttp(request, campaignId, pageToken, limit, getOrdersStatsRequest);
    }

    @ApiAction
    public Result getOutlet(Http.Request request, Long campaignId,Long outletId) throws Exception {
        return imp.getOutletHttp(request, campaignId, outletId);
    }

    @ApiAction
    public Result getOutletLicenses(Http.Request request, Long campaignId) throws Exception {
        String[] outletIdsArray = request.queryString().get("outletIds");
        List<String> outletIdsList = OpenAPIUtils.parametersToList("csv", outletIdsArray);
        Set<Long> outletIds = new LinkedHashSet<>();
        for (String curParam : outletIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                outletIds.add(Long.parseLong(curParam));
            }
        }
        String[] idsArray = request.queryString().get("ids");
        List<String> idsList = OpenAPIUtils.parametersToList("csv", idsArray);
        Set<Long> ids = new LinkedHashSet<>();
        for (String curParam : idsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                ids.add(Long.parseLong(curParam));
            }
        }
        return imp.getOutletLicensesHttp(request, campaignId, outletIds, ids);
    }

    @ApiAction
    public Result getOutlets(Http.Request request, Long campaignId) throws Exception {
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valueregionId = request.getQueryString("region_id");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            regionId = null;
        }
        String valueshopOutletCode = request.getQueryString("shop_outlet_code");
        String shopOutletCode;
        if (valueshopOutletCode != null) {
            shopOutletCode = valueshopOutletCode;
        } else {
            shopOutletCode = null;
        }
        String valueregionId2 = request.getQueryString("regionId");
        Long regionId2;
        if (valueregionId2 != null) {
            regionId2 = Long.parseLong(valueregionId2);
        } else {
            regionId2 = null;
        }
        return imp.getOutletsHttp(request, campaignId, pageToken, regionId, shopOutletCode, regionId2);
    }

    @ApiAction
    public Result getPrices(Http.Request request, Long campaignId) throws Exception {
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuearchived = request.getQueryString("archived");
        Boolean archived;
        if (valuearchived != null) {
            archived = Boolean.valueOf(valuearchived);
        } else {
            archived = false;
        }
        return imp.getPricesHttp(request, campaignId, pageToken, limit, archived);
    }

    @ApiAction
    public Result getPricesByOfferIds(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetPricesByOfferIdsRequest = request.body().asJson();
        GetPricesByOfferIdsRequest getPricesByOfferIdsRequest;
        if (nodegetPricesByOfferIdsRequest != null) {
            getPricesByOfferIdsRequest = mapper.readValue(nodegetPricesByOfferIdsRequest.toString(), GetPricesByOfferIdsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getPricesByOfferIdsRequest);
            }
        } else {
            getPricesByOfferIdsRequest = null;
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getPricesByOfferIdsHttp(request, campaignId, pageToken, limit, getPricesByOfferIdsRequest);
    }

    @ApiAction
    public Result getPromoOffers(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetPromoOffersRequest = request.body().asJson();
        GetPromoOffersRequest getPromoOffersRequest;
        if (nodegetPromoOffersRequest != null) {
            getPromoOffersRequest = mapper.readValue(nodegetPromoOffersRequest.toString(), GetPromoOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getPromoOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetPromoOffersRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getPromoOffersHttp(request, businessId, getPromoOffersRequest, pageToken, limit);
    }

    @ApiAction
    public Result getPromos(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetPromosRequest = request.body().asJson();
        GetPromosRequest getPromosRequest;
        if (nodegetPromosRequest != null) {
            getPromosRequest = mapper.readValue(nodegetPromosRequest.toString(), GetPromosRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getPromosRequest);
            }
        } else {
            getPromosRequest = null;
        }
        return imp.getPromosHttp(request, businessId, getPromosRequest);
    }

    @ApiAction
    public Result getQualityRatingDetails(Http.Request request, Long campaignId) throws Exception {
        return imp.getQualityRatingDetailsHttp(request, campaignId);
    }

    @ApiAction
    public Result getQualityRatings(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetQualityRatingRequest = request.body().asJson();
        GetQualityRatingRequest getQualityRatingRequest;
        if (nodegetQualityRatingRequest != null) {
            getQualityRatingRequest = mapper.readValue(nodegetQualityRatingRequest.toString(), GetQualityRatingRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getQualityRatingRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetQualityRatingRequest' parameter is required");
        }
        return imp.getQualityRatingsHttp(request, businessId, getQualityRatingRequest);
    }

    @ApiAction
    public Result getReportInfo(Http.Request request, String reportId) throws Exception {
        return imp.getReportInfoHttp(request, reportId);
    }

    @ApiAction
    public Result getReturn(Http.Request request, Long campaignId,Long orderId,Long returnId) throws Exception {
        return imp.getReturnHttp(request, campaignId, orderId, returnId);
    }

    @ApiAction
    public Result getReturnApplication(Http.Request request, Long campaignId,Long orderId,Long returnId) throws Exception {
        return imp.getReturnApplicationHttp(request, campaignId, orderId, returnId);
    }

    @ApiAction
    public Result getReturnPhoto(Http.Request request, Long campaignId,Long orderId,Long returnId,Long itemId,String imageHash) throws Exception {
        return imp.getReturnPhotoHttp(request, campaignId, orderId, returnId, itemId, imageHash);
    }

    @ApiAction
    public Result getReturns(Http.Request request, Long campaignId) throws Exception {
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String[] orderIdsArray = request.queryString().get("orderIds");
        List<String> orderIdsList = OpenAPIUtils.parametersToList("csv", orderIdsArray);
        List<Long> orderIds = new ArrayList<>();
        for (String curParam : orderIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                orderIds.add(Long.parseLong(curParam));
            }
        }
        String[] statusesArray = request.queryString().get("statuses");
        List<String> statusesList = OpenAPIUtils.parametersToList("csv", statusesArray);
        List<RefundStatusType> statuses = new ArrayList<>();
        for (String curParam : statusesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                statuses.add(curParam);
            }
        }
        String valuetype = request.getQueryString("type");
        ReturnType type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valuefromDate = request.getQueryString("fromDate");
        LocalDate fromDate;
        if (valuefromDate != null) {
            fromDate = LocalDate.parse(valuefromDate);
        } else {
            fromDate = null;
        }
        String valuetoDate = request.getQueryString("toDate");
        LocalDate toDate;
        if (valuetoDate != null) {
            toDate = LocalDate.parse(valuetoDate);
        } else {
            toDate = null;
        }
        String valuefromDate2 = request.getQueryString("from_date");
        LocalDate fromDate2;
        if (valuefromDate2 != null) {
            fromDate2 = LocalDate.parse(valuefromDate2);
        } else {
            fromDate2 = null;
        }
        String valuetoDate2 = request.getQueryString("to_date");
        LocalDate toDate2;
        if (valuetoDate2 != null) {
            toDate2 = LocalDate.parse(valuetoDate2);
        } else {
            toDate2 = null;
        }
        return imp.getReturnsHttp(request, campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2);
    }

    @ApiAction
    public Result getStocks(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetWarehouseStocksRequest = request.body().asJson();
        GetWarehouseStocksRequest getWarehouseStocksRequest;
        if (nodegetWarehouseStocksRequest != null) {
            getWarehouseStocksRequest = mapper.readValue(nodegetWarehouseStocksRequest.toString(), GetWarehouseStocksRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getWarehouseStocksRequest);
            }
        } else {
            getWarehouseStocksRequest = null;
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getStocksHttp(request, campaignId, pageToken, limit, getWarehouseStocksRequest);
    }

    @ApiAction
    public Result getSuggestedOfferMappingEntries(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetSuggestedOfferMappingEntriesRequest = request.body().asJson();
        GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest;
        if (nodegetSuggestedOfferMappingEntriesRequest != null) {
            getSuggestedOfferMappingEntriesRequest = mapper.readValue(nodegetSuggestedOfferMappingEntriesRequest.toString(), GetSuggestedOfferMappingEntriesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getSuggestedOfferMappingEntriesRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetSuggestedOfferMappingEntriesRequest' parameter is required");
        }
        return imp.getSuggestedOfferMappingEntriesHttp(request, campaignId, getSuggestedOfferMappingEntriesRequest);
    }

    @ApiAction
    public Result getSuggestedOfferMappings(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetSuggestedOfferMappingsRequest = request.body().asJson();
        GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest;
        if (nodegetSuggestedOfferMappingsRequest != null) {
            getSuggestedOfferMappingsRequest = mapper.readValue(nodegetSuggestedOfferMappingsRequest.toString(), GetSuggestedOfferMappingsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getSuggestedOfferMappingsRequest);
            }
        } else {
            getSuggestedOfferMappingsRequest = null;
        }
        return imp.getSuggestedOfferMappingsHttp(request, businessId, getSuggestedOfferMappingsRequest);
    }

    @ApiAction
    public Result getSuggestedPrices(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodesuggestPricesRequest = request.body().asJson();
        SuggestPricesRequest suggestPricesRequest;
        if (nodesuggestPricesRequest != null) {
            suggestPricesRequest = mapper.readValue(nodesuggestPricesRequest.toString(), SuggestPricesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(suggestPricesRequest);
            }
        } else {
            throw new IllegalArgumentException("'SuggestPricesRequest' parameter is required");
        }
        return imp.getSuggestedPricesHttp(request, campaignId, suggestPricesRequest);
    }

    @ApiAction
    public Result getWarehouses(Http.Request request, Long businessId) throws Exception {
        return imp.getWarehousesHttp(request, businessId);
    }

    @ApiAction
    public Result provideOrderDigitalCodes(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeprovideOrderDigitalCodesRequest = request.body().asJson();
        ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest;
        if (nodeprovideOrderDigitalCodesRequest != null) {
            provideOrderDigitalCodesRequest = mapper.readValue(nodeprovideOrderDigitalCodesRequest.toString(), ProvideOrderDigitalCodesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(provideOrderDigitalCodesRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProvideOrderDigitalCodesRequest' parameter is required");
        }
        return imp.provideOrderDigitalCodesHttp(request, campaignId, orderId, provideOrderDigitalCodesRequest);
    }

    @ApiAction
    public Result provideOrderItemIdentifiers(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeprovideOrderItemIdentifiersRequest = request.body().asJson();
        ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest;
        if (nodeprovideOrderItemIdentifiersRequest != null) {
            provideOrderItemIdentifiersRequest = mapper.readValue(nodeprovideOrderItemIdentifiersRequest.toString(), ProvideOrderItemIdentifiersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(provideOrderItemIdentifiersRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProvideOrderItemIdentifiersRequest' parameter is required");
        }
        return imp.provideOrderItemIdentifiersHttp(request, campaignId, orderId, provideOrderItemIdentifiersRequest);
    }

    @ApiAction
    public Result putBidsForBusiness(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeputSkuBidsRequest = request.body().asJson();
        PutSkuBidsRequest putSkuBidsRequest;
        if (nodeputSkuBidsRequest != null) {
            putSkuBidsRequest = mapper.readValue(nodeputSkuBidsRequest.toString(), PutSkuBidsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(putSkuBidsRequest);
            }
        } else {
            throw new IllegalArgumentException("'PutSkuBidsRequest' parameter is required");
        }
        return imp.putBidsForBusinessHttp(request, businessId, putSkuBidsRequest);
    }

    @ApiAction
    public Result putBidsForCampaign(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeputSkuBidsRequest = request.body().asJson();
        PutSkuBidsRequest putSkuBidsRequest;
        if (nodeputSkuBidsRequest != null) {
            putSkuBidsRequest = mapper.readValue(nodeputSkuBidsRequest.toString(), PutSkuBidsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(putSkuBidsRequest);
            }
        } else {
            throw new IllegalArgumentException("'PutSkuBidsRequest' parameter is required");
        }
        return imp.putBidsForCampaignHttp(request, campaignId, putSkuBidsRequest);
    }

    @ApiAction
    public Result refreshFeed(Http.Request request, Long campaignId,Long feedId) throws Exception {
        return imp.refreshFeedHttp(request, campaignId, feedId);
    }

    @ApiAction
    public Result searchModels(Http.Request request) throws Exception {
        String valuequery = request.getQueryString("query");
        String query;
        if (valuequery != null) {
            query = valuequery;
        } else {
            throw new IllegalArgumentException("'query' parameter is required");
        }
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        String valuepageSize = request.getQueryString("pageSize");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = null;
        }
        return imp.searchModelsHttp(request, query, regionId, currency, page, pageSize);
    }

    @ApiAction
    public Result searchRegionChildren(Http.Request request, Long regionId) throws Exception {
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        String valuepageSize = request.getQueryString("pageSize");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = null;
        }
        return imp.searchRegionChildrenHttp(request, regionId, page, pageSize);
    }

    @ApiAction
    public Result searchRegionsById(Http.Request request, Long regionId) throws Exception {
        return imp.searchRegionsByIdHttp(request, regionId);
    }

    @ApiAction
    public Result searchRegionsByName(Http.Request request) throws Exception {
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.searchRegionsByNameHttp(request, name, pageToken, limit);
    }

    @ApiAction
    public Result sendFileToChat(Http.Request request, Long businessId) throws Exception {
        String valuechatId = request.getQueryString("chatId");
        Long chatId;
        if (valuechatId != null) {
            chatId = Long.parseLong(valuechatId);
        } else {
            throw new IllegalArgumentException("'chatId' parameter is required");
        }
        Http.MultipartFormData<TemporaryFile> body_file = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> _file = body_file.getFile("file");
        if ((_file == null || _file.getFileSize() == 0)) {
            throw new IllegalArgumentException("'file' file cannot be empty");
        }
        return imp.sendFileToChatHttp(request, businessId, chatId, _file);
    }

    @ApiAction
    public Result sendMessageToChat(Http.Request request, Long businessId) throws Exception {
        JsonNode nodesendMessageToChatRequest = request.body().asJson();
        SendMessageToChatRequest sendMessageToChatRequest;
        if (nodesendMessageToChatRequest != null) {
            sendMessageToChatRequest = mapper.readValue(nodesendMessageToChatRequest.toString(), SendMessageToChatRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(sendMessageToChatRequest);
            }
        } else {
            throw new IllegalArgumentException("'SendMessageToChatRequest' parameter is required");
        }
        String valuechatId = request.getQueryString("chatId");
        Long chatId;
        if (valuechatId != null) {
            chatId = Long.parseLong(valuechatId);
        } else {
            throw new IllegalArgumentException("'chatId' parameter is required");
        }
        return imp.sendMessageToChatHttp(request, businessId, chatId, sendMessageToChatRequest);
    }

    @ApiAction
    public Result setFeedParams(Http.Request request, Long campaignId,Long feedId) throws Exception {
        JsonNode nodesetFeedParamsRequest = request.body().asJson();
        SetFeedParamsRequest setFeedParamsRequest;
        if (nodesetFeedParamsRequest != null) {
            setFeedParamsRequest = mapper.readValue(nodesetFeedParamsRequest.toString(), SetFeedParamsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setFeedParamsRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetFeedParamsRequest' parameter is required");
        }
        return imp.setFeedParamsHttp(request, campaignId, feedId, setFeedParamsRequest);
    }

    @ApiAction
    public Result setOrderBoxLayout(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodesetOrderBoxLayoutRequest = request.body().asJson();
        SetOrderBoxLayoutRequest setOrderBoxLayoutRequest;
        if (nodesetOrderBoxLayoutRequest != null) {
            setOrderBoxLayoutRequest = mapper.readValue(nodesetOrderBoxLayoutRequest.toString(), SetOrderBoxLayoutRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setOrderBoxLayoutRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetOrderBoxLayoutRequest' parameter is required");
        }
        return imp.setOrderBoxLayoutHttp(request, campaignId, orderId, setOrderBoxLayoutRequest);
    }

    @ApiAction
    public Result setOrderDeliveryDate(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodesetOrderDeliveryDateRequest = request.body().asJson();
        SetOrderDeliveryDateRequest setOrderDeliveryDateRequest;
        if (nodesetOrderDeliveryDateRequest != null) {
            setOrderDeliveryDateRequest = mapper.readValue(nodesetOrderDeliveryDateRequest.toString(), SetOrderDeliveryDateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setOrderDeliveryDateRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetOrderDeliveryDateRequest' parameter is required");
        }
        return imp.setOrderDeliveryDateHttp(request, campaignId, orderId, setOrderDeliveryDateRequest);
    }

    @ApiAction
    public Result setOrderDeliveryTrackCode(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodesetOrderDeliveryTrackCodeRequest = request.body().asJson();
        SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest;
        if (nodesetOrderDeliveryTrackCodeRequest != null) {
            setOrderDeliveryTrackCodeRequest = mapper.readValue(nodesetOrderDeliveryTrackCodeRequest.toString(), SetOrderDeliveryTrackCodeRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setOrderDeliveryTrackCodeRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetOrderDeliveryTrackCodeRequest' parameter is required");
        }
        return imp.setOrderDeliveryTrackCodeHttp(request, campaignId, orderId, setOrderDeliveryTrackCodeRequest);
    }

    @ApiAction
    public Result setOrderShipmentBoxes(Http.Request request, Long campaignId,Long orderId,Long shipmentId) throws Exception {
        JsonNode nodesetOrderShipmentBoxesRequest = request.body().asJson();
        SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest;
        if (nodesetOrderShipmentBoxesRequest != null) {
            setOrderShipmentBoxesRequest = mapper.readValue(nodesetOrderShipmentBoxesRequest.toString(), SetOrderShipmentBoxesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setOrderShipmentBoxesRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetOrderShipmentBoxesRequest' parameter is required");
        }
        return imp.setOrderShipmentBoxesHttp(request, campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest);
    }

    @ApiAction
    public Result setReturnDecision(Http.Request request, Long campaignId,Long orderId,Long returnId) throws Exception {
        JsonNode nodesetReturnDecisionRequest = request.body().asJson();
        SetReturnDecisionRequest setReturnDecisionRequest;
        if (nodesetReturnDecisionRequest != null) {
            setReturnDecisionRequest = mapper.readValue(nodesetReturnDecisionRequest.toString(), SetReturnDecisionRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setReturnDecisionRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetReturnDecisionRequest' parameter is required");
        }
        return imp.setReturnDecisionHttp(request, campaignId, orderId, returnId, setReturnDecisionRequest);
    }

    @ApiAction
    public Result skipGoodsFeedbacksReaction(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeskipGoodsFeedbackReactionRequest = request.body().asJson();
        SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest;
        if (nodeskipGoodsFeedbackReactionRequest != null) {
            skipGoodsFeedbackReactionRequest = mapper.readValue(nodeskipGoodsFeedbackReactionRequest.toString(), SkipGoodsFeedbackReactionRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(skipGoodsFeedbackReactionRequest);
            }
        } else {
            throw new IllegalArgumentException("'SkipGoodsFeedbackReactionRequest' parameter is required");
        }
        return imp.skipGoodsFeedbacksReactionHttp(request, businessId, skipGoodsFeedbackReactionRequest);
    }

    @ApiAction
    public Result submitReturnDecision(Http.Request request, Long campaignId,Long orderId,Long returnId) throws Exception {
        return imp.submitReturnDecisionHttp(request, campaignId, orderId, returnId);
    }

    @ApiAction
    public Result updateBusinessPrices(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeupdateBusinessPricesRequest = request.body().asJson();
        UpdateBusinessPricesRequest updateBusinessPricesRequest;
        if (nodeupdateBusinessPricesRequest != null) {
            updateBusinessPricesRequest = mapper.readValue(nodeupdateBusinessPricesRequest.toString(), UpdateBusinessPricesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateBusinessPricesRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateBusinessPricesRequest' parameter is required");
        }
        return imp.updateBusinessPricesHttp(request, businessId, updateBusinessPricesRequest);
    }

    @ApiAction
    public Result updateCampaignOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdateCampaignOffersRequest = request.body().asJson();
        UpdateCampaignOffersRequest updateCampaignOffersRequest;
        if (nodeupdateCampaignOffersRequest != null) {
            updateCampaignOffersRequest = mapper.readValue(nodeupdateCampaignOffersRequest.toString(), UpdateCampaignOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateCampaignOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateCampaignOffersRequest' parameter is required");
        }
        return imp.updateCampaignOffersHttp(request, campaignId, updateCampaignOffersRequest);
    }

    @ApiAction
    public Result updateGoodsFeedbackComment(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeupdateGoodsFeedbackCommentRequest = request.body().asJson();
        UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest;
        if (nodeupdateGoodsFeedbackCommentRequest != null) {
            updateGoodsFeedbackCommentRequest = mapper.readValue(nodeupdateGoodsFeedbackCommentRequest.toString(), UpdateGoodsFeedbackCommentRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateGoodsFeedbackCommentRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateGoodsFeedbackCommentRequest' parameter is required");
        }
        return imp.updateGoodsFeedbackCommentHttp(request, businessId, updateGoodsFeedbackCommentRequest);
    }

    @ApiAction
    public Result updateOfferContent(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeupdateOfferContentRequest = request.body().asJson();
        UpdateOfferContentRequest updateOfferContentRequest;
        if (nodeupdateOfferContentRequest != null) {
            updateOfferContentRequest = mapper.readValue(nodeupdateOfferContentRequest.toString(), UpdateOfferContentRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOfferContentRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOfferContentRequest' parameter is required");
        }
        return imp.updateOfferContentHttp(request, businessId, updateOfferContentRequest);
    }

    @ApiAction
    public Result updateOfferMappingEntries(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdateOfferMappingEntryRequest = request.body().asJson();
        UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest;
        if (nodeupdateOfferMappingEntryRequest != null) {
            updateOfferMappingEntryRequest = mapper.readValue(nodeupdateOfferMappingEntryRequest.toString(), UpdateOfferMappingEntryRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOfferMappingEntryRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOfferMappingEntryRequest' parameter is required");
        }
        return imp.updateOfferMappingEntriesHttp(request, campaignId, updateOfferMappingEntryRequest);
    }

    @ApiAction
    public Result updateOfferMappings(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeupdateOfferMappingsRequest = request.body().asJson();
        UpdateOfferMappingsRequest updateOfferMappingsRequest;
        if (nodeupdateOfferMappingsRequest != null) {
            updateOfferMappingsRequest = mapper.readValue(nodeupdateOfferMappingsRequest.toString(), UpdateOfferMappingsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOfferMappingsRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOfferMappingsRequest' parameter is required");
        }
        return imp.updateOfferMappingsHttp(request, businessId, updateOfferMappingsRequest);
    }

    @ApiAction
    public Result updateOrderItems(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeupdateOrderItemRequest = request.body().asJson();
        UpdateOrderItemRequest updateOrderItemRequest;
        if (nodeupdateOrderItemRequest != null) {
            updateOrderItemRequest = mapper.readValue(nodeupdateOrderItemRequest.toString(), UpdateOrderItemRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOrderItemRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOrderItemRequest' parameter is required");
        }
        return imp.updateOrderItemsHttp(request, campaignId, orderId, updateOrderItemRequest);
    }

    @ApiAction
    public Result updateOrderStatus(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeupdateOrderStatusRequest = request.body().asJson();
        UpdateOrderStatusRequest updateOrderStatusRequest;
        if (nodeupdateOrderStatusRequest != null) {
            updateOrderStatusRequest = mapper.readValue(nodeupdateOrderStatusRequest.toString(), UpdateOrderStatusRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOrderStatusRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOrderStatusRequest' parameter is required");
        }
        return imp.updateOrderStatusHttp(request, campaignId, orderId, updateOrderStatusRequest);
    }

    @ApiAction
    public Result updateOrderStatuses(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdateOrderStatusesRequest = request.body().asJson();
        UpdateOrderStatusesRequest updateOrderStatusesRequest;
        if (nodeupdateOrderStatusesRequest != null) {
            updateOrderStatusesRequest = mapper.readValue(nodeupdateOrderStatusesRequest.toString(), UpdateOrderStatusesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOrderStatusesRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOrderStatusesRequest' parameter is required");
        }
        return imp.updateOrderStatusesHttp(request, campaignId, updateOrderStatusesRequest);
    }

    @ApiAction
    public Result updateOrderStorageLimit(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeupdateOrderStorageLimitRequest = request.body().asJson();
        UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest;
        if (nodeupdateOrderStorageLimitRequest != null) {
            updateOrderStorageLimitRequest = mapper.readValue(nodeupdateOrderStorageLimitRequest.toString(), UpdateOrderStorageLimitRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOrderStorageLimitRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOrderStorageLimitRequest' parameter is required");
        }
        return imp.updateOrderStorageLimitHttp(request, campaignId, orderId, updateOrderStorageLimitRequest);
    }

    @ApiAction
    public Result updateOutlet(Http.Request request, Long campaignId,Long outletId) throws Exception {
        JsonNode nodechangeOutletRequest = request.body().asJson();
        ChangeOutletRequest changeOutletRequest;
        if (nodechangeOutletRequest != null) {
            changeOutletRequest = mapper.readValue(nodechangeOutletRequest.toString(), ChangeOutletRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(changeOutletRequest);
            }
        } else {
            throw new IllegalArgumentException("'ChangeOutletRequest' parameter is required");
        }
        return imp.updateOutletHttp(request, campaignId, outletId, changeOutletRequest);
    }

    @ApiAction
    public Result updateOutletLicenses(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdateOutletLicenseRequest = request.body().asJson();
        UpdateOutletLicenseRequest updateOutletLicenseRequest;
        if (nodeupdateOutletLicenseRequest != null) {
            updateOutletLicenseRequest = mapper.readValue(nodeupdateOutletLicenseRequest.toString(), UpdateOutletLicenseRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOutletLicenseRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOutletLicenseRequest' parameter is required");
        }
        return imp.updateOutletLicensesHttp(request, campaignId, updateOutletLicenseRequest);
    }

    @ApiAction
    public Result updatePrices(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdatePricesRequest = request.body().asJson();
        UpdatePricesRequest updatePricesRequest;
        if (nodeupdatePricesRequest != null) {
            updatePricesRequest = mapper.readValue(nodeupdatePricesRequest.toString(), UpdatePricesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updatePricesRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdatePricesRequest' parameter is required");
        }
        return imp.updatePricesHttp(request, campaignId, updatePricesRequest);
    }

    @ApiAction
    public Result updatePromoOffers(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeupdatePromoOffersRequest = request.body().asJson();
        UpdatePromoOffersRequest updatePromoOffersRequest;
        if (nodeupdatePromoOffersRequest != null) {
            updatePromoOffersRequest = mapper.readValue(nodeupdatePromoOffersRequest.toString(), UpdatePromoOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updatePromoOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdatePromoOffersRequest' parameter is required");
        }
        return imp.updatePromoOffersHttp(request, businessId, updatePromoOffersRequest);
    }

    @ApiAction
    public Result updateStocks(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdateStocksRequest = request.body().asJson();
        UpdateStocksRequest updateStocksRequest;
        if (nodeupdateStocksRequest != null) {
            updateStocksRequest = mapper.readValue(nodeupdateStocksRequest.toString(), UpdateStocksRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateStocksRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateStocksRequest' parameter is required");
        }
        return imp.updateStocksHttp(request, campaignId, updateStocksRequest);
    }

}
