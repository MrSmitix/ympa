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

#include "OAIGetPromoConstraintsDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetPromoConstraintsDTO::OAIGetPromoConstraintsDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetPromoConstraintsDTO::OAIGetPromoConstraintsDTO() {
    this->initializeModel();
}

OAIGetPromoConstraintsDTO::~OAIGetPromoConstraintsDTO() {}

void OAIGetPromoConstraintsDTO::initializeModel() {

    m_warehouse_ids_isSet = false;
    m_warehouse_ids_isValid = false;
}

void OAIGetPromoConstraintsDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetPromoConstraintsDTO::fromJsonObject(QJsonObject json) {

    m_warehouse_ids_isValid = ::OpenAPI::fromJsonValue(m_warehouse_ids, json[QString("warehouseIds")]);
    m_warehouse_ids_isSet = !json[QString("warehouseIds")].isNull() && m_warehouse_ids_isValid;
}

QString OAIGetPromoConstraintsDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetPromoConstraintsDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_warehouse_ids.size() > 0) {
        obj.insert(QString("warehouseIds"), ::OpenAPI::toJsonValue(m_warehouse_ids));
    }
    return obj;
}

QList<qint64> OAIGetPromoConstraintsDTO::getWarehouseIds() const {
    return m_warehouse_ids;
}
void OAIGetPromoConstraintsDTO::setWarehouseIds(const QList<qint64> &warehouse_ids) {
    m_warehouse_ids = warehouse_ids;
    m_warehouse_ids_isSet = true;
}

bool OAIGetPromoConstraintsDTO::is_warehouse_ids_Set() const{
    return m_warehouse_ids_isSet;
}

bool OAIGetPromoConstraintsDTO::is_warehouse_ids_Valid() const{
    return m_warehouse_ids_isValid;
}

bool OAIGetPromoConstraintsDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_warehouse_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetPromoConstraintsDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
