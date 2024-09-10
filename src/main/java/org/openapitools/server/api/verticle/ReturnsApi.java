package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.server.api.model.GetReturnResponse;
import org.openapitools.server.api.model.GetReturnsResponse;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.RefundStatusType;
import org.openapitools.server.api.model.ReturnType;
import org.openapitools.server.api.model.SetReturnDecisionRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ReturnsApi  {
    //getReturn
    void getReturn(Long campaignId, Long orderId, Long returnId, Handler<AsyncResult<GetReturnResponse>> handler);

    //getReturnApplication
    void getReturnApplication(Long campaignId, Long orderId, Long returnId, Handler<AsyncResult<File>> handler);

    //getReturnPhoto
    void getReturnPhoto(Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash, Handler<AsyncResult<File>> handler);

    //getReturns
    void getReturns(Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2, Handler<AsyncResult<GetReturnsResponse>> handler);

    //setReturnDecision
    void setReturnDecision(Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //submitReturnDecision
    void submitReturnDecision(Long campaignId, Long orderId, Long returnId, Handler<AsyncResult<EmptyApiResponse>> handler);

}
