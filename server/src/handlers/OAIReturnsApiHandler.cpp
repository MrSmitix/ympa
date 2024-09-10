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

#include "OAIReturnsApiHandler.h"
#include "OAIReturnsApiRequest.h"

namespace OpenAPI {

OAIReturnsApiHandler::OAIReturnsApiHandler(){

}

OAIReturnsApiHandler::~OAIReturnsApiHandler(){

}

void OAIReturnsApiHandler::getReturn(qint64 campaign_id, qint64 order_id, qint64 return_id) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(return_id);
    auto reqObj = qobject_cast<OAIReturnsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIGetReturnResponse res;
        reqObj->getReturnResponse(res);
    }
}
void OAIReturnsApiHandler::getReturnApplication(qint64 campaign_id, qint64 order_id, qint64 return_id) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(return_id);
    auto reqObj = qobject_cast<OAIReturnsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIHttpFileElement res;
        reqObj->getReturnApplicationResponse(res);
    }
}
void OAIReturnsApiHandler::getReturnPhoto(qint64 campaign_id, qint64 order_id, qint64 return_id, qint64 item_id, QString image_hash) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(return_id);
    Q_UNUSED(item_id);
    Q_UNUSED(image_hash);
    auto reqObj = qobject_cast<OAIReturnsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIHttpFileElement res;
        reqObj->getReturnPhotoResponse(res);
    }
}
void OAIReturnsApiHandler::getReturns(qint64 campaign_id, QString page_token, qint32 limit, QList<qint64> order_ids, QList<OAIRefundStatusType> statuses, OAIReturnType type, QDate from_date, QDate to_date, QDate from_date2, QDate to_date2) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(page_token);
    Q_UNUSED(limit);
    Q_UNUSED(order_ids);
    Q_UNUSED(statuses);
    Q_UNUSED(type);
    Q_UNUSED(from_date);
    Q_UNUSED(to_date);
    Q_UNUSED(from_date2);
    Q_UNUSED(to_date2);
    auto reqObj = qobject_cast<OAIReturnsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIGetReturnsResponse res;
        reqObj->getReturnsResponse(res);
    }
}
void OAIReturnsApiHandler::setReturnDecision(qint64 campaign_id, qint64 order_id, qint64 return_id, OAISetReturnDecisionRequest oai_set_return_decision_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(return_id);
    Q_UNUSED(oai_set_return_decision_request);
    auto reqObj = qobject_cast<OAIReturnsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIEmptyApiResponse res;
        reqObj->setReturnDecisionResponse(res);
    }
}
void OAIReturnsApiHandler::submitReturnDecision(qint64 campaign_id, qint64 order_id, qint64 return_id) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(order_id);
    Q_UNUSED(return_id);
    auto reqObj = qobject_cast<OAIReturnsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIEmptyApiResponse res;
        reqObj->submitReturnDecisionResponse(res);
    }
}


}
