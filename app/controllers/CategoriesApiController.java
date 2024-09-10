package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetCategoriesMaxSaleQuantumRequest;
import apimodels.GetCategoriesMaxSaleQuantumResponse;
import apimodels.GetCategoriesRequest;
import apimodels.GetCategoriesResponse;

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
public class CategoriesApiController extends Controller {
    private final CategoriesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CategoriesApiController(Config configuration, CategoriesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getCategoriesMaxSaleQuantum(Http.Request request) throws Exception {
        JsonNode nodegetCategoriesMaxSaleQuantumRequest = request.body().asJson();
        GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest;
        if (nodegetCategoriesMaxSaleQuantumRequest != null) {
            getCategoriesMaxSaleQuantumRequest = mapper.readValue(nodegetCategoriesMaxSaleQuantumRequest.toString(), GetCategoriesMaxSaleQuantumRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getCategoriesMaxSaleQuantumRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetCategoriesMaxSaleQuantumRequest' parameter is required");
        }
        return imp.getCategoriesMaxSaleQuantumHttp(request, getCategoriesMaxSaleQuantumRequest);
    }

    @ApiAction
    public Result getCategoriesTree(Http.Request request) throws Exception {
        JsonNode nodegetCategoriesRequest = request.body().asJson();
        GetCategoriesRequest getCategoriesRequest;
        if (nodegetCategoriesRequest != null) {
            getCategoriesRequest = mapper.readValue(nodegetCategoriesRequest.toString(), GetCategoriesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getCategoriesRequest);
            }
        } else {
            getCategoriesRequest = null;
        }
        return imp.getCategoriesTreeHttp(request, getCategoriesRequest);
    }

}
