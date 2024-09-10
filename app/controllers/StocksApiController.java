package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetWarehouseStocksRequest;
import apimodels.GetWarehouseStocksResponse;
import apimodels.UpdateStocksRequest;

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
public class StocksApiController extends Controller {
    private final StocksApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private StocksApiController(Config configuration, StocksApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getStocks(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetWarehouseStocksRequest = request.body().asJson();
        GetWarehouseStocksRequest getWarehouseStocksRequest;
        if (nodegetWarehouseStocksRequest != null) {
            getWarehouseStocksRequest = mapper.readValue(nodegetWarehouseStocksRequest.toString(), GetWarehouseStocksRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getWarehouseStocksRequest);
            }
        } else {
            getWarehouseStocksRequest = null;
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
        return imp.getStocksHttp(request, campaignId, pageToken, limit, getWarehouseStocksRequest);
    }

    @ApiAction
    public Result updateStocks(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdateStocksRequest = request.body().asJson();
        UpdateStocksRequest updateStocksRequest;
        if (nodeupdateStocksRequest != null) {
            updateStocksRequest = mapper.readValue(nodeupdateStocksRequest.toString(), UpdateStocksRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateStocksRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateStocksRequest' parameter is required");
        }
        return imp.updateStocksHttp(request, campaignId, updateStocksRequest);
    }

}
