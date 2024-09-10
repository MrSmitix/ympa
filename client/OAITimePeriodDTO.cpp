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

#include "OAITimePeriodDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAITimePeriodDTO::OAITimePeriodDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAITimePeriodDTO::OAITimePeriodDTO() {
    this->initializeModel();
}

OAITimePeriodDTO::~OAITimePeriodDTO() {}

void OAITimePeriodDTO::initializeModel() {

    m_time_period_isSet = false;
    m_time_period_isValid = false;

    m_time_unit_isSet = false;
    m_time_unit_isValid = false;

    m_comment_isSet = false;
    m_comment_isValid = false;
}

void OAITimePeriodDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAITimePeriodDTO::fromJsonObject(QJsonObject json) {

    m_time_period_isValid = ::OpenAPI::fromJsonValue(m_time_period, json[QString("timePeriod")]);
    m_time_period_isSet = !json[QString("timePeriod")].isNull() && m_time_period_isValid;

    m_time_unit_isValid = ::OpenAPI::fromJsonValue(m_time_unit, json[QString("timeUnit")]);
    m_time_unit_isSet = !json[QString("timeUnit")].isNull() && m_time_unit_isValid;

    m_comment_isValid = ::OpenAPI::fromJsonValue(m_comment, json[QString("comment")]);
    m_comment_isSet = !json[QString("comment")].isNull() && m_comment_isValid;
}

QString OAITimePeriodDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAITimePeriodDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_time_period_isSet) {
        obj.insert(QString("timePeriod"), ::OpenAPI::toJsonValue(m_time_period));
    }
    if (m_time_unit.isSet()) {
        obj.insert(QString("timeUnit"), ::OpenAPI::toJsonValue(m_time_unit));
    }
    if (m_comment_isSet) {
        obj.insert(QString("comment"), ::OpenAPI::toJsonValue(m_comment));
    }
    return obj;
}

qint32 OAITimePeriodDTO::getTimePeriod() const {
    return m_time_period;
}
void OAITimePeriodDTO::setTimePeriod(const qint32 &time_period) {
    m_time_period = time_period;
    m_time_period_isSet = true;
}

bool OAITimePeriodDTO::is_time_period_Set() const{
    return m_time_period_isSet;
}

bool OAITimePeriodDTO::is_time_period_Valid() const{
    return m_time_period_isValid;
}

OAITimeUnitType OAITimePeriodDTO::getTimeUnit() const {
    return m_time_unit;
}
void OAITimePeriodDTO::setTimeUnit(const OAITimeUnitType &time_unit) {
    m_time_unit = time_unit;
    m_time_unit_isSet = true;
}

bool OAITimePeriodDTO::is_time_unit_Set() const{
    return m_time_unit_isSet;
}

bool OAITimePeriodDTO::is_time_unit_Valid() const{
    return m_time_unit_isValid;
}

QString OAITimePeriodDTO::getComment() const {
    return m_comment;
}
void OAITimePeriodDTO::setComment(const QString &comment) {
    m_comment = comment;
    m_comment_isSet = true;
}

bool OAITimePeriodDTO::is_comment_Set() const{
    return m_comment_isSet;
}

bool OAITimePeriodDTO::is_comment_Valid() const{
    return m_comment_isValid;
}

bool OAITimePeriodDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_time_period_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_time_unit.isSet()) {
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

bool OAITimePeriodDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_time_period_isValid && m_time_unit_isValid && true;
}

} // namespace OpenAPI
