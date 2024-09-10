package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.CurrencyType;
import apimodels.DeleteCampaignOffersRequest;
import apimodels.DeleteCampaignOffersResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetAllOffersResponse;
import apimodels.GetCampaignOffersRequest;
import apimodels.GetCampaignOffersResponse;
import apimodels.GetOfferRecommendationsRequest;
import apimodels.GetOfferRecommendationsResponse;
import apimodels.GetOffersResponse;
import apimodels.UpdateCampaignOffersRequest;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class OffersApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result deleteCampaignOffersHttp(Http.Request request, Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        DeleteCampaignOffersResponse obj = deleteCampaignOffers(request, campaignId, deleteCampaignOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteCampaignOffersResponse deleteCampaignOffers(Http.Request request, Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) throws Exception;

    public Result getAllOffersHttp(Http.Request request, Long campaignId, Long feedId, Integer chunk) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetAllOffersResponse obj = getAllOffers(request, campaignId, feedId, chunk);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetAllOffersResponse getAllOffers(Http.Request request, Long campaignId, Long feedId, Integer chunk) throws Exception;

    public Result getCampaignOffersHttp(Http.Request request, Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignOffersResponse obj = getCampaignOffers(request, campaignId, getCampaignOffersRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignOffersResponse getCampaignOffers(Http.Request request, Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) throws Exception;

    public Result getOfferRecommendationsHttp(Http.Request request, Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOfferRecommendationsResponse obj = getOfferRecommendations(request, businessId, getOfferRecommendationsRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOfferRecommendationsResponse getOfferRecommendations(Http.Request request, Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) throws Exception;

    public Result getOffersHttp(Http.Request request, Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOffersResponse obj = getOffers(request, campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOffersResponse getOffers(Http.Request request, Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched,  @Max(10000)Integer page, Integer pageSize) throws Exception;

    public Result updateCampaignOffersHttp(Http.Request request, Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateCampaignOffers(request, campaignId, updateCampaignOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateCampaignOffers(Http.Request request, Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) throws Exception;

}
