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

#include "OAITurnoverDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAITurnoverDTO::OAITurnoverDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAITurnoverDTO::OAITurnoverDTO() {
    this->initializeModel();
}

OAITurnoverDTO::~OAITurnoverDTO() {}

void OAITurnoverDTO::initializeModel() {

    m_turnover_isSet = false;
    m_turnover_isValid = false;

    m_turnover_days_isSet = false;
    m_turnover_days_isValid = false;
}

void OAITurnoverDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAITurnoverDTO::fromJsonObject(QJsonObject json) {

    m_turnover_isValid = ::OpenAPI::fromJsonValue(turnover, json[QString("turnover")]);
    m_turnover_isSet = !json[QString("turnover")].isNull() && m_turnover_isValid;

    m_turnover_days_isValid = ::OpenAPI::fromJsonValue(turnover_days, json[QString("turnoverDays")]);
    m_turnover_days_isSet = !json[QString("turnoverDays")].isNull() && m_turnover_days_isValid;
}

QString OAITurnoverDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAITurnoverDTO::asJsonObject() const {
    QJsonObject obj;
    if (turnover.isSet()) {
        obj.insert(QString("turnover"), ::OpenAPI::toJsonValue(turnover));
    }
    if (m_turnover_days_isSet) {
        obj.insert(QString("turnoverDays"), ::OpenAPI::toJsonValue(turnover_days));
    }
    return obj;
}

OAITurnoverType OAITurnoverDTO::getTurnover() const {
    return turnover;
}
void OAITurnoverDTO::setTurnover(const OAITurnoverType &turnover) {
    this->turnover = turnover;
    this->m_turnover_isSet = true;
}

bool OAITurnoverDTO::is_turnover_Set() const{
    return m_turnover_isSet;
}

bool OAITurnoverDTO::is_turnover_Valid() const{
    return m_turnover_isValid;
}

double OAITurnoverDTO::getTurnoverDays() const {
    return turnover_days;
}
void OAITurnoverDTO::setTurnoverDays(const double &turnover_days) {
    this->turnover_days = turnover_days;
    this->m_turnover_days_isSet = true;
}

bool OAITurnoverDTO::is_turnover_days_Set() const{
    return m_turnover_days_isSet;
}

bool OAITurnoverDTO::is_turnover_days_Valid() const{
    return m_turnover_days_isValid;
}

bool OAITurnoverDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (turnover.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_turnover_days_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAITurnoverDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_turnover_isValid && true;
}

} // namespace OpenAPI
