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

#include "OAIGenerateBoostConsolidatedRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGenerateBoostConsolidatedRequest::OAIGenerateBoostConsolidatedRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGenerateBoostConsolidatedRequest::OAIGenerateBoostConsolidatedRequest() {
    this->initializeModel();
}

OAIGenerateBoostConsolidatedRequest::~OAIGenerateBoostConsolidatedRequest() {}

void OAIGenerateBoostConsolidatedRequest::initializeModel() {

    m_business_id_isSet = false;
    m_business_id_isValid = false;

    m_date_from_isSet = false;
    m_date_from_isValid = false;

    m_date_to_isSet = false;
    m_date_to_isValid = false;
}

void OAIGenerateBoostConsolidatedRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGenerateBoostConsolidatedRequest::fromJsonObject(QJsonObject json) {

    m_business_id_isValid = ::OpenAPI::fromJsonValue(business_id, json[QString("businessId")]);
    m_business_id_isSet = !json[QString("businessId")].isNull() && m_business_id_isValid;

    m_date_from_isValid = ::OpenAPI::fromJsonValue(date_from, json[QString("dateFrom")]);
    m_date_from_isSet = !json[QString("dateFrom")].isNull() && m_date_from_isValid;

    m_date_to_isValid = ::OpenAPI::fromJsonValue(date_to, json[QString("dateTo")]);
    m_date_to_isSet = !json[QString("dateTo")].isNull() && m_date_to_isValid;
}

QString OAIGenerateBoostConsolidatedRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGenerateBoostConsolidatedRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_business_id_isSet) {
        obj.insert(QString("businessId"), ::OpenAPI::toJsonValue(business_id));
    }
    if (m_date_from_isSet) {
        obj.insert(QString("dateFrom"), ::OpenAPI::toJsonValue(date_from));
    }
    if (m_date_to_isSet) {
        obj.insert(QString("dateTo"), ::OpenAPI::toJsonValue(date_to));
    }
    return obj;
}

qint64 OAIGenerateBoostConsolidatedRequest::getBusinessId() const {
    return business_id;
}
void OAIGenerateBoostConsolidatedRequest::setBusinessId(const qint64 &business_id) {
    this->business_id = business_id;
    this->m_business_id_isSet = true;
}

bool OAIGenerateBoostConsolidatedRequest::is_business_id_Set() const{
    return m_business_id_isSet;
}

bool OAIGenerateBoostConsolidatedRequest::is_business_id_Valid() const{
    return m_business_id_isValid;
}

QDate OAIGenerateBoostConsolidatedRequest::getDateFrom() const {
    return date_from;
}
void OAIGenerateBoostConsolidatedRequest::setDateFrom(const QDate &date_from) {
    this->date_from = date_from;
    this->m_date_from_isSet = true;
}

bool OAIGenerateBoostConsolidatedRequest::is_date_from_Set() const{
    return m_date_from_isSet;
}

bool OAIGenerateBoostConsolidatedRequest::is_date_from_Valid() const{
    return m_date_from_isValid;
}

QDate OAIGenerateBoostConsolidatedRequest::getDateTo() const {
    return date_to;
}
void OAIGenerateBoostConsolidatedRequest::setDateTo(const QDate &date_to) {
    this->date_to = date_to;
    this->m_date_to_isSet = true;
}

bool OAIGenerateBoostConsolidatedRequest::is_date_to_Set() const{
    return m_date_to_isSet;
}

bool OAIGenerateBoostConsolidatedRequest::is_date_to_Valid() const{
    return m_date_to_isValid;
}

bool OAIGenerateBoostConsolidatedRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_business_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_date_from_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_date_to_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGenerateBoostConsolidatedRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_business_id_isValid && m_date_from_isValid && m_date_to_isValid && true;
}

} // namespace OpenAPI
