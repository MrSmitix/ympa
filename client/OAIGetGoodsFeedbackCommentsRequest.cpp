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

#include "OAIGetGoodsFeedbackCommentsRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetGoodsFeedbackCommentsRequest::OAIGetGoodsFeedbackCommentsRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetGoodsFeedbackCommentsRequest::OAIGetGoodsFeedbackCommentsRequest() {
    this->initializeModel();
}

OAIGetGoodsFeedbackCommentsRequest::~OAIGetGoodsFeedbackCommentsRequest() {}

void OAIGetGoodsFeedbackCommentsRequest::initializeModel() {

    m_feedback_id_isSet = false;
    m_feedback_id_isValid = false;
}

void OAIGetGoodsFeedbackCommentsRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetGoodsFeedbackCommentsRequest::fromJsonObject(QJsonObject json) {

    m_feedback_id_isValid = ::OpenAPI::fromJsonValue(m_feedback_id, json[QString("feedbackId")]);
    m_feedback_id_isSet = !json[QString("feedbackId")].isNull() && m_feedback_id_isValid;
}

QString OAIGetGoodsFeedbackCommentsRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetGoodsFeedbackCommentsRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_feedback_id_isSet) {
        obj.insert(QString("feedbackId"), ::OpenAPI::toJsonValue(m_feedback_id));
    }
    return obj;
}

qint64 OAIGetGoodsFeedbackCommentsRequest::getFeedbackId() const {
    return m_feedback_id;
}
void OAIGetGoodsFeedbackCommentsRequest::setFeedbackId(const qint64 &feedback_id) {
    m_feedback_id = feedback_id;
    m_feedback_id_isSet = true;
}

bool OAIGetGoodsFeedbackCommentsRequest::is_feedback_id_Set() const{
    return m_feedback_id_isSet;
}

bool OAIGetGoodsFeedbackCommentsRequest::is_feedback_id_Valid() const{
    return m_feedback_id_isValid;
}

bool OAIGetGoodsFeedbackCommentsRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_feedback_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetGoodsFeedbackCommentsRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_feedback_id_isValid && true;
}

} // namespace OpenAPI
