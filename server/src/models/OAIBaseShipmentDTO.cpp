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

#include "OAIBaseShipmentDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBaseShipmentDTO::OAIBaseShipmentDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBaseShipmentDTO::OAIBaseShipmentDTO() {
    this->initializeModel();
}

OAIBaseShipmentDTO::~OAIBaseShipmentDTO() {}

void OAIBaseShipmentDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_plan_interval_from_isSet = false;
    m_plan_interval_from_isValid = false;

    m_plan_interval_to_isSet = false;
    m_plan_interval_to_isValid = false;

    m_shipment_type_isSet = false;
    m_shipment_type_isValid = false;

    m_warehouse_isSet = false;
    m_warehouse_isValid = false;

    m_warehouse_to_isSet = false;
    m_warehouse_to_isValid = false;

    m_external_id_isSet = false;
    m_external_id_isValid = false;

    m_delivery_service_isSet = false;
    m_delivery_service_isValid = false;

    m_pallets_count_isSet = false;
    m_pallets_count_isValid = false;

    m_order_ids_isSet = false;
    m_order_ids_isValid = false;

    m_draft_count_isSet = false;
    m_draft_count_isValid = false;

    m_planned_count_isSet = false;
    m_planned_count_isValid = false;

    m_fact_count_isSet = false;
    m_fact_count_isValid = false;
}

void OAIBaseShipmentDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBaseShipmentDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_plan_interval_from_isValid = ::OpenAPI::fromJsonValue(plan_interval_from, json[QString("planIntervalFrom")]);
    m_plan_interval_from_isSet = !json[QString("planIntervalFrom")].isNull() && m_plan_interval_from_isValid;

    m_plan_interval_to_isValid = ::OpenAPI::fromJsonValue(plan_interval_to, json[QString("planIntervalTo")]);
    m_plan_interval_to_isSet = !json[QString("planIntervalTo")].isNull() && m_plan_interval_to_isValid;

    m_shipment_type_isValid = ::OpenAPI::fromJsonValue(shipment_type, json[QString("shipmentType")]);
    m_shipment_type_isSet = !json[QString("shipmentType")].isNull() && m_shipment_type_isValid;

    m_warehouse_isValid = ::OpenAPI::fromJsonValue(warehouse, json[QString("warehouse")]);
    m_warehouse_isSet = !json[QString("warehouse")].isNull() && m_warehouse_isValid;

    m_warehouse_to_isValid = ::OpenAPI::fromJsonValue(warehouse_to, json[QString("warehouseTo")]);
    m_warehouse_to_isSet = !json[QString("warehouseTo")].isNull() && m_warehouse_to_isValid;

    m_external_id_isValid = ::OpenAPI::fromJsonValue(external_id, json[QString("externalId")]);
    m_external_id_isSet = !json[QString("externalId")].isNull() && m_external_id_isValid;

    m_delivery_service_isValid = ::OpenAPI::fromJsonValue(delivery_service, json[QString("deliveryService")]);
    m_delivery_service_isSet = !json[QString("deliveryService")].isNull() && m_delivery_service_isValid;

    m_pallets_count_isValid = ::OpenAPI::fromJsonValue(pallets_count, json[QString("palletsCount")]);
    m_pallets_count_isSet = !json[QString("palletsCount")].isNull() && m_pallets_count_isValid;

    m_order_ids_isValid = ::OpenAPI::fromJsonValue(order_ids, json[QString("orderIds")]);
    m_order_ids_isSet = !json[QString("orderIds")].isNull() && m_order_ids_isValid;

    m_draft_count_isValid = ::OpenAPI::fromJsonValue(draft_count, json[QString("draftCount")]);
    m_draft_count_isSet = !json[QString("draftCount")].isNull() && m_draft_count_isValid;

    m_planned_count_isValid = ::OpenAPI::fromJsonValue(planned_count, json[QString("plannedCount")]);
    m_planned_count_isSet = !json[QString("plannedCount")].isNull() && m_planned_count_isValid;

    m_fact_count_isValid = ::OpenAPI::fromJsonValue(fact_count, json[QString("factCount")]);
    m_fact_count_isSet = !json[QString("factCount")].isNull() && m_fact_count_isValid;
}

