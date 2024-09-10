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

#include "OAIOrderItemDetailDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderItemDetailDTO::OAIOrderItemDetailDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderItemDetailDTO::OAIOrderItemDetailDTO() {
    this->initializeModel();
}

OAIOrderItemDetailDTO::~OAIOrderItemDetailDTO() {}

void OAIOrderItemDetailDTO::initializeModel() {

    m_item_count_isSet = false;
    m_item_count_isValid = false;

    m_item_status_isSet = false;
    m_item_status_isValid = false;

    m_update_date_isSet = false;
    m_update_date_isValid = false;
}

void OAIOrderItemDetailDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderItemDetailDTO::fromJsonObject(QJsonObject json) {

    m_item_count_isValid = ::OpenAPI::fromJsonValue(item_count, json[QString("itemCount")]);
    m_item_count_isSet = !json[QString("itemCount")].isNull() && m_item_count_isValid;

    m_item_status_isValid = ::OpenAPI::fromJsonValue(item_status, json[QString("itemStatus")]);
    m_item_status_isSet = !json[QString("itemStatus")].isNull() && m_item_status_isValid;

    m_update_date_isValid = ::OpenAPI::fromJsonValue(update_date, json[QString("updateDate")]);
    m_update_date_isSet = !json[QString("updateDate")].isNull() && m_update_date_isValid;
}

QString OAIOrderItemDetailDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderItemDetailDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_item_count_isSet) {
        obj.insert(QString("itemCount"), ::OpenAPI::toJsonValue(item_count));
    }
    if (item_status.isSet()) {
        obj.insert(QString("itemStatus"), ::OpenAPI::toJsonValue(item_status));
    }
    if (m_update_date_isSet) {
        obj.insert(QString("updateDate"), ::OpenAPI::toJsonValue(update_date));
    }
    return obj;
}

qint64 OAIOrderItemDetailDTO::getItemCount() const {
    return item_count;
}
void OAIOrderItemDetailDTO::setItemCount(const qint64 &item_count) {
    this->item_count = item_count;
    this->m_item_count_isSet = true;
}

bool OAIOrderItemDetailDTO::is_item_count_Set() const{
    return m_item_count_isSet;
}

bool OAIOrderItemDetailDTO::is_item_count_Valid() const{
    return m_item_count_isValid;
}

OAIOrderItemStatusType OAIOrderItemDetailDTO::getItemStatus() const {
    return item_status;
}
void OAIOrderItemDetailDTO::setItemStatus(const OAIOrderItemStatusType &item_status) {
    this->item_status = item_status;
    this->m_item_status_isSet = true;
}

bool OAIOrderItemDetailDTO::is_item_status_Set() const{
    return m_item_status_isSet;
}

bool OAIOrderItemDetailDTO::is_item_status_Valid() const{
    return m_item_status_isValid;
}

QString OAIOrderItemDetailDTO::getUpdateDate() const {
    return update_date;
}
void OAIOrderItemDetailDTO::setUpdateDate(const QString &update_date) {
    this->update_date = update_date;
    this->m_update_date_isSet = true;
}

bool OAIOrderItemDetailDTO::is_update_date_Set() const{
    return m_update_date_isSet;
}

bool OAIOrderItemDetailDTO::is_update_date_Valid() const{
    return m_update_date_isValid;
}

bool OAIOrderItemDetailDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_item_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (item_status.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_update_date_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderItemDetailDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
