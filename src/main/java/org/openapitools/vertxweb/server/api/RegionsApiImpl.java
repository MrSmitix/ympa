package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetRegionWithChildrenResponse;
import org.openapitools.vertxweb.server.model.GetRegionsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class RegionsApiImpl implements RegionsApi {
    public Future<ApiResponse<GetRegionWithChildrenResponse>> searchRegionChildren(Long regionId, Integer page, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetRegionsResponse>> searchRegionsById(Long regionId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetRegionsResponse>> searchRegionsByName(String name, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

}
