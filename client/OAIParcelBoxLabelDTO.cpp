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

#include "OAIParcelBoxLabelDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIParcelBoxLabelDTO::OAIParcelBoxLabelDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIParcelBoxLabelDTO::OAIParcelBoxLabelDTO() {
    this->initializeModel();
}

OAIParcelBoxLabelDTO::~OAIParcelBoxLabelDTO() {}

void OAIParcelBoxLabelDTO::initializeModel() {

    m_url_isSet = false;
    m_url_isValid = false;

    m_supplier_name_isSet = false;
    m_supplier_name_isValid = false;

    m_delivery_service_name_isSet = false;
    m_delivery_service_name_isValid = false;

    m_order_id_isSet = false;
    m_order_id_isValid = false;

    m_order_num_isSet = false;
    m_order_num_isValid = false;

    m_recipient_name_isSet = false;
    m_recipient_name_isValid = false;

    m_box_id_isSet = false;
    m_box_id_isValid = false;

    m_fulfilment_id_isSet = false;
    m_fulfilment_id_isValid = false;

    m_place_isSet = false;
    m_place_isValid = false;

    m_weight_isSet = false;
    m_weight_isValid = false;

    m_delivery_service_id_isSet = false;
    m_delivery_service_id_isValid = false;

    m_delivery_address_isSet = false;
    m_delivery_address_isValid = false;

    m_shipment_date_isSet = false;
    m_shipment_date_isValid = false;
}

void OAIParcelBoxLabelDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIParcelBoxLabelDTO::fromJsonObject(QJsonObject json) {

    m_url_isValid = ::OpenAPI::fromJsonValue(m_url, json[QString("url")]);
    m_url_isSet = !json[QString("url")].isNull() && m_url_isValid;

    m_supplier_name_isValid = ::OpenAPI::fromJsonValue(m_supplier_name, json[QString("supplierName")]);
    m_supplier_name_isSet = !json[QString("supplierName")].isNull() && m_supplier_name_isValid;

    m_delivery_service_name_isValid = ::OpenAPI::fromJsonValue(m_delivery_service_name, json[QString("deliveryServiceName")]);
    m_delivery_service_name_isSet = !json[QString("deliveryServiceName")].isNull() && m_delivery_service_name_isValid;

    m_order_id_isValid = ::OpenAPI::fromJsonValue(m_order_id, json[QString("orderId")]);
    m_order_id_isSet = !json[QString("orderId")].isNull() && m_order_id_isValid;

    m_order_num_isValid = ::OpenAPI::fromJsonValue(m_order_num, json[QString("orderNum")]);
    m_order_num_isSet = !json[QString("orderNum")].isNull() && m_order_num_isValid;

    m_recipient_name_isValid = ::OpenAPI::fromJsonValue(m_recipient_name, json[QString("recipientName")]);
    m_recipient_name_isSet = !json[QString("recipientName")].isNull() && m_recipient_name_isValid;

    m_box_id_isValid = ::OpenAPI::fromJsonValue(m_box_id, json[QString("boxId")]);
    m_box_id_isSet = !json[QString("boxId")].isNull() && m_box_id_isValid;

    m_fulfilment_id_isValid = ::OpenAPI::fromJsonValue(m_fulfilment_id, json[QString("fulfilmentId")]);
    m_fulfilment_id_isSet = !json[QString("fulfilmentId")].isNull() && m_fulfilment_id_isValid;

    m_place_isValid = ::OpenAPI::fromJsonValue(m_place, json[QString("place")]);
    m_place_isSet = !json[QString("place")].isNull() && m_place_isValid;

    m_weight_isValid = ::OpenAPI::fromJsonValue(m_weight, json[QString("weight")]);
    m_weight_isSet = !json[QString("weight")].isNull() && m_weight_isValid;

    m_delivery_service_id_isValid = ::OpenAPI::fromJsonValue(m_delivery_service_id, json[QString("deliveryServiceId")]);
    m_delivery_service_id_isSet = !json[QString("deliveryServiceId")].isNull() && m_delivery_service_id_isValid;

    m_delivery_address_isValid = ::OpenAPI::fromJsonValue(m_delivery_address, json[QString("deliveryAddress")]);
    m_delivery_address_isSet = !json[QString("deliveryAddress")].isNull() && m_delivery_address_isValid;

    m_shipment_date_isValid = ::OpenAPI::fromJsonValue(m_shipment_date, json[QString("shipmentDate")]);
    m_shipment_date_isSet = !json[QString("shipmentDate")].isNull() && m_shipment_date_isValid;
}

QString OAIParcelBoxLabelDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIParcelBoxLabelDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_url_isSet) {
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(m_url));
    }
    if (m_supplier_name_isSet) {
        obj.insert(QString("supplierName"), ::OpenAPI::toJsonValue(m_supplier_name));
    }
    if (m_delivery_service_name_isSet) {
        obj.insert(QString("deliveryServiceName"), ::OpenAPI::toJsonValue(m_delivery_service_name));
    }
    if (m_order_id_isSet) {
        obj.insert(QString("orderId"), ::OpenAPI::toJsonValue(m_order_id));
    }
    if (m_order_num_isSet) {
        obj.insert(QString("orderNum"), ::OpenAPI::toJsonValue(m_order_num));
    }
    if (m_recipient_name_isSet) {
        obj.insert(QString("recipientName"), ::OpenAPI::toJsonValue(m_recipient_name));
    }
    if (m_box_id_isSet) {
        obj.insert(QString("boxId"), ::OpenAPI::toJsonValue(m_box_id));
    }
    if (m_fulfilment_id_isSet) {
        obj.insert(QString("fulfilmentId"), ::OpenAPI::toJsonValue(m_fulfilment_id));
    }
    if (m_place_isSet) {
        obj.insert(QString("place"), ::OpenAPI::toJsonValue(m_place));
    }
    if (m_weight_isSet) {
        obj.insert(QString("weight"), ::OpenAPI::toJsonValue(m_weight));
    }
    if (m_delivery_service_id_isSet) {
        obj.insert(QString("deliveryServiceId"), ::OpenAPI::toJsonValue(m_delivery_service_id));
    }
    if (m_delivery_address_isSet) {
        obj.insert(QString("deliveryAddress"), ::OpenAPI::toJsonValue(m_delivery_address));
    }
    if (m_shipment_date_isSet) {
        obj.insert(QString("shipmentDate"), ::OpenAPI::toJsonValue(m_shipment_date));
    }
    return obj;
}

