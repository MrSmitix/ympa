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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackApiController extends Controller {
    private final GoodsFeedbackApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private GoodsFeedbackApiController(Config configuration, GoodsFeedbackApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result deleteGoodsFeedbackComment(Http.Request request, Long businessId) throws Exception {
        JsonNode nodedeleteGoodsFeedbackCommentRequest = request.body().asJson();
        DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest;
        if (nodedeleteGoodsFeedbackCommentRequest != null) {
            deleteGoodsFeedbackCommentRequest = mapper.readValue(nodedeleteGoodsFeedbackCommentRequest.toString(), DeleteGoodsFeedbackCommentRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteGoodsFeedbackCommentRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeleteGoodsFeedbackCommentRequest' parameter is required");
        }
        return imp.deleteGoodsFeedbackCommentHttp(request, businessId, deleteGoodsFeedbackCommentRequest);
    }

    @ApiAction
    public Result getGoodsFeedbackComments(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetGoodsFeedbackCommentsRequest = request.body().asJson();
        GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest;
        if (nodegetGoodsFeedbackCommentsRequest != null) {
            getGoodsFeedbackCommentsRequest = mapper.readValue(nodegetGoodsFeedbackCommentsRequest.toString(), GetGoodsFeedbackCommentsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getGoodsFeedbackCommentsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetGoodsFeedbackCommentsRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getGoodsFeedbackCommentsHttp(request, businessId, getGoodsFeedbackCommentsRequest, pageToken, limit);
    }

    @ApiAction
    public Result getGoodsFeedbacks(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetGoodsFeedbackRequest = request.body().asJson();
        GetGoodsFeedbackRequest getGoodsFeedbackRequest;
        if (nodegetGoodsFeedbackRequest != null) {
            getGoodsFeedbackRequest = mapper.readValue(nodegetGoodsFeedbackRequest.toString(), GetGoodsFeedbackRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getGoodsFeedbackRequest);
            }
        } else {
            getGoodsFeedbackRequest = null;
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getGoodsFeedbacksHttp(request, businessId, pageToken, limit, getGoodsFeedbackRequest);
    }

    @ApiAction
    public Result skipGoodsFeedbacksReaction(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeskipGoodsFeedbackReactionRequest = request.body().asJson();
        SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest;
        if (nodeskipGoodsFeedbackReactionRequest != null) {
            skipGoodsFeedbackReactionRequest = mapper.readValue(nodeskipGoodsFeedbackReactionRequest.toString(), SkipGoodsFeedbackReactionRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(skipGoodsFeedbackReactionRequest);
            }
        } else {
            throw new IllegalArgumentException("'SkipGoodsFeedbackReactionRequest' parameter is required");
        }
        return imp.skipGoodsFeedbacksReactionHttp(request, businessId, skipGoodsFeedbackReactionRequest);
    }

    @ApiAction
    public Result updateGoodsFeedbackComment(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeupdateGoodsFeedbackCommentRequest = request.body().asJson();
        UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest;
        if (nodeupdateGoodsFeedbackCommentRequest != null) {
            updateGoodsFeedbackCommentRequest = mapper.readValue(nodeupdateGoodsFeedbackCommentRequest.toString(), UpdateGoodsFeedbackCommentRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateGoodsFeedbackCommentRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateGoodsFeedbackCommentRequest' parameter is required");
        }
        return imp.updateGoodsFeedbackCommentHttp(request, businessId, updateGoodsFeedbackCommentRequest);
    }

}
