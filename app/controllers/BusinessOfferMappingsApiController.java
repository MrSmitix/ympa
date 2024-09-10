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
public class BusinessOfferMappingsApiController extends Controller {
    private final BusinessOfferMappingsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BusinessOfferMappingsApiController(Config configuration, BusinessOfferMappingsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addOffersToArchive(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeaddOffersToArchiveRequest = request.body().asJson();
        AddOffersToArchiveRequest addOffersToArchiveRequest;
        if (nodeaddOffersToArchiveRequest != null) {
            addOffersToArchiveRequest = mapper.readValue(nodeaddOffersToArchiveRequest.toString(), AddOffersToArchiveRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(addOffersToArchiveRequest);
            }
        } else {
            throw new IllegalArgumentException("'AddOffersToArchiveRequest' parameter is required");
        }
        return imp.addOffersToArchiveHttp(request, businessId, addOffersToArchiveRequest);
    }

    @ApiAction
    public Result deleteOffers(Http.Request request, Long businessId) throws Exception {
        JsonNode nodedeleteOffersRequest = request.body().asJson();
        DeleteOffersRequest deleteOffersRequest;
        if (nodedeleteOffersRequest != null) {
            deleteOffersRequest = mapper.readValue(nodedeleteOffersRequest.toString(), DeleteOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeleteOffersRequest' parameter is required");
        }
        return imp.deleteOffersHttp(request, businessId, deleteOffersRequest);
    }

    @ApiAction
    public Result deleteOffersFromArchive(Http.Request request, Long businessId) throws Exception {
        JsonNode nodedeleteOffersFromArchiveRequest = request.body().asJson();
        DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest;
        if (nodedeleteOffersFromArchiveRequest != null) {
            deleteOffersFromArchiveRequest = mapper.readValue(nodedeleteOffersFromArchiveRequest.toString(), DeleteOffersFromArchiveRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteOffersFromArchiveRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeleteOffersFromArchiveRequest' parameter is required");
        }
        return imp.deleteOffersFromArchiveHttp(request, businessId, deleteOffersFromArchiveRequest);
    }

    @ApiAction
    public Result getOfferMappings(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetOfferMappingsRequest = request.body().asJson();
        GetOfferMappingsRequest getOfferMappingsRequest;
        if (nodegetOfferMappingsRequest != null) {
            getOfferMappingsRequest = mapper.readValue(nodegetOfferMappingsRequest.toString(), GetOfferMappingsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getOfferMappingsRequest);
            }
        } else {
            getOfferMappingsRequest = null;
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
        return imp.getOfferMappingsHttp(request, businessId, pageToken, limit, getOfferMappingsRequest);
    }

    @ApiAction
    public Result getSuggestedOfferMappings(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetSuggestedOfferMappingsRequest = request.body().asJson();
        GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest;
        if (nodegetSuggestedOfferMappingsRequest != null) {
            getSuggestedOfferMappingsRequest = mapper.readValue(nodegetSuggestedOfferMappingsRequest.toString(), GetSuggestedOfferMappingsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getSuggestedOfferMappingsRequest);
            }
        } else {
            getSuggestedOfferMappingsRequest = null;
        }
        return imp.getSuggestedOfferMappingsHttp(request, businessId, getSuggestedOfferMappingsRequest);
    }

    @ApiAction
    public Result updateOfferMappings(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeupdateOfferMappingsRequest = request.body().asJson();
        UpdateOfferMappingsRequest updateOfferMappingsRequest;
        if (nodeupdateOfferMappingsRequest != null) {
            updateOfferMappingsRequest = mapper.readValue(nodeupdateOfferMappingsRequest.toString(), UpdateOfferMappingsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOfferMappingsRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOfferMappingsRequest' parameter is required");
        }
        return imp.updateOfferMappingsHttp(request, businessId, updateOfferMappingsRequest);
    }

}
