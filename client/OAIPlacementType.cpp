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

#include "OAIPlacementType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPlacementType::OAIPlacementType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPlacementType::OAIPlacementType() {
    this->initializeModel();
}

OAIPlacementType::~OAIPlacementType() {}

void OAIPlacementType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIPlacementType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIPlacementType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("FBS", Qt::CaseInsensitive) == 0) {
        m_value = eOAIPlacementType::FBS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("FBY", Qt::CaseInsensitive) == 0) {
        m_value = eOAIPlacementType::FBY;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DBS", Qt::CaseInsensitive) == 0) {
        m_value = eOAIPlacementType::DBS;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIPlacementType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIPlacementType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIPlacementType::FBS:
            val = "FBS";
            break;
        case eOAIPlacementType::FBY:
            val = "FBY";
            break;
        case eOAIPlacementType::DBS:
            val = "DBS";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIPlacementType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIPlacementType::eOAIPlacementType OAIPlacementType::getValue() const {
    return m_value;
}

void OAIPlacementType::setValue(const OAIPlacementType::eOAIPlacementType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIPlacementType::isSet() const {
    
    return m_value_isSet;
}

bool OAIPlacementType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
