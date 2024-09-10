package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetOrderBuyerInfoResponse;
import org.openapitools.vertxweb.server.model.SetOrderDeliveryDateRequest;
import org.openapitools.vertxweb.server.model.SetOrderDeliveryTrackCodeRequest;
import org.openapitools.vertxweb.server.model.UpdateOrderStorageLimitRequest;
import org.openapitools.vertxweb.server.model.VerifyOrderEacRequest;
import org.openapitools.vertxweb.server.model.VerifyOrderEacResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface OrderDeliveryApi  {
    Future<ApiResponse<GetOrderBuyerInfoResponse>> getOrderBuyerInfo(Long campaignId, Long orderId);
    Future<ApiResponse<EmptyApiResponse>> setOrderDeliveryDate(Long campaignId, Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest);
    Future<ApiResponse<EmptyApiResponse>> setOrderDeliveryTrackCode(Long campaignId, Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest);
    Future<ApiResponse<EmptyApiResponse>> updateOrderStorageLimit(Long campaignId, Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest);
    Future<ApiResponse<VerifyOrderEacResponse>> verifyOrderEac(Long campaignId, Long orderId, VerifyOrderEacRequest verifyOrderEacRequest);
}
