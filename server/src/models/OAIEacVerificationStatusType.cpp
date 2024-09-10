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

#include "OAIEacVerificationStatusType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIEacVerificationStatusType::OAIEacVerificationStatusType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIEacVerificationStatusType::OAIEacVerificationStatusType() {
    this->initializeModel();
}

OAIEacVerificationStatusType::~OAIEacVerificationStatusType() {}

void OAIEacVerificationStatusType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIEacVerificationStatusType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIEacVerificationStatusType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("ACCEPTED", Qt::CaseInsensitive) == 0) {
        m_value = eOAIEacVerificationStatusType::ACCEPTED;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("REJECTED", Qt::CaseInsensitive) == 0) {
        m_value = eOAIEacVerificationStatusType::REJECTED;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("NEED_UPDATE", Qt::CaseInsensitive) == 0) {
        m_value = eOAIEacVerificationStatusType::NEED_UPDATE;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIEacVerificationStatusType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIEacVerificationStatusType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIEacVerificationStatusType::ACCEPTED:
            val = "ACCEPTED";
            break;
        case eOAIEacVerificationStatusType::REJECTED:
            val = "REJECTED";
            break;
        case eOAIEacVerificationStatusType::NEED_UPDATE:
            val = "NEED_UPDATE";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIEacVerificationStatusType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIEacVerificationStatusType::eOAIEacVerificationStatusType OAIEacVerificationStatusType::getValue() const {
    return m_value;
}

void OAIEacVerificationStatusType::setValue(const OAIEacVerificationStatusType::eOAIEacVerificationStatusType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIEacVerificationStatusType::isSet() const {
    
    return m_value_isSet;
}

bool OAIEacVerificationStatusType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
