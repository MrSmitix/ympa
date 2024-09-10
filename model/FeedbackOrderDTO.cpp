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


#include "FeedbackOrderDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

FeedbackOrderDTO::FeedbackOrderDTO()
{
    m_ShopOrderId = "";
    m_ShopOrderIdIsSet = false;
    m_DeliveryIsSet = false;
    
}

void FeedbackOrderDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool FeedbackOrderDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool FeedbackOrderDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "FeedbackOrderDTO" : pathPrefix;

            
    return success;
}

bool FeedbackOrderDTO::operator==(const FeedbackOrderDTO& rhs) const
{
    return
    
    
    
    ((!shopOrderIdIsSet() && !rhs.shopOrderIdIsSet()) || (shopOrderIdIsSet() && rhs.shopOrderIdIsSet() && getShopOrderId() == rhs.getShopOrderId())) &&
    
    
    ((!deliveryIsSet() && !rhs.deliveryIsSet()) || (deliveryIsSet() && rhs.deliveryIsSet() && getDelivery() == rhs.getDelivery()))
    
    ;
}

bool FeedbackOrderDTO::operator!=(const FeedbackOrderDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const FeedbackOrderDTO& o)
{
    j = nlohmann::json::object();
    if(o.shopOrderIdIsSet())
        j["shopOrderId"] = o.m_ShopOrderId;
    if(o.deliveryIsSet())
        j["delivery"] = o.m_Delivery;
    
}

void from_json(const nlohmann::json& j, FeedbackOrderDTO& o)
{
    if(j.find("shopOrderId") != j.end())
    {
        j.at("shopOrderId").get_to(o.m_ShopOrderId);
        o.m_ShopOrderIdIsSet = true;
    } 
    if(j.find("delivery") != j.end())
    {
        j.at("delivery").get_to(o.m_Delivery);
        o.m_DeliveryIsSet = true;
    } 
    
}

std::string FeedbackOrderDTO::getShopOrderId() const
{
    return m_ShopOrderId;
}
void FeedbackOrderDTO::setShopOrderId(std::string const& value)
{
    m_ShopOrderId = value;
    m_ShopOrderIdIsSet = true;
}
bool FeedbackOrderDTO::shopOrderIdIsSet() const
{
    return m_ShopOrderIdIsSet;
}
void FeedbackOrderDTO::unsetShopOrderId()
{
    m_ShopOrderIdIsSet = false;
}
org::openapitools::server::model::FeedbackDeliveryType FeedbackOrderDTO::getDelivery() const
{
    return m_Delivery;
}
void FeedbackOrderDTO::setDelivery(org::openapitools::server::model::FeedbackDeliveryType const& value)
{
    m_Delivery = value;
    m_DeliveryIsSet = true;
}
bool FeedbackOrderDTO::deliveryIsSet() const
{
    return m_DeliveryIsSet;
}
void FeedbackOrderDTO::unsetDelivery()
{
    m_DeliveryIsSet = false;
}


} // namespace org::openapitools::server::model

