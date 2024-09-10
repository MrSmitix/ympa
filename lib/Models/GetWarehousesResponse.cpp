

#include "GetWarehousesResponse.h"

using namespace Tiny;

GetWarehousesResponse::GetWarehousesResponse()
{
	status = ApiResponseStatusType();
	result = WarehousesDTO();
}

GetWarehousesResponse::GetWarehousesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetWarehousesResponse::~GetWarehousesResponse()
{

}

void
GetWarehousesResponse::fromJson(std::string jsonObj)
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




        WarehousesDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetWarehousesResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetWarehousesResponse::getStatus()
{
	return status;
}

void
GetWarehousesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

WarehousesDTO
GetWarehousesResponse::getResult()
{
	return result;
}

void
GetWarehousesResponse::setResult(WarehousesDTO  result)
{
	this->result = result;
}



