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

#include "OAIGetChatsRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetChatsRequest::OAIGetChatsRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetChatsRequest::OAIGetChatsRequest() {
    this->initializeModel();
}

OAIGetChatsRequest::~OAIGetChatsRequest() {}

void OAIGetChatsRequest::initializeModel() {

    m_order_ids_isSet = false;
    m_order_ids_isValid = false;

    m_types_isSet = false;
    m_types_isValid = false;

    m_statuses_isSet = false;
    m_statuses_isValid = false;
}

void OAIGetChatsRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetChatsRequest::fromJsonObject(QJsonObject json) {

    m_order_ids_isValid = ::OpenAPI::fromJsonValue(m_order_ids, json[QString("orderIds")]);
    m_order_ids_isSet = !json[QString("orderIds")].isNull() && m_order_ids_isValid;

    m_types_isValid = ::OpenAPI::fromJsonValue(m_types, json[QString("types")]);
    m_types_isSet = !json[QString("types")].isNull() && m_types_isValid;

    m_statuses_isValid = ::OpenAPI::fromJsonValue(m_statuses, json[QString("statuses")]);
    m_statuses_isSet = !json[QString("statuses")].isNull() && m_statuses_isValid;
}

QString OAIGetChatsRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetChatsRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_order_ids.size() > 0) {
        obj.insert(QString("orderIds"), ::OpenAPI::toJsonValue(m_order_ids));
    }
    if (m_types.size() > 0) {
        obj.insert(QString("types"), ::OpenAPI::toJsonValue(m_types));
    }
    if (m_statuses.size() > 0) {
        obj.insert(QString("statuses"), ::OpenAPI::toJsonValue(m_statuses));
    }
    return obj;
}

QList<qint64> OAIGetChatsRequest::getOrderIds() const {
    return m_order_ids;
}
void OAIGetChatsRequest::setOrderIds(const QList<qint64> &order_ids) {
    m_order_ids = order_ids;
    m_order_ids_isSet = true;
}

bool OAIGetChatsRequest::is_order_ids_Set() const{
    return m_order_ids_isSet;
}

bool OAIGetChatsRequest::is_order_ids_Valid() const{
    return m_order_ids_isValid;
}

QList<OAIChatType> OAIGetChatsRequest::getTypes() const {
    return m_types;
}
void OAIGetChatsRequest::setTypes(const QList<OAIChatType> &types) {
    m_types = types;
    m_types_isSet = true;
}

bool OAIGetChatsRequest::is_types_Set() const{
    return m_types_isSet;
}

bool OAIGetChatsRequest::is_types_Valid() const{
    return m_types_isValid;
}

QList<OAIChatStatusType> OAIGetChatsRequest::getStatuses() const {
    return m_statuses;
}
void OAIGetChatsRequest::setStatuses(const QList<OAIChatStatusType> &statuses) {
    m_statuses = statuses;
    m_statuses_isSet = true;
}

bool OAIGetChatsRequest::is_statuses_Set() const{
    return m_statuses_isSet;
}

bool OAIGetChatsRequest::is_statuses_Valid() const{
    return m_statuses_isValid;
}

bool OAIGetChatsRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_order_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_types.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_statuses.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetChatsRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
