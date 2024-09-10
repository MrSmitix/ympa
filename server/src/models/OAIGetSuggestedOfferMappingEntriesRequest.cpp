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

#include "OAIGetSuggestedOfferMappingEntriesRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetSuggestedOfferMappingEntriesRequest::OAIGetSuggestedOfferMappingEntriesRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetSuggestedOfferMappingEntriesRequest::OAIGetSuggestedOfferMappingEntriesRequest() {
    this->initializeModel();
}

OAIGetSuggestedOfferMappingEntriesRequest::~OAIGetSuggestedOfferMappingEntriesRequest() {}

void OAIGetSuggestedOfferMappingEntriesRequest::initializeModel() {

    m_offers_isSet = false;
    m_offers_isValid = false;
}

void OAIGetSuggestedOfferMappingEntriesRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetSuggestedOfferMappingEntriesRequest::fromJsonObject(QJsonObject json) {

    m_offers_isValid = ::OpenAPI::fromJsonValue(offers, json[QString("offers")]);
    m_offers_isSet = !json[QString("offers")].isNull() && m_offers_isValid;
}

QString OAIGetSuggestedOfferMappingEntriesRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetSuggestedOfferMappingEntriesRequest::asJsonObject() const {
    QJsonObject obj;
    if (offers.size() > 0) {
        obj.insert(QString("offers"), ::OpenAPI::toJsonValue(offers));
    }
    return obj;
}

QList<OAIMappingsOfferDTO> OAIGetSuggestedOfferMappingEntriesRequest::getOffers() const {
    return offers;
}
void OAIGetSuggestedOfferMappingEntriesRequest::setOffers(const QList<OAIMappingsOfferDTO> &offers) {
    this->offers = offers;
    this->m_offers_isSet = true;
}

bool OAIGetSuggestedOfferMappingEntriesRequest::is_offers_Set() const{
    return m_offers_isSet;
}

bool OAIGetSuggestedOfferMappingEntriesRequest::is_offers_Valid() const{
    return m_offers_isValid;
}

bool OAIGetSuggestedOfferMappingEntriesRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (offers.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetSuggestedOfferMappingEntriesRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_offers_isValid && true;
}

} // namespace OpenAPI
