package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOutletLicensesResponse;
import org.openapitools.server.api.MainApiException;
import java.util.Set;
import org.openapitools.server.api.model.UpdateOutletLicenseRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface OutletLicensesApi  {
    //deleteOutletLicenses
    void deleteOutletLicenses(Long campaignId, Set<Long> ids, Handler<AsyncResult<EmptyApiResponse>> handler);

    //getOutletLicenses
    void getOutletLicenses(Long campaignId, Set<Long> outletIds, Set<Long> ids, Handler<AsyncResult<GetOutletLicensesResponse>> handler);

    //updateOutletLicenses
    void updateOutletLicenses(Long campaignId, UpdateOutletLicenseRequest updateOutletLicenseRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

}
