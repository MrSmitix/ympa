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


#include "PriceQuarantineVerdictParamNameType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

PriceQuarantineVerdictParamNameType::PriceQuarantineVerdictParamNameType()
{
    
}

void PriceQuarantineVerdictParamNameType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool PriceQuarantineVerdictParamNameType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool PriceQuarantineVerdictParamNameType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "PriceQuarantineVerdictParamNameType" : pathPrefix;

    
    if (m_value == PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool PriceQuarantineVerdictParamNameType::operator==(const PriceQuarantineVerdictParamNameType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool PriceQuarantineVerdictParamNameType::operator!=(const PriceQuarantineVerdictParamNameType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const PriceQuarantineVerdictParamNameType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType::CURRENT_PRICE:
            j = "CURRENT_PRICE";
            break;
        case PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType::LAST_VALID_PRICE:
            j = "LAST_VALID_PRICE";
            break;
        case PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType::MIN_PRICE:
            j = "MIN_PRICE";
            break;
        case PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType::CURRENCY:
            j = "CURRENCY";
            break;
    }
}

void from_json(const nlohmann::json& j, PriceQuarantineVerdictParamNameType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "CURRENT_PRICE") {
     o.setValue(PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType::CURRENT_PRICE);
    } 
    else if (s == "LAST_VALID_PRICE") {
     o.setValue(PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType::LAST_VALID_PRICE);
    } 
    else if (s == "MIN_PRICE") {
     o.setValue(PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType::MIN_PRICE);
    } 
    else if (s == "CURRENCY") {
     o.setValue(PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType::CURRENCY);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType";
     throw std::invalid_argument(ss.str());
    } 

}

PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType PriceQuarantineVerdictParamNameType::getValue() const
{
    return m_value;
}
void PriceQuarantineVerdictParamNameType::setValue(PriceQuarantineVerdictParamNameType::ePriceQuarantineVerdictParamNameType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

