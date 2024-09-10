package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.ConfirmPricesRequest;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetQuarantineOffersRequest;
import org.openapitools.vertxweb.server.model.GetQuarantineOffersResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface PriceQuarantineApi  {
    Future<ApiResponse<EmptyApiResponse>> confirmBusinessPrices(Long businessId, ConfirmPricesRequest confirmPricesRequest);
    Future<ApiResponse<EmptyApiResponse>> confirmCampaignPrices(Long campaignId, ConfirmPricesRequest confirmPricesRequest);
    Future<ApiResponse<GetQuarantineOffersResponse>> getBusinessQuarantineOffers(Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit);
    Future<ApiResponse<GetQuarantineOffersResponse>> getCampaignQuarantineOffers(Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit);
}
