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

#include "OAIGetBusinessSettingsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetBusinessSettingsResponse::OAIGetBusinessSettingsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetBusinessSettingsResponse::OAIGetBusinessSettingsResponse() {
    this->initializeModel();
}

OAIGetBusinessSettingsResponse::~OAIGetBusinessSettingsResponse() {}

void OAIGetBusinessSettingsResponse::initializeModel() {

    m_status_isSet = false;
    m_status_isValid = false;

    m_result_isSet = false;
    m_result_isValid = false;
}

void OAIGetBusinessSettingsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetBusinessSettingsResponse::fromJsonObject(QJsonObject json) {

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_result_isValid = ::OpenAPI::fromJsonValue(result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;
}

QString OAIGetBusinessSettingsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetBusinessSettingsResponse::asJsonObject() const {
    QJsonObject obj;
    if (status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (result.isSet()) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(result));
    }
    return obj;
}

OAIApiResponseStatusType OAIGetBusinessSettingsResponse::getStatus() const {
    return status;
}
void OAIGetBusinessSettingsResponse::setStatus(const OAIApiResponseStatusType &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIGetBusinessSettingsResponse::is_status_Set() const{
    return m_status_isSet;
}

bool OAIGetBusinessSettingsResponse::is_status_Valid() const{
    return m_status_isValid;
}

OAIGetBusinessSettingsInfoDTO OAIGetBusinessSettingsResponse::getResult() const {
    return result;
}
void OAIGetBusinessSettingsResponse::setResult(const OAIGetBusinessSettingsInfoDTO &result) {
    this->result = result;
    this->m_result_isSet = true;
}

bool OAIGetBusinessSettingsResponse::is_result_Set() const{
    return m_result_isSet;
}

bool OAIGetBusinessSettingsResponse::is_result_Valid() const{
    return m_result_isValid;
}

bool OAIGetBusinessSettingsResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (status.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (result.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetBusinessSettingsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
