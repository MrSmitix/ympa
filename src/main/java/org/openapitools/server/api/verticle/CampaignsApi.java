package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetCampaignLoginsResponse;
import org.openapitools.server.api.model.GetCampaignRegionResponse;
import org.openapitools.server.api.model.GetCampaignResponse;
import org.openapitools.server.api.model.GetCampaignSettingsResponse;
import org.openapitools.server.api.model.GetCampaignsResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface CampaignsApi  {
    //getCampaign
    void getCampaign(Long campaignId, Handler<AsyncResult<GetCampaignResponse>> handler);

    //getCampaignLogins
    void getCampaignLogins(Long campaignId, Handler<AsyncResult<GetCampaignLoginsResponse>> handler);

    //getCampaignRegion
    void getCampaignRegion(Long campaignId, Handler<AsyncResult<GetCampaignRegionResponse>> handler);

    //getCampaignSettings
    void getCampaignSettings(Long campaignId, Handler<AsyncResult<GetCampaignSettingsResponse>> handler);

    //getCampaigns
    void getCampaigns(Integer page, Integer pageSize, Handler<AsyncResult<GetCampaignsResponse>> handler);

    //getCampaignsByLogin
    void getCampaignsByLogin(String login, Integer page, Integer pageSize, Handler<AsyncResult<GetCampaignsResponse>> handler);

}
