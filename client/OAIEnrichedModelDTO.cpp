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

#include "OAIEnrichedModelDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIEnrichedModelDTO::OAIEnrichedModelDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIEnrichedModelDTO::OAIEnrichedModelDTO() {
    this->initializeModel();
}

OAIEnrichedModelDTO::~OAIEnrichedModelDTO() {}

void OAIEnrichedModelDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_prices_isSet = false;
    m_prices_isValid = false;

    m_offers_isSet = false;
    m_offers_isValid = false;

    m_offline_offers_isSet = false;
    m_offline_offers_isValid = false;

    m_online_offers_isSet = false;
    m_online_offers_isValid = false;
}

void OAIEnrichedModelDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIEnrichedModelDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_prices_isValid = ::OpenAPI::fromJsonValue(m_prices, json[QString("prices")]);
    m_prices_isSet = !json[QString("prices")].isNull() && m_prices_isValid;

    m_offers_isValid = ::OpenAPI::fromJsonValue(m_offers, json[QString("offers")]);
    m_offers_isSet = !json[QString("offers")].isNull() && m_offers_isValid;

    m_offline_offers_isValid = ::OpenAPI::fromJsonValue(m_offline_offers, json[QString("offlineOffers")]);
    m_offline_offers_isSet = !json[QString("offlineOffers")].isNull() && m_offline_offers_isValid;

    m_online_offers_isValid = ::OpenAPI::fromJsonValue(m_online_offers, json[QString("onlineOffers")]);
    m_online_offers_isSet = !json[QString("onlineOffers")].isNull() && m_online_offers_isValid;
}

QString OAIEnrichedModelDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIEnrichedModelDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(m_name));
    }
    if (m_prices.isSet()) {
        obj.insert(QString("prices"), ::OpenAPI::toJsonValue(m_prices));
    }
    if (m_offers.size() > 0) {
        obj.insert(QString("offers"), ::OpenAPI::toJsonValue(m_offers));
    }
    if (m_offline_offers_isSet) {
        obj.insert(QString("offlineOffers"), ::OpenAPI::toJsonValue(m_offline_offers));
    }
    if (m_online_offers_isSet) {
        obj.insert(QString("onlineOffers"), ::OpenAPI::toJsonValue(m_online_offers));
    }
    return obj;
}

qint64 OAIEnrichedModelDTO::getId() const {
    return m_id;
}
void OAIEnrichedModelDTO::setId(const qint64 &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIEnrichedModelDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIEnrichedModelDTO::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIEnrichedModelDTO::getName() const {
    return m_name;
}
void OAIEnrichedModelDTO::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool OAIEnrichedModelDTO::is_name_Set() const{
    return m_name_isSet;
}

bool OAIEnrichedModelDTO::is_name_Valid() const{
    return m_name_isValid;
}

OAIModelPriceDTO OAIEnrichedModelDTO::getPrices() const {
    return m_prices;
}
void OAIEnrichedModelDTO::setPrices(const OAIModelPriceDTO &prices) {
    m_prices = prices;
    m_prices_isSet = true;
}

bool OAIEnrichedModelDTO::is_prices_Set() const{
    return m_prices_isSet;
}

bool OAIEnrichedModelDTO::is_prices_Valid() const{
    return m_prices_isValid;
}

QList<OAIModelOfferDTO> OAIEnrichedModelDTO::getOffers() const {
    return m_offers;
}
void OAIEnrichedModelDTO::setOffers(const QList<OAIModelOfferDTO> &offers) {
    m_offers = offers;
    m_offers_isSet = true;
}

bool OAIEnrichedModelDTO::is_offers_Set() const{
    return m_offers_isSet;
}

bool OAIEnrichedModelDTO::is_offers_Valid() const{
    return m_offers_isValid;
}

qint32 OAIEnrichedModelDTO::getOfflineOffers() const {
    return m_offline_offers;
}
void OAIEnrichedModelDTO::setOfflineOffers(const qint32 &offline_offers) {
    m_offline_offers = offline_offers;
    m_offline_offers_isSet = true;
}

bool OAIEnrichedModelDTO::is_offline_offers_Set() const{
    return m_offline_offers_isSet;
}

bool OAIEnrichedModelDTO::is_offline_offers_Valid() const{
    return m_offline_offers_isValid;
}

qint32 OAIEnrichedModelDTO::getOnlineOffers() const {
    return m_online_offers;
}
void OAIEnrichedModelDTO::setOnlineOffers(const qint32 &online_offers) {
    m_online_offers = online_offers;
    m_online_offers_isSet = true;
}

bool OAIEnrichedModelDTO::is_online_offers_Set() const{
    return m_online_offers_isSet;
}

bool OAIEnrichedModelDTO::is_online_offers_Valid() const{
    return m_online_offers_isValid;
}

bool OAIEnrichedModelDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_prices.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_offers.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_offline_offers_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_online_offers_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIEnrichedModelDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
