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


#include "OrderBoxLayoutItemDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OrderBoxLayoutItemDTO::OrderBoxLayoutItemDTO()
{
    m_Id = 0L;
    m_FullCount = 0;
    m_FullCountIsSet = false;
    m_PartialCountIsSet = false;
    m_InstancesIsSet = false;
    
}

void OrderBoxLayoutItemDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OrderBoxLayoutItemDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OrderBoxLayoutItemDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OrderBoxLayoutItemDTO" : pathPrefix;

             
    if (fullCountIsSet())
    {
        const int32_t& value = m_FullCount;
        const std::string currentValuePath = _pathPrefix + ".fullCount";
                
        
        if (value < 1)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 1;";
        }

    }
             
    if (instancesIsSet())
    {
        const std::vector<org::openapitools::server::model::BriefOrderItemInstanceDTO>& value = m_Instances;
        const std::string currentValuePath = _pathPrefix + ".instances";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::BriefOrderItemInstanceDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".instances") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool OrderBoxLayoutItemDTO::operator==(const OrderBoxLayoutItemDTO& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    
    ((!fullCountIsSet() && !rhs.fullCountIsSet()) || (fullCountIsSet() && rhs.fullCountIsSet() && getFullCount() == rhs.getFullCount())) &&
    
    
    ((!partialCountIsSet() && !rhs.partialCountIsSet()) || (partialCountIsSet() && rhs.partialCountIsSet() && getPartialCount() == rhs.getPartialCount())) &&
    
    
    ((!instancesIsSet() && !rhs.instancesIsSet()) || (instancesIsSet() && rhs.instancesIsSet() && getInstances() == rhs.getInstances()))
    
    ;
}

bool OrderBoxLayoutItemDTO::operator!=(const OrderBoxLayoutItemDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OrderBoxLayoutItemDTO& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    if(o.fullCountIsSet())
        j["fullCount"] = o.m_FullCount;
    if(o.partialCountIsSet())
        j["partialCount"] = o.m_PartialCount;
    if(o.instancesIsSet() || !o.m_Instances.empty())
        j["instances"] = o.m_Instances;
    
}

void from_json(const nlohmann::json& j, OrderBoxLayoutItemDTO& o)
{
    j.at("id").get_to(o.m_Id);
    if(j.find("fullCount") != j.end())
    {
        j.at("fullCount").get_to(o.m_FullCount);
        o.m_FullCountIsSet = true;
    } 
    if(j.find("partialCount") != j.end())
    {
        j.at("partialCount").get_to(o.m_PartialCount);
        o.m_PartialCountIsSet = true;
    } 
    if(j.find("instances") != j.end())
    {
        j.at("instances").get_to(o.m_Instances);
        o.m_InstancesIsSet = true;
    } 
    
}

int64_t OrderBoxLayoutItemDTO::getId() const
{
    return m_Id;
}
void OrderBoxLayoutItemDTO::setId(int64_t const value)
{
    m_Id = value;
}
int32_t OrderBoxLayoutItemDTO::getFullCount() const
{
    return m_FullCount;
}
void OrderBoxLayoutItemDTO::setFullCount(int32_t const value)
{
    m_FullCount = value;
    m_FullCountIsSet = true;
}
bool OrderBoxLayoutItemDTO::fullCountIsSet() const
{
    return m_FullCountIsSet;
}
void OrderBoxLayoutItemDTO::unsetFullCount()
{
    m_FullCountIsSet = false;
}
org::openapitools::server::model::OrderBoxLayoutPartialCountDTO OrderBoxLayoutItemDTO::getPartialCount() const
{
    return m_PartialCount;
}
void OrderBoxLayoutItemDTO::setPartialCount(org::openapitools::server::model::OrderBoxLayoutPartialCountDTO const& value)
{
    m_PartialCount = value;
    m_PartialCountIsSet = true;
}
bool OrderBoxLayoutItemDTO::partialCountIsSet() const
{
    return m_PartialCountIsSet;
}
void OrderBoxLayoutItemDTO::unsetPartialCount()
{
    m_PartialCountIsSet = false;
}
std::vector<org::openapitools::server::model::BriefOrderItemInstanceDTO> OrderBoxLayoutItemDTO::getInstances() const
{
    return m_Instances;
}
void OrderBoxLayoutItemDTO::setInstances(std::vector<org::openapitools::server::model::BriefOrderItemInstanceDTO> const& value)
{
    m_Instances = value;
    m_InstancesIsSet = true;
}
bool OrderBoxLayoutItemDTO::instancesIsSet() const
{
    return m_InstancesIsSet;
}
void OrderBoxLayoutItemDTO::unsetInstances()
{
    m_InstancesIsSet = false;
}


} // namespace org::openapitools::server::model

