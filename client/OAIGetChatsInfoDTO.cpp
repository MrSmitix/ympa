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

#include "OAIGetChatsInfoDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetChatsInfoDTO::OAIGetChatsInfoDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetChatsInfoDTO::OAIGetChatsInfoDTO() {
    this->initializeModel();
}

OAIGetChatsInfoDTO::~OAIGetChatsInfoDTO() {}

void OAIGetChatsInfoDTO::initializeModel() {

    m_chats_isSet = false;
    m_chats_isValid = false;

    m_paging_isSet = false;
    m_paging_isValid = false;
}

void OAIGetChatsInfoDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetChatsInfoDTO::fromJsonObject(QJsonObject json) {

    m_chats_isValid = ::OpenAPI::fromJsonValue(m_chats, json[QString("chats")]);
    m_chats_isSet = !json[QString("chats")].isNull() && m_chats_isValid;

    m_paging_isValid = ::OpenAPI::fromJsonValue(m_paging, json[QString("paging")]);
    m_paging_isSet = !json[QString("paging")].isNull() && m_paging_isValid;
}

QString OAIGetChatsInfoDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetChatsInfoDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_chats.size() > 0) {
        obj.insert(QString("chats"), ::OpenAPI::toJsonValue(m_chats));
    }
    if (m_paging.isSet()) {
        obj.insert(QString("paging"), ::OpenAPI::toJsonValue(m_paging));
    }
    return obj;
}

QList<OAIGetChatInfoDTO> OAIGetChatsInfoDTO::getChats() const {
    return m_chats;
}
void OAIGetChatsInfoDTO::setChats(const QList<OAIGetChatInfoDTO> &chats) {
    m_chats = chats;
    m_chats_isSet = true;
}

bool OAIGetChatsInfoDTO::is_chats_Set() const{
    return m_chats_isSet;
}

bool OAIGetChatsInfoDTO::is_chats_Valid() const{
    return m_chats_isValid;
}

OAIForwardScrollingPagerDTO OAIGetChatsInfoDTO::getPaging() const {
    return m_paging;
}
void OAIGetChatsInfoDTO::setPaging(const OAIForwardScrollingPagerDTO &paging) {
    m_paging = paging;
    m_paging_isSet = true;
}

bool OAIGetChatsInfoDTO::is_paging_Set() const{
    return m_paging_isSet;
}

bool OAIGetChatsInfoDTO::is_paging_Valid() const{
    return m_paging_isValid;
}

bool OAIGetChatsInfoDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_chats.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_paging.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetChatsInfoDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_chats_isValid && true;
}

} // namespace OpenAPI
