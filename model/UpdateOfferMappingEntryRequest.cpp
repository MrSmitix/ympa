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


#include "UpdateOfferMappingEntryRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

UpdateOfferMappingEntryRequest::UpdateOfferMappingEntryRequest()
{
    
}

void UpdateOfferMappingEntryRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool UpdateOfferMappingEntryRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool UpdateOfferMappingEntryRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "UpdateOfferMappingEntryRequest" : pathPrefix;

         
    
    /* OfferMappingEntries */ {
        const std::vector<org::openapitools::server::model::UpdateOfferMappingEntryDTO>& value = m_OfferMappingEntries;
        const std::string currentValuePath = _pathPrefix + ".offerMappingEntries";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 500)
        {
            success = false;
            msg << currentValuePath << ": must have at most 500 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::UpdateOfferMappingEntryDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".offerMappingEntries") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool UpdateOfferMappingEntryRequest::operator==(const UpdateOfferMappingEntryRequest& rhs) const
{
    return
    
    
    (getOfferMappingEntries() == rhs.getOfferMappingEntries())
    
    
    ;
}

bool UpdateOfferMappingEntryRequest::operator!=(const UpdateOfferMappingEntryRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const UpdateOfferMappingEntryRequest& o)
{
    j = nlohmann::json::object();
    j["offerMappingEntries"] = o.m_OfferMappingEntries;
    
}

void from_json(const nlohmann::json& j, UpdateOfferMappingEntryRequest& o)
{
    j.at("offerMappingEntries").get_to(o.m_OfferMappingEntries);
    
}

std::vector<org::openapitools::server::model::UpdateOfferMappingEntryDTO> UpdateOfferMappingEntryRequest::getOfferMappingEntries() const
{
    return m_OfferMappingEntries;
}
void UpdateOfferMappingEntryRequest::setOfferMappingEntries(std::vector<org::openapitools::server::model::UpdateOfferMappingEntryDTO> const& value)
{
    m_OfferMappingEntries = value;
}


} // namespace org::openapitools::server::model

