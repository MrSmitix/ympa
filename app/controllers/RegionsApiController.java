package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetRegionWithChildrenResponse;
import apimodels.GetRegionsResponse;

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
public class RegionsApiController extends Controller {
    private final RegionsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private RegionsApiController(Config configuration, RegionsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result searchRegionChildren(Http.Request request, Long regionId) throws Exception {
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
        return imp.searchRegionChildrenHttp(request, regionId, page, pageSize);
    }

    @ApiAction
    public Result searchRegionsById(Http.Request request, Long regionId) throws Exception {
        return imp.searchRegionsByIdHttp(request, regionId);
    }

    @ApiAction
    public Result searchRegionsByName(Http.Request request) throws Exception {
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
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
        return imp.searchRegionsByNameHttp(request, name, pageToken, limit);
    }

}
