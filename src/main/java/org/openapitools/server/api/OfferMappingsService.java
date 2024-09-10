package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import java.util.stream.Collectors;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetOfferMappingEntriesResponse;
import org.openapitools.server.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.server.model.GetSuggestedOfferMappingEntriesResponse;
import java.util.HexFormat;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.OfferAvailabilityStatusType;
import org.openapitools.server.model.OfferMappingKindType;
import org.openapitools.server.model.OfferProcessingStatusType;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateOfferMappingEntryRequest;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'OfferMappings'",
                             version = "7.8.0")
public interface OfferMappingsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/", this::getOfferMappingEntries);
        rules.post("/suggestions", this::getSuggestedOfferMappingEntries);
        rules.post("/updates", this::updateOfferMappingEntries);
    }


    /**
     * GET /campaigns/{campaignId}/offer-mapping-entries : Список товаров в каталоге.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOfferMappingEntries(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offer-mapping-entries/suggestions : Рекомендованные карточки для товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void getSuggestedOfferMappingEntries(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/offer-mapping-entries/updates : Добавление и редактирование товаров в каталоге.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOfferMappingEntries(ServerRequest request, ServerResponse response);
}
