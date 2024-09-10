package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetOutletLicensesResponse;
import java.util.Set;
import org.openapitools.vertxweb.server.model.UpdateOutletLicenseRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class OutletLicensesApiImpl implements OutletLicensesApi {
    public Future<ApiResponse<EmptyApiResponse>> deleteOutletLicenses(Long campaignId, Set<Long> ids) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOutletLicensesResponse>> getOutletLicenses(Long campaignId, Set<Long> outletIds, Set<Long> ids) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> updateOutletLicenses(Long campaignId, UpdateOutletLicenseRequest updateOutletLicenseRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
