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

#include "OAIGetOffersResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetOffersResponse::OAIGetOffersResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetOffersResponse::OAIGetOffersResponse() {
    this->initializeModel();
}

OAIGetOffersResponse::~OAIGetOffersResponse() {}

void OAIGetOffersResponse::initializeModel() {

    m_offers_isSet = false;
    m_offers_isValid = false;

    m_pager_isSet = false;
    m_pager_isValid = false;
}

void OAIGetOffersResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetOffersResponse::fromJsonObject(QJsonObject json) {

    m_offers_isValid = ::OpenAPI::fromJsonValue(offers, json[QString("offers")]);
    m_offers_isSet = !json[QString("offers")].isNull() && m_offers_isValid;

    m_pager_isValid = ::OpenAPI::fromJsonValue(pager, json[QString("pager")]);
    m_pager_isSet = !json[QString("pager")].isNull() && m_pager_isValid;
}

QString OAIGetOffersResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetOffersResponse::asJsonObject() const {
    QJsonObject obj;
    if (offers.size() > 0) {
        obj.insert(QString("offers"), ::OpenAPI::toJsonValue(offers));
    }
    if (pager.isSet()) {
        obj.insert(QString("pager"), ::OpenAPI::toJsonValue(pager));
    }
    return obj;
}

QList<OAIOfferDTO> OAIGetOffersResponse::getOffers() const {
    return offers;
}
void OAIGetOffersResponse::setOffers(const QList<OAIOfferDTO> &offers) {
    this->offers = offers;
    this->m_offers_isSet = true;
}

bool OAIGetOffersResponse::is_offers_Set() const{
    return m_offers_isSet;
}

bool OAIGetOffersResponse::is_offers_Valid() const{
    return m_offers_isValid;
}

OAIFlippingPagerDTO OAIGetOffersResponse::getPager() const {
    return pager;
}
void OAIGetOffersResponse::setPager(const OAIFlippingPagerDTO &pager) {
    this->pager = pager;
    this->m_pager_isSet = true;
}

bool OAIGetOffersResponse::is_pager_Set() const{
    return m_pager_isSet;
}

bool OAIGetOffersResponse::is_pager_Valid() const{
    return m_pager_isValid;
}

bool OAIGetOffersResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (offers.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (pager.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetOffersResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_offers_isValid && true;
}

} // namespace OpenAPI
