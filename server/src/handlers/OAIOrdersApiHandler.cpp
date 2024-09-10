/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIOrdersApiHandler.h"
#include "OAIOrdersApiRequest.h"

namespace OpenAPI {

OAIOrdersApiHandler::OAIOrdersApiHandler(){

}

OAIOrdersApiHandler::~OAIOrdersApiHandler(){

}

void OAIOrdersApiHandler::acceptOrderCancellation(qint64 campaign_id, qint64 order_id, OAIAcceptOrderCancellationRequest oai_accept_order_cancellation_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(oai_accept_order_cancellation_request);
    auto reqObj = qobject_cast<OAIOrdersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIEmptyApiResponse res;
        reqObj->acceptOrderCancellationResponse(res);
    }
}
void OAIOrdersApiHandler::getOrder(qint64 campaign_id, qint64 order_id) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    auto reqObj = qobject_cast<OAIOrdersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIGetOrderResponse res;
        reqObj->getOrderResponse(res);
    }
}
void OAIOrdersApiHandler::getOrders(qint64 campaign_id, QList<qint64> order_ids, QSet<OAIOrderStatusType> status, QSet<OAIOrderSubstatusType> substatus, QDate from_date, QDate to_date, QDate supplier_shipment_date_from, QDate supplier_shipment_date_to, QDateTime updated_at_from, QDateTime updated_at_to, OAIOrderDeliveryDispatchType dispatch_type, bool fake, bool has_cis, bool only_waiting_for_cancellation_approve, bool only_estimated_delivery, OAIOrderBuyerType buyer_type, qint32 page, qint32 page_size, QString page_token, qint32 limit) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_ids);
    Q_UNUSED(status);
    Q_UNUSED(substatus);
    Q_UNUSED(from_date);
    Q_UNUSED(to_date);
    Q_UNUSED(supplier_shipment_date_from);
    Q_UNUSED(supplier_shipment_date_to);
    Q_UNUSED(updated_at_from);
    Q_UNUSED(updated_at_to);
    Q_UNUSED(dispatch_type);
    Q_UNUSED(fake);
    Q_UNUSED(has_cis);
    Q_UNUSED(only_waiting_for_cancellation_approve);
    Q_UNUSED(only_estimated_delivery);
    Q_UNUSED(buyer_type);
    Q_UNUSED(page);
    Q_UNUSED(page_size);
    Q_UNUSED(page_token);
    Q_UNUSED(limit);
    auto reqObj = qobject_cast<OAIOrdersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIGetOrdersResponse res;
        reqObj->getOrdersResponse(res);
    }
}
void OAIOrdersApiHandler::provideOrderDigitalCodes(qint64 campaign_id, qint64 order_id, OAIProvideOrderDigitalCodesRequest oai_provide_order_digital_codes_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(oai_provide_order_digital_codes_request);
    auto reqObj = qobject_cast<OAIOrdersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIEmptyApiResponse res;
        reqObj->provideOrderDigitalCodesResponse(res);
    }
}
void OAIOrdersApiHandler::provideOrderItemIdentifiers(qint64 campaign_id, qint64 order_id, OAIProvideOrderItemIdentifiersRequest oai_provide_order_item_identifiers_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(oai_provide_order_item_identifiers_request);
    auto reqObj = qobject_cast<OAIOrdersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIProvideOrderItemIdentifiersResponse res;
        reqObj->provideOrderItemIdentifiersResponse(res);
    }
}
void OAIOrdersApiHandler::setOrderBoxLayout(qint64 campaign_id, qint64 order_id, OAISetOrderBoxLayoutRequest oai_set_order_box_layout_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(oai_set_order_box_layout_request);
    auto reqObj = qobject_cast<OAIOrdersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAISetOrderBoxLayoutResponse res;
        reqObj->setOrderBoxLayoutResponse(res);
    }
}
void OAIOrdersApiHandler::setOrderShipmentBoxes(qint64 campaign_id, qint64 order_id, qint64 shipment_id, OAISetOrderShipmentBoxesRequest oai_set_order_shipment_boxes_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(shipment_id);
    Q_UNUSED(oai_set_order_shipment_boxes_request);
    auto reqObj = qobject_cast<OAIOrdersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAISetOrderShipmentBoxesResponse res;
        reqObj->setOrderShipmentBoxesResponse(res);
    }
}
void OAIOrdersApiHandler::updateOrderItems(qint64 campaign_id, qint64 order_id, OAIUpdateOrderItemRequest oai_update_order_item_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(oai_update_order_item_request);
    auto reqObj = qobject_cast<OAIOrdersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->updateOrderItemsResponse();
    }
}
void OAIOrdersApiHandler::updateOrderStatus(qint64 campaign_id, qint64 order_id, OAIUpdateOrderStatusRequest oai_update_order_status_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(oai_update_order_status_request);
    auto reqObj = qobject_cast<OAIOrdersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIUpdateOrderStatusResponse res;
        reqObj->updateOrderStatusResponse(res);
    }
}
void OAIOrdersApiHandler::updateOrderStatuses(qint64 campaign_id, OAIUpdateOrderStatusesRequest oai_update_order_statuses_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(oai_update_order_statuses_request);
    auto reqObj = qobject_cast<OAIOrdersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIUpdateOrderStatusesResponse res;
        reqObj->updateOrderStatusesResponse(res);
    }
}


}
