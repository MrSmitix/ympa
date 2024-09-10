package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.ConfirmShipmentRequest;
import org.openapitools.server.api.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.server.api.model.GetShipmentOrdersInfoResponse;
import org.openapitools.server.api.model.GetShipmentResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SearchShipmentsRequest;
import org.openapitools.server.api.model.SearchShipmentsResponse;
import org.openapitools.server.api.model.SetShipmentPalletsCountRequest;
import org.openapitools.server.api.model.ShipmentPalletLabelPageFormatType;
import org.openapitools.server.api.model.TransferOrdersFromShipmentRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ShipmentsApi  {
    //confirmShipment
    void confirmShipment(Long campaignId, Long shipmentId, ConfirmShipmentRequest confirmShipmentRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //downloadShipmentAct
    void downloadShipmentAct(Long campaignId, Long shipmentId, Handler<AsyncResult<File>> handler);

    //downloadShipmentDiscrepancyAct
    void downloadShipmentDiscrepancyAct(Long campaignId, Long shipmentId, Handler<AsyncResult<File>> handler);

    //downloadShipmentInboundAct
    void downloadShipmentInboundAct(Long campaignId, Long shipmentId, Handler<AsyncResult<File>> handler);

    //downloadShipmentPalletLabels
    void downloadShipmentPalletLabels(Long campaignId, Long shipmentId, ShipmentPalletLabelPageFormatType format, Handler<AsyncResult<File>> handler);

    //downloadShipmentReceptionTransferAct
    void downloadShipmentReceptionTransferAct(Long campaignId, Integer warehouseId, Handler<AsyncResult<File>> handler);

    //downloadShipmentTransportationWaybill
    void downloadShipmentTransportationWaybill(Long campaignId, Long shipmentId, Handler<AsyncResult<File>> handler);

    //getShipment
    void getShipment(Long campaignId, Long shipmentId, Boolean cancelledOrders, Handler<AsyncResult<GetShipmentResponse>> handler);

    //getShipmentOrdersInfo
    void getShipmentOrdersInfo(Long campaignId, Long shipmentId, Handler<AsyncResult<GetShipmentOrdersInfoResponse>> handler);

    //searchShipments
    void searchShipments(Long campaignId, SearchShipmentsRequest searchShipmentsRequest, String pageToken, Integer limit, Handler<AsyncResult<SearchShipmentsResponse>> handler);

    //setShipmentPalletsCount
    void setShipmentPalletsCount(Long campaignId, Long shipmentId, SetShipmentPalletsCountRequest setShipmentPalletsCountRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //transferOrdersFromShipment
    void transferOrdersFromShipment(Long campaignId, Long shipmentId, TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

}
