package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.CurrencyType;
import apimodels.GetModelsOffersResponse;
import apimodels.GetModelsRequest;
import apimodels.GetModelsResponse;
import apimodels.SearchModelsResponse;
import apimodels.SortOrderType;

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
public class ModelsApiController extends Controller {
    private final ModelsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ModelsApiController(Config configuration, ModelsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getModel(Http.Request request,  @Min(0)Long modelId) throws Exception {
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        return imp.getModelHttp(request, modelId, regionId, currency);
    }

    @ApiAction
    public Result getModelOffers(Http.Request request,  @Min(0)Long modelId) throws Exception {
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        String valueorderByPrice = request.getQueryString("orderByPrice");
        SortOrderType orderByPrice;
        if (valueorderByPrice != null) {
            orderByPrice = valueorderByPrice;
        } else {
            orderByPrice = null;
        }
        String valuecount = request.getQueryString("count");
        Integer count;
        if (valuecount != null) {
            count = Integer.parseInt(valuecount);
        } else {
            count = 10;
        }
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        return imp.getModelOffersHttp(request, modelId, regionId, currency, orderByPrice, count, page);
    }

    @ApiAction
    public Result getModels(Http.Request request) throws Exception {
        JsonNode nodegetModelsRequest = request.body().asJson();
        GetModelsRequest getModelsRequest;
        if (nodegetModelsRequest != null) {
            getModelsRequest = mapper.readValue(nodegetModelsRequest.toString(), GetModelsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getModelsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetModelsRequest' parameter is required");
        }
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        return imp.getModelsHttp(request, regionId, getModelsRequest, currency);
    }

    @ApiAction
    public Result getModelsOffers(Http.Request request) throws Exception {
        JsonNode nodegetModelsRequest = request.body().asJson();
        GetModelsRequest getModelsRequest;
        if (nodegetModelsRequest != null) {
            getModelsRequest = mapper.readValue(nodegetModelsRequest.toString(), GetModelsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getModelsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetModelsRequest' parameter is required");
        }
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
        }
        String valueorderByPrice = request.getQueryString("orderByPrice");
        SortOrderType orderByPrice;
        if (valueorderByPrice != null) {
            orderByPrice = valueorderByPrice;
        } else {
            orderByPrice = null;
        }
        return imp.getModelsOffersHttp(request, regionId, getModelsRequest, currency, orderByPrice);
    }

    @ApiAction
    public Result searchModels(Http.Request request) throws Exception {
        String valuequery = request.getQueryString("query");
        String query;
        if (valuequery != null) {
            query = valuequery;
        } else {
            throw new IllegalArgumentException("'query' parameter is required");
        }
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valuecurrency = request.getQueryString("currency");
        CurrencyType currency;
        if (valuecurrency != null) {
            currency = valuecurrency;
        } else {
            currency = null;
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
        return imp.searchModelsHttp(request, query, regionId, currency, page, pageSize);
    }

}