QString OAIBaseShipmentDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBaseShipmentDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_plan_interval_from_isSet) {
        obj.insert(QString("planIntervalFrom"), ::OpenAPI::toJsonValue(plan_interval_from));
    }
    if (m_plan_interval_to_isSet) {
        obj.insert(QString("planIntervalTo"), ::OpenAPI::toJsonValue(plan_interval_to));
    }
    if (shipment_type.isSet()) {
        obj.insert(QString("shipmentType"), ::OpenAPI::toJsonValue(shipment_type));
    }
    if (warehouse.isSet()) {
        obj.insert(QString("warehouse"), ::OpenAPI::toJsonValue(warehouse));
    }
    if (warehouse_to.isSet()) {
        obj.insert(QString("warehouseTo"), ::OpenAPI::toJsonValue(warehouse_to));
    }
    if (m_external_id_isSet) {
        obj.insert(QString("externalId"), ::OpenAPI::toJsonValue(external_id));
    }
    if (delivery_service.isSet()) {
        obj.insert(QString("deliveryService"), ::OpenAPI::toJsonValue(delivery_service));
    }
    if (pallets_count.isSet()) {
        obj.insert(QString("palletsCount"), ::OpenAPI::toJsonValue(pallets_count));
    }
    if (order_ids.size() > 0) {
        obj.insert(QString("orderIds"), ::OpenAPI::toJsonValue(order_ids));
    }
    if (m_draft_count_isSet) {
        obj.insert(QString("draftCount"), ::OpenAPI::toJsonValue(draft_count));
    }
    if (m_planned_count_isSet) {
        obj.insert(QString("plannedCount"), ::OpenAPI::toJsonValue(planned_count));
    }
    if (m_fact_count_isSet) {
        obj.insert(QString("factCount"), ::OpenAPI::toJsonValue(fact_count));
    }
    return obj;
}

