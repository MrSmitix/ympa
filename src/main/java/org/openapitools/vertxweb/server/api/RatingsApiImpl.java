package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetQualityRatingDetailsResponse;
import org.openapitools.vertxweb.server.model.GetQualityRatingRequest;
import org.openapitools.vertxweb.server.model.GetQualityRatingResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class RatingsApiImpl implements RatingsApi {
    public Future<ApiResponse<GetQualityRatingDetailsResponse>> getQualityRatingDetails(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetQualityRatingResponse>> getQualityRatings(Long businessId, GetQualityRatingRequest getQualityRatingRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
