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


#include "FeedIndexLogsIndexType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

FeedIndexLogsIndexType::FeedIndexLogsIndexType()
{
    
}

void FeedIndexLogsIndexType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool FeedIndexLogsIndexType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool FeedIndexLogsIndexType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "FeedIndexLogsIndexType" : pathPrefix;

    
    if (m_value == FeedIndexLogsIndexType::eFeedIndexLogsIndexType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool FeedIndexLogsIndexType::operator==(const FeedIndexLogsIndexType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool FeedIndexLogsIndexType::operator!=(const FeedIndexLogsIndexType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const FeedIndexLogsIndexType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case FeedIndexLogsIndexType::eFeedIndexLogsIndexType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case FeedIndexLogsIndexType::eFeedIndexLogsIndexType::DIFF:
            j = "DIFF";
            break;
        case FeedIndexLogsIndexType::eFeedIndexLogsIndexType::FAST_PRICE:
            j = "FAST_PRICE";
            break;
        case FeedIndexLogsIndexType::eFeedIndexLogsIndexType::FULL:
            j = "FULL";
            break;
    }
}

void from_json(const nlohmann::json& j, FeedIndexLogsIndexType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "DIFF") {
     o.setValue(FeedIndexLogsIndexType::eFeedIndexLogsIndexType::DIFF);
    } 
    else if (s == "FAST_PRICE") {
     o.setValue(FeedIndexLogsIndexType::eFeedIndexLogsIndexType::FAST_PRICE);
    } 
    else if (s == "FULL") {
     o.setValue(FeedIndexLogsIndexType::eFeedIndexLogsIndexType::FULL);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " FeedIndexLogsIndexType::eFeedIndexLogsIndexType";
     throw std::invalid_argument(ss.str());
    } 

}

FeedIndexLogsIndexType::eFeedIndexLogsIndexType FeedIndexLogsIndexType::getValue() const
{
    return m_value;
}
void FeedIndexLogsIndexType::setValue(FeedIndexLogsIndexType::eFeedIndexLogsIndexType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

