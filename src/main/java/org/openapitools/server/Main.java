package org.openapitools.server;

import org.openapitools.server.api.BidsServiceImpl;
import org.openapitools.server.api.BusinessOfferMappingsServiceImpl;
import org.openapitools.server.api.BusinessesServiceImpl;
import org.openapitools.server.api.CampaignsServiceImpl;
import org.openapitools.server.api.CategoriesServiceImpl;
import org.openapitools.server.api.ChatsServiceImpl;
import org.openapitools.server.api.ContentServiceImpl;
import org.openapitools.server.api.DbsServiceImpl;
import org.openapitools.server.api.DeliveryServicesServiceImpl;
import org.openapitools.server.api.ExpressServiceImpl;
import org.openapitools.server.api.FbsServiceImpl;
import org.openapitools.server.api.FbyServiceImpl;
import org.openapitools.server.api.FeedbacksServiceImpl;
import org.openapitools.server.api.FeedsServiceImpl;
import org.openapitools.server.api.GoodsFeedbackServiceImpl;
import org.openapitools.server.api.GoodsStatsServiceImpl;
import org.openapitools.server.api.HiddenOffersServiceImpl;
import org.openapitools.server.api.ModelsServiceImpl;
import org.openapitools.server.api.OfferMappingsServiceImpl;
import org.openapitools.server.api.OffersServiceImpl;
import org.openapitools.server.api.OrderBusinessInformationServiceImpl;
import org.openapitools.server.api.OrderDeliveryServiceImpl;
import org.openapitools.server.api.OrderLabelsServiceImpl;
import org.openapitools.server.api.OrdersServiceImpl;
import org.openapitools.server.api.OrdersStatsServiceImpl;
import org.openapitools.server.api.OutletLicensesServiceImpl;
import org.openapitools.server.api.OutletsServiceImpl;
import org.openapitools.server.api.PriceQuarantineServiceImpl;
import org.openapitools.server.api.PricesServiceImpl;
import org.openapitools.server.api.PromosServiceImpl;
import org.openapitools.server.api.RatingsServiceImpl;
import org.openapitools.server.api.RegionsServiceImpl;
import org.openapitools.server.api.ReportsServiceImpl;
import org.openapitools.server.api.ReturnsServiceImpl;
import org.openapitools.server.api.ShipmentsServiceImpl;
import org.openapitools.server.api.StocksServiceImpl;
import org.openapitools.server.api.TariffsServiceImpl;
import org.openapitools.server.api.WarehousesServiceImpl;

import io.helidon.logging.common.LogConfig;
import io.helidon.config.Config;
import io.helidon.webserver.http.HttpRouting;
import io.helidon.webserver.WebServer;

/**
* The application main class.
*/
public final class Main {

    /**
    * Cannot be instantiated.
    */
    private Main() {
    }

    /**
    * Application main entry point.
    * @param args command line arguments.
    */
    public static void main(final String[] args) {
        startServer();
    }

    /**
    * Start the server.
    * @return the created {@link WebServer} instance
    */
    static WebServer startServer() {

        // load logging configuration
        LogConfig.configureRuntime();

        // By default this will pick up application.yaml from the classpath
        Config config = Config.create();
        Config.global(config);

        WebServer webserver = WebServer.builder()
                .config(config.get("server"))
                .routing(Main::routing)
                .build()
                .start();

        System.out.println("WEB server is up! https://api.partner.market.yandex.ru");

        return webserver;
    }

    /**
     * Updates HTTP routing and implicitly registers observe providers.
     */
    static void routing(HttpRouting.Builder routing) {
        routing
            .register("/", new BidsServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/businesses/{businessId}/offer-mappings", new BusinessOfferMappingsServiceImpl())
            .register("/businesses/{businessId}/settings", new BusinessesServiceImpl())
            .register("/campaigns", new CampaignsServiceImpl())
            .register("/categories", new CategoriesServiceImpl())
            .register("/businesses/{businessId}/chats", new ChatsServiceImpl())
            .register("/", new ContentServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/", new DbsServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/delivery/services", new DeliveryServicesServiceImpl())
            .register("/", new ExpressServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/", new FbsServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/", new FbyServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/campaigns/{campaignId}/feedback/updates", new FeedbacksServiceImpl())
            .register("/campaigns/{campaignId}/feeds", new FeedsServiceImpl())
            .register("/businesses/{businessId}/goods-feedback", new GoodsFeedbackServiceImpl())
            .register("/campaigns/{campaignId}/stats/skus", new GoodsStatsServiceImpl())
            .register("/campaigns/{campaignId}/hidden-offers", new HiddenOffersServiceImpl())
            .register("/models", new ModelsServiceImpl())
            .register("/campaigns/{campaignId}/offer-mapping-entries", new OfferMappingsServiceImpl())
            .register("/", new OffersServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/campaigns/{campaignId}/orders/{orderId}", new OrderBusinessInformationServiceImpl())
            .register("/campaigns/{campaignId}/orders/{orderId}", new OrderDeliveryServiceImpl())
            .register("/campaigns/{campaignId}/orders/{orderId}/delivery", new OrderLabelsServiceImpl())
            .register("/campaigns/{campaignId}/orders", new OrdersServiceImpl())
            .register("/campaigns/{campaignId}/stats/orders", new OrdersStatsServiceImpl())
            .register("/campaigns/{campaignId}/outlets/licenses", new OutletLicensesServiceImpl())
            .register("/campaigns/{campaignId}/outlets", new OutletsServiceImpl())
            .register("/", new PriceQuarantineServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/", new PricesServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/businesses/{businessId}/promos", new PromosServiceImpl())
            .register("/", new RatingsServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/regions", new RegionsServiceImpl())
            .register("/reports", new ReportsServiceImpl())
            .register("/campaigns/{campaignId}", new ReturnsServiceImpl())
            .register("/campaigns/{campaignId}", new ShipmentsServiceImpl())
            .register("/campaigns/{campaignId}/offers/stocks", new StocksServiceImpl())
            .register("/tariffs/calculate", new TariffsServiceImpl())
            .register("/", new WarehousesServiceImpl())/* TODO - fix path or operation grouping for better performance */;
    }
}
