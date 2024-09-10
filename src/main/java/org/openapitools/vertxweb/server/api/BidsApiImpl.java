package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetBidsInfoRequest;
import org.openapitools.vertxweb.server.model.GetBidsInfoResponse;
import org.openapitools.vertxweb.server.model.GetBidsRecommendationsRequest;
import org.openapitools.vertxweb.server.model.GetBidsRecommendationsResponse;
import org.openapitools.vertxweb.server.model.PutSkuBidsRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BidsApiImpl implements BidsApi {
    public Future<ApiResponse<GetBidsInfoResponse>> getBidsInfoForBusiness(Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetBidsRecommendationsResponse>> getBidsRecommendations(Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> putBidsForBusiness(Long businessId, PutSkuBidsRequest putSkuBidsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> putBidsForCampaign(Long campaignId, PutSkuBidsRequest putSkuBidsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
