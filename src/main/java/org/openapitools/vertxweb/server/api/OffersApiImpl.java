package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.CurrencyType;
import org.openapitools.vertxweb.server.model.DeleteCampaignOffersRequest;
import org.openapitools.vertxweb.server.model.DeleteCampaignOffersResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetAllOffersResponse;
import org.openapitools.vertxweb.server.model.GetCampaignOffersRequest;
import org.openapitools.vertxweb.server.model.GetCampaignOffersResponse;
import org.openapitools.vertxweb.server.model.GetOfferRecommendationsRequest;
import org.openapitools.vertxweb.server.model.GetOfferRecommendationsResponse;
import org.openapitools.vertxweb.server.model.GetOffersResponse;
import org.openapitools.vertxweb.server.model.UpdateCampaignOffersRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class OffersApiImpl implements OffersApi {
    public Future<ApiResponse<DeleteCampaignOffersResponse>> deleteCampaignOffers(Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetAllOffersResponse>> getAllOffers(Long campaignId, Long feedId, Integer chunk) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignOffersResponse>> getCampaignOffers(Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOfferRecommendationsResponse>> getOfferRecommendations(Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOffersResponse>> getOffers(Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> updateCampaignOffers(Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
