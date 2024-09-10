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

#include "OAIHiddenOffersApiHandler.h"
#include "OAIHiddenOffersApiRequest.h"

namespace OpenAPI {

OAIHiddenOffersApiHandler::OAIHiddenOffersApiHandler(){

}

OAIHiddenOffersApiHandler::~OAIHiddenOffersApiHandler(){

}

void OAIHiddenOffersApiHandler::addHiddenOffers(qint64 campaign_id, OAIAddHiddenOffersRequest oai_add_hidden_offers_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(oai_add_hidden_offers_request);
    auto reqObj = qobject_cast<OAIHiddenOffersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIEmptyApiResponse res;
        reqObj->addHiddenOffersResponse(res);
    }
}
void OAIHiddenOffersApiHandler::deleteHiddenOffers(qint64 campaign_id, OAIDeleteHiddenOffersRequest oai_delete_hidden_offers_request) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(oai_delete_hidden_offers_request);
    auto reqObj = qobject_cast<OAIHiddenOffersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIEmptyApiResponse res;
        reqObj->deleteHiddenOffersResponse(res);
    }
}
void OAIHiddenOffersApiHandler::getHiddenOffers(qint64 campaign_id, QList<QString> offer_id, QString page_token, qint32 limit, qint32 offset, qint32 page, qint32 page_size) {
    Q_UNUSED(campaign_id);
    Q_UNUSED(offer_id);
    Q_UNUSED(page_token);
    Q_UNUSED(limit);
    Q_UNUSED(offset);
    Q_UNUSED(page);
    Q_UNUSED(page_size);
    auto reqObj = qobject_cast<OAIHiddenOffersApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIGetHiddenOffersResponse res;
        reqObj->getHiddenOffersResponse(res);
    }
}


}
