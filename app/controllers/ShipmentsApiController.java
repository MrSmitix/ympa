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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ShipmentsApiController extends Controller {
    private final ShipmentsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ShipmentsApiController(Config configuration, ShipmentsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result confirmShipment(Http.Request request, Long campaignId,Long shipmentId) throws Exception {
        JsonNode nodeconfirmShipmentRequest = request.body().asJson();
        ConfirmShipmentRequest confirmShipmentRequest;
        if (nodeconfirmShipmentRequest != null) {
            confirmShipmentRequest = mapper.readValue(nodeconfirmShipmentRequest.toString(), ConfirmShipmentRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(confirmShipmentRequest);
            }
        } else {
            confirmShipmentRequest = null;
        }
        return imp.confirmShipmentHttp(request, campaignId, shipmentId, confirmShipmentRequest);
    }

    @ApiAction
    public Result downloadShipmentAct(Http.Request request, Long campaignId,Long shipmentId) throws Exception {
        return imp.downloadShipmentActHttp(request, campaignId, shipmentId);
    }

    @ApiAction
    public Result downloadShipmentDiscrepancyAct(Http.Request request, Long campaignId,Long shipmentId) throws Exception {
        return imp.downloadShipmentDiscrepancyActHttp(request, campaignId, shipmentId);
    }

    @ApiAction
    public Result downloadShipmentInboundAct(Http.Request request, Long campaignId,Long shipmentId) throws Exception {
        return imp.downloadShipmentInboundActHttp(request, campaignId, shipmentId);
    }

    @ApiAction
    public Result downloadShipmentPalletLabels(Http.Request request, Long campaignId,Long shipmentId) throws Exception {
        String valueformat = request.getQueryString("format");
        ShipmentPalletLabelPageFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = A8;
        }
        return imp.downloadShipmentPalletLabelsHttp(request, campaignId, shipmentId, format);
    }

    @ApiAction
    public Result downloadShipmentReceptionTransferAct(Http.Request request, Long campaignId) throws Exception {
        String valuewarehouseId = request.getQueryString("warehouse_id");
        Integer warehouseId;
        if (valuewarehouseId != null) {
            warehouseId = Integer.parseInt(valuewarehouseId);
        } else {
            warehouseId = null;
        }
        return imp.downloadShipmentReceptionTransferActHttp(request, campaignId, warehouseId);
    }

    @ApiAction
    public Result downloadShipmentTransportationWaybill(Http.Request request, Long campaignId,Long shipmentId) throws Exception {
        return imp.downloadShipmentTransportationWaybillHttp(request, campaignId, shipmentId);
    }

    @ApiAction
    public Result getShipment(Http.Request request, Long campaignId,Long shipmentId) throws Exception {
        String valuecancelledOrders = request.getQueryString("cancelledOrders");
        Boolean cancelledOrders;
        if (valuecancelledOrders != null) {
            cancelledOrders = Boolean.valueOf(valuecancelledOrders);
        } else {
            cancelledOrders = true;
        }
        return imp.getShipmentHttp(request, campaignId, shipmentId, cancelledOrders);
    }

    @ApiAction
    public Result getShipmentOrdersInfo(Http.Request request, Long campaignId,Long shipmentId) throws Exception {
        return imp.getShipmentOrdersInfoHttp(request, campaignId, shipmentId);
    }

    @ApiAction
    public Result searchShipments(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodesearchShipmentsRequest = request.body().asJson();
        SearchShipmentsRequest searchShipmentsRequest;
        if (nodesearchShipmentsRequest != null) {
            searchShipmentsRequest = mapper.readValue(nodesearchShipmentsRequest.toString(), SearchShipmentsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(searchShipmentsRequest);
            }
        } else {
            throw new IllegalArgumentException("'SearchShipmentsRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.searchShipmentsHttp(request, campaignId, searchShipmentsRequest, pageToken, limit);
    }

    @ApiAction
    public Result setShipmentPalletsCount(Http.Request request, Long campaignId,Long shipmentId) throws Exception {
        JsonNode nodesetShipmentPalletsCountRequest = request.body().asJson();
        SetShipmentPalletsCountRequest setShipmentPalletsCountRequest;
        if (nodesetShipmentPalletsCountRequest != null) {
            setShipmentPalletsCountRequest = mapper.readValue(nodesetShipmentPalletsCountRequest.toString(), SetShipmentPalletsCountRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setShipmentPalletsCountRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetShipmentPalletsCountRequest' parameter is required");
        }
        return imp.setShipmentPalletsCountHttp(request, campaignId, shipmentId, setShipmentPalletsCountRequest);
    }

    @ApiAction
    public Result transferOrdersFromShipment(Http.Request request, Long campaignId,Long shipmentId) throws Exception {
        JsonNode nodetransferOrdersFromShipmentRequest = request.body().asJson();
        TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest;
        if (nodetransferOrdersFromShipmentRequest != null) {
            transferOrdersFromShipmentRequest = mapper.readValue(nodetransferOrdersFromShipmentRequest.toString(), TransferOrdersFromShipmentRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(transferOrdersFromShipmentRequest);
            }
        } else {
            throw new IllegalArgumentException("'TransferOrdersFromShipmentRequest' parameter is required");
        }
        return imp.transferOrdersFromShipmentHttp(request, campaignId, shipmentId, transferOrdersFromShipmentRequest);
    }

}
