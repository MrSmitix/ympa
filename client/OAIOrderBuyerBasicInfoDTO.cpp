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

#include "OAIOrderBuyerBasicInfoDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderBuyerBasicInfoDTO::OAIOrderBuyerBasicInfoDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderBuyerBasicInfoDTO::OAIOrderBuyerBasicInfoDTO() {
    this->initializeModel();
}

OAIOrderBuyerBasicInfoDTO::~OAIOrderBuyerBasicInfoDTO() {}

void OAIOrderBuyerBasicInfoDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_last_name_isSet = false;
    m_last_name_isValid = false;

    m_first_name_isSet = false;
    m_first_name_isValid = false;

    m_middle_name_isSet = false;
    m_middle_name_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;
}

void OAIOrderBuyerBasicInfoDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderBuyerBasicInfoDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_last_name_isValid = ::OpenAPI::fromJsonValue(m_last_name, json[QString("lastName")]);
    m_last_name_isSet = !json[QString("lastName")].isNull() && m_last_name_isValid;

    m_first_name_isValid = ::OpenAPI::fromJsonValue(m_first_name, json[QString("firstName")]);
    m_first_name_isSet = !json[QString("firstName")].isNull() && m_first_name_isValid;

    m_middle_name_isValid = ::OpenAPI::fromJsonValue(m_middle_name, json[QString("middleName")]);
    m_middle_name_isSet = !json[QString("middleName")].isNull() && m_middle_name_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;
}

QString OAIOrderBuyerBasicInfoDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderBuyerBasicInfoDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_last_name_isSet) {
        obj.insert(QString("lastName"), ::OpenAPI::toJsonValue(m_last_name));
    }
    if (m_first_name_isSet) {
        obj.insert(QString("firstName"), ::OpenAPI::toJsonValue(m_first_name));
    }
    if (m_middle_name_isSet) {
        obj.insert(QString("middleName"), ::OpenAPI::toJsonValue(m_middle_name));
    }
    if (m_type.isSet()) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    return obj;
}

QString OAIOrderBuyerBasicInfoDTO::getId() const {
    return m_id;
}
void OAIOrderBuyerBasicInfoDTO::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIOrderBuyerBasicInfoDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIOrderBuyerBasicInfoDTO::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIOrderBuyerBasicInfoDTO::getLastName() const {
    return m_last_name;
}
void OAIOrderBuyerBasicInfoDTO::setLastName(const QString &last_name) {
    m_last_name = last_name;
    m_last_name_isSet = true;
}

bool OAIOrderBuyerBasicInfoDTO::is_last_name_Set() const{
    return m_last_name_isSet;
}

bool OAIOrderBuyerBasicInfoDTO::is_last_name_Valid() const{
    return m_last_name_isValid;
}

QString OAIOrderBuyerBasicInfoDTO::getFirstName() const {
    return m_first_name;
}
void OAIOrderBuyerBasicInfoDTO::setFirstName(const QString &first_name) {
    m_first_name = first_name;
    m_first_name_isSet = true;
}

bool OAIOrderBuyerBasicInfoDTO::is_first_name_Set() const{
    return m_first_name_isSet;
}

bool OAIOrderBuyerBasicInfoDTO::is_first_name_Valid() const{
    return m_first_name_isValid;
}

QString OAIOrderBuyerBasicInfoDTO::getMiddleName() const {
    return m_middle_name;
}
void OAIOrderBuyerBasicInfoDTO::setMiddleName(const QString &middle_name) {
    m_middle_name = middle_name;
    m_middle_name_isSet = true;
}

bool OAIOrderBuyerBasicInfoDTO::is_middle_name_Set() const{
    return m_middle_name_isSet;
}

bool OAIOrderBuyerBasicInfoDTO::is_middle_name_Valid() const{
    return m_middle_name_isValid;
}

OAIOrderBuyerType OAIOrderBuyerBasicInfoDTO::getType() const {
    return m_type;
}
void OAIOrderBuyerBasicInfoDTO::setType(const OAIOrderBuyerType &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIOrderBuyerBasicInfoDTO::is_type_Set() const{
    return m_type_isSet;
}

bool OAIOrderBuyerBasicInfoDTO::is_type_Valid() const{
    return m_type_isValid;
}

bool OAIOrderBuyerBasicInfoDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_last_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_first_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_middle_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderBuyerBasicInfoDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
