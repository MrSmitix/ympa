package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.GetRegionWithChildrenResponse;
import org.openapitools.server.model.GetRegionsResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Regions'",
                             version = "7.8.0")
public interface RegionsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/{regionId}/children", this::searchRegionChildren);
        rules.get("/{regionId}", this::searchRegionsById);
        rules.get("/", this::searchRegionsByName);
    }


    /**
     * GET /regions/{regionId}/children : Информация о дочерних регионах.
     *
     * @param request the server request
     * @param response the server response
     */
    void searchRegionChildren(ServerRequest request, ServerResponse response);
    /**
     * GET /regions/{regionId} : Информация о регионе.
     *
     * @param request the server request
     * @param response the server response
     */
    void searchRegionsById(ServerRequest request, ServerResponse response);
    /**
     * GET /regions : Поиск регионов по их имени.
     *
     * @param request the server request
     * @param response the server response
     */
    void searchRegionsByName(ServerRequest request, ServerResponse response);
}
