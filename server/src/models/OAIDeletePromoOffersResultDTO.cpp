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

#include "OAIDeletePromoOffersResultDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIDeletePromoOffersResultDTO::OAIDeletePromoOffersResultDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIDeletePromoOffersResultDTO::OAIDeletePromoOffersResultDTO() {
    this->initializeModel();
}

OAIDeletePromoOffersResultDTO::~OAIDeletePromoOffersResultDTO() {}

void OAIDeletePromoOffersResultDTO::initializeModel() {

    m_rejected_offers_isSet = false;
    m_rejected_offers_isValid = false;
}

void OAIDeletePromoOffersResultDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIDeletePromoOffersResultDTO::fromJsonObject(QJsonObject json) {

    m_rejected_offers_isValid = ::OpenAPI::fromJsonValue(rejected_offers, json[QString("rejectedOffers")]);
    m_rejected_offers_isSet = !json[QString("rejectedOffers")].isNull() && m_rejected_offers_isValid;
}

QString OAIDeletePromoOffersResultDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIDeletePromoOffersResultDTO::asJsonObject() const {
    QJsonObject obj;
    if (rejected_offers.size() > 0) {
        obj.insert(QString("rejectedOffers"), ::OpenAPI::toJsonValue(rejected_offers));
    }
    return obj;
}

QList<OAIRejectedPromoOfferDeleteDTO> OAIDeletePromoOffersResultDTO::getRejectedOffers() const {
    return rejected_offers;
}
void OAIDeletePromoOffersResultDTO::setRejectedOffers(const QList<OAIRejectedPromoOfferDeleteDTO> &rejected_offers) {
    this->rejected_offers = rejected_offers;
    this->m_rejected_offers_isSet = true;
}

bool OAIDeletePromoOffersResultDTO::is_rejected_offers_Set() const{
    return m_rejected_offers_isSet;
}

bool OAIDeletePromoOffersResultDTO::is_rejected_offers_Valid() const{
    return m_rejected_offers_isValid;
}

bool OAIDeletePromoOffersResultDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (rejected_offers.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIDeletePromoOffersResultDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
