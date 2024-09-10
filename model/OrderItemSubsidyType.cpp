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


#include "OrderItemSubsidyType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

OrderItemSubsidyType::OrderItemSubsidyType()
{
    
}

void OrderItemSubsidyType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OrderItemSubsidyType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OrderItemSubsidyType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OrderItemSubsidyType" : pathPrefix;

    
    if (m_value == OrderItemSubsidyType::eOrderItemSubsidyType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool OrderItemSubsidyType::operator==(const OrderItemSubsidyType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool OrderItemSubsidyType::operator!=(const OrderItemSubsidyType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OrderItemSubsidyType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case OrderItemSubsidyType::eOrderItemSubsidyType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case OrderItemSubsidyType::eOrderItemSubsidyType::YANDEX_CASHBACK:
            j = "YANDEX_CASHBACK";
            break;
        case OrderItemSubsidyType::eOrderItemSubsidyType::SUBSIDY:
            j = "SUBSIDY";
            break;
    }
}

void from_json(const nlohmann::json& j, OrderItemSubsidyType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "YANDEX_CASHBACK") {
     o.setValue(OrderItemSubsidyType::eOrderItemSubsidyType::YANDEX_CASHBACK);
    } 
    else if (s == "SUBSIDY") {
     o.setValue(OrderItemSubsidyType::eOrderItemSubsidyType::SUBSIDY);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " OrderItemSubsidyType::eOrderItemSubsidyType";
     throw std::invalid_argument(ss.str());
    } 

}

OrderItemSubsidyType::eOrderItemSubsidyType OrderItemSubsidyType::getValue() const
{
    return m_value;
}
void OrderItemSubsidyType::setValue(OrderItemSubsidyType::eOrderItemSubsidyType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

