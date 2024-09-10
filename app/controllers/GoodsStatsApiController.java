package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetGoodsStatsRequest;
import apimodels.GetGoodsStatsResponse;

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
public class GoodsStatsApiController extends Controller {
    private final GoodsStatsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private GoodsStatsApiController(Config configuration, GoodsStatsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getGoodsStats(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodegetGoodsStatsRequest = request.body().asJson();
        GetGoodsStatsRequest getGoodsStatsRequest;
        if (nodegetGoodsStatsRequest != null) {
            getGoodsStatsRequest = mapper.readValue(nodegetGoodsStatsRequest.toString(), GetGoodsStatsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getGoodsStatsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetGoodsStatsRequest' parameter is required");
        }
        return imp.getGoodsStatsHttp(request, campaignId, getGoodsStatsRequest);
    }

}
