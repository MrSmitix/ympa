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

#include "OAISetOrderBoxLayoutResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISetOrderBoxLayoutResponse::OAISetOrderBoxLayoutResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISetOrderBoxLayoutResponse::OAISetOrderBoxLayoutResponse() {
    this->initializeModel();
}

OAISetOrderBoxLayoutResponse::~OAISetOrderBoxLayoutResponse() {}

void OAISetOrderBoxLayoutResponse::initializeModel() {

    m_status_isSet = false;
    m_status_isValid = false;

    m_result_isSet = false;
    m_result_isValid = false;
}

void OAISetOrderBoxLayoutResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISetOrderBoxLayoutResponse::fromJsonObject(QJsonObject json) {

    m_status_isValid = ::OpenAPI::fromJsonValue(m_status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_result_isValid = ::OpenAPI::fromJsonValue(m_result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;
}

QString OAISetOrderBoxLayoutResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISetOrderBoxLayoutResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(m_status));
    }
    if (m_result.isSet()) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(m_result));
    }
    return obj;
}

OAIApiResponseStatusType OAISetOrderBoxLayoutResponse::getStatus() const {
    return m_status;
}
void OAISetOrderBoxLayoutResponse::setStatus(const OAIApiResponseStatusType &status) {
    m_status = status;
    m_status_isSet = true;
}

bool OAISetOrderBoxLayoutResponse::is_status_Set() const{
    return m_status_isSet;
}

bool OAISetOrderBoxLayoutResponse::is_status_Valid() const{
    return m_status_isValid;
}

OAIOrderBoxesLayoutDTO OAISetOrderBoxLayoutResponse::getResult() const {
    return m_result;
}
void OAISetOrderBoxLayoutResponse::setResult(const OAIOrderBoxesLayoutDTO &result) {
    m_result = result;
    m_result_isSet = true;
}

bool OAISetOrderBoxLayoutResponse::is_result_Set() const{
    return m_result_isSet;
}

bool OAISetOrderBoxLayoutResponse::is_result_Valid() const{
    return m_result_isValid;
}

bool OAISetOrderBoxLayoutResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_status.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_result.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISetOrderBoxLayoutResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
