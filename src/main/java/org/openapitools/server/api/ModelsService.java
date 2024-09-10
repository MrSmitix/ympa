package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.CurrencyType;
import org.openapitools.server.model.GetModelsOffersResponse;
import org.openapitools.server.model.GetModelsRequest;
import org.openapitools.server.model.GetModelsResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.SearchModelsResponse;
import org.openapitools.server.model.SortOrderType;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Models'",
                             version = "7.8.0")
public interface ModelsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/{modelId}", this::getModel);
        rules.get("/{modelId}/offers", this::getModelOffers);
        rules.post("/", this::getModels);
        rules.post("/offers", this::getModelsOffers);
        rules.get("/", this::searchModels);
    }


    /**
     * GET /models/{modelId} : Информация об одной модели.
     *
     * @param request the server request
     * @param response the server response
     */
    void getModel(ServerRequest request, ServerResponse response);
    /**
     * GET /models/{modelId}/offers : Список предложений для одной модели.
     *
     * @param request the server request
     * @param response the server response
     */
    void getModelOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /models : Информация о нескольких моделях.
     *
     * @param request the server request
     * @param response the server response
     */
    void getModels(ServerRequest request, ServerResponse response);
    /**
     * POST /models/offers : Список предложений для нескольких моделей.
     *
     * @param request the server request
     * @param response the server response
     */
    void getModelsOffers(ServerRequest request, ServerResponse response);
    /**
     * GET /models : Поиск модели товара.
     *
     * @param request the server request
     * @param response the server response
     */
    void searchModels(ServerRequest request, ServerResponse response);
}
