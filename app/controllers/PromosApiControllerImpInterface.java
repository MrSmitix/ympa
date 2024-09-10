package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.DeletePromoOffersRequest;
import apimodels.DeletePromoOffersResponse;
import apimodels.GetPromoOffersRequest;
import apimodels.GetPromoOffersResponse;
import apimodels.GetPromosRequest;
import apimodels.GetPromosResponse;
import apimodels.UpdatePromoOffersRequest;
import apimodels.UpdatePromoOffersResponse;

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
public abstract class PromosApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result deletePromoOffersHttp(Http.Request request, Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        DeletePromoOffersResponse obj = deletePromoOffers(request, businessId, deletePromoOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeletePromoOffersResponse deletePromoOffers(Http.Request request, Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) throws Exception;

    public Result getPromoOffersHttp(Http.Request request, Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetPromoOffersResponse obj = getPromoOffers(request, businessId, getPromoOffersRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetPromoOffersResponse getPromoOffers(Http.Request request, Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) throws Exception;

    public Result getPromosHttp(Http.Request request, Long businessId, GetPromosRequest getPromosRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetPromosResponse obj = getPromos(request, businessId, getPromosRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetPromosResponse getPromos(Http.Request request, Long businessId, GetPromosRequest getPromosRequest) throws Exception;

    public Result updatePromoOffersHttp(Http.Request request, Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdatePromoOffersResponse obj = updatePromoOffers(request, businessId, updatePromoOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdatePromoOffersResponse updatePromoOffers(Http.Request request, Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) throws Exception;

}
