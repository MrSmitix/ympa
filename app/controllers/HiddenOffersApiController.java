package controllers;

import apimodels.AddHiddenOffersRequest;
import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiLockedErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.DeleteHiddenOffersRequest;
import apimodels.EmptyApiResponse;
import apimodels.GetHiddenOffersResponse;

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
public class HiddenOffersApiController extends Controller {
    private final HiddenOffersApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private HiddenOffersApiController(Config configuration, HiddenOffersApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addHiddenOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeaddHiddenOffersRequest = request.body().asJson();
        AddHiddenOffersRequest addHiddenOffersRequest;
        if (nodeaddHiddenOffersRequest != null) {
            addHiddenOffersRequest = mapper.readValue(nodeaddHiddenOffersRequest.toString(), AddHiddenOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(addHiddenOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'AddHiddenOffersRequest' parameter is required");
        }
        return imp.addHiddenOffersHttp(request, campaignId, addHiddenOffersRequest);
    }

    @ApiAction
    public Result deleteHiddenOffers(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodedeleteHiddenOffersRequest = request.body().asJson();
        DeleteHiddenOffersRequest deleteHiddenOffersRequest;
        if (nodedeleteHiddenOffersRequest != null) {
            deleteHiddenOffersRequest = mapper.readValue(nodedeleteHiddenOffersRequest.toString(), DeleteHiddenOffersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteHiddenOffersRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeleteHiddenOffersRequest' parameter is required");
        }
        return imp.deleteHiddenOffersHttp(request, campaignId, deleteHiddenOffersRequest);
    }

    @ApiAction
    public Result getHiddenOffers(Http.Request request, Long campaignId) throws Exception {
        String[] offerIdArray = request.queryString().get("offer_id");
        List<String> offerIdList = OpenAPIUtils.parametersToList("csv", offerIdArray);
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId = new ArrayList<>();
        for (String curParam : offerIdList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                offerId.add(curParam);
            }
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
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        String valuepageSize = request.getQueryString("pageSize");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = null;
        }
        return imp.getHiddenOffersHttp(request, campaignId, offerId, pageToken, limit, offset, page, pageSize);
    }

}
