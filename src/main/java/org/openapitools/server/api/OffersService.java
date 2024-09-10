package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.CurrencyType;
import org.openapitools.server.model.DeleteCampaignOffersRequest;
import org.openapitools.server.model.DeleteCampaignOffersResponse;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetAllOffersResponse;
import org.openapitools.server.model.GetCampaignOffersRequest;
import org.openapitools.server.model.GetCampaignOffersResponse;
import org.openapitools.server.model.GetOfferRecommendationsRequest;
import org.openapitools.server.model.GetOfferRecommendationsResponse;
import org.openapitools.server.model.GetOffersResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateCampaignOffersRequest;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Offers'",
                             version = "7.8.0")
public interface OffersService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/campaigns/{campaignId}/offers/delete", this::deleteCampaignOffers);
        rules.get("/campaigns/{campaignId}/offers/all", this::getAllOffers);
        rules.post("/campaigns/{campaignId}/offers", this::getCampaignOffers);
        rules.post("/businesses/{businessId}/offers/recommendations", this::getOfferRecommendations);
        rules.get("/campaigns/{campaignId}/offers", this::getOffers);
        rules.post("/campaigns/{campaignId}/offers/update", this::updateCampaignOffers);
    }


    /**
     * POST /campaigns/{campaignId}/offers/delete : Удаление товаров из ассортимента магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteCampaignOffers(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/offers/all : Все предложения магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getAllOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offers : Информация о товарах, которые размещены в заданном магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offers/recommendations : Рекомендации Маркета, касающиеся цен.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOfferRecommendations(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/offers : Предложения магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offers/update : Изменение условий продажи товаров в магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateCampaignOffers(ServerRequest request, ServerResponse response);
}
