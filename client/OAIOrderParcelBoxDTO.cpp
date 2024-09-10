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

#include "OAIOrderParcelBoxDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderParcelBoxDTO::OAIOrderParcelBoxDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderParcelBoxDTO::OAIOrderParcelBoxDTO() {
    this->initializeModel();
}

OAIOrderParcelBoxDTO::~OAIOrderParcelBoxDTO() {}

void OAIOrderParcelBoxDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_fulfilment_id_isSet = false;
    m_fulfilment_id_isValid = false;
}

void OAIOrderParcelBoxDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderParcelBoxDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_fulfilment_id_isValid = ::OpenAPI::fromJsonValue(m_fulfilment_id, json[QString("fulfilmentId")]);
    m_fulfilment_id_isSet = !json[QString("fulfilmentId")].isNull() && m_fulfilment_id_isValid;
}

QString OAIOrderParcelBoxDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderParcelBoxDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_fulfilment_id_isSet) {
        obj.insert(QString("fulfilmentId"), ::OpenAPI::toJsonValue(m_fulfilment_id));
    }
    return obj;
}

qint64 OAIOrderParcelBoxDTO::getId() const {
    return m_id;
}
void OAIOrderParcelBoxDTO::setId(const qint64 &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIOrderParcelBoxDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIOrderParcelBoxDTO::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIOrderParcelBoxDTO::getFulfilmentId() const {
    return m_fulfilment_id;
}
void OAIOrderParcelBoxDTO::setFulfilmentId(const QString &fulfilment_id) {
    m_fulfilment_id = fulfilment_id;
    m_fulfilment_id_isSet = true;
}

bool OAIOrderParcelBoxDTO::is_fulfilment_id_Set() const{
    return m_fulfilment_id_isSet;
}

bool OAIOrderParcelBoxDTO::is_fulfilment_id_Valid() const{
    return m_fulfilment_id_isValid;
}

bool OAIOrderParcelBoxDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_fulfilment_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderParcelBoxDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
