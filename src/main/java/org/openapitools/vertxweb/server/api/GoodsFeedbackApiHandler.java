package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackRequest;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackResponse;
import org.openapitools.vertxweb.server.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.vertxweb.server.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.vertxweb.server.model.UpdateGoodsFeedbackCommentResponse;

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

public class GoodsFeedbackApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(GoodsFeedbackApiHandler.class);

    private final GoodsFeedbackApi api;

    public GoodsFeedbackApiHandler(GoodsFeedbackApi api) {
        this.api = api;
    }

    @Deprecated
    public GoodsFeedbackApiHandler() {
        this(new GoodsFeedbackApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("deleteGoodsFeedbackComment").handler(this::deleteGoodsFeedbackComment);
        builder.operation("getGoodsFeedbackComments").handler(this::getGoodsFeedbackComments);
        builder.operation("getGoodsFeedbacks").handler(this::getGoodsFeedbacks);
        builder.operation("skipGoodsFeedbacksReaction").handler(this::skipGoodsFeedbacksReaction);
        builder.operation("updateGoodsFeedbackComment").handler(this::updateGoodsFeedbackComment);
    }

    private void deleteGoodsFeedbackComment(RoutingContext routingContext) {
        logger.info("deleteGoodsFeedbackComment()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteGoodsFeedbackCommentRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deleteGoodsFeedbackCommentRequest is {}", deleteGoodsFeedbackCommentRequest);

        api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)
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

    private void getGoodsFeedbackComments(RoutingContext routingContext) {
        logger.info("getGoodsFeedbackComments()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetGoodsFeedbackCommentsRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getGoodsFeedbackCommentsRequest is {}", getGoodsFeedbackCommentsRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)
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

    private void getGoodsFeedbacks(RoutingContext routingContext) {
        logger.info("getGoodsFeedbacks()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetGoodsFeedbackRequest getGoodsFeedbackRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetGoodsFeedbackRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getGoodsFeedbackRequest is {}", getGoodsFeedbackRequest);

        api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)
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

    private void skipGoodsFeedbacksReaction(RoutingContext routingContext) {
        logger.info("skipGoodsFeedbacksReaction()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SkipGoodsFeedbackReactionRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter skipGoodsFeedbackReactionRequest is {}", skipGoodsFeedbackReactionRequest);

        api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)
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

    private void updateGoodsFeedbackComment(RoutingContext routingContext) {
        logger.info("updateGoodsFeedbackComment()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateGoodsFeedbackCommentRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateGoodsFeedbackCommentRequest is {}", updateGoodsFeedbackCommentRequest);

        api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)
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
