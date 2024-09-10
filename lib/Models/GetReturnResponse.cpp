

#include "GetReturnResponse.h"

using namespace Tiny;

GetReturnResponse::GetReturnResponse()
{
	status = ApiResponseStatusType();
	result = ReturnDTO();
}

GetReturnResponse::GetReturnResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetReturnResponse::~GetReturnResponse()
{

}

void
GetReturnResponse::fromJson(std::string jsonObj)
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




        ReturnDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetReturnResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetReturnResponse::getStatus()
{
	return status;
}

void
GetReturnResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

ReturnDTO
GetReturnResponse::getResult()
{
	return result;
}

void
GetReturnResponse::setResult(ReturnDTO  result)
{
	this->result = result;
}



