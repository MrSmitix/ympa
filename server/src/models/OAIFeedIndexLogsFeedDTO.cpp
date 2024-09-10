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

#include "OAIFeedIndexLogsFeedDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIFeedIndexLogsFeedDTO::OAIFeedIndexLogsFeedDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIFeedIndexLogsFeedDTO::OAIFeedIndexLogsFeedDTO() {
    this->initializeModel();
}

OAIFeedIndexLogsFeedDTO::~OAIFeedIndexLogsFeedDTO() {}

void OAIFeedIndexLogsFeedDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;
}

void OAIFeedIndexLogsFeedDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIFeedIndexLogsFeedDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;
}

QString OAIFeedIndexLogsFeedDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIFeedIndexLogsFeedDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    return obj;
}

qint64 OAIFeedIndexLogsFeedDTO::getId() const {
    return id;
}
void OAIFeedIndexLogsFeedDTO::setId(const qint64 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIFeedIndexLogsFeedDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIFeedIndexLogsFeedDTO::is_id_Valid() const{
    return m_id_isValid;
}

bool OAIFeedIndexLogsFeedDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIFeedIndexLogsFeedDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
