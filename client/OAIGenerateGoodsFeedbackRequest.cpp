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

#include "OAIGenerateGoodsFeedbackRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGenerateGoodsFeedbackRequest::OAIGenerateGoodsFeedbackRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGenerateGoodsFeedbackRequest::OAIGenerateGoodsFeedbackRequest() {
    this->initializeModel();
}

OAIGenerateGoodsFeedbackRequest::~OAIGenerateGoodsFeedbackRequest() {}

void OAIGenerateGoodsFeedbackRequest::initializeModel() {

    m_business_id_isSet = false;
    m_business_id_isValid = false;
}

void OAIGenerateGoodsFeedbackRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGenerateGoodsFeedbackRequest::fromJsonObject(QJsonObject json) {

    m_business_id_isValid = ::OpenAPI::fromJsonValue(m_business_id, json[QString("businessId")]);
    m_business_id_isSet = !json[QString("businessId")].isNull() && m_business_id_isValid;
}

QString OAIGenerateGoodsFeedbackRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGenerateGoodsFeedbackRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_business_id_isSet) {
        obj.insert(QString("businessId"), ::OpenAPI::toJsonValue(m_business_id));
    }
    return obj;
}

qint64 OAIGenerateGoodsFeedbackRequest::getBusinessId() const {
    return m_business_id;
}
void OAIGenerateGoodsFeedbackRequest::setBusinessId(const qint64 &business_id) {
    m_business_id = business_id;
    m_business_id_isSet = true;
}

bool OAIGenerateGoodsFeedbackRequest::is_business_id_Set() const{
    return m_business_id_isSet;
}

bool OAIGenerateGoodsFeedbackRequest::is_business_id_Valid() const{
    return m_business_id_isValid;
}

bool OAIGenerateGoodsFeedbackRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_business_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGenerateGoodsFeedbackRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_business_id_isValid && true;
}

} // namespace OpenAPI
