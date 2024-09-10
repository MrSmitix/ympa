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

#include "OAIModelsApiHandler.h"
#include "OAIModelsApiRequest.h"

namespace OpenAPI {

OAIModelsApiHandler::OAIModelsApiHandler(){

}

OAIModelsApiHandler::~OAIModelsApiHandler(){

}

void OAIModelsApiHandler::getModel(qint64 model_id, qint64 region_id, OAICurrencyType currency) {
    Q_UNUSED(model_id);
    Q_UNUSED(region_id);
    Q_UNUSED(currency);
    auto reqObj = qobject_cast<OAIModelsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIGetModelsResponse res;
        reqObj->getModelResponse(res);
    }
}
void OAIModelsApiHandler::getModelOffers(qint64 model_id, qint64 region_id, OAICurrencyType currency, OAISortOrderType order_by_price, qint32 count, qint32 page) {
    Q_UNUSED(model_id);
    Q_UNUSED(region_id);
    Q_UNUSED(currency);
    Q_UNUSED(order_by_price);
    Q_UNUSED(count);
    Q_UNUSED(page);
    auto reqObj = qobject_cast<OAIModelsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIGetModelsOffersResponse res;
        reqObj->getModelOffersResponse(res);
    }
}
void OAIModelsApiHandler::getModels(qint64 region_id, OAIGetModelsRequest oai_get_models_request, OAICurrencyType currency) {
    Q_UNUSED(region_id);
    Q_UNUSED(oai_get_models_request);
    Q_UNUSED(currency);
    auto reqObj = qobject_cast<OAIModelsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIGetModelsResponse res;
        reqObj->getModelsResponse(res);
    }
}
void OAIModelsApiHandler::getModelsOffers(qint64 region_id, OAIGetModelsRequest oai_get_models_request, OAICurrencyType currency, OAISortOrderType order_by_price) {
    Q_UNUSED(region_id);
    Q_UNUSED(oai_get_models_request);
    Q_UNUSED(currency);
    Q_UNUSED(order_by_price);
    auto reqObj = qobject_cast<OAIModelsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIGetModelsOffersResponse res;
        reqObj->getModelsOffersResponse(res);
    }
}
void OAIModelsApiHandler::searchModels(QString query, qint64 region_id, OAICurrencyType currency, qint32 page, qint32 page_size) {
    Q_UNUSED(query);
    Q_UNUSED(region_id);
    Q_UNUSED(currency);
    Q_UNUSED(page);
    Q_UNUSED(page_size);
    auto reqObj = qobject_cast<OAIModelsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAISearchModelsResponse res;
        reqObj->searchModelsResponse(res);
    }
}


}
