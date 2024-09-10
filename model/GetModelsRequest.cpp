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


#include "GetModelsRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GetModelsRequest::GetModelsRequest()
{
    
}

void GetModelsRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GetModelsRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GetModelsRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GetModelsRequest" : pathPrefix;

         
    
    /* Models */ {
        const std::vector<int64_t>& value = m_Models;
        const std::string currentValuePath = _pathPrefix + ".models";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const int64_t& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
        if (value <= 0ll)
        {
            success = false;
            msg << currentValuePath << ": must be greater than 0;";
        }
 
                i++;
            }
        }

    }
    
    return success;
}

bool GetModelsRequest::operator==(const GetModelsRequest& rhs) const
{
    return
    
    
    (getModels() == rhs.getModels())
    
    
    ;
}

bool GetModelsRequest::operator!=(const GetModelsRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GetModelsRequest& o)
{
    j = nlohmann::json::object();
    j["models"] = o.m_Models;
    
}

void from_json(const nlohmann::json& j, GetModelsRequest& o)
{
    j.at("models").get_to(o.m_Models);
    
}

std::vector<int64_t> GetModelsRequest::getModels() const
{
    return m_Models;
}
void GetModelsRequest::setModels(std::vector<int64_t> const value)
{
    m_Models = value;
}


} // namespace org::openapitools::server::model

