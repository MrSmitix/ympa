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

#include "OAIShipmentBoxesDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIShipmentBoxesDTO::OAIShipmentBoxesDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIShipmentBoxesDTO::OAIShipmentBoxesDTO() {
    this->initializeModel();
}

OAIShipmentBoxesDTO::~OAIShipmentBoxesDTO() {}

void OAIShipmentBoxesDTO::initializeModel() {

    m_boxes_isSet = false;
    m_boxes_isValid = false;
}

void OAIShipmentBoxesDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIShipmentBoxesDTO::fromJsonObject(QJsonObject json) {

    m_boxes_isValid = ::OpenAPI::fromJsonValue(boxes, json[QString("boxes")]);
    m_boxes_isSet = !json[QString("boxes")].isNull() && m_boxes_isValid;
}

QString OAIShipmentBoxesDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIShipmentBoxesDTO::asJsonObject() const {
    QJsonObject obj;
    if (boxes.size() > 0) {
        obj.insert(QString("boxes"), ::OpenAPI::toJsonValue(boxes));
    }
    return obj;
}

QList<OAIParcelBoxDTO> OAIShipmentBoxesDTO::getBoxes() const {
    return boxes;
}
void OAIShipmentBoxesDTO::setBoxes(const QList<OAIParcelBoxDTO> &boxes) {
    this->boxes = boxes;
    this->m_boxes_isSet = true;
}

bool OAIShipmentBoxesDTO::is_boxes_Set() const{
    return m_boxes_isSet;
}

bool OAIShipmentBoxesDTO::is_boxes_Valid() const{
    return m_boxes_isValid;
}

bool OAIShipmentBoxesDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (boxes.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIShipmentBoxesDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_boxes_isValid && true;
}

} // namespace OpenAPI
