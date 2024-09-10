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


#include "OfferRecommendationDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OfferRecommendationDTO::OfferRecommendationDTO()
{
    m_OfferIsSet = false;
    m_RecommendationIsSet = false;
    
}

void OfferRecommendationDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OfferRecommendationDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OfferRecommendationDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OfferRecommendationDTO" : pathPrefix;

            
    return success;
}

bool OfferRecommendationDTO::operator==(const OfferRecommendationDTO& rhs) const
{
    return
    
    
    
    ((!offerIsSet() && !rhs.offerIsSet()) || (offerIsSet() && rhs.offerIsSet() && getOffer() == rhs.getOffer())) &&
    
    
    ((!recommendationIsSet() && !rhs.recommendationIsSet()) || (recommendationIsSet() && rhs.recommendationIsSet() && getRecommendation() == rhs.getRecommendation()))
    
    ;
}

bool OfferRecommendationDTO::operator!=(const OfferRecommendationDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OfferRecommendationDTO& o)
{
    j = nlohmann::json::object();
    if(o.offerIsSet())
        j["offer"] = o.m_Offer;
    if(o.recommendationIsSet())
        j["recommendation"] = o.m_Recommendation;
    
}

void from_json(const nlohmann::json& j, OfferRecommendationDTO& o)
{
    if(j.find("offer") != j.end())
    {
        j.at("offer").get_to(o.m_Offer);
        o.m_OfferIsSet = true;
    } 
    if(j.find("recommendation") != j.end())
    {
        j.at("recommendation").get_to(o.m_Recommendation);
        o.m_RecommendationIsSet = true;
    } 
    
}

org::openapitools::server::model::OfferForRecommendationDTO OfferRecommendationDTO::getOffer() const
{
    return m_Offer;
}
void OfferRecommendationDTO::setOffer(org::openapitools::server::model::OfferForRecommendationDTO const& value)
{
    m_Offer = value;
    m_OfferIsSet = true;
}
bool OfferRecommendationDTO::offerIsSet() const
{
    return m_OfferIsSet;
}
void OfferRecommendationDTO::unsetOffer()
{
    m_OfferIsSet = false;
}
org::openapitools::server::model::OfferRecommendationInfoDTO OfferRecommendationDTO::getRecommendation() const
{
    return m_Recommendation;
}
void OfferRecommendationDTO::setRecommendation(org::openapitools::server::model::OfferRecommendationInfoDTO const& value)
{
    m_Recommendation = value;
    m_RecommendationIsSet = true;
}
bool OfferRecommendationDTO::recommendationIsSet() const
{
    return m_RecommendationIsSet;
}
void OfferRecommendationDTO::unsetRecommendation()
{
    m_RecommendationIsSet = false;
}


} // namespace org::openapitools::server::model

