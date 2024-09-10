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


#include "ShipmentStatusType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

ShipmentStatusType::ShipmentStatusType()
{
    
}

void ShipmentStatusType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ShipmentStatusType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ShipmentStatusType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ShipmentStatusType" : pathPrefix;

    
    if (m_value == ShipmentStatusType::eShipmentStatusType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool ShipmentStatusType::operator==(const ShipmentStatusType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool ShipmentStatusType::operator!=(const ShipmentStatusType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ShipmentStatusType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case ShipmentStatusType::eShipmentStatusType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case ShipmentStatusType::eShipmentStatusType::OUTBOUND_CREATED:
            j = "OUTBOUND_CREATED";
            break;
        case ShipmentStatusType::eShipmentStatusType::OUTBOUND_READY_FOR_CONFIRMATION:
            j = "OUTBOUND_READY_FOR_CONFIRMATION";
            break;
        case ShipmentStatusType::eShipmentStatusType::OUTBOUND_CONFIRMED:
            j = "OUTBOUND_CONFIRMED";
            break;
        case ShipmentStatusType::eShipmentStatusType::OUTBOUND_SIGNED:
            j = "OUTBOUND_SIGNED";
            break;
        case ShipmentStatusType::eShipmentStatusType::FINISHED:
            j = "FINISHED";
            break;
        case ShipmentStatusType::eShipmentStatusType::ACCEPTED:
            j = "ACCEPTED";
            break;
        case ShipmentStatusType::eShipmentStatusType::ACCEPTED_WITH_DISCREPANCIES:
            j = "ACCEPTED_WITH_DISCREPANCIES";
            break;
        case ShipmentStatusType::eShipmentStatusType::ERROR:
            j = "ERROR";
            break;
    }
}

void from_json(const nlohmann::json& j, ShipmentStatusType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "OUTBOUND_CREATED") {
     o.setValue(ShipmentStatusType::eShipmentStatusType::OUTBOUND_CREATED);
    } 
    else if (s == "OUTBOUND_READY_FOR_CONFIRMATION") {
     o.setValue(ShipmentStatusType::eShipmentStatusType::OUTBOUND_READY_FOR_CONFIRMATION);
    } 
    else if (s == "OUTBOUND_CONFIRMED") {
     o.setValue(ShipmentStatusType::eShipmentStatusType::OUTBOUND_CONFIRMED);
    } 
    else if (s == "OUTBOUND_SIGNED") {
     o.setValue(ShipmentStatusType::eShipmentStatusType::OUTBOUND_SIGNED);
    } 
    else if (s == "FINISHED") {
     o.setValue(ShipmentStatusType::eShipmentStatusType::FINISHED);
    } 
    else if (s == "ACCEPTED") {
     o.setValue(ShipmentStatusType::eShipmentStatusType::ACCEPTED);
    } 
    else if (s == "ACCEPTED_WITH_DISCREPANCIES") {
     o.setValue(ShipmentStatusType::eShipmentStatusType::ACCEPTED_WITH_DISCREPANCIES);
    } 
    else if (s == "ERROR") {
     o.setValue(ShipmentStatusType::eShipmentStatusType::ERROR);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " ShipmentStatusType::eShipmentStatusType";
     throw std::invalid_argument(ss.str());
    } 

}

ShipmentStatusType::eShipmentStatusType ShipmentStatusType::getValue() const
{
    return m_value;
}
void ShipmentStatusType::setValue(ShipmentStatusType::eShipmentStatusType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

