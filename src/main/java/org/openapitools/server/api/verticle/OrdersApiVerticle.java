package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AcceptOrderCancellationRequest;
import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOrderResponse;
import org.openapitools.server.api.model.GetOrdersResponse;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.OrderBuyerType;
import org.openapitools.server.api.model.OrderDeliveryDispatchType;
import org.openapitools.server.api.model.OrderStatusType;
import org.openapitools.server.api.model.OrderSubstatusType;
import org.openapitools.server.api.model.ProvideOrderDigitalCodesRequest;
import org.openapitools.server.api.model.ProvideOrderItemIdentifiersRequest;
import org.openapitools.server.api.model.ProvideOrderItemIdentifiersResponse;
import java.util.Set;
import org.openapitools.server.api.model.SetOrderBoxLayoutRequest;
import org.openapitools.server.api.model.SetOrderBoxLayoutResponse;
import org.openapitools.server.api.model.SetOrderShipmentBoxesRequest;
import org.openapitools.server.api.model.SetOrderShipmentBoxesResponse;
import org.openapitools.server.api.model.UpdateOrderItemRequest;
import org.openapitools.server.api.model.UpdateOrderStatusRequest;
import org.openapitools.server.api.model.UpdateOrderStatusResponse;
import org.openapitools.server.api.model.UpdateOrderStatusesRequest;
import org.openapitools.server.api.model.UpdateOrderStatusesResponse;

import java.util.List;
import java.util.Map;

