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

#include "OAIOfferMappingErrorDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOfferMappingErrorDTO::OAIOfferMappingErrorDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOfferMappingErrorDTO::OAIOfferMappingErrorDTO() {
    this->initializeModel();
}

OAIOfferMappingErrorDTO::~OAIOfferMappingErrorDTO() {}

void OAIOfferMappingErrorDTO::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_parameter_id_isSet = false;
    m_parameter_id_isValid = false;

    m_message_isSet = false;
    m_message_isValid = false;
}

void OAIOfferMappingErrorDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOfferMappingErrorDTO::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_parameter_id_isValid = ::OpenAPI::fromJsonValue(parameter_id, json[QString("parameterId")]);
    m_parameter_id_isSet = !json[QString("parameterId")].isNull() && m_parameter_id_isValid;

    m_message_isValid = ::OpenAPI::fromJsonValue(message, json[QString("message")]);
    m_message_isSet = !json[QString("message")].isNull() && m_message_isValid;
}

QString OAIOfferMappingErrorDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOfferMappingErrorDTO::asJsonObject() const {
    QJsonObject obj;
    if (type.isSet()) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_parameter_id_isSet) {
        obj.insert(QString("parameterId"), ::OpenAPI::toJsonValue(parameter_id));
    }
    if (m_message_isSet) {
        obj.insert(QString("message"), ::OpenAPI::toJsonValue(message));
    }
    return obj;
}

OAIOfferMappingErrorType OAIOfferMappingErrorDTO::getType() const {
    return type;
}
void OAIOfferMappingErrorDTO::setType(const OAIOfferMappingErrorType &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIOfferMappingErrorDTO::is_type_Set() const{
    return m_type_isSet;
}

bool OAIOfferMappingErrorDTO::is_type_Valid() const{
    return m_type_isValid;
}

qint64 OAIOfferMappingErrorDTO::getParameterId() const {
    return parameter_id;
}
void OAIOfferMappingErrorDTO::setParameterId(const qint64 &parameter_id) {
    this->parameter_id = parameter_id;
    this->m_parameter_id_isSet = true;
}

bool OAIOfferMappingErrorDTO::is_parameter_id_Set() const{
    return m_parameter_id_isSet;
}

bool OAIOfferMappingErrorDTO::is_parameter_id_Valid() const{
    return m_parameter_id_isValid;
}

QString OAIOfferMappingErrorDTO::getMessage() const {
    return message;
}
void OAIOfferMappingErrorDTO::setMessage(const QString &message) {
    this->message = message;
    this->m_message_isSet = true;
}

bool OAIOfferMappingErrorDTO::is_message_Set() const{
    return m_message_isSet;
}

bool OAIOfferMappingErrorDTO::is_message_Valid() const{
    return m_message_isValid;
}

bool OAIOfferMappingErrorDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_parameter_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_message_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOfferMappingErrorDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_type_isValid && m_message_isValid && true;
}

} // namespace OpenAPI
