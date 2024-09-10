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

#include "OAIGetPromoBestsellerInfoDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetPromoBestsellerInfoDTO::OAIGetPromoBestsellerInfoDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetPromoBestsellerInfoDTO::OAIGetPromoBestsellerInfoDTO() {
    this->initializeModel();
}

OAIGetPromoBestsellerInfoDTO::~OAIGetPromoBestsellerInfoDTO() {}

void OAIGetPromoBestsellerInfoDTO::initializeModel() {

    m_bestseller_isSet = false;
    m_bestseller_isValid = false;

    m_entry_deadline_isSet = false;
    m_entry_deadline_isValid = false;
}

void OAIGetPromoBestsellerInfoDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetPromoBestsellerInfoDTO::fromJsonObject(QJsonObject json) {

    m_bestseller_isValid = ::OpenAPI::fromJsonValue(m_bestseller, json[QString("bestseller")]);
    m_bestseller_isSet = !json[QString("bestseller")].isNull() && m_bestseller_isValid;

    m_entry_deadline_isValid = ::OpenAPI::fromJsonValue(m_entry_deadline, json[QString("entryDeadline")]);
    m_entry_deadline_isSet = !json[QString("entryDeadline")].isNull() && m_entry_deadline_isValid;
}

QString OAIGetPromoBestsellerInfoDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetPromoBestsellerInfoDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_bestseller_isSet) {
        obj.insert(QString("bestseller"), ::OpenAPI::toJsonValue(m_bestseller));
    }
    if (m_entry_deadline_isSet) {
        obj.insert(QString("entryDeadline"), ::OpenAPI::toJsonValue(m_entry_deadline));
    }
    return obj;
}

bool OAIGetPromoBestsellerInfoDTO::isBestseller() const {
    return m_bestseller;
}
void OAIGetPromoBestsellerInfoDTO::setBestseller(const bool &bestseller) {
    m_bestseller = bestseller;
    m_bestseller_isSet = true;
}

bool OAIGetPromoBestsellerInfoDTO::is_bestseller_Set() const{
    return m_bestseller_isSet;
}

bool OAIGetPromoBestsellerInfoDTO::is_bestseller_Valid() const{
    return m_bestseller_isValid;
}

QDateTime OAIGetPromoBestsellerInfoDTO::getEntryDeadline() const {
    return m_entry_deadline;
}
void OAIGetPromoBestsellerInfoDTO::setEntryDeadline(const QDateTime &entry_deadline) {
    m_entry_deadline = entry_deadline;
    m_entry_deadline_isSet = true;
}

bool OAIGetPromoBestsellerInfoDTO::is_entry_deadline_Set() const{
    return m_entry_deadline_isSet;
}

bool OAIGetPromoBestsellerInfoDTO::is_entry_deadline_Valid() const{
    return m_entry_deadline_isValid;
}

bool OAIGetPromoBestsellerInfoDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_bestseller_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_entry_deadline_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetPromoBestsellerInfoDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_bestseller_isValid && true;
}

} // namespace OpenAPI
