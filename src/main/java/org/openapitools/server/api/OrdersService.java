package org.openapitools.server.api;

import org.openapitools.server.model.AcceptOrderCancellationRequest;
import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import java.util.stream.Collectors;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetOrderResponse;
import org.openapitools.server.model.GetOrdersResponse;
import java.util.HexFormat;
import java.util.List;
import java.time.LocalDate;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.server.model.OrderBuyerType;
import org.openapitools.server.model.OrderDeliveryDispatchType;
import org.openapitools.server.model.OrderStatusType;
import org.openapitools.server.model.OrderSubstatusType;
import org.openapitools.server.model.ProvideOrderDigitalCodesRequest;
import org.openapitools.server.model.ProvideOrderItemIdentifiersRequest;
import org.openapitools.server.model.ProvideOrderItemIdentifiersResponse;
import java.util.Set;
import org.openapitools.server.model.SetOrderBoxLayoutRequest;
import org.openapitools.server.model.SetOrderBoxLayoutResponse;
import org.openapitools.server.model.SetOrderShipmentBoxesRequest;
import org.openapitools.server.model.SetOrderShipmentBoxesResponse;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateOrderItemRequest;
import org.openapitools.server.model.UpdateOrderStatusRequest;
import org.openapitools.server.model.UpdateOrderStatusResponse;
import org.openapitools.server.model.UpdateOrderStatusesRequest;
import org.openapitools.server.model.UpdateOrderStatusesResponse;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Orders'",
                             version = "7.8.0")
public interface OrdersService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.put("/{orderId}/cancellation/accept", this::acceptOrderCancellation);
        rules.get("/{orderId}", this::getOrder);
        rules.get("/", this::getOrders);
        rules.post("/{orderId}/deliverDigitalGoods", this::provideOrderDigitalCodes);
        rules.put("/{orderId}/identifiers", this::provideOrderItemIdentifiers);
        rules.put("/{orderId}/boxes", this::setOrderBoxLayout);
        rules.put("/{orderId}/delivery/shipments/{shipmentId}/boxes", this::setOrderShipmentBoxes);
        rules.put("/{orderId}/items", this::updateOrderItems);
        rules.put("/{orderId}/status", this::updateOrderStatus);
        rules.post("/status-update", this::updateOrderStatuses);
    }


    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/cancellation/accept : Отмена заказа покупателем.
     *
     * @param request the server request
     * @param response the server response
     */
    void acceptOrderCancellation(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId} : Информация об одном заказе.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrder(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders : Информация о нескольких заказах.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrders(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods : Передача ключей цифровых товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void provideOrderDigitalCodes(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/identifiers : Передача кодов маркировки единиц товара.
     *
     * @param request the server request
     * @param response the server response
     */
    void provideOrderItemIdentifiers(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/boxes : Подготовка заказа.
     *
     * @param request the server request
     * @param response the server response
     */
    void setOrderBoxLayout(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes : Передача количества грузовых мест в заказе.
     *
     * @param request the server request
     * @param response the server response
     */
    void setOrderShipmentBoxes(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/items : Удаление товара из заказа или уменьшение числа единиц.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOrderItems(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/orders/{orderId}/status : Изменение статуса одного заказа.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOrderStatus(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/status-update : Изменение статусов нескольких заказов.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateOrderStatuses(ServerRequest request, ServerResponse response);
}
