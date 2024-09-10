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

#include "OAIOfferPriceResponseDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOfferPriceResponseDTO::OAIOfferPriceResponseDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOfferPriceResponseDTO::OAIOfferPriceResponseDTO() {
    this->initializeModel();
}

OAIOfferPriceResponseDTO::~OAIOfferPriceResponseDTO() {}

void OAIOfferPriceResponseDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_price_isSet = false;
    m_price_isValid = false;

    m_market_sku_isSet = false;
    m_market_sku_isValid = false;

    m_updated_at_isSet = false;
    m_updated_at_isValid = false;
}

void OAIOfferPriceResponseDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOfferPriceResponseDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_price_isValid = ::OpenAPI::fromJsonValue(price, json[QString("price")]);
    m_price_isSet = !json[QString("price")].isNull() && m_price_isValid;

    m_market_sku_isValid = ::OpenAPI::fromJsonValue(market_sku, json[QString("marketSku")]);
    m_market_sku_isSet = !json[QString("marketSku")].isNull() && m_market_sku_isValid;

    m_updated_at_isValid = ::OpenAPI::fromJsonValue(updated_at, json[QString("updatedAt")]);
    m_updated_at_isSet = !json[QString("updatedAt")].isNull() && m_updated_at_isValid;
}

QString OAIOfferPriceResponseDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOfferPriceResponseDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (price.isSet()) {
        obj.insert(QString("price"), ::OpenAPI::toJsonValue(price));
    }
    if (m_market_sku_isSet) {
        obj.insert(QString("marketSku"), ::OpenAPI::toJsonValue(market_sku));
    }
    if (m_updated_at_isSet) {
        obj.insert(QString("updatedAt"), ::OpenAPI::toJsonValue(updated_at));
    }
    return obj;
}

QString OAIOfferPriceResponseDTO::getId() const {
    return id;
}
void OAIOfferPriceResponseDTO::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIOfferPriceResponseDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIOfferPriceResponseDTO::is_id_Valid() const{
    return m_id_isValid;
}

OAIPriceDTO OAIOfferPriceResponseDTO::getPrice() const {
    return price;
}
void OAIOfferPriceResponseDTO::setPrice(const OAIPriceDTO &price) {
    this->price = price;
    this->m_price_isSet = true;
}

bool OAIOfferPriceResponseDTO::is_price_Set() const{
    return m_price_isSet;
}

bool OAIOfferPriceResponseDTO::is_price_Valid() const{
    return m_price_isValid;
}

qint64 OAIOfferPriceResponseDTO::getMarketSku() const {
    return market_sku;
}
void OAIOfferPriceResponseDTO::setMarketSku(const qint64 &market_sku) {
    this->market_sku = market_sku;
    this->m_market_sku_isSet = true;
}

bool OAIOfferPriceResponseDTO::is_market_sku_Set() const{
    return m_market_sku_isSet;
}

bool OAIOfferPriceResponseDTO::is_market_sku_Valid() const{
    return m_market_sku_isValid;
}

QDateTime OAIOfferPriceResponseDTO::getUpdatedAt() const {
    return updated_at;
}
void OAIOfferPriceResponseDTO::setUpdatedAt(const QDateTime &updated_at) {
    this->updated_at = updated_at;
    this->m_updated_at_isSet = true;
}

bool OAIOfferPriceResponseDTO::is_updated_at_Set() const{
    return m_updated_at_isSet;
}

bool OAIOfferPriceResponseDTO::is_updated_at_Valid() const{
    return m_updated_at_isValid;
}

bool OAIOfferPriceResponseDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (price.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_market_sku_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_updated_at_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOfferPriceResponseDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
