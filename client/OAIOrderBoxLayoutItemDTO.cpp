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

#include "OAIOrderBoxLayoutItemDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderBoxLayoutItemDTO::OAIOrderBoxLayoutItemDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderBoxLayoutItemDTO::OAIOrderBoxLayoutItemDTO() {
    this->initializeModel();
}

OAIOrderBoxLayoutItemDTO::~OAIOrderBoxLayoutItemDTO() {}

void OAIOrderBoxLayoutItemDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_full_count_isSet = false;
    m_full_count_isValid = false;

    m_partial_count_isSet = false;
    m_partial_count_isValid = false;

    m_instances_isSet = false;
    m_instances_isValid = false;
}

void OAIOrderBoxLayoutItemDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderBoxLayoutItemDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_full_count_isValid = ::OpenAPI::fromJsonValue(m_full_count, json[QString("fullCount")]);
    m_full_count_isSet = !json[QString("fullCount")].isNull() && m_full_count_isValid;

    m_partial_count_isValid = ::OpenAPI::fromJsonValue(m_partial_count, json[QString("partialCount")]);
    m_partial_count_isSet = !json[QString("partialCount")].isNull() && m_partial_count_isValid;

    m_instances_isValid = ::OpenAPI::fromJsonValue(m_instances, json[QString("instances")]);
    m_instances_isSet = !json[QString("instances")].isNull() && m_instances_isValid;
}

QString OAIOrderBoxLayoutItemDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderBoxLayoutItemDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_full_count_isSet) {
        obj.insert(QString("fullCount"), ::OpenAPI::toJsonValue(m_full_count));
    }
    if (m_partial_count.isSet()) {
        obj.insert(QString("partialCount"), ::OpenAPI::toJsonValue(m_partial_count));
    }
    if (m_instances.size() > 0) {
        obj.insert(QString("instances"), ::OpenAPI::toJsonValue(m_instances));
    }
    return obj;
}

qint64 OAIOrderBoxLayoutItemDTO::getId() const {
    return m_id;
}
void OAIOrderBoxLayoutItemDTO::setId(const qint64 &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIOrderBoxLayoutItemDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIOrderBoxLayoutItemDTO::is_id_Valid() const{
    return m_id_isValid;
}

qint32 OAIOrderBoxLayoutItemDTO::getFullCount() const {
    return m_full_count;
}
void OAIOrderBoxLayoutItemDTO::setFullCount(const qint32 &full_count) {
    m_full_count = full_count;
    m_full_count_isSet = true;
}

bool OAIOrderBoxLayoutItemDTO::is_full_count_Set() const{
    return m_full_count_isSet;
}

bool OAIOrderBoxLayoutItemDTO::is_full_count_Valid() const{
    return m_full_count_isValid;
}

OAIOrderBoxLayoutPartialCountDTO OAIOrderBoxLayoutItemDTO::getPartialCount() const {
    return m_partial_count;
}
void OAIOrderBoxLayoutItemDTO::setPartialCount(const OAIOrderBoxLayoutPartialCountDTO &partial_count) {
    m_partial_count = partial_count;
    m_partial_count_isSet = true;
}

bool OAIOrderBoxLayoutItemDTO::is_partial_count_Set() const{
    return m_partial_count_isSet;
}

bool OAIOrderBoxLayoutItemDTO::is_partial_count_Valid() const{
    return m_partial_count_isValid;
}

QList<OAIBriefOrderItemInstanceDTO> OAIOrderBoxLayoutItemDTO::getInstances() const {
    return m_instances;
}
void OAIOrderBoxLayoutItemDTO::setInstances(const QList<OAIBriefOrderItemInstanceDTO> &instances) {
    m_instances = instances;
    m_instances_isSet = true;
}

bool OAIOrderBoxLayoutItemDTO::is_instances_Set() const{
    return m_instances_isSet;
}

bool OAIOrderBoxLayoutItemDTO::is_instances_Valid() const{
    return m_instances_isValid;
}

bool OAIOrderBoxLayoutItemDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_full_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_partial_count.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_instances.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderBoxLayoutItemDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && true;
}

} // namespace OpenAPI