qint64 OAIBaseShipmentDTO::getId() const {
    return id;
}
void OAIBaseShipmentDTO::setId(const qint64 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIBaseShipmentDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIBaseShipmentDTO::is_id_Valid() const{
    return m_id_isValid;
}

QDateTime OAIBaseShipmentDTO::getPlanIntervalFrom() const {
    return plan_interval_from;
}
void OAIBaseShipmentDTO::setPlanIntervalFrom(const QDateTime &plan_interval_from) {
    this->plan_interval_from = plan_interval_from;
    this->m_plan_interval_from_isSet = true;
}

bool OAIBaseShipmentDTO::is_plan_interval_from_Set() const{
    return m_plan_interval_from_isSet;
}

bool OAIBaseShipmentDTO::is_plan_interval_from_Valid() const{
    return m_plan_interval_from_isValid;
}

QDateTime OAIBaseShipmentDTO::getPlanIntervalTo() const {
    return plan_interval_to;
}
void OAIBaseShipmentDTO::setPlanIntervalTo(const QDateTime &plan_interval_to) {
    this->plan_interval_to = plan_interval_to;
    this->m_plan_interval_to_isSet = true;
}

bool OAIBaseShipmentDTO::is_plan_interval_to_Set() const{
    return m_plan_interval_to_isSet;
}

bool OAIBaseShipmentDTO::is_plan_interval_to_Valid() const{
    return m_plan_interval_to_isValid;
}

OAIShipmentType OAIBaseShipmentDTO::getShipmentType() const {
    return shipment_type;
}
void OAIBaseShipmentDTO::setShipmentType(const OAIShipmentType &shipment_type) {
    this->shipment_type = shipment_type;
    this->m_shipment_type_isSet = true;
}

bool OAIBaseShipmentDTO::is_shipment_type_Set() const{
    return m_shipment_type_isSet;
}

bool OAIBaseShipmentDTO::is_shipment_type_Valid() const{
    return m_shipment_type_isValid;
}

OAIPartnerShipmentWarehouseDTO OAIBaseShipmentDTO::getWarehouse() const {
    return warehouse;
}
void OAIBaseShipmentDTO::setWarehouse(const OAIPartnerShipmentWarehouseDTO &warehouse) {
    this->warehouse = warehouse;
    this->m_warehouse_isSet = true;
}

bool OAIBaseShipmentDTO::is_warehouse_Set() const{
    return m_warehouse_isSet;
}

bool OAIBaseShipmentDTO::is_warehouse_Valid() const{
    return m_warehouse_isValid;
}

OAIPartnerShipmentWarehouseDTO OAIBaseShipmentDTO::getWarehouseTo() const {
    return warehouse_to;
}
void OAIBaseShipmentDTO::setWarehouseTo(const OAIPartnerShipmentWarehouseDTO &warehouse_to) {
    this->warehouse_to = warehouse_to;
    this->m_warehouse_to_isSet = true;
}

bool OAIBaseShipmentDTO::is_warehouse_to_Set() const{
    return m_warehouse_to_isSet;
}

bool OAIBaseShipmentDTO::is_warehouse_to_Valid() const{
    return m_warehouse_to_isValid;
}

QString OAIBaseShipmentDTO::getExternalId() const {
    return external_id;
}
void OAIBaseShipmentDTO::setExternalId(const QString &external_id) {
    this->external_id = external_id;
    this->m_external_id_isSet = true;
}

bool OAIBaseShipmentDTO::is_external_id_Set() const{
    return m_external_id_isSet;
}

bool OAIBaseShipmentDTO::is_external_id_Valid() const{
    return m_external_id_isValid;
}

OAIDeliveryServiceDTO OAIBaseShipmentDTO::getDeliveryService() const {
    return delivery_service;
}
void OAIBaseShipmentDTO::setDeliveryService(const OAIDeliveryServiceDTO &delivery_service) {
    this->delivery_service = delivery_service;
    this->m_delivery_service_isSet = true;
}

bool OAIBaseShipmentDTO::is_delivery_service_Set() const{
    return m_delivery_service_isSet;
}

bool OAIBaseShipmentDTO::is_delivery_service_Valid() const{
    return m_delivery_service_isValid;
}

OAIPalletsCountDTO OAIBaseShipmentDTO::getPalletsCount() const {
    return pallets_count;
}
void OAIBaseShipmentDTO::setPalletsCount(const OAIPalletsCountDTO &pallets_count) {
    this->pallets_count = pallets_count;
    this->m_pallets_count_isSet = true;
}

bool OAIBaseShipmentDTO::is_pallets_count_Set() const{
    return m_pallets_count_isSet;
}

bool OAIBaseShipmentDTO::is_pallets_count_Valid() const{
    return m_pallets_count_isValid;
}

QSet<qint64> OAIBaseShipmentDTO::getOrderIds() const {
    return order_ids;
}
void OAIBaseShipmentDTO::setOrderIds(const QSet<qint64> &order_ids) {
    this->order_ids = order_ids;
    this->m_order_ids_isSet = true;
}

bool OAIBaseShipmentDTO::is_order_ids_Set() const{
    return m_order_ids_isSet;
}

bool OAIBaseShipmentDTO::is_order_ids_Valid() const{
    return m_order_ids_isValid;
}

qint32 OAIBaseShipmentDTO::getDraftCount() const {
    return draft_count;
}
void OAIBaseShipmentDTO::setDraftCount(const qint32 &draft_count) {
    this->draft_count = draft_count;
    this->m_draft_count_isSet = true;
}

bool OAIBaseShipmentDTO::is_draft_count_Set() const{
    return m_draft_count_isSet;
}

bool OAIBaseShipmentDTO::is_draft_count_Valid() const{
    return m_draft_count_isValid;
}

qint32 OAIBaseShipmentDTO::getPlannedCount() const {
    return planned_count;
}
void OAIBaseShipmentDTO::setPlannedCount(const qint32 &planned_count) {
    this->planned_count = planned_count;
    this->m_planned_count_isSet = true;
}

bool OAIBaseShipmentDTO::is_planned_count_Set() const{
    return m_planned_count_isSet;
}

bool OAIBaseShipmentDTO::is_planned_count_Valid() const{
    return m_planned_count_isValid;
}

qint32 OAIBaseShipmentDTO::getFactCount() const {
    return fact_count;
}
void OAIBaseShipmentDTO::setFactCount(const qint32 &fact_count) {
    this->fact_count = fact_count;
    this->m_fact_count_isSet = true;
}

bool OAIBaseShipmentDTO::is_fact_count_Set() const{
    return m_fact_count_isSet;
}

bool OAIBaseShipmentDTO::is_fact_count_Valid() const{
    return m_fact_count_isValid;
}

bool OAIBaseShipmentDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_plan_interval_from_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_plan_interval_to_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (shipment_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (warehouse.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (warehouse_to.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_external_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (delivery_service.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (pallets_count.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (order_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_draft_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_planned_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_fact_count_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBaseShipmentDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_order_ids_isValid && true;
}

} // namespace OpenAPI
