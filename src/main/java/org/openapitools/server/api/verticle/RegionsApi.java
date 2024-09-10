package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetRegionWithChildrenResponse;
import org.openapitools.server.api.model.GetRegionsResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface RegionsApi  {
    //searchRegionChildren
    void searchRegionChildren(Long regionId, Integer page, Integer pageSize, Handler<AsyncResult<GetRegionWithChildrenResponse>> handler);

    //searchRegionsById
    void searchRegionsById(Long regionId, Handler<AsyncResult<GetRegionsResponse>> handler);

    //searchRegionsByName
    void searchRegionsByName(String name, String pageToken, Integer limit, Handler<AsyncResult<GetRegionsResponse>> handler);

}
