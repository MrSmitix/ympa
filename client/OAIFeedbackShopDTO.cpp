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

#include "OAIFeedbackShopDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIFeedbackShopDTO::OAIFeedbackShopDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIFeedbackShopDTO::OAIFeedbackShopDTO() {
    this->initializeModel();
}

OAIFeedbackShopDTO::~OAIFeedbackShopDTO() {}

void OAIFeedbackShopDTO::initializeModel() {

    m_name_isSet = false;
    m_name_isValid = false;
}

void OAIFeedbackShopDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIFeedbackShopDTO::fromJsonObject(QJsonObject json) {

    m_name_isValid = ::OpenAPI::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;
}

QString OAIFeedbackShopDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIFeedbackShopDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(m_name));
    }
    return obj;
}

QString OAIFeedbackShopDTO::getName() const {
    return m_name;
}
void OAIFeedbackShopDTO::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool OAIFeedbackShopDTO::is_name_Set() const{
    return m_name_isSet;
}

bool OAIFeedbackShopDTO::is_name_Valid() const{
    return m_name_isValid;
}

bool OAIFeedbackShopDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIFeedbackShopDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
