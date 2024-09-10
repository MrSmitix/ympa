package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetQualityRatingDetailsResponse;
import org.openapitools.server.api.model.GetQualityRatingRequest;
import org.openapitools.server.api.model.GetQualityRatingResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface RatingsApi  {
    //getQualityRatingDetails
    void getQualityRatingDetails(Long campaignId, Handler<AsyncResult<GetQualityRatingDetailsResponse>> handler);

    //getQualityRatings
    void getQualityRatings(Long businessId, GetQualityRatingRequest getQualityRatingRequest, Handler<AsyncResult<GetQualityRatingResponse>> handler);

}
