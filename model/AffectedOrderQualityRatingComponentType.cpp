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


#include "AffectedOrderQualityRatingComponentType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

AffectedOrderQualityRatingComponentType::AffectedOrderQualityRatingComponentType()
{
    
}

void AffectedOrderQualityRatingComponentType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AffectedOrderQualityRatingComponentType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AffectedOrderQualityRatingComponentType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AffectedOrderQualityRatingComponentType" : pathPrefix;

    
    if (m_value == AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool AffectedOrderQualityRatingComponentType::operator==(const AffectedOrderQualityRatingComponentType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool AffectedOrderQualityRatingComponentType::operator!=(const AffectedOrderQualityRatingComponentType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AffectedOrderQualityRatingComponentType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::DBS_CANCELLATION_RATE:
            j = "DBS_CANCELLATION_RATE";
            break;
        case AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::DBS_LATE_DELIVERY_RATE:
            j = "DBS_LATE_DELIVERY_RATE";
            break;
        case AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::FBS_CANCELLATION_RATE:
            j = "FBS_CANCELLATION_RATE";
            break;
        case AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::FBS_LATE_SHIP_RATE:
            j = "FBS_LATE_SHIP_RATE";
            break;
    }
}

void from_json(const nlohmann::json& j, AffectedOrderQualityRatingComponentType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "DBS_CANCELLATION_RATE") {
     o.setValue(AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::DBS_CANCELLATION_RATE);
    } 
    else if (s == "DBS_LATE_DELIVERY_RATE") {
     o.setValue(AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::DBS_LATE_DELIVERY_RATE);
    } 
    else if (s == "FBS_CANCELLATION_RATE") {
     o.setValue(AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::FBS_CANCELLATION_RATE);
    } 
    else if (s == "FBS_LATE_SHIP_RATE") {
     o.setValue(AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::FBS_LATE_SHIP_RATE);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType";
     throw std::invalid_argument(ss.str());
    } 

}

AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType AffectedOrderQualityRatingComponentType::getValue() const
{
    return m_value;
}
void AffectedOrderQualityRatingComponentType::setValue(AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

