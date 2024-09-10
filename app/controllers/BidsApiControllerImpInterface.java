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
public abstract class BidsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getBidsInfoForBusinessHttp(Http.Request request, Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetBidsInfoResponse obj = getBidsInfoForBusiness(request, businessId, pageToken, limit, getBidsInfoRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBidsInfoResponse getBidsInfoForBusiness(Http.Request request, Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) throws Exception;

    public Result getBidsRecommendationsHttp(Http.Request request, Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetBidsRecommendationsResponse obj = getBidsRecommendations(request, businessId, getBidsRecommendationsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBidsRecommendationsResponse getBidsRecommendations(Http.Request request, Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) throws Exception;

    public Result putBidsForBusinessHttp(Http.Request request, Long businessId, PutSkuBidsRequest putSkuBidsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = putBidsForBusiness(request, businessId, putSkuBidsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse putBidsForBusiness(Http.Request request, Long businessId, PutSkuBidsRequest putSkuBidsRequest) throws Exception;

    public Result putBidsForCampaignHttp(Http.Request request, Long campaignId, PutSkuBidsRequest putSkuBidsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = putBidsForCampaign(request, campaignId, putSkuBidsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse putBidsForCampaign(Http.Request request, Long campaignId, PutSkuBidsRequest putSkuBidsRequest) throws Exception;

}
