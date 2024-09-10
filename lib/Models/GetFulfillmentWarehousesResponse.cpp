

#include "GetFulfillmentWarehousesResponse.h"

using namespace Tiny;

GetFulfillmentWarehousesResponse::GetFulfillmentWarehousesResponse()
{
	status = ApiResponseStatusType();
	result = FulfillmentWarehousesDTO();
}

GetFulfillmentWarehousesResponse::GetFulfillmentWarehousesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetFulfillmentWarehousesResponse::~GetFulfillmentWarehousesResponse()
{

}

void
GetFulfillmentWarehousesResponse::fromJson(std::string jsonObj)
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




        FulfillmentWarehousesDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetFulfillmentWarehousesResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetFulfillmentWarehousesResponse::getStatus()
{
	return status;
}

void
GetFulfillmentWarehousesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

FulfillmentWarehousesDTO
GetFulfillmentWarehousesResponse::getResult()
{
	return result;
}

void
GetFulfillmentWarehousesResponse::setResult(FulfillmentWarehousesDTO  result)
{
	this->result = result;
}



