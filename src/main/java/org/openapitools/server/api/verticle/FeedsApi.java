package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.FeedIndexLogsStatusType;
import org.openapitools.server.api.model.GetFeedIndexLogsResponse;
import org.openapitools.server.api.model.GetFeedResponse;
import org.openapitools.server.api.model.GetFeedsResponse;
import org.openapitools.server.api.MainApiException;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.SetFeedParamsRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface FeedsApi  {
    //getFeed
    void getFeed(Long campaignId, Long feedId, Handler<AsyncResult<GetFeedResponse>> handler);

    //getFeedIndexLogs
    void getFeedIndexLogs(Long campaignId, Long feedId, Integer limit, OffsetDateTime publishedTimeFrom, OffsetDateTime publishedTimeTo, FeedIndexLogsStatusType status, Handler<AsyncResult<GetFeedIndexLogsResponse>> handler);

    //getFeeds
    void getFeeds(Long campaignId, Handler<AsyncResult<GetFeedsResponse>> handler);

    //refreshFeed
    void refreshFeed(Long campaignId, Long feedId, Handler<AsyncResult<EmptyApiResponse>> handler);

    //setFeedParams
    void setFeedParams(Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

}
