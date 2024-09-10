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

import java.util.List;
import java.util.Map;

public interface RatingsApi  {
    Future<ApiResponse<GetQualityRatingDetailsResponse>> getQualityRatingDetails(Long campaignId);
    Future<ApiResponse<GetQualityRatingResponse>> getQualityRatings(Long businessId, GetQualityRatingRequest getQualityRatingRequest);
}
