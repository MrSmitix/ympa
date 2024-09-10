package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.GetCategoryContentParametersResponse;
import org.openapitools.server.model.GetOfferCardsContentStatusRequest;
import org.openapitools.server.model.GetOfferCardsContentStatusResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateOfferContentRequest;
import org.openapitools.server.model.UpdateOfferContentResponse;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Content'",
                             version = "7.8.0")
public interface ContentService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/category/{categoryId}/parameters", this::getCategoryContentParameters);
        rules.post("/businesses/{businessId}/offer-cards", this::getOfferCardsContentStatus);
        rules.post("/businesses/{businessId}/offer-cards/update", this::updateOfferContent);
    }


    /**
     * POST /category/{categoryId}/parameters : Списки характеристик товаров по категориям.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCategoryContentParameters(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-cards : Получение информации о заполненности карточек магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOfferCardsContentStatus(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-cards/update : Редактирование категорийных характеристик товара.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOfferContent(ServerRequest request, ServerResponse response);
}
