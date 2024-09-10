package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOrderBuyerInfoResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SetOrderDeliveryDateRequest;
import org.openapitools.server.api.model.SetOrderDeliveryTrackCodeRequest;
import org.openapitools.server.api.model.UpdateOrderStorageLimitRequest;
import org.openapitools.server.api.model.VerifyOrderEacRequest;
import org.openapitools.server.api.model.VerifyOrderEacResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface OrderDeliveryApi  {
    //getOrderBuyerInfo
    void getOrderBuyerInfo(Long campaignId, Long orderId, Handler<AsyncResult<GetOrderBuyerInfoResponse>> handler);

    //setOrderDeliveryDate
    void setOrderDeliveryDate(Long campaignId, Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //setOrderDeliveryTrackCode
    void setOrderDeliveryTrackCode(Long campaignId, Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //updateOrderStorageLimit
    void updateOrderStorageLimit(Long campaignId, Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //verifyOrderEac
    void verifyOrderEac(Long campaignId, Long orderId, VerifyOrderEacRequest verifyOrderEacRequest, Handler<AsyncResult<VerifyOrderEacResponse>> handler);

}
