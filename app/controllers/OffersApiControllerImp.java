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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OffersApiControllerImp extends OffersApiControllerImpInterface {
    @Override
    public DeleteCampaignOffersResponse deleteCampaignOffers(Http.Request request, Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) throws Exception {
        //Do your magic!!!
        return new DeleteCampaignOffersResponse();
    }

    @Override
    public GetAllOffersResponse getAllOffers(Http.Request request, Long campaignId, Long feedId, Integer chunk) throws Exception {
        //Do your magic!!!
        return new GetAllOffersResponse();
    }

    @Override
    public GetCampaignOffersResponse getCampaignOffers(Http.Request request, Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetCampaignOffersResponse();
    }

    @Override
    public GetOfferRecommendationsResponse getOfferRecommendations(Http.Request request, Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetOfferRecommendationsResponse();
    }

    @Override
    public GetOffersResponse getOffers(Http.Request request, Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetOffersResponse();
    }

    @Override
    public EmptyApiResponse updateCampaignOffers(Http.Request request, Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

}
