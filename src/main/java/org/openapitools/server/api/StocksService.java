package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetWarehouseStocksRequest;
import org.openapitools.server.model.GetWarehouseStocksResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateStocksRequest;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Stocks'",
                             version = "7.8.0")
public interface StocksService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/", this::getStocks);
        rules.put("/", this::updateStocks);
    }


    /**
     * POST /campaigns/{campaignId}/offers/stocks : Информация об остатках и оборачиваемости.
     *
     * @param request the server request
     * @param response the server response
     */
    void getStocks(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/offers/stocks : Передача информации об остатках.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateStocks(ServerRequest request, ServerResponse response);
}
