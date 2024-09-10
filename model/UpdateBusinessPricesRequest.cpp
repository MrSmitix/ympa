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


#include "UpdateBusinessPricesRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

UpdateBusinessPricesRequest::UpdateBusinessPricesRequest()
{
    
}

void UpdateBusinessPricesRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool UpdateBusinessPricesRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool UpdateBusinessPricesRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "UpdateBusinessPricesRequest" : pathPrefix;

         
    
    /* Offers */ {
        const std::vector<org::openapitools::server::model::UpdateBusinessOfferPriceDTO>& value = m_Offers;
        const std::string currentValuePath = _pathPrefix + ".offers";
                
        
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
            for (const org::openapitools::server::model::UpdateBusinessOfferPriceDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".offers") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool UpdateBusinessPricesRequest::operator==(const UpdateBusinessPricesRequest& rhs) const
{
    return
    
    
    (getOffers() == rhs.getOffers())
    
    
    ;
}

bool UpdateBusinessPricesRequest::operator!=(const UpdateBusinessPricesRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const UpdateBusinessPricesRequest& o)
{
    j = nlohmann::json::object();
    j["offers"] = o.m_Offers;
    
}

void from_json(const nlohmann::json& j, UpdateBusinessPricesRequest& o)
{
    j.at("offers").get_to(o.m_Offers);
    
}

std::vector<org::openapitools::server::model::UpdateBusinessOfferPriceDTO> UpdateBusinessPricesRequest::getOffers() const
{
    return m_Offers;
}
void UpdateBusinessPricesRequest::setOffers(std::vector<org::openapitools::server::model::UpdateBusinessOfferPriceDTO> const& value)
{
    m_Offers = value;
}


} // namespace org::openapitools::server::model

