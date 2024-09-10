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


#include "ChatMessageDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ChatMessageDTO::ChatMessageDTO()
{
    m_MessageId = 0L;
    m_CreatedAt = "";
    m_Message = "";
    m_MessageIsSet = false;
    m_PayloadIsSet = false;
    
}

void ChatMessageDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ChatMessageDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ChatMessageDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ChatMessageDTO" : pathPrefix;

                         
    if (payloadIsSet())
    {
        const std::vector<org::openapitools::server::model::ChatMessagePayloadDTO>& value = m_Payload;
        const std::string currentValuePath = _pathPrefix + ".payload";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ChatMessagePayloadDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".payload") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool ChatMessageDTO::operator==(const ChatMessageDTO& rhs) const
{
    return
    
    
    (getMessageId() == rhs.getMessageId())
     &&
    
    (getCreatedAt() == rhs.getCreatedAt())
     &&
    
    (getSender() == rhs.getSender())
     &&
    
    
    ((!messageIsSet() && !rhs.messageIsSet()) || (messageIsSet() && rhs.messageIsSet() && getMessage() == rhs.getMessage())) &&
    
    
    ((!payloadIsSet() && !rhs.payloadIsSet()) || (payloadIsSet() && rhs.payloadIsSet() && getPayload() == rhs.getPayload()))
    
    ;
}

bool ChatMessageDTO::operator!=(const ChatMessageDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ChatMessageDTO& o)
{
    j = nlohmann::json::object();
    j["messageId"] = o.m_MessageId;
    j["createdAt"] = o.m_CreatedAt;
    j["sender"] = o.m_Sender;
    if(o.messageIsSet())
        j["message"] = o.m_Message;
    if(o.payloadIsSet() || !o.m_Payload.empty())
        j["payload"] = o.m_Payload;
    
}

void from_json(const nlohmann::json& j, ChatMessageDTO& o)
{
    j.at("messageId").get_to(o.m_MessageId);
    j.at("createdAt").get_to(o.m_CreatedAt);
    j.at("sender").get_to(o.m_Sender);
    if(j.find("message") != j.end())
    {
        j.at("message").get_to(o.m_Message);
        o.m_MessageIsSet = true;
    } 
    if(j.find("payload") != j.end())
    {
        j.at("payload").get_to(o.m_Payload);
        o.m_PayloadIsSet = true;
    } 
    
}

int64_t ChatMessageDTO::getMessageId() const
{
    return m_MessageId;
}
void ChatMessageDTO::setMessageId(int64_t const value)
{
    m_MessageId = value;
}
std::string ChatMessageDTO::getCreatedAt() const
{
    return m_CreatedAt;
}
void ChatMessageDTO::setCreatedAt(std::string const& value)
{
    m_CreatedAt = value;
}
org::openapitools::server::model::ChatMessageSenderType ChatMessageDTO::getSender() const
{
    return m_Sender;
}
void ChatMessageDTO::setSender(org::openapitools::server::model::ChatMessageSenderType const& value)
{
    m_Sender = value;
}
std::string ChatMessageDTO::getMessage() const
{
    return m_Message;
}
void ChatMessageDTO::setMessage(std::string const& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool ChatMessageDTO::messageIsSet() const
{
    return m_MessageIsSet;
}
void ChatMessageDTO::unsetMessage()
{
    m_MessageIsSet = false;
}
std::vector<org::openapitools::server::model::ChatMessagePayloadDTO> ChatMessageDTO::getPayload() const
{
    return m_Payload;
}
void ChatMessageDTO::setPayload(std::vector<org::openapitools::server::model::ChatMessagePayloadDTO> const& value)
{
    m_Payload = value;
    m_PayloadIsSet = true;
}
bool ChatMessageDTO::payloadIsSet() const
{
    return m_PayloadIsSet;
}
void ChatMessageDTO::unsetPayload()
{
    m_PayloadIsSet = false;
}


} // namespace org::openapitools::server::model

