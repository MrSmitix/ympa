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

#include "OAIValueRestrictionDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIValueRestrictionDTO::OAIValueRestrictionDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIValueRestrictionDTO::OAIValueRestrictionDTO() {
    this->initializeModel();
}

OAIValueRestrictionDTO::~OAIValueRestrictionDTO() {}

void OAIValueRestrictionDTO::initializeModel() {

    m_limiting_parameter_id_isSet = false;
    m_limiting_parameter_id_isValid = false;

    m_limited_values_isSet = false;
    m_limited_values_isValid = false;
}

void OAIValueRestrictionDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIValueRestrictionDTO::fromJsonObject(QJsonObject json) {

    m_limiting_parameter_id_isValid = ::OpenAPI::fromJsonValue(m_limiting_parameter_id, json[QString("limitingParameterId")]);
    m_limiting_parameter_id_isSet = !json[QString("limitingParameterId")].isNull() && m_limiting_parameter_id_isValid;

    m_limited_values_isValid = ::OpenAPI::fromJsonValue(m_limited_values, json[QString("limitedValues")]);
    m_limited_values_isSet = !json[QString("limitedValues")].isNull() && m_limited_values_isValid;
}

QString OAIValueRestrictionDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIValueRestrictionDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_limiting_parameter_id_isSet) {
        obj.insert(QString("limitingParameterId"), ::OpenAPI::toJsonValue(m_limiting_parameter_id));
    }
    if (m_limited_values.size() > 0) {
        obj.insert(QString("limitedValues"), ::OpenAPI::toJsonValue(m_limited_values));
    }
    return obj;
}

qint64 OAIValueRestrictionDTO::getLimitingParameterId() const {
    return m_limiting_parameter_id;
}
void OAIValueRestrictionDTO::setLimitingParameterId(const qint64 &limiting_parameter_id) {
    m_limiting_parameter_id = limiting_parameter_id;
    m_limiting_parameter_id_isSet = true;
}

bool OAIValueRestrictionDTO::is_limiting_parameter_id_Set() const{
    return m_limiting_parameter_id_isSet;
}

bool OAIValueRestrictionDTO::is_limiting_parameter_id_Valid() const{
    return m_limiting_parameter_id_isValid;
}

QList<OAIOptionValuesLimitedDTO> OAIValueRestrictionDTO::getLimitedValues() const {
    return m_limited_values;
}
void OAIValueRestrictionDTO::setLimitedValues(const QList<OAIOptionValuesLimitedDTO> &limited_values) {
    m_limited_values = limited_values;
    m_limited_values_isSet = true;
}

bool OAIValueRestrictionDTO::is_limited_values_Set() const{
    return m_limited_values_isSet;
}

bool OAIValueRestrictionDTO::is_limited_values_Valid() const{
    return m_limited_values_isValid;
}

bool OAIValueRestrictionDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_limiting_parameter_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_limited_values.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIValueRestrictionDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_limiting_parameter_id_isValid && m_limited_values_isValid && true;
}

} // namespace OpenAPI
