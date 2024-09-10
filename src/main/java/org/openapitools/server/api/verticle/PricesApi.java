package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetPricesByOfferIdsRequest;
import org.openapitools.server.api.model.GetPricesByOfferIdsResponse;
import org.openapitools.server.api.model.GetPricesResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SuggestPricesRequest;
import org.openapitools.server.api.model.SuggestPricesResponse;
import org.openapitools.server.api.model.UpdateBusinessPricesRequest;
import org.openapitools.server.api.model.UpdatePricesRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PricesApi  {
    //getPrices
    void getPrices(Long campaignId, String pageToken, Integer limit, Boolean archived, Handler<AsyncResult<GetPricesResponse>> handler);

    //getPricesByOfferIds
    void getPricesByOfferIds(Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest, Handler<AsyncResult<GetPricesByOfferIdsResponse>> handler);

    //getSuggestedPrices
    void getSuggestedPrices(Long campaignId, SuggestPricesRequest suggestPricesRequest, Handler<AsyncResult<SuggestPricesResponse>> handler);

    //updateBusinessPrices
    void updateBusinessPrices(Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //updatePrices
    void updatePrices(Long campaignId, UpdatePricesRequest updatePricesRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

}
