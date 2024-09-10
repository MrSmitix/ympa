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


#include "EnrichedModelDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

EnrichedModelDTO::EnrichedModelDTO()
{
    m_Id = 0L;
    m_IdIsSet = false;
    m_Name = "";
    m_NameIsSet = false;
    m_PricesIsSet = false;
    m_OffersIsSet = false;
    m_OfflineOffers = 0;
    m_OfflineOffersIsSet = false;
    m_OnlineOffers = 0;
    m_OnlineOffersIsSet = false;
    
}

void EnrichedModelDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool EnrichedModelDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool EnrichedModelDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "EnrichedModelDTO" : pathPrefix;

                     
    if (offersIsSet())
    {
        const std::vector<org::openapitools::server::model::ModelOfferDTO>& value = m_Offers;
        const std::string currentValuePath = _pathPrefix + ".offers";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ModelOfferDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".offers") && success;
 
                i++;
            }
        }

    }
            
    return success;
}

bool EnrichedModelDTO::operator==(const EnrichedModelDTO& rhs) const
{
    return
    
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!pricesIsSet() && !rhs.pricesIsSet()) || (pricesIsSet() && rhs.pricesIsSet() && getPrices() == rhs.getPrices())) &&
    
    
    ((!offersIsSet() && !rhs.offersIsSet()) || (offersIsSet() && rhs.offersIsSet() && getOffers() == rhs.getOffers())) &&
    
    
    ((!offlineOffersIsSet() && !rhs.offlineOffersIsSet()) || (offlineOffersIsSet() && rhs.offlineOffersIsSet() && getOfflineOffers() == rhs.getOfflineOffers())) &&
    
    
    ((!onlineOffersIsSet() && !rhs.onlineOffersIsSet()) || (onlineOffersIsSet() && rhs.onlineOffersIsSet() && getOnlineOffers() == rhs.getOnlineOffers()))
    
    ;
}

bool EnrichedModelDTO::operator!=(const EnrichedModelDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const EnrichedModelDTO& o)
{
    j = nlohmann::json::object();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.pricesIsSet())
        j["prices"] = o.m_Prices;
    if(o.offersIsSet() || !o.m_Offers.empty())
        j["offers"] = o.m_Offers;
    if(o.offlineOffersIsSet())
        j["offlineOffers"] = o.m_OfflineOffers;
    if(o.onlineOffersIsSet())
        j["onlineOffers"] = o.m_OnlineOffers;
    
}

void from_json(const nlohmann::json& j, EnrichedModelDTO& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("prices") != j.end())
    {
        j.at("prices").get_to(o.m_Prices);
        o.m_PricesIsSet = true;
    } 
    if(j.find("offers") != j.end())
    {
        j.at("offers").get_to(o.m_Offers);
        o.m_OffersIsSet = true;
    } 
    if(j.find("offlineOffers") != j.end())
    {
        j.at("offlineOffers").get_to(o.m_OfflineOffers);
        o.m_OfflineOffersIsSet = true;
    } 
    if(j.find("onlineOffers") != j.end())
    {
        j.at("onlineOffers").get_to(o.m_OnlineOffers);
        o.m_OnlineOffersIsSet = true;
    } 
    
}

int64_t EnrichedModelDTO::getId() const
{
    return m_Id;
}
void EnrichedModelDTO::setId(int64_t const value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool EnrichedModelDTO::idIsSet() const
{
    return m_IdIsSet;
}
void EnrichedModelDTO::unsetId()
{
    m_IdIsSet = false;
}
std::string EnrichedModelDTO::getName() const
{
    return m_Name;
}
void EnrichedModelDTO::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool EnrichedModelDTO::nameIsSet() const
{
    return m_NameIsSet;
}
void EnrichedModelDTO::unsetName()
{
    m_NameIsSet = false;
}
org::openapitools::server::model::ModelPriceDTO EnrichedModelDTO::getPrices() const
{
    return m_Prices;
}
void EnrichedModelDTO::setPrices(org::openapitools::server::model::ModelPriceDTO const& value)
{
    m_Prices = value;
    m_PricesIsSet = true;
}
bool EnrichedModelDTO::pricesIsSet() const
{
    return m_PricesIsSet;
}
void EnrichedModelDTO::unsetPrices()
{
    m_PricesIsSet = false;
}
std::vector<org::openapitools::server::model::ModelOfferDTO> EnrichedModelDTO::getOffers() const
{
    return m_Offers;
}
void EnrichedModelDTO::setOffers(std::vector<org::openapitools::server::model::ModelOfferDTO> const& value)
{
    m_Offers = value;
    m_OffersIsSet = true;
}
bool EnrichedModelDTO::offersIsSet() const
{
    return m_OffersIsSet;
}
void EnrichedModelDTO::unsetOffers()
{
    m_OffersIsSet = false;
}
int32_t EnrichedModelDTO::getOfflineOffers() const
{
    return m_OfflineOffers;
}
void EnrichedModelDTO::setOfflineOffers(int32_t const value)
{
    m_OfflineOffers = value;
    m_OfflineOffersIsSet = true;
}
bool EnrichedModelDTO::offlineOffersIsSet() const
{
    return m_OfflineOffersIsSet;
}
void EnrichedModelDTO::unsetOfflineOffers()
{
    m_OfflineOffersIsSet = false;
}
int32_t EnrichedModelDTO::getOnlineOffers() const
{
    return m_OnlineOffers;
}
void EnrichedModelDTO::setOnlineOffers(int32_t const value)
{
    m_OnlineOffers = value;
    m_OnlineOffersIsSet = true;
}
bool EnrichedModelDTO::onlineOffersIsSet() const
{
    return m_OnlineOffersIsSet;
}
void EnrichedModelDTO::unsetOnlineOffers()
{
    m_OnlineOffersIsSet = false;
}


} // namespace org::openapitools::server::model

