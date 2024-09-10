package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.FeedIndexLogsStatusType;
import apimodels.GetFeedIndexLogsResponse;
import apimodels.GetFeedResponse;
import apimodels.GetFeedsResponse;
import java.time.OffsetDateTime;
import apimodels.SetFeedParamsRequest;

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
public class FeedsApiController extends Controller {
    private final FeedsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private FeedsApiController(Config configuration, FeedsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getFeed(Http.Request request, Long campaignId,Long feedId) throws Exception {
        return imp.getFeedHttp(request, campaignId, feedId);
    }

    @ApiAction
    public Result getFeedIndexLogs(Http.Request request, Long campaignId,Long feedId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuepublishedTimeFrom = request.getQueryString("published_time_from");
        OffsetDateTime publishedTimeFrom;
        if (valuepublishedTimeFrom != null) {
            publishedTimeFrom = OffsetDateTime.parse(valuepublishedTimeFrom);
        } else {
            publishedTimeFrom = null;
        }
        String valuepublishedTimeTo = request.getQueryString("published_time_to");
        OffsetDateTime publishedTimeTo;
        if (valuepublishedTimeTo != null) {
            publishedTimeTo = OffsetDateTime.parse(valuepublishedTimeTo);
        } else {
            publishedTimeTo = null;
        }
        String valuestatus = request.getQueryString("status");
        FeedIndexLogsStatusType status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            status = null;
        }
        return imp.getFeedIndexLogsHttp(request, campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status);
    }

    @ApiAction
    public Result getFeeds(Http.Request request, Long campaignId) throws Exception {
        return imp.getFeedsHttp(request, campaignId);
    }

    @ApiAction
    public Result refreshFeed(Http.Request request, Long campaignId,Long feedId) throws Exception {
        return imp.refreshFeedHttp(request, campaignId, feedId);
    }

    @ApiAction
    public Result setFeedParams(Http.Request request, Long campaignId,Long feedId) throws Exception {
        JsonNode nodesetFeedParamsRequest = request.body().asJson();
        SetFeedParamsRequest setFeedParamsRequest;
        if (nodesetFeedParamsRequest != null) {
            setFeedParamsRequest = mapper.readValue(nodesetFeedParamsRequest.toString(), SetFeedParamsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setFeedParamsRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetFeedParamsRequest' parameter is required");
        }
        return imp.setFeedParamsHttp(request, campaignId, feedId, setFeedParamsRequest);
    }

}
