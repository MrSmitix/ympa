package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import java.util.stream.Collectors;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetOutletLicensesResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import java.util.Set;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateOutletLicenseRequest;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'OutletLicenses'",
                             version = "7.8.0")
public interface OutletLicensesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.delete("/", this::deleteOutletLicenses);
        rules.get("/", this::getOutletLicenses);
        rules.post("/", this::updateOutletLicenses);
    }


    /**
     * DELETE /campaigns/{campaignId}/outlets/licenses : Удаление лицензий для точек продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteOutletLicenses(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/outlets/licenses : Информация о лицензиях для точек продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOutletLicenses(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/outlets/licenses : Создание и изменение лицензий для точек продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOutletLicenses(ServerRequest request, ServerResponse response);
}
