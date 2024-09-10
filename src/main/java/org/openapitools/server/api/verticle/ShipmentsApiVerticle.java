package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

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

import java.util.List;
import java.util.Map;

public class ShipmentsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ShipmentsApiVerticle.class);

    static final String CONFIRMSHIPMENT_SERVICE_ID = "confirmShipment";
    static final String DOWNLOADSHIPMENTACT_SERVICE_ID = "downloadShipmentAct";
    static final String DOWNLOADSHIPMENTDISCREPANCYACT_SERVICE_ID = "downloadShipmentDiscrepancyAct";
    static final String DOWNLOADSHIPMENTINBOUNDACT_SERVICE_ID = "downloadShipmentInboundAct";
    static final String DOWNLOADSHIPMENTPALLETLABELS_SERVICE_ID = "downloadShipmentPalletLabels";
    static final String DOWNLOADSHIPMENTRECEPTIONTRANSFERACT_SERVICE_ID = "downloadShipmentReceptionTransferAct";
    static final String DOWNLOADSHIPMENTTRANSPORTATIONWAYBILL_SERVICE_ID = "downloadShipmentTransportationWaybill";
    static final String GETSHIPMENT_SERVICE_ID = "getShipment";
    static final String GETSHIPMENTORDERSINFO_SERVICE_ID = "getShipmentOrdersInfo";
    static final String SEARCHSHIPMENTS_SERVICE_ID = "searchShipments";
    static final String SETSHIPMENTPALLETSCOUNT_SERVICE_ID = "setShipmentPalletsCount";
    static final String TRANSFERORDERSFROMSHIPMENT_SERVICE_ID = "transferOrdersFromShipment";
    
    final ShipmentsApi service;

    public ShipmentsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ShipmentsApiImpl");
            service = (ShipmentsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ShipmentsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for confirmShipment
        vertx.eventBus().<JsonObject> consumer(CONFIRMSHIPMENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "confirmShipment";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                JsonObject confirmShipmentRequestParam = message.body().getJsonObject("ConfirmShipmentRequest");
                if (confirmShipmentRequestParam == null) {
                    manageError(message, new MainApiException(400, "ConfirmShipmentRequest is required"), serviceId);
                    return;
                }
                ConfirmShipmentRequest confirmShipmentRequest = Json.mapper.readValue(confirmShipmentRequestParam.encode(), ConfirmShipmentRequest.class);
                service.confirmShipment(campaignId, shipmentId, confirmShipmentRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "confirmShipment");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("confirmShipment", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for downloadShipmentAct
        vertx.eventBus().<JsonObject> consumer(DOWNLOADSHIPMENTACT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "downloadShipmentAct";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                service.downloadShipmentAct(campaignId, shipmentId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "downloadShipmentAct");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("downloadShipmentAct", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for downloadShipmentDiscrepancyAct
        vertx.eventBus().<JsonObject> consumer(DOWNLOADSHIPMENTDISCREPANCYACT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "downloadShipmentDiscrepancyAct";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                service.downloadShipmentDiscrepancyAct(campaignId, shipmentId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "downloadShipmentDiscrepancyAct");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("downloadShipmentDiscrepancyAct", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for downloadShipmentInboundAct
        vertx.eventBus().<JsonObject> consumer(DOWNLOADSHIPMENTINBOUNDACT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "downloadShipmentInboundAct";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                service.downloadShipmentInboundAct(campaignId, shipmentId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "downloadShipmentInboundAct");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("downloadShipmentInboundAct", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for downloadShipmentPalletLabels
        vertx.eventBus().<JsonObject> consumer(DOWNLOADSHIPMENTPALLETLABELS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "downloadShipmentPalletLabels";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ShipmentPalletLabelPageFormatType format = Json.mapper.readValue(formatParam.encode(), ShipmentPalletLabelPageFormatType.class);
                service.downloadShipmentPalletLabels(campaignId, shipmentId, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "downloadShipmentPalletLabels");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("downloadShipmentPalletLabels", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for downloadShipmentReceptionTransferAct
        vertx.eventBus().<JsonObject> consumer(DOWNLOADSHIPMENTRECEPTIONTRANSFERACT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "downloadShipmentReceptionTransferAct";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String warehouseIdParam = message.body().getString("warehouse_id");
                Integer warehouseId = (warehouseIdParam == null) ? null : Json.mapper.readValue(warehouseIdParam, Integer.class);
                service.downloadShipmentReceptionTransferAct(campaignId, warehouseId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "downloadShipmentReceptionTransferAct");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("downloadShipmentReceptionTransferAct", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for downloadShipmentTransportationWaybill
        vertx.eventBus().<JsonObject> consumer(DOWNLOADSHIPMENTTRANSPORTATIONWAYBILL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "downloadShipmentTransportationWaybill";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                service.downloadShipmentTransportationWaybill(campaignId, shipmentId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "downloadShipmentTransportationWaybill");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("downloadShipmentTransportationWaybill", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getShipment
        vertx.eventBus().<JsonObject> consumer(GETSHIPMENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getShipment";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                String cancelledOrdersParam = message.body().getString("cancelledOrders");
                Boolean cancelledOrders = (cancelledOrdersParam == null) ? true : Json.mapper.readValue(cancelledOrdersParam, Boolean.class);
                service.getShipment(campaignId, shipmentId, cancelledOrders, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getShipment");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getShipment", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getShipmentOrdersInfo
        vertx.eventBus().<JsonObject> consumer(GETSHIPMENTORDERSINFO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getShipmentOrdersInfo";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                service.getShipmentOrdersInfo(campaignId, shipmentId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getShipmentOrdersInfo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getShipmentOrdersInfo", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for searchShipments
        vertx.eventBus().<JsonObject> consumer(SEARCHSHIPMENTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "searchShipments";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject searchShipmentsRequestParam = message.body().getJsonObject("SearchShipmentsRequest");
                if (searchShipmentsRequestParam == null) {
                    manageError(message, new MainApiException(400, "SearchShipmentsRequest is required"), serviceId);
                    return;
                }
                SearchShipmentsRequest searchShipmentsRequest = Json.mapper.readValue(searchShipmentsRequestParam.encode(), SearchShipmentsRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.searchShipments(campaignId, searchShipmentsRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "searchShipments");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("searchShipments", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for setShipmentPalletsCount
        vertx.eventBus().<JsonObject> consumer(SETSHIPMENTPALLETSCOUNT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "setShipmentPalletsCount";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                JsonObject setShipmentPalletsCountRequestParam = message.body().getJsonObject("SetShipmentPalletsCountRequest");
                if (setShipmentPalletsCountRequestParam == null) {
                    manageError(message, new MainApiException(400, "SetShipmentPalletsCountRequest is required"), serviceId);
                    return;
                }
                SetShipmentPalletsCountRequest setShipmentPalletsCountRequest = Json.mapper.readValue(setShipmentPalletsCountRequestParam.encode(), SetShipmentPalletsCountRequest.class);
                service.setShipmentPalletsCount(campaignId, shipmentId, setShipmentPalletsCountRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "setShipmentPalletsCount");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("setShipmentPalletsCount", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for transferOrdersFromShipment
        vertx.eventBus().<JsonObject> consumer(TRANSFERORDERSFROMSHIPMENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "transferOrdersFromShipment";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                JsonObject transferOrdersFromShipmentRequestParam = message.body().getJsonObject("TransferOrdersFromShipmentRequest");
                if (transferOrdersFromShipmentRequestParam == null) {
                    manageError(message, new MainApiException(400, "TransferOrdersFromShipmentRequest is required"), serviceId);
                    return;
                }
                TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest = Json.mapper.readValue(transferOrdersFromShipmentRequestParam.encode(), TransferOrdersFromShipmentRequest.class);
                service.transferOrdersFromShipment(campaignId, shipmentId, transferOrdersFromShipmentRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "transferOrdersFromShipment");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("transferOrdersFromShipment", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
