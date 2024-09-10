package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.GetReturnResponse;
import org.openapitools.vertxweb.server.model.GetReturnsResponse;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.RefundStatusType;
import org.openapitools.vertxweb.server.model.ReturnType;
import org.openapitools.vertxweb.server.model.SetReturnDecisionRequest;

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

public class ReturnsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ReturnsApiHandler.class);

    private final ReturnsApi api;

    public ReturnsApiHandler(ReturnsApi api) {
        this.api = api;
    }

    @Deprecated
    public ReturnsApiHandler() {
        this(new ReturnsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getReturn").handler(this::getReturn);
        builder.operation("getReturnApplication").handler(this::getReturnApplication);
        builder.operation("getReturnPhoto").handler(this::getReturnPhoto);
        builder.operation("getReturns").handler(this::getReturns);
        builder.operation("setReturnDecision").handler(this::setReturnDecision);
        builder.operation("submitReturnDecision").handler(this::submitReturnDecision);
    }

    private void getReturn(RoutingContext routingContext) {
        logger.info("getReturn()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        Long returnId = requestParameters.pathParameter("returnId") != null ? requestParameters.pathParameter("returnId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter returnId is {}", returnId);

        api.getReturn(campaignId, orderId, returnId)
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

    private void getReturnApplication(RoutingContext routingContext) {
        logger.info("getReturnApplication()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        Long returnId = requestParameters.pathParameter("returnId") != null ? requestParameters.pathParameter("returnId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter returnId is {}", returnId);

        api.getReturnApplication(campaignId, orderId, returnId)
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

    private void getReturnPhoto(RoutingContext routingContext) {
        logger.info("getReturnPhoto()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        Long returnId = requestParameters.pathParameter("returnId") != null ? requestParameters.pathParameter("returnId").getLong() : null;
        Long itemId = requestParameters.pathParameter("itemId") != null ? requestParameters.pathParameter("itemId").getLong() : null;
        String imageHash = requestParameters.pathParameter("imageHash") != null ? requestParameters.pathParameter("imageHash").getString() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter returnId is {}", returnId);
        logger.debug("Parameter itemId is {}", itemId);
        logger.debug("Parameter imageHash is {}", imageHash);

        api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)
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

    private void getReturns(RoutingContext routingContext) {
        logger.info("getReturns()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        List<Long> orderIds = requestParameters.queryParameter("orderIds") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("orderIds").get(), new TypeReference<List<Long>>(){}) : null;
        List<RefundStatusType> statuses = requestParameters.queryParameter("statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("statuses").get(), new TypeReference<List<RefundStatusType>>(){}) : null;
        ReturnType type = requestParameters.queryParameter("type") != null ? requestParameters.queryParameter("type").getReturnType() : null;
        LocalDate fromDate = requestParameters.queryParameter("fromDate") != null ? requestParameters.queryParameter("fromDate").getLocalDate() : null;
        LocalDate toDate = requestParameters.queryParameter("toDate") != null ? requestParameters.queryParameter("toDate").getLocalDate() : null;
        LocalDate fromDate2 = requestParameters.queryParameter("from_date") != null ? requestParameters.queryParameter("from_date").getLocalDate() : null;
        LocalDate toDate2 = requestParameters.queryParameter("to_date") != null ? requestParameters.queryParameter("to_date").getLocalDate() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter orderIds is {}", orderIds);
        logger.debug("Parameter statuses is {}", statuses);
        logger.debug("Parameter type is {}", type);
        logger.debug("Parameter fromDate is {}", fromDate);
        logger.debug("Parameter toDate is {}", toDate);
        logger.debug("Parameter fromDate2 is {}", fromDate2);
        logger.debug("Parameter toDate2 is {}", toDate2);

        api.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)
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

    private void setReturnDecision(RoutingContext routingContext) {
        logger.info("setReturnDecision()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        Long returnId = requestParameters.pathParameter("returnId") != null ? requestParameters.pathParameter("returnId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SetReturnDecisionRequest setReturnDecisionRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SetReturnDecisionRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter returnId is {}", returnId);
        logger.debug("Parameter setReturnDecisionRequest is {}", setReturnDecisionRequest);

        api.setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest)
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

    private void submitReturnDecision(RoutingContext routingContext) {
        logger.info("submitReturnDecision()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        Long returnId = requestParameters.pathParameter("returnId") != null ? requestParameters.pathParameter("returnId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter returnId is {}", returnId);

        api.submitReturnDecision(campaignId, orderId, returnId)
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
