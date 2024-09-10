package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import java.io.File;
import org.openapitools.server.model.GetOrderLabelsDataResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PageFormatType;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'OrderLabels'",
                             version = "7.8.0")
public interface OrderLabelsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/shipments/{shipmentId}/boxes/{boxId}/label", this::generateOrderLabel);
        rules.get("/labels", this::generateOrderLabels);
        rules.get("/labels/data", this::getOrderLabelsData);
    }


    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label : Готовый ярлык‑наклейка для коробки в заказе.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateOrderLabel(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/delivery/labels : Готовые ярлыки‑наклейки на все коробки в одном заказе.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateOrderLabels(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data : Данные для самостоятельного изготовления ярлыков.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrderLabelsData(ServerRequest request, ServerResponse response);
}
