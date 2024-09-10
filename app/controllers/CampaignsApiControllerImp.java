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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignsApiControllerImp extends CampaignsApiControllerImpInterface {
    @Override
    public GetCampaignResponse getCampaign(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetCampaignResponse();
    }

    @Override
    public GetCampaignLoginsResponse getCampaignLogins(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetCampaignLoginsResponse();
    }

    @Override
    public GetCampaignRegionResponse getCampaignRegion(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetCampaignRegionResponse();
    }

    @Override
    public GetCampaignSettingsResponse getCampaignSettings(Http.Request request, Long campaignId) throws Exception {
        //Do your magic!!!
        return new GetCampaignSettingsResponse();
    }

    @Override
    public GetCampaignsResponse getCampaigns(Http.Request request,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetCampaignsResponse();
    }

    @Override
    public GetCampaignsResponse getCampaignsByLogin(Http.Request request, String login,  @Max(10000)Integer page, Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetCampaignsResponse();
    }

}
