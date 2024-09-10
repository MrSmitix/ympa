

#include "SendMessageToChatRequest.h"

using namespace Tiny;

SendMessageToChatRequest::SendMessageToChatRequest()
{
	message = std::string();
}

SendMessageToChatRequest::SendMessageToChatRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SendMessageToChatRequest::~SendMessageToChatRequest()
{

}

void
SendMessageToChatRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
SendMessageToChatRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["message"] = getMessage();



    return object;

}

std::string
SendMessageToChatRequest::getMessage()
{
	return message;
}

void
SendMessageToChatRequest::setMessage(std::string  message)
{
	this->message = message;
}



