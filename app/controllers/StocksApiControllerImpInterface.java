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
public abstract class StocksApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getStocksHttp(Http.Request request, Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetWarehouseStocksResponse obj = getStocks(request, campaignId, pageToken, limit, getWarehouseStocksRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetWarehouseStocksResponse getStocks(Http.Request request, Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) throws Exception;

    public Result updateStocksHttp(Http.Request request, Long campaignId, UpdateStocksRequest updateStocksRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateStocks(request, campaignId, updateStocksRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateStocks(Http.Request request, Long campaignId, UpdateStocksRequest updateStocksRequest) throws Exception;

}
