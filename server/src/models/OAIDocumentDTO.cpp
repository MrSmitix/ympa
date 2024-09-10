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

#include "OAIDocumentDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIDocumentDTO::OAIDocumentDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIDocumentDTO::OAIDocumentDTO() {
    this->initializeModel();
}

OAIDocumentDTO::~OAIDocumentDTO() {}

void OAIDocumentDTO::initializeModel() {

    m_status_isSet = false;
    m_status_isValid = false;

    m_number_isSet = false;
    m_number_isValid = false;

    m_date_isSet = false;
    m_date_isValid = false;
}

void OAIDocumentDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIDocumentDTO::fromJsonObject(QJsonObject json) {

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_number_isValid = ::OpenAPI::fromJsonValue(number, json[QString("number")]);
    m_number_isSet = !json[QString("number")].isNull() && m_number_isValid;

    m_date_isValid = ::OpenAPI::fromJsonValue(date, json[QString("date")]);
    m_date_isSet = !json[QString("date")].isNull() && m_date_isValid;
}

QString OAIDocumentDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIDocumentDTO::asJsonObject() const {
    QJsonObject obj;
    if (status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (m_number_isSet) {
        obj.insert(QString("number"), ::OpenAPI::toJsonValue(number));
    }
    if (m_date_isSet) {
        obj.insert(QString("date"), ::OpenAPI::toJsonValue(date));
    }
    return obj;
}

OAIOrderDocumentStatusType OAIDocumentDTO::getStatus() const {
    return status;
}
void OAIDocumentDTO::setStatus(const OAIOrderDocumentStatusType &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIDocumentDTO::is_status_Set() const{
    return m_status_isSet;
}

bool OAIDocumentDTO::is_status_Valid() const{
    return m_status_isValid;
}

QString OAIDocumentDTO::getNumber() const {
    return number;
}
void OAIDocumentDTO::setNumber(const QString &number) {
    this->number = number;
    this->m_number_isSet = true;
}

bool OAIDocumentDTO::is_number_Set() const{
    return m_number_isSet;
}

bool OAIDocumentDTO::is_number_Valid() const{
    return m_number_isValid;
}

QDate OAIDocumentDTO::getDate() const {
    return date;
}
void OAIDocumentDTO::setDate(const QDate &date) {
    this->date = date;
    this->m_date_isSet = true;
}

bool OAIDocumentDTO::is_date_Set() const{
    return m_date_isSet;
}

bool OAIDocumentDTO::is_date_Valid() const{
    return m_date_isValid;
}

bool OAIDocumentDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (status.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_number_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_date_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIDocumentDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
