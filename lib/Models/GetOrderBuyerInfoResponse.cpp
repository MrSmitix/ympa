

#include "GetOrderBuyerInfoResponse.h"

using namespace Tiny;

GetOrderBuyerInfoResponse::GetOrderBuyerInfoResponse()
{
	status = ApiResponseStatusType();
	result = OrderBuyerInfoDTO();
}

GetOrderBuyerInfoResponse::GetOrderBuyerInfoResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOrderBuyerInfoResponse::~GetOrderBuyerInfoResponse()
{

}

void
GetOrderBuyerInfoResponse::fromJson(std::string jsonObj)
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




        OrderBuyerInfoDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetOrderBuyerInfoResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetOrderBuyerInfoResponse::getStatus()
{
	return status;
}

void
GetOrderBuyerInfoResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OrderBuyerInfoDTO
GetOrderBuyerInfoResponse::getResult()
{
	return result;
}

void
GetOrderBuyerInfoResponse::setResult(OrderBuyerInfoDTO  result)
{
	this->result = result;
}



