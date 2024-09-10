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


#include "OrderItemSubsidyDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OrderItemSubsidyDTO::OrderItemSubsidyDTO()
{
    m_TypeIsSet = false;
    m_Amount = 0.0;
    m_AmountIsSet = false;
    
}

void OrderItemSubsidyDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OrderItemSubsidyDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OrderItemSubsidyDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OrderItemSubsidyDTO" : pathPrefix;

            
    return success;
}

bool OrderItemSubsidyDTO::operator==(const OrderItemSubsidyDTO& rhs) const
{
    return
    
    
    
    ((!typeIsSet() && !rhs.typeIsSet()) || (typeIsSet() && rhs.typeIsSet() && getType() == rhs.getType())) &&
    
    
    ((!amountIsSet() && !rhs.amountIsSet()) || (amountIsSet() && rhs.amountIsSet() && getAmount() == rhs.getAmount()))
    
    ;
}

bool OrderItemSubsidyDTO::operator!=(const OrderItemSubsidyDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OrderItemSubsidyDTO& o)
{
    j = nlohmann::json::object();
    if(o.typeIsSet())
        j["type"] = o.m_Type;
    if(o.amountIsSet())
        j["amount"] = o.m_Amount;
    
}

void from_json(const nlohmann::json& j, OrderItemSubsidyDTO& o)
{
    if(j.find("type") != j.end())
    {
        j.at("type").get_to(o.m_Type);
        o.m_TypeIsSet = true;
    } 
    if(j.find("amount") != j.end())
    {
        j.at("amount").get_to(o.m_Amount);
        o.m_AmountIsSet = true;
    } 
    
}

org::openapitools::server::model::OrderItemSubsidyType OrderItemSubsidyDTO::getType() const
{
    return m_Type;
}
void OrderItemSubsidyDTO::setType(org::openapitools::server::model::OrderItemSubsidyType const& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool OrderItemSubsidyDTO::typeIsSet() const
{
    return m_TypeIsSet;
}
void OrderItemSubsidyDTO::unsetType()
{
    m_TypeIsSet = false;
}
double OrderItemSubsidyDTO::getAmount() const
{
    return m_Amount;
}
void OrderItemSubsidyDTO::setAmount(double const value)
{
    m_Amount = value;
    m_AmountIsSet = true;
}
bool OrderItemSubsidyDTO::amountIsSet() const
{
    return m_AmountIsSet;
}
void OrderItemSubsidyDTO::unsetAmount()
{
    m_AmountIsSet = false;
}


} // namespace org::openapitools::server::model

