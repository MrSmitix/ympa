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

#include "OAIUpdateMappingDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUpdateMappingDTO::OAIUpdateMappingDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUpdateMappingDTO::OAIUpdateMappingDTO() {
    this->initializeModel();
}

OAIUpdateMappingDTO::~OAIUpdateMappingDTO() {}

void OAIUpdateMappingDTO::initializeModel() {

    m_market_sku_isSet = false;
    m_market_sku_isValid = false;
}

void OAIUpdateMappingDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUpdateMappingDTO::fromJsonObject(QJsonObject json) {

    m_market_sku_isValid = ::OpenAPI::fromJsonValue(market_sku, json[QString("marketSku")]);
    m_market_sku_isSet = !json[QString("marketSku")].isNull() && m_market_sku_isValid;
}

QString OAIUpdateMappingDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUpdateMappingDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_market_sku_isSet) {
        obj.insert(QString("marketSku"), ::OpenAPI::toJsonValue(market_sku));
    }
    return obj;
}

qint64 OAIUpdateMappingDTO::getMarketSku() const {
    return market_sku;
}
void OAIUpdateMappingDTO::setMarketSku(const qint64 &market_sku) {
    this->market_sku = market_sku;
    this->m_market_sku_isSet = true;
}

bool OAIUpdateMappingDTO::is_market_sku_Set() const{
    return m_market_sku_isSet;
}

bool OAIUpdateMappingDTO::is_market_sku_Valid() const{
    return m_market_sku_isValid;
}

bool OAIUpdateMappingDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_market_sku_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUpdateMappingDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
