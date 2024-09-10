

#include "UpdateOrderStatusesResponse.h"

using namespace Tiny;

UpdateOrderStatusesResponse::UpdateOrderStatusesResponse()
{
	status = ApiResponseStatusType();
	result = UpdateOrderStatusesDTO();
}

UpdateOrderStatusesResponse::UpdateOrderStatusesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOrderStatusesResponse::~UpdateOrderStatusesResponse()
{

}

void
UpdateOrderStatusesResponse::fromJson(std::string jsonObj)
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




        UpdateOrderStatusesDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateOrderStatusesResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
UpdateOrderStatusesResponse::getStatus()
{
	return status;
}

void
UpdateOrderStatusesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

UpdateOrderStatusesDTO
UpdateOrderStatusesResponse::getResult()
{
	return result;
}

void
UpdateOrderStatusesResponse::setResult(UpdateOrderStatusesDTO  result)
{
	this->result = result;
}



