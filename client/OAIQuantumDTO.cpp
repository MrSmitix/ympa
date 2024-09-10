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

#include "OAIQuantumDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIQuantumDTO::OAIQuantumDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIQuantumDTO::OAIQuantumDTO() {
    this->initializeModel();
}

OAIQuantumDTO::~OAIQuantumDTO() {}

void OAIQuantumDTO::initializeModel() {

    m_min_quantity_isSet = false;
    m_min_quantity_isValid = false;

    m_step_quantity_isSet = false;
    m_step_quantity_isValid = false;
}

void OAIQuantumDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIQuantumDTO::fromJsonObject(QJsonObject json) {

    m_min_quantity_isValid = ::OpenAPI::fromJsonValue(m_min_quantity, json[QString("minQuantity")]);
    m_min_quantity_isSet = !json[QString("minQuantity")].isNull() && m_min_quantity_isValid;

    m_step_quantity_isValid = ::OpenAPI::fromJsonValue(m_step_quantity, json[QString("stepQuantity")]);
    m_step_quantity_isSet = !json[QString("stepQuantity")].isNull() && m_step_quantity_isValid;
}

QString OAIQuantumDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIQuantumDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_min_quantity_isSet) {
        obj.insert(QString("minQuantity"), ::OpenAPI::toJsonValue(m_min_quantity));
    }
    if (m_step_quantity_isSet) {
        obj.insert(QString("stepQuantity"), ::OpenAPI::toJsonValue(m_step_quantity));
    }
    return obj;
}

qint32 OAIQuantumDTO::getMinQuantity() const {
    return m_min_quantity;
}
void OAIQuantumDTO::setMinQuantity(const qint32 &min_quantity) {
    m_min_quantity = min_quantity;
    m_min_quantity_isSet = true;
}

bool OAIQuantumDTO::is_min_quantity_Set() const{
    return m_min_quantity_isSet;
}

bool OAIQuantumDTO::is_min_quantity_Valid() const{
    return m_min_quantity_isValid;
}

qint32 OAIQuantumDTO::getStepQuantity() const {
    return m_step_quantity;
}
void OAIQuantumDTO::setStepQuantity(const qint32 &step_quantity) {
    m_step_quantity = step_quantity;
    m_step_quantity_isSet = true;
}

bool OAIQuantumDTO::is_step_quantity_Set() const{
    return m_step_quantity_isSet;
}

bool OAIQuantumDTO::is_step_quantity_Valid() const{
    return m_step_quantity_isValid;
}

bool OAIQuantumDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_min_quantity_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_step_quantity_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIQuantumDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
