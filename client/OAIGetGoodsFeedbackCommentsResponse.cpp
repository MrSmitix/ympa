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

#include "OAIGetGoodsFeedbackCommentsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetGoodsFeedbackCommentsResponse::OAIGetGoodsFeedbackCommentsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetGoodsFeedbackCommentsResponse::OAIGetGoodsFeedbackCommentsResponse() {
    this->initializeModel();
}

OAIGetGoodsFeedbackCommentsResponse::~OAIGetGoodsFeedbackCommentsResponse() {}

void OAIGetGoodsFeedbackCommentsResponse::initializeModel() {

    m_status_isSet = false;
    m_status_isValid = false;

    m_result_isSet = false;
    m_result_isValid = false;
}

void OAIGetGoodsFeedbackCommentsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetGoodsFeedbackCommentsResponse::fromJsonObject(QJsonObject json) {

    m_status_isValid = ::OpenAPI::fromJsonValue(m_status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_result_isValid = ::OpenAPI::fromJsonValue(m_result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;
}

QString OAIGetGoodsFeedbackCommentsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetGoodsFeedbackCommentsResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(m_status));
    }
    if (m_result.isSet()) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(m_result));
    }
    return obj;
}

OAIApiResponseStatusType OAIGetGoodsFeedbackCommentsResponse::getStatus() const {
    return m_status;
}
void OAIGetGoodsFeedbackCommentsResponse::setStatus(const OAIApiResponseStatusType &status) {
    m_status = status;
    m_status_isSet = true;
}

bool OAIGetGoodsFeedbackCommentsResponse::is_status_Set() const{
    return m_status_isSet;
}

bool OAIGetGoodsFeedbackCommentsResponse::is_status_Valid() const{
    return m_status_isValid;
}

OAIGoodsFeedbackCommentListDTO OAIGetGoodsFeedbackCommentsResponse::getResult() const {
    return m_result;
}
void OAIGetGoodsFeedbackCommentsResponse::setResult(const OAIGoodsFeedbackCommentListDTO &result) {
    m_result = result;
    m_result_isSet = true;
}

bool OAIGetGoodsFeedbackCommentsResponse::is_result_Set() const{
    return m_result_isSet;
}

bool OAIGetGoodsFeedbackCommentsResponse::is_result_Valid() const{
    return m_result_isValid;
}

bool OAIGetGoodsFeedbackCommentsResponse::isSet() const {
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

bool OAIGetGoodsFeedbackCommentsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
