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

#include "OAIRejectedPromoOfferUpdateDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRejectedPromoOfferUpdateDTO::OAIRejectedPromoOfferUpdateDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRejectedPromoOfferUpdateDTO::OAIRejectedPromoOfferUpdateDTO() {
    this->initializeModel();
}

OAIRejectedPromoOfferUpdateDTO::~OAIRejectedPromoOfferUpdateDTO() {}

void OAIRejectedPromoOfferUpdateDTO::initializeModel() {

    m_offer_id_isSet = false;
    m_offer_id_isValid = false;

    m_reason_isSet = false;
    m_reason_isValid = false;
}

void OAIRejectedPromoOfferUpdateDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRejectedPromoOfferUpdateDTO::fromJsonObject(QJsonObject json) {

    m_offer_id_isValid = ::OpenAPI::fromJsonValue(offer_id, json[QString("offerId")]);
    m_offer_id_isSet = !json[QString("offerId")].isNull() && m_offer_id_isValid;

    m_reason_isValid = ::OpenAPI::fromJsonValue(reason, json[QString("reason")]);
    m_reason_isSet = !json[QString("reason")].isNull() && m_reason_isValid;
}

QString OAIRejectedPromoOfferUpdateDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRejectedPromoOfferUpdateDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_offer_id_isSet) {
        obj.insert(QString("offerId"), ::OpenAPI::toJsonValue(offer_id));
    }
    if (reason.isSet()) {
        obj.insert(QString("reason"), ::OpenAPI::toJsonValue(reason));
    }
    return obj;
}

QString OAIRejectedPromoOfferUpdateDTO::getOfferId() const {
    return offer_id;
}
void OAIRejectedPromoOfferUpdateDTO::setOfferId(const QString &offer_id) {
    this->offer_id = offer_id;
    this->m_offer_id_isSet = true;
}

bool OAIRejectedPromoOfferUpdateDTO::is_offer_id_Set() const{
    return m_offer_id_isSet;
}

bool OAIRejectedPromoOfferUpdateDTO::is_offer_id_Valid() const{
    return m_offer_id_isValid;
}

OAIRejectedPromoOfferUpdateReasonType OAIRejectedPromoOfferUpdateDTO::getReason() const {
    return reason;
}
void OAIRejectedPromoOfferUpdateDTO::setReason(const OAIRejectedPromoOfferUpdateReasonType &reason) {
    this->reason = reason;
    this->m_reason_isSet = true;
}

bool OAIRejectedPromoOfferUpdateDTO::is_reason_Set() const{
    return m_reason_isSet;
}

bool OAIRejectedPromoOfferUpdateDTO::is_reason_Valid() const{
    return m_reason_isValid;
}

bool OAIRejectedPromoOfferUpdateDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_offer_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (reason.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRejectedPromoOfferUpdateDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_offer_id_isValid && m_reason_isValid && true;
}

} // namespace OpenAPI
