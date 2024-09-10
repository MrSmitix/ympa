package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.ChangeOutletRequest;
import apimodels.CreateOutletResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetOutletResponse;
import apimodels.GetOutletsResponse;

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
public class OutletsApiController extends Controller {
    private final OutletsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OutletsApiController(Config configuration, OutletsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createOutlet(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodechangeOutletRequest = request.body().asJson();
        ChangeOutletRequest changeOutletRequest;
        if (nodechangeOutletRequest != null) {
            changeOutletRequest = mapper.readValue(nodechangeOutletRequest.toString(), ChangeOutletRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(changeOutletRequest);
            }
        } else {
            throw new IllegalArgumentException("'ChangeOutletRequest' parameter is required");
        }
        return imp.createOutletHttp(request, campaignId, changeOutletRequest);
    }

    @ApiAction
    public Result deleteOutlet(Http.Request request, Long campaignId,Long outletId) throws Exception {
        return imp.deleteOutletHttp(request, campaignId, outletId);
    }

    @ApiAction
    public Result getOutlet(Http.Request request, Long campaignId,Long outletId) throws Exception {
        return imp.getOutletHttp(request, campaignId, outletId);
    }

    @ApiAction
    public Result getOutlets(Http.Request request, Long campaignId) throws Exception {
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valueregionId = request.getQueryString("region_id");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            regionId = null;
        }
        String valueshopOutletCode = request.getQueryString("shop_outlet_code");
        String shopOutletCode;
        if (valueshopOutletCode != null) {
            shopOutletCode = valueshopOutletCode;
        } else {
            shopOutletCode = null;
        }
        String valueregionId2 = request.getQueryString("regionId");
        Long regionId2;
        if (valueregionId2 != null) {
            regionId2 = Long.parseLong(valueregionId2);
        } else {
            regionId2 = null;
        }
        return imp.getOutletsHttp(request, campaignId, pageToken, regionId, shopOutletCode, regionId2);
    }

    @ApiAction
    public Result updateOutlet(Http.Request request, Long campaignId,Long outletId) throws Exception {
        JsonNode nodechangeOutletRequest = request.body().asJson();
        ChangeOutletRequest changeOutletRequest;
        if (nodechangeOutletRequest != null) {
            changeOutletRequest = mapper.readValue(nodechangeOutletRequest.toString(), ChangeOutletRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(changeOutletRequest);
            }
        } else {
            throw new IllegalArgumentException("'ChangeOutletRequest' parameter is required");
        }
        return imp.updateOutletHttp(request, campaignId, outletId, changeOutletRequest);
    }

}
