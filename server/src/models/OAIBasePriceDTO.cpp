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

#include "OAIBasePriceDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBasePriceDTO::OAIBasePriceDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBasePriceDTO::OAIBasePriceDTO() {
    this->initializeModel();
}

OAIBasePriceDTO::~OAIBasePriceDTO() {}

void OAIBasePriceDTO::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;

    m_currency_id_isSet = false;
    m_currency_id_isValid = false;
}

void OAIBasePriceDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBasePriceDTO::fromJsonObject(QJsonObject json) {

    m_value_isValid = ::OpenAPI::fromJsonValue(value, json[QString("value")]);
    m_value_isSet = !json[QString("value")].isNull() && m_value_isValid;

    m_currency_id_isValid = ::OpenAPI::fromJsonValue(currency_id, json[QString("currencyId")]);
    m_currency_id_isSet = !json[QString("currencyId")].isNull() && m_currency_id_isValid;
}

QString OAIBasePriceDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBasePriceDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_value_isSet) {
        obj.insert(QString("value"), ::OpenAPI::toJsonValue(value));
    }
    if (currency_id.isSet()) {
        obj.insert(QString("currencyId"), ::OpenAPI::toJsonValue(currency_id));
    }
    return obj;
}

double OAIBasePriceDTO::getValue() const {
    return value;
}
void OAIBasePriceDTO::setValue(const double &value) {
    this->value = value;
    this->m_value_isSet = true;
}

bool OAIBasePriceDTO::is_value_Set() const{
    return m_value_isSet;
}

bool OAIBasePriceDTO::is_value_Valid() const{
    return m_value_isValid;
}

OAICurrencyType OAIBasePriceDTO::getCurrencyId() const {
    return currency_id;
}
void OAIBasePriceDTO::setCurrencyId(const OAICurrencyType &currency_id) {
    this->currency_id = currency_id;
    this->m_currency_id_isSet = true;
}

bool OAIBasePriceDTO::is_currency_id_Set() const{
    return m_currency_id_isSet;
}

bool OAIBasePriceDTO::is_currency_id_Valid() const{
    return m_currency_id_isValid;
}

bool OAIBasePriceDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_value_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (currency_id.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBasePriceDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid && m_currency_id_isValid && true;
}

} // namespace OpenAPI
