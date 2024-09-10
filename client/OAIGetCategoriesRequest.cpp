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

#include "OAIGetCategoriesRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetCategoriesRequest::OAIGetCategoriesRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetCategoriesRequest::OAIGetCategoriesRequest() {
    this->initializeModel();
}

OAIGetCategoriesRequest::~OAIGetCategoriesRequest() {}

void OAIGetCategoriesRequest::initializeModel() {

    m_language_isSet = false;
    m_language_isValid = false;
}

void OAIGetCategoriesRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetCategoriesRequest::fromJsonObject(QJsonObject json) {

    m_language_isValid = ::OpenAPI::fromJsonValue(m_language, json[QString("language")]);
    m_language_isSet = !json[QString("language")].isNull() && m_language_isValid;
}

QString OAIGetCategoriesRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetCategoriesRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_language.isSet()) {
        obj.insert(QString("language"), ::OpenAPI::toJsonValue(m_language));
    }
    return obj;
}

OAILanguageType OAIGetCategoriesRequest::getLanguage() const {
    return m_language;
}
void OAIGetCategoriesRequest::setLanguage(const OAILanguageType &language) {
    m_language = language;
    m_language_isSet = true;
}

bool OAIGetCategoriesRequest::is_language_Set() const{
    return m_language_isSet;
}

bool OAIGetCategoriesRequest::is_language_Valid() const{
    return m_language_isValid;
}

bool OAIGetCategoriesRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_language.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetCategoriesRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
