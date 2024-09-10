package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetPricesByOfferIdsRequest;
import org.openapitools.server.model.GetPricesByOfferIdsResponse;
import org.openapitools.server.model.GetPricesResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.SuggestPricesRequest;
import org.openapitools.server.model.SuggestPricesResponse;
import org.openapitools.server.model.UpdateBusinessPricesRequest;
import org.openapitools.server.model.UpdatePricesRequest;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Prices'",
                             version = "7.8.0")
public interface PricesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/campaigns/{campaignId}/offer-prices", this::getPrices);
        rules.post("/campaigns/{campaignId}/offer-prices", this::getPricesByOfferIds);
        rules.post("/campaigns/{campaignId}/offer-prices/suggestions", this::getSuggestedPrices);
        rules.post("/businesses/{businessId}/offer-prices/updates", this::updateBusinessPrices);
        rules.post("/campaigns/{campaignId}/offer-prices/updates", this::updatePrices);
    }


    /**
     * GET /campaigns/{campaignId}/offer-prices : Список цен.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPrices(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offer-prices : Просмотр цен на указанные товары в магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPricesByOfferIds(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offer-prices/suggestions : Цены для продвижения товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void getSuggestedPrices(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-prices/updates : Установка цен на товары во всех магазинах.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateBusinessPrices(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offer-prices/updates : Установка цен на товары в конкретном магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void updatePrices(ServerRequest request, ServerResponse response);
}
