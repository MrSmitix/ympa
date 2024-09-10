package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetCampaignLoginsResponse;
import org.openapitools.vertxweb.server.model.GetCampaignRegionResponse;
import org.openapitools.vertxweb.server.model.GetCampaignResponse;
import org.openapitools.vertxweb.server.model.GetCampaignSettingsResponse;
import org.openapitools.vertxweb.server.model.GetCampaignsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CampaignsApi  {
    Future<ApiResponse<GetCampaignResponse>> getCampaign(Long campaignId);
    Future<ApiResponse<GetCampaignLoginsResponse>> getCampaignLogins(Long campaignId);
    Future<ApiResponse<GetCampaignRegionResponse>> getCampaignRegion(Long campaignId);
    Future<ApiResponse<GetCampaignSettingsResponse>> getCampaignSettings(Long campaignId);
    Future<ApiResponse<GetCampaignsResponse>> getCampaigns(Integer page, Integer pageSize);
    Future<ApiResponse<GetCampaignsResponse>> getCampaignsByLogin(String login, Integer page, Integer pageSize);
}
