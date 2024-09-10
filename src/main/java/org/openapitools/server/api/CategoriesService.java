package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.server.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.server.model.GetCategoriesRequest;
import org.openapitools.server.model.GetCategoriesResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Categories'",
                             version = "7.8.0")
public interface CategoriesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/max-sale-quantum", this::getCategoriesMaxSaleQuantum);
        rules.post("/tree", this::getCategoriesTree);
    }


    /**
     * POST /categories/max-sale-quantum : Лимит на установку кванта продажи и минимального количества товаров в заказе.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCategoriesMaxSaleQuantum(ServerRequest request, ServerResponse response);
    /**
     * POST /categories/tree : Дерево категорий.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCategoriesTree(ServerRequest request, ServerResponse response);
}
