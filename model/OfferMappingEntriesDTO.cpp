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


#include "OfferMappingEntriesDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OfferMappingEntriesDTO::OfferMappingEntriesDTO()
{
    m_PagingIsSet = false;
    
}

void OfferMappingEntriesDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OfferMappingEntriesDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OfferMappingEntriesDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OfferMappingEntriesDTO" : pathPrefix;

             
    
    /* OfferMappingEntries */ {
        const std::vector<org::openapitools::server::model::OfferMappingEntryDTO>& value = m_OfferMappingEntries;
        const std::string currentValuePath = _pathPrefix + ".offerMappingEntries";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::OfferMappingEntryDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".offerMappingEntries") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool OfferMappingEntriesDTO::operator==(const OfferMappingEntriesDTO& rhs) const
{
    return
    
    
    
    ((!pagingIsSet() && !rhs.pagingIsSet()) || (pagingIsSet() && rhs.pagingIsSet() && getPaging() == rhs.getPaging())) &&
    
    (getOfferMappingEntries() == rhs.getOfferMappingEntries())
    
    
    ;
}

bool OfferMappingEntriesDTO::operator!=(const OfferMappingEntriesDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OfferMappingEntriesDTO& o)
{
    j = nlohmann::json::object();
    if(o.pagingIsSet())
        j["paging"] = o.m_Paging;
    j["offerMappingEntries"] = o.m_OfferMappingEntries;
    
}

void from_json(const nlohmann::json& j, OfferMappingEntriesDTO& o)
{
    if(j.find("paging") != j.end())
    {
        j.at("paging").get_to(o.m_Paging);
        o.m_PagingIsSet = true;
    } 
    j.at("offerMappingEntries").get_to(o.m_OfferMappingEntries);
    
}

org::openapitools::server::model::ScrollingPagerDTO OfferMappingEntriesDTO::getPaging() const
{
    return m_Paging;
}
void OfferMappingEntriesDTO::setPaging(org::openapitools::server::model::ScrollingPagerDTO const& value)
{
    m_Paging = value;
    m_PagingIsSet = true;
}
bool OfferMappingEntriesDTO::pagingIsSet() const
{
    return m_PagingIsSet;
}
void OfferMappingEntriesDTO::unsetPaging()
{
    m_PagingIsSet = false;
}
std::vector<org::openapitools::server::model::OfferMappingEntryDTO> OfferMappingEntriesDTO::getOfferMappingEntries() const
{
    return m_OfferMappingEntries;
}
void OfferMappingEntriesDTO::setOfferMappingEntries(std::vector<org::openapitools::server::model::OfferMappingEntryDTO> const& value)
{
    m_OfferMappingEntries = value;
}


} // namespace org::openapitools::server::model

