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


#include "OrderStatusChangeDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OrderStatusChangeDTO::OrderStatusChangeDTO()
{
    m_SubstatusIsSet = false;
    m_DeliveryIsSet = false;
    
}

void OrderStatusChangeDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OrderStatusChangeDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OrderStatusChangeDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OrderStatusChangeDTO" : pathPrefix;

                
    return success;
}

bool OrderStatusChangeDTO::operator==(const OrderStatusChangeDTO& rhs) const
{
    return
    
    
    (getStatus() == rhs.getStatus())
     &&
    
    
    ((!substatusIsSet() && !rhs.substatusIsSet()) || (substatusIsSet() && rhs.substatusIsSet() && getSubstatus() == rhs.getSubstatus())) &&
    
    
    ((!deliveryIsSet() && !rhs.deliveryIsSet()) || (deliveryIsSet() && rhs.deliveryIsSet() && getDelivery() == rhs.getDelivery()))
    
    ;
}

bool OrderStatusChangeDTO::operator!=(const OrderStatusChangeDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OrderStatusChangeDTO& o)
{
    j = nlohmann::json::object();
    j["status"] = o.m_Status;
    if(o.substatusIsSet())
        j["substatus"] = o.m_Substatus;
    if(o.deliveryIsSet())
        j["delivery"] = o.m_Delivery;
    
}

void from_json(const nlohmann::json& j, OrderStatusChangeDTO& o)
{
    j.at("status").get_to(o.m_Status);
    if(j.find("substatus") != j.end())
    {
        j.at("substatus").get_to(o.m_Substatus);
        o.m_SubstatusIsSet = true;
    } 
    if(j.find("delivery") != j.end())
    {
        j.at("delivery").get_to(o.m_Delivery);
        o.m_DeliveryIsSet = true;
    } 
    
}

org::openapitools::server::model::OrderStatusType OrderStatusChangeDTO::getStatus() const
{
    return m_Status;
}
void OrderStatusChangeDTO::setStatus(org::openapitools::server::model::OrderStatusType const& value)
{
    m_Status = value;
}
org::openapitools::server::model::OrderSubstatusType OrderStatusChangeDTO::getSubstatus() const
{
    return m_Substatus;
}
void OrderStatusChangeDTO::setSubstatus(org::openapitools::server::model::OrderSubstatusType const& value)
{
    m_Substatus = value;
    m_SubstatusIsSet = true;
}
bool OrderStatusChangeDTO::substatusIsSet() const
{
    return m_SubstatusIsSet;
}
void OrderStatusChangeDTO::unsetSubstatus()
{
    m_SubstatusIsSet = false;
}
org::openapitools::server::model::OrderStatusChangeDeliveryDTO OrderStatusChangeDTO::getDelivery() const
{
    return m_Delivery;
}
void OrderStatusChangeDTO::setDelivery(org::openapitools::server::model::OrderStatusChangeDeliveryDTO const& value)
{
    m_Delivery = value;
    m_DeliveryIsSet = true;
}
bool OrderStatusChangeDTO::deliveryIsSet() const
{
    return m_DeliveryIsSet;
}
void OrderStatusChangeDTO::unsetDelivery()
{
    m_DeliveryIsSet = false;
}


} // namespace org::openapitools::server::model

