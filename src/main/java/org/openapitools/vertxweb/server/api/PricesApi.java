package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetPricesByOfferIdsRequest;
import org.openapitools.vertxweb.server.model.GetPricesByOfferIdsResponse;
import org.openapitools.vertxweb.server.model.GetPricesResponse;
import org.openapitools.vertxweb.server.model.SuggestPricesRequest;
import org.openapitools.vertxweb.server.model.SuggestPricesResponse;
import org.openapitools.vertxweb.server.model.UpdateBusinessPricesRequest;
import org.openapitools.vertxweb.server.model.UpdatePricesRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface PricesApi  {
    Future<ApiResponse<GetPricesResponse>> getPrices(Long campaignId, String pageToken, Integer limit, Boolean archived);
    Future<ApiResponse<GetPricesByOfferIdsResponse>> getPricesByOfferIds(Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest);
    Future<ApiResponse<SuggestPricesResponse>> getSuggestedPrices(Long campaignId, SuggestPricesRequest suggestPricesRequest);
    Future<ApiResponse<EmptyApiResponse>> updateBusinessPrices(Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest);
    Future<ApiResponse<EmptyApiResponse>> updatePrices(Long campaignId, UpdatePricesRequest updatePricesRequest);
}
