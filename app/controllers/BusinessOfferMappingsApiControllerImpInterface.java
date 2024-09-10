package controllers;

import apimodels.AddOffersToArchiveRequest;
import apimodels.AddOffersToArchiveResponse;
import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.DeleteOffersFromArchiveRequest;
import apimodels.DeleteOffersFromArchiveResponse;
import apimodels.DeleteOffersRequest;
import apimodels.DeleteOffersResponse;
import apimodels.GetOfferMappingsRequest;
import apimodels.GetOfferMappingsResponse;
import apimodels.GetSuggestedOfferMappingsRequest;
import apimodels.GetSuggestedOfferMappingsResponse;
import apimodels.UpdateOfferMappingsRequest;
import apimodels.UpdateOfferMappingsResponse;

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
public abstract class BusinessOfferMappingsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addOffersToArchiveHttp(Http.Request request, Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        AddOffersToArchiveResponse obj = addOffersToArchive(request, businessId, addOffersToArchiveRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AddOffersToArchiveResponse addOffersToArchive(Http.Request request, Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) throws Exception;

    public Result deleteOffersHttp(Http.Request request, Long businessId, DeleteOffersRequest deleteOffersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        DeleteOffersResponse obj = deleteOffers(request, businessId, deleteOffersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteOffersResponse deleteOffers(Http.Request request, Long businessId, DeleteOffersRequest deleteOffersRequest) throws Exception;

    public Result deleteOffersFromArchiveHttp(Http.Request request, Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        DeleteOffersFromArchiveResponse obj = deleteOffersFromArchive(request, businessId, deleteOffersFromArchiveRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteOffersFromArchiveResponse deleteOffersFromArchive(Http.Request request, Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) throws Exception;

    public Result getOfferMappingsHttp(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOfferMappingsResponse obj = getOfferMappings(request, businessId, pageToken, limit, getOfferMappingsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOfferMappingsResponse getOfferMappings(Http.Request request, Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) throws Exception;

    public Result getSuggestedOfferMappingsHttp(Http.Request request, Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetSuggestedOfferMappingsResponse obj = getSuggestedOfferMappings(request, businessId, getSuggestedOfferMappingsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetSuggestedOfferMappingsResponse getSuggestedOfferMappings(Http.Request request, Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) throws Exception;

    public Result updateOfferMappingsHttp(Http.Request request, Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdateOfferMappingsResponse obj = updateOfferMappings(request, businessId, updateOfferMappingsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateOfferMappingsResponse updateOfferMappings(Http.Request request, Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) throws Exception;

}
