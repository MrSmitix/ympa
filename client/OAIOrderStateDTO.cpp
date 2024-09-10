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

#include "OAIOrderStateDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderStateDTO::OAIOrderStateDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderStateDTO::OAIOrderStateDTO() {
    this->initializeModel();
}

OAIOrderStateDTO::~OAIOrderStateDTO() {}

void OAIOrderStateDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_substatus_isSet = false;
    m_substatus_isValid = false;
}

void OAIOrderStateDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderStateDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(m_status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_substatus_isValid = ::OpenAPI::fromJsonValue(m_substatus, json[QString("substatus")]);
    m_substatus_isSet = !json[QString("substatus")].isNull() && m_substatus_isValid;
}

QString OAIOrderStateDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderStateDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(m_status));
    }
    if (m_substatus.isSet()) {
        obj.insert(QString("substatus"), ::OpenAPI::toJsonValue(m_substatus));
    }
    return obj;
}

qint64 OAIOrderStateDTO::getId() const {
    return m_id;
}
void OAIOrderStateDTO::setId(const qint64 &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIOrderStateDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIOrderStateDTO::is_id_Valid() const{
    return m_id_isValid;
}

OAIOrderStatusType OAIOrderStateDTO::getStatus() const {
    return m_status;
}
void OAIOrderStateDTO::setStatus(const OAIOrderStatusType &status) {
    m_status = status;
    m_status_isSet = true;
}

bool OAIOrderStateDTO::is_status_Set() const{
    return m_status_isSet;
}

bool OAIOrderStateDTO::is_status_Valid() const{
    return m_status_isValid;
}

OAIOrderSubstatusType OAIOrderStateDTO::getSubstatus() const {
    return m_substatus;
}
void OAIOrderStateDTO::setSubstatus(const OAIOrderSubstatusType &substatus) {
    m_substatus = substatus;
    m_substatus_isSet = true;
}

bool OAIOrderStateDTO::is_substatus_Set() const{
    return m_substatus_isSet;
}

bool OAIOrderStateDTO::is_substatus_Valid() const{
    return m_substatus_isValid;
}

bool OAIOrderStateDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_status.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_substatus.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderStateDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_status_isValid && true;
}

} // namespace OpenAPI
