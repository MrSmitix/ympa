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

#include "OAIFeedIndexLogsErrorType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIFeedIndexLogsErrorType::OAIFeedIndexLogsErrorType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIFeedIndexLogsErrorType::OAIFeedIndexLogsErrorType() {
    this->initializeModel();
}

OAIFeedIndexLogsErrorType::~OAIFeedIndexLogsErrorType() {}

void OAIFeedIndexLogsErrorType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIFeedIndexLogsErrorType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIFeedIndexLogsErrorType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("DOWNLOAD_ERROR", Qt::CaseInsensitive) == 0) {
        m_value = eOAIFeedIndexLogsErrorType::DOWNLOAD_ERROR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DOWNLOAD_HTTP_ERROR", Qt::CaseInsensitive) == 0) {
        m_value = eOAIFeedIndexLogsErrorType::DOWNLOAD_HTTP_ERROR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PARSE_ERROR", Qt::CaseInsensitive) == 0) {
        m_value = eOAIFeedIndexLogsErrorType::PARSE_ERROR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PARSE_XML_ERROR", Qt::CaseInsensitive) == 0) {
        m_value = eOAIFeedIndexLogsErrorType::PARSE_XML_ERROR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TOO_MANY_REJECTED_OFFERS", Qt::CaseInsensitive) == 0) {
        m_value = eOAIFeedIndexLogsErrorType::TOO_MANY_REJECTED_OFFERS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("NOT_INDEXED", Qt::CaseInsensitive) == 0) {
        m_value = eOAIFeedIndexLogsErrorType::NOT_INDEXED;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIFeedIndexLogsErrorType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIFeedIndexLogsErrorType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIFeedIndexLogsErrorType::DOWNLOAD_ERROR:
            val = "DOWNLOAD_ERROR";
            break;
        case eOAIFeedIndexLogsErrorType::DOWNLOAD_HTTP_ERROR:
            val = "DOWNLOAD_HTTP_ERROR";
            break;
        case eOAIFeedIndexLogsErrorType::PARSE_ERROR:
            val = "PARSE_ERROR";
            break;
        case eOAIFeedIndexLogsErrorType::PARSE_XML_ERROR:
            val = "PARSE_XML_ERROR";
            break;
        case eOAIFeedIndexLogsErrorType::TOO_MANY_REJECTED_OFFERS:
            val = "TOO_MANY_REJECTED_OFFERS";
            break;
        case eOAIFeedIndexLogsErrorType::NOT_INDEXED:
            val = "NOT_INDEXED";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIFeedIndexLogsErrorType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIFeedIndexLogsErrorType::eOAIFeedIndexLogsErrorType OAIFeedIndexLogsErrorType::getValue() const {
    return m_value;
}

void OAIFeedIndexLogsErrorType::setValue(const OAIFeedIndexLogsErrorType::eOAIFeedIndexLogsErrorType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIFeedIndexLogsErrorType::isSet() const {
    
    return m_value_isSet;
}

bool OAIFeedIndexLogsErrorType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
