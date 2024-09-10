package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.ChangeOutletRequest;
import org.openapitools.server.model.CreateOutletResponse;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetOutletResponse;
import org.openapitools.server.model.GetOutletsResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Outlets'",
                             version = "7.8.0")
public interface OutletsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/", this::createOutlet);
        rules.delete("/{outletId}", this::deleteOutlet);
        rules.get("/{outletId}", this::getOutlet);
        rules.get("/", this::getOutlets);
        rules.put("/{outletId}", this::updateOutlet);
    }


    /**
     * POST /campaigns/{campaignId}/outlets : Создание точки продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void createOutlet(ServerRequest request, ServerResponse response);
    /**
     * DELETE /campaigns/{campaignId}/outlets/{outletId} : Удаление точки продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteOutlet(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/outlets/{outletId} : Информация об одной точке продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOutlet(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/outlets : Информация о нескольких точках продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOutlets(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/outlets/{outletId} : Изменение информации о точке продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOutlet(ServerRequest request, ServerResponse response);
}
