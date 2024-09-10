package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.ConfirmShipmentRequest;
import apimodels.EmptyApiResponse;
import apimodels.GetShipmentOrdersInfoResponse;
import apimodels.GetShipmentResponse;
import java.io.InputStream;
import apimodels.SearchShipmentsRequest;
import apimodels.SearchShipmentsResponse;
import apimodels.SetShipmentPalletsCountRequest;
import apimodels.ShipmentPalletLabelPageFormatType;
import apimodels.TransferOrdersFromShipmentRequest;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ShipmentsApiControllerImp extends ShipmentsApiControllerImpInterface {
    @Override
    public EmptyApiResponse confirmShipment(Http.Request request, Long campaignId, Long shipmentId, ConfirmShipmentRequest confirmShipmentRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public InputStream downloadShipmentAct(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream downloadShipmentDiscrepancyAct(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream downloadShipmentInboundAct(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream downloadShipmentPalletLabels(Http.Request request, Long campaignId, Long shipmentId, ShipmentPalletLabelPageFormatType format) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream downloadShipmentReceptionTransferAct(Http.Request request, Long campaignId, Integer warehouseId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public InputStream downloadShipmentTransportationWaybill(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public GetShipmentResponse getShipment(Http.Request request, Long campaignId, Long shipmentId, Boolean cancelledOrders) throws Exception {
        //Do your magic!!!
        return new GetShipmentResponse();
    }

    @Override
    public GetShipmentOrdersInfoResponse getShipmentOrdersInfo(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        //Do your magic!!!
        return new GetShipmentOrdersInfoResponse();
    }

    @Override
    public SearchShipmentsResponse searchShipments(Http.Request request, Long campaignId, SearchShipmentsRequest searchShipmentsRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new SearchShipmentsResponse();
    }

    @Override
    public EmptyApiResponse setShipmentPalletsCount(Http.Request request, Long campaignId, Long shipmentId, SetShipmentPalletsCountRequest setShipmentPalletsCountRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse transferOrdersFromShipment(Http.Request request, Long campaignId, Long shipmentId, TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

}
