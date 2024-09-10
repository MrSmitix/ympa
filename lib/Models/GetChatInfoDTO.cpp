

#include "GetChatInfoDTO.h"

using namespace Tiny;

GetChatInfoDTO::GetChatInfoDTO()
{
	chatId = long(0);
	orderId = long(0);
	type = ChatType();
	status = ChatStatusType();
	createdAt = std::string();
	updatedAt = std::string();
}

GetChatInfoDTO::GetChatInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetChatInfoDTO::~GetChatInfoDTO()
{

}

void
GetChatInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *chatIdKey = "chatId";

    if(object.has_key(chatIdKey))
    {
        bourne::json value = object[chatIdKey];



        jsonToValue(&chatId, value, "long");


    }

    const char *orderIdKey = "orderId";

    if(object.has_key(orderIdKey))
    {
        bourne::json value = object[orderIdKey];



        jsonToValue(&orderId, value, "long");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        ChatType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ChatStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *createdAtKey = "createdAt";

    if(object.has_key(createdAtKey))
    {
        bourne::json value = object[createdAtKey];



        jsonToValue(&createdAt, value, "std::string");


    }

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }


}

bourne::json
GetChatInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["chatId"] = getChatId();






    object["orderId"] = getOrderId();







	object["type"] = getType().toJson();






	object["status"] = getStatus().toJson();





    object["createdAt"] = getCreatedAt();






    object["updatedAt"] = getUpdatedAt();



    return object;

}

long
GetChatInfoDTO::getChatId()
{
	return chatId;
}

void
GetChatInfoDTO::setChatId(long  chatId)
{
	this->chatId = chatId;
}

long
GetChatInfoDTO::getOrderId()
{
	return orderId;
}

void
GetChatInfoDTO::setOrderId(long  orderId)
{
	this->orderId = orderId;
}

ChatType
GetChatInfoDTO::getType()
{
	return type;
}

void
GetChatInfoDTO::setType(ChatType  type)
{
	this->type = type;
}

ChatStatusType
GetChatInfoDTO::getStatus()
{
	return status;
}

void
GetChatInfoDTO::setStatus(ChatStatusType  status)
{
	this->status = status;
}

std::string
GetChatInfoDTO::getCreatedAt()
{
	return createdAt;
}

void
GetChatInfoDTO::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

std::string
GetChatInfoDTO::getUpdatedAt()
{
	return updatedAt;
}

void
GetChatInfoDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}



