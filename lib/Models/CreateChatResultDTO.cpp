

#include "CreateChatResultDTO.h"

using namespace Tiny;

CreateChatResultDTO::CreateChatResultDTO()
{
	chatId = long(0);
}

CreateChatResultDTO::CreateChatResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatResultDTO::~CreateChatResultDTO()
{

}

void
CreateChatResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *chatIdKey = "chatId";

    if(object.has_key(chatIdKey))
    {
        bourne::json value = object[chatIdKey];



        jsonToValue(&chatId, value, "long");


    }


}

bourne::json
CreateChatResultDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["chatId"] = getChatId();



    return object;

}

long
CreateChatResultDTO::getChatId()
{
	return chatId;
}

void
CreateChatResultDTO::setChatId(long  chatId)
{
	this->chatId = chatId;
}



