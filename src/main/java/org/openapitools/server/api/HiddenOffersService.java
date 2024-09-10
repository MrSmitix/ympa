package org.openapitools.server.api;

import org.openapitools.server.model.AddHiddenOffersRequest;
import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import java.util.stream.Collectors;
import org.openapitools.server.model.DeleteHiddenOffersRequest;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetHiddenOffersResponse;
import java.util.HexFormat;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'HiddenOffers'",
                             version = "7.8.0")
public interface HiddenOffersService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/", this::addHiddenOffers);
        rules.post("/delete", this::deleteHiddenOffers);
        rules.get("/", this::getHiddenOffers);
    }


    /**
     * POST /campaigns/{campaignId}/hidden-offers : Скрытие товаров и настройки скрытия.
     *
     * @param request the server request
     * @param response the server response
     */
    void addHiddenOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/hidden-offers/delete : Возобновление показа товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteHiddenOffers(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/hidden-offers : Информация о скрытых вами товарах.
     *
     * @param request the server request
     * @param response the server response
     */
    void getHiddenOffers(ServerRequest request, ServerResponse response);
}
