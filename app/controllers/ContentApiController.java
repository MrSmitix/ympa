package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetCategoryContentParametersResponse;
import apimodels.GetOfferCardsContentStatusRequest;
import apimodels.GetOfferCardsContentStatusResponse;
import apimodels.UpdateOfferContentRequest;
import apimodels.UpdateOfferContentResponse;

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
public class ContentApiController extends Controller {
    private final ContentApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ContentApiController(Config configuration, ContentApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getCategoryContentParameters(Http.Request request, Long categoryId) throws Exception {
        return imp.getCategoryContentParametersHttp(request, categoryId);
    }

    @ApiAction
    public Result getOfferCardsContentStatus(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetOfferCardsContentStatusRequest = request.body().asJson();
        GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest;
        if (nodegetOfferCardsContentStatusRequest != null) {
            getOfferCardsContentStatusRequest = mapper.readValue(nodegetOfferCardsContentStatusRequest.toString(), GetOfferCardsContentStatusRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getOfferCardsContentStatusRequest);
            }
        } else {
            getOfferCardsContentStatusRequest = null;
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
        return imp.getOfferCardsContentStatusHttp(request, businessId, pageToken, limit, getOfferCardsContentStatusRequest);
    }

    @ApiAction
    public Result updateOfferContent(Http.Request request, Long businessId) throws Exception {
        JsonNode nodeupdateOfferContentRequest = request.body().asJson();
        UpdateOfferContentRequest updateOfferContentRequest;
        if (nodeupdateOfferContentRequest != null) {
            updateOfferContentRequest = mapper.readValue(nodeupdateOfferContentRequest.toString(), UpdateOfferContentRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOfferContentRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOfferContentRequest' parameter is required");
        }
        return imp.updateOfferContentHttp(request, businessId, updateOfferContentRequest);
    }

}
