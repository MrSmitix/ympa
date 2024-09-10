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

#include "OAIGoodsFeedbackCommentAuthorDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGoodsFeedbackCommentAuthorDTO::OAIGoodsFeedbackCommentAuthorDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGoodsFeedbackCommentAuthorDTO::OAIGoodsFeedbackCommentAuthorDTO() {
    this->initializeModel();
}

OAIGoodsFeedbackCommentAuthorDTO::~OAIGoodsFeedbackCommentAuthorDTO() {}

void OAIGoodsFeedbackCommentAuthorDTO::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;
}

void OAIGoodsFeedbackCommentAuthorDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGoodsFeedbackCommentAuthorDTO::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;
}

QString OAIGoodsFeedbackCommentAuthorDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGoodsFeedbackCommentAuthorDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_type.isSet()) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(m_name));
    }
    return obj;
}

OAIGoodsFeedbackCommentAuthorType OAIGoodsFeedbackCommentAuthorDTO::getType() const {
    return m_type;
}
void OAIGoodsFeedbackCommentAuthorDTO::setType(const OAIGoodsFeedbackCommentAuthorType &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIGoodsFeedbackCommentAuthorDTO::is_type_Set() const{
    return m_type_isSet;
}

bool OAIGoodsFeedbackCommentAuthorDTO::is_type_Valid() const{
    return m_type_isValid;
}

QString OAIGoodsFeedbackCommentAuthorDTO::getName() const {
    return m_name;
}
void OAIGoodsFeedbackCommentAuthorDTO::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool OAIGoodsFeedbackCommentAuthorDTO::is_name_Set() const{
    return m_name_isSet;
}

bool OAIGoodsFeedbackCommentAuthorDTO::is_name_Valid() const{
    return m_name_isValid;
}

bool OAIGoodsFeedbackCommentAuthorDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGoodsFeedbackCommentAuthorDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
