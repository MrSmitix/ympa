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

#include "OAIGeneratePricesReportRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGeneratePricesReportRequest::OAIGeneratePricesReportRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGeneratePricesReportRequest::OAIGeneratePricesReportRequest() {
    this->initializeModel();
}

OAIGeneratePricesReportRequest::~OAIGeneratePricesReportRequest() {}

void OAIGeneratePricesReportRequest::initializeModel() {

    m_business_id_isSet = false;
    m_business_id_isValid = false;

    m_campaign_id_isSet = false;
    m_campaign_id_isValid = false;

    m_category_ids_isSet = false;
    m_category_ids_isValid = false;

    m_creation_date_from_isSet = false;
    m_creation_date_from_isValid = false;

    m_creation_date_to_isSet = false;
    m_creation_date_to_isValid = false;
}

void OAIGeneratePricesReportRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGeneratePricesReportRequest::fromJsonObject(QJsonObject json) {

    m_business_id_isValid = ::OpenAPI::fromJsonValue(business_id, json[QString("businessId")]);
    m_business_id_isSet = !json[QString("businessId")].isNull() && m_business_id_isValid;

    m_campaign_id_isValid = ::OpenAPI::fromJsonValue(campaign_id, json[QString("campaignId")]);
    m_campaign_id_isSet = !json[QString("campaignId")].isNull() && m_campaign_id_isValid;

    m_category_ids_isValid = ::OpenAPI::fromJsonValue(category_ids, json[QString("categoryIds")]);
    m_category_ids_isSet = !json[QString("categoryIds")].isNull() && m_category_ids_isValid;

    m_creation_date_from_isValid = ::OpenAPI::fromJsonValue(creation_date_from, json[QString("creationDateFrom")]);
    m_creation_date_from_isSet = !json[QString("creationDateFrom")].isNull() && m_creation_date_from_isValid;

    m_creation_date_to_isValid = ::OpenAPI::fromJsonValue(creation_date_to, json[QString("creationDateTo")]);
    m_creation_date_to_isSet = !json[QString("creationDateTo")].isNull() && m_creation_date_to_isValid;
}

QString OAIGeneratePricesReportRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGeneratePricesReportRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_business_id_isSet) {
        obj.insert(QString("businessId"), ::OpenAPI::toJsonValue(business_id));
    }
    if (m_campaign_id_isSet) {
        obj.insert(QString("campaignId"), ::OpenAPI::toJsonValue(campaign_id));
    }
    if (category_ids.size() > 0) {
        obj.insert(QString("categoryIds"), ::OpenAPI::toJsonValue(category_ids));
    }
    if (m_creation_date_from_isSet) {
        obj.insert(QString("creationDateFrom"), ::OpenAPI::toJsonValue(creation_date_from));
    }
    if (m_creation_date_to_isSet) {
        obj.insert(QString("creationDateTo"), ::OpenAPI::toJsonValue(creation_date_to));
    }
    return obj;
}

qint64 OAIGeneratePricesReportRequest::getBusinessId() const {
    return business_id;
}
void OAIGeneratePricesReportRequest::setBusinessId(const qint64 &business_id) {
    this->business_id = business_id;
    this->m_business_id_isSet = true;
}

bool OAIGeneratePricesReportRequest::is_business_id_Set() const{
    return m_business_id_isSet;
}

bool OAIGeneratePricesReportRequest::is_business_id_Valid() const{
    return m_business_id_isValid;
}

qint64 OAIGeneratePricesReportRequest::getCampaignId() const {
    return campaign_id;
}
void OAIGeneratePricesReportRequest::setCampaignId(const qint64 &campaign_id) {
    this->campaign_id = campaign_id;
    this->m_campaign_id_isSet = true;
}

bool OAIGeneratePricesReportRequest::is_campaign_id_Set() const{
    return m_campaign_id_isSet;
}

bool OAIGeneratePricesReportRequest::is_campaign_id_Valid() const{
    return m_campaign_id_isValid;
}

QList<qint64> OAIGeneratePricesReportRequest::getCategoryIds() const {
    return category_ids;
}
void OAIGeneratePricesReportRequest::setCategoryIds(const QList<qint64> &category_ids) {
    this->category_ids = category_ids;
    this->m_category_ids_isSet = true;
}

bool OAIGeneratePricesReportRequest::is_category_ids_Set() const{
    return m_category_ids_isSet;
}

bool OAIGeneratePricesReportRequest::is_category_ids_Valid() const{
    return m_category_ids_isValid;
}

QDate OAIGeneratePricesReportRequest::getCreationDateFrom() const {
    return creation_date_from;
}
void OAIGeneratePricesReportRequest::setCreationDateFrom(const QDate &creation_date_from) {
    this->creation_date_from = creation_date_from;
    this->m_creation_date_from_isSet = true;
}

bool OAIGeneratePricesReportRequest::is_creation_date_from_Set() const{
    return m_creation_date_from_isSet;
}

bool OAIGeneratePricesReportRequest::is_creation_date_from_Valid() const{
    return m_creation_date_from_isValid;
}

QDate OAIGeneratePricesReportRequest::getCreationDateTo() const {
    return creation_date_to;
}
void OAIGeneratePricesReportRequest::setCreationDateTo(const QDate &creation_date_to) {
    this->creation_date_to = creation_date_to;
    this->m_creation_date_to_isSet = true;
}

bool OAIGeneratePricesReportRequest::is_creation_date_to_Set() const{
    return m_creation_date_to_isSet;
}

bool OAIGeneratePricesReportRequest::is_creation_date_to_Valid() const{
    return m_creation_date_to_isValid;
}

bool OAIGeneratePricesReportRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_business_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_campaign_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (category_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_creation_date_from_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_creation_date_to_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGeneratePricesReportRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
