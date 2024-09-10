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


#include "ReturnType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

ReturnType::ReturnType()
{
    
}

void ReturnType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ReturnType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ReturnType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ReturnType" : pathPrefix;

    
    if (m_value == ReturnType::eReturnType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool ReturnType::operator==(const ReturnType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool ReturnType::operator!=(const ReturnType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ReturnType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case ReturnType::eReturnType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case ReturnType::eReturnType::UNREDEEMED:
            j = "UNREDEEMED";
            break;
        case ReturnType::eReturnType::RETURN:
            j = "RETURN";
            break;
    }
}

void from_json(const nlohmann::json& j, ReturnType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "UNREDEEMED") {
     o.setValue(ReturnType::eReturnType::UNREDEEMED);
    } 
    else if (s == "RETURN") {
     o.setValue(ReturnType::eReturnType::RETURN);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " ReturnType::eReturnType";
     throw std::invalid_argument(ss.str());
    } 

}

ReturnType::eReturnType ReturnType::getValue() const
{
    return m_value;
}
void ReturnType::setValue(ReturnType::eReturnType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

