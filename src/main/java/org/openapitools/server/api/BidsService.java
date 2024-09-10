package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetBidsInfoRequest;
import org.openapitools.server.model.GetBidsInfoResponse;
import org.openapitools.server.model.GetBidsRecommendationsRequest;
import org.openapitools.server.model.GetBidsRecommendationsResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PutSkuBidsRequest;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Bids'",
                             version = "7.8.0")
public interface BidsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/businesses/{businessId}/bids/info", this::getBidsInfoForBusiness);
        rules.post("/businesses/{businessId}/bids/recommendations", this::getBidsRecommendations);
        rules.put("/businesses/{businessId}/bids", this::putBidsForBusiness);
        rules.put("/campaigns/{campaignId}/bids", this::putBidsForCampaign);
    }


    /**
     * POST /businesses/{businessId}/bids/info : Информация об установленных ставках.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBidsInfoForBusiness(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/bids/recommendations : Рекомендованные ставки для заданных товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBidsRecommendations(ServerRequest request, ServerResponse response);
    /**
     * PUT /businesses/{businessId}/bids : Включение буста продаж и установка ставок.
     *
     * @param request the server request
     * @param response the server response
     */
    void putBidsForBusiness(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/bids : Включение буста продаж и установка ставок для магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void putBidsForCampaign(ServerRequest request, ServerResponse response);
}
