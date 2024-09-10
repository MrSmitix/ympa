

#include "GetOrdersStatsResponse.h"

using namespace Tiny;

GetOrdersStatsResponse::GetOrdersStatsResponse()
{
	status = ApiResponseStatusType();
	result = OrdersStatsDTO();
}

GetOrdersStatsResponse::GetOrdersStatsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOrdersStatsResponse::~GetOrdersStatsResponse()
{

}

void
GetOrdersStatsResponse::fromJson(std::string jsonObj)
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




        OrdersStatsDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetOrdersStatsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetOrdersStatsResponse::getStatus()
{
	return status;
}

void
GetOrdersStatsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OrdersStatsDTO
GetOrdersStatsResponse::getResult()
{
	return result;
}

void
GetOrdersStatsResponse::setResult(OrdersStatsDTO  result)
{
	this->result = result;
}



