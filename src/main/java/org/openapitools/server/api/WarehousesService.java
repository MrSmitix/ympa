package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.GetFulfillmentWarehousesResponse;
import org.openapitools.server.model.GetWarehousesResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Warehouses'",
                             version = "7.8.0")
public interface WarehousesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/warehouses", this::getFulfillmentWarehouses);
        rules.get("/businesses/{businessId}/warehouses", this::getWarehouses);
    }


    /**
     * GET /warehouses : Идентификаторы складов Маркета (FBY).
     *
     * @param request the server request
     * @param response the server response
     */
    void getFulfillmentWarehouses(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{businessId}/warehouses : Список складов и групп складов.
     *
     * @param request the server request
     * @param response the server response
     */
    void getWarehouses(ServerRequest request, ServerResponse response);
}
