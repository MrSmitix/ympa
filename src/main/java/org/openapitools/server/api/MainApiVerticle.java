package org.openapitools.server.api;

import java.nio.charset.Charset;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.phiz71.vertx.swagger.router.OperationIdServiceIdResolver;
import com.github.phiz71.vertx.swagger.router.SwaggerRouter;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.file.FileSystem;
import io.vertx.core.json.Json;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class MainApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(MainApiVerticle.class);

    private int serverPort = 8080;
    protected Router router;

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        router = Router.router(vertx);
    }

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        Json.mapper.registerModule(new JavaTimeModule());
        FileSystem vertxFileSystem = vertx.fileSystem();
        vertxFileSystem.readFile("openapi.json", readFile -> {
            if (readFile.succeeded()) {
                Swagger swagger = new SwaggerParser().parse(readFile.result().toString(Charset.forName("utf-8")));
                Router swaggerRouter = SwaggerRouter.swaggerRouter(router, swagger, vertx.eventBus(), new OperationIdServiceIdResolver());

                deployVerticals(startFuture);

                vertx.createHttpServer()
                    .requestHandler(swaggerRouter::accept)
                    .listen(serverPort, h -> {
                        if (h.succeeded()) {
                            startFuture.complete();
                        } else {
                            startFuture.fail(h.cause());
                        }
                    });
            } else {
                startFuture.fail(readFile.cause());
            }
        });
    }

    public void deployVerticals(Future<Void> startFuture) {
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BidsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BidsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BidsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BusinessOfferMappingsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BusinessOfferMappingsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BusinessOfferMappingsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BusinessesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BusinessesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BusinessesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.CampaignsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("CampaignsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("CampaignsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.CategoriesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("CategoriesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("CategoriesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ChatsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ChatsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ChatsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ContentApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ContentApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ContentApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.DbsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("DbsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("DbsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.DeliveryServicesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("DeliveryServicesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("DeliveryServicesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ExpressApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ExpressApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ExpressApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.FbsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("FbsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("FbsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.FbyApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("FbyApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("FbyApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.FeedbacksApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("FeedbacksApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("FeedbacksApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.FeedsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("FeedsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("FeedsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.GoodsFeedbackApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("GoodsFeedbackApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("GoodsFeedbackApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.GoodsStatsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("GoodsStatsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("GoodsStatsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.HiddenOffersApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("HiddenOffersApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("HiddenOffersApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ModelsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ModelsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ModelsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OfferMappingsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OfferMappingsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OfferMappingsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OffersApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OffersApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OffersApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OrderBusinessInformationApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OrderBusinessInformationApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OrderBusinessInformationApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OrderDeliveryApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OrderDeliveryApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OrderDeliveryApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OrderLabelsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OrderLabelsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OrderLabelsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OrdersApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OrdersApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OrdersApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OrdersStatsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OrdersStatsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OrdersStatsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OutletLicensesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OutletLicensesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OutletLicensesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OutletsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OutletsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OutletsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PriceQuarantineApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PriceQuarantineApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PriceQuarantineApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PricesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PricesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PricesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PromosApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PromosApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PromosApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.RatingsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("RatingsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("RatingsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.RegionsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("RegionsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("RegionsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ReportsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ReportsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ReportsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ReturnsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ReturnsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ReturnsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ShipmentsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ShipmentsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ShipmentsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.StocksApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("StocksApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("StocksApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.TariffsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("TariffsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("TariffsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.WarehousesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("WarehousesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("WarehousesApiVerticle : Deployment failed");
            }
        });
        
    }
}
