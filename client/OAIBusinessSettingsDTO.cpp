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

#include "OAIBusinessSettingsDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBusinessSettingsDTO::OAIBusinessSettingsDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBusinessSettingsDTO::OAIBusinessSettingsDTO() {
    this->initializeModel();
}

OAIBusinessSettingsDTO::~OAIBusinessSettingsDTO() {}

void OAIBusinessSettingsDTO::initializeModel() {

    m_only_default_price_isSet = false;
    m_only_default_price_isValid = false;

    m_currency_isSet = false;
    m_currency_isValid = false;
}

void OAIBusinessSettingsDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBusinessSettingsDTO::fromJsonObject(QJsonObject json) {

    m_only_default_price_isValid = ::OpenAPI::fromJsonValue(m_only_default_price, json[QString("onlyDefaultPrice")]);
    m_only_default_price_isSet = !json[QString("onlyDefaultPrice")].isNull() && m_only_default_price_isValid;

    m_currency_isValid = ::OpenAPI::fromJsonValue(m_currency, json[QString("currency")]);
    m_currency_isSet = !json[QString("currency")].isNull() && m_currency_isValid;
}

QString OAIBusinessSettingsDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBusinessSettingsDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_only_default_price_isSet) {
        obj.insert(QString("onlyDefaultPrice"), ::OpenAPI::toJsonValue(m_only_default_price));
    }
    if (m_currency.isSet()) {
        obj.insert(QString("currency"), ::OpenAPI::toJsonValue(m_currency));
    }
    return obj;
}

bool OAIBusinessSettingsDTO::isOnlyDefaultPrice() const {
    return m_only_default_price;
}
void OAIBusinessSettingsDTO::setOnlyDefaultPrice(const bool &only_default_price) {
    m_only_default_price = only_default_price;
    m_only_default_price_isSet = true;
}

bool OAIBusinessSettingsDTO::is_only_default_price_Set() const{
    return m_only_default_price_isSet;
}

bool OAIBusinessSettingsDTO::is_only_default_price_Valid() const{
    return m_only_default_price_isValid;
}

OAICurrencyType OAIBusinessSettingsDTO::getCurrency() const {
    return m_currency;
}
void OAIBusinessSettingsDTO::setCurrency(const OAICurrencyType &currency) {
    m_currency = currency;
    m_currency_isSet = true;
}

bool OAIBusinessSettingsDTO::is_currency_Set() const{
    return m_currency_isSet;
}

bool OAIBusinessSettingsDTO::is_currency_Valid() const{
    return m_currency_isValid;
}

bool OAIBusinessSettingsDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_only_default_price_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_currency.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBusinessSettingsDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
