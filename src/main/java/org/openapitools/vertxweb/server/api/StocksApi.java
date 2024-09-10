package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetWarehouseStocksRequest;
import org.openapitools.vertxweb.server.model.GetWarehouseStocksResponse;
import org.openapitools.vertxweb.server.model.UpdateStocksRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface StocksApi  {
    Future<ApiResponse<GetWarehouseStocksResponse>> getStocks(Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest);
    Future<ApiResponse<EmptyApiResponse>> updateStocks(Long campaignId, UpdateStocksRequest updateStocksRequest);
}
