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

#include "OAIProvideOrderItemIdentifiersRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIProvideOrderItemIdentifiersRequest::OAIProvideOrderItemIdentifiersRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIProvideOrderItemIdentifiersRequest::OAIProvideOrderItemIdentifiersRequest() {
    this->initializeModel();
}

OAIProvideOrderItemIdentifiersRequest::~OAIProvideOrderItemIdentifiersRequest() {}

void OAIProvideOrderItemIdentifiersRequest::initializeModel() {

    m_items_isSet = false;
    m_items_isValid = false;
}

void OAIProvideOrderItemIdentifiersRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIProvideOrderItemIdentifiersRequest::fromJsonObject(QJsonObject json) {

    m_items_isValid = ::OpenAPI::fromJsonValue(m_items, json[QString("items")]);
    m_items_isSet = !json[QString("items")].isNull() && m_items_isValid;
}

QString OAIProvideOrderItemIdentifiersRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIProvideOrderItemIdentifiersRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_items.size() > 0) {
        obj.insert(QString("items"), ::OpenAPI::toJsonValue(m_items));
    }
    return obj;
}

QList<OAIOrderItemInstanceModificationDTO> OAIProvideOrderItemIdentifiersRequest::getItems() const {
    return m_items;
}
void OAIProvideOrderItemIdentifiersRequest::setItems(const QList<OAIOrderItemInstanceModificationDTO> &items) {
    m_items = items;
    m_items_isSet = true;
}

bool OAIProvideOrderItemIdentifiersRequest::is_items_Set() const{
    return m_items_isSet;
}

bool OAIProvideOrderItemIdentifiersRequest::is_items_Valid() const{
    return m_items_isValid;
}

bool OAIProvideOrderItemIdentifiersRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_items.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIProvideOrderItemIdentifiersRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_items_isValid && true;
}

} // namespace OpenAPI
