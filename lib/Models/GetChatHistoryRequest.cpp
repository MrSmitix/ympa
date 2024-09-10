

#include "GetChatHistoryRequest.h"

using namespace Tiny;

GetChatHistoryRequest::GetChatHistoryRequest()
{
	messageIdFrom = long(0);
}

GetChatHistoryRequest::GetChatHistoryRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetChatHistoryRequest::~GetChatHistoryRequest()
{

}

void
GetChatHistoryRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messageIdFromKey = "messageIdFrom";

    if(object.has_key(messageIdFromKey))
    {
        bourne::json value = object[messageIdFromKey];



        jsonToValue(&messageIdFrom, value, "long");


    }


}

bourne::json
GetChatHistoryRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["messageIdFrom"] = getMessageIdFrom();



    return object;

}

long
GetChatHistoryRequest::getMessageIdFrom()
{
	return messageIdFrom;
}

void
GetChatHistoryRequest::setMessageIdFrom(long  messageIdFrom)
{
	this->messageIdFrom = messageIdFrom;
}



