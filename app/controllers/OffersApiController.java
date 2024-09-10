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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OffersApiController extends Controller {
    private final OffersApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OffersApiController(Config configuration, OffersApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result deleteCampaignOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodedeleteCampaignOffersRequest = request.body().asJson();
        DeleteCampaignOffersRequest deleteCampaignOffersRequest;
        if (nodedeleteCampaignOffersRequest != null) {
            deleteCampaignOffersRequest = mapper.readValue(nodedeleteCampaignOffersRequest.toString(), DeleteCampaignOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteCampaignOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeleteCampaignOffersRequest' parameter is required");
        }
        return imp.deleteCampaignOffersHttp(request, campaignId, deleteCampaignOffersRequest);
    }

    @ApiAction
    public Result getAllOffers(Http.Request request, Long campaignId) throws Exception {
        String valuefeedId = request.getQueryString("feedId");
        Long feedId;
        if (valuefeedId != null) {
            feedId = Long.parseLong(valuefeedId);
        } else {
            feedId = null;
        }
        String valuechunk = request.getQueryString("chunk");
        Integer chunk;
        if (valuechunk != null) {
            chunk = Integer.parseInt(valuechunk);
        } else {
            chunk = null;
        }
        return imp.getAllOffersHttp(request, campaignId, feedId, chunk);
    }

    @ApiAction
    public Result getCampaignOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetCampaignOffersRequest = request.body().asJson();
        GetCampaignOffersRequest getCampaignOffersRequest;
        if (nodegetCampaignOffersRequest != null) {
            getCampaignOffersRequest = mapper.readValue(nodegetCampaignOffersRequest.toString(), GetCampaignOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getCampaignOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetCampaignOffersRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getCampaignOffersHttp(request, campaignId, getCampaignOffersRequest, pageToken, limit);
    }

    @ApiAction
    public Result getOfferRecommendations(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetOfferRecommendationsRequest = request.body().asJson();
        GetOfferRecommendationsRequest getOfferRecommendationsRequest;
        if (nodegetOfferRecommendationsRequest != null) {
            getOfferRecommendationsRequest = mapper.readValue(nodegetOfferRecommendationsRequest.toString(), GetOfferRecommendationsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getOfferRecommendationsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetOfferRecommendationsRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getOfferRecommendationsHttp(request, businessId, getOfferRecommendationsRequest, pageToken, limit);
    }

    @ApiAction
    public Result getOffers(Http.Request request, Long campaignId) throws Exception {
        String valuequery = request.getQueryString("query");
        String query;
        if (valuequery != null) {
            query = valuequery;
        } else {
            query = null;
        }
        String valuefeedId = request.getQueryString("feedId");
        Long feedId;
        if (valuefeedId != null) {
            feedId = Long.parseLong(valuefeedId);
        } else {
            feedId = null;
        }
        String valueshopCategoryId = request.getQueryString("shopCategoryId");
        String shopCategoryId;
        if (valueshopCategoryId != null) {
            shopCategoryId = valueshopCategoryId;
        } else {
            shopCategoryId = null;
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        String valuematched = request.getQueryString("matched");
        Boolean matched;
        if (valuematched != null) {
            matched = Boolean.valueOf(valuematched);
        } else {
            matched = null;
        }
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        String valuepageSize = request.getQueryString("pageSize");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = null;
        }
        return imp.getOffersHttp(request, campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize);
    }

    @ApiAction
    public Result updateCampaignOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdateCampaignOffersRequest = request.body().asJson();
        UpdateCampaignOffersRequest updateCampaignOffersRequest;
        if (nodeupdateCampaignOffersRequest != null) {
            updateCampaignOffersRequest = mapper.readValue(nodeupdateCampaignOffersRequest.toString(), UpdateCampaignOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateCampaignOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateCampaignOffersRequest' parameter is required");
        }
        return imp.updateCampaignOffersHttp(request, campaignId, updateCampaignOffersRequest);
    }

}
