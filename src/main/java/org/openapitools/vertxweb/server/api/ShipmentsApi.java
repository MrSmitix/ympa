package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.ConfirmShipmentRequest;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.GetShipmentOrdersInfoResponse;
import org.openapitools.vertxweb.server.model.GetShipmentResponse;
import org.openapitools.vertxweb.server.model.SearchShipmentsRequest;
import org.openapitools.vertxweb.server.model.SearchShipmentsResponse;
import org.openapitools.vertxweb.server.model.SetShipmentPalletsCountRequest;
import org.openapitools.vertxweb.server.model.ShipmentPalletLabelPageFormatType;
import org.openapitools.vertxweb.server.model.TransferOrdersFromShipmentRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ShipmentsApi  {
    Future<ApiResponse<EmptyApiResponse>> confirmShipment(Long campaignId, Long shipmentId, ConfirmShipmentRequest confirmShipmentRequest);
    Future<ApiResponse<FileUpload>> downloadShipmentAct(Long campaignId, Long shipmentId);
    Future<ApiResponse<FileUpload>> downloadShipmentDiscrepancyAct(Long campaignId, Long shipmentId);
    Future<ApiResponse<FileUpload>> downloadShipmentInboundAct(Long campaignId, Long shipmentId);
    Future<ApiResponse<FileUpload>> downloadShipmentPalletLabels(Long campaignId, Long shipmentId, ShipmentPalletLabelPageFormatType format);
    Future<ApiResponse<FileUpload>> downloadShipmentReceptionTransferAct(Long campaignId, Integer warehouseId);
    Future<ApiResponse<FileUpload>> downloadShipmentTransportationWaybill(Long campaignId, Long shipmentId);
    Future<ApiResponse<GetShipmentResponse>> getShipment(Long campaignId, Long shipmentId, Boolean cancelledOrders);
    Future<ApiResponse<GetShipmentOrdersInfoResponse>> getShipmentOrdersInfo(Long campaignId, Long shipmentId);
    Future<ApiResponse<SearchShipmentsResponse>> searchShipments(Long campaignId, SearchShipmentsRequest searchShipmentsRequest, String pageToken, Integer limit);
    Future<ApiResponse<EmptyApiResponse>> setShipmentPalletsCount(Long campaignId, Long shipmentId, SetShipmentPalletsCountRequest setShipmentPalletsCountRequest);
    Future<ApiResponse<EmptyApiResponse>> transferOrdersFromShipment(Long campaignId, Long shipmentId, TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest);
}
