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


#include "GenerateMassOrderLabelsRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GenerateMassOrderLabelsRequest::GenerateMassOrderLabelsRequest()
{
    m_BusinessId = 0L;
    
}

void GenerateMassOrderLabelsRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GenerateMassOrderLabelsRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GenerateMassOrderLabelsRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GenerateMassOrderLabelsRequest" : pathPrefix;

             
    
    /* OrderIds */ {
        const std::set<int64_t>& value = m_OrderIds;
        const std::string currentValuePath = _pathPrefix + ".orderIds";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 1000)
        {
            success = false;
            msg << currentValuePath << ": must have at most 1000 elements;";
        }
        if (!org::openapitools::server::helpers::hasOnlyUniqueItems(value))
        {
            success = false;
            msg << currentValuePath << ": may not contain the same item more than once;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const int64_t& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool GenerateMassOrderLabelsRequest::operator==(const GenerateMassOrderLabelsRequest& rhs) const
{
    return
    
    
    (getBusinessId() == rhs.getBusinessId())
     &&
    
    (getOrderIds() == rhs.getOrderIds())
    
    
    ;
}

bool GenerateMassOrderLabelsRequest::operator!=(const GenerateMassOrderLabelsRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GenerateMassOrderLabelsRequest& o)
{
    j = nlohmann::json::object();
    j["businessId"] = o.m_BusinessId;
    j["orderIds"] = o.m_OrderIds;
    
}

void from_json(const nlohmann::json& j, GenerateMassOrderLabelsRequest& o)
{
    j.at("businessId").get_to(o.m_BusinessId);
    j.at("orderIds").get_to(o.m_OrderIds);
    
}

int64_t GenerateMassOrderLabelsRequest::getBusinessId() const
{
    return m_BusinessId;
}
void GenerateMassOrderLabelsRequest::setBusinessId(int64_t const value)
{
    m_BusinessId = value;
}
std::set<int64_t> GenerateMassOrderLabelsRequest::getOrderIds() const
{
    return m_OrderIds;
}
void GenerateMassOrderLabelsRequest::setOrderIds(std::set<int64_t> const value)
{
    m_OrderIds = value;
}


} // namespace org::openapitools::server::model

