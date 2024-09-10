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

import java.util.List;
import java.util.Map;

public interface RegionsApi  {
    Future<ApiResponse<GetRegionWithChildrenResponse>> searchRegionChildren(Long regionId, Integer page, Integer pageSize);
    Future<ApiResponse<GetRegionsResponse>> searchRegionsById(Long regionId);
    Future<ApiResponse<GetRegionsResponse>> searchRegionsByName(String name, String pageToken, Integer limit);
}
