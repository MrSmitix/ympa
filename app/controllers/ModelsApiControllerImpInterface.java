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
public abstract class ModelsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getModelHttp(Http.Request request,  @Min(0)Long modelId, @NotNull Long regionId, CurrencyType currency) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetModelsResponse obj = getModel(request, modelId, regionId, currency);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetModelsResponse getModel(Http.Request request,  @Min(0)Long modelId, @NotNull Long regionId, CurrencyType currency) throws Exception;

    public Result getModelOffersHttp(Http.Request request,  @Min(0)Long modelId, @NotNull Long regionId, CurrencyType currency, SortOrderType orderByPrice, Integer count,  @Max(10000)Integer page) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetModelsOffersResponse obj = getModelOffers(request, modelId, regionId, currency, orderByPrice, count, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetModelsOffersResponse getModelOffers(Http.Request request,  @Min(0)Long modelId, @NotNull Long regionId, CurrencyType currency, SortOrderType orderByPrice, Integer count,  @Max(10000)Integer page) throws Exception;

    public Result getModelsHttp(Http.Request request, @NotNull Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetModelsResponse obj = getModels(request, regionId, getModelsRequest, currency);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetModelsResponse getModels(Http.Request request, @NotNull Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency) throws Exception;

    public Result getModelsOffersHttp(Http.Request request, @NotNull Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, SortOrderType orderByPrice) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetModelsOffersResponse obj = getModelsOffers(request, regionId, getModelsRequest, currency, orderByPrice);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetModelsOffersResponse getModelsOffers(Http.Request request, @NotNull Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, SortOrderType orderByPrice) throws Exception;

    public Result searchModelsHttp(Http.Request request, @NotNull String query, @NotNull Long regionId, CurrencyType currency,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        SearchModelsResponse obj = searchModels(request, query, regionId, currency, page, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SearchModelsResponse searchModels(Http.Request request, @NotNull String query, @NotNull Long regionId, CurrencyType currency,  @Max(10000)Integer page, Integer pageSize) throws Exception;

}
