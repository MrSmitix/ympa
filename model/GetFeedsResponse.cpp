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


#include "GetFeedsResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GetFeedsResponse::GetFeedsResponse()
{
    
}

void GetFeedsResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GetFeedsResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GetFeedsResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GetFeedsResponse" : pathPrefix;

         
    
    /* Feeds */ {
        const std::vector<org::openapitools::server::model::FeedDTO>& value = m_Feeds;
        const std::string currentValuePath = _pathPrefix + ".feeds";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::FeedDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".feeds") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool GetFeedsResponse::operator==(const GetFeedsResponse& rhs) const
{
    return
    
    
    (getFeeds() == rhs.getFeeds())
    
    
    ;
}

bool GetFeedsResponse::operator!=(const GetFeedsResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GetFeedsResponse& o)
{
    j = nlohmann::json::object();
    j["feeds"] = o.m_Feeds;
    
}

void from_json(const nlohmann::json& j, GetFeedsResponse& o)
{
    j.at("feeds").get_to(o.m_Feeds);
    
}

std::vector<org::openapitools::server::model::FeedDTO> GetFeedsResponse::getFeeds() const
{
    return m_Feeds;
}
void GetFeedsResponse::setFeeds(std::vector<org::openapitools::server::model::FeedDTO> const& value)
{
    m_Feeds = value;
}


} // namespace org::openapitools::server::model

