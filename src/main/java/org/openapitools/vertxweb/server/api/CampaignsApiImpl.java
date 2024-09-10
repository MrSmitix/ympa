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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CampaignsApiImpl implements CampaignsApi {
    public Future<ApiResponse<GetCampaignResponse>> getCampaign(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignLoginsResponse>> getCampaignLogins(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignRegionResponse>> getCampaignRegion(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignSettingsResponse>> getCampaignSettings(Long campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignsResponse>> getCampaigns(Integer page, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetCampaignsResponse>> getCampaignsByLogin(String login, Integer page, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

}
