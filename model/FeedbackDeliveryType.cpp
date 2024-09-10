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


#include "FeedbackDeliveryType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

FeedbackDeliveryType::FeedbackDeliveryType()
{
    
}

void FeedbackDeliveryType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool FeedbackDeliveryType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool FeedbackDeliveryType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "FeedbackDeliveryType" : pathPrefix;

    
    if (m_value == FeedbackDeliveryType::eFeedbackDeliveryType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool FeedbackDeliveryType::operator==(const FeedbackDeliveryType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool FeedbackDeliveryType::operator!=(const FeedbackDeliveryType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const FeedbackDeliveryType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case FeedbackDeliveryType::eFeedbackDeliveryType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case FeedbackDeliveryType::eFeedbackDeliveryType::DELIVERY:
            j = "DELIVERY";
            break;
        case FeedbackDeliveryType::eFeedbackDeliveryType::PICKUP:
            j = "PICKUP";
            break;
        case FeedbackDeliveryType::eFeedbackDeliveryType::INSTORE:
            j = "INSTORE";
            break;
    }
}

void from_json(const nlohmann::json& j, FeedbackDeliveryType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "DELIVERY") {
     o.setValue(FeedbackDeliveryType::eFeedbackDeliveryType::DELIVERY);
    } 
    else if (s == "PICKUP") {
     o.setValue(FeedbackDeliveryType::eFeedbackDeliveryType::PICKUP);
    } 
    else if (s == "INSTORE") {
     o.setValue(FeedbackDeliveryType::eFeedbackDeliveryType::INSTORE);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " FeedbackDeliveryType::eFeedbackDeliveryType";
     throw std::invalid_argument(ss.str());
    } 

}

FeedbackDeliveryType::eFeedbackDeliveryType FeedbackDeliveryType::getValue() const
{
    return m_value;
}
void FeedbackDeliveryType::setValue(FeedbackDeliveryType::eFeedbackDeliveryType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

