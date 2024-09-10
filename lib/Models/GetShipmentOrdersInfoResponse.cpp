

#include "GetShipmentOrdersInfoResponse.h"

using namespace Tiny;

GetShipmentOrdersInfoResponse::GetShipmentOrdersInfoResponse()
{
	status = ApiResponseStatusType();
	result = OrdersShipmentInfoDTO();
}

GetShipmentOrdersInfoResponse::GetShipmentOrdersInfoResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetShipmentOrdersInfoResponse::~GetShipmentOrdersInfoResponse()
{

}

void
GetShipmentOrdersInfoResponse::fromJson(std::string jsonObj)
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




        OrdersShipmentInfoDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetShipmentOrdersInfoResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetShipmentOrdersInfoResponse::getStatus()
{
	return status;
}

void
GetShipmentOrdersInfoResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OrdersShipmentInfoDTO
GetShipmentOrdersInfoResponse::getResult()
{
	return result;
}

void
GetShipmentOrdersInfoResponse::setResult(OrdersShipmentInfoDTO  result)
{
	this->result = result;
}



