package org.openapitools.vertxweb.server;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.openapi.RouterBuilderOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openapitools.vertxweb.server.api.BidsApiHandler;
import org.openapitools.vertxweb.server.api.BidsApiImpl;
import org.openapitools.vertxweb.server.api.BusinessOfferMappingsApiHandler;
import org.openapitools.vertxweb.server.api.BusinessOfferMappingsApiImpl;
import org.openapitools.vertxweb.server.api.BusinessesApiHandler;
import org.openapitools.vertxweb.server.api.BusinessesApiImpl;
import org.openapitools.vertxweb.server.api.CampaignsApiHandler;
import org.openapitools.vertxweb.server.api.CampaignsApiImpl;
import org.openapitools.vertxweb.server.api.CategoriesApiHandler;
import org.openapitools.vertxweb.server.api.CategoriesApiImpl;
import org.openapitools.vertxweb.server.api.ChatsApiHandler;
import org.openapitools.vertxweb.server.api.ChatsApiImpl;
import org.openapitools.vertxweb.server.api.ContentApiHandler;
import org.openapitools.vertxweb.server.api.ContentApiImpl;
import org.openapitools.vertxweb.server.api.DbsApiHandler;
import org.openapitools.vertxweb.server.api.DbsApiImpl;
import org.openapitools.vertxweb.server.api.DeliveryServicesApiHandler;
import org.openapitools.vertxweb.server.api.DeliveryServicesApiImpl;
import org.openapitools.vertxweb.server.api.ExpressApiHandler;
import org.openapitools.vertxweb.server.api.ExpressApiImpl;
import org.openapitools.vertxweb.server.api.FbsApiHandler;
import org.openapitools.vertxweb.server.api.FbsApiImpl;
import org.openapitools.vertxweb.server.api.FbyApiHandler;
import org.openapitools.vertxweb.server.api.FbyApiImpl;
import org.openapitools.vertxweb.server.api.FeedbacksApiHandler;
import org.openapitools.vertxweb.server.api.FeedbacksApiImpl;
import org.openapitools.vertxweb.server.api.FeedsApiHandler;
import org.openapitools.vertxweb.server.api.FeedsApiImpl;
import org.openapitools.vertxweb.server.api.GoodsFeedbackApiHandler;
import org.openapitools.vertxweb.server.api.GoodsFeedbackApiImpl;
import org.openapitools.vertxweb.server.api.GoodsStatsApiHandler;
import org.openapitools.vertxweb.server.api.GoodsStatsApiImpl;
import org.openapitools.vertxweb.server.api.HiddenOffersApiHandler;
import org.openapitools.vertxweb.server.api.HiddenOffersApiImpl;
import org.openapitools.vertxweb.server.api.ModelsApiHandler;
import org.openapitools.vertxweb.server.api.ModelsApiImpl;
import org.openapitools.vertxweb.server.api.OfferMappingsApiHandler;
import org.openapitools.vertxweb.server.api.OfferMappingsApiImpl;
import org.openapitools.vertxweb.server.api.OffersApiHandler;
import org.openapitools.vertxweb.server.api.OffersApiImpl;
import org.openapitools.vertxweb.server.api.OrderBusinessInformationApiHandler;
import org.openapitools.vertxweb.server.api.OrderBusinessInformationApiImpl;
import org.openapitools.vertxweb.server.api.OrderDeliveryApiHandler;
import org.openapitools.vertxweb.server.api.OrderDeliveryApiImpl;
import org.openapitools.vertxweb.server.api.OrderLabelsApiHandler;
import org.openapitools.vertxweb.server.api.OrderLabelsApiImpl;
import org.openapitools.vertxweb.server.api.OrdersApiHandler;
import org.openapitools.vertxweb.server.api.OrdersApiImpl;
import org.openapitools.vertxweb.server.api.OrdersStatsApiHandler;
import org.openapitools.vertxweb.server.api.OrdersStatsApiImpl;
import org.openapitools.vertxweb.server.api.OutletLicensesApiHandler;
import org.openapitools.vertxweb.server.api.OutletLicensesApiImpl;
import org.openapitools.vertxweb.server.api.OutletsApiHandler;
import org.openapitools.vertxweb.server.api.OutletsApiImpl;
import org.openapitools.vertxweb.server.api.PriceQuarantineApiHandler;
import org.openapitools.vertxweb.server.api.PriceQuarantineApiImpl;
import org.openapitools.vertxweb.server.api.PricesApiHandler;
import org.openapitools.vertxweb.server.api.PricesApiImpl;
import org.openapitools.vertxweb.server.api.PromosApiHandler;
import org.openapitools.vertxweb.server.api.PromosApiImpl;
import org.openapitools.vertxweb.server.api.RatingsApiHandler;
import org.openapitools.vertxweb.server.api.RatingsApiImpl;
import org.openapitools.vertxweb.server.api.RegionsApiHandler;
import org.openapitools.vertxweb.server.api.RegionsApiImpl;
import org.openapitools.vertxweb.server.api.ReportsApiHandler;
import org.openapitools.vertxweb.server.api.ReportsApiImpl;
import org.openapitools.vertxweb.server.api.ReturnsApiHandler;
import org.openapitools.vertxweb.server.api.ReturnsApiImpl;
import org.openapitools.vertxweb.server.api.ShipmentsApiHandler;
import org.openapitools.vertxweb.server.api.ShipmentsApiImpl;
import org.openapitools.vertxweb.server.api.StocksApiHandler;
import org.openapitools.vertxweb.server.api.StocksApiImpl;
import org.openapitools.vertxweb.server.api.TariffsApiHandler;
import org.openapitools.vertxweb.server.api.TariffsApiImpl;
import org.openapitools.vertxweb.server.api.WarehousesApiHandler;
import org.openapitools.vertxweb.server.api.WarehousesApiImpl;

