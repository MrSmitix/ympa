package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.GetReturnResponse;
import org.openapitools.vertxweb.server.model.GetReturnsResponse;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.RefundStatusType;
import org.openapitools.vertxweb.server.model.ReturnType;
import org.openapitools.vertxweb.server.model.SetReturnDecisionRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ReturnsApi  {
    Future<ApiResponse<GetReturnResponse>> getReturn(Long campaignId, Long orderId, Long returnId);
    Future<ApiResponse<FileUpload>> getReturnApplication(Long campaignId, Long orderId, Long returnId);
    Future<ApiResponse<FileUpload>> getReturnPhoto(Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash);
    Future<ApiResponse<GetReturnsResponse>> getReturns(Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2);
    Future<ApiResponse<EmptyApiResponse>> setReturnDecision(Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest);
    Future<ApiResponse<EmptyApiResponse>> submitReturnDecision(Long campaignId, Long orderId, Long returnId);
}
