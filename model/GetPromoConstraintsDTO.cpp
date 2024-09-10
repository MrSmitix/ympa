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


#include "GetPromoConstraintsDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GetPromoConstraintsDTO::GetPromoConstraintsDTO()
{
    m_WarehouseIdsIsSet = false;
    
}

void GetPromoConstraintsDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GetPromoConstraintsDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GetPromoConstraintsDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GetPromoConstraintsDTO" : pathPrefix;

         
    if (warehouseIdsIsSet())
    {
        const std::vector<int64_t>& value = m_WarehouseIds;
        const std::string currentValuePath = _pathPrefix + ".warehouseIds";
                
        
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

bool GetPromoConstraintsDTO::operator==(const GetPromoConstraintsDTO& rhs) const
{
    return
    
    
    
    ((!warehouseIdsIsSet() && !rhs.warehouseIdsIsSet()) || (warehouseIdsIsSet() && rhs.warehouseIdsIsSet() && getWarehouseIds() == rhs.getWarehouseIds()))
    
    ;
}

bool GetPromoConstraintsDTO::operator!=(const GetPromoConstraintsDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GetPromoConstraintsDTO& o)
{
    j = nlohmann::json::object();
    if(o.warehouseIdsIsSet() || !o.m_WarehouseIds.empty())
        j["warehouseIds"] = o.m_WarehouseIds;
    
}

void from_json(const nlohmann::json& j, GetPromoConstraintsDTO& o)
{
    if(j.find("warehouseIds") != j.end())
    {
        j.at("warehouseIds").get_to(o.m_WarehouseIds);
        o.m_WarehouseIdsIsSet = true;
    } 
    
}

std::vector<int64_t> GetPromoConstraintsDTO::getWarehouseIds() const
{
    return m_WarehouseIds;
}
void GetPromoConstraintsDTO::setWarehouseIds(std::vector<int64_t> const value)
{
    m_WarehouseIds = value;
    m_WarehouseIdsIsSet = true;
}
bool GetPromoConstraintsDTO::warehouseIdsIsSet() const
{
    return m_WarehouseIdsIsSet;
}
void GetPromoConstraintsDTO::unsetWarehouseIds()
{
    m_WarehouseIdsIsSet = false;
}


} // namespace org::openapitools::server::model

