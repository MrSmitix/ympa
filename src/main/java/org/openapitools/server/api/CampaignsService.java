package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.GetCampaignLoginsResponse;
import org.openapitools.server.model.GetCampaignRegionResponse;
import org.openapitools.server.model.GetCampaignResponse;
import org.openapitools.server.model.GetCampaignSettingsResponse;
import org.openapitools.server.model.GetCampaignsResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Campaigns'",
                             version = "7.8.0")
public interface CampaignsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/{campaignId}", this::getCampaign);
        rules.get("/{campaignId}/logins", this::getCampaignLogins);
        rules.get("/{campaignId}/region", this::getCampaignRegion);
        rules.get("/{campaignId}/settings", this::getCampaignSettings);
        rules.get("/", this::getCampaigns);
        rules.get("/by_login/{login}", this::getCampaignsByLogin);
    }


    /**
     * GET /campaigns/{campaignId} : Информация о магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaign(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/logins : Логины, связанные с магазином.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignLogins(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/region : Регион магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignRegion(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/settings : Настройки магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignSettings(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns : Список магазинов пользователя.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaigns(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/by_login/{login} : Магазины, доступные логину.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignsByLogin(ServerRequest request, ServerResponse response);
}
