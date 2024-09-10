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


#include "CampaignQualityRatingDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CampaignQualityRatingDTO::CampaignQualityRatingDTO()
{
    m_CampaignId = 0L;
    
}

void CampaignQualityRatingDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CampaignQualityRatingDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CampaignQualityRatingDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CampaignQualityRatingDTO" : pathPrefix;

             
    
    /* Ratings */ {
        const std::vector<org::openapitools::server::model::QualityRatingDTO>& value = m_Ratings;
        const std::string currentValuePath = _pathPrefix + ".ratings";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::QualityRatingDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".ratings") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool CampaignQualityRatingDTO::operator==(const CampaignQualityRatingDTO& rhs) const
{
    return
    
    
    (getCampaignId() == rhs.getCampaignId())
     &&
    
    (getRatings() == rhs.getRatings())
    
    
    ;
}

bool CampaignQualityRatingDTO::operator!=(const CampaignQualityRatingDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CampaignQualityRatingDTO& o)
{
    j = nlohmann::json::object();
    j["campaignId"] = o.m_CampaignId;
    j["ratings"] = o.m_Ratings;
    
}

void from_json(const nlohmann::json& j, CampaignQualityRatingDTO& o)
{
    j.at("campaignId").get_to(o.m_CampaignId);
    j.at("ratings").get_to(o.m_Ratings);
    
}

int64_t CampaignQualityRatingDTO::getCampaignId() const
{
    return m_CampaignId;
}
void CampaignQualityRatingDTO::setCampaignId(int64_t const value)
{
    m_CampaignId = value;
}
std::vector<org::openapitools::server::model::QualityRatingDTO> CampaignQualityRatingDTO::getRatings() const
{
    return m_Ratings;
}
void CampaignQualityRatingDTO::setRatings(std::vector<org::openapitools::server::model::QualityRatingDTO> const& value)
{
    m_Ratings = value;
}


} // namespace org::openapitools::server::model

