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
public abstract class PricesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getPricesHttp(Http.Request request, Long campaignId, String pageToken, Integer limit, Boolean archived) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetPricesResponse obj = getPrices(request, campaignId, pageToken, limit, archived);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetPricesResponse getPrices(Http.Request request, Long campaignId, String pageToken, Integer limit, Boolean archived) throws Exception;

    public Result getPricesByOfferIdsHttp(Http.Request request, Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetPricesByOfferIdsResponse obj = getPricesByOfferIds(request, campaignId, pageToken, limit, getPricesByOfferIdsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetPricesByOfferIdsResponse getPricesByOfferIds(Http.Request request, Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) throws Exception;

    public Result getSuggestedPricesHttp(Http.Request request, Long campaignId, SuggestPricesRequest suggestPricesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        SuggestPricesResponse obj = getSuggestedPrices(request, campaignId, suggestPricesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SuggestPricesResponse getSuggestedPrices(Http.Request request, Long campaignId, SuggestPricesRequest suggestPricesRequest) throws Exception;

    public Result updateBusinessPricesHttp(Http.Request request, Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updateBusinessPrices(request, businessId, updateBusinessPricesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updateBusinessPrices(Http.Request request, Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) throws Exception;

    public Result updatePricesHttp(Http.Request request, Long campaignId, UpdatePricesRequest updatePricesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = updatePrices(request, campaignId, updatePricesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse updatePrices(Http.Request request, Long campaignId, UpdatePricesRequest updatePricesRequest) throws Exception;

}
