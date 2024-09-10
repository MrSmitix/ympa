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
public class PromosApiController extends Controller {
    private final PromosApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PromosApiController(Config configuration, PromosApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result deletePromoOffers(Http.Request request, Long businessId) throws Exception {
        JsonNode nodedeletePromoOffersRequest = request.body().asJson();
        DeletePromoOffersRequest deletePromoOffersRequest;
        if (nodedeletePromoOffersRequest != null) {
            deletePromoOffersRequest = mapper.readValue(nodedeletePromoOffersRequest.toString(), DeletePromoOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deletePromoOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeletePromoOffersRequest' parameter is required");
        }
        return imp.deletePromoOffersHttp(request, businessId, deletePromoOffersRequest);
    }

    @ApiAction
    public Result getPromoOffers(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetPromoOffersRequest = request.body().asJson();
        GetPromoOffersRequest getPromoOffersRequest;
        if (nodegetPromoOffersRequest != null) {
            getPromoOffersRequest = mapper.readValue(nodegetPromoOffersRequest.toString(), GetPromoOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getPromoOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetPromoOffersRequest' parameter is required");
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
        return imp.getPromoOffersHttp(request, businessId, getPromoOffersRequest, pageToken, limit);
    }

    @ApiAction
    public Result getPromos(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetPromosRequest = request.body().asJson();
        GetPromosRequest getPromosRequest;
        if (nodegetPromosRequest != null) {
            getPromosRequest = mapper.readValue(nodegetPromosRequest.toString(), GetPromosRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getPromosRequest);
            }
        } else {
            getPromosRequest = null;
        }
        return imp.getPromosHttp(request, businessId, getPromosRequest);
    }

    @ApiAction
    public Result updatePromoOffers(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeupdatePromoOffersRequest = request.body().asJson();
        UpdatePromoOffersRequest updatePromoOffersRequest;
        if (nodeupdatePromoOffersRequest != null) {
            updatePromoOffersRequest = mapper.readValue(nodeupdatePromoOffersRequest.toString(), UpdatePromoOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updatePromoOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdatePromoOffersRequest' parameter is required");
        }
        return imp.updatePromoOffersHttp(request, businessId, updatePromoOffersRequest);
    }

}
