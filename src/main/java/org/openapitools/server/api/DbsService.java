package org.openapitools.server.api;

import org.openapitools.server.model.AcceptOrderCancellationRequest;
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
import org.openapitools.server.model.ChangeOutletRequest;
import java.util.stream.Collectors;
import org.openapitools.server.model.ConfirmPricesRequest;
import org.openapitools.server.model.CreateChatRequest;
import org.openapitools.server.model.CreateChatResponse;
import org.openapitools.server.model.CreateOutletResponse;
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
import org.openapitools.server.model.GetModelsOffersResponse;
import org.openapitools.server.model.GetModelsRequest;
import org.openapitools.server.model.GetModelsResponse;
import org.openapitools.server.model.GetOfferCardsContentStatusRequest;
import org.openapitools.server.model.GetOfferCardsContentStatusResponse;
import org.openapitools.server.model.GetOfferMappingEntriesResponse;
import org.openapitools.server.model.GetOfferMappingsRequest;
import org.openapitools.server.model.GetOfferMappingsResponse;
import org.openapitools.server.model.GetOfferRecommendationsRequest;
import org.openapitools.server.model.GetOfferRecommendationsResponse;
import org.openapitools.server.model.GetOffersResponse;
import org.openapitools.server.model.GetOrderBuyerInfoResponse;
import org.openapitools.server.model.GetOrderLabelsDataResponse;
import org.openapitools.server.model.GetOrderResponse;
import org.openapitools.server.model.GetOrdersResponse;
import org.openapitools.server.model.GetOrdersStatsRequest;
import org.openapitools.server.model.GetOrdersStatsResponse;
import org.openapitools.server.model.GetOutletLicensesResponse;
import org.openapitools.server.model.GetOutletResponse;
import org.openapitools.server.model.GetOutletsResponse;
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
import org.openapitools.server.model.ProvideOrderDigitalCodesRequest;
import org.openapitools.server.model.ProvideOrderItemIdentifiersRequest;
import org.openapitools.server.model.ProvideOrderItemIdentifiersResponse;
import org.openapitools.server.model.PutSkuBidsRequest;
import io.helidon.http.media.multipart.ReadablePart;
import org.openapitools.server.model.RefundStatusType;
import org.openapitools.server.model.ReportFormatType;
import org.openapitools.server.model.ReturnType;
import org.openapitools.server.model.SearchModelsResponse;
import org.openapitools.server.model.SendMessageToChatRequest;
import java.util.Set;
import org.openapitools.server.model.SetFeedParamsRequest;
import org.openapitools.server.model.SetOrderBoxLayoutRequest;
import org.openapitools.server.model.SetOrderBoxLayoutResponse;
import org.openapitools.server.model.SetOrderDeliveryDateRequest;
import org.openapitools.server.model.SetOrderDeliveryTrackCodeRequest;
import org.openapitools.server.model.SetOrderShipmentBoxesRequest;
import org.openapitools.server.model.SetOrderShipmentBoxesResponse;
import org.openapitools.server.model.SetReturnDecisionRequest;
import org.openapitools.server.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.server.model.SortOrderType;
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
import org.openapitools.server.model.UpdateOrderStorageLimitRequest;
import org.openapitools.server.model.UpdateOutletLicenseRequest;
import org.openapitools.server.model.UpdatePricesRequest;
import org.openapitools.server.model.UpdatePromoOffersRequest;
import org.openapitools.server.model.UpdatePromoOffersResponse;
import org.openapitools.server.model.UpdateStocksRequest;
import io.helidon.common.mapper.Value;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Dbs'",
                             version = "7.8.0")
