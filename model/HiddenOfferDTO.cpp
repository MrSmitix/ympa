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


#include "HiddenOfferDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

HiddenOfferDTO::HiddenOfferDTO()
{
    m_OfferId = "";
    
}

void HiddenOfferDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool HiddenOfferDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool HiddenOfferDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "HiddenOfferDTO" : pathPrefix;

         
    
    /* OfferId */ {
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
    
    return success;
}

bool HiddenOfferDTO::operator==(const HiddenOfferDTO& rhs) const
{
    return
    
    
    (getOfferId() == rhs.getOfferId())
    
    
    ;
}

bool HiddenOfferDTO::operator!=(const HiddenOfferDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const HiddenOfferDTO& o)
{
    j = nlohmann::json::object();
    j["offerId"] = o.m_OfferId;
    
}

void from_json(const nlohmann::json& j, HiddenOfferDTO& o)
{
    j.at("offerId").get_to(o.m_OfferId);
    
}

std::string HiddenOfferDTO::getOfferId() const
{
    return m_OfferId;
}
void HiddenOfferDTO::setOfferId(std::string const& value)
{
    m_OfferId = value;
}


} // namespace org::openapitools::server::model

