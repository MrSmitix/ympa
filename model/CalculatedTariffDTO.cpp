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


#include "CalculatedTariffDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CalculatedTariffDTO::CalculatedTariffDTO()
{
    m_Amount = 0.0;
    m_AmountIsSet = false;
    
}

void CalculatedTariffDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CalculatedTariffDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CalculatedTariffDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CalculatedTariffDTO" : pathPrefix;

                 
    
    /* Parameters */ {
        const std::vector<org::openapitools::server::model::TariffParameterDTO>& value = m_Parameters;
        const std::string currentValuePath = _pathPrefix + ".parameters";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::TariffParameterDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".parameters") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool CalculatedTariffDTO::operator==(const CalculatedTariffDTO& rhs) const
{
    return
    
    
    (getType() == rhs.getType())
     &&
    
    
    ((!amountIsSet() && !rhs.amountIsSet()) || (amountIsSet() && rhs.amountIsSet() && getAmount() == rhs.getAmount())) &&
    
    (getParameters() == rhs.getParameters())
    
    
    ;
}

bool CalculatedTariffDTO::operator!=(const CalculatedTariffDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CalculatedTariffDTO& o)
{
    j = nlohmann::json::object();
    j["type"] = o.m_Type;
    if(o.amountIsSet())
        j["amount"] = o.m_Amount;
    j["parameters"] = o.m_Parameters;
    
}

void from_json(const nlohmann::json& j, CalculatedTariffDTO& o)
{
    j.at("type").get_to(o.m_Type);
    if(j.find("amount") != j.end())
    {
        j.at("amount").get_to(o.m_Amount);
        o.m_AmountIsSet = true;
    } 
    j.at("parameters").get_to(o.m_Parameters);
    
}

org::openapitools::server::model::CalculatedTariffType CalculatedTariffDTO::getType() const
{
    return m_Type;
}
void CalculatedTariffDTO::setType(org::openapitools::server::model::CalculatedTariffType const& value)
{
    m_Type = value;
}
double CalculatedTariffDTO::getAmount() const
{
    return m_Amount;
}
void CalculatedTariffDTO::setAmount(double const value)
{
    m_Amount = value;
    m_AmountIsSet = true;
}
bool CalculatedTariffDTO::amountIsSet() const
{
    return m_AmountIsSet;
}
void CalculatedTariffDTO::unsetAmount()
{
    m_AmountIsSet = false;
}
std::vector<org::openapitools::server::model::TariffParameterDTO> CalculatedTariffDTO::getParameters() const
{
    return m_Parameters;
}
void CalculatedTariffDTO::setParameters(std::vector<org::openapitools::server::model::TariffParameterDTO> const& value)
{
    m_Parameters = value;
}


} // namespace org::openapitools::server::model

