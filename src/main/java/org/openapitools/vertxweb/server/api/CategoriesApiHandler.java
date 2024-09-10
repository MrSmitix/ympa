package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.vertxweb.server.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.vertxweb.server.model.GetCategoriesRequest;
import org.openapitools.vertxweb.server.model.GetCategoriesResponse;

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

public class CategoriesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CategoriesApiHandler.class);

    private final CategoriesApi api;

    public CategoriesApiHandler(CategoriesApi api) {
        this.api = api;
    }

    @Deprecated
    public CategoriesApiHandler() {
        this(new CategoriesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getCategoriesMaxSaleQuantum").handler(this::getCategoriesMaxSaleQuantum);
        builder.operation("getCategoriesTree").handler(this::getCategoriesTree);
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

}
