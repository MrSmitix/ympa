package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import java.io.File;
import org.openapitools.server.api.model.GetOrderLabelsDataResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PageFormatType;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface OrderLabelsApi  {
    //generateOrderLabel
    void generateOrderLabel(Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format, Handler<AsyncResult<File>> handler);

    //generateOrderLabels
    void generateOrderLabels(Long campaignId, Long orderId, PageFormatType format, Handler<AsyncResult<File>> handler);

    //getOrderLabelsData
    void getOrderLabelsData(Long campaignId, Long orderId, Handler<AsyncResult<GetOrderLabelsDataResponse>> handler);

}
