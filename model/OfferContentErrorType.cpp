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


#include "OfferContentErrorType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

OfferContentErrorType::OfferContentErrorType()
{
    
}

void OfferContentErrorType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OfferContentErrorType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OfferContentErrorType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OfferContentErrorType" : pathPrefix;

    
    if (m_value == OfferContentErrorType::eOfferContentErrorType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool OfferContentErrorType::operator==(const OfferContentErrorType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool OfferContentErrorType::operator!=(const OfferContentErrorType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OfferContentErrorType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case OfferContentErrorType::eOfferContentErrorType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case OfferContentErrorType::eOfferContentErrorType::OFFER_NOT_FOUND:
            j = "OFFER_NOT_FOUND";
            break;
        case OfferContentErrorType::eOfferContentErrorType::UNKNOWN_CATEGORY:
            j = "UNKNOWN_CATEGORY";
            break;
        case OfferContentErrorType::eOfferContentErrorType::CATEGORY_MISMATCH:
            j = "CATEGORY_MISMATCH";
            break;
        case OfferContentErrorType::eOfferContentErrorType::UNKNOWN_PARAMETER:
            j = "UNKNOWN_PARAMETER";
            break;
        case OfferContentErrorType::eOfferContentErrorType::UNEXPECTED_BOOLEAN_VALUE:
            j = "UNEXPECTED_BOOLEAN_VALUE";
            break;
        case OfferContentErrorType::eOfferContentErrorType::NUMBER_FORMAT:
            j = "NUMBER_FORMAT";
            break;
        case OfferContentErrorType::eOfferContentErrorType::VALUE_BLANK:
            j = "VALUE_BLANK";
            break;
        case OfferContentErrorType::eOfferContentErrorType::INVALID_UNIT_ID:
            j = "INVALID_UNIT_ID";
            break;
        case OfferContentErrorType::eOfferContentErrorType::INVALID_GROUP_ID_LENGTH:
            j = "INVALID_GROUP_ID_LENGTH";
            break;
        case OfferContentErrorType::eOfferContentErrorType::INVALID_GROUP_ID_CHARACTERS:
            j = "INVALID_GROUP_ID_CHARACTERS";
            break;
    }
}

void from_json(const nlohmann::json& j, OfferContentErrorType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "OFFER_NOT_FOUND") {
     o.setValue(OfferContentErrorType::eOfferContentErrorType::OFFER_NOT_FOUND);
    } 
    else if (s == "UNKNOWN_CATEGORY") {
     o.setValue(OfferContentErrorType::eOfferContentErrorType::UNKNOWN_CATEGORY);
    } 
    else if (s == "CATEGORY_MISMATCH") {
     o.setValue(OfferContentErrorType::eOfferContentErrorType::CATEGORY_MISMATCH);
    } 
    else if (s == "UNKNOWN_PARAMETER") {
     o.setValue(OfferContentErrorType::eOfferContentErrorType::UNKNOWN_PARAMETER);
    } 
    else if (s == "UNEXPECTED_BOOLEAN_VALUE") {
     o.setValue(OfferContentErrorType::eOfferContentErrorType::UNEXPECTED_BOOLEAN_VALUE);
    } 
    else if (s == "NUMBER_FORMAT") {
     o.setValue(OfferContentErrorType::eOfferContentErrorType::NUMBER_FORMAT);
    } 
    else if (s == "VALUE_BLANK") {
     o.setValue(OfferContentErrorType::eOfferContentErrorType::VALUE_BLANK);
    } 
    else if (s == "INVALID_UNIT_ID") {
     o.setValue(OfferContentErrorType::eOfferContentErrorType::INVALID_UNIT_ID);
    } 
    else if (s == "INVALID_GROUP_ID_LENGTH") {
     o.setValue(OfferContentErrorType::eOfferContentErrorType::INVALID_GROUP_ID_LENGTH);
    } 
    else if (s == "INVALID_GROUP_ID_CHARACTERS") {
     o.setValue(OfferContentErrorType::eOfferContentErrorType::INVALID_GROUP_ID_CHARACTERS);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " OfferContentErrorType::eOfferContentErrorType";
     throw std::invalid_argument(ss.str());
    } 

}

OfferContentErrorType::eOfferContentErrorType OfferContentErrorType::getValue() const
{
    return m_value;
}
void OfferContentErrorType::setValue(OfferContentErrorType::eOfferContentErrorType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

