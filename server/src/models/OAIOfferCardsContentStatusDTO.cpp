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

#include "OAIOfferCardsContentStatusDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOfferCardsContentStatusDTO::OAIOfferCardsContentStatusDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOfferCardsContentStatusDTO::OAIOfferCardsContentStatusDTO() {
    this->initializeModel();
}

OAIOfferCardsContentStatusDTO::~OAIOfferCardsContentStatusDTO() {}

void OAIOfferCardsContentStatusDTO::initializeModel() {

    m_offer_cards_isSet = false;
    m_offer_cards_isValid = false;

    m_paging_isSet = false;
    m_paging_isValid = false;
}

void OAIOfferCardsContentStatusDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOfferCardsContentStatusDTO::fromJsonObject(QJsonObject json) {

    m_offer_cards_isValid = ::OpenAPI::fromJsonValue(offer_cards, json[QString("offerCards")]);
    m_offer_cards_isSet = !json[QString("offerCards")].isNull() && m_offer_cards_isValid;

    m_paging_isValid = ::OpenAPI::fromJsonValue(paging, json[QString("paging")]);
    m_paging_isSet = !json[QString("paging")].isNull() && m_paging_isValid;
}

QString OAIOfferCardsContentStatusDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOfferCardsContentStatusDTO::asJsonObject() const {
    QJsonObject obj;
    if (offer_cards.size() > 0) {
        obj.insert(QString("offerCards"), ::OpenAPI::toJsonValue(offer_cards));
    }
    if (paging.isSet()) {
        obj.insert(QString("paging"), ::OpenAPI::toJsonValue(paging));
    }
    return obj;
}

QList<OAIOfferCardDTO> OAIOfferCardsContentStatusDTO::getOfferCards() const {
    return offer_cards;
}
void OAIOfferCardsContentStatusDTO::setOfferCards(const QList<OAIOfferCardDTO> &offer_cards) {
    this->offer_cards = offer_cards;
    this->m_offer_cards_isSet = true;
}

bool OAIOfferCardsContentStatusDTO::is_offer_cards_Set() const{
    return m_offer_cards_isSet;
}

bool OAIOfferCardsContentStatusDTO::is_offer_cards_Valid() const{
    return m_offer_cards_isValid;
}

OAIForwardScrollingPagerDTO OAIOfferCardsContentStatusDTO::getPaging() const {
    return paging;
}
void OAIOfferCardsContentStatusDTO::setPaging(const OAIForwardScrollingPagerDTO &paging) {
    this->paging = paging;
    this->m_paging_isSet = true;
}

bool OAIOfferCardsContentStatusDTO::is_paging_Set() const{
    return m_paging_isSet;
}

bool OAIOfferCardsContentStatusDTO::is_paging_Valid() const{
    return m_paging_isValid;
}

bool OAIOfferCardsContentStatusDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (offer_cards.size() > 0) {
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

bool OAIOfferCardsContentStatusDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_offer_cards_isValid && true;
}

} // namespace OpenAPI
