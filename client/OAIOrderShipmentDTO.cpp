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

#include "OAIOrderShipmentDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderShipmentDTO::OAIOrderShipmentDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderShipmentDTO::OAIOrderShipmentDTO() {
    this->initializeModel();
}

OAIOrderShipmentDTO::~OAIOrderShipmentDTO() {}

void OAIOrderShipmentDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_shipment_date_isSet = false;
    m_shipment_date_isValid = false;

    m_shipment_time_isSet = false;
    m_shipment_time_isValid = false;

    m_tracks_isSet = false;
    m_tracks_isValid = false;

    m_boxes_isSet = false;
    m_boxes_isValid = false;
}

void OAIOrderShipmentDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderShipmentDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_shipment_date_isValid = ::OpenAPI::fromJsonValue(m_shipment_date, json[QString("shipmentDate")]);
    m_shipment_date_isSet = !json[QString("shipmentDate")].isNull() && m_shipment_date_isValid;

    m_shipment_time_isValid = ::OpenAPI::fromJsonValue(m_shipment_time, json[QString("shipmentTime")]);
    m_shipment_time_isSet = !json[QString("shipmentTime")].isNull() && m_shipment_time_isValid;

    m_tracks_isValid = ::OpenAPI::fromJsonValue(m_tracks, json[QString("tracks")]);
    m_tracks_isSet = !json[QString("tracks")].isNull() && m_tracks_isValid;

    m_boxes_isValid = ::OpenAPI::fromJsonValue(m_boxes, json[QString("boxes")]);
    m_boxes_isSet = !json[QString("boxes")].isNull() && m_boxes_isValid;
}

QString OAIOrderShipmentDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderShipmentDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_shipment_date_isSet) {
        obj.insert(QString("shipmentDate"), ::OpenAPI::toJsonValue(m_shipment_date));
    }
    if (m_shipment_time_isSet) {
        obj.insert(QString("shipmentTime"), ::OpenAPI::toJsonValue(m_shipment_time));
    }
    if (m_tracks.size() > 0) {
        obj.insert(QString("tracks"), ::OpenAPI::toJsonValue(m_tracks));
    }
    if (m_boxes.size() > 0) {
        obj.insert(QString("boxes"), ::OpenAPI::toJsonValue(m_boxes));
    }
    return obj;
}

qint64 OAIOrderShipmentDTO::getId() const {
    return m_id;
}
void OAIOrderShipmentDTO::setId(const qint64 &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIOrderShipmentDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIOrderShipmentDTO::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIOrderShipmentDTO::getShipmentDate() const {
    return m_shipment_date;
}
void OAIOrderShipmentDTO::setShipmentDate(const QString &shipment_date) {
    m_shipment_date = shipment_date;
    m_shipment_date_isSet = true;
}

bool OAIOrderShipmentDTO::is_shipment_date_Set() const{
    return m_shipment_date_isSet;
}

bool OAIOrderShipmentDTO::is_shipment_date_Valid() const{
    return m_shipment_date_isValid;
}

QString OAIOrderShipmentDTO::getShipmentTime() const {
    return m_shipment_time;
}
void OAIOrderShipmentDTO::setShipmentTime(const QString &shipment_time) {
    m_shipment_time = shipment_time;
    m_shipment_time_isSet = true;
}

bool OAIOrderShipmentDTO::is_shipment_time_Set() const{
    return m_shipment_time_isSet;
}

bool OAIOrderShipmentDTO::is_shipment_time_Valid() const{
    return m_shipment_time_isValid;
}

QList<OAIOrderTrackDTO> OAIOrderShipmentDTO::getTracks() const {
    return m_tracks;
}
void OAIOrderShipmentDTO::setTracks(const QList<OAIOrderTrackDTO> &tracks) {
    m_tracks = tracks;
    m_tracks_isSet = true;
}

bool OAIOrderShipmentDTO::is_tracks_Set() const{
    return m_tracks_isSet;
}

bool OAIOrderShipmentDTO::is_tracks_Valid() const{
    return m_tracks_isValid;
}

QList<OAIOrderParcelBoxDTO> OAIOrderShipmentDTO::getBoxes() const {
    return m_boxes;
}
void OAIOrderShipmentDTO::setBoxes(const QList<OAIOrderParcelBoxDTO> &boxes) {
    m_boxes = boxes;
    m_boxes_isSet = true;
}

bool OAIOrderShipmentDTO::is_boxes_Set() const{
    return m_boxes_isSet;
}

bool OAIOrderShipmentDTO::is_boxes_Valid() const{
    return m_boxes_isValid;
}

bool OAIOrderShipmentDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_shipment_date_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_shipment_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_tracks.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_boxes.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderShipmentDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
