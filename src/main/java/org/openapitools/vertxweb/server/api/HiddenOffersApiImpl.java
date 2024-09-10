package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AddHiddenOffersRequest;
import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.DeleteHiddenOffersRequest;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetHiddenOffersResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class HiddenOffersApiImpl implements HiddenOffersApi {
    public Future<ApiResponse<EmptyApiResponse>> addHiddenOffers(Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> deleteHiddenOffers(Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetHiddenOffersResponse>> getHiddenOffers(Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

}
