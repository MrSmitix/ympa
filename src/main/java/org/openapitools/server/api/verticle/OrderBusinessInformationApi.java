package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetBusinessBuyerInfoResponse;
import org.openapitools.server.api.model.GetBusinessDocumentsInfoResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface OrderBusinessInformationApi  {
    //getOrderBusinessBuyerInfo
    void getOrderBusinessBuyerInfo(Long campaignId, Long orderId, Handler<AsyncResult<GetBusinessBuyerInfoResponse>> handler);

    //getOrderBusinessDocumentsInfo
    void getOrderBusinessDocumentsInfo(Long campaignId, Long orderId, Handler<AsyncResult<GetBusinessDocumentsInfoResponse>> handler);

}
