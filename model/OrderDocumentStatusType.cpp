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


#include "OrderDocumentStatusType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

OrderDocumentStatusType::OrderDocumentStatusType()
{
    
}

void OrderDocumentStatusType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OrderDocumentStatusType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OrderDocumentStatusType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OrderDocumentStatusType" : pathPrefix;

    
    if (m_value == OrderDocumentStatusType::eOrderDocumentStatusType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool OrderDocumentStatusType::operator==(const OrderDocumentStatusType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool OrderDocumentStatusType::operator!=(const OrderDocumentStatusType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OrderDocumentStatusType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case OrderDocumentStatusType::eOrderDocumentStatusType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case OrderDocumentStatusType::eOrderDocumentStatusType::READY:
            j = "READY";
            break;
        case OrderDocumentStatusType::eOrderDocumentStatusType::NOT_READY:
            j = "NOT_READY";
            break;
    }
}

void from_json(const nlohmann::json& j, OrderDocumentStatusType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "READY") {
     o.setValue(OrderDocumentStatusType::eOrderDocumentStatusType::READY);
    } 
    else if (s == "NOT_READY") {
     o.setValue(OrderDocumentStatusType::eOrderDocumentStatusType::NOT_READY);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " OrderDocumentStatusType::eOrderDocumentStatusType";
     throw std::invalid_argument(ss.str());
    } 

}

OrderDocumentStatusType::eOrderDocumentStatusType OrderDocumentStatusType::getValue() const
{
    return m_value;
}
void OrderDocumentStatusType::setValue(OrderDocumentStatusType::eOrderDocumentStatusType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

