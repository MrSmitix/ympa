

#include "CreateChatResponse.h"

using namespace Tiny;

CreateChatResponse::CreateChatResponse()
{
	status = ApiResponseStatusType();
	result = CreateChatResultDTO();
}

CreateChatResponse::CreateChatResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatResponse::~CreateChatResponse()
{

}

void
CreateChatResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ApiResponseStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *resultKey = "result";

    if(object.has_key(resultKey))
    {
        bourne::json value = object[resultKey];




        CreateChatResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateChatResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
CreateChatResponse::getStatus()
{
	return status;
}

void
CreateChatResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

CreateChatResultDTO
CreateChatResponse::getResult()
{
	return result;
}

void
CreateChatResponse::setResult(CreateChatResultDTO  result)
{
	this->result = result;
}



