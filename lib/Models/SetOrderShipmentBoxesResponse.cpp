

#include "SetOrderShipmentBoxesResponse.h"

using namespace Tiny;

SetOrderShipmentBoxesResponse::SetOrderShipmentBoxesResponse()
{
	status = ApiResponseStatusType();
	result = ShipmentBoxesDTO();
}

SetOrderShipmentBoxesResponse::SetOrderShipmentBoxesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

SetOrderShipmentBoxesResponse::~SetOrderShipmentBoxesResponse()
{

}

void
SetOrderShipmentBoxesResponse::fromJson(std::string jsonObj)
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




        ShipmentBoxesDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
SetOrderShipmentBoxesResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
SetOrderShipmentBoxesResponse::getStatus()
{
	return status;
}

void
SetOrderShipmentBoxesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

ShipmentBoxesDTO
SetOrderShipmentBoxesResponse::getResult()
{
	return result;
}

void
SetOrderShipmentBoxesResponse::setResult(ShipmentBoxesDTO  result)
{
	this->result = result;
}



