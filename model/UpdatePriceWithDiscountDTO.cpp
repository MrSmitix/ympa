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


#include "UpdatePriceWithDiscountDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

UpdatePriceWithDiscountDTO::UpdatePriceWithDiscountDTO()
{
    m_Value = 0.0;
    m_DiscountBase = 0.0;
    m_DiscountBaseIsSet = false;
    
}

void UpdatePriceWithDiscountDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool UpdatePriceWithDiscountDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool UpdatePriceWithDiscountDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "UpdatePriceWithDiscountDTO" : pathPrefix;

         
    
    /* Value */ {
        const double& value = m_Value;
        const std::string currentValuePath = _pathPrefix + ".value";
                
        
        if (value <= 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than 0;";
        }

    }
             
    if (discountBaseIsSet())
    {
        const double& value = m_DiscountBase;
        const std::string currentValuePath = _pathPrefix + ".discountBase";
                
        
        if (value <= 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than 0;";
        }

    }
    
    return success;
}

bool UpdatePriceWithDiscountDTO::operator==(const UpdatePriceWithDiscountDTO& rhs) const
{
    return
    
    
    (getValue() == rhs.getValue())
     &&
    
    (getCurrencyId() == rhs.getCurrencyId())
     &&
    
    
    ((!discountBaseIsSet() && !rhs.discountBaseIsSet()) || (discountBaseIsSet() && rhs.discountBaseIsSet() && getDiscountBase() == rhs.getDiscountBase()))
    
    ;
}

bool UpdatePriceWithDiscountDTO::operator!=(const UpdatePriceWithDiscountDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const UpdatePriceWithDiscountDTO& o)
{
    j = nlohmann::json::object();
    j["value"] = o.m_Value;
    j["currencyId"] = o.m_CurrencyId;
    if(o.discountBaseIsSet())
        j["discountBase"] = o.m_DiscountBase;
    
}

void from_json(const nlohmann::json& j, UpdatePriceWithDiscountDTO& o)
{
    j.at("value").get_to(o.m_Value);
    j.at("currencyId").get_to(o.m_CurrencyId);
    if(j.find("discountBase") != j.end())
    {
        j.at("discountBase").get_to(o.m_DiscountBase);
        o.m_DiscountBaseIsSet = true;
    } 
    
}

double UpdatePriceWithDiscountDTO::getValue() const
{
    return m_Value;
}
void UpdatePriceWithDiscountDTO::setValue(double const value)
{
    m_Value = value;
}
org::openapitools::server::model::CurrencyType UpdatePriceWithDiscountDTO::getCurrencyId() const
{
    return m_CurrencyId;
}
void UpdatePriceWithDiscountDTO::setCurrencyId(org::openapitools::server::model::CurrencyType const& value)
{
    m_CurrencyId = value;
}
double UpdatePriceWithDiscountDTO::getDiscountBase() const
{
    return m_DiscountBase;
}
void UpdatePriceWithDiscountDTO::setDiscountBase(double const value)
{
    m_DiscountBase = value;
    m_DiscountBaseIsSet = true;
}
bool UpdatePriceWithDiscountDTO::discountBaseIsSet() const
{
    return m_DiscountBaseIsSet;
}
void UpdatePriceWithDiscountDTO::unsetDiscountBase()
{
    m_DiscountBaseIsSet = false;
}


} // namespace org::openapitools::server::model

