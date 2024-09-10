package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.ConfirmPricesRequest;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetQuarantineOffersRequest;
import org.openapitools.server.api.model.GetQuarantineOffersResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PriceQuarantineApi  {
    //confirmBusinessPrices
    void confirmBusinessPrices(Long businessId, ConfirmPricesRequest confirmPricesRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //confirmCampaignPrices
    void confirmCampaignPrices(Long campaignId, ConfirmPricesRequest confirmPricesRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //getBusinessQuarantineOffers
    void getBusinessQuarantineOffers(Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, Handler<AsyncResult<GetQuarantineOffersResponse>> handler);

    //getCampaignQuarantineOffers
    void getCampaignQuarantineOffers(Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, Handler<AsyncResult<GetQuarantineOffersResponse>> handler);

}
