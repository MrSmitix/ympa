package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AddHiddenOffersRequest;
import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.DeleteHiddenOffersRequest;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetHiddenOffersResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface HiddenOffersApi  {
    //addHiddenOffers
    void addHiddenOffers(Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //deleteHiddenOffers
    void deleteHiddenOffers(Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //getHiddenOffers
    void getHiddenOffers(Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize, Handler<AsyncResult<GetHiddenOffersResponse>> handler);

}
