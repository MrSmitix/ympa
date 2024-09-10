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
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class OrderDeliveryServiceImpl implements OrderDeliveryService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void getOrderBuyerInfo(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void setOrderDeliveryDate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void setOrderDeliveryTrackCode(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateOrderStorageLimit(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void verifyOrderEac(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service OrderDeliveryService is down. Goodbye!");
    }

}
