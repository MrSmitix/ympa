

#include "ChatMessageDTO.h"

using namespace Tiny;

ChatMessageDTO::ChatMessageDTO()
{
	messageId = long(0);
	createdAt = std::string();
	sender = ChatMessageSenderType();
	message = std::string();
	payload = std::list<ChatMessagePayloadDTO>();
}

ChatMessageDTO::ChatMessageDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatMessageDTO::~ChatMessageDTO()
{

}

void
ChatMessageDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messageIdKey = "messageId";

    if(object.has_key(messageIdKey))
    {
        bourne::json value = object[messageIdKey];



        jsonToValue(&messageId, value, "long");


    }

    const char *createdAtKey = "createdAt";

    if(object.has_key(createdAtKey))
    {
        bourne::json value = object[createdAtKey];



        jsonToValue(&createdAt, value, "std::string");


    }

    const char *senderKey = "sender";

    if(object.has_key(senderKey))
    {
        bourne::json value = object[senderKey];




        ChatMessageSenderType* obj = &sender;
		obj->fromJson(value.dump());

    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *payloadKey = "payload";

    if(object.has_key(payloadKey))
    {
        bourne::json value = object[payloadKey];


        std::list<ChatMessagePayloadDTO> payload_list;
        ChatMessagePayloadDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            payload_list.push_back(element);
        }
        payload = payload_list;


    }


}

bourne::json
ChatMessageDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["messageId"] = getMessageId();






    object["createdAt"] = getCreatedAt();







	object["sender"] = getSender().toJson();





    object["message"] = getMessage();





    std::list<ChatMessagePayloadDTO> payload_list = getPayload();
    bourne::json payload_arr = bourne::json::array();

    for(auto& var : payload_list)
    {
        ChatMessagePayloadDTO obj = var;
        payload_arr.append(obj.toJson());
    }
    object["payload"] = payload_arr;




    return object;

}

long
ChatMessageDTO::getMessageId()
{
	return messageId;
}

void
ChatMessageDTO::setMessageId(long  messageId)
{
	this->messageId = messageId;
}

std::string
ChatMessageDTO::getCreatedAt()
{
	return createdAt;
}

void
ChatMessageDTO::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

ChatMessageSenderType
ChatMessageDTO::getSender()
{
	return sender;
}

void
ChatMessageDTO::setSender(ChatMessageSenderType  sender)
{
	this->sender = sender;
}

std::string
ChatMessageDTO::getMessage()
{
	return message;
}

void
ChatMessageDTO::setMessage(std::string  message)
{
	this->message = message;
}

std::list<ChatMessagePayloadDTO>
ChatMessageDTO::getPayload()
{
	return payload;
}

void
ChatMessageDTO::setPayload(std::list <ChatMessagePayloadDTO> payload)
{
	this->payload = payload;
}



