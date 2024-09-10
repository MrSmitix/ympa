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


#include "UpdateOfferMappingEntryDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

UpdateOfferMappingEntryDTO::UpdateOfferMappingEntryDTO()
{
    m_MappingIsSet = false;
    m_AwaitingModerationMappingIsSet = false;
    m_RejectedMappingIsSet = false;
    m_OfferIsSet = false;
    
}

void UpdateOfferMappingEntryDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool UpdateOfferMappingEntryDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool UpdateOfferMappingEntryDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "UpdateOfferMappingEntryDTO" : pathPrefix;

                    
    return success;
}

bool UpdateOfferMappingEntryDTO::operator==(const UpdateOfferMappingEntryDTO& rhs) const
{
    return
    
    
    
    ((!mappingIsSet() && !rhs.mappingIsSet()) || (mappingIsSet() && rhs.mappingIsSet() && getMapping() == rhs.getMapping())) &&
    
    
    ((!awaitingModerationMappingIsSet() && !rhs.awaitingModerationMappingIsSet()) || (awaitingModerationMappingIsSet() && rhs.awaitingModerationMappingIsSet() && getAwaitingModerationMapping() == rhs.getAwaitingModerationMapping())) &&
    
    
    ((!rejectedMappingIsSet() && !rhs.rejectedMappingIsSet()) || (rejectedMappingIsSet() && rhs.rejectedMappingIsSet() && getRejectedMapping() == rhs.getRejectedMapping())) &&
    
    
    ((!offerIsSet() && !rhs.offerIsSet()) || (offerIsSet() && rhs.offerIsSet() && getOffer() == rhs.getOffer()))
    
    ;
}

bool UpdateOfferMappingEntryDTO::operator!=(const UpdateOfferMappingEntryDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const UpdateOfferMappingEntryDTO& o)
{
    j = nlohmann::json::object();
    if(o.mappingIsSet())
        j["mapping"] = o.m_Mapping;
    if(o.awaitingModerationMappingIsSet())
        j["awaitingModerationMapping"] = o.m_AwaitingModerationMapping;
    if(o.rejectedMappingIsSet())
        j["rejectedMapping"] = o.m_RejectedMapping;
    if(o.offerIsSet())
        j["offer"] = o.m_Offer;
    
}

void from_json(const nlohmann::json& j, UpdateOfferMappingEntryDTO& o)
{
    if(j.find("mapping") != j.end())
    {
        j.at("mapping").get_to(o.m_Mapping);
        o.m_MappingIsSet = true;
    } 
    if(j.find("awaitingModerationMapping") != j.end())
    {
        j.at("awaitingModerationMapping").get_to(o.m_AwaitingModerationMapping);
        o.m_AwaitingModerationMappingIsSet = true;
    } 
    if(j.find("rejectedMapping") != j.end())
    {
        j.at("rejectedMapping").get_to(o.m_RejectedMapping);
        o.m_RejectedMappingIsSet = true;
    } 
    if(j.find("offer") != j.end())
    {
        j.at("offer").get_to(o.m_Offer);
        o.m_OfferIsSet = true;
    } 
    
}

org::openapitools::server::model::OfferMappingDTO UpdateOfferMappingEntryDTO::getMapping() const
{
    return m_Mapping;
}
void UpdateOfferMappingEntryDTO::setMapping(org::openapitools::server::model::OfferMappingDTO const& value)
{
    m_Mapping = value;
    m_MappingIsSet = true;
}
bool UpdateOfferMappingEntryDTO::mappingIsSet() const
{
    return m_MappingIsSet;
}
void UpdateOfferMappingEntryDTO::unsetMapping()
{
    m_MappingIsSet = false;
}
org::openapitools::server::model::OfferMappingDTO UpdateOfferMappingEntryDTO::getAwaitingModerationMapping() const
{
    return m_AwaitingModerationMapping;
}
void UpdateOfferMappingEntryDTO::setAwaitingModerationMapping(org::openapitools::server::model::OfferMappingDTO const& value)
{
    m_AwaitingModerationMapping = value;
    m_AwaitingModerationMappingIsSet = true;
}
bool UpdateOfferMappingEntryDTO::awaitingModerationMappingIsSet() const
{
    return m_AwaitingModerationMappingIsSet;
}
void UpdateOfferMappingEntryDTO::unsetAwaitingModerationMapping()
{
    m_AwaitingModerationMappingIsSet = false;
}
org::openapitools::server::model::OfferMappingDTO UpdateOfferMappingEntryDTO::getRejectedMapping() const
{
    return m_RejectedMapping;
}
void UpdateOfferMappingEntryDTO::setRejectedMapping(org::openapitools::server::model::OfferMappingDTO const& value)
{
    m_RejectedMapping = value;
    m_RejectedMappingIsSet = true;
}
bool UpdateOfferMappingEntryDTO::rejectedMappingIsSet() const
{
    return m_RejectedMappingIsSet;
}
void UpdateOfferMappingEntryDTO::unsetRejectedMapping()
{
    m_RejectedMappingIsSet = false;
}
org::openapitools::server::model::UpdateMappingsOfferDTO UpdateOfferMappingEntryDTO::getOffer() const
{
    return m_Offer;
}
void UpdateOfferMappingEntryDTO::setOffer(org::openapitools::server::model::UpdateMappingsOfferDTO const& value)
{
    m_Offer = value;
    m_OfferIsSet = true;
}
bool UpdateOfferMappingEntryDTO::offerIsSet() const
{
    return m_OfferIsSet;
}
void UpdateOfferMappingEntryDTO::unsetOffer()
{
    m_OfferIsSet = false;
}


} // namespace org::openapitools::server::model

