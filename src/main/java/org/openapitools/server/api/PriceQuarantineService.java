package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.ConfirmPricesRequest;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetQuarantineOffersRequest;
import org.openapitools.server.model.GetQuarantineOffersResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'PriceQuarantine'",
                             version = "7.8.0")
public interface PriceQuarantineService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/businesses/{businessId}/price-quarantine/confirm", this::confirmBusinessPrices);
        rules.post("/campaigns/{campaignId}/price-quarantine/confirm", this::confirmCampaignPrices);
        rules.post("/businesses/{businessId}/price-quarantine", this::getBusinessQuarantineOffers);
        rules.post("/campaigns/{campaignId}/price-quarantine", this::getCampaignQuarantineOffers);
    }


    /**
     * POST /businesses/{businessId}/price-quarantine/confirm : Удаление товара из карантина по цене в кабинете.
     *
     * @param request the server request
     * @param response the server response
     */
    void confirmBusinessPrices(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/price-quarantine/confirm : Удаление товара из карантина по цене в магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void confirmCampaignPrices(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/price-quarantine : Список товаров, находящихся в карантине по цене в кабинете.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBusinessQuarantineOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/price-quarantine : Список товаров, находящихся в карантине по цене в магазине.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignQuarantineOffers(ServerRequest request, ServerResponse response);
}
