package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetOfferMappingEntriesResponse;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingEntriesResponse;
import org.openapitools.vertxweb.server.model.OfferAvailabilityStatusType;
import org.openapitools.vertxweb.server.model.OfferMappingKindType;
import org.openapitools.vertxweb.server.model.OfferProcessingStatusType;
import org.openapitools.vertxweb.server.model.UpdateOfferMappingEntryRequest;

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

public class OfferMappingsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OfferMappingsApiHandler.class);

    private final OfferMappingsApi api;

    public OfferMappingsApiHandler(OfferMappingsApi api) {
        this.api = api;
    }

    @Deprecated
    public OfferMappingsApiHandler() {
        this(new OfferMappingsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getOfferMappingEntries").handler(this::getOfferMappingEntries);
        builder.operation("getSuggestedOfferMappingEntries").handler(this::getSuggestedOfferMappingEntries);
        builder.operation("updateOfferMappingEntries").handler(this::updateOfferMappingEntries);
    }

    private void getOfferMappingEntries(RoutingContext routingContext) {
        logger.info("getOfferMappingEntries()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        List<String> offerId = requestParameters.queryParameter("offer_id") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("offer_id").get(), new TypeReference<List<String>>(){}) : null;
        List<String> shopSku = requestParameters.queryParameter("shop_sku") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("shop_sku").get(), new TypeReference<List<String>>(){}) : null;
        OfferMappingKindType mappingKind = requestParameters.queryParameter("mapping_kind") != null ? requestParameters.queryParameter("mapping_kind").getOfferMappingKindType() : null;
        List<OfferProcessingStatusType> status = requestParameters.queryParameter("status") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("status").get(), new TypeReference<List<OfferProcessingStatusType>>(){}) : null;
        List<OfferAvailabilityStatusType> availability = requestParameters.queryParameter("availability") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("availability").get(), new TypeReference<List<OfferAvailabilityStatusType>>(){}) : null;
        List<Integer> categoryId = requestParameters.queryParameter("category_id") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("category_id").get(), new TypeReference<List<Integer>>(){}) : null;
        List<String> vendor = requestParameters.queryParameter("vendor") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("vendor").get(), new TypeReference<List<String>>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter offerId is {}", offerId);
        logger.debug("Parameter shopSku is {}", shopSku);
        logger.debug("Parameter mappingKind is {}", mappingKind);
        logger.debug("Parameter status is {}", status);
        logger.debug("Parameter availability is {}", availability);
        logger.debug("Parameter categoryId is {}", categoryId);
        logger.debug("Parameter vendor is {}", vendor);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)
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

    private void getSuggestedOfferMappingEntries(RoutingContext routingContext) {
        logger.info("getSuggestedOfferMappingEntries()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetSuggestedOfferMappingEntriesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter getSuggestedOfferMappingEntriesRequest is {}", getSuggestedOfferMappingEntriesRequest);

        api.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)
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

    private void updateOfferMappingEntries(RoutingContext routingContext) {
        logger.info("updateOfferMappingEntries()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOfferMappingEntryRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter updateOfferMappingEntryRequest is {}", updateOfferMappingEntryRequest);

        api.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)
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
