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

#include "OAISearchShipmentsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISearchShipmentsResponse::OAISearchShipmentsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISearchShipmentsResponse::OAISearchShipmentsResponse() {
    this->initializeModel();
}

OAISearchShipmentsResponse::~OAISearchShipmentsResponse() {}

void OAISearchShipmentsResponse::initializeModel() {

    m_status_isSet = false;
    m_status_isValid = false;

    m_result_isSet = false;
    m_result_isValid = false;
}

void OAISearchShipmentsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISearchShipmentsResponse::fromJsonObject(QJsonObject json) {

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_result_isValid = ::OpenAPI::fromJsonValue(result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;
}

QString OAISearchShipmentsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISearchShipmentsResponse::asJsonObject() const {
    QJsonObject obj;
    if (status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (result.isSet()) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(result));
    }
    return obj;
}

OAIApiResponseStatusType OAISearchShipmentsResponse::getStatus() const {
    return status;
}
void OAISearchShipmentsResponse::setStatus(const OAIApiResponseStatusType &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAISearchShipmentsResponse::is_status_Set() const{
    return m_status_isSet;
}

bool OAISearchShipmentsResponse::is_status_Valid() const{
    return m_status_isValid;
}

OAISearchShipmentsResponseDTO OAISearchShipmentsResponse::getResult() const {
    return result;
}
void OAISearchShipmentsResponse::setResult(const OAISearchShipmentsResponseDTO &result) {
    this->result = result;
    this->m_result_isSet = true;
}

bool OAISearchShipmentsResponse::is_result_Set() const{
    return m_result_isSet;
}

bool OAISearchShipmentsResponse::is_result_Valid() const{
    return m_result_isValid;
}

bool OAISearchShipmentsResponse::isSet() const {
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

bool OAISearchShipmentsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
