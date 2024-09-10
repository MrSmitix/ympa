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

#include "OAIGoodsFeedbackCommentAuthorType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGoodsFeedbackCommentAuthorType::OAIGoodsFeedbackCommentAuthorType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGoodsFeedbackCommentAuthorType::OAIGoodsFeedbackCommentAuthorType() {
    this->initializeModel();
}

OAIGoodsFeedbackCommentAuthorType::~OAIGoodsFeedbackCommentAuthorType() {}

void OAIGoodsFeedbackCommentAuthorType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIGoodsFeedbackCommentAuthorType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIGoodsFeedbackCommentAuthorType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("USER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIGoodsFeedbackCommentAuthorType::USER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("BUSINESS", Qt::CaseInsensitive) == 0) {
        m_value = eOAIGoodsFeedbackCommentAuthorType::BUSINESS;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIGoodsFeedbackCommentAuthorType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIGoodsFeedbackCommentAuthorType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIGoodsFeedbackCommentAuthorType::USER:
            val = "USER";
            break;
        case eOAIGoodsFeedbackCommentAuthorType::BUSINESS:
            val = "BUSINESS";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIGoodsFeedbackCommentAuthorType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIGoodsFeedbackCommentAuthorType::eOAIGoodsFeedbackCommentAuthorType OAIGoodsFeedbackCommentAuthorType::getValue() const {
    return m_value;
}

void OAIGoodsFeedbackCommentAuthorType::setValue(const OAIGoodsFeedbackCommentAuthorType::eOAIGoodsFeedbackCommentAuthorType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIGoodsFeedbackCommentAuthorType::isSet() const {
    
    return m_value_isSet;
}

bool OAIGoodsFeedbackCommentAuthorType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
