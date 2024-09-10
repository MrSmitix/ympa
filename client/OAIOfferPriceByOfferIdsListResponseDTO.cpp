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

#include "OAIOfferPriceByOfferIdsListResponseDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOfferPriceByOfferIdsListResponseDTO::OAIOfferPriceByOfferIdsListResponseDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOfferPriceByOfferIdsListResponseDTO::OAIOfferPriceByOfferIdsListResponseDTO() {
    this->initializeModel();
}

OAIOfferPriceByOfferIdsListResponseDTO::~OAIOfferPriceByOfferIdsListResponseDTO() {}

void OAIOfferPriceByOfferIdsListResponseDTO::initializeModel() {

    m_offers_isSet = false;
    m_offers_isValid = false;

    m_paging_isSet = false;
    m_paging_isValid = false;
}

void OAIOfferPriceByOfferIdsListResponseDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOfferPriceByOfferIdsListResponseDTO::fromJsonObject(QJsonObject json) {

    m_offers_isValid = ::OpenAPI::fromJsonValue(m_offers, json[QString("offers")]);
    m_offers_isSet = !json[QString("offers")].isNull() && m_offers_isValid;

    m_paging_isValid = ::OpenAPI::fromJsonValue(m_paging, json[QString("paging")]);
    m_paging_isSet = !json[QString("paging")].isNull() && m_paging_isValid;
}

QString OAIOfferPriceByOfferIdsListResponseDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOfferPriceByOfferIdsListResponseDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_offers.size() > 0) {
        obj.insert(QString("offers"), ::OpenAPI::toJsonValue(m_offers));
    }
    if (m_paging.isSet()) {
        obj.insert(QString("paging"), ::OpenAPI::toJsonValue(m_paging));
    }
    return obj;
}

QList<OAIOfferPriceByOfferIdsResponseDTO> OAIOfferPriceByOfferIdsListResponseDTO::getOffers() const {
    return m_offers;
}
void OAIOfferPriceByOfferIdsListResponseDTO::setOffers(const QList<OAIOfferPriceByOfferIdsResponseDTO> &offers) {
    m_offers = offers;
    m_offers_isSet = true;
}

bool OAIOfferPriceByOfferIdsListResponseDTO::is_offers_Set() const{
    return m_offers_isSet;
}

bool OAIOfferPriceByOfferIdsListResponseDTO::is_offers_Valid() const{
    return m_offers_isValid;
}

OAIScrollingPagerDTO OAIOfferPriceByOfferIdsListResponseDTO::getPaging() const {
    return m_paging;
}
void OAIOfferPriceByOfferIdsListResponseDTO::setPaging(const OAIScrollingPagerDTO &paging) {
    m_paging = paging;
    m_paging_isSet = true;
}

bool OAIOfferPriceByOfferIdsListResponseDTO::is_paging_Set() const{
    return m_paging_isSet;
}

bool OAIOfferPriceByOfferIdsListResponseDTO::is_paging_Valid() const{
    return m_paging_isValid;
}

bool OAIOfferPriceByOfferIdsListResponseDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_offers.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_paging.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOfferPriceByOfferIdsListResponseDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_offers_isValid && true;
}

} // namespace OpenAPI
