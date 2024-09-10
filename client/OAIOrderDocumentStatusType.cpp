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

#include "OAIOrderDocumentStatusType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderDocumentStatusType::OAIOrderDocumentStatusType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderDocumentStatusType::OAIOrderDocumentStatusType() {
    this->initializeModel();
}

OAIOrderDocumentStatusType::~OAIOrderDocumentStatusType() {}

void OAIOrderDocumentStatusType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIOrderDocumentStatusType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIOrderDocumentStatusType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("READY", Qt::CaseInsensitive) == 0) {
        m_value = eOAIOrderDocumentStatusType::READY;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("NOT_READY", Qt::CaseInsensitive) == 0) {
        m_value = eOAIOrderDocumentStatusType::NOT_READY;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIOrderDocumentStatusType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIOrderDocumentStatusType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIOrderDocumentStatusType::READY:
            val = "READY";
            break;
        case eOAIOrderDocumentStatusType::NOT_READY:
            val = "NOT_READY";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIOrderDocumentStatusType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIOrderDocumentStatusType::eOAIOrderDocumentStatusType OAIOrderDocumentStatusType::getValue() const {
    return m_value;
}

void OAIOrderDocumentStatusType::setValue(const OAIOrderDocumentStatusType::eOAIOrderDocumentStatusType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIOrderDocumentStatusType::isSet() const {
    
    return m_value_isSet;
}

bool OAIOrderDocumentStatusType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
