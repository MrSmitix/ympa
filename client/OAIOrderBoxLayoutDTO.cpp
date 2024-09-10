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

#include "OAIOrderBoxLayoutDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderBoxLayoutDTO::OAIOrderBoxLayoutDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderBoxLayoutDTO::OAIOrderBoxLayoutDTO() {
    this->initializeModel();
}

OAIOrderBoxLayoutDTO::~OAIOrderBoxLayoutDTO() {}

void OAIOrderBoxLayoutDTO::initializeModel() {

    m_items_isSet = false;
    m_items_isValid = false;
}

void OAIOrderBoxLayoutDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderBoxLayoutDTO::fromJsonObject(QJsonObject json) {

    m_items_isValid = ::OpenAPI::fromJsonValue(m_items, json[QString("items")]);
    m_items_isSet = !json[QString("items")].isNull() && m_items_isValid;
}

QString OAIOrderBoxLayoutDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderBoxLayoutDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_items.size() > 0) {
        obj.insert(QString("items"), ::OpenAPI::toJsonValue(m_items));
    }
    return obj;
}

QList<OAIOrderBoxLayoutItemDTO> OAIOrderBoxLayoutDTO::getItems() const {
    return m_items;
}
void OAIOrderBoxLayoutDTO::setItems(const QList<OAIOrderBoxLayoutItemDTO> &items) {
    m_items = items;
    m_items_isSet = true;
}

bool OAIOrderBoxLayoutDTO::is_items_Set() const{
    return m_items_isSet;
}

bool OAIOrderBoxLayoutDTO::is_items_Valid() const{
    return m_items_isValid;
}

bool OAIOrderBoxLayoutDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_items.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderBoxLayoutDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_items_isValid && true;
}

} // namespace OpenAPI
