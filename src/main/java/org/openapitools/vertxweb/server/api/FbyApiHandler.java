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

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class FbyApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(FbyApiHandler.class);

    private final FbyApi api;

    public FbyApiHandler(FbyApi api) {
        this.api = api;
    }

    @Deprecated
    public FbyApiHandler() {
        this(new FbyApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("addHiddenOffers").handler(this::addHiddenOffers);
        builder.operation("addOffersToArchive").handler(this::addOffersToArchive);
        builder.operation("calculateTariffs").handler(this::calculateTariffs);
        builder.operation("confirmBusinessPrices").handler(this::confirmBusinessPrices);
        builder.operation("confirmCampaignPrices").handler(this::confirmCampaignPrices);
        builder.operation("createChat").handler(this::createChat);
        builder.operation("deleteCampaignOffers").handler(this::deleteCampaignOffers);
        builder.operation("deleteGoodsFeedbackComment").handler(this::deleteGoodsFeedbackComment);
        builder.operation("deleteHiddenOffers").handler(this::deleteHiddenOffers);
        builder.operation("deleteOffers").handler(this::deleteOffers);
        builder.operation("deleteOffersFromArchive").handler(this::deleteOffersFromArchive);
        builder.operation("deletePromoOffers").handler(this::deletePromoOffers);
        builder.operation("generateBoostConsolidatedReport").handler(this::generateBoostConsolidatedReport);
        builder.operation("generateCompetitorsPositionReport").handler(this::generateCompetitorsPositionReport);
        builder.operation("generateGoodsFeedbackReport").handler(this::generateGoodsFeedbackReport);
        builder.operation("generateGoodsMovementReport").handler(this::generateGoodsMovementReport);
        builder.operation("generateGoodsRealizationReport").handler(this::generateGoodsRealizationReport);
        builder.operation("generateGoodsTurnoverReport").handler(this::generateGoodsTurnoverReport);
        builder.operation("generatePricesReport").handler(this::generatePricesReport);
        builder.operation("generateShelfsStatisticsReport").handler(this::generateShelfsStatisticsReport);
        builder.operation("generateShowsSalesReport").handler(this::generateShowsSalesReport);
        builder.operation("generateStocksOnWarehousesReport").handler(this::generateStocksOnWarehousesReport);
        builder.operation("generateUnitedMarketplaceServicesReport").handler(this::generateUnitedMarketplaceServicesReport);
        builder.operation("generateUnitedNettingReport").handler(this::generateUnitedNettingReport);
        builder.operation("generateUnitedOrdersReport").handler(this::generateUnitedOrdersReport);
        builder.operation("getAllOffers").handler(this::getAllOffers);
        builder.operation("getBidsInfoForBusiness").handler(this::getBidsInfoForBusiness);
        builder.operation("getBidsRecommendations").handler(this::getBidsRecommendations);
        builder.operation("getBusinessQuarantineOffers").handler(this::getBusinessQuarantineOffers);
        builder.operation("getBusinessSettings").handler(this::getBusinessSettings);
        builder.operation("getCampaign").handler(this::getCampaign);
        builder.operation("getCampaignLogins").handler(this::getCampaignLogins);
        builder.operation("getCampaignOffers").handler(this::getCampaignOffers);
        builder.operation("getCampaignQuarantineOffers").handler(this::getCampaignQuarantineOffers);
        builder.operation("getCampaignRegion").handler(this::getCampaignRegion);
        builder.operation("getCampaignSettings").handler(this::getCampaignSettings);
        builder.operation("getCampaigns").handler(this::getCampaigns);
        builder.operation("getCampaignsByLogin").handler(this::getCampaignsByLogin);
        builder.operation("getCategoriesMaxSaleQuantum").handler(this::getCategoriesMaxSaleQuantum);
        builder.operation("getCategoriesTree").handler(this::getCategoriesTree);
        builder.operation("getCategoryContentParameters").handler(this::getCategoryContentParameters);
        builder.operation("getChatHistory").handler(this::getChatHistory);
        builder.operation("getChats").handler(this::getChats);
        builder.operation("getFeed").handler(this::getFeed);
        builder.operation("getFeedIndexLogs").handler(this::getFeedIndexLogs);
        builder.operation("getFeedbackAndCommentUpdates").handler(this::getFeedbackAndCommentUpdates);
        builder.operation("getFeeds").handler(this::getFeeds);
        builder.operation("getFulfillmentWarehouses").handler(this::getFulfillmentWarehouses);
        builder.operation("getGoodsFeedbackComments").handler(this::getGoodsFeedbackComments);
        builder.operation("getGoodsFeedbacks").handler(this::getGoodsFeedbacks);
        builder.operation("getGoodsStats").handler(this::getGoodsStats);
        builder.operation("getHiddenOffers").handler(this::getHiddenOffers);
        builder.operation("getOfferCardsContentStatus").handler(this::getOfferCardsContentStatus);
        builder.operation("getOfferMappingEntries").handler(this::getOfferMappingEntries);
        builder.operation("getOfferMappings").handler(this::getOfferMappings);
        builder.operation("getOfferRecommendations").handler(this::getOfferRecommendations);
        builder.operation("getOffers").handler(this::getOffers);
        builder.operation("getOrder").handler(this::getOrder);
        builder.operation("getOrderBusinessBuyerInfo").handler(this::getOrderBusinessBuyerInfo);
        builder.operation("getOrderBusinessDocumentsInfo").handler(this::getOrderBusinessDocumentsInfo);
        builder.operation("getOrders").handler(this::getOrders);
        builder.operation("getOrdersStats").handler(this::getOrdersStats);
        builder.operation("getPrices").handler(this::getPrices);
        builder.operation("getPricesByOfferIds").handler(this::getPricesByOfferIds);
        builder.operation("getPromoOffers").handler(this::getPromoOffers);
        builder.operation("getPromos").handler(this::getPromos);
        builder.operation("getQualityRatings").handler(this::getQualityRatings);
        builder.operation("getReportInfo").handler(this::getReportInfo);
        builder.operation("getReturn").handler(this::getReturn);
        builder.operation("getReturnPhoto").handler(this::getReturnPhoto);
        builder.operation("getReturns").handler(this::getReturns);
        builder.operation("getStocks").handler(this::getStocks);
        builder.operation("getSuggestedOfferMappingEntries").handler(this::getSuggestedOfferMappingEntries);
        builder.operation("getSuggestedOfferMappings").handler(this::getSuggestedOfferMappings);
        builder.operation("getSuggestedPrices").handler(this::getSuggestedPrices);
        builder.operation("putBidsForBusiness").handler(this::putBidsForBusiness);
        builder.operation("putBidsForCampaign").handler(this::putBidsForCampaign);
        builder.operation("refreshFeed").handler(this::refreshFeed);
        builder.operation("searchRegionChildren").handler(this::searchRegionChildren);
        builder.operation("searchRegionsById").handler(this::searchRegionsById);
        builder.operation("searchRegionsByName").handler(this::searchRegionsByName);
        builder.operation("sendFileToChat").handler(this::sendFileToChat);
        builder.operation("sendMessageToChat").handler(this::sendMessageToChat);
        builder.operation("setFeedParams").handler(this::setFeedParams);
        builder.operation("skipGoodsFeedbacksReaction").handler(this::skipGoodsFeedbacksReaction);
        builder.operation("updateBusinessPrices").handler(this::updateBusinessPrices);
        builder.operation("updateCampaignOffers").handler(this::updateCampaignOffers);
        builder.operation("updateGoodsFeedbackComment").handler(this::updateGoodsFeedbackComment);
        builder.operation("updateOfferContent").handler(this::updateOfferContent);
        builder.operation("updateOfferMappingEntries").handler(this::updateOfferMappingEntries);
        builder.operation("updateOfferMappings").handler(this::updateOfferMappings);
        builder.operation("updatePrices").handler(this::updatePrices);
        builder.operation("updatePromoOffers").handler(this::updatePromoOffers);
    }

    private void addHiddenOffers(RoutingContext routingContext) {
        logger.info("addHiddenOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        AddHiddenOffersRequest addHiddenOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AddHiddenOffersRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter addHiddenOffersRequest is {}", addHiddenOffersRequest);

        api.addHiddenOffers(campaignId, addHiddenOffersRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void addOffersToArchive(RoutingContext routingContext) {
        logger.info("addOffersToArchive()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        AddOffersToArchiveRequest addOffersToArchiveRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AddOffersToArchiveRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter addOffersToArchiveRequest is {}", addOffersToArchiveRequest);

        api.addOffersToArchive(businessId, addOffersToArchiveRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void calculateTariffs(RoutingContext routingContext) {
        logger.info("calculateTariffs()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CalculateTariffsRequest calculateTariffsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CalculateTariffsRequest>(){}) : null;

        logger.debug("Parameter calculateTariffsRequest is {}", calculateTariffsRequest);

        api.calculateTariffs(calculateTariffsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void confirmBusinessPrices(RoutingContext routingContext) {
        logger.info("confirmBusinessPrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        ConfirmPricesRequest confirmPricesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ConfirmPricesRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter confirmPricesRequest is {}", confirmPricesRequest);

        api.confirmBusinessPrices(businessId, confirmPricesRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void confirmCampaignPrices(RoutingContext routingContext) {
        logger.info("confirmCampaignPrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        ConfirmPricesRequest confirmPricesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ConfirmPricesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter confirmPricesRequest is {}", confirmPricesRequest);

        api.confirmCampaignPrices(campaignId, confirmPricesRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createChat(RoutingContext routingContext) {
        logger.info("createChat()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        CreateChatRequest createChatRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateChatRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter createChatRequest is {}", createChatRequest);

        api.createChat(businessId, createChatRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteCampaignOffers(RoutingContext routingContext) {
        logger.info("deleteCampaignOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeleteCampaignOffersRequest deleteCampaignOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteCampaignOffersRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter deleteCampaignOffersRequest is {}", deleteCampaignOffersRequest);

        api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteGoodsFeedbackComment(RoutingContext routingContext) {
        logger.info("deleteGoodsFeedbackComment()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteGoodsFeedbackCommentRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deleteGoodsFeedbackCommentRequest is {}", deleteGoodsFeedbackCommentRequest);

        api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteHiddenOffers(RoutingContext routingContext) {
        logger.info("deleteHiddenOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeleteHiddenOffersRequest deleteHiddenOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteHiddenOffersRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter deleteHiddenOffersRequest is {}", deleteHiddenOffersRequest);

        api.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteOffers(RoutingContext routingContext) {
        logger.info("deleteOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeleteOffersRequest deleteOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteOffersRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deleteOffersRequest is {}", deleteOffersRequest);

        api.deleteOffers(businessId, deleteOffersRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteOffersFromArchive(RoutingContext routingContext) {
        logger.info("deleteOffersFromArchive()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteOffersFromArchiveRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deleteOffersFromArchiveRequest is {}", deleteOffersFromArchiveRequest);

        api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deletePromoOffers(RoutingContext routingContext) {
        logger.info("deletePromoOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeletePromoOffersRequest deletePromoOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeletePromoOffersRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deletePromoOffersRequest is {}", deletePromoOffersRequest);

        api.deletePromoOffers(businessId, deletePromoOffersRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateBoostConsolidatedReport(RoutingContext routingContext) {
        logger.info("generateBoostConsolidatedReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateBoostConsolidatedRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateBoostConsolidatedRequest is {}", generateBoostConsolidatedRequest);
        logger.debug("Parameter format is {}", format);

        api.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateCompetitorsPositionReport(RoutingContext routingContext) {
        logger.info("generateCompetitorsPositionReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateCompetitorsPositionReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateCompetitorsPositionReportRequest is {}", generateCompetitorsPositionReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateGoodsFeedbackReport(RoutingContext routingContext) {
        logger.info("generateGoodsFeedbackReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateGoodsFeedbackRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateGoodsFeedbackRequest is {}", generateGoodsFeedbackRequest);
        logger.debug("Parameter format is {}", format);

        api.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateGoodsMovementReport(RoutingContext routingContext) {
        logger.info("generateGoodsMovementReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateGoodsMovementReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateGoodsMovementReportRequest is {}", generateGoodsMovementReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateGoodsMovementReport(generateGoodsMovementReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateGoodsRealizationReport(RoutingContext routingContext) {
        logger.info("generateGoodsRealizationReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateGoodsRealizationReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateGoodsRealizationReportRequest is {}", generateGoodsRealizationReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateGoodsTurnoverReport(RoutingContext routingContext) {
        logger.info("generateGoodsTurnoverReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateGoodsTurnoverRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateGoodsTurnoverRequest is {}", generateGoodsTurnoverRequest);
        logger.debug("Parameter format is {}", format);

        api.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generatePricesReport(RoutingContext routingContext) {
        logger.info("generatePricesReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GeneratePricesReportRequest generatePricesReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GeneratePricesReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generatePricesReportRequest is {}", generatePricesReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generatePricesReport(generatePricesReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateShelfsStatisticsReport(RoutingContext routingContext) {
        logger.info("generateShelfsStatisticsReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateShelfsStatisticsRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateShelfsStatisticsRequest is {}", generateShelfsStatisticsRequest);
        logger.debug("Parameter format is {}", format);

        api.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateShowsSalesReport(RoutingContext routingContext) {
        logger.info("generateShowsSalesReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateShowsSalesReportRequest generateShowsSalesReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateShowsSalesReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateShowsSalesReportRequest is {}", generateShowsSalesReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateShowsSalesReport(generateShowsSalesReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateStocksOnWarehousesReport(RoutingContext routingContext) {
        logger.info("generateStocksOnWarehousesReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateStocksOnWarehousesReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateStocksOnWarehousesReportRequest is {}", generateStocksOnWarehousesReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateUnitedMarketplaceServicesReport(RoutingContext routingContext) {
        logger.info("generateUnitedMarketplaceServicesReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateUnitedMarketplaceServicesReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateUnitedMarketplaceServicesReportRequest is {}", generateUnitedMarketplaceServicesReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateUnitedNettingReport(RoutingContext routingContext) {
        logger.info("generateUnitedNettingReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateUnitedNettingReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateUnitedNettingReportRequest is {}", generateUnitedNettingReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateUnitedNettingReport(generateUnitedNettingReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateUnitedOrdersReport(RoutingContext routingContext) {
        logger.info("generateUnitedOrdersReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateUnitedOrdersRequest generateUnitedOrdersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateUnitedOrdersRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateUnitedOrdersRequest is {}", generateUnitedOrdersRequest);
        logger.debug("Parameter format is {}", format);

        api.generateUnitedOrdersReport(generateUnitedOrdersRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getAllOffers(RoutingContext routingContext) {
        logger.info("getAllOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long feedId = requestParameters.queryParameter("feedId") != null ? requestParameters.queryParameter("feedId").getLong() : null;
        Integer chunk = requestParameters.queryParameter("chunk") != null ? requestParameters.queryParameter("chunk").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter chunk is {}", chunk);

        api.getAllOffers(campaignId, feedId, chunk)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getBidsInfoForBusiness(RoutingContext routingContext) {
        logger.info("getBidsInfoForBusiness()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetBidsInfoRequest getBidsInfoRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetBidsInfoRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getBidsInfoRequest is {}", getBidsInfoRequest);

        api.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getBidsRecommendations(RoutingContext routingContext) {
        logger.info("getBidsRecommendations()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetBidsRecommendationsRequest getBidsRecommendationsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetBidsRecommendationsRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getBidsRecommendationsRequest is {}", getBidsRecommendationsRequest);

        api.getBidsRecommendations(businessId, getBidsRecommendationsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getBusinessQuarantineOffers(RoutingContext routingContext) {
        logger.info("getBusinessQuarantineOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetQuarantineOffersRequest getQuarantineOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetQuarantineOffersRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getQuarantineOffersRequest is {}", getQuarantineOffersRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getBusinessSettings(RoutingContext routingContext) {
        logger.info("getBusinessSettings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;

        logger.debug("Parameter businessId is {}", businessId);

        api.getBusinessSettings(businessId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaign(RoutingContext routingContext) {
        logger.info("getCampaign()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getCampaign(campaignId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaignLogins(RoutingContext routingContext) {
        logger.info("getCampaignLogins()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getCampaignLogins(campaignId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaignOffers(RoutingContext routingContext) {
        logger.info("getCampaignOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetCampaignOffersRequest getCampaignOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetCampaignOffersRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter getCampaignOffersRequest is {}", getCampaignOffersRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaignQuarantineOffers(RoutingContext routingContext) {
        logger.info("getCampaignQuarantineOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetQuarantineOffersRequest getQuarantineOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetQuarantineOffersRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter getQuarantineOffersRequest is {}", getQuarantineOffersRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaignRegion(RoutingContext routingContext) {
        logger.info("getCampaignRegion()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getCampaignRegion(campaignId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaignSettings(RoutingContext routingContext) {
        logger.info("getCampaignSettings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getCampaignSettings(campaignId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaigns(RoutingContext routingContext) {
        logger.info("getCampaigns()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;

        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getCampaigns(page, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaignsByLogin(RoutingContext routingContext) {
        logger.info("getCampaignsByLogin()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String login = requestParameters.pathParameter("login") != null ? requestParameters.pathParameter("login").getString() : null;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;

        logger.debug("Parameter login is {}", login);
        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getCampaignsByLogin(login, page, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCategoriesMaxSaleQuantum(RoutingContext routingContext) {
        logger.info("getCategoriesMaxSaleQuantum()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetCategoriesMaxSaleQuantumRequest>(){}) : null;

        logger.debug("Parameter getCategoriesMaxSaleQuantumRequest is {}", getCategoriesMaxSaleQuantumRequest);

        api.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCategoriesTree(RoutingContext routingContext) {
        logger.info("getCategoriesTree()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GetCategoriesRequest getCategoriesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetCategoriesRequest>(){}) : null;

        logger.debug("Parameter getCategoriesRequest is {}", getCategoriesRequest);

        api.getCategoriesTree(getCategoriesRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCategoryContentParameters(RoutingContext routingContext) {
        logger.info("getCategoryContentParameters()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long categoryId = requestParameters.pathParameter("categoryId") != null ? requestParameters.pathParameter("categoryId").getLong() : null;

        logger.debug("Parameter categoryId is {}", categoryId);

        api.getCategoryContentParameters(categoryId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getChatHistory(RoutingContext routingContext) {
        logger.info("getChatHistory()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        Long chatId = requestParameters.queryParameter("chatId") != null ? requestParameters.queryParameter("chatId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetChatHistoryRequest getChatHistoryRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetChatHistoryRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter chatId is {}", chatId);
        logger.debug("Parameter getChatHistoryRequest is {}", getChatHistoryRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getChats(RoutingContext routingContext) {
        logger.info("getChats()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetChatsRequest getChatsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetChatsRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getChatsRequest is {}", getChatsRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getChats(businessId, getChatsRequest, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getFeed(RoutingContext routingContext) {
        logger.info("getFeed()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long feedId = requestParameters.pathParameter("feedId") != null ? requestParameters.pathParameter("feedId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter feedId is {}", feedId);

        api.getFeed(campaignId, feedId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getFeedIndexLogs(RoutingContext routingContext) {
        logger.info("getFeedIndexLogs()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long feedId = requestParameters.pathParameter("feedId") != null ? requestParameters.pathParameter("feedId").getLong() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        OffsetDateTime publishedTimeFrom = requestParameters.queryParameter("published_time_from") != null ? requestParameters.queryParameter("published_time_from").getOffsetDateTime() : null;
        OffsetDateTime publishedTimeTo = requestParameters.queryParameter("published_time_to") != null ? requestParameters.queryParameter("published_time_to").getOffsetDateTime() : null;
        FeedIndexLogsStatusType status = requestParameters.queryParameter("status") != null ? requestParameters.queryParameter("status").getFeedIndexLogsStatusType() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter publishedTimeFrom is {}", publishedTimeFrom);
        logger.debug("Parameter publishedTimeTo is {}", publishedTimeTo);
        logger.debug("Parameter status is {}", status);

        api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getFeedbackAndCommentUpdates(RoutingContext routingContext) {
        logger.info("getFeedbackAndCommentUpdates()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        LocalDate fromDate = requestParameters.queryParameter("from_date") != null ? requestParameters.queryParameter("from_date").getLocalDate() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter fromDate is {}", fromDate);

        api.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getFeeds(RoutingContext routingContext) {
        logger.info("getFeeds()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getFeeds(campaignId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getFulfillmentWarehouses(RoutingContext routingContext) {
        logger.info("getFulfillmentWarehouses()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getFulfillmentWarehouses()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getGoodsFeedbackComments(RoutingContext routingContext) {
        logger.info("getGoodsFeedbackComments()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetGoodsFeedbackCommentsRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getGoodsFeedbackCommentsRequest is {}", getGoodsFeedbackCommentsRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getGoodsFeedbacks(RoutingContext routingContext) {
        logger.info("getGoodsFeedbacks()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetGoodsFeedbackRequest getGoodsFeedbackRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetGoodsFeedbackRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getGoodsFeedbackRequest is {}", getGoodsFeedbackRequest);

        api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getGoodsStats(RoutingContext routingContext) {
        logger.info("getGoodsStats()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetGoodsStatsRequest getGoodsStatsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetGoodsStatsRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter getGoodsStatsRequest is {}", getGoodsStatsRequest);

        api.getGoodsStats(campaignId, getGoodsStatsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getHiddenOffers(RoutingContext routingContext) {
        logger.info("getHiddenOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        List<String> offerId = requestParameters.queryParameter("offer_id") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("offer_id").get(), new TypeReference<List<String>>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter offerId is {}", offerId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOfferCardsContentStatus(RoutingContext routingContext) {
        logger.info("getOfferCardsContentStatus()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetOfferCardsContentStatusRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getOfferCardsContentStatusRequest is {}", getOfferCardsContentStatusRequest);

        api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOfferMappingEntries(RoutingContext routingContext) {
        logger.info("getOfferMappingEntries()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        List<String> offerId = requestParameters.queryParameter("offer_id") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("offer_id").get(), new TypeReference<List<String>>(){}) : null;
        List<String> shopSku = requestParameters.queryParameter("shop_sku") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("shop_sku").get(), new TypeReference<List<String>>(){}) : null;
        OfferMappingKindType mappingKind = requestParameters.queryParameter("mapping_kind") != null ? requestParameters.queryParameter("mapping_kind").getOfferMappingKindType() : null;
        List<OfferProcessingStatusType> status = requestParameters.queryParameter("status") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("status").get(), new TypeReference<List<OfferProcessingStatusType>>(){}) : null;
        List<OfferAvailabilityStatusType> availability = requestParameters.queryParameter("availability") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("availability").get(), new TypeReference<List<OfferAvailabilityStatusType>>(){}) : null;
        List<Integer> categoryId = requestParameters.queryParameter("category_id") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("category_id").get(), new TypeReference<List<Integer>>(){}) : null;
        List<String> vendor = requestParameters.queryParameter("vendor") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("vendor").get(), new TypeReference<List<String>>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter offerId is {}", offerId);
        logger.debug("Parameter shopSku is {}", shopSku);
        logger.debug("Parameter mappingKind is {}", mappingKind);
        logger.debug("Parameter status is {}", status);
        logger.debug("Parameter availability is {}", availability);
        logger.debug("Parameter categoryId is {}", categoryId);
        logger.debug("Parameter vendor is {}", vendor);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOfferMappings(RoutingContext routingContext) {
        logger.info("getOfferMappings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetOfferMappingsRequest getOfferMappingsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetOfferMappingsRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getOfferMappingsRequest is {}", getOfferMappingsRequest);

        api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOfferRecommendations(RoutingContext routingContext) {
        logger.info("getOfferRecommendations()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetOfferRecommendationsRequest getOfferRecommendationsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetOfferRecommendationsRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getOfferRecommendationsRequest is {}", getOfferRecommendationsRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOffers(RoutingContext routingContext) {
        logger.info("getOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String query = requestParameters.queryParameter("query") != null ? requestParameters.queryParameter("query").getString() : null;
        Long feedId = requestParameters.queryParameter("feedId") != null ? requestParameters.queryParameter("feedId").getLong() : null;
        String shopCategoryId = requestParameters.queryParameter("shopCategoryId") != null ? requestParameters.queryParameter("shopCategoryId").getString() : null;
        CurrencyType currency = requestParameters.queryParameter("currency") != null ? requestParameters.queryParameter("currency").getCurrencyType() : null;
        Boolean matched = requestParameters.queryParameter("matched") != null ? requestParameters.queryParameter("matched").getBoolean() : null;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter query is {}", query);
        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter shopCategoryId is {}", shopCategoryId);
        logger.debug("Parameter currency is {}", currency);
        logger.debug("Parameter matched is {}", matched);
        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOrder(RoutingContext routingContext) {
        logger.info("getOrder()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);

        api.getOrder(campaignId, orderId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOrderBusinessBuyerInfo(RoutingContext routingContext) {
        logger.info("getOrderBusinessBuyerInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);

        api.getOrderBusinessBuyerInfo(campaignId, orderId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOrderBusinessDocumentsInfo(RoutingContext routingContext) {
        logger.info("getOrderBusinessDocumentsInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);

        api.getOrderBusinessDocumentsInfo(campaignId, orderId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOrders(RoutingContext routingContext) {
        logger.info("getOrders()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        List<Long> orderIds = requestParameters.queryParameter("orderIds") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("orderIds").get(), new TypeReference<List<Long>>(){}) : null;
        Set<OrderStatusType> status = requestParameters.queryParameter("status") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("status").get(), new TypeReference<Set<OrderStatusType>>(){}) : null;
        Set<OrderSubstatusType> substatus = requestParameters.queryParameter("substatus") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("substatus").get(), new TypeReference<Set<OrderSubstatusType>>(){}) : null;
        LocalDate fromDate = requestParameters.queryParameter("fromDate") != null ? requestParameters.queryParameter("fromDate").getLocalDate() : null;
        LocalDate toDate = requestParameters.queryParameter("toDate") != null ? requestParameters.queryParameter("toDate").getLocalDate() : null;
        LocalDate supplierShipmentDateFrom = requestParameters.queryParameter("supplierShipmentDateFrom") != null ? requestParameters.queryParameter("supplierShipmentDateFrom").getLocalDate() : null;
        LocalDate supplierShipmentDateTo = requestParameters.queryParameter("supplierShipmentDateTo") != null ? requestParameters.queryParameter("supplierShipmentDateTo").getLocalDate() : null;
        OffsetDateTime updatedAtFrom = requestParameters.queryParameter("updatedAtFrom") != null ? requestParameters.queryParameter("updatedAtFrom").getOffsetDateTime() : null;
        OffsetDateTime updatedAtTo = requestParameters.queryParameter("updatedAtTo") != null ? requestParameters.queryParameter("updatedAtTo").getOffsetDateTime() : null;
        OrderDeliveryDispatchType dispatchType = requestParameters.queryParameter("dispatchType") != null ? requestParameters.queryParameter("dispatchType").getOrderDeliveryDispatchType() : null;
        Boolean fake = requestParameters.queryParameter("fake") != null ? requestParameters.queryParameter("fake").getBoolean() : false;
        Boolean hasCis = requestParameters.queryParameter("hasCis") != null ? requestParameters.queryParameter("hasCis").getBoolean() : false;
        Boolean onlyWaitingForCancellationApprove = requestParameters.queryParameter("onlyWaitingForCancellationApprove") != null ? requestParameters.queryParameter("onlyWaitingForCancellationApprove").getBoolean() : false;
        Boolean onlyEstimatedDelivery = requestParameters.queryParameter("onlyEstimatedDelivery") != null ? requestParameters.queryParameter("onlyEstimatedDelivery").getBoolean() : false;
        OrderBuyerType buyerType = requestParameters.queryParameter("buyerType") != null ? requestParameters.queryParameter("buyerType").getOrderBuyerType() : null;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderIds is {}", orderIds);
        logger.debug("Parameter status is {}", status);
        logger.debug("Parameter substatus is {}", substatus);
        logger.debug("Parameter fromDate is {}", fromDate);
        logger.debug("Parameter toDate is {}", toDate);
        logger.debug("Parameter supplierShipmentDateFrom is {}", supplierShipmentDateFrom);
        logger.debug("Parameter supplierShipmentDateTo is {}", supplierShipmentDateTo);
        logger.debug("Parameter updatedAtFrom is {}", updatedAtFrom);
        logger.debug("Parameter updatedAtTo is {}", updatedAtTo);
        logger.debug("Parameter dispatchType is {}", dispatchType);
        logger.debug("Parameter fake is {}", fake);
        logger.debug("Parameter hasCis is {}", hasCis);
        logger.debug("Parameter onlyWaitingForCancellationApprove is {}", onlyWaitingForCancellationApprove);
        logger.debug("Parameter onlyEstimatedDelivery is {}", onlyEstimatedDelivery);
        logger.debug("Parameter buyerType is {}", buyerType);
        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOrdersStats(RoutingContext routingContext) {
        logger.info("getOrdersStats()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetOrdersStatsRequest getOrdersStatsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetOrdersStatsRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getOrdersStatsRequest is {}", getOrdersStatsRequest);

        api.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getPrices(RoutingContext routingContext) {
        logger.info("getPrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Boolean archived = requestParameters.queryParameter("archived") != null ? requestParameters.queryParameter("archived").getBoolean() : false;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter archived is {}", archived);

        api.getPrices(campaignId, pageToken, limit, archived)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getPricesByOfferIds(RoutingContext routingContext) {
        logger.info("getPricesByOfferIds()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetPricesByOfferIdsRequest getPricesByOfferIdsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetPricesByOfferIdsRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getPricesByOfferIdsRequest is {}", getPricesByOfferIdsRequest);

        api.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getPromoOffers(RoutingContext routingContext) {
        logger.info("getPromoOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetPromoOffersRequest getPromoOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetPromoOffersRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getPromoOffersRequest is {}", getPromoOffersRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getPromos(RoutingContext routingContext) {
        logger.info("getPromos()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetPromosRequest getPromosRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetPromosRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getPromosRequest is {}", getPromosRequest);

        api.getPromos(businessId, getPromosRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getQualityRatings(RoutingContext routingContext) {
        logger.info("getQualityRatings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetQualityRatingRequest getQualityRatingRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetQualityRatingRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getQualityRatingRequest is {}", getQualityRatingRequest);

        api.getQualityRatings(businessId, getQualityRatingRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getReportInfo(RoutingContext routingContext) {
        logger.info("getReportInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String reportId = requestParameters.pathParameter("reportId") != null ? requestParameters.pathParameter("reportId").getString() : null;

        logger.debug("Parameter reportId is {}", reportId);

        api.getReportInfo(reportId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getReturn(RoutingContext routingContext) {
        logger.info("getReturn()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        Long returnId = requestParameters.pathParameter("returnId") != null ? requestParameters.pathParameter("returnId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter returnId is {}", returnId);

        api.getReturn(campaignId, orderId, returnId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getReturnPhoto(RoutingContext routingContext) {
        logger.info("getReturnPhoto()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        Long returnId = requestParameters.pathParameter("returnId") != null ? requestParameters.pathParameter("returnId").getLong() : null;
        Long itemId = requestParameters.pathParameter("itemId") != null ? requestParameters.pathParameter("itemId").getLong() : null;
        String imageHash = requestParameters.pathParameter("imageHash") != null ? requestParameters.pathParameter("imageHash").getString() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter returnId is {}", returnId);
        logger.debug("Parameter itemId is {}", itemId);
        logger.debug("Parameter imageHash is {}", imageHash);

        api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getReturns(RoutingContext routingContext) {
        logger.info("getReturns()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        List<Long> orderIds = requestParameters.queryParameter("orderIds") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("orderIds").get(), new TypeReference<List<Long>>(){}) : null;
        List<RefundStatusType> statuses = requestParameters.queryParameter("statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("statuses").get(), new TypeReference<List<RefundStatusType>>(){}) : null;
        ReturnType type = requestParameters.queryParameter("type") != null ? requestParameters.queryParameter("type").getReturnType() : null;
        LocalDate fromDate = requestParameters.queryParameter("fromDate") != null ? requestParameters.queryParameter("fromDate").getLocalDate() : null;
        LocalDate toDate = requestParameters.queryParameter("toDate") != null ? requestParameters.queryParameter("toDate").getLocalDate() : null;
        LocalDate fromDate2 = requestParameters.queryParameter("from_date") != null ? requestParameters.queryParameter("from_date").getLocalDate() : null;
        LocalDate toDate2 = requestParameters.queryParameter("to_date") != null ? requestParameters.queryParameter("to_date").getLocalDate() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter orderIds is {}", orderIds);
        logger.debug("Parameter statuses is {}", statuses);
        logger.debug("Parameter type is {}", type);
        logger.debug("Parameter fromDate is {}", fromDate);
        logger.debug("Parameter toDate is {}", toDate);
        logger.debug("Parameter fromDate2 is {}", fromDate2);
        logger.debug("Parameter toDate2 is {}", toDate2);

        api.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getStocks(RoutingContext routingContext) {
        logger.info("getStocks()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetWarehouseStocksRequest getWarehouseStocksRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetWarehouseStocksRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getWarehouseStocksRequest is {}", getWarehouseStocksRequest);

        api.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getSuggestedOfferMappingEntries(RoutingContext routingContext) {
        logger.info("getSuggestedOfferMappingEntries()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetSuggestedOfferMappingEntriesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter getSuggestedOfferMappingEntriesRequest is {}", getSuggestedOfferMappingEntriesRequest);

        api.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getSuggestedOfferMappings(RoutingContext routingContext) {
        logger.info("getSuggestedOfferMappings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetSuggestedOfferMappingsRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getSuggestedOfferMappingsRequest is {}", getSuggestedOfferMappingsRequest);

        api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getSuggestedPrices(RoutingContext routingContext) {
        logger.info("getSuggestedPrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SuggestPricesRequest suggestPricesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SuggestPricesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter suggestPricesRequest is {}", suggestPricesRequest);

        api.getSuggestedPrices(campaignId, suggestPricesRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void putBidsForBusiness(RoutingContext routingContext) {
        logger.info("putBidsForBusiness()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        PutSkuBidsRequest putSkuBidsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<PutSkuBidsRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter putSkuBidsRequest is {}", putSkuBidsRequest);

        api.putBidsForBusiness(businessId, putSkuBidsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void putBidsForCampaign(RoutingContext routingContext) {
        logger.info("putBidsForCampaign()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        PutSkuBidsRequest putSkuBidsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<PutSkuBidsRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter putSkuBidsRequest is {}", putSkuBidsRequest);

        api.putBidsForCampaign(campaignId, putSkuBidsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void refreshFeed(RoutingContext routingContext) {
        logger.info("refreshFeed()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long feedId = requestParameters.pathParameter("feedId") != null ? requestParameters.pathParameter("feedId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter feedId is {}", feedId);

        api.refreshFeed(campaignId, feedId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void searchRegionChildren(RoutingContext routingContext) {
        logger.info("searchRegionChildren()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long regionId = requestParameters.pathParameter("regionId") != null ? requestParameters.pathParameter("regionId").getLong() : null;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;

        logger.debug("Parameter regionId is {}", regionId);
        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.searchRegionChildren(regionId, page, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void searchRegionsById(RoutingContext routingContext) {
        logger.info("searchRegionsById()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long regionId = requestParameters.pathParameter("regionId") != null ? requestParameters.pathParameter("regionId").getLong() : null;

        logger.debug("Parameter regionId is {}", regionId);

        api.searchRegionsById(regionId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void searchRegionsByName(RoutingContext routingContext) {
        logger.info("searchRegionsByName()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String name = requestParameters.queryParameter("name") != null ? requestParameters.queryParameter("name").getString() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.searchRegionsByName(name, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void sendFileToChat(RoutingContext routingContext) {
        logger.info("sendFileToChat()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        Long chatId = requestParameters.queryParameter("chatId") != null ? requestParameters.queryParameter("chatId").getLong() : null;
        FileUpload _file = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter chatId is {}", chatId);
        logger.debug("Parameter _file is {}", _file);

        api.sendFileToChat(businessId, chatId, _file)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void sendMessageToChat(RoutingContext routingContext) {
        logger.info("sendMessageToChat()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        Long chatId = requestParameters.queryParameter("chatId") != null ? requestParameters.queryParameter("chatId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SendMessageToChatRequest sendMessageToChatRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SendMessageToChatRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter chatId is {}", chatId);
        logger.debug("Parameter sendMessageToChatRequest is {}", sendMessageToChatRequest);

        api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void setFeedParams(RoutingContext routingContext) {
        logger.info("setFeedParams()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long feedId = requestParameters.pathParameter("feedId") != null ? requestParameters.pathParameter("feedId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SetFeedParamsRequest setFeedParamsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SetFeedParamsRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter setFeedParamsRequest is {}", setFeedParamsRequest);

        api.setFeedParams(campaignId, feedId, setFeedParamsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void skipGoodsFeedbacksReaction(RoutingContext routingContext) {
        logger.info("skipGoodsFeedbacksReaction()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SkipGoodsFeedbackReactionRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter skipGoodsFeedbackReactionRequest is {}", skipGoodsFeedbackReactionRequest);

        api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateBusinessPrices(RoutingContext routingContext) {
        logger.info("updateBusinessPrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateBusinessPricesRequest updateBusinessPricesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateBusinessPricesRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateBusinessPricesRequest is {}", updateBusinessPricesRequest);

        api.updateBusinessPrices(businessId, updateBusinessPricesRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateCampaignOffers(RoutingContext routingContext) {
        logger.info("updateCampaignOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateCampaignOffersRequest updateCampaignOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateCampaignOffersRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter updateCampaignOffersRequest is {}", updateCampaignOffersRequest);

        api.updateCampaignOffers(campaignId, updateCampaignOffersRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateGoodsFeedbackComment(RoutingContext routingContext) {
        logger.info("updateGoodsFeedbackComment()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateGoodsFeedbackCommentRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateGoodsFeedbackCommentRequest is {}", updateGoodsFeedbackCommentRequest);

        api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateOfferContent(RoutingContext routingContext) {
        logger.info("updateOfferContent()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOfferContentRequest updateOfferContentRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOfferContentRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateOfferContentRequest is {}", updateOfferContentRequest);

        api.updateOfferContent(businessId, updateOfferContentRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateOfferMappingEntries(RoutingContext routingContext) {
        logger.info("updateOfferMappingEntries()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOfferMappingEntryRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter updateOfferMappingEntryRequest is {}", updateOfferMappingEntryRequest);

        api.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateOfferMappings(RoutingContext routingContext) {
        logger.info("updateOfferMappings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOfferMappingsRequest updateOfferMappingsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOfferMappingsRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateOfferMappingsRequest is {}", updateOfferMappingsRequest);

        api.updateOfferMappings(businessId, updateOfferMappingsRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updatePrices(RoutingContext routingContext) {
        logger.info("updatePrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdatePricesRequest updatePricesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdatePricesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter updatePricesRequest is {}", updatePricesRequest);

        api.updatePrices(campaignId, updatePricesRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updatePromoOffers(RoutingContext routingContext) {
        logger.info("updatePromoOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdatePromoOffersRequest updatePromoOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdatePromoOffersRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updatePromoOffersRequest is {}", updatePromoOffersRequest);

        api.updatePromoOffers(businessId, updatePromoOffersRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
