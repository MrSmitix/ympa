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


#include "GetCampaignOffersResultDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GetCampaignOffersResultDTO::GetCampaignOffersResultDTO()
{
    m_PagingIsSet = false;
    
}

void GetCampaignOffersResultDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GetCampaignOffersResultDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GetCampaignOffersResultDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GetCampaignOffersResultDTO" : pathPrefix;

             
    
    /* Offers */ {
        const std::vector<org::openapitools::server::model::GetCampaignOfferDTO>& value = m_Offers;
        const std::string currentValuePath = _pathPrefix + ".offers";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::GetCampaignOfferDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".offers") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool GetCampaignOffersResultDTO::operator==(const GetCampaignOffersResultDTO& rhs) const
{
    return
    
    
    
    ((!pagingIsSet() && !rhs.pagingIsSet()) || (pagingIsSet() && rhs.pagingIsSet() && getPaging() == rhs.getPaging())) &&
    
    (getOffers() == rhs.getOffers())
    
    
    ;
}

bool GetCampaignOffersResultDTO::operator!=(const GetCampaignOffersResultDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GetCampaignOffersResultDTO& o)
{
    j = nlohmann::json::object();
    if(o.pagingIsSet())
        j["paging"] = o.m_Paging;
    j["offers"] = o.m_Offers;
    
}

void from_json(const nlohmann::json& j, GetCampaignOffersResultDTO& o)
{
    if(j.find("paging") != j.end())
    {
        j.at("paging").get_to(o.m_Paging);
        o.m_PagingIsSet = true;
    } 
    j.at("offers").get_to(o.m_Offers);
    
}

org::openapitools::server::model::ScrollingPagerDTO GetCampaignOffersResultDTO::getPaging() const
{
    return m_Paging;
}
void GetCampaignOffersResultDTO::setPaging(org::openapitools::server::model::ScrollingPagerDTO const& value)
{
    m_Paging = value;
    m_PagingIsSet = true;
}
bool GetCampaignOffersResultDTO::pagingIsSet() const
{
    return m_PagingIsSet;
}
void GetCampaignOffersResultDTO::unsetPaging()
{
    m_PagingIsSet = false;
}
std::vector<org::openapitools::server::model::GetCampaignOfferDTO> GetCampaignOffersResultDTO::getOffers() const
{
    return m_Offers;
}
void GetCampaignOffersResultDTO::setOffers(std::vector<org::openapitools::server::model::GetCampaignOfferDTO> const& value)
{
    m_Offers = value;
}


} // namespace org::openapitools::server::model

