package org.openapitools.server.api;

import org.openapitools.server.model.AddOffersToArchiveRequest;
import org.openapitools.server.model.AddOffersToArchiveResponse;
import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.DeleteOffersFromArchiveRequest;
import org.openapitools.server.model.DeleteOffersFromArchiveResponse;
import org.openapitools.server.model.DeleteOffersRequest;
import org.openapitools.server.model.DeleteOffersResponse;
import org.openapitools.server.model.GetOfferMappingsRequest;
import org.openapitools.server.model.GetOfferMappingsResponse;
import org.openapitools.server.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.server.model.GetSuggestedOfferMappingsResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateOfferMappingsRequest;
import org.openapitools.server.model.UpdateOfferMappingsResponse;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'BusinessOfferMappings'",
                             version = "7.8.0")
public interface BusinessOfferMappingsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/archive", this::addOffersToArchive);
        rules.post("/delete", this::deleteOffers);
        rules.post("/unarchive", this::deleteOffersFromArchive);
        rules.post("/", this::getOfferMappings);
        rules.post("/suggestions", this::getSuggestedOfferMappings);
        rules.post("/update", this::updateOfferMappings);
    }


    /**
     * POST /businesses/{businessId}/offer-mappings/archive : Добавление товаров в архив.
     *
     * @param request the server request
     * @param response the server response
     */
    void addOffersToArchive(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings/delete : Удаление товаров из каталога.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteOffers(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings/unarchive : Удаление товаров из архива.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteOffersFromArchive(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings : Информация о товарах в каталоге.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOfferMappings(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings/suggestions : Просмотр карточек на Маркете, которые подходят вашим товарам.
     *
     * @param request the server request
     * @param response the server response
     */
    void getSuggestedOfferMappings(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/offer-mappings/update : Добавление товаров в каталог и изменение информации о них.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOfferMappings(ServerRequest request, ServerResponse response);
}
