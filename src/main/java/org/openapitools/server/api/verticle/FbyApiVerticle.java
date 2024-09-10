package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

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

import java.util.List;
import java.util.Map;

public class FbyApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(FbyApiVerticle.class);

    static final String ADDHIDDENOFFERS_SERVICE_ID = "addHiddenOffers";
    static final String ADDOFFERSTOARCHIVE_SERVICE_ID = "addOffersToArchive";
    static final String CALCULATETARIFFS_SERVICE_ID = "calculateTariffs";
    static final String CONFIRMBUSINESSPRICES_SERVICE_ID = "confirmBusinessPrices";
    static final String CONFIRMCAMPAIGNPRICES_SERVICE_ID = "confirmCampaignPrices";
    static final String CREATECHAT_SERVICE_ID = "createChat";
    static final String DELETECAMPAIGNOFFERS_SERVICE_ID = "deleteCampaignOffers";
    static final String DELETEGOODSFEEDBACKCOMMENT_SERVICE_ID = "deleteGoodsFeedbackComment";
    static final String DELETEHIDDENOFFERS_SERVICE_ID = "deleteHiddenOffers";
    static final String DELETEOFFERS_SERVICE_ID = "deleteOffers";
    static final String DELETEOFFERSFROMARCHIVE_SERVICE_ID = "deleteOffersFromArchive";
    static final String DELETEPROMOOFFERS_SERVICE_ID = "deletePromoOffers";
    static final String GENERATEBOOSTCONSOLIDATEDREPORT_SERVICE_ID = "generateBoostConsolidatedReport";
    static final String GENERATECOMPETITORSPOSITIONREPORT_SERVICE_ID = "generateCompetitorsPositionReport";
    static final String GENERATEGOODSFEEDBACKREPORT_SERVICE_ID = "generateGoodsFeedbackReport";
    static final String GENERATEGOODSMOVEMENTREPORT_SERVICE_ID = "generateGoodsMovementReport";
    static final String GENERATEGOODSREALIZATIONREPORT_SERVICE_ID = "generateGoodsRealizationReport";
    static final String GENERATEGOODSTURNOVERREPORT_SERVICE_ID = "generateGoodsTurnoverReport";
    static final String GENERATEPRICESREPORT_SERVICE_ID = "generatePricesReport";
    static final String GENERATESHELFSSTATISTICSREPORT_SERVICE_ID = "generateShelfsStatisticsReport";
    static final String GENERATESHOWSSALESREPORT_SERVICE_ID = "generateShowsSalesReport";
    static final String GENERATESTOCKSONWAREHOUSESREPORT_SERVICE_ID = "generateStocksOnWarehousesReport";
    static final String GENERATEUNITEDMARKETPLACESERVICESREPORT_SERVICE_ID = "generateUnitedMarketplaceServicesReport";
    static final String GENERATEUNITEDNETTINGREPORT_SERVICE_ID = "generateUnitedNettingReport";
    static final String GENERATEUNITEDORDERSREPORT_SERVICE_ID = "generateUnitedOrdersReport";
    static final String GETALLOFFERS_SERVICE_ID = "getAllOffers";
    static final String GETBIDSINFOFORBUSINESS_SERVICE_ID = "getBidsInfoForBusiness";
    static final String GETBIDSRECOMMENDATIONS_SERVICE_ID = "getBidsRecommendations";
    static final String GETBUSINESSQUARANTINEOFFERS_SERVICE_ID = "getBusinessQuarantineOffers";
    static final String GETBUSINESSSETTINGS_SERVICE_ID = "getBusinessSettings";
    static final String GETCAMPAIGN_SERVICE_ID = "getCampaign";
    static final String GETCAMPAIGNLOGINS_SERVICE_ID = "getCampaignLogins";
    static final String GETCAMPAIGNOFFERS_SERVICE_ID = "getCampaignOffers";
    static final String GETCAMPAIGNQUARANTINEOFFERS_SERVICE_ID = "getCampaignQuarantineOffers";
    static final String GETCAMPAIGNREGION_SERVICE_ID = "getCampaignRegion";
    static final String GETCAMPAIGNSETTINGS_SERVICE_ID = "getCampaignSettings";
    static final String GETCAMPAIGNS_SERVICE_ID = "getCampaigns";
    static final String GETCAMPAIGNSBYLOGIN_SERVICE_ID = "getCampaignsByLogin";
    static final String GETCATEGORIESMAXSALEQUANTUM_SERVICE_ID = "getCategoriesMaxSaleQuantum";
    static final String GETCATEGORIESTREE_SERVICE_ID = "getCategoriesTree";
    static final String GETCATEGORYCONTENTPARAMETERS_SERVICE_ID = "getCategoryContentParameters";
    static final String GETCHATHISTORY_SERVICE_ID = "getChatHistory";
    static final String GETCHATS_SERVICE_ID = "getChats";
    static final String GETFEED_SERVICE_ID = "getFeed";
    static final String GETFEEDINDEXLOGS_SERVICE_ID = "getFeedIndexLogs";
    static final String GETFEEDBACKANDCOMMENTUPDATES_SERVICE_ID = "getFeedbackAndCommentUpdates";
    static final String GETFEEDS_SERVICE_ID = "getFeeds";
    static final String GETFULFILLMENTWAREHOUSES_SERVICE_ID = "getFulfillmentWarehouses";
    static final String GETGOODSFEEDBACKCOMMENTS_SERVICE_ID = "getGoodsFeedbackComments";
    static final String GETGOODSFEEDBACKS_SERVICE_ID = "getGoodsFeedbacks";
    static final String GETGOODSSTATS_SERVICE_ID = "getGoodsStats";
    static final String GETHIDDENOFFERS_SERVICE_ID = "getHiddenOffers";
    static final String GETOFFERCARDSCONTENTSTATUS_SERVICE_ID = "getOfferCardsContentStatus";
    static final String GETOFFERMAPPINGENTRIES_SERVICE_ID = "getOfferMappingEntries";
    static final String GETOFFERMAPPINGS_SERVICE_ID = "getOfferMappings";
    static final String GETOFFERRECOMMENDATIONS_SERVICE_ID = "getOfferRecommendations";
    static final String GETOFFERS_SERVICE_ID = "getOffers";
    static final String GETORDER_SERVICE_ID = "getOrder";
    static final String GETORDERBUSINESSBUYERINFO_SERVICE_ID = "getOrderBusinessBuyerInfo";
    static final String GETORDERBUSINESSDOCUMENTSINFO_SERVICE_ID = "getOrderBusinessDocumentsInfo";
    static final String GETORDERS_SERVICE_ID = "getOrders";
    static final String GETORDERSSTATS_SERVICE_ID = "getOrdersStats";
    static final String GETPRICES_SERVICE_ID = "getPrices";
    static final String GETPRICESBYOFFERIDS_SERVICE_ID = "getPricesByOfferIds";
    static final String GETPROMOOFFERS_SERVICE_ID = "getPromoOffers";
    static final String GETPROMOS_SERVICE_ID = "getPromos";
    static final String GETQUALITYRATINGS_SERVICE_ID = "getQualityRatings";
    static final String GETREPORTINFO_SERVICE_ID = "getReportInfo";
    static final String GETRETURN_SERVICE_ID = "getReturn";
    static final String GETRETURNPHOTO_SERVICE_ID = "getReturnPhoto";
    static final String GETRETURNS_SERVICE_ID = "getReturns";
    static final String GETSTOCKS_SERVICE_ID = "getStocks";
    static final String GETSUGGESTEDOFFERMAPPINGENTRIES_SERVICE_ID = "getSuggestedOfferMappingEntries";
    static final String GETSUGGESTEDOFFERMAPPINGS_SERVICE_ID = "getSuggestedOfferMappings";
    static final String GETSUGGESTEDPRICES_SERVICE_ID = "getSuggestedPrices";
    static final String PUTBIDSFORBUSINESS_SERVICE_ID = "putBidsForBusiness";
    static final String PUTBIDSFORCAMPAIGN_SERVICE_ID = "putBidsForCampaign";
    static final String REFRESHFEED_SERVICE_ID = "refreshFeed";
    static final String SEARCHREGIONCHILDREN_SERVICE_ID = "searchRegionChildren";
    static final String SEARCHREGIONSBYID_SERVICE_ID = "searchRegionsById";
    static final String SEARCHREGIONSBYNAME_SERVICE_ID = "searchRegionsByName";
    static final String SENDFILETOCHAT_SERVICE_ID = "sendFileToChat";
    static final String SENDMESSAGETOCHAT_SERVICE_ID = "sendMessageToChat";
    static final String SETFEEDPARAMS_SERVICE_ID = "setFeedParams";
    static final String SKIPGOODSFEEDBACKSREACTION_SERVICE_ID = "skipGoodsFeedbacksReaction";
    static final String UPDATEBUSINESSPRICES_SERVICE_ID = "updateBusinessPrices";
    static final String UPDATECAMPAIGNOFFERS_SERVICE_ID = "updateCampaignOffers";
    static final String UPDATEGOODSFEEDBACKCOMMENT_SERVICE_ID = "updateGoodsFeedbackComment";
    static final String UPDATEOFFERCONTENT_SERVICE_ID = "updateOfferContent";
    static final String UPDATEOFFERMAPPINGENTRIES_SERVICE_ID = "updateOfferMappingEntries";
    static final String UPDATEOFFERMAPPINGS_SERVICE_ID = "updateOfferMappings";
    static final String UPDATEPRICES_SERVICE_ID = "updatePrices";
    static final String UPDATEPROMOOFFERS_SERVICE_ID = "updatePromoOffers";
    
    final FbyApi service;

    public FbyApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.FbyApiImpl");
            service = (FbyApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("FbyApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for addHiddenOffers
        vertx.eventBus().<JsonObject> consumer(ADDHIDDENOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "addHiddenOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject addHiddenOffersRequestParam = message.body().getJsonObject("AddHiddenOffersRequest");
                if (addHiddenOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "AddHiddenOffersRequest is required"), serviceId);
                    return;
                }
                AddHiddenOffersRequest addHiddenOffersRequest = Json.mapper.readValue(addHiddenOffersRequestParam.encode(), AddHiddenOffersRequest.class);
                service.addHiddenOffers(campaignId, addHiddenOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "addHiddenOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("addHiddenOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for addOffersToArchive
        vertx.eventBus().<JsonObject> consumer(ADDOFFERSTOARCHIVE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "addOffersToArchive";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject addOffersToArchiveRequestParam = message.body().getJsonObject("AddOffersToArchiveRequest");
                if (addOffersToArchiveRequestParam == null) {
                    manageError(message, new MainApiException(400, "AddOffersToArchiveRequest is required"), serviceId);
                    return;
                }
                AddOffersToArchiveRequest addOffersToArchiveRequest = Json.mapper.readValue(addOffersToArchiveRequestParam.encode(), AddOffersToArchiveRequest.class);
                service.addOffersToArchive(businessId, addOffersToArchiveRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "addOffersToArchive");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("addOffersToArchive", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for calculateTariffs
        vertx.eventBus().<JsonObject> consumer(CALCULATETARIFFS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "calculateTariffs";
                JsonObject calculateTariffsRequestParam = message.body().getJsonObject("CalculateTariffsRequest");
                if (calculateTariffsRequestParam == null) {
                    manageError(message, new MainApiException(400, "CalculateTariffsRequest is required"), serviceId);
                    return;
                }
                CalculateTariffsRequest calculateTariffsRequest = Json.mapper.readValue(calculateTariffsRequestParam.encode(), CalculateTariffsRequest.class);
                service.calculateTariffs(calculateTariffsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "calculateTariffs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("calculateTariffs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for confirmBusinessPrices
        vertx.eventBus().<JsonObject> consumer(CONFIRMBUSINESSPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "confirmBusinessPrices";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject confirmPricesRequestParam = message.body().getJsonObject("ConfirmPricesRequest");
                if (confirmPricesRequestParam == null) {
                    manageError(message, new MainApiException(400, "ConfirmPricesRequest is required"), serviceId);
                    return;
                }
                ConfirmPricesRequest confirmPricesRequest = Json.mapper.readValue(confirmPricesRequestParam.encode(), ConfirmPricesRequest.class);
                service.confirmBusinessPrices(businessId, confirmPricesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "confirmBusinessPrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("confirmBusinessPrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for confirmCampaignPrices
        vertx.eventBus().<JsonObject> consumer(CONFIRMCAMPAIGNPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "confirmCampaignPrices";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject confirmPricesRequestParam = message.body().getJsonObject("ConfirmPricesRequest");
                if (confirmPricesRequestParam == null) {
                    manageError(message, new MainApiException(400, "ConfirmPricesRequest is required"), serviceId);
                    return;
                }
                ConfirmPricesRequest confirmPricesRequest = Json.mapper.readValue(confirmPricesRequestParam.encode(), ConfirmPricesRequest.class);
                service.confirmCampaignPrices(campaignId, confirmPricesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "confirmCampaignPrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("confirmCampaignPrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createChat
        vertx.eventBus().<JsonObject> consumer(CREATECHAT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createChat";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject createChatRequestParam = message.body().getJsonObject("CreateChatRequest");
                if (createChatRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateChatRequest is required"), serviceId);
                    return;
                }
                CreateChatRequest createChatRequest = Json.mapper.readValue(createChatRequestParam.encode(), CreateChatRequest.class);
                service.createChat(businessId, createChatRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createChat");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createChat", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteCampaignOffers
        vertx.eventBus().<JsonObject> consumer(DELETECAMPAIGNOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteCampaignOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject deleteCampaignOffersRequestParam = message.body().getJsonObject("DeleteCampaignOffersRequest");
                if (deleteCampaignOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeleteCampaignOffersRequest is required"), serviceId);
                    return;
                }
                DeleteCampaignOffersRequest deleteCampaignOffersRequest = Json.mapper.readValue(deleteCampaignOffersRequestParam.encode(), DeleteCampaignOffersRequest.class);
                service.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteCampaignOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteCampaignOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteGoodsFeedbackComment
        vertx.eventBus().<JsonObject> consumer(DELETEGOODSFEEDBACKCOMMENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteGoodsFeedbackComment";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject deleteGoodsFeedbackCommentRequestParam = message.body().getJsonObject("DeleteGoodsFeedbackCommentRequest");
                if (deleteGoodsFeedbackCommentRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeleteGoodsFeedbackCommentRequest is required"), serviceId);
                    return;
                }
                DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest = Json.mapper.readValue(deleteGoodsFeedbackCommentRequestParam.encode(), DeleteGoodsFeedbackCommentRequest.class);
                service.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteGoodsFeedbackComment");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteGoodsFeedbackComment", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteHiddenOffers
        vertx.eventBus().<JsonObject> consumer(DELETEHIDDENOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteHiddenOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject deleteHiddenOffersRequestParam = message.body().getJsonObject("DeleteHiddenOffersRequest");
                if (deleteHiddenOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeleteHiddenOffersRequest is required"), serviceId);
                    return;
                }
                DeleteHiddenOffersRequest deleteHiddenOffersRequest = Json.mapper.readValue(deleteHiddenOffersRequestParam.encode(), DeleteHiddenOffersRequest.class);
                service.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteHiddenOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteHiddenOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteOffers
        vertx.eventBus().<JsonObject> consumer(DELETEOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteOffers";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject deleteOffersRequestParam = message.body().getJsonObject("DeleteOffersRequest");
                if (deleteOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeleteOffersRequest is required"), serviceId);
                    return;
                }
                DeleteOffersRequest deleteOffersRequest = Json.mapper.readValue(deleteOffersRequestParam.encode(), DeleteOffersRequest.class);
                service.deleteOffers(businessId, deleteOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteOffersFromArchive
        vertx.eventBus().<JsonObject> consumer(DELETEOFFERSFROMARCHIVE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteOffersFromArchive";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject deleteOffersFromArchiveRequestParam = message.body().getJsonObject("DeleteOffersFromArchiveRequest");
                if (deleteOffersFromArchiveRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeleteOffersFromArchiveRequest is required"), serviceId);
                    return;
                }
                DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest = Json.mapper.readValue(deleteOffersFromArchiveRequestParam.encode(), DeleteOffersFromArchiveRequest.class);
                service.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteOffersFromArchive");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteOffersFromArchive", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deletePromoOffers
        vertx.eventBus().<JsonObject> consumer(DELETEPROMOOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deletePromoOffers";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject deletePromoOffersRequestParam = message.body().getJsonObject("DeletePromoOffersRequest");
                if (deletePromoOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeletePromoOffersRequest is required"), serviceId);
                    return;
                }
                DeletePromoOffersRequest deletePromoOffersRequest = Json.mapper.readValue(deletePromoOffersRequestParam.encode(), DeletePromoOffersRequest.class);
                service.deletePromoOffers(businessId, deletePromoOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deletePromoOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deletePromoOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateBoostConsolidatedReport
        vertx.eventBus().<JsonObject> consumer(GENERATEBOOSTCONSOLIDATEDREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateBoostConsolidatedReport";
                JsonObject generateBoostConsolidatedRequestParam = message.body().getJsonObject("GenerateBoostConsolidatedRequest");
                if (generateBoostConsolidatedRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateBoostConsolidatedRequest is required"), serviceId);
                    return;
                }
                GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = Json.mapper.readValue(generateBoostConsolidatedRequestParam.encode(), GenerateBoostConsolidatedRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateBoostConsolidatedReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateBoostConsolidatedReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateCompetitorsPositionReport
        vertx.eventBus().<JsonObject> consumer(GENERATECOMPETITORSPOSITIONREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateCompetitorsPositionReport";
                JsonObject generateCompetitorsPositionReportRequestParam = message.body().getJsonObject("GenerateCompetitorsPositionReportRequest");
                if (generateCompetitorsPositionReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateCompetitorsPositionReportRequest is required"), serviceId);
                    return;
                }
                GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = Json.mapper.readValue(generateCompetitorsPositionReportRequestParam.encode(), GenerateCompetitorsPositionReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateCompetitorsPositionReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateCompetitorsPositionReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateGoodsFeedbackReport
        vertx.eventBus().<JsonObject> consumer(GENERATEGOODSFEEDBACKREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateGoodsFeedbackReport";
                JsonObject generateGoodsFeedbackRequestParam = message.body().getJsonObject("GenerateGoodsFeedbackRequest");
                if (generateGoodsFeedbackRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateGoodsFeedbackRequest is required"), serviceId);
                    return;
                }
                GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = Json.mapper.readValue(generateGoodsFeedbackRequestParam.encode(), GenerateGoodsFeedbackRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateGoodsFeedbackReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateGoodsFeedbackReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateGoodsMovementReport
        vertx.eventBus().<JsonObject> consumer(GENERATEGOODSMOVEMENTREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateGoodsMovementReport";
                JsonObject generateGoodsMovementReportRequestParam = message.body().getJsonObject("GenerateGoodsMovementReportRequest");
                if (generateGoodsMovementReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateGoodsMovementReportRequest is required"), serviceId);
                    return;
                }
                GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = Json.mapper.readValue(generateGoodsMovementReportRequestParam.encode(), GenerateGoodsMovementReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateGoodsMovementReport(generateGoodsMovementReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateGoodsMovementReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateGoodsMovementReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateGoodsRealizationReport
        vertx.eventBus().<JsonObject> consumer(GENERATEGOODSREALIZATIONREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateGoodsRealizationReport";
                JsonObject generateGoodsRealizationReportRequestParam = message.body().getJsonObject("GenerateGoodsRealizationReportRequest");
                if (generateGoodsRealizationReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateGoodsRealizationReportRequest is required"), serviceId);
                    return;
                }
                GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = Json.mapper.readValue(generateGoodsRealizationReportRequestParam.encode(), GenerateGoodsRealizationReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateGoodsRealizationReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateGoodsRealizationReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateGoodsTurnoverReport
        vertx.eventBus().<JsonObject> consumer(GENERATEGOODSTURNOVERREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateGoodsTurnoverReport";
                JsonObject generateGoodsTurnoverRequestParam = message.body().getJsonObject("GenerateGoodsTurnoverRequest");
                if (generateGoodsTurnoverRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateGoodsTurnoverRequest is required"), serviceId);
                    return;
                }
                GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = Json.mapper.readValue(generateGoodsTurnoverRequestParam.encode(), GenerateGoodsTurnoverRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateGoodsTurnoverReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateGoodsTurnoverReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generatePricesReport
        vertx.eventBus().<JsonObject> consumer(GENERATEPRICESREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generatePricesReport";
                JsonObject generatePricesReportRequestParam = message.body().getJsonObject("GeneratePricesReportRequest");
                if (generatePricesReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GeneratePricesReportRequest is required"), serviceId);
                    return;
                }
                GeneratePricesReportRequest generatePricesReportRequest = Json.mapper.readValue(generatePricesReportRequestParam.encode(), GeneratePricesReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generatePricesReport(generatePricesReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generatePricesReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generatePricesReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateShelfsStatisticsReport
        vertx.eventBus().<JsonObject> consumer(GENERATESHELFSSTATISTICSREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateShelfsStatisticsReport";
                JsonObject generateShelfsStatisticsRequestParam = message.body().getJsonObject("GenerateShelfsStatisticsRequest");
                if (generateShelfsStatisticsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateShelfsStatisticsRequest is required"), serviceId);
                    return;
                }
                GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = Json.mapper.readValue(generateShelfsStatisticsRequestParam.encode(), GenerateShelfsStatisticsRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateShelfsStatisticsReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateShelfsStatisticsReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateShowsSalesReport
        vertx.eventBus().<JsonObject> consumer(GENERATESHOWSSALESREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateShowsSalesReport";
                JsonObject generateShowsSalesReportRequestParam = message.body().getJsonObject("GenerateShowsSalesReportRequest");
                if (generateShowsSalesReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateShowsSalesReportRequest is required"), serviceId);
                    return;
                }
                GenerateShowsSalesReportRequest generateShowsSalesReportRequest = Json.mapper.readValue(generateShowsSalesReportRequestParam.encode(), GenerateShowsSalesReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateShowsSalesReport(generateShowsSalesReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateShowsSalesReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateShowsSalesReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateStocksOnWarehousesReport
        vertx.eventBus().<JsonObject> consumer(GENERATESTOCKSONWAREHOUSESREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateStocksOnWarehousesReport";
                JsonObject generateStocksOnWarehousesReportRequestParam = message.body().getJsonObject("GenerateStocksOnWarehousesReportRequest");
                if (generateStocksOnWarehousesReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateStocksOnWarehousesReportRequest is required"), serviceId);
                    return;
                }
                GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = Json.mapper.readValue(generateStocksOnWarehousesReportRequestParam.encode(), GenerateStocksOnWarehousesReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateStocksOnWarehousesReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateStocksOnWarehousesReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateUnitedMarketplaceServicesReport
        vertx.eventBus().<JsonObject> consumer(GENERATEUNITEDMARKETPLACESERVICESREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateUnitedMarketplaceServicesReport";
                JsonObject generateUnitedMarketplaceServicesReportRequestParam = message.body().getJsonObject("GenerateUnitedMarketplaceServicesReportRequest");
                if (generateUnitedMarketplaceServicesReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateUnitedMarketplaceServicesReportRequest is required"), serviceId);
                    return;
                }
                GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = Json.mapper.readValue(generateUnitedMarketplaceServicesReportRequestParam.encode(), GenerateUnitedMarketplaceServicesReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateUnitedMarketplaceServicesReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateUnitedMarketplaceServicesReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateUnitedNettingReport
        vertx.eventBus().<JsonObject> consumer(GENERATEUNITEDNETTINGREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateUnitedNettingReport";
                JsonObject generateUnitedNettingReportRequestParam = message.body().getJsonObject("GenerateUnitedNettingReportRequest");
                if (generateUnitedNettingReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateUnitedNettingReportRequest is required"), serviceId);
                    return;
                }
                GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = Json.mapper.readValue(generateUnitedNettingReportRequestParam.encode(), GenerateUnitedNettingReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateUnitedNettingReport(generateUnitedNettingReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateUnitedNettingReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateUnitedNettingReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateUnitedOrdersReport
        vertx.eventBus().<JsonObject> consumer(GENERATEUNITEDORDERSREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateUnitedOrdersReport";
                JsonObject generateUnitedOrdersRequestParam = message.body().getJsonObject("GenerateUnitedOrdersRequest");
                if (generateUnitedOrdersRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateUnitedOrdersRequest is required"), serviceId);
                    return;
                }
                GenerateUnitedOrdersRequest generateUnitedOrdersRequest = Json.mapper.readValue(generateUnitedOrdersRequestParam.encode(), GenerateUnitedOrdersRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateUnitedOrdersReport(generateUnitedOrdersRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateUnitedOrdersReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateUnitedOrdersReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getAllOffers
        vertx.eventBus().<JsonObject> consumer(GETALLOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAllOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String feedIdParam = message.body().getString("feedId");
                Long feedId = (feedIdParam == null) ? null : Json.mapper.readValue(feedIdParam, Long.class);
                String chunkParam = message.body().getString("chunk");
                Integer chunk = (chunkParam == null) ? null : Json.mapper.readValue(chunkParam, Integer.class);
                service.getAllOffers(campaignId, feedId, chunk, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAllOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAllOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getBidsInfoForBusiness
        vertx.eventBus().<JsonObject> consumer(GETBIDSINFOFORBUSINESS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getBidsInfoForBusiness";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonObject getBidsInfoRequestParam = message.body().getJsonObject("GetBidsInfoRequest");
                if (getBidsInfoRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetBidsInfoRequest is required"), serviceId);
                    return;
                }
                GetBidsInfoRequest getBidsInfoRequest = Json.mapper.readValue(getBidsInfoRequestParam.encode(), GetBidsInfoRequest.class);
                service.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getBidsInfoForBusiness");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getBidsInfoForBusiness", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getBidsRecommendations
        vertx.eventBus().<JsonObject> consumer(GETBIDSRECOMMENDATIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getBidsRecommendations";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getBidsRecommendationsRequestParam = message.body().getJsonObject("GetBidsRecommendationsRequest");
                if (getBidsRecommendationsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetBidsRecommendationsRequest is required"), serviceId);
                    return;
                }
                GetBidsRecommendationsRequest getBidsRecommendationsRequest = Json.mapper.readValue(getBidsRecommendationsRequestParam.encode(), GetBidsRecommendationsRequest.class);
                service.getBidsRecommendations(businessId, getBidsRecommendationsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getBidsRecommendations");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getBidsRecommendations", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getBusinessQuarantineOffers
        vertx.eventBus().<JsonObject> consumer(GETBUSINESSQUARANTINEOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getBusinessQuarantineOffers";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getQuarantineOffersRequestParam = message.body().getJsonObject("GetQuarantineOffersRequest");
                if (getQuarantineOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetQuarantineOffersRequest is required"), serviceId);
                    return;
                }
                GetQuarantineOffersRequest getQuarantineOffersRequest = Json.mapper.readValue(getQuarantineOffersRequestParam.encode(), GetQuarantineOffersRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getBusinessQuarantineOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getBusinessQuarantineOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getBusinessSettings
        vertx.eventBus().<JsonObject> consumer(GETBUSINESSSETTINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getBusinessSettings";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                service.getBusinessSettings(businessId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getBusinessSettings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getBusinessSettings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaign
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaign";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getCampaign(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaign");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaign", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignLogins
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNLOGINS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignLogins";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getCampaignLogins(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignLogins");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignLogins", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignOffers
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject getCampaignOffersRequestParam = message.body().getJsonObject("GetCampaignOffersRequest");
                if (getCampaignOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetCampaignOffersRequest is required"), serviceId);
                    return;
                }
                GetCampaignOffersRequest getCampaignOffersRequest = Json.mapper.readValue(getCampaignOffersRequestParam.encode(), GetCampaignOffersRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignQuarantineOffers
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNQUARANTINEOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignQuarantineOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject getQuarantineOffersRequestParam = message.body().getJsonObject("GetQuarantineOffersRequest");
                if (getQuarantineOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetQuarantineOffersRequest is required"), serviceId);
                    return;
                }
                GetQuarantineOffersRequest getQuarantineOffersRequest = Json.mapper.readValue(getQuarantineOffersRequestParam.encode(), GetQuarantineOffersRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignQuarantineOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignQuarantineOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignRegion
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNREGION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignRegion";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getCampaignRegion(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignRegion");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignRegion", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignSettings
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNSETTINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignSettings";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getCampaignSettings(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignSettings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignSettings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaigns
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaigns";
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.getCampaigns(page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaigns");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaigns", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignsByLogin
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNSBYLOGIN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignsByLogin";
                String loginParam = message.body().getString("login");
                if(loginParam == null) {
                    manageError(message, new MainApiException(400, "login is required"), serviceId);
                    return;
                }
                String login = loginParam;
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.getCampaignsByLogin(login, page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignsByLogin");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignsByLogin", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCategoriesMaxSaleQuantum
        vertx.eventBus().<JsonObject> consumer(GETCATEGORIESMAXSALEQUANTUM_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCategoriesMaxSaleQuantum";
                JsonObject getCategoriesMaxSaleQuantumRequestParam = message.body().getJsonObject("GetCategoriesMaxSaleQuantumRequest");
                if (getCategoriesMaxSaleQuantumRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetCategoriesMaxSaleQuantumRequest is required"), serviceId);
                    return;
                }
                GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest = Json.mapper.readValue(getCategoriesMaxSaleQuantumRequestParam.encode(), GetCategoriesMaxSaleQuantumRequest.class);
                service.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCategoriesMaxSaleQuantum");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCategoriesMaxSaleQuantum", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCategoriesTree
        vertx.eventBus().<JsonObject> consumer(GETCATEGORIESTREE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCategoriesTree";
                JsonObject getCategoriesRequestParam = message.body().getJsonObject("GetCategoriesRequest");
                if (getCategoriesRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetCategoriesRequest is required"), serviceId);
                    return;
                }
                GetCategoriesRequest getCategoriesRequest = Json.mapper.readValue(getCategoriesRequestParam.encode(), GetCategoriesRequest.class);
                service.getCategoriesTree(getCategoriesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCategoriesTree");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCategoriesTree", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCategoryContentParameters
        vertx.eventBus().<JsonObject> consumer(GETCATEGORYCONTENTPARAMETERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCategoryContentParameters";
                String categoryIdParam = message.body().getString("categoryId");
                if(categoryIdParam == null) {
                    manageError(message, new MainApiException(400, "categoryId is required"), serviceId);
                    return;
                }
                Long categoryId = Json.mapper.readValue(categoryIdParam, Long.class);
                service.getCategoryContentParameters(categoryId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCategoryContentParameters");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCategoryContentParameters", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getChatHistory
        vertx.eventBus().<JsonObject> consumer(GETCHATHISTORY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getChatHistory";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String chatIdParam = message.body().getString("chatId");
                if(chatIdParam == null) {
                    manageError(message, new MainApiException(400, "chatId is required"), serviceId);
                    return;
                }
                Long chatId = Json.mapper.readValue(chatIdParam, Long.class);
                JsonObject getChatHistoryRequestParam = message.body().getJsonObject("GetChatHistoryRequest");
                if (getChatHistoryRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetChatHistoryRequest is required"), serviceId);
                    return;
                }
                GetChatHistoryRequest getChatHistoryRequest = Json.mapper.readValue(getChatHistoryRequestParam.encode(), GetChatHistoryRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getChatHistory");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getChatHistory", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getChats
        vertx.eventBus().<JsonObject> consumer(GETCHATS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getChats";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getChatsRequestParam = message.body().getJsonObject("GetChatsRequest");
                if (getChatsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetChatsRequest is required"), serviceId);
                    return;
                }
                GetChatsRequest getChatsRequest = Json.mapper.readValue(getChatsRequestParam.encode(), GetChatsRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getChats(businessId, getChatsRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getChats");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getChats", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getFeed
        vertx.eventBus().<JsonObject> consumer(GETFEED_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getFeed";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String feedIdParam = message.body().getString("feedId");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feedId is required"), serviceId);
                    return;
                }
                Long feedId = Json.mapper.readValue(feedIdParam, Long.class);
                service.getFeed(campaignId, feedId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getFeed");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getFeed", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getFeedIndexLogs
        vertx.eventBus().<JsonObject> consumer(GETFEEDINDEXLOGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getFeedIndexLogs";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String feedIdParam = message.body().getString("feedId");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feedId is required"), serviceId);
                    return;
                }
                Long feedId = Json.mapper.readValue(feedIdParam, Long.class);
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String publishedTimeFromParam = message.body().getString("published_time_from");
                OffsetDateTime publishedTimeFrom = (publishedTimeFromParam == null) ? null : Json.mapper.readValue(publishedTimeFromParam, OffsetDateTime.class);
                String publishedTimeToParam = message.body().getString("published_time_to");
                OffsetDateTime publishedTimeTo = (publishedTimeToParam == null) ? null : Json.mapper.readValue(publishedTimeToParam, OffsetDateTime.class);
                JsonObject statusParam = message.body().getJsonObject("status");
                if (statusParam == null) {
                    manageError(message, new MainApiException(400, "status is required"), serviceId);
                    return;
                }
                FeedIndexLogsStatusType status = Json.mapper.readValue(statusParam.encode(), FeedIndexLogsStatusType.class);
                service.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getFeedIndexLogs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getFeedIndexLogs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getFeedbackAndCommentUpdates
        vertx.eventBus().<JsonObject> consumer(GETFEEDBACKANDCOMMENTUPDATES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getFeedbackAndCommentUpdates";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String fromDateParam = message.body().getString("from_date");
                LocalDate fromDate = (fromDateParam == null) ? null : Json.mapper.readValue(fromDateParam, LocalDate.class);
                service.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getFeedbackAndCommentUpdates");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getFeedbackAndCommentUpdates", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getFeeds
        vertx.eventBus().<JsonObject> consumer(GETFEEDS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getFeeds";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getFeeds(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getFeeds");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getFeeds", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getFulfillmentWarehouses
        vertx.eventBus().<JsonObject> consumer(GETFULFILLMENTWAREHOUSES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getFulfillmentWarehouses";
                service.getFulfillmentWarehouses(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getFulfillmentWarehouses");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getFulfillmentWarehouses", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getGoodsFeedbackComments
        vertx.eventBus().<JsonObject> consumer(GETGOODSFEEDBACKCOMMENTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getGoodsFeedbackComments";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getGoodsFeedbackCommentsRequestParam = message.body().getJsonObject("GetGoodsFeedbackCommentsRequest");
                if (getGoodsFeedbackCommentsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetGoodsFeedbackCommentsRequest is required"), serviceId);
                    return;
                }
                GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest = Json.mapper.readValue(getGoodsFeedbackCommentsRequestParam.encode(), GetGoodsFeedbackCommentsRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getGoodsFeedbackComments");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getGoodsFeedbackComments", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getGoodsFeedbacks
        vertx.eventBus().<JsonObject> consumer(GETGOODSFEEDBACKS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getGoodsFeedbacks";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonObject getGoodsFeedbackRequestParam = message.body().getJsonObject("GetGoodsFeedbackRequest");
                if (getGoodsFeedbackRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetGoodsFeedbackRequest is required"), serviceId);
                    return;
                }
                GetGoodsFeedbackRequest getGoodsFeedbackRequest = Json.mapper.readValue(getGoodsFeedbackRequestParam.encode(), GetGoodsFeedbackRequest.class);
                service.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getGoodsFeedbacks");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getGoodsFeedbacks", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getGoodsStats
        vertx.eventBus().<JsonObject> consumer(GETGOODSSTATS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getGoodsStats";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject getGoodsStatsRequestParam = message.body().getJsonObject("GetGoodsStatsRequest");
                if (getGoodsStatsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetGoodsStatsRequest is required"), serviceId);
                    return;
                }
                GetGoodsStatsRequest getGoodsStatsRequest = Json.mapper.readValue(getGoodsStatsRequestParam.encode(), GetGoodsStatsRequest.class);
                service.getGoodsStats(campaignId, getGoodsStatsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getGoodsStats");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getGoodsStats", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getHiddenOffers
        vertx.eventBus().<JsonObject> consumer(GETHIDDENOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getHiddenOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonArray offerIdParam = message.body().getJsonArray("offer_id");
                List<String> offerId = (offerIdParam == null) ? null : Json.mapper.readValue(offerIdParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String offsetParam = message.body().getString("offset");
                Integer offset = (offsetParam == null) ? null : Json.mapper.readValue(offsetParam, Integer.class);
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getHiddenOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getHiddenOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOfferCardsContentStatus
        vertx.eventBus().<JsonObject> consumer(GETOFFERCARDSCONTENTSTATUS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOfferCardsContentStatus";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonObject getOfferCardsContentStatusRequestParam = message.body().getJsonObject("GetOfferCardsContentStatusRequest");
                if (getOfferCardsContentStatusRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetOfferCardsContentStatusRequest is required"), serviceId);
                    return;
                }
                GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest = Json.mapper.readValue(getOfferCardsContentStatusRequestParam.encode(), GetOfferCardsContentStatusRequest.class);
                service.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOfferCardsContentStatus");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOfferCardsContentStatus", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOfferMappingEntries
        vertx.eventBus().<JsonObject> consumer(GETOFFERMAPPINGENTRIES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOfferMappingEntries";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonArray offerIdParam = message.body().getJsonArray("offer_id");
                List<String> offerId = (offerIdParam == null) ? null : Json.mapper.readValue(offerIdParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray shopSkuParam = message.body().getJsonArray("shop_sku");
                List<String> shopSku = (shopSkuParam == null) ? null : Json.mapper.readValue(shopSkuParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonObject mappingKindParam = message.body().getJsonObject("mapping_kind");
                if (mappingKindParam == null) {
                    manageError(message, new MainApiException(400, "mapping_kind is required"), serviceId);
                    return;
                }
                OfferMappingKindType mappingKind = Json.mapper.readValue(mappingKindParam.encode(), OfferMappingKindType.class);
                JsonArray statusParam = message.body().getJsonArray("status");
                List<OfferProcessingStatusType> status = (statusParam == null) ? null : Json.mapper.readValue(statusParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, OfferProcessingStatusType.class));
                JsonArray availabilityParam = message.body().getJsonArray("availability");
                List<OfferAvailabilityStatusType> availability = (availabilityParam == null) ? null : Json.mapper.readValue(availabilityParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, OfferAvailabilityStatusType.class));
                JsonArray categoryIdParam = message.body().getJsonArray("category_id");
                List<Integer> categoryId = (categoryIdParam == null) ? null : Json.mapper.readValue(categoryIdParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                JsonArray vendorParam = message.body().getJsonArray("vendor");
                List<String> vendor = (vendorParam == null) ? null : Json.mapper.readValue(vendorParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOfferMappingEntries");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOfferMappingEntries", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOfferMappings
        vertx.eventBus().<JsonObject> consumer(GETOFFERMAPPINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOfferMappings";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonObject getOfferMappingsRequestParam = message.body().getJsonObject("GetOfferMappingsRequest");
                if (getOfferMappingsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetOfferMappingsRequest is required"), serviceId);
                    return;
                }
                GetOfferMappingsRequest getOfferMappingsRequest = Json.mapper.readValue(getOfferMappingsRequestParam.encode(), GetOfferMappingsRequest.class);
                service.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOfferMappings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOfferMappings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOfferRecommendations
        vertx.eventBus().<JsonObject> consumer(GETOFFERRECOMMENDATIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOfferRecommendations";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getOfferRecommendationsRequestParam = message.body().getJsonObject("GetOfferRecommendationsRequest");
                if (getOfferRecommendationsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetOfferRecommendationsRequest is required"), serviceId);
                    return;
                }
                GetOfferRecommendationsRequest getOfferRecommendationsRequest = Json.mapper.readValue(getOfferRecommendationsRequestParam.encode(), GetOfferRecommendationsRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOfferRecommendations");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOfferRecommendations", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOffers
        vertx.eventBus().<JsonObject> consumer(GETOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String queryParam = message.body().getString("query");
                String query = (queryParam == null) ? null : queryParam;
                String feedIdParam = message.body().getString("feedId");
                Long feedId = (feedIdParam == null) ? null : Json.mapper.readValue(feedIdParam, Long.class);
                String shopCategoryIdParam = message.body().getString("shopCategoryId");
                String shopCategoryId = (shopCategoryIdParam == null) ? null : shopCategoryIdParam;
                JsonObject currencyParam = message.body().getJsonObject("currency");
                if (currencyParam == null) {
                    manageError(message, new MainApiException(400, "currency is required"), serviceId);
                    return;
                }
                CurrencyType currency = Json.mapper.readValue(currencyParam.encode(), CurrencyType.class);
                String matchedParam = message.body().getString("matched");
                Boolean matched = (matchedParam == null) ? null : Json.mapper.readValue(matchedParam, Boolean.class);
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOrder
        vertx.eventBus().<JsonObject> consumer(GETORDER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrder";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                service.getOrder(campaignId, orderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrder");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrder", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOrderBusinessBuyerInfo
        vertx.eventBus().<JsonObject> consumer(GETORDERBUSINESSBUYERINFO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrderBusinessBuyerInfo";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                service.getOrderBusinessBuyerInfo(campaignId, orderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrderBusinessBuyerInfo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrderBusinessBuyerInfo", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOrderBusinessDocumentsInfo
        vertx.eventBus().<JsonObject> consumer(GETORDERBUSINESSDOCUMENTSINFO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrderBusinessDocumentsInfo";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                service.getOrderBusinessDocumentsInfo(campaignId, orderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrderBusinessDocumentsInfo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrderBusinessDocumentsInfo", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOrders
        vertx.eventBus().<JsonObject> consumer(GETORDERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrders";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonArray orderIdsParam = message.body().getJsonArray("orderIds");
                List<Long> orderIds = (orderIdsParam == null) ? null : Json.mapper.readValue(orderIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Long.class));
                JsonArray statusParam = message.body().getJsonArray("status");
                Set<OrderStatusType> status = (statusParam == null) ? null : Json.mapper.readValue(statusParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, OrderStatusType.class));
                JsonArray substatusParam = message.body().getJsonArray("substatus");
                Set<OrderSubstatusType> substatus = (substatusParam == null) ? null : Json.mapper.readValue(substatusParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, OrderSubstatusType.class));
                String fromDateParam = message.body().getString("fromDate");
                LocalDate fromDate = (fromDateParam == null) ? null : Json.mapper.readValue(fromDateParam, LocalDate.class);
                String toDateParam = message.body().getString("toDate");
                LocalDate toDate = (toDateParam == null) ? null : Json.mapper.readValue(toDateParam, LocalDate.class);
                String supplierShipmentDateFromParam = message.body().getString("supplierShipmentDateFrom");
                LocalDate supplierShipmentDateFrom = (supplierShipmentDateFromParam == null) ? null : Json.mapper.readValue(supplierShipmentDateFromParam, LocalDate.class);
                String supplierShipmentDateToParam = message.body().getString("supplierShipmentDateTo");
                LocalDate supplierShipmentDateTo = (supplierShipmentDateToParam == null) ? null : Json.mapper.readValue(supplierShipmentDateToParam, LocalDate.class);
                String updatedAtFromParam = message.body().getString("updatedAtFrom");
                OffsetDateTime updatedAtFrom = (updatedAtFromParam == null) ? null : Json.mapper.readValue(updatedAtFromParam, OffsetDateTime.class);
                String updatedAtToParam = message.body().getString("updatedAtTo");
                OffsetDateTime updatedAtTo = (updatedAtToParam == null) ? null : Json.mapper.readValue(updatedAtToParam, OffsetDateTime.class);
                JsonObject dispatchTypeParam = message.body().getJsonObject("dispatchType");
                if (dispatchTypeParam == null) {
                    manageError(message, new MainApiException(400, "dispatchType is required"), serviceId);
                    return;
                }
                OrderDeliveryDispatchType dispatchType = Json.mapper.readValue(dispatchTypeParam.encode(), OrderDeliveryDispatchType.class);
                String fakeParam = message.body().getString("fake");
                Boolean fake = (fakeParam == null) ? false : Json.mapper.readValue(fakeParam, Boolean.class);
                String hasCisParam = message.body().getString("hasCis");
                Boolean hasCis = (hasCisParam == null) ? false : Json.mapper.readValue(hasCisParam, Boolean.class);
                String onlyWaitingForCancellationApproveParam = message.body().getString("onlyWaitingForCancellationApprove");
                Boolean onlyWaitingForCancellationApprove = (onlyWaitingForCancellationApproveParam == null) ? false : Json.mapper.readValue(onlyWaitingForCancellationApproveParam, Boolean.class);
                String onlyEstimatedDeliveryParam = message.body().getString("onlyEstimatedDelivery");
                Boolean onlyEstimatedDelivery = (onlyEstimatedDeliveryParam == null) ? false : Json.mapper.readValue(onlyEstimatedDeliveryParam, Boolean.class);
                JsonObject buyerTypeParam = message.body().getJsonObject("buyerType");
                if (buyerTypeParam == null) {
                    manageError(message, new MainApiException(400, "buyerType is required"), serviceId);
                    return;
                }
                OrderBuyerType buyerType = Json.mapper.readValue(buyerTypeParam.encode(), OrderBuyerType.class);
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrders");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrders", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOrdersStats
        vertx.eventBus().<JsonObject> consumer(GETORDERSSTATS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrdersStats";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonObject getOrdersStatsRequestParam = message.body().getJsonObject("GetOrdersStatsRequest");
                if (getOrdersStatsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetOrdersStatsRequest is required"), serviceId);
                    return;
                }
                GetOrdersStatsRequest getOrdersStatsRequest = Json.mapper.readValue(getOrdersStatsRequestParam.encode(), GetOrdersStatsRequest.class);
                service.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrdersStats");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrdersStats", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPrices
        vertx.eventBus().<JsonObject> consumer(GETPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPrices";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String archivedParam = message.body().getString("archived");
                Boolean archived = (archivedParam == null) ? false : Json.mapper.readValue(archivedParam, Boolean.class);
                service.getPrices(campaignId, pageToken, limit, archived, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPricesByOfferIds
        vertx.eventBus().<JsonObject> consumer(GETPRICESBYOFFERIDS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPricesByOfferIds";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonObject getPricesByOfferIdsRequestParam = message.body().getJsonObject("GetPricesByOfferIdsRequest");
                if (getPricesByOfferIdsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetPricesByOfferIdsRequest is required"), serviceId);
                    return;
                }
                GetPricesByOfferIdsRequest getPricesByOfferIdsRequest = Json.mapper.readValue(getPricesByOfferIdsRequestParam.encode(), GetPricesByOfferIdsRequest.class);
                service.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPricesByOfferIds");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPricesByOfferIds", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPromoOffers
        vertx.eventBus().<JsonObject> consumer(GETPROMOOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPromoOffers";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getPromoOffersRequestParam = message.body().getJsonObject("GetPromoOffersRequest");
                if (getPromoOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetPromoOffersRequest is required"), serviceId);
                    return;
                }
                GetPromoOffersRequest getPromoOffersRequest = Json.mapper.readValue(getPromoOffersRequestParam.encode(), GetPromoOffersRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPromoOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPromoOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPromos
        vertx.eventBus().<JsonObject> consumer(GETPROMOS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPromos";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getPromosRequestParam = message.body().getJsonObject("GetPromosRequest");
                if (getPromosRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetPromosRequest is required"), serviceId);
                    return;
                }
                GetPromosRequest getPromosRequest = Json.mapper.readValue(getPromosRequestParam.encode(), GetPromosRequest.class);
                service.getPromos(businessId, getPromosRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPromos");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPromos", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getQualityRatings
        vertx.eventBus().<JsonObject> consumer(GETQUALITYRATINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getQualityRatings";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getQualityRatingRequestParam = message.body().getJsonObject("GetQualityRatingRequest");
                if (getQualityRatingRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetQualityRatingRequest is required"), serviceId);
                    return;
                }
                GetQualityRatingRequest getQualityRatingRequest = Json.mapper.readValue(getQualityRatingRequestParam.encode(), GetQualityRatingRequest.class);
                service.getQualityRatings(businessId, getQualityRatingRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getQualityRatings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getQualityRatings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getReportInfo
        vertx.eventBus().<JsonObject> consumer(GETREPORTINFO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getReportInfo";
                String reportIdParam = message.body().getString("reportId");
                if(reportIdParam == null) {
                    manageError(message, new MainApiException(400, "reportId is required"), serviceId);
                    return;
                }
                String reportId = reportIdParam;
                service.getReportInfo(reportId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getReportInfo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getReportInfo", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getReturn
        vertx.eventBus().<JsonObject> consumer(GETRETURN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getReturn";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                String returnIdParam = message.body().getString("returnId");
                if(returnIdParam == null) {
                    manageError(message, new MainApiException(400, "returnId is required"), serviceId);
                    return;
                }
                Long returnId = Json.mapper.readValue(returnIdParam, Long.class);
                service.getReturn(campaignId, orderId, returnId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getReturn");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getReturn", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getReturnPhoto
        vertx.eventBus().<JsonObject> consumer(GETRETURNPHOTO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getReturnPhoto";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                String returnIdParam = message.body().getString("returnId");
                if(returnIdParam == null) {
                    manageError(message, new MainApiException(400, "returnId is required"), serviceId);
                    return;
                }
                Long returnId = Json.mapper.readValue(returnIdParam, Long.class);
                String itemIdParam = message.body().getString("itemId");
                if(itemIdParam == null) {
                    manageError(message, new MainApiException(400, "itemId is required"), serviceId);
                    return;
                }
                Long itemId = Json.mapper.readValue(itemIdParam, Long.class);
                String imageHashParam = message.body().getString("imageHash");
                if(imageHashParam == null) {
                    manageError(message, new MainApiException(400, "imageHash is required"), serviceId);
                    return;
                }
                String imageHash = imageHashParam;
                service.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getReturnPhoto");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getReturnPhoto", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getReturns
        vertx.eventBus().<JsonObject> consumer(GETRETURNS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getReturns";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonArray orderIdsParam = message.body().getJsonArray("orderIds");
                List<Long> orderIds = (orderIdsParam == null) ? null : Json.mapper.readValue(orderIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Long.class));
                JsonArray statusesParam = message.body().getJsonArray("statuses");
                List<RefundStatusType> statuses = (statusesParam == null) ? null : Json.mapper.readValue(statusesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, RefundStatusType.class));
                JsonObject typeParam = message.body().getJsonObject("type");
                if (typeParam == null) {
                    manageError(message, new MainApiException(400, "type is required"), serviceId);
                    return;
                }
                ReturnType type = Json.mapper.readValue(typeParam.encode(), ReturnType.class);
                String fromDateParam = message.body().getString("fromDate");
                LocalDate fromDate = (fromDateParam == null) ? null : Json.mapper.readValue(fromDateParam, LocalDate.class);
                String toDateParam = message.body().getString("toDate");
                LocalDate toDate = (toDateParam == null) ? null : Json.mapper.readValue(toDateParam, LocalDate.class);
                String fromDate2Param = message.body().getString("from_date");
                LocalDate fromDate2 = (fromDate2Param == null) ? null : Json.mapper.readValue(fromDate2Param, LocalDate.class);
                String toDate2Param = message.body().getString("to_date");
                LocalDate toDate2 = (toDate2Param == null) ? null : Json.mapper.readValue(toDate2Param, LocalDate.class);
                service.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getReturns");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getReturns", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getStocks
        vertx.eventBus().<JsonObject> consumer(GETSTOCKS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getStocks";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonObject getWarehouseStocksRequestParam = message.body().getJsonObject("GetWarehouseStocksRequest");
                if (getWarehouseStocksRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetWarehouseStocksRequest is required"), serviceId);
                    return;
                }
                GetWarehouseStocksRequest getWarehouseStocksRequest = Json.mapper.readValue(getWarehouseStocksRequestParam.encode(), GetWarehouseStocksRequest.class);
                service.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getStocks");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getStocks", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getSuggestedOfferMappingEntries
        vertx.eventBus().<JsonObject> consumer(GETSUGGESTEDOFFERMAPPINGENTRIES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getSuggestedOfferMappingEntries";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject getSuggestedOfferMappingEntriesRequestParam = message.body().getJsonObject("GetSuggestedOfferMappingEntriesRequest");
                if (getSuggestedOfferMappingEntriesRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetSuggestedOfferMappingEntriesRequest is required"), serviceId);
                    return;
                }
                GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest = Json.mapper.readValue(getSuggestedOfferMappingEntriesRequestParam.encode(), GetSuggestedOfferMappingEntriesRequest.class);
                service.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getSuggestedOfferMappingEntries");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getSuggestedOfferMappingEntries", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getSuggestedOfferMappings
        vertx.eventBus().<JsonObject> consumer(GETSUGGESTEDOFFERMAPPINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getSuggestedOfferMappings";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getSuggestedOfferMappingsRequestParam = message.body().getJsonObject("GetSuggestedOfferMappingsRequest");
                if (getSuggestedOfferMappingsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetSuggestedOfferMappingsRequest is required"), serviceId);
                    return;
                }
                GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = Json.mapper.readValue(getSuggestedOfferMappingsRequestParam.encode(), GetSuggestedOfferMappingsRequest.class);
                service.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getSuggestedOfferMappings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getSuggestedOfferMappings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getSuggestedPrices
        vertx.eventBus().<JsonObject> consumer(GETSUGGESTEDPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getSuggestedPrices";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject suggestPricesRequestParam = message.body().getJsonObject("SuggestPricesRequest");
                if (suggestPricesRequestParam == null) {
                    manageError(message, new MainApiException(400, "SuggestPricesRequest is required"), serviceId);
                    return;
                }
                SuggestPricesRequest suggestPricesRequest = Json.mapper.readValue(suggestPricesRequestParam.encode(), SuggestPricesRequest.class);
                service.getSuggestedPrices(campaignId, suggestPricesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getSuggestedPrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getSuggestedPrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for putBidsForBusiness
        vertx.eventBus().<JsonObject> consumer(PUTBIDSFORBUSINESS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "putBidsForBusiness";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject putSkuBidsRequestParam = message.body().getJsonObject("PutSkuBidsRequest");
                if (putSkuBidsRequestParam == null) {
                    manageError(message, new MainApiException(400, "PutSkuBidsRequest is required"), serviceId);
                    return;
                }
                PutSkuBidsRequest putSkuBidsRequest = Json.mapper.readValue(putSkuBidsRequestParam.encode(), PutSkuBidsRequest.class);
                service.putBidsForBusiness(businessId, putSkuBidsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "putBidsForBusiness");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("putBidsForBusiness", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for putBidsForCampaign
        vertx.eventBus().<JsonObject> consumer(PUTBIDSFORCAMPAIGN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "putBidsForCampaign";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject putSkuBidsRequestParam = message.body().getJsonObject("PutSkuBidsRequest");
                if (putSkuBidsRequestParam == null) {
                    manageError(message, new MainApiException(400, "PutSkuBidsRequest is required"), serviceId);
                    return;
                }
                PutSkuBidsRequest putSkuBidsRequest = Json.mapper.readValue(putSkuBidsRequestParam.encode(), PutSkuBidsRequest.class);
                service.putBidsForCampaign(campaignId, putSkuBidsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "putBidsForCampaign");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("putBidsForCampaign", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for refreshFeed
        vertx.eventBus().<JsonObject> consumer(REFRESHFEED_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "refreshFeed";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String feedIdParam = message.body().getString("feedId");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feedId is required"), serviceId);
                    return;
                }
                Long feedId = Json.mapper.readValue(feedIdParam, Long.class);
                service.refreshFeed(campaignId, feedId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "refreshFeed");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("refreshFeed", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for searchRegionChildren
        vertx.eventBus().<JsonObject> consumer(SEARCHREGIONCHILDREN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "searchRegionChildren";
                String regionIdParam = message.body().getString("regionId");
                if(regionIdParam == null) {
                    manageError(message, new MainApiException(400, "regionId is required"), serviceId);
                    return;
                }
                Long regionId = Json.mapper.readValue(regionIdParam, Long.class);
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.searchRegionChildren(regionId, page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "searchRegionChildren");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("searchRegionChildren", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for searchRegionsById
        vertx.eventBus().<JsonObject> consumer(SEARCHREGIONSBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "searchRegionsById";
                String regionIdParam = message.body().getString("regionId");
                if(regionIdParam == null) {
                    manageError(message, new MainApiException(400, "regionId is required"), serviceId);
                    return;
                }
                Long regionId = Json.mapper.readValue(regionIdParam, Long.class);
                service.searchRegionsById(regionId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "searchRegionsById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("searchRegionsById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for searchRegionsByName
        vertx.eventBus().<JsonObject> consumer(SEARCHREGIONSBYNAME_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "searchRegionsByName";
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.searchRegionsByName(name, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "searchRegionsByName");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("searchRegionsByName", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for sendFileToChat
        vertx.eventBus().<JsonObject> consumer(SENDFILETOCHAT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "sendFileToChat";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String chatIdParam = message.body().getString("chatId");
                if(chatIdParam == null) {
                    manageError(message, new MainApiException(400, "chatId is required"), serviceId);
                    return;
                }
                Long chatId = Json.mapper.readValue(chatIdParam, Long.class);
                String _fileParam = message.body().getString("file");
                if(_fileParam == null) {
                    manageError(message, new MainApiException(400, "file is required"), serviceId);
                    return;
                }
                File _file = Json.mapper.readValue(_fileParam, File.class);
                service.sendFileToChat(businessId, chatId, _file, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "sendFileToChat");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("sendFileToChat", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for sendMessageToChat
        vertx.eventBus().<JsonObject> consumer(SENDMESSAGETOCHAT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "sendMessageToChat";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String chatIdParam = message.body().getString("chatId");
                if(chatIdParam == null) {
                    manageError(message, new MainApiException(400, "chatId is required"), serviceId);
                    return;
                }
                Long chatId = Json.mapper.readValue(chatIdParam, Long.class);
                JsonObject sendMessageToChatRequestParam = message.body().getJsonObject("SendMessageToChatRequest");
                if (sendMessageToChatRequestParam == null) {
                    manageError(message, new MainApiException(400, "SendMessageToChatRequest is required"), serviceId);
                    return;
                }
                SendMessageToChatRequest sendMessageToChatRequest = Json.mapper.readValue(sendMessageToChatRequestParam.encode(), SendMessageToChatRequest.class);
                service.sendMessageToChat(businessId, chatId, sendMessageToChatRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "sendMessageToChat");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("sendMessageToChat", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for setFeedParams
        vertx.eventBus().<JsonObject> consumer(SETFEEDPARAMS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "setFeedParams";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String feedIdParam = message.body().getString("feedId");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feedId is required"), serviceId);
                    return;
                }
                Long feedId = Json.mapper.readValue(feedIdParam, Long.class);
                JsonObject setFeedParamsRequestParam = message.body().getJsonObject("SetFeedParamsRequest");
                if (setFeedParamsRequestParam == null) {
                    manageError(message, new MainApiException(400, "SetFeedParamsRequest is required"), serviceId);
                    return;
                }
                SetFeedParamsRequest setFeedParamsRequest = Json.mapper.readValue(setFeedParamsRequestParam.encode(), SetFeedParamsRequest.class);
                service.setFeedParams(campaignId, feedId, setFeedParamsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "setFeedParams");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("setFeedParams", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for skipGoodsFeedbacksReaction
        vertx.eventBus().<JsonObject> consumer(SKIPGOODSFEEDBACKSREACTION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "skipGoodsFeedbacksReaction";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject skipGoodsFeedbackReactionRequestParam = message.body().getJsonObject("SkipGoodsFeedbackReactionRequest");
                if (skipGoodsFeedbackReactionRequestParam == null) {
                    manageError(message, new MainApiException(400, "SkipGoodsFeedbackReactionRequest is required"), serviceId);
                    return;
                }
                SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest = Json.mapper.readValue(skipGoodsFeedbackReactionRequestParam.encode(), SkipGoodsFeedbackReactionRequest.class);
                service.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "skipGoodsFeedbacksReaction");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("skipGoodsFeedbacksReaction", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateBusinessPrices
        vertx.eventBus().<JsonObject> consumer(UPDATEBUSINESSPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateBusinessPrices";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject updateBusinessPricesRequestParam = message.body().getJsonObject("UpdateBusinessPricesRequest");
                if (updateBusinessPricesRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateBusinessPricesRequest is required"), serviceId);
                    return;
                }
                UpdateBusinessPricesRequest updateBusinessPricesRequest = Json.mapper.readValue(updateBusinessPricesRequestParam.encode(), UpdateBusinessPricesRequest.class);
                service.updateBusinessPrices(businessId, updateBusinessPricesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateBusinessPrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateBusinessPrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateCampaignOffers
        vertx.eventBus().<JsonObject> consumer(UPDATECAMPAIGNOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateCampaignOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject updateCampaignOffersRequestParam = message.body().getJsonObject("UpdateCampaignOffersRequest");
                if (updateCampaignOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateCampaignOffersRequest is required"), serviceId);
                    return;
                }
                UpdateCampaignOffersRequest updateCampaignOffersRequest = Json.mapper.readValue(updateCampaignOffersRequestParam.encode(), UpdateCampaignOffersRequest.class);
                service.updateCampaignOffers(campaignId, updateCampaignOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateCampaignOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateCampaignOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateGoodsFeedbackComment
        vertx.eventBus().<JsonObject> consumer(UPDATEGOODSFEEDBACKCOMMENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateGoodsFeedbackComment";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject updateGoodsFeedbackCommentRequestParam = message.body().getJsonObject("UpdateGoodsFeedbackCommentRequest");
                if (updateGoodsFeedbackCommentRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateGoodsFeedbackCommentRequest is required"), serviceId);
                    return;
                }
                UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest = Json.mapper.readValue(updateGoodsFeedbackCommentRequestParam.encode(), UpdateGoodsFeedbackCommentRequest.class);
                service.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateGoodsFeedbackComment");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateGoodsFeedbackComment", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOfferContent
        vertx.eventBus().<JsonObject> consumer(UPDATEOFFERCONTENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOfferContent";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject updateOfferContentRequestParam = message.body().getJsonObject("UpdateOfferContentRequest");
                if (updateOfferContentRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOfferContentRequest is required"), serviceId);
                    return;
                }
                UpdateOfferContentRequest updateOfferContentRequest = Json.mapper.readValue(updateOfferContentRequestParam.encode(), UpdateOfferContentRequest.class);
                service.updateOfferContent(businessId, updateOfferContentRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOfferContent");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOfferContent", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOfferMappingEntries
        vertx.eventBus().<JsonObject> consumer(UPDATEOFFERMAPPINGENTRIES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOfferMappingEntries";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject updateOfferMappingEntryRequestParam = message.body().getJsonObject("UpdateOfferMappingEntryRequest");
                if (updateOfferMappingEntryRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOfferMappingEntryRequest is required"), serviceId);
                    return;
                }
                UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = Json.mapper.readValue(updateOfferMappingEntryRequestParam.encode(), UpdateOfferMappingEntryRequest.class);
                service.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOfferMappingEntries");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOfferMappingEntries", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOfferMappings
        vertx.eventBus().<JsonObject> consumer(UPDATEOFFERMAPPINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOfferMappings";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject updateOfferMappingsRequestParam = message.body().getJsonObject("UpdateOfferMappingsRequest");
                if (updateOfferMappingsRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOfferMappingsRequest is required"), serviceId);
                    return;
                }
                UpdateOfferMappingsRequest updateOfferMappingsRequest = Json.mapper.readValue(updateOfferMappingsRequestParam.encode(), UpdateOfferMappingsRequest.class);
                service.updateOfferMappings(businessId, updateOfferMappingsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOfferMappings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOfferMappings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updatePrices
        vertx.eventBus().<JsonObject> consumer(UPDATEPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updatePrices";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject updatePricesRequestParam = message.body().getJsonObject("UpdatePricesRequest");
                if (updatePricesRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdatePricesRequest is required"), serviceId);
                    return;
                }
                UpdatePricesRequest updatePricesRequest = Json.mapper.readValue(updatePricesRequestParam.encode(), UpdatePricesRequest.class);
                service.updatePrices(campaignId, updatePricesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updatePrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updatePrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updatePromoOffers
        vertx.eventBus().<JsonObject> consumer(UPDATEPROMOOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updatePromoOffers";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject updatePromoOffersRequestParam = message.body().getJsonObject("UpdatePromoOffersRequest");
                if (updatePromoOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdatePromoOffersRequest is required"), serviceId);
                    return;
                }
                UpdatePromoOffersRequest updatePromoOffersRequest = Json.mapper.readValue(updatePromoOffersRequestParam.encode(), UpdatePromoOffersRequest.class);
                service.updatePromoOffers(businessId, updatePromoOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updatePromoOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updatePromoOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
