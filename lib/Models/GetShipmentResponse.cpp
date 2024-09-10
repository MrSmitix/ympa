

#include "GetShipmentResponse.h"

using namespace Tiny;

GetShipmentResponse::GetShipmentResponse()
{
	status = ApiResponseStatusType();
	result = ShipmentDTO();
}

GetShipmentResponse::GetShipmentResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetShipmentResponse::~GetShipmentResponse()
{

}

void
GetShipmentResponse::fromJson(std::string jsonObj)
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




        ShipmentDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetShipmentResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetShipmentResponse::getStatus()
{
	return status;
}

void
GetShipmentResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

ShipmentDTO
GetShipmentResponse::getResult()
{
	return result;
}

void
GetShipmentResponse::setResult(ShipmentDTO  result)
{
	this->result = result;
}



