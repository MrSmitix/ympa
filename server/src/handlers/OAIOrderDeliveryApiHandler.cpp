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

#include "OAIOrderDeliveryApiHandler.h"
#include "OAIOrderDeliveryApiRequest.h"

namespace OpenAPI {

OAIOrderDeliveryApiHandler::OAIOrderDeliveryApiHandler(){

}

OAIOrderDeliveryApiHandler::~OAIOrderDeliveryApiHandler(){

}

void OAIOrderDeliveryApiHandler::getOrderBuyerInfo(qint64 campaign_id, qint64 order_id) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    auto reqObj = qobject_cast<OAIOrderDeliveryApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIGetOrderBuyerInfoResponse res;
        reqObj->getOrderBuyerInfoResponse(res);
    }
}
void OAIOrderDeliveryApiHandler::setOrderDeliveryDate(qint64 campaign_id, qint64 order_id, OAISetOrderDeliveryDateRequest oai_set_order_delivery_date_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(oai_set_order_delivery_date_request);
    auto reqObj = qobject_cast<OAIOrderDeliveryApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIEmptyApiResponse res;
        reqObj->setOrderDeliveryDateResponse(res);
    }
}
void OAIOrderDeliveryApiHandler::setOrderDeliveryTrackCode(qint64 campaign_id, qint64 order_id, OAISetOrderDeliveryTrackCodeRequest oai_set_order_delivery_track_code_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(oai_set_order_delivery_track_code_request);
    auto reqObj = qobject_cast<OAIOrderDeliveryApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIEmptyApiResponse res;
        reqObj->setOrderDeliveryTrackCodeResponse(res);
    }
}
void OAIOrderDeliveryApiHandler::updateOrderStorageLimit(qint64 campaign_id, qint64 order_id, OAIUpdateOrderStorageLimitRequest oai_update_order_storage_limit_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(oai_update_order_storage_limit_request);
    auto reqObj = qobject_cast<OAIOrderDeliveryApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIEmptyApiResponse res;
        reqObj->updateOrderStorageLimitResponse(res);
    }
}
void OAIOrderDeliveryApiHandler::verifyOrderEac(qint64 campaign_id, qint64 order_id, OAIVerifyOrderEacRequest oai_verify_order_eac_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(oai_verify_order_eac_request);
    auto reqObj = qobject_cast<OAIOrderDeliveryApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIVerifyOrderEacResponse res;
        reqObj->verifyOrderEacResponse(res);
    }
}


}