public interface DbsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.put("/campaigns/{campaignId}/orders/{orderId}/cancellation/accept", this::acceptOrderCancellation);
        rules.post("/campaigns/{campaignId}/hidden-offers", this::addHiddenOffers);
        rules.post("/businesses/{businessId}/offer-mappings/archive", this::addOffersToArchive);
        rules.post("/tariffs/calculate", this::calculateTariffs);
        rules.post("/businesses/{businessId}/price-quarantine/confirm", this::confirmBusinessPrices);
        rules.post("/campaigns/{campaignId}/price-quarantine/confirm", this::confirmCampaignPrices);
        rules.post("/businesses/{businessId}/chats/new", this::createChat);
        rules.post("/campaigns/{campaignId}/outlets", this::createOutlet);
        rules.post("/campaigns/{campaignId}/offers/delete", this::deleteCampaignOffers);
        rules.post("/businesses/{businessId}/goods-feedback/comments/delete", this::deleteGoodsFeedbackComment);
        rules.post("/campaigns/{campaignId}/hidden-offers/delete", this::deleteHiddenOffers);
        rules.post("/businesses/{businessId}/offer-mappings/delete", this::deleteOffers);
        rules.post("/businesses/{businessId}/offer-mappings/unarchive", this::deleteOffersFromArchive);
        rules.delete("/campaigns/{campaignId}/outlets/{outletId}", this::deleteOutlet);
        rules.delete("/campaigns/{campaignId}/outlets/licenses", this::deleteOutletLicenses);
        rules.post("/businesses/{businessId}/promos/offers/delete", this::deletePromoOffers);
        rules.post("/reports/boost-consolidated/generate", this::generateBoostConsolidatedReport);
        rules.post("/reports/competitors-position/generate", this::generateCompetitorsPositionReport);
        rules.post("/reports/goods-feedback/generate", this::generateGoodsFeedbackReport);
        rules.post("/reports/documents/labels/generate", this::generateMassOrderLabelsReport);
        rules.get("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label", this::generateOrderLabel);
        rules.get("/campaigns/{campaignId}/orders/{orderId}/delivery/labels", this::generateOrderLabels);
        rules.post("/reports/prices/generate", this::generatePricesReport);
        rules.post("/reports/shelf-statistics/generate", this::generateShelfsStatisticsReport);
        rules.post("/reports/shows-sales/generate", this::generateShowsSalesReport);
        rules.post("/reports/stocks-on-warehouses/generate", this::generateStocksOnWarehousesReport);
        rules.post("/reports/united-marketplace-services/generate", this::generateUnitedMarketplaceServicesReport);
        rules.post("/reports/united-netting/generate", this::generateUnitedNettingReport);
        rules.post("/reports/united-orders/generate", this::generateUnitedOrdersReport);
        rules.get("/campaigns/{campaignId}/offers/all", this::getAllOffers);
        rules.post("/businesses/{businessId}/bids/info", this::getBidsInfoForBusiness);
        rules.post("/businesses/{businessId}/bids/recommendations", this::getBidsRecommendations);
        rules.post("/businesses/{businessId}/price-quarantine", this::getBusinessQuarantineOffers);
        rules.post("/businesses/{businessId}/settings", this::getBusinessSettings);
        rules.get("/campaigns/{campaignId}", this::getCampaign);
        rules.get("/campaigns/{campaignId}/logins", this::getCampaignLogins);
        rules.post("/campaigns/{campaignId}/offers", this::getCampaignOffers);
        rules.post("/campaigns/{campaignId}/price-quarantine", this::getCampaignQuarantineOffers);
        rules.get("/campaigns/{campaignId}/region", this::getCampaignRegion);
        rules.get("/campaigns/{campaignId}/settings", this::getCampaignSettings);
        rules.get("/campaigns", this::getCampaigns);
        rules.get("/campaigns/by_login/{login}", this::getCampaignsByLogin);
        rules.post("/categories/max-sale-quantum", this::getCategoriesMaxSaleQuantum);
        rules.post("/categories/tree", this::getCategoriesTree);
        rules.post("/category/{categoryId}/parameters", this::getCategoryContentParameters);
        rules.post("/businesses/{businessId}/chats/history", this::getChatHistory);
        rules.post("/businesses/{businessId}/chats", this::getChats);
        rules.get("/delivery/services", this::getDeliveryServices);
        rules.get("/campaigns/{campaignId}/feeds/{feedId}", this::getFeed);
        rules.get("/campaigns/{campaignId}/feeds/{feedId}/index-logs", this::getFeedIndexLogs);
        rules.get("/campaigns/{campaignId}/feedback/updates", this::getFeedbackAndCommentUpdates);
        rules.get("/campaigns/{campaignId}/feeds", this::getFeeds);
        rules.post("/businesses/{businessId}/goods-feedback/comments", this::getGoodsFeedbackComments);
        rules.post("/businesses/{businessId}/goods-feedback", this::getGoodsFeedbacks);
        rules.post("/campaigns/{campaignId}/stats/skus", this::getGoodsStats);
        rules.get("/campaigns/{campaignId}/hidden-offers", this::getHiddenOffers);
        rules.get("/models/{modelId}", this::getModel);
        rules.get("/models/{modelId}/offers", this::getModelOffers);
        rules.post("/models", this::getModels);
        rules.post("/models/offers", this::getModelsOffers);
        rules.post("/businesses/{businessId}/offer-cards", this::getOfferCardsContentStatus);
        rules.get("/campaigns/{campaignId}/offer-mapping-entries", this::getOfferMappingEntries);
        rules.post("/businesses/{businessId}/offer-mappings", this::getOfferMappings);
        rules.post("/businesses/{businessId}/offers/recommendations", this::getOfferRecommendations);
        rules.get("/campaigns/{campaignId}/offers", this::getOffers);
        rules.get("/campaigns/{campaignId}/orders/{orderId}", this::getOrder);
        rules.post("/campaigns/{campaignId}/orders/{orderId}/business-buyer", this::getOrderBusinessBuyerInfo);
        rules.post("/campaigns/{campaignId}/orders/{orderId}/documents", this::getOrderBusinessDocumentsInfo);
        rules.get("/campaigns/{campaignId}/orders/{orderId}/buyer", this::getOrderBuyerInfo);
        rules.get("/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data", this::getOrderLabelsData);
        rules.get("/campaigns/{campaignId}/orders", this::getOrders);
        rules.post("/campaigns/{campaignId}/stats/orders", this::getOrdersStats);
        rules.get("/campaigns/{campaignId}/outlets/{outletId}", this::getOutlet);
        rules.get("/campaigns/{campaignId}/outlets/licenses", this::getOutletLicenses);
        rules.get("/campaigns/{campaignId}/outlets", this::getOutlets);
        rules.get("/campaigns/{campaignId}/offer-prices", this::getPrices);
        rules.post("/campaigns/{campaignId}/offer-prices", this::getPricesByOfferIds);
        rules.post("/businesses/{businessId}/promos/offers", this::getPromoOffers);
        rules.post("/businesses/{businessId}/promos", this::getPromos);
        rules.post("/campaigns/{campaignId}/ratings/quality/details", this::getQualityRatingDetails);
        rules.post("/businesses/{businessId}/ratings/quality", this::getQualityRatings);
        rules.get("/reports/info/{reportId}", this::getReportInfo);
        rules.get("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", this::getReturn);
        rules.get("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application", this::getReturnApplication);
        rules.get("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", this::getReturnPhoto);
        rules.get("/campaigns/{campaignId}/returns", this::getReturns);
        rules.post("/campaigns/{campaignId}/offers/stocks", this::getStocks);
        rules.post("/campaigns/{campaignId}/offer-mapping-entries/suggestions", this::getSuggestedOfferMappingEntries);
        rules.post("/businesses/{businessId}/offer-mappings/suggestions", this::getSuggestedOfferMappings);
        rules.post("/campaigns/{campaignId}/offer-prices/suggestions", this::getSuggestedPrices);
        rules.get("/businesses/{businessId}/warehouses", this::getWarehouses);
        rules.post("/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods", this::provideOrderDigitalCodes);
        rules.put("/campaigns/{campaignId}/orders/{orderId}/identifiers", this::provideOrderItemIdentifiers);
        rules.put("/businesses/{businessId}/bids", this::putBidsForBusiness);
        rules.put("/campaigns/{campaignId}/bids", this::putBidsForCampaign);
        rules.post("/campaigns/{campaignId}/feeds/{feedId}/refresh", this::refreshFeed);
        rules.get("/models", this::searchModels);
        rules.get("/regions/{regionId}/children", this::searchRegionChildren);
        rules.get("/regions/{regionId}", this::searchRegionsById);
        rules.get("/regions", this::searchRegionsByName);
        rules.post("/businesses/{businessId}/chats/file/send", this::sendFileToChat);
        rules.post("/businesses/{businessId}/chats/message", this::sendMessageToChat);
        rules.post("/campaigns/{campaignId}/feeds/{feedId}/params", this::setFeedParams);
        rules.put("/campaigns/{campaignId}/orders/{orderId}/boxes", this::setOrderBoxLayout);
        rules.put("/campaigns/{campaignId}/orders/{orderId}/delivery/date", this::setOrderDeliveryDate);
        rules.post("/campaigns/{campaignId}/orders/{orderId}/delivery/track", this::setOrderDeliveryTrackCode);
        rules.put("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes", this::setOrderShipmentBoxes);
        rules.post("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision", this::setReturnDecision);
        rules.post("/businesses/{businessId}/goods-feedback/skip-reaction", this::skipGoodsFeedbacksReaction);
        rules.post("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit", this::submitReturnDecision);
        rules.post("/businesses/{businessId}/offer-prices/updates", this::updateBusinessPrices);
        rules.post("/campaigns/{campaignId}/offers/update", this::updateCampaignOffers);
        rules.post("/businesses/{businessId}/goods-feedback/comments/update", this::updateGoodsFeedbackComment);
        rules.post("/businesses/{businessId}/offer-cards/update", this::updateOfferContent);
        rules.post("/campaigns/{campaignId}/offer-mapping-entries/updates", this::updateOfferMappingEntries);
        rules.post("/businesses/{businessId}/offer-mappings/update", this::updateOfferMappings);
        rules.put("/campaigns/{campaignId}/orders/{orderId}/items", this::updateOrderItems);
        rules.put("/campaigns/{campaignId}/orders/{orderId}/status", this::updateOrderStatus);
        rules.post("/campaigns/{campaignId}/orders/status-update", this::updateOrderStatuses);
        rules.put("/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit", this::updateOrderStorageLimit);
        rules.put("/campaigns/{campaignId}/outlets/{outletId}", this::updateOutlet);
        rules.post("/campaigns/{campaignId}/outlets/licenses", this::updateOutletLicenses);
        rules.post("/campaigns/{campaignId}/offer-prices/updates", this::updatePrices);
        rules.post("/businesses/{businessId}/promos/offers/update", this::updatePromoOffers);
        rules.put("/campaigns/{campaignId}/offers/stocks", this::updateStocks);
    }


    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/cancellation/accept : Отмена заказа покупателем.
     *
     * @param request the server request
     * @param response the server response
     */
    void acceptOrderCancellation(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/hidden-offers : Скрытие товаров и настройки скрытия.
     *
     * @param request the server request
     * @param response the server response
     */
    void addHiddenOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings/archive : Добавление товаров в архив.
     *
     * @param request the server request
     * @param response the server response
     */
    void addOffersToArchive(ServerRequest request, ServerResponse response);
    /**
     * POST /tariffs/calculate : Калькулятор стоимости услуг.
     *
     * @param request the server request
     * @param response the server response
     */
    void calculateTariffs(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/price-quarantine/confirm : Удаление товара из карантина по цене в кабинете.
     *
     * @param request the server request
     * @param response the server response
     */
    void confirmBusinessPrices(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/price-quarantine/confirm : Удаление товара из карантина по цене в магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void confirmCampaignPrices(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/chats/new : Создание нового чата с покупателем.
     *
     * @param request the server request
     * @param response the server response
     */
    void createChat(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/outlets : Создание точки продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void createOutlet(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offers/delete : Удаление товаров из ассортимента магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteCampaignOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/goods-feedback/comments/delete : Удаление комментария к отзыву.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteGoodsFeedbackComment(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/hidden-offers/delete : Возобновление показа товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteHiddenOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings/delete : Удаление товаров из каталога.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings/unarchive : Удаление товаров из архива.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteOffersFromArchive(ServerRequest request, ServerResponse response);
    /**
     * DELETE /campaigns/{campaignId}/outlets/{outletId} : Удаление точки продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteOutlet(ServerRequest request, ServerResponse response);
    /**
     * DELETE /campaigns/{campaignId}/outlets/licenses : Удаление лицензий для точек продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteOutletLicenses(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/promos/offers/delete : Удаление товаров из акции.
     *
     * @param request the server request
     * @param response the server response
     */
    void deletePromoOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/boost-consolidated/generate : Отчет по бусту продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateBoostConsolidatedReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/competitors-position/generate : Отчет «Конкурентная позиция».
     *
     * @param request the server request
     * @param response the server response
     */
    void generateCompetitorsPositionReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/goods-feedback/generate : Отчет по отзывам о товарах.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateGoodsFeedbackReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/documents/labels/generate : Готовые ярлыки‑наклейки на все коробки в нескольких заказах.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateMassOrderLabelsReport(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label : Готовый ярлык‑наклейка для коробки в заказе.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateOrderLabel(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/delivery/labels : Готовые ярлыки‑наклейки на все коробки в одном заказе.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateOrderLabels(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/prices/generate : Отчет «Цены на рынке».
     *
     * @param request the server request
     * @param response the server response
     */
    void generatePricesReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/shelf-statistics/generate : Отчет по полкам.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateShelfsStatisticsReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/shows-sales/generate : Отчет «Аналитика продаж».
     *
     * @param request the server request
     * @param response the server response
     */
    void generateShowsSalesReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/stocks-on-warehouses/generate : Отчет по остаткам на складах.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateStocksOnWarehousesReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/united-marketplace-services/generate : Отчет по стоимости услуг.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateUnitedMarketplaceServicesReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/united-netting/generate : Отчет по платежам.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateUnitedNettingReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/united-orders/generate : Отчет по заказам.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateUnitedOrdersReport(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/offers/all : Все предложения магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getAllOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/bids/info : Информация об установленных ставках.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBidsInfoForBusiness(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/bids/recommendations : Рекомендованные ставки для заданных товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBidsRecommendations(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/price-quarantine : Список товаров, находящихся в карантине по цене в кабинете.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBusinessQuarantineOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/settings : Настройки кабинета.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBusinessSettings(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId} : Информация о магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaign(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/logins : Логины, связанные с магазином.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignLogins(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offers : Информация о товарах, которые размещены в заданном магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/price-quarantine : Список товаров, находящихся в карантине по цене в магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignQuarantineOffers(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/region : Регион магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignRegion(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/settings : Настройки магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignSettings(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns : Список магазинов пользователя.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaigns(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/by_login/{login} : Магазины, доступные логину.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignsByLogin(ServerRequest request, ServerResponse response);
    /**
     * POST /categories/max-sale-quantum : Лимит на установку кванта продажи и минимального количества товаров в заказе.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCategoriesMaxSaleQuantum(ServerRequest request, ServerResponse response);
    /**
     * POST /categories/tree : Дерево категорий.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCategoriesTree(ServerRequest request, ServerResponse response);
    /**
     * POST /category/{categoryId}/parameters : Списки характеристик товаров по категориям.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCategoryContentParameters(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/chats/history : Получение истории сообщений в чате.
     *
     * @param request the server request
     * @param response the server response
     */
    void getChatHistory(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/chats : Получение доступных чатов.
     *
     * @param request the server request
     * @param response the server response
     */
    void getChats(ServerRequest request, ServerResponse response);
    /**
     * GET /delivery/services : Справочник служб доставки.
     *
     * @param request the server request
     * @param response the server response
     */
    void getDeliveryServices(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/feeds/{feedId} : Информация о прайс-листе.
     *
     * @param request the server request
     * @param response the server response
     */
    void getFeed(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/feeds/{feedId}/index-logs : Отчет по индексации прайс-листа.
     *
     * @param request the server request
     * @param response the server response
     */
    void getFeedIndexLogs(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/feedback/updates : Новые и обновленные отзывы о магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void getFeedbackAndCommentUpdates(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/feeds : Список прайс-листов магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getFeeds(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/goods-feedback/comments : Получение комментариев к отзыву.
     *
     * @param request the server request
     * @param response the server response
     */
    void getGoodsFeedbackComments(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/goods-feedback : Получение отзывов о товарах продавца.
     *
     * @param request the server request
     * @param response the server response
     */
    void getGoodsFeedbacks(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/stats/skus : Отчет по товарам.
     *
     * @param request the server request
     * @param response the server response
     */
    void getGoodsStats(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/hidden-offers : Информация о скрытых вами товарах.
     *
     * @param request the server request
     * @param response the server response
     */
    void getHiddenOffers(ServerRequest request, ServerResponse response);
    /**
     * GET /models/{modelId} : Информация об одной модели.
     *
     * @param request the server request
     * @param response the server response
     */
    void getModel(ServerRequest request, ServerResponse response);
    /**
     * GET /models/{modelId}/offers : Список предложений для одной модели.
     *
     * @param request the server request
     * @param response the server response
     */
    void getModelOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /models : Информация о нескольких моделях.
     *
     * @param request the server request
     * @param response the server response
     */
    void getModels(ServerRequest request, ServerResponse response);
    /**
     * POST /models/offers : Список предложений для нескольких моделей.
     *
     * @param request the server request
     * @param response the server response
     */
    void getModelsOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-cards : Получение информации о заполненности карточек магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOfferCardsContentStatus(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/offer-mapping-entries : Список товаров в каталоге.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOfferMappingEntries(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings : Информация о товарах в каталоге.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOfferMappings(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offers/recommendations : Рекомендации Маркета, касающиеся цен.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOfferRecommendations(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/offers : Предложения магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOffers(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId} : Информация об одном заказе.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrder(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/business-buyer : Информация о покупателе — юридическом лице.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrderBusinessBuyerInfo(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/documents : Информация о документах.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrderBusinessDocumentsInfo(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/buyer : Информация о покупателе — физическом лице.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrderBuyerInfo(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data : Данные для самостоятельного изготовления ярлыков.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrderLabelsData(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders : Информация о нескольких заказах.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrders(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/stats/orders : Детальная информация по заказам.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrdersStats(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/outlets/{outletId} : Информация об одной точке продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOutlet(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/outlets/licenses : Информация о лицензиях для точек продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOutletLicenses(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/outlets : Информация о нескольких точках продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOutlets(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/offer-prices : Список цен.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPrices(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offer-prices : Просмотр цен на указанные товары в магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPricesByOfferIds(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/promos/offers : Получение списка товаров, которые участвуют или могут участвовать в акции.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPromoOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/promos : Получение списка акций.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPromos(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/ratings/quality/details : Заказы, которые повлияли на индекс качества.
     *
     * @param request the server request
     * @param response the server response
     */
    void getQualityRatingDetails(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/ratings/quality : Индекс качества магазинов.
     *
     * @param request the server request
     * @param response the server response
     */
    void getQualityRatings(ServerRequest request, ServerResponse response);
    /**
     * GET /reports/info/{reportId} : Получение заданного отчета.
     *
     * @param request the server request
     * @param response the server response
     */
    void getReportInfo(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} : Информация о невыкупе или возврате.
     *
     * @param request the server request
     * @param response the server response
     */
    void getReturn(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application : Получение заявления на возврат.
     *
     * @param request the server request
     * @param response the server response
     */
    void getReturnApplication(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} : Получение фотографии возврата.
     *
     * @param request the server request
     * @param response the server response
     */
    void getReturnPhoto(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/returns : Список невыкупов и возвратов.
     *
     * @param request the server request
     * @param response the server response
     */
    void getReturns(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offers/stocks : Информация об остатках и оборачиваемости.
     *
     * @param request the server request
     * @param response the server response
     */
    void getStocks(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offer-mapping-entries/suggestions : Рекомендованные карточки для товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void getSuggestedOfferMappingEntries(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings/suggestions : Просмотр карточек на Маркете, которые подходят вашим товарам.
     *
     * @param request the server request
     * @param response the server response
     */
    void getSuggestedOfferMappings(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offer-prices/suggestions : Цены для продвижения товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void getSuggestedPrices(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{businessId}/warehouses : Список складов и групп складов.
     *
     * @param request the server request
     * @param response the server response
     */
    void getWarehouses(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods : Передача ключей цифровых товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void provideOrderDigitalCodes(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/identifiers : Передача кодов маркировки единиц товара.
     *
     * @param request the server request
     * @param response the server response
     */
    void provideOrderItemIdentifiers(ServerRequest request, ServerResponse response);
    /**
     * PUT /businesses/{businessId}/bids : Включение буста продаж и установка ставок.
     *
     * @param request the server request
     * @param response the server response
     */
    void putBidsForBusiness(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/bids : Включение буста продаж и установка ставок для магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void putBidsForCampaign(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/feeds/{feedId}/refresh : Сообщить, что прайс-лист обновился.
     *
     * @param request the server request
     * @param response the server response
     */
    void refreshFeed(ServerRequest request, ServerResponse response);
    /**
     * GET /models : Поиск модели товара.
     *
     * @param request the server request
     * @param response the server response
     */
    void searchModels(ServerRequest request, ServerResponse response);
    /**
     * GET /regions/{regionId}/children : Информация о дочерних регионах.
     *
     * @param request the server request
     * @param response the server response
     */
    void searchRegionChildren(ServerRequest request, ServerResponse response);
    /**
     * GET /regions/{regionId} : Информация о регионе.
     *
     * @param request the server request
     * @param response the server response
     */
    void searchRegionsById(ServerRequest request, ServerResponse response);
    /**
     * GET /regions : Поиск регионов по их имени.
     *
     * @param request the server request
     * @param response the server response
     */
    void searchRegionsByName(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/chats/file/send : Отправка файла в чат.
     *
     * @param request the server request
     * @param response the server response
     */
    void sendFileToChat(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/chats/message : Отправка сообщения в чат.
     *
     * @param request the server request
     * @param response the server response
     */
    void sendMessageToChat(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/feeds/{feedId}/params : Изменение параметров прайс-листа.
     *
     * @param request the server request
     * @param response the server response
     */
    void setFeedParams(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/boxes : Подготовка заказа.
     *
     * @param request the server request
     * @param response the server response
     */
    void setOrderBoxLayout(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/delivery/date : Изменение даты доставки заказа.
     *
     * @param request the server request
     * @param response the server response
     */
    void setOrderDeliveryDate(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/delivery/track : Передача трек‑номера посылки.
     *
     * @param request the server request
     * @param response the server response
     */
    void setOrderDeliveryTrackCode(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes : Передача количества грузовых мест в заказе.
     *
     * @param request the server request
     * @param response the server response
     */
    void setOrderShipmentBoxes(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision : Принятие или изменение решения по возврату.
     *
     * @param request the server request
     * @param response the server response
     */
    void setReturnDecision(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/goods-feedback/skip-reaction : Отказ от ответа на отзывы.
     *
     * @param request the server request
     * @param response the server response
     */
    void skipGoodsFeedbacksReaction(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit : Подтверждение решения по возврату.
     *
     * @param request the server request
     * @param response the server response
     */
    void submitReturnDecision(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-prices/updates : Установка цен на товары во всех магазинах.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateBusinessPrices(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offers/update : Изменение условий продажи товаров в магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateCampaignOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/goods-feedback/comments/update : Добавление нового или изменение созданного комментария.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateGoodsFeedbackComment(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-cards/update : Редактирование категорийных характеристик товара.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOfferContent(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offer-mapping-entries/updates : Добавление и редактирование товаров в каталоге.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOfferMappingEntries(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings/update : Добавление товаров в каталог и изменение информации о них.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOfferMappings(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/items : Удаление товара из заказа или уменьшение числа единиц.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOrderItems(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/status : Изменение статуса одного заказа.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOrderStatus(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/status-update : Изменение статусов нескольких заказов.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOrderStatuses(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit : Продление срока хранения заказа.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOrderStorageLimit(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/outlets/{outletId} : Изменение информации о точке продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOutlet(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/outlets/licenses : Создание и изменение лицензий для точек продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOutletLicenses(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offer-prices/updates : Установка цен на товары в конкретном магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void updatePrices(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/promos/offers/update : Добавление товаров в акцию или изменение их цен.
     *
     * @param request the server request
     * @param response the server response
     */
    void updatePromoOffers(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/offers/stocks : Передача информации об остатках.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateStocks(ServerRequest request, ServerResponse response);
}
