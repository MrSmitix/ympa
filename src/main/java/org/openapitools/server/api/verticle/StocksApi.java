package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetWarehouseStocksRequest;
import org.openapitools.server.api.model.GetWarehouseStocksResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateStocksRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface StocksApi  {
    //getStocks
    void getStocks(Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest, Handler<AsyncResult<GetWarehouseStocksResponse>> handler);

    //updateStocks
    void updateStocks(Long campaignId, UpdateStocksRequest updateStocksRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

}