public class HttpServerVerticle extends AbstractVerticle {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerVerticle.class);
    private static final String specFile = "src/main/resources/openapi.yaml";

    
    private final BidsApiHandler bidsHandler = new BidsApiHandler(new BidsApiImpl());
    private final BusinessOfferMappingsApiHandler businessOfferMappingsHandler = new BusinessOfferMappingsApiHandler(new BusinessOfferMappingsApiImpl());
    private final BusinessesApiHandler businessesHandler = new BusinessesApiHandler(new BusinessesApiImpl());
    private final CampaignsApiHandler campaignsHandler = new CampaignsApiHandler(new CampaignsApiImpl());
    private final CategoriesApiHandler categoriesHandler = new CategoriesApiHandler(new CategoriesApiImpl());
    private final ChatsApiHandler chatsHandler = new ChatsApiHandler(new ChatsApiImpl());
    private final ContentApiHandler contentHandler = new ContentApiHandler(new ContentApiImpl());
    private final DbsApiHandler dbsHandler = new DbsApiHandler(new DbsApiImpl());
    private final DeliveryServicesApiHandler deliveryServicesHandler = new DeliveryServicesApiHandler(new DeliveryServicesApiImpl());
    private final ExpressApiHandler expressHandler = new ExpressApiHandler(new ExpressApiImpl());
    private final FbsApiHandler fbsHandler = new FbsApiHandler(new FbsApiImpl());
    private final FbyApiHandler fbyHandler = new FbyApiHandler(new FbyApiImpl());
    private final FeedbacksApiHandler feedbacksHandler = new FeedbacksApiHandler(new FeedbacksApiImpl());
    private final FeedsApiHandler feedsHandler = new FeedsApiHandler(new FeedsApiImpl());
    private final GoodsFeedbackApiHandler goodsFeedbackHandler = new GoodsFeedbackApiHandler(new GoodsFeedbackApiImpl());
    private final GoodsStatsApiHandler goodsStatsHandler = new GoodsStatsApiHandler(new GoodsStatsApiImpl());
    private final HiddenOffersApiHandler hiddenOffersHandler = new HiddenOffersApiHandler(new HiddenOffersApiImpl());
    private final ModelsApiHandler modelsHandler = new ModelsApiHandler(new ModelsApiImpl());
    private final OfferMappingsApiHandler offerMappingsHandler = new OfferMappingsApiHandler(new OfferMappingsApiImpl());
    private final OffersApiHandler offersHandler = new OffersApiHandler(new OffersApiImpl());
    private final OrderBusinessInformationApiHandler orderBusinessInformationHandler = new OrderBusinessInformationApiHandler(new OrderBusinessInformationApiImpl());
    private final OrderDeliveryApiHandler orderDeliveryHandler = new OrderDeliveryApiHandler(new OrderDeliveryApiImpl());
    private final OrderLabelsApiHandler orderLabelsHandler = new OrderLabelsApiHandler(new OrderLabelsApiImpl());
    private final OrdersApiHandler ordersHandler = new OrdersApiHandler(new OrdersApiImpl());
    private final OrdersStatsApiHandler ordersStatsHandler = new OrdersStatsApiHandler(new OrdersStatsApiImpl());
    private final OutletLicensesApiHandler outletLicensesHandler = new OutletLicensesApiHandler(new OutletLicensesApiImpl());
    private final OutletsApiHandler outletsHandler = new OutletsApiHandler(new OutletsApiImpl());
    private final PriceQuarantineApiHandler priceQuarantineHandler = new PriceQuarantineApiHandler(new PriceQuarantineApiImpl());
    private final PricesApiHandler pricesHandler = new PricesApiHandler(new PricesApiImpl());
    private final PromosApiHandler promosHandler = new PromosApiHandler(new PromosApiImpl());
    private final RatingsApiHandler ratingsHandler = new RatingsApiHandler(new RatingsApiImpl());
    private final RegionsApiHandler regionsHandler = new RegionsApiHandler(new RegionsApiImpl());
    private final ReportsApiHandler reportsHandler = new ReportsApiHandler(new ReportsApiImpl());
    private final ReturnsApiHandler returnsHandler = new ReturnsApiHandler(new ReturnsApiImpl());
    private final ShipmentsApiHandler shipmentsHandler = new ShipmentsApiHandler(new ShipmentsApiImpl());
    private final StocksApiHandler stocksHandler = new StocksApiHandler(new StocksApiImpl());
    private final TariffsApiHandler tariffsHandler = new TariffsApiHandler(new TariffsApiImpl());
    private final WarehousesApiHandler warehousesHandler = new WarehousesApiHandler(new WarehousesApiImpl());

    @Override
    public void start(Promise<Void> startPromise) {
        RouterBuilder.create(vertx, specFile)
            .map(builder -> {
              builder.setOptions(new RouterBuilderOptions()
                  // For production use case, you need to enable this flag and provide the proper security handler
                  .setRequireSecurityHandlers(false)
              );
              
              bidsHandler.mount(builder);
              businessOfferMappingsHandler.mount(builder);
              businessesHandler.mount(builder);
              campaignsHandler.mount(builder);
              categoriesHandler.mount(builder);
              chatsHandler.mount(builder);
              contentHandler.mount(builder);
              dbsHandler.mount(builder);
              deliveryServicesHandler.mount(builder);
              expressHandler.mount(builder);
              fbsHandler.mount(builder);
              fbyHandler.mount(builder);
              feedbacksHandler.mount(builder);
              feedsHandler.mount(builder);
              goodsFeedbackHandler.mount(builder);
              goodsStatsHandler.mount(builder);
              hiddenOffersHandler.mount(builder);
              modelsHandler.mount(builder);
              offerMappingsHandler.mount(builder);
              offersHandler.mount(builder);
              orderBusinessInformationHandler.mount(builder);
              orderDeliveryHandler.mount(builder);
              orderLabelsHandler.mount(builder);
              ordersHandler.mount(builder);
              ordersStatsHandler.mount(builder);
              outletLicensesHandler.mount(builder);
              outletsHandler.mount(builder);
              priceQuarantineHandler.mount(builder);
              pricesHandler.mount(builder);
              promosHandler.mount(builder);
              ratingsHandler.mount(builder);
              regionsHandler.mount(builder);
              reportsHandler.mount(builder);
              returnsHandler.mount(builder);
              shipmentsHandler.mount(builder);
              stocksHandler.mount(builder);
              tariffsHandler.mount(builder);
              warehousesHandler.mount(builder);

              Router router = builder.createRouter();
              router.errorHandler(400, this::validationFailureHandler);

              return router;
            })
            .compose(router ->
                vertx.createHttpServer()
                    .requestHandler(router)
                    .listen(8080)
            )
            .onSuccess(server -> logger.info("Http verticle deploy successful"))
            .onFailure(t -> logger.error("Http verticle failed to deploy", t))
            // Complete the start promise
            .<Void>mapEmpty().onComplete(startPromise);
    }

    private void validationFailureHandler(RoutingContext rc) {
         rc.response().setStatusCode(400)
                 .end("Bad Request : " + rc.failure().getMessage());
    }
}
