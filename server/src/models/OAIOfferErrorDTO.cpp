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

#include "OAIOfferErrorDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOfferErrorDTO::OAIOfferErrorDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOfferErrorDTO::OAIOfferErrorDTO() {
    this->initializeModel();
}

OAIOfferErrorDTO::~OAIOfferErrorDTO() {}

void OAIOfferErrorDTO::initializeModel() {

    m_message_isSet = false;
    m_message_isValid = false;

    m_comment_isSet = false;
    m_comment_isValid = false;
}

void OAIOfferErrorDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOfferErrorDTO::fromJsonObject(QJsonObject json) {

    m_message_isValid = ::OpenAPI::fromJsonValue(message, json[QString("message")]);
    m_message_isSet = !json[QString("message")].isNull() && m_message_isValid;

    m_comment_isValid = ::OpenAPI::fromJsonValue(comment, json[QString("comment")]);
    m_comment_isSet = !json[QString("comment")].isNull() && m_comment_isValid;
}

QString OAIOfferErrorDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOfferErrorDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_message_isSet) {
        obj.insert(QString("message"), ::OpenAPI::toJsonValue(message));
    }
    if (m_comment_isSet) {
        obj.insert(QString("comment"), ::OpenAPI::toJsonValue(comment));
    }
    return obj;
}

QString OAIOfferErrorDTO::getMessage() const {
    return message;
}
void OAIOfferErrorDTO::setMessage(const QString &message) {
    this->message = message;
    this->m_message_isSet = true;
}

bool OAIOfferErrorDTO::is_message_Set() const{
    return m_message_isSet;
}

bool OAIOfferErrorDTO::is_message_Valid() const{
    return m_message_isValid;
}

QString OAIOfferErrorDTO::getComment() const {
    return comment;
}
void OAIOfferErrorDTO::setComment(const QString &comment) {
    this->comment = comment;
    this->m_comment_isSet = true;
}

bool OAIOfferErrorDTO::is_comment_Set() const{
    return m_comment_isSet;
}

bool OAIOfferErrorDTO::is_comment_Valid() const{
    return m_comment_isValid;
}

bool OAIOfferErrorDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_message_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_comment_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOfferErrorDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
