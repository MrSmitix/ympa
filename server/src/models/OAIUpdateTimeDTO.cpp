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

#include "OAIUpdateTimeDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUpdateTimeDTO::OAIUpdateTimeDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUpdateTimeDTO::OAIUpdateTimeDTO() {
    this->initializeModel();
}

OAIUpdateTimeDTO::~OAIUpdateTimeDTO() {}

void OAIUpdateTimeDTO::initializeModel() {

    m_updated_at_isSet = false;
    m_updated_at_isValid = false;
}

void OAIUpdateTimeDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUpdateTimeDTO::fromJsonObject(QJsonObject json) {

    m_updated_at_isValid = ::OpenAPI::fromJsonValue(updated_at, json[QString("updatedAt")]);
    m_updated_at_isSet = !json[QString("updatedAt")].isNull() && m_updated_at_isValid;
}

QString OAIUpdateTimeDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUpdateTimeDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_updated_at_isSet) {
        obj.insert(QString("updatedAt"), ::OpenAPI::toJsonValue(updated_at));
    }
    return obj;
}

QDateTime OAIUpdateTimeDTO::getUpdatedAt() const {
    return updated_at;
}
void OAIUpdateTimeDTO::setUpdatedAt(const QDateTime &updated_at) {
    this->updated_at = updated_at;
    this->m_updated_at_isSet = true;
}

bool OAIUpdateTimeDTO::is_updated_at_Set() const{
    return m_updated_at_isSet;
}

bool OAIUpdateTimeDTO::is_updated_at_Valid() const{
    return m_updated_at_isValid;
}

bool OAIUpdateTimeDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_updated_at_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUpdateTimeDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_updated_at_isValid && true;
}

} // namespace OpenAPI
