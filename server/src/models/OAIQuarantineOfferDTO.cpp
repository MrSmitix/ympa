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

#include "OAIQuarantineOfferDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIQuarantineOfferDTO::OAIQuarantineOfferDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIQuarantineOfferDTO::OAIQuarantineOfferDTO() {
    this->initializeModel();
}

OAIQuarantineOfferDTO::~OAIQuarantineOfferDTO() {}

void OAIQuarantineOfferDTO::initializeModel() {

    m_offer_id_isSet = false;
    m_offer_id_isValid = false;

    m_current_price_isSet = false;
    m_current_price_isValid = false;

    m_last_valid_price_isSet = false;
    m_last_valid_price_isValid = false;

    m_verdicts_isSet = false;
    m_verdicts_isValid = false;
}

void OAIQuarantineOfferDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIQuarantineOfferDTO::fromJsonObject(QJsonObject json) {

    m_offer_id_isValid = ::OpenAPI::fromJsonValue(offer_id, json[QString("offerId")]);
    m_offer_id_isSet = !json[QString("offerId")].isNull() && m_offer_id_isValid;

    m_current_price_isValid = ::OpenAPI::fromJsonValue(current_price, json[QString("currentPrice")]);
    m_current_price_isSet = !json[QString("currentPrice")].isNull() && m_current_price_isValid;

    m_last_valid_price_isValid = ::OpenAPI::fromJsonValue(last_valid_price, json[QString("lastValidPrice")]);
    m_last_valid_price_isSet = !json[QString("lastValidPrice")].isNull() && m_last_valid_price_isValid;

    m_verdicts_isValid = ::OpenAPI::fromJsonValue(verdicts, json[QString("verdicts")]);
    m_verdicts_isSet = !json[QString("verdicts")].isNull() && m_verdicts_isValid;
}

QString OAIQuarantineOfferDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIQuarantineOfferDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_offer_id_isSet) {
        obj.insert(QString("offerId"), ::OpenAPI::toJsonValue(offer_id));
    }
    if (current_price.isSet()) {
        obj.insert(QString("currentPrice"), ::OpenAPI::toJsonValue(current_price));
    }
    if (last_valid_price.isSet()) {
        obj.insert(QString("lastValidPrice"), ::OpenAPI::toJsonValue(last_valid_price));
    }
    if (verdicts.size() > 0) {
        obj.insert(QString("verdicts"), ::OpenAPI::toJsonValue(verdicts));
    }
    return obj;
}

QString OAIQuarantineOfferDTO::getOfferId() const {
    return offer_id;
}
void OAIQuarantineOfferDTO::setOfferId(const QString &offer_id) {
    this->offer_id = offer_id;
    this->m_offer_id_isSet = true;
}

bool OAIQuarantineOfferDTO::is_offer_id_Set() const{
    return m_offer_id_isSet;
}

bool OAIQuarantineOfferDTO::is_offer_id_Valid() const{
    return m_offer_id_isValid;
}

OAIBasePriceDTO OAIQuarantineOfferDTO::getCurrentPrice() const {
    return current_price;
}
void OAIQuarantineOfferDTO::setCurrentPrice(const OAIBasePriceDTO &current_price) {
    this->current_price = current_price;
    this->m_current_price_isSet = true;
}

bool OAIQuarantineOfferDTO::is_current_price_Set() const{
    return m_current_price_isSet;
}

bool OAIQuarantineOfferDTO::is_current_price_Valid() const{
    return m_current_price_isValid;
}

OAIBasePriceDTO OAIQuarantineOfferDTO::getLastValidPrice() const {
    return last_valid_price;
}
void OAIQuarantineOfferDTO::setLastValidPrice(const OAIBasePriceDTO &last_valid_price) {
    this->last_valid_price = last_valid_price;
    this->m_last_valid_price_isSet = true;
}

bool OAIQuarantineOfferDTO::is_last_valid_price_Set() const{
    return m_last_valid_price_isSet;
}

bool OAIQuarantineOfferDTO::is_last_valid_price_Valid() const{
    return m_last_valid_price_isValid;
}

QList<OAIPriceQuarantineVerdictDTO> OAIQuarantineOfferDTO::getVerdicts() const {
    return verdicts;
}
void OAIQuarantineOfferDTO::setVerdicts(const QList<OAIPriceQuarantineVerdictDTO> &verdicts) {
    this->verdicts = verdicts;
    this->m_verdicts_isSet = true;
}

bool OAIQuarantineOfferDTO::is_verdicts_Set() const{
    return m_verdicts_isSet;
}

bool OAIQuarantineOfferDTO::is_verdicts_Valid() const{
    return m_verdicts_isValid;
}

bool OAIQuarantineOfferDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_offer_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (current_price.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (last_valid_price.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (verdicts.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIQuarantineOfferDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
