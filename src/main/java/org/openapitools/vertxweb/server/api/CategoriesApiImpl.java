package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.vertxweb.server.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.vertxweb.server.model.GetCategoriesRequest;
import org.openapitools.vertxweb.server.model.GetCategoriesResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CategoriesApiImpl implements CategoriesApi {
    public Future<ApiResponse<GetCategoriesMaxSaleQuantumResponse>> getCategoriesMaxSaleQuantum(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCategoriesResponse>> getCategoriesTree(GetCategoriesRequest getCategoriesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
