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

#include "OAIGetPricesByOfferIdsRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetPricesByOfferIdsRequest::OAIGetPricesByOfferIdsRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetPricesByOfferIdsRequest::OAIGetPricesByOfferIdsRequest() {
    this->initializeModel();
}

OAIGetPricesByOfferIdsRequest::~OAIGetPricesByOfferIdsRequest() {}

void OAIGetPricesByOfferIdsRequest::initializeModel() {

    m_offer_ids_isSet = false;
    m_offer_ids_isValid = false;
}

void OAIGetPricesByOfferIdsRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetPricesByOfferIdsRequest::fromJsonObject(QJsonObject json) {

    m_offer_ids_isValid = ::OpenAPI::fromJsonValue(offer_ids, json[QString("offerIds")]);
    m_offer_ids_isSet = !json[QString("offerIds")].isNull() && m_offer_ids_isValid;
}

QString OAIGetPricesByOfferIdsRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetPricesByOfferIdsRequest::asJsonObject() const {
    QJsonObject obj;
    if (offer_ids.size() > 0) {
        obj.insert(QString("offerIds"), ::OpenAPI::toJsonValue(offer_ids));
    }
    return obj;
}

QList<QString> OAIGetPricesByOfferIdsRequest::getOfferIds() const {
    return offer_ids;
}
void OAIGetPricesByOfferIdsRequest::setOfferIds(const QList<QString> &offer_ids) {
    this->offer_ids = offer_ids;
    this->m_offer_ids_isSet = true;
}

bool OAIGetPricesByOfferIdsRequest::is_offer_ids_Set() const{
    return m_offer_ids_isSet;
}

bool OAIGetPricesByOfferIdsRequest::is_offer_ids_Valid() const{
    return m_offer_ids_isValid;
}

bool OAIGetPricesByOfferIdsRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (offer_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetPricesByOfferIdsRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
