package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.ConfirmShipmentRequest;
import org.openapitools.server.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.server.model.GetShipmentOrdersInfoResponse;
import org.openapitools.server.model.GetShipmentResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.SearchShipmentsRequest;
import org.openapitools.server.model.SearchShipmentsResponse;
import org.openapitools.server.model.SetShipmentPalletsCountRequest;
import org.openapitools.server.model.ShipmentPalletLabelPageFormatType;
import io.helidon.http.Status;
import org.openapitools.server.model.TransferOrdersFromShipmentRequest;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class ShipmentsServiceImpl implements ShipmentsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void confirmShipment(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void downloadShipmentAct(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void downloadShipmentDiscrepancyAct(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void downloadShipmentInboundAct(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void downloadShipmentPalletLabels(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void downloadShipmentReceptionTransferAct(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void downloadShipmentTransportationWaybill(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getShipment(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getShipmentOrdersInfo(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void searchShipments(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void setShipmentPalletsCount(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void transferOrdersFromShipment(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service ShipmentsService is down. Goodbye!");
    }

}
