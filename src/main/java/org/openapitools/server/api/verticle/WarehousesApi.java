package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetFulfillmentWarehousesResponse;
import org.openapitools.server.api.model.GetWarehousesResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface WarehousesApi  {
    //getFulfillmentWarehouses
    void getFulfillmentWarehouses(Handler<AsyncResult<GetFulfillmentWarehousesResponse>> handler);

    //getWarehouses
    void getWarehouses(Long businessId, Handler<AsyncResult<GetWarehousesResponse>> handler);

}
