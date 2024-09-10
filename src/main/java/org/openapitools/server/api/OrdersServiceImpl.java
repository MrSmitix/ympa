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
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class OrdersServiceImpl implements OrdersService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void acceptOrderCancellation(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOrder(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getOrders(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void provideOrderDigitalCodes(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void provideOrderItemIdentifiers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void setOrderBoxLayout(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void setOrderShipmentBoxes(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOrderItems(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOrderStatus(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOrderStatuses(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service OrdersService is down. Goodbye!");
    }

}
