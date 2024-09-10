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

#include "OAIGpsDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGpsDTO::OAIGpsDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGpsDTO::OAIGpsDTO() {
    this->initializeModel();
}

OAIGpsDTO::~OAIGpsDTO() {}

void OAIGpsDTO::initializeModel() {

    m_latitude_isSet = false;
    m_latitude_isValid = false;

    m_longitude_isSet = false;
    m_longitude_isValid = false;
}

void OAIGpsDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGpsDTO::fromJsonObject(QJsonObject json) {

    m_latitude_isValid = ::OpenAPI::fromJsonValue(m_latitude, json[QString("latitude")]);
    m_latitude_isSet = !json[QString("latitude")].isNull() && m_latitude_isValid;

    m_longitude_isValid = ::OpenAPI::fromJsonValue(m_longitude, json[QString("longitude")]);
    m_longitude_isSet = !json[QString("longitude")].isNull() && m_longitude_isValid;
}

QString OAIGpsDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGpsDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_latitude_isSet) {
        obj.insert(QString("latitude"), ::OpenAPI::toJsonValue(m_latitude));
    }
    if (m_longitude_isSet) {
        obj.insert(QString("longitude"), ::OpenAPI::toJsonValue(m_longitude));
    }
    return obj;
}

double OAIGpsDTO::getLatitude() const {
    return m_latitude;
}
void OAIGpsDTO::setLatitude(const double &latitude) {
    m_latitude = latitude;
    m_latitude_isSet = true;
}

bool OAIGpsDTO::is_latitude_Set() const{
    return m_latitude_isSet;
}

bool OAIGpsDTO::is_latitude_Valid() const{
    return m_latitude_isValid;
}

double OAIGpsDTO::getLongitude() const {
    return m_longitude;
}
void OAIGpsDTO::setLongitude(const double &longitude) {
    m_longitude = longitude;
    m_longitude_isSet = true;
}

bool OAIGpsDTO::is_longitude_Set() const{
    return m_longitude_isSet;
}

bool OAIGpsDTO::is_longitude_Valid() const{
    return m_longitude_isValid;
}

bool OAIGpsDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_latitude_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_longitude_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGpsDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_latitude_isValid && m_longitude_isValid && true;
}

} // namespace OpenAPI
