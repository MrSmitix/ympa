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


#include "QuarantineOfferDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

QuarantineOfferDTO::QuarantineOfferDTO()
{
    m_OfferId = "";
    m_OfferIdIsSet = false;
    m_CurrentPriceIsSet = false;
    m_LastValidPriceIsSet = false;
    m_VerdictsIsSet = false;
    
}

void QuarantineOfferDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool QuarantineOfferDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool QuarantineOfferDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "QuarantineOfferDTO" : pathPrefix;

         
    if (offerIdIsSet())
    {
        const std::string& value = m_OfferId;
        const std::string currentValuePath = _pathPrefix + ".offerId";
                
        
        if (value.length() < 1)
        {
            success = false;
            msg << currentValuePath << ": must be at least 1 characters long;";
        }
        if (value.length() > 255)
        {
            success = false;
            msg << currentValuePath << ": must be at most 255 characters long;";
        }

    }
                 
    if (verdictsIsSet())
    {
        const std::vector<org::openapitools::server::model::PriceQuarantineVerdictDTO>& value = m_Verdicts;
        const std::string currentValuePath = _pathPrefix + ".verdicts";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::PriceQuarantineVerdictDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".verdicts") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool QuarantineOfferDTO::operator==(const QuarantineOfferDTO& rhs) const
{
    return
    
    
    
    ((!offerIdIsSet() && !rhs.offerIdIsSet()) || (offerIdIsSet() && rhs.offerIdIsSet() && getOfferId() == rhs.getOfferId())) &&
    
    
    ((!currentPriceIsSet() && !rhs.currentPriceIsSet()) || (currentPriceIsSet() && rhs.currentPriceIsSet() && getCurrentPrice() == rhs.getCurrentPrice())) &&
    
    
    ((!lastValidPriceIsSet() && !rhs.lastValidPriceIsSet()) || (lastValidPriceIsSet() && rhs.lastValidPriceIsSet() && getLastValidPrice() == rhs.getLastValidPrice())) &&
    
    
    ((!verdictsIsSet() && !rhs.verdictsIsSet()) || (verdictsIsSet() && rhs.verdictsIsSet() && getVerdicts() == rhs.getVerdicts()))
    
    ;
}

bool QuarantineOfferDTO::operator!=(const QuarantineOfferDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const QuarantineOfferDTO& o)
{
    j = nlohmann::json::object();
    if(o.offerIdIsSet())
        j["offerId"] = o.m_OfferId;
    if(o.currentPriceIsSet())
        j["currentPrice"] = o.m_CurrentPrice;
    if(o.lastValidPriceIsSet())
        j["lastValidPrice"] = o.m_LastValidPrice;
    if(o.verdictsIsSet() || !o.m_Verdicts.empty())
        j["verdicts"] = o.m_Verdicts;
    
}

void from_json(const nlohmann::json& j, QuarantineOfferDTO& o)
{
    if(j.find("offerId") != j.end())
    {
        j.at("offerId").get_to(o.m_OfferId);
        o.m_OfferIdIsSet = true;
    } 
    if(j.find("currentPrice") != j.end())
    {
        j.at("currentPrice").get_to(o.m_CurrentPrice);
        o.m_CurrentPriceIsSet = true;
    } 
    if(j.find("lastValidPrice") != j.end())
    {
        j.at("lastValidPrice").get_to(o.m_LastValidPrice);
        o.m_LastValidPriceIsSet = true;
    } 
    if(j.find("verdicts") != j.end())
    {
        j.at("verdicts").get_to(o.m_Verdicts);
        o.m_VerdictsIsSet = true;
    } 
    
}

std::string QuarantineOfferDTO::getOfferId() const
{
    return m_OfferId;
}
void QuarantineOfferDTO::setOfferId(std::string const& value)
{
    m_OfferId = value;
    m_OfferIdIsSet = true;
}
bool QuarantineOfferDTO::offerIdIsSet() const
{
    return m_OfferIdIsSet;
}
void QuarantineOfferDTO::unsetOfferId()
{
    m_OfferIdIsSet = false;
}
org::openapitools::server::model::BasePriceDTO QuarantineOfferDTO::getCurrentPrice() const
{
    return m_CurrentPrice;
}
void QuarantineOfferDTO::setCurrentPrice(org::openapitools::server::model::BasePriceDTO const& value)
{
    m_CurrentPrice = value;
    m_CurrentPriceIsSet = true;
}
bool QuarantineOfferDTO::currentPriceIsSet() const
{
    return m_CurrentPriceIsSet;
}
void QuarantineOfferDTO::unsetCurrentPrice()
{
    m_CurrentPriceIsSet = false;
}
org::openapitools::server::model::BasePriceDTO QuarantineOfferDTO::getLastValidPrice() const
{
    return m_LastValidPrice;
}
void QuarantineOfferDTO::setLastValidPrice(org::openapitools::server::model::BasePriceDTO const& value)
{
    m_LastValidPrice = value;
    m_LastValidPriceIsSet = true;
}
bool QuarantineOfferDTO::lastValidPriceIsSet() const
{
    return m_LastValidPriceIsSet;
}
void QuarantineOfferDTO::unsetLastValidPrice()
{
    m_LastValidPriceIsSet = false;
}
std::vector<org::openapitools::server::model::PriceQuarantineVerdictDTO> QuarantineOfferDTO::getVerdicts() const
{
    return m_Verdicts;
}
void QuarantineOfferDTO::setVerdicts(std::vector<org::openapitools::server::model::PriceQuarantineVerdictDTO> const& value)
{
    m_Verdicts = value;
    m_VerdictsIsSet = true;
}
bool QuarantineOfferDTO::verdictsIsSet() const
{
    return m_VerdictsIsSet;
}
void QuarantineOfferDTO::unsetVerdicts()
{
    m_VerdictsIsSet = false;
}


} // namespace org::openapitools::server::model

