

#include "GetOrderLabelsDataResponse.h"

using namespace Tiny;

GetOrderLabelsDataResponse::GetOrderLabelsDataResponse()
{
	status = ApiResponseStatusType();
	result = OrderLabelDTO();
}

GetOrderLabelsDataResponse::GetOrderLabelsDataResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOrderLabelsDataResponse::~GetOrderLabelsDataResponse()
{

}

void
GetOrderLabelsDataResponse::fromJson(std::string jsonObj)
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




        OrderLabelDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetOrderLabelsDataResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetOrderLabelsDataResponse::getStatus()
{
	return status;
}

void
GetOrderLabelsDataResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OrderLabelDTO
GetOrderLabelsDataResponse::getResult()
{
	return result;
}

void
GetOrderLabelsDataResponse::setResult(OrderLabelDTO  result)
{
	this->result = result;
}



