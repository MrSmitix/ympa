package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetPricesByOfferIdsRequest;
import apimodels.GetPricesByOfferIdsResponse;
import apimodels.GetPricesResponse;
import apimodels.SuggestPricesRequest;
import apimodels.SuggestPricesResponse;
import apimodels.UpdateBusinessPricesRequest;
import apimodels.UpdatePricesRequest;

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
public class PricesApiController extends Controller {
    private final PricesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PricesApiController(Config configuration, PricesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getPrices(Http.Request request, Long campaignId) throws Exception {
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
        String valuearchived = request.getQueryString("archived");
        Boolean archived;
        if (valuearchived != null) {
            archived = Boolean.valueOf(valuearchived);
        } else {
            archived = false;
        }
        return imp.getPricesHttp(request, campaignId, pageToken, limit, archived);
    }

    @ApiAction
    public Result getPricesByOfferIds(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetPricesByOfferIdsRequest = request.body().asJson();
        GetPricesByOfferIdsRequest getPricesByOfferIdsRequest;
        if (nodegetPricesByOfferIdsRequest != null) {
            getPricesByOfferIdsRequest = mapper.readValue(nodegetPricesByOfferIdsRequest.toString(), GetPricesByOfferIdsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getPricesByOfferIdsRequest);
            }
        } else {
            getPricesByOfferIdsRequest = null;
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
        return imp.getPricesByOfferIdsHttp(request, campaignId, pageToken, limit, getPricesByOfferIdsRequest);
    }

    @ApiAction
    public Result getSuggestedPrices(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodesuggestPricesRequest = request.body().asJson();
        SuggestPricesRequest suggestPricesRequest;
        if (nodesuggestPricesRequest != null) {
            suggestPricesRequest = mapper.readValue(nodesuggestPricesRequest.toString(), SuggestPricesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(suggestPricesRequest);
            }
        } else {
            throw new IllegalArgumentException("'SuggestPricesRequest' parameter is required");
        }
        return imp.getSuggestedPricesHttp(request, campaignId, suggestPricesRequest);
    }

    @ApiAction
    public Result updateBusinessPrices(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeupdateBusinessPricesRequest = request.body().asJson();
        UpdateBusinessPricesRequest updateBusinessPricesRequest;
        if (nodeupdateBusinessPricesRequest != null) {
            updateBusinessPricesRequest = mapper.readValue(nodeupdateBusinessPricesRequest.toString(), UpdateBusinessPricesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateBusinessPricesRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateBusinessPricesRequest' parameter is required");
        }
        return imp.updateBusinessPricesHttp(request, businessId, updateBusinessPricesRequest);
    }

    @ApiAction
    public Result updatePrices(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdatePricesRequest = request.body().asJson();
        UpdatePricesRequest updatePricesRequest;
        if (nodeupdatePricesRequest != null) {
            updatePricesRequest = mapper.readValue(nodeupdatePricesRequest.toString(), UpdatePricesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updatePricesRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdatePricesRequest' parameter is required");
        }
        return imp.updatePricesHttp(request, campaignId, updatePricesRequest);
    }

}