QString OAIParcelBoxLabelDTO::getUrl() const {
    return m_url;
}
void OAIParcelBoxLabelDTO::setUrl(const QString &url) {
    m_url = url;
    m_url_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_url_Set() const{
    return m_url_isSet;
}

bool OAIParcelBoxLabelDTO::is_url_Valid() const{
    return m_url_isValid;
}

QString OAIParcelBoxLabelDTO::getSupplierName() const {
    return m_supplier_name;
}
void OAIParcelBoxLabelDTO::setSupplierName(const QString &supplier_name) {
    m_supplier_name = supplier_name;
    m_supplier_name_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_supplier_name_Set() const{
    return m_supplier_name_isSet;
}

bool OAIParcelBoxLabelDTO::is_supplier_name_Valid() const{
    return m_supplier_name_isValid;
}

QString OAIParcelBoxLabelDTO::getDeliveryServiceName() const {
    return m_delivery_service_name;
}
void OAIParcelBoxLabelDTO::setDeliveryServiceName(const QString &delivery_service_name) {
    m_delivery_service_name = delivery_service_name;
    m_delivery_service_name_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_delivery_service_name_Set() const{
    return m_delivery_service_name_isSet;
}

bool OAIParcelBoxLabelDTO::is_delivery_service_name_Valid() const{
    return m_delivery_service_name_isValid;
}

qint64 OAIParcelBoxLabelDTO::getOrderId() const {
    return m_order_id;
}
void OAIParcelBoxLabelDTO::setOrderId(const qint64 &order_id) {
    m_order_id = order_id;
    m_order_id_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_order_id_Set() const{
    return m_order_id_isSet;
}

bool OAIParcelBoxLabelDTO::is_order_id_Valid() const{
    return m_order_id_isValid;
}

QString OAIParcelBoxLabelDTO::getOrderNum() const {
    return m_order_num;
}
void OAIParcelBoxLabelDTO::setOrderNum(const QString &order_num) {
    m_order_num = order_num;
    m_order_num_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_order_num_Set() const{
    return m_order_num_isSet;
}

bool OAIParcelBoxLabelDTO::is_order_num_Valid() const{
    return m_order_num_isValid;
}

QString OAIParcelBoxLabelDTO::getRecipientName() const {
    return m_recipient_name;
}
void OAIParcelBoxLabelDTO::setRecipientName(const QString &recipient_name) {
    m_recipient_name = recipient_name;
    m_recipient_name_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_recipient_name_Set() const{
    return m_recipient_name_isSet;
}

bool OAIParcelBoxLabelDTO::is_recipient_name_Valid() const{
    return m_recipient_name_isValid;
}

qint64 OAIParcelBoxLabelDTO::getBoxId() const {
    return m_box_id;
}
void OAIParcelBoxLabelDTO::setBoxId(const qint64 &box_id) {
    m_box_id = box_id;
    m_box_id_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_box_id_Set() const{
    return m_box_id_isSet;
}

bool OAIParcelBoxLabelDTO::is_box_id_Valid() const{
    return m_box_id_isValid;
}

QString OAIParcelBoxLabelDTO::getFulfilmentId() const {
    return m_fulfilment_id;
}
void OAIParcelBoxLabelDTO::setFulfilmentId(const QString &fulfilment_id) {
    m_fulfilment_id = fulfilment_id;
    m_fulfilment_id_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_fulfilment_id_Set() const{
    return m_fulfilment_id_isSet;
}

bool OAIParcelBoxLabelDTO::is_fulfilment_id_Valid() const{
    return m_fulfilment_id_isValid;
}

QString OAIParcelBoxLabelDTO::getPlace() const {
    return m_place;
}
void OAIParcelBoxLabelDTO::setPlace(const QString &place) {
    m_place = place;
    m_place_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_place_Set() const{
    return m_place_isSet;
}

bool OAIParcelBoxLabelDTO::is_place_Valid() const{
    return m_place_isValid;
}

QString OAIParcelBoxLabelDTO::getWeight() const {
    return m_weight;
}
void OAIParcelBoxLabelDTO::setWeight(const QString &weight) {
    m_weight = weight;
    m_weight_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_weight_Set() const{
    return m_weight_isSet;
}

bool OAIParcelBoxLabelDTO::is_weight_Valid() const{
    return m_weight_isValid;
}

QString OAIParcelBoxLabelDTO::getDeliveryServiceId() const {
    return m_delivery_service_id;
}
void OAIParcelBoxLabelDTO::setDeliveryServiceId(const QString &delivery_service_id) {
    m_delivery_service_id = delivery_service_id;
    m_delivery_service_id_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_delivery_service_id_Set() const{
    return m_delivery_service_id_isSet;
}

bool OAIParcelBoxLabelDTO::is_delivery_service_id_Valid() const{
    return m_delivery_service_id_isValid;
}

QString OAIParcelBoxLabelDTO::getDeliveryAddress() const {
    return m_delivery_address;
}
void OAIParcelBoxLabelDTO::setDeliveryAddress(const QString &delivery_address) {
    m_delivery_address = delivery_address;
    m_delivery_address_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_delivery_address_Set() const{
    return m_delivery_address_isSet;
}

bool OAIParcelBoxLabelDTO::is_delivery_address_Valid() const{
    return m_delivery_address_isValid;
}

QString OAIParcelBoxLabelDTO::getShipmentDate() const {
    return m_shipment_date;
}
void OAIParcelBoxLabelDTO::setShipmentDate(const QString &shipment_date) {
    m_shipment_date = shipment_date;
    m_shipment_date_isSet = true;
}

bool OAIParcelBoxLabelDTO::is_shipment_date_Set() const{
    return m_shipment_date_isSet;
}

bool OAIParcelBoxLabelDTO::is_shipment_date_Valid() const{
    return m_shipment_date_isValid;
}

bool OAIParcelBoxLabelDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_supplier_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_delivery_service_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_order_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_order_num_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_recipient_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_box_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_fulfilment_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_place_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_weight_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_delivery_service_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_delivery_address_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_shipment_date_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIParcelBoxLabelDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_url_isValid && m_supplier_name_isValid && m_delivery_service_name_isValid && m_order_id_isValid && m_order_num_isValid && m_recipient_name_isValid && m_box_id_isValid && m_fulfilment_id_isValid && m_place_isValid && m_weight_isValid && m_delivery_service_id_isValid && true;
}

} // namespace OpenAPI
