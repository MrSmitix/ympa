package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.ConfirmPricesRequest;
import apimodels.EmptyApiResponse;
import apimodels.GetQuarantineOffersRequest;
import apimodels.GetQuarantineOffersResponse;

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
public class PriceQuarantineApiController extends Controller {
    private final PriceQuarantineApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PriceQuarantineApiController(Config configuration, PriceQuarantineApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result confirmBusinessPrices(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeconfirmPricesRequest = request.body().asJson();
        ConfirmPricesRequest confirmPricesRequest;
        if (nodeconfirmPricesRequest != null) {
            confirmPricesRequest = mapper.readValue(nodeconfirmPricesRequest.toString(), ConfirmPricesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(confirmPricesRequest);
            }
        } else {
            throw new IllegalArgumentException("'ConfirmPricesRequest' parameter is required");
        }
        return imp.confirmBusinessPricesHttp(request, businessId, confirmPricesRequest);
    }

    @ApiAction
    public Result confirmCampaignPrices(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeconfirmPricesRequest = request.body().asJson();
        ConfirmPricesRequest confirmPricesRequest;
        if (nodeconfirmPricesRequest != null) {
            confirmPricesRequest = mapper.readValue(nodeconfirmPricesRequest.toString(), ConfirmPricesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(confirmPricesRequest);
            }
        } else {
            throw new IllegalArgumentException("'ConfirmPricesRequest' parameter is required");
        }
        return imp.confirmCampaignPricesHttp(request, campaignId, confirmPricesRequest);
    }

    @ApiAction
    public Result getBusinessQuarantineOffers(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetQuarantineOffersRequest = request.body().asJson();
        GetQuarantineOffersRequest getQuarantineOffersRequest;
        if (nodegetQuarantineOffersRequest != null) {
            getQuarantineOffersRequest = mapper.readValue(nodegetQuarantineOffersRequest.toString(), GetQuarantineOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getQuarantineOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetQuarantineOffersRequest' parameter is required");
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
        return imp.getBusinessQuarantineOffersHttp(request, businessId, getQuarantineOffersRequest, pageToken, limit);
    }

    @ApiAction
    public Result getCampaignQuarantineOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetQuarantineOffersRequest = request.body().asJson();
        GetQuarantineOffersRequest getQuarantineOffersRequest;
        if (nodegetQuarantineOffersRequest != null) {
            getQuarantineOffersRequest = mapper.readValue(nodegetQuarantineOffersRequest.toString(), GetQuarantineOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getQuarantineOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetQuarantineOffersRequest' parameter is required");
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
        return imp.getCampaignQuarantineOffersHttp(request, campaignId, getQuarantineOffersRequest, pageToken, limit);
    }

}
