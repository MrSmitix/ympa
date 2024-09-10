

#include "GetBusinessBuyerInfoResponse.h"

using namespace Tiny;

GetBusinessBuyerInfoResponse::GetBusinessBuyerInfoResponse()
{
	status = ApiResponseStatusType();
	result = OrderBusinessBuyerDTO();
}

GetBusinessBuyerInfoResponse::GetBusinessBuyerInfoResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBusinessBuyerInfoResponse::~GetBusinessBuyerInfoResponse()
{

}

void
GetBusinessBuyerInfoResponse::fromJson(std::string jsonObj)
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




        OrderBusinessBuyerDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetBusinessBuyerInfoResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetBusinessBuyerInfoResponse::getStatus()
{
	return status;
}

void
GetBusinessBuyerInfoResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OrderBusinessBuyerDTO
GetBusinessBuyerInfoResponse::getResult()
{
	return result;
}

void
GetBusinessBuyerInfoResponse::setResult(OrderBusinessBuyerDTO  result)
{
	this->result = result;
}



