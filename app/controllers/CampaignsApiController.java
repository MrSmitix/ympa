package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GetCampaignLoginsResponse;
import apimodels.GetCampaignRegionResponse;
import apimodels.GetCampaignResponse;
import apimodels.GetCampaignSettingsResponse;
import apimodels.GetCampaignsResponse;

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
public class CampaignsApiController extends Controller {
    private final CampaignsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CampaignsApiController(Config configuration, CampaignsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getCampaign(Http.Request request, Long campaignId) throws Exception {
        return imp.getCampaignHttp(request, campaignId);
    }

    @ApiAction
    public Result getCampaignLogins(Http.Request request, Long campaignId) throws Exception {
        return imp.getCampaignLoginsHttp(request, campaignId);
    }

    @ApiAction
    public Result getCampaignRegion(Http.Request request, Long campaignId) throws Exception {
        return imp.getCampaignRegionHttp(request, campaignId);
    }

    @ApiAction
    public Result getCampaignSettings(Http.Request request, Long campaignId) throws Exception {
        return imp.getCampaignSettingsHttp(request, campaignId);
    }

    @ApiAction
    public Result getCampaigns(Http.Request request) throws Exception {
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
        return imp.getCampaignsHttp(request, page, pageSize);
    }

    @ApiAction
    public Result getCampaignsByLogin(Http.Request request, String login) throws Exception {
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
        return imp.getCampaignsByLoginHttp(request, login, page, pageSize);
    }

}
