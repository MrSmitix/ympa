package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.DeleteGoodsFeedbackCommentRequest;
import apimodels.EmptyApiResponse;
import apimodels.GetGoodsFeedbackCommentsRequest;
import apimodels.GetGoodsFeedbackCommentsResponse;
import apimodels.GetGoodsFeedbackRequest;
import apimodels.GetGoodsFeedbackResponse;
import apimodels.SkipGoodsFeedbackReactionRequest;
import apimodels.UpdateGoodsFeedbackCommentRequest;
import apimodels.UpdateGoodsFeedbackCommentResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class GoodsFeedbackApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result deleteGoodsFeedbackCommentHttp(Http.Request request, Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = deleteGoodsFeedbackComment(request, businessId, deleteGoodsFeedbackCommentRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse deleteGoodsFeedbackComment(Http.Request request, Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) throws Exception;

    public Result getGoodsFeedbackCommentsHttp(Http.Request request, Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetGoodsFeedbackCommentsResponse obj = getGoodsFeedbackComments(request, businessId, getGoodsFeedbackCommentsRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetGoodsFeedbackCommentsResponse getGoodsFeedbackComments(Http.Request request, Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) throws Exception;

    public Result getGoodsFeedbacksHttp(Http.Request request, Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetGoodsFeedbackResponse obj = getGoodsFeedbacks(request, businessId, pageToken, limit, getGoodsFeedbackRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetGoodsFeedbackResponse getGoodsFeedbacks(Http.Request request, Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) throws Exception;

    public Result skipGoodsFeedbacksReactionHttp(Http.Request request, Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = skipGoodsFeedbacksReaction(request, businessId, skipGoodsFeedbackReactionRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse skipGoodsFeedbacksReaction(Http.Request request, Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) throws Exception;

    public Result updateGoodsFeedbackCommentHttp(Http.Request request, Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdateGoodsFeedbackCommentResponse obj = updateGoodsFeedbackComment(request, businessId, updateGoodsFeedbackCommentRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateGoodsFeedbackCommentResponse updateGoodsFeedbackComment(Http.Request request, Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) throws Exception;

}
