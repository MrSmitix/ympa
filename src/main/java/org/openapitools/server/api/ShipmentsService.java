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

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Shipments'",
                             version = "7.8.0")
public interface ShipmentsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/first-mile/shipments/{shipmentId}/confirm", this::confirmShipment);
        rules.get("/first-mile/shipments/{shipmentId}/act", this::downloadShipmentAct);
        rules.get("/first-mile/shipments/{shipmentId}/discrepancy-act", this::downloadShipmentDiscrepancyAct);
        rules.get("/first-mile/shipments/{shipmentId}/inbound-act", this::downloadShipmentInboundAct);
        rules.get("/first-mile/shipments/{shipmentId}/pallet/labels", this::downloadShipmentPalletLabels);
        rules.get("/shipments/reception-transfer-act", this::downloadShipmentReceptionTransferAct);
        rules.get("/first-mile/shipments/{shipmentId}/transportation-waybill", this::downloadShipmentTransportationWaybill);
        rules.get("/first-mile/shipments/{shipmentId}", this::getShipment);
        rules.get("/first-mile/shipments/{shipmentId}/orders/info", this::getShipmentOrdersInfo);
        rules.put("/first-mile/shipments", this::searchShipments);
        rules.put("/first-mile/shipments/{shipmentId}/pallets", this::setShipmentPalletsCount);
        rules.post("/first-mile/shipments/{shipmentId}/orders/transfer", this::transferOrdersFromShipment);
    }


    /**
     * POST /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm : Подтверждение отгрузки.
     *
     * @param request the server request
     * @param response the server response
     */
    void confirmShipment(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act : Получение акта приема-передачи.
     *
     * @param request the server request
     * @param response the server response
     */
    void downloadShipmentAct(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act : Получение акта расхождений.
     *
     * @param request the server request
     * @param response the server response
     */
    void downloadShipmentDiscrepancyAct(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act : Получение фактического акта приема-передачи.
     *
     * @param request the server request
     * @param response the server response
     */
    void downloadShipmentInboundAct(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels : Ярлыки для доверительной приемки (FBS).
     *
     * @param request the server request
     * @param response the server response
     */
    void downloadShipmentPalletLabels(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/shipments/reception-transfer-act : Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее.
     *
     * @param request the server request
     * @param response the server response
     */
    void downloadShipmentReceptionTransferAct(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill : Получение транспортной накладной.
     *
     * @param request the server request
     * @param response the server response
     */
    void downloadShipmentTransportationWaybill(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId} : Получение информации об одной отгрузке.
     *
     * @param request the server request
     * @param response the server response
     */
    void getShipment(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info : Получение информации о возможности печати ярлыков (FBS).
     *
     * @param request the server request
     * @param response the server response
     */
    void getShipmentOrdersInfo(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/first-mile/shipments : Получение информации о нескольких отгрузках.
     *
     * @param request the server request
     * @param response the server response
     */
    void searchShipments(ServerRequest request, ServerResponse response);
    /**
     * PUT /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets : Передача количества упаковок в отгрузке.
     *
     * @param request the server request
     * @param response the server response
     */
    void setShipmentPalletsCount(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer : Перенос заказов в следующую отгрузку.
     *
     * @param request the server request
     * @param response the server response
     */
    void transferOrdersFromShipment(ServerRequest request, ServerResponse response);
}
