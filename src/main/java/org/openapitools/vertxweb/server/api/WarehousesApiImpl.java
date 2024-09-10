package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetFulfillmentWarehousesResponse;
import org.openapitools.vertxweb.server.model.GetWarehousesResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class WarehousesApiImpl implements WarehousesApi {
    public Future<ApiResponse<GetFulfillmentWarehousesResponse>> getFulfillmentWarehouses() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetWarehousesResponse>> getWarehouses(Long businessId) {
        return Future.failedFuture(new HttpException(501));
    }

}
