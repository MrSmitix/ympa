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

#include "OAIOrderBuyerInfoDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderBuyerInfoDTO::OAIOrderBuyerInfoDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderBuyerInfoDTO::OAIOrderBuyerInfoDTO() {
    this->initializeModel();
}

OAIOrderBuyerInfoDTO::~OAIOrderBuyerInfoDTO() {}

void OAIOrderBuyerInfoDTO::initializeModel() {

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

    m_phone_isSet = false;
    m_phone_isValid = false;
}

void OAIOrderBuyerInfoDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderBuyerInfoDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_last_name_isValid = ::OpenAPI::fromJsonValue(last_name, json[QString("lastName")]);
    m_last_name_isSet = !json[QString("lastName")].isNull() && m_last_name_isValid;

    m_first_name_isValid = ::OpenAPI::fromJsonValue(first_name, json[QString("firstName")]);
    m_first_name_isSet = !json[QString("firstName")].isNull() && m_first_name_isValid;

    m_middle_name_isValid = ::OpenAPI::fromJsonValue(middle_name, json[QString("middleName")]);
    m_middle_name_isSet = !json[QString("middleName")].isNull() && m_middle_name_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_phone_isValid = ::OpenAPI::fromJsonValue(phone, json[QString("phone")]);
    m_phone_isSet = !json[QString("phone")].isNull() && m_phone_isValid;
}

QString OAIOrderBuyerInfoDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderBuyerInfoDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_last_name_isSet) {
        obj.insert(QString("lastName"), ::OpenAPI::toJsonValue(last_name));
    }
    if (m_first_name_isSet) {
        obj.insert(QString("firstName"), ::OpenAPI::toJsonValue(first_name));
    }
    if (m_middle_name_isSet) {
        obj.insert(QString("middleName"), ::OpenAPI::toJsonValue(middle_name));
    }
    if (type.isSet()) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_phone_isSet) {
        obj.insert(QString("phone"), ::OpenAPI::toJsonValue(phone));
    }
    return obj;
}

QString OAIOrderBuyerInfoDTO::getId() const {
    return id;
}
void OAIOrderBuyerInfoDTO::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIOrderBuyerInfoDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIOrderBuyerInfoDTO::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIOrderBuyerInfoDTO::getLastName() const {
    return last_name;
}
void OAIOrderBuyerInfoDTO::setLastName(const QString &last_name) {
    this->last_name = last_name;
    this->m_last_name_isSet = true;
}

bool OAIOrderBuyerInfoDTO::is_last_name_Set() const{
    return m_last_name_isSet;
}

bool OAIOrderBuyerInfoDTO::is_last_name_Valid() const{
    return m_last_name_isValid;
}

QString OAIOrderBuyerInfoDTO::getFirstName() const {
    return first_name;
}
void OAIOrderBuyerInfoDTO::setFirstName(const QString &first_name) {
    this->first_name = first_name;
    this->m_first_name_isSet = true;
}

bool OAIOrderBuyerInfoDTO::is_first_name_Set() const{
    return m_first_name_isSet;
}

bool OAIOrderBuyerInfoDTO::is_first_name_Valid() const{
    return m_first_name_isValid;
}

QString OAIOrderBuyerInfoDTO::getMiddleName() const {
    return middle_name;
}
void OAIOrderBuyerInfoDTO::setMiddleName(const QString &middle_name) {
    this->middle_name = middle_name;
    this->m_middle_name_isSet = true;
}

bool OAIOrderBuyerInfoDTO::is_middle_name_Set() const{
    return m_middle_name_isSet;
}

bool OAIOrderBuyerInfoDTO::is_middle_name_Valid() const{
    return m_middle_name_isValid;
}

OAIOrderBuyerType OAIOrderBuyerInfoDTO::getType() const {
    return type;
}
void OAIOrderBuyerInfoDTO::setType(const OAIOrderBuyerType &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIOrderBuyerInfoDTO::is_type_Set() const{
    return m_type_isSet;
}

bool OAIOrderBuyerInfoDTO::is_type_Valid() const{
    return m_type_isValid;
}

QString OAIOrderBuyerInfoDTO::getPhone() const {
    return phone;
}
void OAIOrderBuyerInfoDTO::setPhone(const QString &phone) {
    this->phone = phone;
    this->m_phone_isSet = true;
}

bool OAIOrderBuyerInfoDTO::is_phone_Set() const{
    return m_phone_isSet;
}

bool OAIOrderBuyerInfoDTO::is_phone_Valid() const{
    return m_phone_isValid;
}

bool OAIOrderBuyerInfoDTO::isSet() const {
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

        if (type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_phone_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderBuyerInfoDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
