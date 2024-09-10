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


#include "ShipmentPalletLabelPageFormatType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

ShipmentPalletLabelPageFormatType::ShipmentPalletLabelPageFormatType()
{
    
}

void ShipmentPalletLabelPageFormatType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ShipmentPalletLabelPageFormatType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ShipmentPalletLabelPageFormatType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ShipmentPalletLabelPageFormatType" : pathPrefix;

    
    if (m_value == ShipmentPalletLabelPageFormatType::eShipmentPalletLabelPageFormatType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool ShipmentPalletLabelPageFormatType::operator==(const ShipmentPalletLabelPageFormatType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool ShipmentPalletLabelPageFormatType::operator!=(const ShipmentPalletLabelPageFormatType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ShipmentPalletLabelPageFormatType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case ShipmentPalletLabelPageFormatType::eShipmentPalletLabelPageFormatType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case ShipmentPalletLabelPageFormatType::eShipmentPalletLabelPageFormatType::A4:
            j = "A4";
            break;
        case ShipmentPalletLabelPageFormatType::eShipmentPalletLabelPageFormatType::A8:
            j = "A8";
            break;
    }
}

void from_json(const nlohmann::json& j, ShipmentPalletLabelPageFormatType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "A4") {
     o.setValue(ShipmentPalletLabelPageFormatType::eShipmentPalletLabelPageFormatType::A4);
    } 
    else if (s == "A8") {
     o.setValue(ShipmentPalletLabelPageFormatType::eShipmentPalletLabelPageFormatType::A8);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " ShipmentPalletLabelPageFormatType::eShipmentPalletLabelPageFormatType";
     throw std::invalid_argument(ss.str());
    } 

}

ShipmentPalletLabelPageFormatType::eShipmentPalletLabelPageFormatType ShipmentPalletLabelPageFormatType::getValue() const
{
    return m_value;
}
void ShipmentPalletLabelPageFormatType::setValue(ShipmentPalletLabelPageFormatType::eShipmentPalletLabelPageFormatType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

