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


#include "ChatMessagesResultDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ChatMessagesResultDTO::ChatMessagesResultDTO()
{
    m_OrderId = 0L;
    m_PagingIsSet = false;
    
}

void ChatMessagesResultDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ChatMessagesResultDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ChatMessagesResultDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ChatMessagesResultDTO" : pathPrefix;

             
    
    /* Messages */ {
        const std::vector<org::openapitools::server::model::ChatMessageDTO>& value = m_Messages;
        const std::string currentValuePath = _pathPrefix + ".messages";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ChatMessageDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".messages") && success;
 
                i++;
            }
        }

    }
        
    return success;
}

bool ChatMessagesResultDTO::operator==(const ChatMessagesResultDTO& rhs) const
{
    return
    
    
    (getOrderId() == rhs.getOrderId())
     &&
    
    (getMessages() == rhs.getMessages())
     &&
    
    
    ((!pagingIsSet() && !rhs.pagingIsSet()) || (pagingIsSet() && rhs.pagingIsSet() && getPaging() == rhs.getPaging()))
    
    ;
}

bool ChatMessagesResultDTO::operator!=(const ChatMessagesResultDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ChatMessagesResultDTO& o)
{
    j = nlohmann::json::object();
    j["orderId"] = o.m_OrderId;
    j["messages"] = o.m_Messages;
    if(o.pagingIsSet())
        j["paging"] = o.m_Paging;
    
}

void from_json(const nlohmann::json& j, ChatMessagesResultDTO& o)
{
    j.at("orderId").get_to(o.m_OrderId);
    j.at("messages").get_to(o.m_Messages);
    if(j.find("paging") != j.end())
    {
        j.at("paging").get_to(o.m_Paging);
        o.m_PagingIsSet = true;
    } 
    
}

int64_t ChatMessagesResultDTO::getOrderId() const
{
    return m_OrderId;
}
void ChatMessagesResultDTO::setOrderId(int64_t const value)
{
    m_OrderId = value;
}
std::vector<org::openapitools::server::model::ChatMessageDTO> ChatMessagesResultDTO::getMessages() const
{
    return m_Messages;
}
void ChatMessagesResultDTO::setMessages(std::vector<org::openapitools::server::model::ChatMessageDTO> const& value)
{
    m_Messages = value;
}
org::openapitools::server::model::ForwardScrollingPagerDTO ChatMessagesResultDTO::getPaging() const
{
    return m_Paging;
}
void ChatMessagesResultDTO::setPaging(org::openapitools::server::model::ForwardScrollingPagerDTO const& value)
{
    m_Paging = value;
    m_PagingIsSet = true;
}
bool ChatMessagesResultDTO::pagingIsSet() const
{
    return m_PagingIsSet;
}
void ChatMessagesResultDTO::unsetPaging()
{
    m_PagingIsSet = false;
}


} // namespace org::openapitools::server::model

