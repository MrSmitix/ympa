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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class ShipmentsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result confirmShipmentHttp(Http.Request request, Long campaignId, Long shipmentId, ConfirmShipmentRequest confirmShipmentRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = confirmShipment(request, campaignId, shipmentId, confirmShipmentRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse confirmShipment(Http.Request request, Long campaignId, Long shipmentId, ConfirmShipmentRequest confirmShipmentRequest) throws Exception;

    public Result downloadShipmentActHttp(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = downloadShipmentAct(request, campaignId, shipmentId);

        return ok(obj);

    }

    public abstract InputStream downloadShipmentAct(Http.Request request, Long campaignId, Long shipmentId) throws Exception;

    public Result downloadShipmentDiscrepancyActHttp(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = downloadShipmentDiscrepancyAct(request, campaignId, shipmentId);

        return ok(obj);

    }

    public abstract InputStream downloadShipmentDiscrepancyAct(Http.Request request, Long campaignId, Long shipmentId) throws Exception;

    public Result downloadShipmentInboundActHttp(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = downloadShipmentInboundAct(request, campaignId, shipmentId);

        return ok(obj);

    }

    public abstract InputStream downloadShipmentInboundAct(Http.Request request, Long campaignId, Long shipmentId) throws Exception;

    public Result downloadShipmentPalletLabelsHttp(Http.Request request, Long campaignId, Long shipmentId, ShipmentPalletLabelPageFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = downloadShipmentPalletLabels(request, campaignId, shipmentId, format);

        return ok(obj);

    }

    public abstract InputStream downloadShipmentPalletLabels(Http.Request request, Long campaignId, Long shipmentId, ShipmentPalletLabelPageFormatType format) throws Exception;

    public Result downloadShipmentReceptionTransferActHttp(Http.Request request, Long campaignId, Integer warehouseId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = downloadShipmentReceptionTransferAct(request, campaignId, warehouseId);

        return ok(obj);

    }

    public abstract InputStream downloadShipmentReceptionTransferAct(Http.Request request, Long campaignId, Integer warehouseId) throws Exception;

    public Result downloadShipmentTransportationWaybillHttp(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        InputStream obj = downloadShipmentTransportationWaybill(request, campaignId, shipmentId);

        return ok(obj);

    }

    public abstract InputStream downloadShipmentTransportationWaybill(Http.Request request, Long campaignId, Long shipmentId) throws Exception;

    public Result getShipmentHttp(Http.Request request, Long campaignId, Long shipmentId, Boolean cancelledOrders) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetShipmentResponse obj = getShipment(request, campaignId, shipmentId, cancelledOrders);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetShipmentResponse getShipment(Http.Request request, Long campaignId, Long shipmentId, Boolean cancelledOrders) throws Exception;

    public Result getShipmentOrdersInfoHttp(Http.Request request, Long campaignId, Long shipmentId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetShipmentOrdersInfoResponse obj = getShipmentOrdersInfo(request, campaignId, shipmentId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetShipmentOrdersInfoResponse getShipmentOrdersInfo(Http.Request request, Long campaignId, Long shipmentId) throws Exception;

    public Result searchShipmentsHttp(Http.Request request, Long campaignId, SearchShipmentsRequest searchShipmentsRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        SearchShipmentsResponse obj = searchShipments(request, campaignId, searchShipmentsRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SearchShipmentsResponse searchShipments(Http.Request request, Long campaignId, SearchShipmentsRequest searchShipmentsRequest, String pageToken, Integer limit) throws Exception;

    public Result setShipmentPalletsCountHttp(Http.Request request, Long campaignId, Long shipmentId, SetShipmentPalletsCountRequest setShipmentPalletsCountRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = setShipmentPalletsCount(request, campaignId, shipmentId, setShipmentPalletsCountRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse setShipmentPalletsCount(Http.Request request, Long campaignId, Long shipmentId, SetShipmentPalletsCountRequest setShipmentPalletsCountRequest) throws Exception;

    public Result transferOrdersFromShipmentHttp(Http.Request request, Long campaignId, Long shipmentId, TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = transferOrdersFromShipment(request, campaignId, shipmentId, transferOrdersFromShipmentRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse transferOrdersFromShipment(Http.Request request, Long campaignId, Long shipmentId, TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest) throws Exception;

}
