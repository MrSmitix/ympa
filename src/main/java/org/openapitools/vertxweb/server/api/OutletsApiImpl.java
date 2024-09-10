package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.ChangeOutletRequest;
import org.openapitools.vertxweb.server.model.CreateOutletResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetOutletResponse;
import org.openapitools.vertxweb.server.model.GetOutletsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class OutletsApiImpl implements OutletsApi {
    public Future<ApiResponse<CreateOutletResponse>> createOutlet(Long campaignId, ChangeOutletRequest changeOutletRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> deleteOutlet(Long campaignId, Long outletId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOutletResponse>> getOutlet(Long campaignId, Long outletId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOutletsResponse>> getOutlets(Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> updateOutlet(Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
