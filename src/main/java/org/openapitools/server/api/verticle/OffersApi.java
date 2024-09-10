package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.CurrencyType;
import org.openapitools.server.api.model.DeleteCampaignOffersRequest;
import org.openapitools.server.api.model.DeleteCampaignOffersResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetAllOffersResponse;
import org.openapitools.server.api.model.GetCampaignOffersRequest;
import org.openapitools.server.api.model.GetCampaignOffersResponse;
import org.openapitools.server.api.model.GetOfferRecommendationsRequest;
import org.openapitools.server.api.model.GetOfferRecommendationsResponse;
import org.openapitools.server.api.model.GetOffersResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateCampaignOffersRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface OffersApi  {
    //deleteCampaignOffers
    void deleteCampaignOffers(Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest, Handler<AsyncResult<DeleteCampaignOffersResponse>> handler);

    //getAllOffers
    void getAllOffers(Long campaignId, Long feedId, Integer chunk, Handler<AsyncResult<GetAllOffersResponse>> handler);

    //getCampaignOffers
    void getCampaignOffers(Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit, Handler<AsyncResult<GetCampaignOffersResponse>> handler);

    //getOfferRecommendations
    void getOfferRecommendations(Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit, Handler<AsyncResult<GetOfferRecommendationsResponse>> handler);

    //getOffers
    void getOffers(Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize, Handler<AsyncResult<GetOffersResponse>> handler);

    //updateCampaignOffers
    void updateCampaignOffers(Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

}
