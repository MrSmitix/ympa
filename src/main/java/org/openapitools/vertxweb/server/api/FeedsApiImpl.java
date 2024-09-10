package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.FeedIndexLogsStatusType;
import org.openapitools.vertxweb.server.model.GetFeedIndexLogsResponse;
import org.openapitools.vertxweb.server.model.GetFeedResponse;
import org.openapitools.vertxweb.server.model.GetFeedsResponse;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.SetFeedParamsRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class FeedsApiImpl implements FeedsApi {
    public Future<ApiResponse<GetFeedResponse>> getFeed(Long campaignId, Long feedId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetFeedIndexLogsResponse>> getFeedIndexLogs(Long campaignId, Long feedId, Integer limit, OffsetDateTime publishedTimeFrom, OffsetDateTime publishedTimeTo, FeedIndexLogsStatusType status) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetFeedsResponse>> getFeeds(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> refreshFeed(Long campaignId, Long feedId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> setFeedParams(Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
