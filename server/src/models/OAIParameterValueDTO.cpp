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

#include "OAIParameterValueDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIParameterValueDTO::OAIParameterValueDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIParameterValueDTO::OAIParameterValueDTO() {
    this->initializeModel();
}

OAIParameterValueDTO::~OAIParameterValueDTO() {}

void OAIParameterValueDTO::initializeModel() {

    m_parameter_id_isSet = false;
    m_parameter_id_isValid = false;

    m_unit_id_isSet = false;
    m_unit_id_isValid = false;

    m_value_id_isSet = false;
    m_value_id_isValid = false;

    m_value_isSet = false;
    m_value_isValid = false;
}

void OAIParameterValueDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIParameterValueDTO::fromJsonObject(QJsonObject json) {

    m_parameter_id_isValid = ::OpenAPI::fromJsonValue(parameter_id, json[QString("parameterId")]);
    m_parameter_id_isSet = !json[QString("parameterId")].isNull() && m_parameter_id_isValid;

    m_unit_id_isValid = ::OpenAPI::fromJsonValue(unit_id, json[QString("unitId")]);
    m_unit_id_isSet = !json[QString("unitId")].isNull() && m_unit_id_isValid;

    m_value_id_isValid = ::OpenAPI::fromJsonValue(value_id, json[QString("valueId")]);
    m_value_id_isSet = !json[QString("valueId")].isNull() && m_value_id_isValid;

    m_value_isValid = ::OpenAPI::fromJsonValue(value, json[QString("value")]);
    m_value_isSet = !json[QString("value")].isNull() && m_value_isValid;
}

QString OAIParameterValueDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIParameterValueDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_parameter_id_isSet) {
        obj.insert(QString("parameterId"), ::OpenAPI::toJsonValue(parameter_id));
    }
    if (m_unit_id_isSet) {
        obj.insert(QString("unitId"), ::OpenAPI::toJsonValue(unit_id));
    }
    if (m_value_id_isSet) {
        obj.insert(QString("valueId"), ::OpenAPI::toJsonValue(value_id));
    }
    if (m_value_isSet) {
        obj.insert(QString("value"), ::OpenAPI::toJsonValue(value));
    }
    return obj;
}

qint64 OAIParameterValueDTO::getParameterId() const {
    return parameter_id;
}
void OAIParameterValueDTO::setParameterId(const qint64 &parameter_id) {
    this->parameter_id = parameter_id;
    this->m_parameter_id_isSet = true;
}

bool OAIParameterValueDTO::is_parameter_id_Set() const{
    return m_parameter_id_isSet;
}

bool OAIParameterValueDTO::is_parameter_id_Valid() const{
    return m_parameter_id_isValid;
}

qint64 OAIParameterValueDTO::getUnitId() const {
    return unit_id;
}
void OAIParameterValueDTO::setUnitId(const qint64 &unit_id) {
    this->unit_id = unit_id;
    this->m_unit_id_isSet = true;
}

bool OAIParameterValueDTO::is_unit_id_Set() const{
    return m_unit_id_isSet;
}

bool OAIParameterValueDTO::is_unit_id_Valid() const{
    return m_unit_id_isValid;
}

qint64 OAIParameterValueDTO::getValueId() const {
    return value_id;
}
void OAIParameterValueDTO::setValueId(const qint64 &value_id) {
    this->value_id = value_id;
    this->m_value_id_isSet = true;
}

bool OAIParameterValueDTO::is_value_id_Set() const{
    return m_value_id_isSet;
}

bool OAIParameterValueDTO::is_value_id_Valid() const{
    return m_value_id_isValid;
}

QString OAIParameterValueDTO::getValue() const {
    return value;
}
void OAIParameterValueDTO::setValue(const QString &value) {
    this->value = value;
    this->m_value_isSet = true;
}

bool OAIParameterValueDTO::is_value_Set() const{
    return m_value_isSet;
}

bool OAIParameterValueDTO::is_value_Valid() const{
    return m_value_isValid;
}

bool OAIParameterValueDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_parameter_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_unit_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_value_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_value_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIParameterValueDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_parameter_id_isValid && true;
}

} // namespace OpenAPI
