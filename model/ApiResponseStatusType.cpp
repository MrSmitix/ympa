/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "ApiResponseStatusType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

ApiResponseStatusType::ApiResponseStatusType()
{
    
}

void ApiResponseStatusType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ApiResponseStatusType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ApiResponseStatusType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ApiResponseStatusType" : pathPrefix;

    
    if (m_value == ApiResponseStatusType::eApiResponseStatusType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool ApiResponseStatusType::operator==(const ApiResponseStatusType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool ApiResponseStatusType::operator!=(const ApiResponseStatusType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ApiResponseStatusType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case ApiResponseStatusType::eApiResponseStatusType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case ApiResponseStatusType::eApiResponseStatusType::OK:
            j = "OK";
            break;
        case ApiResponseStatusType::eApiResponseStatusType::ERROR:
            j = "ERROR";
            break;
    }
}

void from_json(const nlohmann::json& j, ApiResponseStatusType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "OK") {
     o.setValue(ApiResponseStatusType::eApiResponseStatusType::OK);
    } 
    else if (s == "ERROR") {
     o.setValue(ApiResponseStatusType::eApiResponseStatusType::ERROR);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " ApiResponseStatusType::eApiResponseStatusType";
     throw std::invalid_argument(ss.str());
    } 

}

ApiResponseStatusType::eApiResponseStatusType ApiResponseStatusType::getValue() const
{
    return m_value;
}
void ApiResponseStatusType::setValue(ApiResponseStatusType::eApiResponseStatusType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