public class OrdersApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OrdersApiVerticle.class);

    static final String ACCEPTORDERCANCELLATION_SERVICE_ID = "acceptOrderCancellation";
    static final String GETORDER_SERVICE_ID = "getOrder";
    static final String GETORDERS_SERVICE_ID = "getOrders";
    static final String PROVIDEORDERDIGITALCODES_SERVICE_ID = "provideOrderDigitalCodes";
    static final String PROVIDEORDERITEMIDENTIFIERS_SERVICE_ID = "provideOrderItemIdentifiers";
    static final String SETORDERBOXLAYOUT_SERVICE_ID = "setOrderBoxLayout";
    static final String SETORDERSHIPMENTBOXES_SERVICE_ID = "setOrderShipmentBoxes";
    static final String UPDATEORDERITEMS_SERVICE_ID = "updateOrderItems";
    static final String UPDATEORDERSTATUS_SERVICE_ID = "updateOrderStatus";
    static final String UPDATEORDERSTATUSES_SERVICE_ID = "updateOrderStatuses";
    
    final OrdersApi service;

    public OrdersApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OrdersApiImpl");
            service = (OrdersApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OrdersApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for acceptOrderCancellation
        vertx.eventBus().<JsonObject> consumer(ACCEPTORDERCANCELLATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "acceptOrderCancellation";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                JsonObject acceptOrderCancellationRequestParam = message.body().getJsonObject("AcceptOrderCancellationRequest");
                if (acceptOrderCancellationRequestParam == null) {
                    manageError(message, new MainApiException(400, "AcceptOrderCancellationRequest is required"), serviceId);
                    return;
                }
                AcceptOrderCancellationRequest acceptOrderCancellationRequest = Json.mapper.readValue(acceptOrderCancellationRequestParam.encode(), AcceptOrderCancellationRequest.class);
                service.acceptOrderCancellation(campaignId, orderId, acceptOrderCancellationRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "acceptOrderCancellation");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("acceptOrderCancellation", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOrder
        vertx.eventBus().<JsonObject> consumer(GETORDER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrder";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                service.getOrder(campaignId, orderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrder");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrder", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOrders
        vertx.eventBus().<JsonObject> consumer(GETORDERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrders";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonArray orderIdsParam = message.body().getJsonArray("orderIds");
                List<Long> orderIds = (orderIdsParam == null) ? null : Json.mapper.readValue(orderIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Long.class));
                JsonArray statusParam = message.body().getJsonArray("status");
                Set<OrderStatusType> status = (statusParam == null) ? null : Json.mapper.readValue(statusParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, OrderStatusType.class));
                JsonArray substatusParam = message.body().getJsonArray("substatus");
                Set<OrderSubstatusType> substatus = (substatusParam == null) ? null : Json.mapper.readValue(substatusParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, OrderSubstatusType.class));
                String fromDateParam = message.body().getString("fromDate");
                LocalDate fromDate = (fromDateParam == null) ? null : Json.mapper.readValue(fromDateParam, LocalDate.class);
                String toDateParam = message.body().getString("toDate");
                LocalDate toDate = (toDateParam == null) ? null : Json.mapper.readValue(toDateParam, LocalDate.class);
                String supplierShipmentDateFromParam = message.body().getString("supplierShipmentDateFrom");
                LocalDate supplierShipmentDateFrom = (supplierShipmentDateFromParam == null) ? null : Json.mapper.readValue(supplierShipmentDateFromParam, LocalDate.class);
                String supplierShipmentDateToParam = message.body().getString("supplierShipmentDateTo");
                LocalDate supplierShipmentDateTo = (supplierShipmentDateToParam == null) ? null : Json.mapper.readValue(supplierShipmentDateToParam, LocalDate.class);
                String updatedAtFromParam = message.body().getString("updatedAtFrom");
                OffsetDateTime updatedAtFrom = (updatedAtFromParam == null) ? null : Json.mapper.readValue(updatedAtFromParam, OffsetDateTime.class);
                String updatedAtToParam = message.body().getString("updatedAtTo");
                OffsetDateTime updatedAtTo = (updatedAtToParam == null) ? null : Json.mapper.readValue(updatedAtToParam, OffsetDateTime.class);
                JsonObject dispatchTypeParam = message.body().getJsonObject("dispatchType");
                if (dispatchTypeParam == null) {
                    manageError(message, new MainApiException(400, "dispatchType is required"), serviceId);
                    return;
                }
                OrderDeliveryDispatchType dispatchType = Json.mapper.readValue(dispatchTypeParam.encode(), OrderDeliveryDispatchType.class);
                String fakeParam = message.body().getString("fake");
                Boolean fake = (fakeParam == null) ? false : Json.mapper.readValue(fakeParam, Boolean.class);
                String hasCisParam = message.body().getString("hasCis");
                Boolean hasCis = (hasCisParam == null) ? false : Json.mapper.readValue(hasCisParam, Boolean.class);
                String onlyWaitingForCancellationApproveParam = message.body().getString("onlyWaitingForCancellationApprove");
                Boolean onlyWaitingForCancellationApprove = (onlyWaitingForCancellationApproveParam == null) ? false : Json.mapper.readValue(onlyWaitingForCancellationApproveParam, Boolean.class);
                String onlyEstimatedDeliveryParam = message.body().getString("onlyEstimatedDelivery");
                Boolean onlyEstimatedDelivery = (onlyEstimatedDeliveryParam == null) ? false : Json.mapper.readValue(onlyEstimatedDeliveryParam, Boolean.class);
                JsonObject buyerTypeParam = message.body().getJsonObject("buyerType");
                if (buyerTypeParam == null) {
                    manageError(message, new MainApiException(400, "buyerType is required"), serviceId);
                    return;
                }
                OrderBuyerType buyerType = Json.mapper.readValue(buyerTypeParam.encode(), OrderBuyerType.class);
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrders");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrders", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for provideOrderDigitalCodes
        vertx.eventBus().<JsonObject> consumer(PROVIDEORDERDIGITALCODES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "provideOrderDigitalCodes";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                JsonObject provideOrderDigitalCodesRequestParam = message.body().getJsonObject("ProvideOrderDigitalCodesRequest");
                if (provideOrderDigitalCodesRequestParam == null) {
                    manageError(message, new MainApiException(400, "ProvideOrderDigitalCodesRequest is required"), serviceId);
                    return;
                }
                ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest = Json.mapper.readValue(provideOrderDigitalCodesRequestParam.encode(), ProvideOrderDigitalCodesRequest.class);
                service.provideOrderDigitalCodes(campaignId, orderId, provideOrderDigitalCodesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "provideOrderDigitalCodes");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("provideOrderDigitalCodes", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for provideOrderItemIdentifiers
        vertx.eventBus().<JsonObject> consumer(PROVIDEORDERITEMIDENTIFIERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "provideOrderItemIdentifiers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                JsonObject provideOrderItemIdentifiersRequestParam = message.body().getJsonObject("ProvideOrderItemIdentifiersRequest");
                if (provideOrderItemIdentifiersRequestParam == null) {
                    manageError(message, new MainApiException(400, "ProvideOrderItemIdentifiersRequest is required"), serviceId);
                    return;
                }
                ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest = Json.mapper.readValue(provideOrderItemIdentifiersRequestParam.encode(), ProvideOrderItemIdentifiersRequest.class);
                service.provideOrderItemIdentifiers(campaignId, orderId, provideOrderItemIdentifiersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "provideOrderItemIdentifiers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("provideOrderItemIdentifiers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for setOrderBoxLayout
        vertx.eventBus().<JsonObject> consumer(SETORDERBOXLAYOUT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "setOrderBoxLayout";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                JsonObject setOrderBoxLayoutRequestParam = message.body().getJsonObject("SetOrderBoxLayoutRequest");
                if (setOrderBoxLayoutRequestParam == null) {
                    manageError(message, new MainApiException(400, "SetOrderBoxLayoutRequest is required"), serviceId);
                    return;
                }
                SetOrderBoxLayoutRequest setOrderBoxLayoutRequest = Json.mapper.readValue(setOrderBoxLayoutRequestParam.encode(), SetOrderBoxLayoutRequest.class);
                service.setOrderBoxLayout(campaignId, orderId, setOrderBoxLayoutRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "setOrderBoxLayout");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("setOrderBoxLayout", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for setOrderShipmentBoxes
        vertx.eventBus().<JsonObject> consumer(SETORDERSHIPMENTBOXES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "setOrderShipmentBoxes";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                JsonObject setOrderShipmentBoxesRequestParam = message.body().getJsonObject("SetOrderShipmentBoxesRequest");
                if (setOrderShipmentBoxesRequestParam == null) {
                    manageError(message, new MainApiException(400, "SetOrderShipmentBoxesRequest is required"), serviceId);
                    return;
                }
                SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest = Json.mapper.readValue(setOrderShipmentBoxesRequestParam.encode(), SetOrderShipmentBoxesRequest.class);
                service.setOrderShipmentBoxes(campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "setOrderShipmentBoxes");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("setOrderShipmentBoxes", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOrderItems
        vertx.eventBus().<JsonObject> consumer(UPDATEORDERITEMS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOrderItems";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                JsonObject updateOrderItemRequestParam = message.body().getJsonObject("UpdateOrderItemRequest");
                if (updateOrderItemRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOrderItemRequest is required"), serviceId);
                    return;
                }
                UpdateOrderItemRequest updateOrderItemRequest = Json.mapper.readValue(updateOrderItemRequestParam.encode(), UpdateOrderItemRequest.class);
                service.updateOrderItems(campaignId, orderId, updateOrderItemRequest, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOrderItems");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOrderItems", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOrderStatus
        vertx.eventBus().<JsonObject> consumer(UPDATEORDERSTATUS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOrderStatus";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                JsonObject updateOrderStatusRequestParam = message.body().getJsonObject("UpdateOrderStatusRequest");
                if (updateOrderStatusRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOrderStatusRequest is required"), serviceId);
                    return;
                }
                UpdateOrderStatusRequest updateOrderStatusRequest = Json.mapper.readValue(updateOrderStatusRequestParam.encode(), UpdateOrderStatusRequest.class);
                service.updateOrderStatus(campaignId, orderId, updateOrderStatusRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOrderStatus");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOrderStatus", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOrderStatuses
        vertx.eventBus().<JsonObject> consumer(UPDATEORDERSTATUSES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOrderStatuses";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject updateOrderStatusesRequestParam = message.body().getJsonObject("UpdateOrderStatusesRequest");
                if (updateOrderStatusesRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOrderStatusesRequest is required"), serviceId);
                    return;
                }
                UpdateOrderStatusesRequest updateOrderStatusesRequest = Json.mapper.readValue(updateOrderStatusesRequestParam.encode(), UpdateOrderStatusesRequest.class);
                service.updateOrderStatuses(campaignId, updateOrderStatusesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOrderStatuses");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOrderStatuses", e);
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
