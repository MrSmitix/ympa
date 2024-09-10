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

#include "OAIParcelDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIParcelDTO::OAIParcelDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIParcelDTO::OAIParcelDTO() {
    this->initializeModel();
}

OAIParcelDTO::~OAIParcelDTO() {}

void OAIParcelDTO::initializeModel() {

    m_boxes_isSet = false;
    m_boxes_isValid = false;
}

void OAIParcelDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIParcelDTO::fromJsonObject(QJsonObject json) {

    m_boxes_isValid = ::OpenAPI::fromJsonValue(m_boxes, json[QString("boxes")]);
    m_boxes_isSet = !json[QString("boxes")].isNull() && m_boxes_isValid;
}

QString OAIParcelDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIParcelDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_boxes.size() > 0) {
        obj.insert(QString("boxes"), ::OpenAPI::toJsonValue(m_boxes));
    }
    return obj;
}

QList<OAIParcelBoxDTO> OAIParcelDTO::getBoxes() const {
    return m_boxes;
}
void OAIParcelDTO::setBoxes(const QList<OAIParcelBoxDTO> &boxes) {
    m_boxes = boxes;
    m_boxes_isSet = true;
}

bool OAIParcelDTO::is_boxes_Set() const{
    return m_boxes_isSet;
}

bool OAIParcelDTO::is_boxes_Valid() const{
    return m_boxes_isValid;
}

bool OAIParcelDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_boxes.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIParcelDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_boxes_isValid && true;
}

} // namespace OpenAPI
