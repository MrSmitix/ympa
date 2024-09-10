package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetFulfillmentWarehousesResponse;
import org.openapitools.vertxweb.server.model.GetWarehousesResponse;

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

public class WarehousesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(WarehousesApiHandler.class);

    private final WarehousesApi api;

    public WarehousesApiHandler(WarehousesApi api) {
        this.api = api;
    }

    @Deprecated
    public WarehousesApiHandler() {
        this(new WarehousesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getFulfillmentWarehouses").handler(this::getFulfillmentWarehouses);
        builder.operation("getWarehouses").handler(this::getWarehouses);
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

    private void getWarehouses(RoutingContext routingContext) {
        logger.info("getWarehouses()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;

        logger.debug("Parameter businessId is {}", businessId);

        api.getWarehouses(businessId)
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
