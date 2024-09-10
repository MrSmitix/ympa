

#include "GetChatsResponse.h"

using namespace Tiny;

GetChatsResponse::GetChatsResponse()
{
	status = ApiResponseStatusType();
	result = GetChatsInfoDTO();
}

GetChatsResponse::GetChatsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetChatsResponse::~GetChatsResponse()
{

}

void
GetChatsResponse::fromJson(std::string jsonObj)
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




        GetChatsInfoDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetChatsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetChatsResponse::getStatus()
{
	return status;
}

void
GetChatsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetChatsInfoDTO
GetChatsResponse::getResult()
{
	return result;
}

void
GetChatsResponse::setResult(GetChatsInfoDTO  result)
{
	this->result = result;
}



