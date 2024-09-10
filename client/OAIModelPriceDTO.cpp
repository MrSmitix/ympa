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

#include "OAIModelPriceDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIModelPriceDTO::OAIModelPriceDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIModelPriceDTO::OAIModelPriceDTO() {
    this->initializeModel();
}

OAIModelPriceDTO::~OAIModelPriceDTO() {}

void OAIModelPriceDTO::initializeModel() {

    m_avg_isSet = false;
    m_avg_isValid = false;

    m_max_isSet = false;
    m_max_isValid = false;

    m_min_isSet = false;
    m_min_isValid = false;
}

void OAIModelPriceDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIModelPriceDTO::fromJsonObject(QJsonObject json) {

    m_avg_isValid = ::OpenAPI::fromJsonValue(m_avg, json[QString("avg")]);
    m_avg_isSet = !json[QString("avg")].isNull() && m_avg_isValid;

    m_max_isValid = ::OpenAPI::fromJsonValue(m_max, json[QString("max")]);
    m_max_isSet = !json[QString("max")].isNull() && m_max_isValid;

    m_min_isValid = ::OpenAPI::fromJsonValue(m_min, json[QString("min")]);
    m_min_isSet = !json[QString("min")].isNull() && m_min_isValid;
}

QString OAIModelPriceDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIModelPriceDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_avg_isSet) {
        obj.insert(QString("avg"), ::OpenAPI::toJsonValue(m_avg));
    }
    if (m_max_isSet) {
        obj.insert(QString("max"), ::OpenAPI::toJsonValue(m_max));
    }
    if (m_min_isSet) {
        obj.insert(QString("min"), ::OpenAPI::toJsonValue(m_min));
    }
    return obj;
}

double OAIModelPriceDTO::getAvg() const {
    return m_avg;
}
void OAIModelPriceDTO::setAvg(const double &avg) {
    m_avg = avg;
    m_avg_isSet = true;
}

bool OAIModelPriceDTO::is_avg_Set() const{
    return m_avg_isSet;
}

bool OAIModelPriceDTO::is_avg_Valid() const{
    return m_avg_isValid;
}

double OAIModelPriceDTO::getMax() const {
    return m_max;
}
void OAIModelPriceDTO::setMax(const double &max) {
    m_max = max;
    m_max_isSet = true;
}

bool OAIModelPriceDTO::is_max_Set() const{
    return m_max_isSet;
}

bool OAIModelPriceDTO::is_max_Valid() const{
    return m_max_isValid;
}

double OAIModelPriceDTO::getMin() const {
    return m_min;
}
void OAIModelPriceDTO::setMin(const double &min) {
    m_min = min;
    m_min_isSet = true;
}

bool OAIModelPriceDTO::is_min_Set() const{
    return m_min_isSet;
}

bool OAIModelPriceDTO::is_min_Valid() const{
    return m_min_isValid;
}

bool OAIModelPriceDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_avg_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_max_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_min_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIModelPriceDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
