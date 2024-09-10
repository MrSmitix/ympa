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

#include "OAIDeleteCampaignOffersRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIDeleteCampaignOffersRequest::OAIDeleteCampaignOffersRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIDeleteCampaignOffersRequest::OAIDeleteCampaignOffersRequest() {
    this->initializeModel();
}

OAIDeleteCampaignOffersRequest::~OAIDeleteCampaignOffersRequest() {}

void OAIDeleteCampaignOffersRequest::initializeModel() {

    m_offer_ids_isSet = false;
    m_offer_ids_isValid = false;
}

void OAIDeleteCampaignOffersRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIDeleteCampaignOffersRequest::fromJsonObject(QJsonObject json) {

    m_offer_ids_isValid = ::OpenAPI::fromJsonValue(offer_ids, json[QString("offerIds")]);
    m_offer_ids_isSet = !json[QString("offerIds")].isNull() && m_offer_ids_isValid;
}

QString OAIDeleteCampaignOffersRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIDeleteCampaignOffersRequest::asJsonObject() const {
    QJsonObject obj;
    if (offer_ids.size() > 0) {
        obj.insert(QString("offerIds"), ::OpenAPI::toJsonValue(offer_ids));
    }
    return obj;
}

QList<QString> OAIDeleteCampaignOffersRequest::getOfferIds() const {
    return offer_ids;
}
void OAIDeleteCampaignOffersRequest::setOfferIds(const QList<QString> &offer_ids) {
    this->offer_ids = offer_ids;
    this->m_offer_ids_isSet = true;
}

bool OAIDeleteCampaignOffersRequest::is_offer_ids_Set() const{
    return m_offer_ids_isSet;
}

bool OAIDeleteCampaignOffersRequest::is_offer_ids_Valid() const{
    return m_offer_ids_isValid;
}

bool OAIDeleteCampaignOffersRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (offer_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIDeleteCampaignOffersRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_offer_ids_isValid && true;
}

} // namespace OpenAPI
