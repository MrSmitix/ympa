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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedsApiControllerImp extends FeedsApiControllerImpInterface {
    @Override
    public GetFeedResponse getFeed(Http.Request request, Long campaignId, Long feedId) throws Exception {
        //Do your magic!!!
        return new GetFeedResponse();
    }

    @Override
    public GetFeedIndexLogsResponse getFeedIndexLogs(Http.Request request, Long campaignId, Long feedId, Integer limit, OffsetDateTime publishedTimeFrom, OffsetDateTime publishedTimeTo, FeedIndexLogsStatusType status) throws Exception {
        //Do your magic!!!
        return new GetFeedIndexLogsResponse();
    }

    @Override
    public GetFeedsResponse getFeeds(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetFeedsResponse();
    }

    @Override
    public EmptyApiResponse refreshFeed(Http.Request request, Long campaignId, Long feedId) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse setFeedParams(Http.Request request, Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

}
