package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetBidsInfoRequest;
import apimodels.GetBidsInfoResponse;
import apimodels.GetBidsRecommendationsRequest;
import apimodels.GetBidsRecommendationsResponse;
import apimodels.PutSkuBidsRequest;

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
public class BidsApiController extends Controller {
    private final BidsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BidsApiController(Config configuration, BidsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getBidsInfoForBusiness(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetBidsInfoRequest = request.body().asJson();
        GetBidsInfoRequest getBidsInfoRequest;
        if (nodegetBidsInfoRequest != null) {
            getBidsInfoRequest = mapper.readValue(nodegetBidsInfoRequest.toString(), GetBidsInfoRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getBidsInfoRequest);
            }
        } else {
            getBidsInfoRequest = null;
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
        return imp.getBidsInfoForBusinessHttp(request, businessId, pageToken, limit, getBidsInfoRequest);
    }

    @ApiAction
    public Result getBidsRecommendations(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetBidsRecommendationsRequest = request.body().asJson();
        GetBidsRecommendationsRequest getBidsRecommendationsRequest;
        if (nodegetBidsRecommendationsRequest != null) {
            getBidsRecommendationsRequest = mapper.readValue(nodegetBidsRecommendationsRequest.toString(), GetBidsRecommendationsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getBidsRecommendationsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetBidsRecommendationsRequest' parameter is required");
        }
        return imp.getBidsRecommendationsHttp(request, businessId, getBidsRecommendationsRequest);
    }

    @ApiAction
    public Result putBidsForBusiness(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeputSkuBidsRequest = request.body().asJson();
        PutSkuBidsRequest putSkuBidsRequest;
        if (nodeputSkuBidsRequest != null) {
            putSkuBidsRequest = mapper.readValue(nodeputSkuBidsRequest.toString(), PutSkuBidsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(putSkuBidsRequest);
            }
        } else {
            throw new IllegalArgumentException("'PutSkuBidsRequest' parameter is required");
        }
        return imp.putBidsForBusinessHttp(request, businessId, putSkuBidsRequest);
    }

    @ApiAction
    public Result putBidsForCampaign(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeputSkuBidsRequest = request.body().asJson();
        PutSkuBidsRequest putSkuBidsRequest;
        if (nodeputSkuBidsRequest != null) {
            putSkuBidsRequest = mapper.readValue(nodeputSkuBidsRequest.toString(), PutSkuBidsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(putSkuBidsRequest);
            }
        } else {
            throw new IllegalArgumentException("'PutSkuBidsRequest' parameter is required");
        }
        return imp.putBidsForCampaignHttp(request, campaignId, putSkuBidsRequest);
    }

}
