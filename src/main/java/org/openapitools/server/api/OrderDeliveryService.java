package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetOrderBuyerInfoResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.SetOrderDeliveryDateRequest;
import org.openapitools.server.model.SetOrderDeliveryTrackCodeRequest;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateOrderStorageLimitRequest;
import org.openapitools.server.model.VerifyOrderEacRequest;
import org.openapitools.server.model.VerifyOrderEacResponse;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'OrderDelivery'",
                             version = "7.8.0")
public interface OrderDeliveryService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/buyer", this::getOrderBuyerInfo);
        rules.put("/delivery/date", this::setOrderDeliveryDate);
        rules.post("/delivery/track", this::setOrderDeliveryTrackCode);
        rules.put("/delivery/storage-limit", this::updateOrderStorageLimit);
        rules.put("/verifyEac", this::verifyOrderEac);
    }


    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/buyer : Информация о покупателе — физическом лице.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrderBuyerInfo(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/delivery/date : Изменение даты доставки заказа.
     *
     * @param request the server request
     * @param response the server response
     */
    void setOrderDeliveryDate(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/delivery/track : Передача трек‑номера посылки.
     *
     * @param request the server request
     * @param response the server response
     */
    void setOrderDeliveryTrackCode(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit : Продление срока хранения заказа.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOrderStorageLimit(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/verifyEac : Передача кода подтверждения.
     *
     * @param request the server request
     * @param response the server response
     */
    void verifyOrderEac(ServerRequest request, ServerResponse response);
}
