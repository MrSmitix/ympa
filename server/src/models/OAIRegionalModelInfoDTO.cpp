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

#include "OAIRegionalModelInfoDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRegionalModelInfoDTO::OAIRegionalModelInfoDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRegionalModelInfoDTO::OAIRegionalModelInfoDTO() {
    this->initializeModel();
}

OAIRegionalModelInfoDTO::~OAIRegionalModelInfoDTO() {}

void OAIRegionalModelInfoDTO::initializeModel() {

    m_currency_isSet = false;
    m_currency_isValid = false;

    m_region_id_isSet = false;
    m_region_id_isValid = false;
}

void OAIRegionalModelInfoDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRegionalModelInfoDTO::fromJsonObject(QJsonObject json) {

    m_currency_isValid = ::OpenAPI::fromJsonValue(currency, json[QString("currency")]);
    m_currency_isSet = !json[QString("currency")].isNull() && m_currency_isValid;

    m_region_id_isValid = ::OpenAPI::fromJsonValue(region_id, json[QString("regionId")]);
    m_region_id_isSet = !json[QString("regionId")].isNull() && m_region_id_isValid;
}

QString OAIRegionalModelInfoDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRegionalModelInfoDTO::asJsonObject() const {
    QJsonObject obj;
    if (currency.isSet()) {
        obj.insert(QString("currency"), ::OpenAPI::toJsonValue(currency));
    }
    if (m_region_id_isSet) {
        obj.insert(QString("regionId"), ::OpenAPI::toJsonValue(region_id));
    }
    return obj;
}

OAICurrencyType OAIRegionalModelInfoDTO::getCurrency() const {
    return currency;
}
void OAIRegionalModelInfoDTO::setCurrency(const OAICurrencyType &currency) {
    this->currency = currency;
    this->m_currency_isSet = true;
}

bool OAIRegionalModelInfoDTO::is_currency_Set() const{
    return m_currency_isSet;
}

bool OAIRegionalModelInfoDTO::is_currency_Valid() const{
    return m_currency_isValid;
}

qint64 OAIRegionalModelInfoDTO::getRegionId() const {
    return region_id;
}
void OAIRegionalModelInfoDTO::setRegionId(const qint64 &region_id) {
    this->region_id = region_id;
    this->m_region_id_isSet = true;
}

bool OAIRegionalModelInfoDTO::is_region_id_Set() const{
    return m_region_id_isSet;
}

bool OAIRegionalModelInfoDTO::is_region_id_Valid() const{
    return m_region_id_isValid;
}

bool OAIRegionalModelInfoDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (currency.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_region_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRegionalModelInfoDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
