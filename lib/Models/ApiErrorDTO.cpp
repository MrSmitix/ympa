

#include "ApiErrorDTO.h"

using namespace Tiny;

ApiErrorDTO::ApiErrorDTO()
{
	code = std::string();
	message = std::string();
}

ApiErrorDTO::ApiErrorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ApiErrorDTO::~ApiErrorDTO()
{

}

void
ApiErrorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "std::string");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
ApiErrorDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

std::string
ApiErrorDTO::getCode()
{
	return code;
}

void
ApiErrorDTO::setCode(std::string  code)
{
	this->code = code;
}

std::string
ApiErrorDTO::getMessage()
{
	return message;
}

void
ApiErrorDTO::setMessage(std::string  message)
{
	this->message = message;
}



