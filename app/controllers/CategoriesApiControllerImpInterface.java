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
public abstract class CategoriesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getCategoriesMaxSaleQuantumHttp(Http.Request request, GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCategoriesMaxSaleQuantumResponse obj = getCategoriesMaxSaleQuantum(request, getCategoriesMaxSaleQuantumRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(Http.Request request, GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) throws Exception;

    public Result getCategoriesTreeHttp(Http.Request request, GetCategoriesRequest getCategoriesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCategoriesResponse obj = getCategoriesTree(request, getCategoriesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCategoriesResponse getCategoriesTree(Http.Request request, GetCategoriesRequest getCategoriesRequest) throws Exception;

}
