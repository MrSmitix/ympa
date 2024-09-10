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


#include "DeleteHiddenOffersRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

DeleteHiddenOffersRequest::DeleteHiddenOffersRequest()
{
    
}

void DeleteHiddenOffersRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool DeleteHiddenOffersRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool DeleteHiddenOffersRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "DeleteHiddenOffersRequest" : pathPrefix;

         
    
    /* HiddenOffers */ {
        const std::vector<org::openapitools::server::model::HiddenOfferDTO>& value = m_HiddenOffers;
        const std::string currentValuePath = _pathPrefix + ".hiddenOffers";
                
        
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
            for (const org::openapitools::server::model::HiddenOfferDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".hiddenOffers") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool DeleteHiddenOffersRequest::operator==(const DeleteHiddenOffersRequest& rhs) const
{
    return
    
    
    (getHiddenOffers() == rhs.getHiddenOffers())
    
    
    ;
}

bool DeleteHiddenOffersRequest::operator!=(const DeleteHiddenOffersRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const DeleteHiddenOffersRequest& o)
{
    j = nlohmann::json::object();
    j["hiddenOffers"] = o.m_HiddenOffers;
    
}

void from_json(const nlohmann::json& j, DeleteHiddenOffersRequest& o)
{
    j.at("hiddenOffers").get_to(o.m_HiddenOffers);
    
}

std::vector<org::openapitools::server::model::HiddenOfferDTO> DeleteHiddenOffersRequest::getHiddenOffers() const
{
    return m_HiddenOffers;
}
void DeleteHiddenOffersRequest::setHiddenOffers(std::vector<org::openapitools::server::model::HiddenOfferDTO> const& value)
{
    m_HiddenOffers = value;
}


} // namespace org::openapitools::server::model

