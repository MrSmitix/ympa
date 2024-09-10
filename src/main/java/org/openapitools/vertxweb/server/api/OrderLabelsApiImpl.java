package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.GetOrderLabelsDataResponse;
import org.openapitools.vertxweb.server.model.PageFormatType;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class OrderLabelsApiImpl implements OrderLabelsApi {
    public Future<ApiResponse<FileUpload>> generateOrderLabel(Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FileUpload>> generateOrderLabels(Long campaignId, Long orderId, PageFormatType format) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOrderLabelsDataResponse>> getOrderLabelsData(Long campaignId, Long orderId) {
        return Future.failedFuture(new HttpException(501));
    }

}
