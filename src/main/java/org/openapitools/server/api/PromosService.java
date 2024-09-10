package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.DeletePromoOffersRequest;
import org.openapitools.server.model.DeletePromoOffersResponse;
import org.openapitools.server.model.GetPromoOffersRequest;
import org.openapitools.server.model.GetPromoOffersResponse;
import org.openapitools.server.model.GetPromosRequest;
import org.openapitools.server.model.GetPromosResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdatePromoOffersRequest;
import org.openapitools.server.model.UpdatePromoOffersResponse;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Promos'",
                             version = "7.8.0")
public interface PromosService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/offers/delete", this::deletePromoOffers);
        rules.post("/offers", this::getPromoOffers);
        rules.post("/", this::getPromos);
        rules.post("/offers/update", this::updatePromoOffers);
    }


    /**
     * POST /businesses/{businessId}/promos/offers/delete : Удаление товаров из акции.
     *
     * @param request the server request
     * @param response the server response
     */
    void deletePromoOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/promos/offers : Получение списка товаров, которые участвуют или могут участвовать в акции.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPromoOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/promos : Получение списка акций.
     *
     * @param request the server request
     * @param response the server response
     */
    void getPromos(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/promos/offers/update : Добавление товаров в акцию или изменение их цен.
     *
     * @param request the server request
     * @param response the server response
     */
    void updatePromoOffers(ServerRequest request, ServerResponse response);
}
