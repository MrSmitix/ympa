

#include "GetBusinessSettingsResponse.h"

using namespace Tiny;

GetBusinessSettingsResponse::GetBusinessSettingsResponse()
{
	status = ApiResponseStatusType();
	result = GetBusinessSettingsInfoDTO();
}

GetBusinessSettingsResponse::GetBusinessSettingsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBusinessSettingsResponse::~GetBusinessSettingsResponse()
{

}

void
GetBusinessSettingsResponse::fromJson(std::string jsonObj)
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




        GetBusinessSettingsInfoDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetBusinessSettingsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetBusinessSettingsResponse::getStatus()
{
	return status;
}

void
GetBusinessSettingsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetBusinessSettingsInfoDTO
GetBusinessSettingsResponse::getResult()
{
	return result;
}

void
GetBusinessSettingsResponse::setResult(GetBusinessSettingsInfoDTO  result)
{
	this->result = result;
}



