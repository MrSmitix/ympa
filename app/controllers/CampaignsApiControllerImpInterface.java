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
public abstract class CampaignsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getCampaignHttp(Http.Request request, Long campaignId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignResponse obj = getCampaign(request, campaignId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignResponse getCampaign(Http.Request request, Long campaignId) throws Exception;

    public Result getCampaignLoginsHttp(Http.Request request, Long campaignId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignLoginsResponse obj = getCampaignLogins(request, campaignId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignLoginsResponse getCampaignLogins(Http.Request request, Long campaignId) throws Exception;

    public Result getCampaignRegionHttp(Http.Request request, Long campaignId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignRegionResponse obj = getCampaignRegion(request, campaignId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignRegionResponse getCampaignRegion(Http.Request request, Long campaignId) throws Exception;

    public Result getCampaignSettingsHttp(Http.Request request, Long campaignId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignSettingsResponse obj = getCampaignSettings(request, campaignId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignSettingsResponse getCampaignSettings(Http.Request request, Long campaignId) throws Exception;

    public Result getCampaignsHttp(Http.Request request,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignsResponse obj = getCampaigns(request, page, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignsResponse getCampaigns(Http.Request request,  @Max(10000)Integer page, Integer pageSize) throws Exception;

    public Result getCampaignsByLoginHttp(Http.Request request, String login,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetCampaignsResponse obj = getCampaignsByLogin(request, login, page, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetCampaignsResponse getCampaignsByLogin(Http.Request request, String login,  @Max(10000)Integer page, Integer pageSize) throws Exception;

}
