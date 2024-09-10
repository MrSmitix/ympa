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

#include "OAIOrderCourierDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderCourierDTO::OAIOrderCourierDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderCourierDTO::OAIOrderCourierDTO() {
    this->initializeModel();
}

OAIOrderCourierDTO::~OAIOrderCourierDTO() {}

void OAIOrderCourierDTO::initializeModel() {

    m_full_name_isSet = false;
    m_full_name_isValid = false;

    m_phone_isSet = false;
    m_phone_isValid = false;

    m_phone_extension_isSet = false;
    m_phone_extension_isValid = false;

    m_vehicle_number_isSet = false;
    m_vehicle_number_isValid = false;

    m_vehicle_description_isSet = false;
    m_vehicle_description_isValid = false;
}

void OAIOrderCourierDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderCourierDTO::fromJsonObject(QJsonObject json) {

    m_full_name_isValid = ::OpenAPI::fromJsonValue(m_full_name, json[QString("fullName")]);
    m_full_name_isSet = !json[QString("fullName")].isNull() && m_full_name_isValid;

    m_phone_isValid = ::OpenAPI::fromJsonValue(m_phone, json[QString("phone")]);
    m_phone_isSet = !json[QString("phone")].isNull() && m_phone_isValid;

    m_phone_extension_isValid = ::OpenAPI::fromJsonValue(m_phone_extension, json[QString("phoneExtension")]);
    m_phone_extension_isSet = !json[QString("phoneExtension")].isNull() && m_phone_extension_isValid;

    m_vehicle_number_isValid = ::OpenAPI::fromJsonValue(m_vehicle_number, json[QString("vehicleNumber")]);
    m_vehicle_number_isSet = !json[QString("vehicleNumber")].isNull() && m_vehicle_number_isValid;

    m_vehicle_description_isValid = ::OpenAPI::fromJsonValue(m_vehicle_description, json[QString("vehicleDescription")]);
    m_vehicle_description_isSet = !json[QString("vehicleDescription")].isNull() && m_vehicle_description_isValid;
}

QString OAIOrderCourierDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderCourierDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_full_name_isSet) {
        obj.insert(QString("fullName"), ::OpenAPI::toJsonValue(m_full_name));
    }
    if (m_phone_isSet) {
        obj.insert(QString("phone"), ::OpenAPI::toJsonValue(m_phone));
    }
    if (m_phone_extension_isSet) {
        obj.insert(QString("phoneExtension"), ::OpenAPI::toJsonValue(m_phone_extension));
    }
    if (m_vehicle_number_isSet) {
        obj.insert(QString("vehicleNumber"), ::OpenAPI::toJsonValue(m_vehicle_number));
    }
    if (m_vehicle_description_isSet) {
        obj.insert(QString("vehicleDescription"), ::OpenAPI::toJsonValue(m_vehicle_description));
    }
    return obj;
}

QString OAIOrderCourierDTO::getFullName() const {
    return m_full_name;
}
void OAIOrderCourierDTO::setFullName(const QString &full_name) {
    m_full_name = full_name;
    m_full_name_isSet = true;
}

bool OAIOrderCourierDTO::is_full_name_Set() const{
    return m_full_name_isSet;
}

bool OAIOrderCourierDTO::is_full_name_Valid() const{
    return m_full_name_isValid;
}

QString OAIOrderCourierDTO::getPhone() const {
    return m_phone;
}
void OAIOrderCourierDTO::setPhone(const QString &phone) {
    m_phone = phone;
    m_phone_isSet = true;
}

bool OAIOrderCourierDTO::is_phone_Set() const{
    return m_phone_isSet;
}

bool OAIOrderCourierDTO::is_phone_Valid() const{
    return m_phone_isValid;
}

QString OAIOrderCourierDTO::getPhoneExtension() const {
    return m_phone_extension;
}
void OAIOrderCourierDTO::setPhoneExtension(const QString &phone_extension) {
    m_phone_extension = phone_extension;
    m_phone_extension_isSet = true;
}

bool OAIOrderCourierDTO::is_phone_extension_Set() const{
    return m_phone_extension_isSet;
}

bool OAIOrderCourierDTO::is_phone_extension_Valid() const{
    return m_phone_extension_isValid;
}

QString OAIOrderCourierDTO::getVehicleNumber() const {
    return m_vehicle_number;
}
void OAIOrderCourierDTO::setVehicleNumber(const QString &vehicle_number) {
    m_vehicle_number = vehicle_number;
    m_vehicle_number_isSet = true;
}

bool OAIOrderCourierDTO::is_vehicle_number_Set() const{
    return m_vehicle_number_isSet;
}

bool OAIOrderCourierDTO::is_vehicle_number_Valid() const{
    return m_vehicle_number_isValid;
}

QString OAIOrderCourierDTO::getVehicleDescription() const {
    return m_vehicle_description;
}
void OAIOrderCourierDTO::setVehicleDescription(const QString &vehicle_description) {
    m_vehicle_description = vehicle_description;
    m_vehicle_description_isSet = true;
}

bool OAIOrderCourierDTO::is_vehicle_description_Set() const{
    return m_vehicle_description_isSet;
}

bool OAIOrderCourierDTO::is_vehicle_description_Valid() const{
    return m_vehicle_description_isValid;
}

bool OAIOrderCourierDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_full_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_phone_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_phone_extension_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_vehicle_number_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_vehicle_description_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderCourierDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
