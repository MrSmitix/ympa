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

#include "OAISuggestedOfferMappingDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISuggestedOfferMappingDTO::OAISuggestedOfferMappingDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISuggestedOfferMappingDTO::OAISuggestedOfferMappingDTO() {
    this->initializeModel();
}

OAISuggestedOfferMappingDTO::~OAISuggestedOfferMappingDTO() {}

void OAISuggestedOfferMappingDTO::initializeModel() {

    m_offer_isSet = false;
    m_offer_isValid = false;

    m_mapping_isSet = false;
    m_mapping_isValid = false;
}

void OAISuggestedOfferMappingDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISuggestedOfferMappingDTO::fromJsonObject(QJsonObject json) {

    m_offer_isValid = ::OpenAPI::fromJsonValue(offer, json[QString("offer")]);
    m_offer_isSet = !json[QString("offer")].isNull() && m_offer_isValid;

    m_mapping_isValid = ::OpenAPI::fromJsonValue(mapping, json[QString("mapping")]);
    m_mapping_isSet = !json[QString("mapping")].isNull() && m_mapping_isValid;
}

QString OAISuggestedOfferMappingDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISuggestedOfferMappingDTO::asJsonObject() const {
    QJsonObject obj;
    if (offer.isSet()) {
        obj.insert(QString("offer"), ::OpenAPI::toJsonValue(offer));
    }
    if (mapping.isSet()) {
        obj.insert(QString("mapping"), ::OpenAPI::toJsonValue(mapping));
    }
    return obj;
}

OAISuggestedOfferDTO OAISuggestedOfferMappingDTO::getOffer() const {
    return offer;
}
void OAISuggestedOfferMappingDTO::setOffer(const OAISuggestedOfferDTO &offer) {
    this->offer = offer;
    this->m_offer_isSet = true;
}

bool OAISuggestedOfferMappingDTO::is_offer_Set() const{
    return m_offer_isSet;
}

bool OAISuggestedOfferMappingDTO::is_offer_Valid() const{
    return m_offer_isValid;
}

OAIGetMappingDTO OAISuggestedOfferMappingDTO::getMapping() const {
    return mapping;
}
void OAISuggestedOfferMappingDTO::setMapping(const OAIGetMappingDTO &mapping) {
    this->mapping = mapping;
    this->m_mapping_isSet = true;
}

bool OAISuggestedOfferMappingDTO::is_mapping_Set() const{
    return m_mapping_isSet;
}

bool OAISuggestedOfferMappingDTO::is_mapping_Valid() const{
    return m_mapping_isValid;
}

bool OAISuggestedOfferMappingDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (offer.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (mapping.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISuggestedOfferMappingDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
