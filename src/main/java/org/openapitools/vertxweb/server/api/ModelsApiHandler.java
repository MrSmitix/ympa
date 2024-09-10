package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.CurrencyType;
import org.openapitools.vertxweb.server.model.GetModelsOffersResponse;
import org.openapitools.vertxweb.server.model.GetModelsRequest;
import org.openapitools.vertxweb.server.model.GetModelsResponse;
import org.openapitools.vertxweb.server.model.SearchModelsResponse;
import org.openapitools.vertxweb.server.model.SortOrderType;

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

public class ModelsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ModelsApiHandler.class);

    private final ModelsApi api;

    public ModelsApiHandler(ModelsApi api) {
        this.api = api;
    }

    @Deprecated
    public ModelsApiHandler() {
        this(new ModelsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getModel").handler(this::getModel);
        builder.operation("getModelOffers").handler(this::getModelOffers);
        builder.operation("getModels").handler(this::getModels);
        builder.operation("getModelsOffers").handler(this::getModelsOffers);
        builder.operation("searchModels").handler(this::searchModels);
    }

    private void getModel(RoutingContext routingContext) {
        logger.info("getModel()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long modelId = requestParameters.pathParameter("modelId") != null ? requestParameters.pathParameter("modelId").getLong() : null;
        Long regionId = requestParameters.queryParameter("regionId") != null ? requestParameters.queryParameter("regionId").getLong() : null;
        CurrencyType currency = requestParameters.queryParameter("currency") != null ? requestParameters.queryParameter("currency").getCurrencyType() : null;

        logger.debug("Parameter modelId is {}", modelId);
        logger.debug("Parameter regionId is {}", regionId);
        logger.debug("Parameter currency is {}", currency);

        api.getModel(modelId, regionId, currency)
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

    private void getModelOffers(RoutingContext routingContext) {
        logger.info("getModelOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long modelId = requestParameters.pathParameter("modelId") != null ? requestParameters.pathParameter("modelId").getLong() : null;
        Long regionId = requestParameters.queryParameter("regionId") != null ? requestParameters.queryParameter("regionId").getLong() : null;
        CurrencyType currency = requestParameters.queryParameter("currency") != null ? requestParameters.queryParameter("currency").getCurrencyType() : null;
        SortOrderType orderByPrice = requestParameters.queryParameter("orderByPrice") != null ? requestParameters.queryParameter("orderByPrice").getSortOrderType() : null;
        Integer count = requestParameters.queryParameter("count") != null ? requestParameters.queryParameter("count").getInteger() : 10;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;

        logger.debug("Parameter modelId is {}", modelId);
        logger.debug("Parameter regionId is {}", regionId);
        logger.debug("Parameter currency is {}", currency);
        logger.debug("Parameter orderByPrice is {}", orderByPrice);
        logger.debug("Parameter count is {}", count);
        logger.debug("Parameter page is {}", page);

        api.getModelOffers(modelId, regionId, currency, orderByPrice, count, page)
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

    private void getModels(RoutingContext routingContext) {
        logger.info("getModels()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long regionId = requestParameters.queryParameter("regionId") != null ? requestParameters.queryParameter("regionId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetModelsRequest getModelsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetModelsRequest>(){}) : null;
        CurrencyType currency = requestParameters.queryParameter("currency") != null ? requestParameters.queryParameter("currency").getCurrencyType() : null;

        logger.debug("Parameter regionId is {}", regionId);
        logger.debug("Parameter getModelsRequest is {}", getModelsRequest);
        logger.debug("Parameter currency is {}", currency);

        api.getModels(regionId, getModelsRequest, currency)
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

    private void getModelsOffers(RoutingContext routingContext) {
        logger.info("getModelsOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long regionId = requestParameters.queryParameter("regionId") != null ? requestParameters.queryParameter("regionId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetModelsRequest getModelsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetModelsRequest>(){}) : null;
        CurrencyType currency = requestParameters.queryParameter("currency") != null ? requestParameters.queryParameter("currency").getCurrencyType() : null;
        SortOrderType orderByPrice = requestParameters.queryParameter("orderByPrice") != null ? requestParameters.queryParameter("orderByPrice").getSortOrderType() : null;

        logger.debug("Parameter regionId is {}", regionId);
        logger.debug("Parameter getModelsRequest is {}", getModelsRequest);
        logger.debug("Parameter currency is {}", currency);
        logger.debug("Parameter orderByPrice is {}", orderByPrice);

        api.getModelsOffers(regionId, getModelsRequest, currency, orderByPrice)
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

    private void searchModels(RoutingContext routingContext) {
        logger.info("searchModels()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String query = requestParameters.queryParameter("query") != null ? requestParameters.queryParameter("query").getString() : null;
        Long regionId = requestParameters.queryParameter("regionId") != null ? requestParameters.queryParameter("regionId").getLong() : null;
        CurrencyType currency = requestParameters.queryParameter("currency") != null ? requestParameters.queryParameter("currency").getCurrencyType() : null;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;

        logger.debug("Parameter query is {}", query);
        logger.debug("Parameter regionId is {}", regionId);
        logger.debug("Parameter currency is {}", currency);
        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.searchModels(query, regionId, currency, page, pageSize)
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
