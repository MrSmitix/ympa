package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetBidsInfoRequest;
import org.openapitools.server.api.model.GetBidsInfoResponse;
import org.openapitools.server.api.model.GetBidsRecommendationsRequest;
import org.openapitools.server.api.model.GetBidsRecommendationsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PutSkuBidsRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BidsApi  {
    //getBidsInfoForBusiness
    void getBidsInfoForBusiness(Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest, Handler<AsyncResult<GetBidsInfoResponse>> handler);

    //getBidsRecommendations
    void getBidsRecommendations(Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest, Handler<AsyncResult<GetBidsRecommendationsResponse>> handler);

    //putBidsForBusiness
    void putBidsForBusiness(Long businessId, PutSkuBidsRequest putSkuBidsRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //putBidsForCampaign
    void putBidsForCampaign(Long campaignId, PutSkuBidsRequest putSkuBidsRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

}
