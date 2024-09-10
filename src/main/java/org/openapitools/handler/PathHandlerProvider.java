/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;
import io.undertow.util.Methods;

/**
 * The default implementation for {@link HandlerProvider} and {@link PathHandlerInterface}.
 *
 * <p>There are two flavors of {@link HttpHandler}s to choose from, depending on your needs:</p>
 *
 * <ul>
 * <li>
 * <b>Stateless</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is not retained – a different {@link HttpHandler} is instantiated for every new
 * session. This is the default behavior.
 * </li>
 * <li>
 * <b>Stateful</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is retained properly. For example, if you want to keep a class property that counts
 * the number of requests or the last time a request was received.
 * </li>
 * </ul>
 * <p>Note: <b>Stateful</b> flavor is more performant than <b>Stateless</b>.</p>
 */
@SuppressWarnings("TooManyFunctions")
abstract public class PathHandlerProvider implements HandlerProvider, PathHandlerInterface {
    /**
     * Returns the default base path to access this server.
     */
    @javax.annotation.Nonnull
    public String getBasePath() {
        return "";
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
    * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    @Override
    public HttpHandler getHandler() {
        return getHandler(false);
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with ""
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final boolean withBasePath) {
        return getHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @SuppressWarnings("Convert2Lambda")
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/info", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBidsInfoForBusiness().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/recommendations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBidsRecommendations().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/businesses/{businessId}/bids", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    putBidsForBusiness().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/bids", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    putBidsForCampaign().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/archive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addOffersToArchive().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/unarchive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOffersFromArchive().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBusinessSettings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaign().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/logins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignLogins().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/region", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignRegion().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignSettings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaigns().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/by_login/{login}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignsByLogin().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/categories/max-sale-quantum", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoriesMaxSaleQuantum().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/categories/tree", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoriesTree().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/new", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/history", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getChatHistory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getChats().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/file/send", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendFileToChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/message", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendMessageToChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/category/{categoryId}/parameters", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoryContentParameters().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferCardsContentStatus().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferContent().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    acceptOrderCancellation().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/archive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addOffersToArchive().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/tariffs/calculate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    calculateTariffs().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmBusinessPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmCampaignPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/new", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/outlets", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createOutlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteGoodsFeedbackComment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/unarchive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOffersFromArchive().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/campaigns/{campaignId}/outlets/{outletId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOutlet().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/campaigns/{campaignId}/outlets/licenses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOutletLicenses().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deletePromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/boost-consolidated/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateBoostConsolidatedReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/competitors-position/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateCompetitorsPositionReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-feedback/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsFeedbackReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/documents/labels/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateMassOrderLabelsReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateOrderLabel().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateOrderLabels().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/prices/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generatePricesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/shelf-statistics/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShelfsStatisticsReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/shows-sales/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShowsSalesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/stocks-on-warehouses/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateStocksOnWarehousesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-marketplace-services/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedMarketplaceServicesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-netting/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedNettingReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-orders/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedOrdersReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers/all", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAllOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/info", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBidsInfoForBusiness().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/recommendations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBidsRecommendations().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBusinessQuarantineOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBusinessSettings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaign().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/logins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignLogins().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignQuarantineOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/region", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignRegion().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignSettings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaigns().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/by_login/{login}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignsByLogin().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/categories/max-sale-quantum", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoriesMaxSaleQuantum().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/categories/tree", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoriesTree().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/category/{categoryId}/parameters", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoryContentParameters().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/history", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getChatHistory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getChats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/delivery/services", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getDeliveryServices().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeed().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeedIndexLogs().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feedback/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeedbackAndCommentUpdates().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeeds().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsFeedbackComments().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsFeedbacks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/skus", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsStats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/hidden-offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/models/{modelId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getModel().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/models/{modelId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getModelOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/models", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getModels().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/models/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getModelsOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferCardsContentStatus().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-mapping-entries", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offers/recommendations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferRecommendations().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrder().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBusinessBuyerInfo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/documents", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBusinessDocumentsInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/buyer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBuyerInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderLabelsData().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrders().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrdersStats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets/{outletId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOutlet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets/licenses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOutletLicenses().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOutlets().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-prices", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPricesByOfferIds().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPromos().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/ratings/quality/details", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getQualityRatingDetails().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/ratings/quality", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getQualityRatings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/reports/info/{reportId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReportInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturn().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturnApplication().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturnPhoto().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/returns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturns().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/stocks", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getStocks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedPrices().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/businesses/{businessId}/warehouses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getWarehouses().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    provideOrderDigitalCodes().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/identifiers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    provideOrderItemIdentifiers().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/businesses/{businessId}/bids", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    putBidsForBusiness().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/bids", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    putBidsForCampaign().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/refresh", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    refreshFeed().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/models", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchModels().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions/{regionId}/children", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionChildren().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions/{regionId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionsById().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionsByName().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/file/send", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendFileToChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/message", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendMessageToChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/params", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setFeedParams().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/boxes", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderBoxLayout().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/date", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderDeliveryDate().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/track", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderDeliveryTrackCode().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderShipmentBoxes().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setReturnDecision().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/skip-reaction", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    skipGoodsFeedbacksReaction().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    submitReturnDecision().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-prices/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateBusinessPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateGoodsFeedbackComment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferContent().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/items", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderItems().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/status", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderStatus().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/status-update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderStatuses().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderStorageLimit().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/outlets/{outletId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOutlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/outlets/licenses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOutletLicenses().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updatePrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updatePromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/offers/stocks", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateStocks().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/delivery/services", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getDeliveryServices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/archive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addOffersToArchive().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/tariffs/calculate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    calculateTariffs().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmBusinessPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmCampaignPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/new", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteGoodsFeedbackComment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/unarchive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOffersFromArchive().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deletePromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/boost-consolidated/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateBoostConsolidatedReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/competitors-position/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateCompetitorsPositionReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-feedback/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsFeedbackReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-realization/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsRealizationReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/documents/labels/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateMassOrderLabelsReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateOrderLabel().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateOrderLabels().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/prices/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generatePricesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/shelf-statistics/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShelfsStatisticsReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/shows-sales/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShowsSalesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/stocks-on-warehouses/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateStocksOnWarehousesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-marketplace-services/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedMarketplaceServicesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-netting/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedNettingReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-orders/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedOrdersReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers/all", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAllOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/info", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBidsInfoForBusiness().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/recommendations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBidsRecommendations().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBusinessQuarantineOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBusinessSettings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaign().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/logins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignLogins().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignQuarantineOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/region", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignRegion().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignSettings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaigns().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/by_login/{login}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignsByLogin().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/categories/max-sale-quantum", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoriesMaxSaleQuantum().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/categories/tree", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoriesTree().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/category/{categoryId}/parameters", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoryContentParameters().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/history", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getChatHistory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getChats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/delivery/services", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getDeliveryServices().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeed().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeedIndexLogs().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feedback/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeedbackAndCommentUpdates().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeeds().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsFeedbackComments().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsFeedbacks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/skus", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsStats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/hidden-offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferCardsContentStatus().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-mapping-entries", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offers/recommendations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferRecommendations().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrder().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBusinessBuyerInfo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/documents", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBusinessDocumentsInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderLabelsData().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrders().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrdersStats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-prices", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPricesByOfferIds().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPromos().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/ratings/quality/details", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getQualityRatingDetails().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/ratings/quality", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getQualityRatings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/reports/info/{reportId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReportInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturn().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturnApplication().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturnPhoto().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/returns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturns().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/stocks", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getStocks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedPrices().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/businesses/{businessId}/warehouses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getWarehouses().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/identifiers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    provideOrderItemIdentifiers().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/businesses/{businessId}/bids", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    putBidsForBusiness().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/bids", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    putBidsForCampaign().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/refresh", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    refreshFeed().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions/{regionId}/children", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionChildren().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions/{regionId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionsById().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionsByName().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/file/send", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendFileToChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/message", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendMessageToChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/params", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setFeedParams().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/boxes", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderBoxLayout().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderShipmentBoxes().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/skip-reaction", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    skipGoodsFeedbacksReaction().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-prices/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateBusinessPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateGoodsFeedbackComment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferContent().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/items", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderItems().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/status", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderStatus().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/status-update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderStatuses().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updatePrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updatePromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/offers/stocks", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateStocks().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/verifyEac", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    verifyOrderEac().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/archive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addOffersToArchive().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/tariffs/calculate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    calculateTariffs().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmBusinessPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmCampaignPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmShipment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/new", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteGoodsFeedbackComment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/unarchive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOffersFromArchive().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deletePromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentAct().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentDiscrepancyAct().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentInboundAct().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentPalletLabels().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/shipments/reception-transfer-act", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentReceptionTransferAct().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentTransportationWaybill().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/boost-consolidated/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateBoostConsolidatedReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/competitors-position/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateCompetitorsPositionReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-feedback/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsFeedbackReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-realization/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsRealizationReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/documents/labels/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateMassOrderLabelsReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateOrderLabel().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateOrderLabels().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/prices/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generatePricesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/shelf-statistics/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShelfsStatisticsReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/documents/shipment-list/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShipmentListDocumentReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/shows-sales/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShowsSalesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/stocks-on-warehouses/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateStocksOnWarehousesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-marketplace-services/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedMarketplaceServicesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-netting/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedNettingReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-orders/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedOrdersReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers/all", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAllOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/info", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBidsInfoForBusiness().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/recommendations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBidsRecommendations().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBusinessQuarantineOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBusinessSettings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaign().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/logins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignLogins().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignQuarantineOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/region", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignRegion().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignSettings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaigns().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/by_login/{login}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignsByLogin().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/categories/max-sale-quantum", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoriesMaxSaleQuantum().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/categories/tree", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoriesTree().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/category/{categoryId}/parameters", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoryContentParameters().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/history", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getChatHistory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getChats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/delivery/services", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getDeliveryServices().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeed().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeedIndexLogs().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feedback/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeedbackAndCommentUpdates().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeeds().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsFeedbackComments().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsFeedbacks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/skus", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsStats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/hidden-offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferCardsContentStatus().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-mapping-entries", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offers/recommendations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferRecommendations().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrder().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBusinessBuyerInfo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/documents", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBusinessDocumentsInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderLabelsData().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrders().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrdersStats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-prices", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPricesByOfferIds().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPromos().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/ratings/quality/details", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getQualityRatingDetails().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/ratings/quality", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getQualityRatings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/reports/info/{reportId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReportInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturn().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturnApplication().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturnPhoto().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/returns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturns().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getShipment().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getShipmentOrdersInfo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/stocks", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getStocks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedPrices().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/businesses/{businessId}/warehouses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getWarehouses().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/identifiers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    provideOrderItemIdentifiers().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/businesses/{businessId}/bids", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    putBidsForBusiness().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/bids", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    putBidsForCampaign().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/refresh", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    refreshFeed().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions/{regionId}/children", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionChildren().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions/{regionId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionsById().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionsByName().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/first-mile/shipments", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchShipments().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/file/send", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendFileToChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/message", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendMessageToChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/params", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setFeedParams().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/boxes", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderBoxLayout().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderShipmentBoxes().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setShipmentPalletsCount().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/skip-reaction", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    skipGoodsFeedbacksReaction().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    transferOrdersFromShipment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-prices/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateBusinessPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateGoodsFeedbackComment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferContent().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/items", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderItems().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/status", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderStatus().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/status-update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderStatuses().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updatePrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updatePromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/offers/stocks", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateStocks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/archive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addOffersToArchive().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/tariffs/calculate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    calculateTariffs().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmBusinessPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmCampaignPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/new", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteGoodsFeedbackComment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/unarchive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOffersFromArchive().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deletePromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/boost-consolidated/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateBoostConsolidatedReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/competitors-position/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateCompetitorsPositionReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-feedback/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsFeedbackReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-movement/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsMovementReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-realization/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsRealizationReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-turnover/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsTurnoverReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/prices/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generatePricesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/shelf-statistics/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShelfsStatisticsReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/shows-sales/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShowsSalesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/stocks-on-warehouses/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateStocksOnWarehousesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-marketplace-services/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedMarketplaceServicesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-netting/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedNettingReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-orders/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedOrdersReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers/all", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAllOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/info", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBidsInfoForBusiness().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/recommendations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBidsRecommendations().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBusinessQuarantineOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBusinessSettings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaign().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/logins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignLogins().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignQuarantineOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/region", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignRegion().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/settings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignSettings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaigns().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/by_login/{login}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignsByLogin().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/categories/max-sale-quantum", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoriesMaxSaleQuantum().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/categories/tree", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoriesTree().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/category/{categoryId}/parameters", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCategoryContentParameters().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/history", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getChatHistory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getChats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeed().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeedIndexLogs().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feedback/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeedbackAndCommentUpdates().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeeds().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/warehouses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFulfillmentWarehouses().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsFeedbackComments().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsFeedbacks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/skus", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsStats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/hidden-offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferCardsContentStatus().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-mapping-entries", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offers/recommendations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferRecommendations().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrder().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBusinessBuyerInfo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/documents", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBusinessDocumentsInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrders().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrdersStats().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-prices", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPricesByOfferIds().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPromos().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/ratings/quality", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getQualityRatings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/reports/info/{reportId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReportInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturn().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturnPhoto().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/returns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturns().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/stocks", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getStocks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedPrices().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/businesses/{businessId}/bids", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    putBidsForBusiness().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/bids", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    putBidsForCampaign().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/refresh", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    refreshFeed().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions/{regionId}/children", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionChildren().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions/{regionId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionsById().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionsByName().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/file/send", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendFileToChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/message", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sendMessageToChat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/params", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setFeedParams().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/skip-reaction", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    skipGoodsFeedbacksReaction().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-prices/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateBusinessPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateGoodsFeedbackComment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferContent().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferMappings().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updatePrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updatePromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feedback/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeedbackAndCommentUpdates().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeed().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeedIndexLogs().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFeeds().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/refresh", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    refreshFeed().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/params", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setFeedParams().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteGoodsFeedbackComment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsFeedbackComments().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsFeedbacks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/skip-reaction", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    skipGoodsFeedbacksReaction().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateGoodsFeedbackComment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/skus", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getGoodsStats().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/hidden-offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getHiddenOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/models/{modelId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getModel().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/models/{modelId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getModelOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/models", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getModels().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/models/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getModelsOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/models", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchModels().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-mapping-entries", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOfferMappingEntries().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers/all", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAllOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offers/recommendations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOfferRecommendations().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateCampaignOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBusinessBuyerInfo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/documents", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBusinessDocumentsInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/buyer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderBuyerInfo().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/date", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderDeliveryDate().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/track", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderDeliveryTrackCode().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderStorageLimit().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/verifyEac", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    verifyOrderEac().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateOrderLabel().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateOrderLabels().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrderLabelsData().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    acceptOrderCancellation().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrder().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrders().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    provideOrderDigitalCodes().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/identifiers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    provideOrderItemIdentifiers().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/boxes", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderBoxLayout().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setOrderShipmentBoxes().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/items", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderItems().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/status", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderStatus().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/status-update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOrderStatuses().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOrdersStats().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/campaigns/{campaignId}/outlets/licenses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOutletLicenses().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets/licenses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOutletLicenses().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/outlets/licenses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOutletLicenses().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/outlets", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createOutlet().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/campaigns/{campaignId}/outlets/{outletId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteOutlet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets/{outletId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOutlet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getOutlets().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/outlets/{outletId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateOutlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmBusinessPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmCampaignPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getBusinessQuarantineOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getCampaignQuarantineOffers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-prices", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPricesByOfferIds().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/suggestions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getSuggestedPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-prices/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateBusinessPrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/updates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updatePrices().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/delete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deletePromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getPromos().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/update", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updatePromoOffers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/ratings/quality/details", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getQualityRatingDetails().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/businesses/{businessId}/ratings/quality", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getQualityRatings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions/{regionId}/children", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionChildren().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions/{regionId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionsById().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/regions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchRegionsByName().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/boost-consolidated/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateBoostConsolidatedReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/competitors-position/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateCompetitorsPositionReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-feedback/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsFeedbackReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-movement/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsMovementReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-realization/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsRealizationReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/goods-turnover/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateGoodsTurnoverReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/documents/labels/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateMassOrderLabelsReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/prices/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generatePricesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/shelf-statistics/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShelfsStatisticsReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/documents/shipment-list/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShipmentListDocumentReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/shows-sales/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateShowsSalesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/stocks-on-warehouses/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateStocksOnWarehousesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-marketplace-services/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedMarketplaceServicesReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-netting/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedNettingReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/reports/united-orders/generate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    generateUnitedOrdersReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/reports/info/{reportId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReportInfo().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturn().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturnApplication().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturnPhoto().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/returns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getReturns().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setReturnDecision().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    submitReturnDecision().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    confirmShipment().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentAct().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentDiscrepancyAct().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentInboundAct().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentPalletLabels().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/shipments/reception-transfer-act", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentReceptionTransferAct().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadShipmentTransportationWaybill().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getShipment().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getShipmentOrdersInfo().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/first-mile/shipments", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchShipments().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    setShipmentPalletsCount().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    transferOrdersFromShipment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/stocks", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getStocks().handleRequest(exchange);
                }
            })
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/offers/stocks", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateStocks().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/tariffs/calculate", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    calculateTariffs().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/warehouses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getFulfillmentWarehouses().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/businesses/{businessId}/warehouses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getWarehouses().handleRequest(exchange);
                }
            })
            ;
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler() {
        return getStatefulHandler(false);
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with ""
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final boolean withBasePath) {
        return getStatefulHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/info", getBidsInfoForBusiness())
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/recommendations", getBidsRecommendations())
            .add(Methods.PUT, basePath + "/businesses/{businessId}/bids", putBidsForBusiness())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/bids", putBidsForCampaign())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/archive", addOffersToArchive())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/delete", deleteOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/unarchive", deleteOffersFromArchive())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings", getOfferMappings())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/suggestions", getSuggestedOfferMappings())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/update", updateOfferMappings())
            .add(Methods.POST, basePath + "/businesses/{businessId}/settings", getBusinessSettings())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}", getCampaign())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/logins", getCampaignLogins())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/region", getCampaignRegion())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/settings", getCampaignSettings())
            .add(Methods.GET, basePath + "/campaigns", getCampaigns())
            .add(Methods.GET, basePath + "/campaigns/by_login/{login}", getCampaignsByLogin())
            .add(Methods.POST, basePath + "/categories/max-sale-quantum", getCategoriesMaxSaleQuantum())
            .add(Methods.POST, basePath + "/categories/tree", getCategoriesTree())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/new", createChat())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/history", getChatHistory())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats", getChats())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/file/send", sendFileToChat())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/message", sendMessageToChat())
            .add(Methods.POST, basePath + "/category/{categoryId}/parameters", getCategoryContentParameters())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards", getOfferCardsContentStatus())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards/update", updateOfferContent())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept", acceptOrderCancellation())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers", addHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/archive", addOffersToArchive())
            .add(Methods.POST, basePath + "/tariffs/calculate", calculateTariffs())
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine/confirm", confirmBusinessPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine/confirm", confirmCampaignPrices())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/new", createChat())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/outlets", createOutlet())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/delete", deleteCampaignOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/delete", deleteGoodsFeedbackComment())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers/delete", deleteHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/delete", deleteOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/unarchive", deleteOffersFromArchive())
            .add(Methods.DELETE, basePath + "/campaigns/{campaignId}/outlets/{outletId}", deleteOutlet())
            .add(Methods.DELETE, basePath + "/campaigns/{campaignId}/outlets/licenses", deleteOutletLicenses())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/delete", deletePromoOffers())
            .add(Methods.POST, basePath + "/reports/boost-consolidated/generate", generateBoostConsolidatedReport())
            .add(Methods.POST, basePath + "/reports/competitors-position/generate", generateCompetitorsPositionReport())
            .add(Methods.POST, basePath + "/reports/goods-feedback/generate", generateGoodsFeedbackReport())
            .add(Methods.POST, basePath + "/reports/documents/labels/generate", generateMassOrderLabelsReport())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label", generateOrderLabel())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels", generateOrderLabels())
            .add(Methods.POST, basePath + "/reports/prices/generate", generatePricesReport())
            .add(Methods.POST, basePath + "/reports/shelf-statistics/generate", generateShelfsStatisticsReport())
            .add(Methods.POST, basePath + "/reports/shows-sales/generate", generateShowsSalesReport())
            .add(Methods.POST, basePath + "/reports/stocks-on-warehouses/generate", generateStocksOnWarehousesReport())
            .add(Methods.POST, basePath + "/reports/united-marketplace-services/generate", generateUnitedMarketplaceServicesReport())
            .add(Methods.POST, basePath + "/reports/united-netting/generate", generateUnitedNettingReport())
            .add(Methods.POST, basePath + "/reports/united-orders/generate", generateUnitedOrdersReport())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers/all", getAllOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/info", getBidsInfoForBusiness())
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/recommendations", getBidsRecommendations())
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine", getBusinessQuarantineOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/settings", getBusinessSettings())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}", getCampaign())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/logins", getCampaignLogins())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers", getCampaignOffers())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine", getCampaignQuarantineOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/region", getCampaignRegion())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/settings", getCampaignSettings())
            .add(Methods.GET, basePath + "/campaigns", getCampaigns())
            .add(Methods.GET, basePath + "/campaigns/by_login/{login}", getCampaignsByLogin())
            .add(Methods.POST, basePath + "/categories/max-sale-quantum", getCategoriesMaxSaleQuantum())
            .add(Methods.POST, basePath + "/categories/tree", getCategoriesTree())
            .add(Methods.POST, basePath + "/category/{categoryId}/parameters", getCategoryContentParameters())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/history", getChatHistory())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats", getChats())
            .add(Methods.GET, basePath + "/delivery/services", getDeliveryServices())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}", getFeed())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs", getFeedIndexLogs())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feedback/updates", getFeedbackAndCommentUpdates())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds", getFeeds())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments", getGoodsFeedbackComments())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback", getGoodsFeedbacks())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/skus", getGoodsStats())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/hidden-offers", getHiddenOffers())
            .add(Methods.GET, basePath + "/models/{modelId}", getModel())
            .add(Methods.GET, basePath + "/models/{modelId}/offers", getModelOffers())
            .add(Methods.POST, basePath + "/models", getModels())
            .add(Methods.POST, basePath + "/models/offers", getModelsOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards", getOfferCardsContentStatus())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-mapping-entries", getOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings", getOfferMappings())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offers/recommendations", getOfferRecommendations())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers", getOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}", getOrder())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer", getOrderBusinessBuyerInfo())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/documents", getOrderBusinessDocumentsInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/buyer", getOrderBuyerInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data", getOrderLabelsData())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders", getOrders())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/orders", getOrdersStats())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets/{outletId}", getOutlet())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets/licenses", getOutletLicenses())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets", getOutlets())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-prices", getPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices", getPricesByOfferIds())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers", getPromoOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos", getPromos())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/ratings/quality/details", getQualityRatingDetails())
            .add(Methods.POST, basePath + "/businesses/{businessId}/ratings/quality", getQualityRatings())
            .add(Methods.GET, basePath + "/reports/info/{reportId}", getReportInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", getReturn())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application", getReturnApplication())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", getReturnPhoto())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/returns", getReturns())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/stocks", getStocks())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions", getSuggestedOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/suggestions", getSuggestedOfferMappings())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/suggestions", getSuggestedPrices())
            .add(Methods.GET, basePath + "/businesses/{businessId}/warehouses", getWarehouses())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods", provideOrderDigitalCodes())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/identifiers", provideOrderItemIdentifiers())
            .add(Methods.PUT, basePath + "/businesses/{businessId}/bids", putBidsForBusiness())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/bids", putBidsForCampaign())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/refresh", refreshFeed())
            .add(Methods.GET, basePath + "/models", searchModels())
            .add(Methods.GET, basePath + "/regions/{regionId}/children", searchRegionChildren())
            .add(Methods.GET, basePath + "/regions/{regionId}", searchRegionsById())
            .add(Methods.GET, basePath + "/regions", searchRegionsByName())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/file/send", sendFileToChat())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/message", sendMessageToChat())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/params", setFeedParams())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/boxes", setOrderBoxLayout())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/date", setOrderDeliveryDate())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/track", setOrderDeliveryTrackCode())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes", setOrderShipmentBoxes())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision", setReturnDecision())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/skip-reaction", skipGoodsFeedbacksReaction())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit", submitReturnDecision())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-prices/updates", updateBusinessPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/update", updateCampaignOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/update", updateGoodsFeedbackComment())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards/update", updateOfferContent())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/updates", updateOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/update", updateOfferMappings())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/items", updateOrderItems())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/status", updateOrderStatus())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/status-update", updateOrderStatuses())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit", updateOrderStorageLimit())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/outlets/{outletId}", updateOutlet())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/outlets/licenses", updateOutletLicenses())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/updates", updatePrices())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/update", updatePromoOffers())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/offers/stocks", updateStocks())
            .add(Methods.GET, basePath + "/delivery/services", getDeliveryServices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers", addHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/archive", addOffersToArchive())
            .add(Methods.POST, basePath + "/tariffs/calculate", calculateTariffs())
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine/confirm", confirmBusinessPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine/confirm", confirmCampaignPrices())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/new", createChat())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/delete", deleteCampaignOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/delete", deleteGoodsFeedbackComment())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers/delete", deleteHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/delete", deleteOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/unarchive", deleteOffersFromArchive())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/delete", deletePromoOffers())
            .add(Methods.POST, basePath + "/reports/boost-consolidated/generate", generateBoostConsolidatedReport())
            .add(Methods.POST, basePath + "/reports/competitors-position/generate", generateCompetitorsPositionReport())
            .add(Methods.POST, basePath + "/reports/goods-feedback/generate", generateGoodsFeedbackReport())
            .add(Methods.POST, basePath + "/reports/goods-realization/generate", generateGoodsRealizationReport())
            .add(Methods.POST, basePath + "/reports/documents/labels/generate", generateMassOrderLabelsReport())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label", generateOrderLabel())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels", generateOrderLabels())
            .add(Methods.POST, basePath + "/reports/prices/generate", generatePricesReport())
            .add(Methods.POST, basePath + "/reports/shelf-statistics/generate", generateShelfsStatisticsReport())
            .add(Methods.POST, basePath + "/reports/shows-sales/generate", generateShowsSalesReport())
            .add(Methods.POST, basePath + "/reports/stocks-on-warehouses/generate", generateStocksOnWarehousesReport())
            .add(Methods.POST, basePath + "/reports/united-marketplace-services/generate", generateUnitedMarketplaceServicesReport())
            .add(Methods.POST, basePath + "/reports/united-netting/generate", generateUnitedNettingReport())
            .add(Methods.POST, basePath + "/reports/united-orders/generate", generateUnitedOrdersReport())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers/all", getAllOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/info", getBidsInfoForBusiness())
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/recommendations", getBidsRecommendations())
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine", getBusinessQuarantineOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/settings", getBusinessSettings())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}", getCampaign())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/logins", getCampaignLogins())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers", getCampaignOffers())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine", getCampaignQuarantineOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/region", getCampaignRegion())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/settings", getCampaignSettings())
            .add(Methods.GET, basePath + "/campaigns", getCampaigns())
            .add(Methods.GET, basePath + "/campaigns/by_login/{login}", getCampaignsByLogin())
            .add(Methods.POST, basePath + "/categories/max-sale-quantum", getCategoriesMaxSaleQuantum())
            .add(Methods.POST, basePath + "/categories/tree", getCategoriesTree())
            .add(Methods.POST, basePath + "/category/{categoryId}/parameters", getCategoryContentParameters())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/history", getChatHistory())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats", getChats())
            .add(Methods.GET, basePath + "/delivery/services", getDeliveryServices())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}", getFeed())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs", getFeedIndexLogs())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feedback/updates", getFeedbackAndCommentUpdates())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds", getFeeds())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments", getGoodsFeedbackComments())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback", getGoodsFeedbacks())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/skus", getGoodsStats())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/hidden-offers", getHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards", getOfferCardsContentStatus())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-mapping-entries", getOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings", getOfferMappings())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offers/recommendations", getOfferRecommendations())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers", getOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}", getOrder())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer", getOrderBusinessBuyerInfo())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/documents", getOrderBusinessDocumentsInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data", getOrderLabelsData())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders", getOrders())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/orders", getOrdersStats())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-prices", getPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices", getPricesByOfferIds())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers", getPromoOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos", getPromos())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/ratings/quality/details", getQualityRatingDetails())
            .add(Methods.POST, basePath + "/businesses/{businessId}/ratings/quality", getQualityRatings())
            .add(Methods.GET, basePath + "/reports/info/{reportId}", getReportInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", getReturn())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application", getReturnApplication())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", getReturnPhoto())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/returns", getReturns())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/stocks", getStocks())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions", getSuggestedOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/suggestions", getSuggestedOfferMappings())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/suggestions", getSuggestedPrices())
            .add(Methods.GET, basePath + "/businesses/{businessId}/warehouses", getWarehouses())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/identifiers", provideOrderItemIdentifiers())
            .add(Methods.PUT, basePath + "/businesses/{businessId}/bids", putBidsForBusiness())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/bids", putBidsForCampaign())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/refresh", refreshFeed())
            .add(Methods.GET, basePath + "/regions/{regionId}/children", searchRegionChildren())
            .add(Methods.GET, basePath + "/regions/{regionId}", searchRegionsById())
            .add(Methods.GET, basePath + "/regions", searchRegionsByName())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/file/send", sendFileToChat())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/message", sendMessageToChat())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/params", setFeedParams())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/boxes", setOrderBoxLayout())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes", setOrderShipmentBoxes())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/skip-reaction", skipGoodsFeedbacksReaction())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-prices/updates", updateBusinessPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/update", updateCampaignOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/update", updateGoodsFeedbackComment())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards/update", updateOfferContent())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/updates", updateOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/update", updateOfferMappings())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/items", updateOrderItems())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/status", updateOrderStatus())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/status-update", updateOrderStatuses())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/updates", updatePrices())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/update", updatePromoOffers())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/offers/stocks", updateStocks())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/verifyEac", verifyOrderEac())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers", addHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/archive", addOffersToArchive())
            .add(Methods.POST, basePath + "/tariffs/calculate", calculateTariffs())
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine/confirm", confirmBusinessPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine/confirm", confirmCampaignPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm", confirmShipment())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/new", createChat())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/delete", deleteCampaignOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/delete", deleteGoodsFeedbackComment())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers/delete", deleteHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/delete", deleteOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/unarchive", deleteOffersFromArchive())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/delete", deletePromoOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act", downloadShipmentAct())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act", downloadShipmentDiscrepancyAct())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act", downloadShipmentInboundAct())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels", downloadShipmentPalletLabels())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/shipments/reception-transfer-act", downloadShipmentReceptionTransferAct())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill", downloadShipmentTransportationWaybill())
            .add(Methods.POST, basePath + "/reports/boost-consolidated/generate", generateBoostConsolidatedReport())
            .add(Methods.POST, basePath + "/reports/competitors-position/generate", generateCompetitorsPositionReport())
            .add(Methods.POST, basePath + "/reports/goods-feedback/generate", generateGoodsFeedbackReport())
            .add(Methods.POST, basePath + "/reports/goods-realization/generate", generateGoodsRealizationReport())
            .add(Methods.POST, basePath + "/reports/documents/labels/generate", generateMassOrderLabelsReport())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label", generateOrderLabel())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels", generateOrderLabels())
            .add(Methods.POST, basePath + "/reports/prices/generate", generatePricesReport())
            .add(Methods.POST, basePath + "/reports/shelf-statistics/generate", generateShelfsStatisticsReport())
            .add(Methods.POST, basePath + "/reports/documents/shipment-list/generate", generateShipmentListDocumentReport())
            .add(Methods.POST, basePath + "/reports/shows-sales/generate", generateShowsSalesReport())
            .add(Methods.POST, basePath + "/reports/stocks-on-warehouses/generate", generateStocksOnWarehousesReport())
            .add(Methods.POST, basePath + "/reports/united-marketplace-services/generate", generateUnitedMarketplaceServicesReport())
            .add(Methods.POST, basePath + "/reports/united-netting/generate", generateUnitedNettingReport())
            .add(Methods.POST, basePath + "/reports/united-orders/generate", generateUnitedOrdersReport())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers/all", getAllOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/info", getBidsInfoForBusiness())
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/recommendations", getBidsRecommendations())
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine", getBusinessQuarantineOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/settings", getBusinessSettings())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}", getCampaign())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/logins", getCampaignLogins())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers", getCampaignOffers())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine", getCampaignQuarantineOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/region", getCampaignRegion())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/settings", getCampaignSettings())
            .add(Methods.GET, basePath + "/campaigns", getCampaigns())
            .add(Methods.GET, basePath + "/campaigns/by_login/{login}", getCampaignsByLogin())
            .add(Methods.POST, basePath + "/categories/max-sale-quantum", getCategoriesMaxSaleQuantum())
            .add(Methods.POST, basePath + "/categories/tree", getCategoriesTree())
            .add(Methods.POST, basePath + "/category/{categoryId}/parameters", getCategoryContentParameters())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/history", getChatHistory())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats", getChats())
            .add(Methods.GET, basePath + "/delivery/services", getDeliveryServices())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}", getFeed())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs", getFeedIndexLogs())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feedback/updates", getFeedbackAndCommentUpdates())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds", getFeeds())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments", getGoodsFeedbackComments())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback", getGoodsFeedbacks())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/skus", getGoodsStats())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/hidden-offers", getHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards", getOfferCardsContentStatus())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-mapping-entries", getOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings", getOfferMappings())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offers/recommendations", getOfferRecommendations())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers", getOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}", getOrder())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer", getOrderBusinessBuyerInfo())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/documents", getOrderBusinessDocumentsInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data", getOrderLabelsData())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders", getOrders())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/orders", getOrdersStats())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-prices", getPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices", getPricesByOfferIds())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers", getPromoOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos", getPromos())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/ratings/quality/details", getQualityRatingDetails())
            .add(Methods.POST, basePath + "/businesses/{businessId}/ratings/quality", getQualityRatings())
            .add(Methods.GET, basePath + "/reports/info/{reportId}", getReportInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", getReturn())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application", getReturnApplication())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", getReturnPhoto())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/returns", getReturns())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}", getShipment())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info", getShipmentOrdersInfo())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/stocks", getStocks())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions", getSuggestedOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/suggestions", getSuggestedOfferMappings())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/suggestions", getSuggestedPrices())
            .add(Methods.GET, basePath + "/businesses/{businessId}/warehouses", getWarehouses())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/identifiers", provideOrderItemIdentifiers())
            .add(Methods.PUT, basePath + "/businesses/{businessId}/bids", putBidsForBusiness())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/bids", putBidsForCampaign())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/refresh", refreshFeed())
            .add(Methods.GET, basePath + "/regions/{regionId}/children", searchRegionChildren())
            .add(Methods.GET, basePath + "/regions/{regionId}", searchRegionsById())
            .add(Methods.GET, basePath + "/regions", searchRegionsByName())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/first-mile/shipments", searchShipments())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/file/send", sendFileToChat())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/message", sendMessageToChat())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/params", setFeedParams())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/boxes", setOrderBoxLayout())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes", setOrderShipmentBoxes())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets", setShipmentPalletsCount())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/skip-reaction", skipGoodsFeedbacksReaction())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer", transferOrdersFromShipment())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-prices/updates", updateBusinessPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/update", updateCampaignOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/update", updateGoodsFeedbackComment())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards/update", updateOfferContent())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/updates", updateOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/update", updateOfferMappings())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/items", updateOrderItems())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/status", updateOrderStatus())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/status-update", updateOrderStatuses())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/updates", updatePrices())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/update", updatePromoOffers())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/offers/stocks", updateStocks())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers", addHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/archive", addOffersToArchive())
            .add(Methods.POST, basePath + "/tariffs/calculate", calculateTariffs())
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine/confirm", confirmBusinessPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine/confirm", confirmCampaignPrices())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/new", createChat())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/delete", deleteCampaignOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/delete", deleteGoodsFeedbackComment())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers/delete", deleteHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/delete", deleteOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/unarchive", deleteOffersFromArchive())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/delete", deletePromoOffers())
            .add(Methods.POST, basePath + "/reports/boost-consolidated/generate", generateBoostConsolidatedReport())
            .add(Methods.POST, basePath + "/reports/competitors-position/generate", generateCompetitorsPositionReport())
            .add(Methods.POST, basePath + "/reports/goods-feedback/generate", generateGoodsFeedbackReport())
            .add(Methods.POST, basePath + "/reports/goods-movement/generate", generateGoodsMovementReport())
            .add(Methods.POST, basePath + "/reports/goods-realization/generate", generateGoodsRealizationReport())
            .add(Methods.POST, basePath + "/reports/goods-turnover/generate", generateGoodsTurnoverReport())
            .add(Methods.POST, basePath + "/reports/prices/generate", generatePricesReport())
            .add(Methods.POST, basePath + "/reports/shelf-statistics/generate", generateShelfsStatisticsReport())
            .add(Methods.POST, basePath + "/reports/shows-sales/generate", generateShowsSalesReport())
            .add(Methods.POST, basePath + "/reports/stocks-on-warehouses/generate", generateStocksOnWarehousesReport())
            .add(Methods.POST, basePath + "/reports/united-marketplace-services/generate", generateUnitedMarketplaceServicesReport())
            .add(Methods.POST, basePath + "/reports/united-netting/generate", generateUnitedNettingReport())
            .add(Methods.POST, basePath + "/reports/united-orders/generate", generateUnitedOrdersReport())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers/all", getAllOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/info", getBidsInfoForBusiness())
            .add(Methods.POST, basePath + "/businesses/{businessId}/bids/recommendations", getBidsRecommendations())
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine", getBusinessQuarantineOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/settings", getBusinessSettings())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}", getCampaign())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/logins", getCampaignLogins())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers", getCampaignOffers())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine", getCampaignQuarantineOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/region", getCampaignRegion())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/settings", getCampaignSettings())
            .add(Methods.GET, basePath + "/campaigns", getCampaigns())
            .add(Methods.GET, basePath + "/campaigns/by_login/{login}", getCampaignsByLogin())
            .add(Methods.POST, basePath + "/categories/max-sale-quantum", getCategoriesMaxSaleQuantum())
            .add(Methods.POST, basePath + "/categories/tree", getCategoriesTree())
            .add(Methods.POST, basePath + "/category/{categoryId}/parameters", getCategoryContentParameters())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/history", getChatHistory())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats", getChats())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}", getFeed())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs", getFeedIndexLogs())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feedback/updates", getFeedbackAndCommentUpdates())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds", getFeeds())
            .add(Methods.GET, basePath + "/warehouses", getFulfillmentWarehouses())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments", getGoodsFeedbackComments())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback", getGoodsFeedbacks())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/skus", getGoodsStats())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/hidden-offers", getHiddenOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards", getOfferCardsContentStatus())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-mapping-entries", getOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings", getOfferMappings())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offers/recommendations", getOfferRecommendations())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers", getOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}", getOrder())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer", getOrderBusinessBuyerInfo())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/documents", getOrderBusinessDocumentsInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders", getOrders())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/orders", getOrdersStats())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-prices", getPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices", getPricesByOfferIds())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers", getPromoOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos", getPromos())
            .add(Methods.POST, basePath + "/businesses/{businessId}/ratings/quality", getQualityRatings())
            .add(Methods.GET, basePath + "/reports/info/{reportId}", getReportInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", getReturn())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", getReturnPhoto())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/returns", getReturns())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/stocks", getStocks())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions", getSuggestedOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/suggestions", getSuggestedOfferMappings())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/suggestions", getSuggestedPrices())
            .add(Methods.PUT, basePath + "/businesses/{businessId}/bids", putBidsForBusiness())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/bids", putBidsForCampaign())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/refresh", refreshFeed())
            .add(Methods.GET, basePath + "/regions/{regionId}/children", searchRegionChildren())
            .add(Methods.GET, basePath + "/regions/{regionId}", searchRegionsById())
            .add(Methods.GET, basePath + "/regions", searchRegionsByName())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/file/send", sendFileToChat())
            .add(Methods.POST, basePath + "/businesses/{businessId}/chats/message", sendMessageToChat())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/params", setFeedParams())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/skip-reaction", skipGoodsFeedbacksReaction())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-prices/updates", updateBusinessPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/update", updateCampaignOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/update", updateGoodsFeedbackComment())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-cards/update", updateOfferContent())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/updates", updateOfferMappingEntries())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-mappings/update", updateOfferMappings())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/updates", updatePrices())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/update", updatePromoOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feedback/updates", getFeedbackAndCommentUpdates())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}", getFeed())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs", getFeedIndexLogs())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/feeds", getFeeds())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/refresh", refreshFeed())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/feeds/{feedId}/params", setFeedParams())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/delete", deleteGoodsFeedbackComment())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments", getGoodsFeedbackComments())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback", getGoodsFeedbacks())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/skip-reaction", skipGoodsFeedbacksReaction())
            .add(Methods.POST, basePath + "/businesses/{businessId}/goods-feedback/comments/update", updateGoodsFeedbackComment())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/skus", getGoodsStats())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers", addHiddenOffers())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/hidden-offers/delete", deleteHiddenOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/hidden-offers", getHiddenOffers())
            .add(Methods.GET, basePath + "/models/{modelId}", getModel())
            .add(Methods.GET, basePath + "/models/{modelId}/offers", getModelOffers())
            .add(Methods.POST, basePath + "/models", getModels())
            .add(Methods.POST, basePath + "/models/offers", getModelsOffers())
            .add(Methods.GET, basePath + "/models", searchModels())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-mapping-entries", getOfferMappingEntries())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions", getSuggestedOfferMappingEntries())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-mapping-entries/updates", updateOfferMappingEntries())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/delete", deleteCampaignOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers/all", getAllOffers())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers", getCampaignOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offers/recommendations", getOfferRecommendations())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offers", getOffers())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/update", updateCampaignOffers())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer", getOrderBusinessBuyerInfo())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/documents", getOrderBusinessDocumentsInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/buyer", getOrderBuyerInfo())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/date", setOrderDeliveryDate())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/track", setOrderDeliveryTrackCode())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit", updateOrderStorageLimit())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/verifyEac", verifyOrderEac())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label", generateOrderLabel())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels", generateOrderLabels())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data", getOrderLabelsData())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept", acceptOrderCancellation())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}", getOrder())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders", getOrders())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods", provideOrderDigitalCodes())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/identifiers", provideOrderItemIdentifiers())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/boxes", setOrderBoxLayout())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes", setOrderShipmentBoxes())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/items", updateOrderItems())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/orders/{orderId}/status", updateOrderStatus())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/status-update", updateOrderStatuses())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/stats/orders", getOrdersStats())
            .add(Methods.DELETE, basePath + "/campaigns/{campaignId}/outlets/licenses", deleteOutletLicenses())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets/licenses", getOutletLicenses())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/outlets/licenses", updateOutletLicenses())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/outlets", createOutlet())
            .add(Methods.DELETE, basePath + "/campaigns/{campaignId}/outlets/{outletId}", deleteOutlet())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets/{outletId}", getOutlet())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/outlets", getOutlets())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/outlets/{outletId}", updateOutlet())
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine/confirm", confirmBusinessPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine/confirm", confirmCampaignPrices())
            .add(Methods.POST, basePath + "/businesses/{businessId}/price-quarantine", getBusinessQuarantineOffers())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/price-quarantine", getCampaignQuarantineOffers())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/offer-prices", getPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices", getPricesByOfferIds())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/suggestions", getSuggestedPrices())
            .add(Methods.POST, basePath + "/businesses/{businessId}/offer-prices/updates", updateBusinessPrices())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offer-prices/updates", updatePrices())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/delete", deletePromoOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers", getPromoOffers())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos", getPromos())
            .add(Methods.POST, basePath + "/businesses/{businessId}/promos/offers/update", updatePromoOffers())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/ratings/quality/details", getQualityRatingDetails())
            .add(Methods.POST, basePath + "/businesses/{businessId}/ratings/quality", getQualityRatings())
            .add(Methods.GET, basePath + "/regions/{regionId}/children", searchRegionChildren())
            .add(Methods.GET, basePath + "/regions/{regionId}", searchRegionsById())
            .add(Methods.GET, basePath + "/regions", searchRegionsByName())
            .add(Methods.POST, basePath + "/reports/boost-consolidated/generate", generateBoostConsolidatedReport())
            .add(Methods.POST, basePath + "/reports/competitors-position/generate", generateCompetitorsPositionReport())
            .add(Methods.POST, basePath + "/reports/goods-feedback/generate", generateGoodsFeedbackReport())
            .add(Methods.POST, basePath + "/reports/goods-movement/generate", generateGoodsMovementReport())
            .add(Methods.POST, basePath + "/reports/goods-realization/generate", generateGoodsRealizationReport())
            .add(Methods.POST, basePath + "/reports/goods-turnover/generate", generateGoodsTurnoverReport())
            .add(Methods.POST, basePath + "/reports/documents/labels/generate", generateMassOrderLabelsReport())
            .add(Methods.POST, basePath + "/reports/prices/generate", generatePricesReport())
            .add(Methods.POST, basePath + "/reports/shelf-statistics/generate", generateShelfsStatisticsReport())
            .add(Methods.POST, basePath + "/reports/documents/shipment-list/generate", generateShipmentListDocumentReport())
            .add(Methods.POST, basePath + "/reports/shows-sales/generate", generateShowsSalesReport())
            .add(Methods.POST, basePath + "/reports/stocks-on-warehouses/generate", generateStocksOnWarehousesReport())
            .add(Methods.POST, basePath + "/reports/united-marketplace-services/generate", generateUnitedMarketplaceServicesReport())
            .add(Methods.POST, basePath + "/reports/united-netting/generate", generateUnitedNettingReport())
            .add(Methods.POST, basePath + "/reports/united-orders/generate", generateUnitedOrdersReport())
            .add(Methods.GET, basePath + "/reports/info/{reportId}", getReportInfo())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}", getReturn())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application", getReturnApplication())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", getReturnPhoto())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/returns", getReturns())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision", setReturnDecision())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit", submitReturnDecision())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm", confirmShipment())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act", downloadShipmentAct())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act", downloadShipmentDiscrepancyAct())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act", downloadShipmentInboundAct())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels", downloadShipmentPalletLabels())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/shipments/reception-transfer-act", downloadShipmentReceptionTransferAct())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill", downloadShipmentTransportationWaybill())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}", getShipment())
            .add(Methods.GET, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info", getShipmentOrdersInfo())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/first-mile/shipments", searchShipments())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets", setShipmentPalletsCount())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer", transferOrdersFromShipment())
            .add(Methods.POST, basePath + "/campaigns/{campaignId}/offers/stocks", getStocks())
            .add(Methods.PUT, basePath + "/campaigns/{campaignId}/offers/stocks", updateStocks())
            .add(Methods.POST, basePath + "/tariffs/calculate", calculateTariffs())
            .add(Methods.GET, basePath + "/warehouses", getFulfillmentWarehouses())
            .add(Methods.GET, basePath + "/businesses/{businessId}/warehouses", getWarehouses())
            ;
    }
}
