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


#include "SkipGoodsFeedbackReactionRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

SkipGoodsFeedbackReactionRequest::SkipGoodsFeedbackReactionRequest()
{
    
}

void SkipGoodsFeedbackReactionRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool SkipGoodsFeedbackReactionRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool SkipGoodsFeedbackReactionRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "SkipGoodsFeedbackReactionRequest" : pathPrefix;

         
    
    /* FeedbackIds */ {
        const std::set<int64_t>& value = m_FeedbackIds;
        const std::string currentValuePath = _pathPrefix + ".feedbackIds";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 50)
        {
            success = false;
            msg << currentValuePath << ": must have at most 50 elements;";
        }
        if (!org::openapitools::server::helpers::hasOnlyUniqueItems(value))
        {
            success = false;
            msg << currentValuePath << ": may not contain the same item more than once;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const int64_t& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool SkipGoodsFeedbackReactionRequest::operator==(const SkipGoodsFeedbackReactionRequest& rhs) const
{
    return
    
    
    (getFeedbackIds() == rhs.getFeedbackIds())
    
    
    ;
}

bool SkipGoodsFeedbackReactionRequest::operator!=(const SkipGoodsFeedbackReactionRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const SkipGoodsFeedbackReactionRequest& o)
{
    j = nlohmann::json::object();
    j["feedbackIds"] = o.m_FeedbackIds;
    
}

void from_json(const nlohmann::json& j, SkipGoodsFeedbackReactionRequest& o)
{
    j.at("feedbackIds").get_to(o.m_FeedbackIds);
    
}

std::set<int64_t> SkipGoodsFeedbackReactionRequest::getFeedbackIds() const
{
    return m_FeedbackIds;
}
void SkipGoodsFeedbackReactionRequest::setFeedbackIds(std::set<int64_t> const value)
{
    m_FeedbackIds = value;
}


} // namespace org::openapitools::server::model

