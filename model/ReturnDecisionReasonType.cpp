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


#include "ReturnDecisionReasonType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

ReturnDecisionReasonType::ReturnDecisionReasonType()
{
    
}

void ReturnDecisionReasonType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ReturnDecisionReasonType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ReturnDecisionReasonType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ReturnDecisionReasonType" : pathPrefix;

    
    if (m_value == ReturnDecisionReasonType::eReturnDecisionReasonType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool ReturnDecisionReasonType::operator==(const ReturnDecisionReasonType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool ReturnDecisionReasonType::operator!=(const ReturnDecisionReasonType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ReturnDecisionReasonType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case ReturnDecisionReasonType::eReturnDecisionReasonType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case ReturnDecisionReasonType::eReturnDecisionReasonType::BAD_QUALITY:
            j = "BAD_QUALITY";
            break;
        case ReturnDecisionReasonType::eReturnDecisionReasonType::DOES_NOT_FIT:
            j = "DOES_NOT_FIT";
            break;
        case ReturnDecisionReasonType::eReturnDecisionReasonType::WRONG_ITEM:
            j = "WRONG_ITEM";
            break;
        case ReturnDecisionReasonType::eReturnDecisionReasonType::DAMAGE_DELIVERY:
            j = "DAMAGE_DELIVERY";
            break;
        case ReturnDecisionReasonType::eReturnDecisionReasonType::LOYALTY_FAIL:
            j = "LOYALTY_FAIL";
            break;
        case ReturnDecisionReasonType::eReturnDecisionReasonType::CONTENT_FAIL:
            j = "CONTENT_FAIL";
            break;
        case ReturnDecisionReasonType::eReturnDecisionReasonType::UNKNOWN:
            j = "UNKNOWN";
            break;
    }
}

void from_json(const nlohmann::json& j, ReturnDecisionReasonType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "BAD_QUALITY") {
     o.setValue(ReturnDecisionReasonType::eReturnDecisionReasonType::BAD_QUALITY);
    } 
    else if (s == "DOES_NOT_FIT") {
     o.setValue(ReturnDecisionReasonType::eReturnDecisionReasonType::DOES_NOT_FIT);
    } 
    else if (s == "WRONG_ITEM") {
     o.setValue(ReturnDecisionReasonType::eReturnDecisionReasonType::WRONG_ITEM);
    } 
    else if (s == "DAMAGE_DELIVERY") {
     o.setValue(ReturnDecisionReasonType::eReturnDecisionReasonType::DAMAGE_DELIVERY);
    } 
    else if (s == "LOYALTY_FAIL") {
     o.setValue(ReturnDecisionReasonType::eReturnDecisionReasonType::LOYALTY_FAIL);
    } 
    else if (s == "CONTENT_FAIL") {
     o.setValue(ReturnDecisionReasonType::eReturnDecisionReasonType::CONTENT_FAIL);
    } 
    else if (s == "UNKNOWN") {
     o.setValue(ReturnDecisionReasonType::eReturnDecisionReasonType::UNKNOWN);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " ReturnDecisionReasonType::eReturnDecisionReasonType";
     throw std::invalid_argument(ss.str());
    } 

}

ReturnDecisionReasonType::eReturnDecisionReasonType ReturnDecisionReasonType::getValue() const
{
    return m_value;
}
void ReturnDecisionReasonType::setValue(ReturnDecisionReasonType::eReturnDecisionReasonType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

