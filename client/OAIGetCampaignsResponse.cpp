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

#include "OAIGetCampaignsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetCampaignsResponse::OAIGetCampaignsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetCampaignsResponse::OAIGetCampaignsResponse() {
    this->initializeModel();
}

OAIGetCampaignsResponse::~OAIGetCampaignsResponse() {}

void OAIGetCampaignsResponse::initializeModel() {

    m_campaigns_isSet = false;
    m_campaigns_isValid = false;

    m_pager_isSet = false;
    m_pager_isValid = false;
}

void OAIGetCampaignsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetCampaignsResponse::fromJsonObject(QJsonObject json) {

    m_campaigns_isValid = ::OpenAPI::fromJsonValue(m_campaigns, json[QString("campaigns")]);
    m_campaigns_isSet = !json[QString("campaigns")].isNull() && m_campaigns_isValid;

    m_pager_isValid = ::OpenAPI::fromJsonValue(m_pager, json[QString("pager")]);
    m_pager_isSet = !json[QString("pager")].isNull() && m_pager_isValid;
}

QString OAIGetCampaignsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetCampaignsResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_campaigns.size() > 0) {
        obj.insert(QString("campaigns"), ::OpenAPI::toJsonValue(m_campaigns));
    }
    if (m_pager.isSet()) {
        obj.insert(QString("pager"), ::OpenAPI::toJsonValue(m_pager));
    }
    return obj;
}

QList<OAICampaignDTO> OAIGetCampaignsResponse::getCampaigns() const {
    return m_campaigns;
}
void OAIGetCampaignsResponse::setCampaigns(const QList<OAICampaignDTO> &campaigns) {
    m_campaigns = campaigns;
    m_campaigns_isSet = true;
}

bool OAIGetCampaignsResponse::is_campaigns_Set() const{
    return m_campaigns_isSet;
}

bool OAIGetCampaignsResponse::is_campaigns_Valid() const{
    return m_campaigns_isValid;
}

OAIFlippingPagerDTO OAIGetCampaignsResponse::getPager() const {
    return m_pager;
}
void OAIGetCampaignsResponse::setPager(const OAIFlippingPagerDTO &pager) {
    m_pager = pager;
    m_pager_isSet = true;
}

bool OAIGetCampaignsResponse::is_pager_Set() const{
    return m_pager_isSet;
}

bool OAIGetCampaignsResponse::is_pager_Valid() const{
    return m_pager_isValid;
}

bool OAIGetCampaignsResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_campaigns.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_pager.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetCampaignsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_campaigns_isValid && true;
}

} // namespace OpenAPI
