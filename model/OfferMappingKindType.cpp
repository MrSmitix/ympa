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


#include "OfferMappingKindType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

OfferMappingKindType::OfferMappingKindType()
{
    
}

void OfferMappingKindType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OfferMappingKindType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OfferMappingKindType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OfferMappingKindType" : pathPrefix;

    
    if (m_value == OfferMappingKindType::eOfferMappingKindType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool OfferMappingKindType::operator==(const OfferMappingKindType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool OfferMappingKindType::operator!=(const OfferMappingKindType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OfferMappingKindType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case OfferMappingKindType::eOfferMappingKindType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case OfferMappingKindType::eOfferMappingKindType::ACTIVE:
            j = "ACTIVE";
            break;
        case OfferMappingKindType::eOfferMappingKindType::ALL:
            j = "ALL";
            break;
    }
}

void from_json(const nlohmann::json& j, OfferMappingKindType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "ACTIVE") {
     o.setValue(OfferMappingKindType::eOfferMappingKindType::ACTIVE);
    } 
    else if (s == "ALL") {
     o.setValue(OfferMappingKindType::eOfferMappingKindType::ALL);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " OfferMappingKindType::eOfferMappingKindType";
     throw std::invalid_argument(ss.str());
    } 

}

OfferMappingKindType::eOfferMappingKindType OfferMappingKindType::getValue() const
{
    return m_value;
}
void OfferMappingKindType::setValue(OfferMappingKindType::eOfferMappingKindType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

