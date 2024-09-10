package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetCategoryContentParametersResponse;
import org.openapitools.server.api.model.GetOfferCardsContentStatusRequest;
import org.openapitools.server.api.model.GetOfferCardsContentStatusResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateOfferContentRequest;
import org.openapitools.server.api.model.UpdateOfferContentResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ContentApi  {
    //getCategoryContentParameters
    void getCategoryContentParameters(Long categoryId, Handler<AsyncResult<GetCategoryContentParametersResponse>> handler);

    //getOfferCardsContentStatus
    void getOfferCardsContentStatus(Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest, Handler<AsyncResult<GetOfferCardsContentStatusResponse>> handler);

    //updateOfferContent
    void updateOfferContent(Long businessId, UpdateOfferContentRequest updateOfferContentRequest, Handler<AsyncResult<UpdateOfferContentResponse>> handler);

}
