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

#include "OAIOfferForRecommendationDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOfferForRecommendationDTO::OAIOfferForRecommendationDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOfferForRecommendationDTO::OAIOfferForRecommendationDTO() {
    this->initializeModel();
}

OAIOfferForRecommendationDTO::~OAIOfferForRecommendationDTO() {}

void OAIOfferForRecommendationDTO::initializeModel() {

    m_offer_id_isSet = false;
    m_offer_id_isValid = false;

    m_price_isSet = false;
    m_price_isValid = false;

    m_cofinance_price_isSet = false;
    m_cofinance_price_isValid = false;

    m_competitiveness_isSet = false;
    m_competitiveness_isValid = false;

    m_shows_isSet = false;
    m_shows_isValid = false;
}

void OAIOfferForRecommendationDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOfferForRecommendationDTO::fromJsonObject(QJsonObject json) {

    m_offer_id_isValid = ::OpenAPI::fromJsonValue(m_offer_id, json[QString("offerId")]);
    m_offer_id_isSet = !json[QString("offerId")].isNull() && m_offer_id_isValid;

    m_price_isValid = ::OpenAPI::fromJsonValue(m_price, json[QString("price")]);
    m_price_isSet = !json[QString("price")].isNull() && m_price_isValid;

    m_cofinance_price_isValid = ::OpenAPI::fromJsonValue(m_cofinance_price, json[QString("cofinancePrice")]);
    m_cofinance_price_isSet = !json[QString("cofinancePrice")].isNull() && m_cofinance_price_isValid;

    m_competitiveness_isValid = ::OpenAPI::fromJsonValue(m_competitiveness, json[QString("competitiveness")]);
    m_competitiveness_isSet = !json[QString("competitiveness")].isNull() && m_competitiveness_isValid;

    m_shows_isValid = ::OpenAPI::fromJsonValue(m_shows, json[QString("shows")]);
    m_shows_isSet = !json[QString("shows")].isNull() && m_shows_isValid;
}

QString OAIOfferForRecommendationDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOfferForRecommendationDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_offer_id_isSet) {
        obj.insert(QString("offerId"), ::OpenAPI::toJsonValue(m_offer_id));
    }
    if (m_price.isSet()) {
        obj.insert(QString("price"), ::OpenAPI::toJsonValue(m_price));
    }
    if (m_cofinance_price.isSet()) {
        obj.insert(QString("cofinancePrice"), ::OpenAPI::toJsonValue(m_cofinance_price));
    }
    if (m_competitiveness.isSet()) {
        obj.insert(QString("competitiveness"), ::OpenAPI::toJsonValue(m_competitiveness));
    }
    if (m_shows_isSet) {
        obj.insert(QString("shows"), ::OpenAPI::toJsonValue(m_shows));
    }
    return obj;
}

QString OAIOfferForRecommendationDTO::getOfferId() const {
    return m_offer_id;
}
void OAIOfferForRecommendationDTO::setOfferId(const QString &offer_id) {
    m_offer_id = offer_id;
    m_offer_id_isSet = true;
}

bool OAIOfferForRecommendationDTO::is_offer_id_Set() const{
    return m_offer_id_isSet;
}

bool OAIOfferForRecommendationDTO::is_offer_id_Valid() const{
    return m_offer_id_isValid;
}

OAIBasePriceDTO OAIOfferForRecommendationDTO::getPrice() const {
    return m_price;
}
void OAIOfferForRecommendationDTO::setPrice(const OAIBasePriceDTO &price) {
    m_price = price;
    m_price_isSet = true;
}

bool OAIOfferForRecommendationDTO::is_price_Set() const{
    return m_price_isSet;
}

bool OAIOfferForRecommendationDTO::is_price_Valid() const{
    return m_price_isValid;
}

OAIGetPriceDTO OAIOfferForRecommendationDTO::getCofinancePrice() const {
    return m_cofinance_price;
}
void OAIOfferForRecommendationDTO::setCofinancePrice(const OAIGetPriceDTO &cofinance_price) {
    m_cofinance_price = cofinance_price;
    m_cofinance_price_isSet = true;
}

bool OAIOfferForRecommendationDTO::is_cofinance_price_Set() const{
    return m_cofinance_price_isSet;
}

bool OAIOfferForRecommendationDTO::is_cofinance_price_Valid() const{
    return m_cofinance_price_isValid;
}

OAIPriceCompetitivenessType OAIOfferForRecommendationDTO::getCompetitiveness() const {
    return m_competitiveness;
}
void OAIOfferForRecommendationDTO::setCompetitiveness(const OAIPriceCompetitivenessType &competitiveness) {
    m_competitiveness = competitiveness;
    m_competitiveness_isSet = true;
}

bool OAIOfferForRecommendationDTO::is_competitiveness_Set() const{
    return m_competitiveness_isSet;
}

bool OAIOfferForRecommendationDTO::is_competitiveness_Valid() const{
    return m_competitiveness_isValid;
}

qint64 OAIOfferForRecommendationDTO::getShows() const {
    return m_shows;
}
void OAIOfferForRecommendationDTO::setShows(const qint64 &shows) {
    m_shows = shows;
    m_shows_isSet = true;
}

bool OAIOfferForRecommendationDTO::is_shows_Set() const{
    return m_shows_isSet;
}

bool OAIOfferForRecommendationDTO::is_shows_Valid() const{
    return m_shows_isValid;
}

bool OAIOfferForRecommendationDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_offer_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_price.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_cofinance_price.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_competitiveness.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_shows_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOfferForRecommendationDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
