

#include "GetPromosResponse.h"

using namespace Tiny;

GetPromosResponse::GetPromosResponse()
{
	status = ApiResponseStatusType();
	result = GetPromosResultDTO();
}

GetPromosResponse::GetPromosResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromosResponse::~GetPromosResponse()
{

}

void
GetPromosResponse::fromJson(std::string jsonObj)
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




        GetPromosResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetPromosResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetPromosResponse::getStatus()
{
	return status;
}

void
GetPromosResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetPromosResultDTO
GetPromosResponse::getResult()
{
	return result;
}

void
GetPromosResponse::setResult(GetPromosResultDTO  result)
{
	this->result = result;
}



