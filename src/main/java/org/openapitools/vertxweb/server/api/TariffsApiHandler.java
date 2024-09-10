package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.CalculateTariffsRequest;
import org.openapitools.vertxweb.server.model.CalculateTariffsResponse;

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

public class TariffsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(TariffsApiHandler.class);

    private final TariffsApi api;

    public TariffsApiHandler(TariffsApi api) {
        this.api = api;
    }

    @Deprecated
    public TariffsApiHandler() {
        this(new TariffsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("calculateTariffs").handler(this::calculateTariffs);
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

}
