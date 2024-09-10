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

#include "OAIGetPromoOffersResultDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetPromoOffersResultDTO::OAIGetPromoOffersResultDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetPromoOffersResultDTO::OAIGetPromoOffersResultDTO() {
    this->initializeModel();
}

OAIGetPromoOffersResultDTO::~OAIGetPromoOffersResultDTO() {}

void OAIGetPromoOffersResultDTO::initializeModel() {

    m_offers_isSet = false;
    m_offers_isValid = false;

    m_paging_isSet = false;
    m_paging_isValid = false;
}

void OAIGetPromoOffersResultDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetPromoOffersResultDTO::fromJsonObject(QJsonObject json) {

    m_offers_isValid = ::OpenAPI::fromJsonValue(offers, json[QString("offers")]);
    m_offers_isSet = !json[QString("offers")].isNull() && m_offers_isValid;

    m_paging_isValid = ::OpenAPI::fromJsonValue(paging, json[QString("paging")]);
    m_paging_isSet = !json[QString("paging")].isNull() && m_paging_isValid;
}

QString OAIGetPromoOffersResultDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetPromoOffersResultDTO::asJsonObject() const {
    QJsonObject obj;
    if (offers.size() > 0) {
        obj.insert(QString("offers"), ::OpenAPI::toJsonValue(offers));
    }
    if (paging.isSet()) {
        obj.insert(QString("paging"), ::OpenAPI::toJsonValue(paging));
    }
    return obj;
}

QList<OAIGetPromoOfferDTO> OAIGetPromoOffersResultDTO::getOffers() const {
    return offers;
}
void OAIGetPromoOffersResultDTO::setOffers(const QList<OAIGetPromoOfferDTO> &offers) {
    this->offers = offers;
    this->m_offers_isSet = true;
}

bool OAIGetPromoOffersResultDTO::is_offers_Set() const{
    return m_offers_isSet;
}

bool OAIGetPromoOffersResultDTO::is_offers_Valid() const{
    return m_offers_isValid;
}

OAIForwardScrollingPagerDTO OAIGetPromoOffersResultDTO::getPaging() const {
    return paging;
}
void OAIGetPromoOffersResultDTO::setPaging(const OAIForwardScrollingPagerDTO &paging) {
    this->paging = paging;
    this->m_paging_isSet = true;
}

bool OAIGetPromoOffersResultDTO::is_paging_Set() const{
    return m_paging_isSet;
}

bool OAIGetPromoOffersResultDTO::is_paging_Valid() const{
    return m_paging_isValid;
}

bool OAIGetPromoOffersResultDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (offers.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (paging.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetPromoOffersResultDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_offers_isValid && true;
}

} // namespace OpenAPI
