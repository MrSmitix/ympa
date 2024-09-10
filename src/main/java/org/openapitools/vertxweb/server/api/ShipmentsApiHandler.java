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

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class ShipmentsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ShipmentsApiHandler.class);

    private final ShipmentsApi api;

    public ShipmentsApiHandler(ShipmentsApi api) {
        this.api = api;
    }

    @Deprecated
    public ShipmentsApiHandler() {
        this(new ShipmentsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("confirmShipment").handler(this::confirmShipment);
        builder.operation("downloadShipmentAct").handler(this::downloadShipmentAct);
        builder.operation("downloadShipmentDiscrepancyAct").handler(this::downloadShipmentDiscrepancyAct);
        builder.operation("downloadShipmentInboundAct").handler(this::downloadShipmentInboundAct);
        builder.operation("downloadShipmentPalletLabels").handler(this::downloadShipmentPalletLabels);
        builder.operation("downloadShipmentReceptionTransferAct").handler(this::downloadShipmentReceptionTransferAct);
        builder.operation("downloadShipmentTransportationWaybill").handler(this::downloadShipmentTransportationWaybill);
        builder.operation("getShipment").handler(this::getShipment);
        builder.operation("getShipmentOrdersInfo").handler(this::getShipmentOrdersInfo);
        builder.operation("searchShipments").handler(this::searchShipments);
        builder.operation("setShipmentPalletsCount").handler(this::setShipmentPalletsCount);
        builder.operation("transferOrdersFromShipment").handler(this::transferOrdersFromShipment);
    }

    private void confirmShipment(RoutingContext routingContext) {
        logger.info("confirmShipment()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;
        RequestParameter body = requestParameters.body();
        ConfirmShipmentRequest confirmShipmentRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ConfirmShipmentRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter shipmentId is {}", shipmentId);
        logger.debug("Parameter confirmShipmentRequest is {}", confirmShipmentRequest);

        api.confirmShipment(campaignId, shipmentId, confirmShipmentRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void downloadShipmentAct(RoutingContext routingContext) {
        logger.info("downloadShipmentAct()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter shipmentId is {}", shipmentId);

        api.downloadShipmentAct(campaignId, shipmentId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void downloadShipmentDiscrepancyAct(RoutingContext routingContext) {
        logger.info("downloadShipmentDiscrepancyAct()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter shipmentId is {}", shipmentId);

        api.downloadShipmentDiscrepancyAct(campaignId, shipmentId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void downloadShipmentInboundAct(RoutingContext routingContext) {
        logger.info("downloadShipmentInboundAct()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter shipmentId is {}", shipmentId);

        api.downloadShipmentInboundAct(campaignId, shipmentId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void downloadShipmentPalletLabels(RoutingContext routingContext) {
        logger.info("downloadShipmentPalletLabels()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;
        ShipmentPalletLabelPageFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getShipmentPalletLabelPageFormatType() : ;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter shipmentId is {}", shipmentId);
        logger.debug("Parameter format is {}", format);

        api.downloadShipmentPalletLabels(campaignId, shipmentId, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void downloadShipmentReceptionTransferAct(RoutingContext routingContext) {
        logger.info("downloadShipmentReceptionTransferAct()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Integer warehouseId = requestParameters.queryParameter("warehouse_id") != null ? requestParameters.queryParameter("warehouse_id").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter warehouseId is {}", warehouseId);

        api.downloadShipmentReceptionTransferAct(campaignId, warehouseId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void downloadShipmentTransportationWaybill(RoutingContext routingContext) {
        logger.info("downloadShipmentTransportationWaybill()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter shipmentId is {}", shipmentId);

        api.downloadShipmentTransportationWaybill(campaignId, shipmentId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getShipment(RoutingContext routingContext) {
        logger.info("getShipment()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;
        Boolean cancelledOrders = requestParameters.queryParameter("cancelledOrders") != null ? requestParameters.queryParameter("cancelledOrders").getBoolean() : true;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter shipmentId is {}", shipmentId);
        logger.debug("Parameter cancelledOrders is {}", cancelledOrders);

        api.getShipment(campaignId, shipmentId, cancelledOrders)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getShipmentOrdersInfo(RoutingContext routingContext) {
        logger.info("getShipmentOrdersInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter shipmentId is {}", shipmentId);

        api.getShipmentOrdersInfo(campaignId, shipmentId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void searchShipments(RoutingContext routingContext) {
        logger.info("searchShipments()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SearchShipmentsRequest searchShipmentsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SearchShipmentsRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter searchShipmentsRequest is {}", searchShipmentsRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.searchShipments(campaignId, searchShipmentsRequest, pageToken, limit)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void setShipmentPalletsCount(RoutingContext routingContext) {
        logger.info("setShipmentPalletsCount()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SetShipmentPalletsCountRequest setShipmentPalletsCountRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SetShipmentPalletsCountRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter shipmentId is {}", shipmentId);
        logger.debug("Parameter setShipmentPalletsCountRequest is {}", setShipmentPalletsCountRequest);

        api.setShipmentPalletsCount(campaignId, shipmentId, setShipmentPalletsCountRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void transferOrdersFromShipment(RoutingContext routingContext) {
        logger.info("transferOrdersFromShipment()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;
        RequestParameter body = requestParameters.body();
        TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<TransferOrdersFromShipmentRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter shipmentId is {}", shipmentId);
        logger.debug("Parameter transferOrdersFromShipmentRequest is {}", transferOrdersFromShipmentRequest);

        api.transferOrdersFromShipment(campaignId, shipmentId, transferOrdersFromShipmentRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
