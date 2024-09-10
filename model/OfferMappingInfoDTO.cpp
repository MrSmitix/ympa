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


#include "OfferMappingInfoDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OfferMappingInfoDTO::OfferMappingInfoDTO()
{
    m_MappingIsSet = false;
    m_AwaitingModerationMappingIsSet = false;
    m_RejectedMappingIsSet = false;
    
}

void OfferMappingInfoDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OfferMappingInfoDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OfferMappingInfoDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OfferMappingInfoDTO" : pathPrefix;

                
    return success;
}

bool OfferMappingInfoDTO::operator==(const OfferMappingInfoDTO& rhs) const
{
    return
    
    
    
    ((!mappingIsSet() && !rhs.mappingIsSet()) || (mappingIsSet() && rhs.mappingIsSet() && getMapping() == rhs.getMapping())) &&
    
    
    ((!awaitingModerationMappingIsSet() && !rhs.awaitingModerationMappingIsSet()) || (awaitingModerationMappingIsSet() && rhs.awaitingModerationMappingIsSet() && getAwaitingModerationMapping() == rhs.getAwaitingModerationMapping())) &&
    
    
    ((!rejectedMappingIsSet() && !rhs.rejectedMappingIsSet()) || (rejectedMappingIsSet() && rhs.rejectedMappingIsSet() && getRejectedMapping() == rhs.getRejectedMapping()))
    
    ;
}

bool OfferMappingInfoDTO::operator!=(const OfferMappingInfoDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OfferMappingInfoDTO& o)
{
    j = nlohmann::json::object();
    if(o.mappingIsSet())
        j["mapping"] = o.m_Mapping;
    if(o.awaitingModerationMappingIsSet())
        j["awaitingModerationMapping"] = o.m_AwaitingModerationMapping;
    if(o.rejectedMappingIsSet())
        j["rejectedMapping"] = o.m_RejectedMapping;
    
}

void from_json(const nlohmann::json& j, OfferMappingInfoDTO& o)
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
    
}

org::openapitools::server::model::OfferMappingDTO OfferMappingInfoDTO::getMapping() const
{
    return m_Mapping;
}
void OfferMappingInfoDTO::setMapping(org::openapitools::server::model::OfferMappingDTO const& value)
{
    m_Mapping = value;
    m_MappingIsSet = true;
}
bool OfferMappingInfoDTO::mappingIsSet() const
{
    return m_MappingIsSet;
}
void OfferMappingInfoDTO::unsetMapping()
{
    m_MappingIsSet = false;
}
org::openapitools::server::model::OfferMappingDTO OfferMappingInfoDTO::getAwaitingModerationMapping() const
{
    return m_AwaitingModerationMapping;
}
void OfferMappingInfoDTO::setAwaitingModerationMapping(org::openapitools::server::model::OfferMappingDTO const& value)
{
    m_AwaitingModerationMapping = value;
    m_AwaitingModerationMappingIsSet = true;
}
bool OfferMappingInfoDTO::awaitingModerationMappingIsSet() const
{
    return m_AwaitingModerationMappingIsSet;
}
void OfferMappingInfoDTO::unsetAwaitingModerationMapping()
{
    m_AwaitingModerationMappingIsSet = false;
}
org::openapitools::server::model::OfferMappingDTO OfferMappingInfoDTO::getRejectedMapping() const
{
    return m_RejectedMapping;
}
void OfferMappingInfoDTO::setRejectedMapping(org::openapitools::server::model::OfferMappingDTO const& value)
{
    m_RejectedMapping = value;
    m_RejectedMappingIsSet = true;
}
bool OfferMappingInfoDTO::rejectedMappingIsSet() const
{
    return m_RejectedMappingIsSet;
}
void OfferMappingInfoDTO::unsetRejectedMapping()
{
    m_RejectedMappingIsSet = false;
}


} // namespace org::openapitools::server::model

