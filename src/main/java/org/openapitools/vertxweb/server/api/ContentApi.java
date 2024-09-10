package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetCategoryContentParametersResponse;
import org.openapitools.vertxweb.server.model.GetOfferCardsContentStatusRequest;
import org.openapitools.vertxweb.server.model.GetOfferCardsContentStatusResponse;
import org.openapitools.vertxweb.server.model.UpdateOfferContentRequest;
import org.openapitools.vertxweb.server.model.UpdateOfferContentResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ContentApi  {
    Future<ApiResponse<GetCategoryContentParametersResponse>> getCategoryContentParameters(Long categoryId);
    Future<ApiResponse<GetOfferCardsContentStatusResponse>> getOfferCardsContentStatus(Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest);
    Future<ApiResponse<UpdateOfferContentResponse>> updateOfferContent(Long businessId, UpdateOfferContentRequest updateOfferContentRequest);
}
