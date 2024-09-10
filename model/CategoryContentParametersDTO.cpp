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


#include "CategoryContentParametersDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CategoryContentParametersDTO::CategoryContentParametersDTO()
{
    m_CategoryId = 0;
    m_ParametersIsSet = false;
    
}

void CategoryContentParametersDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CategoryContentParametersDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CategoryContentParametersDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CategoryContentParametersDTO" : pathPrefix;

             
    if (parametersIsSet())
    {
        const std::vector<org::openapitools::server::model::CategoryParameterDTO>& value = m_Parameters;
        const std::string currentValuePath = _pathPrefix + ".parameters";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::CategoryParameterDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".parameters") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool CategoryContentParametersDTO::operator==(const CategoryContentParametersDTO& rhs) const
{
    return
    
    
    (getCategoryId() == rhs.getCategoryId())
     &&
    
    
    ((!parametersIsSet() && !rhs.parametersIsSet()) || (parametersIsSet() && rhs.parametersIsSet() && getParameters() == rhs.getParameters()))
    
    ;
}

bool CategoryContentParametersDTO::operator!=(const CategoryContentParametersDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CategoryContentParametersDTO& o)
{
    j = nlohmann::json::object();
    j["categoryId"] = o.m_CategoryId;
    if(o.parametersIsSet() || !o.m_Parameters.empty())
        j["parameters"] = o.m_Parameters;
    
}

void from_json(const nlohmann::json& j, CategoryContentParametersDTO& o)
{
    j.at("categoryId").get_to(o.m_CategoryId);
    if(j.find("parameters") != j.end())
    {
        j.at("parameters").get_to(o.m_Parameters);
        o.m_ParametersIsSet = true;
    } 
    
}

int32_t CategoryContentParametersDTO::getCategoryId() const
{
    return m_CategoryId;
}
void CategoryContentParametersDTO::setCategoryId(int32_t const value)
{
    m_CategoryId = value;
}
std::vector<org::openapitools::server::model::CategoryParameterDTO> CategoryContentParametersDTO::getParameters() const
{
    return m_Parameters;
}
void CategoryContentParametersDTO::setParameters(std::vector<org::openapitools::server::model::CategoryParameterDTO> const& value)
{
    m_Parameters = value;
    m_ParametersIsSet = true;
}
bool CategoryContentParametersDTO::parametersIsSet() const
{
    return m_ParametersIsSet;
}
void CategoryContentParametersDTO::unsetParameters()
{
    m_ParametersIsSet = false;
}


} // namespace org::openapitools::server::model

