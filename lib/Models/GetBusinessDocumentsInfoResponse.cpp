

#include "GetBusinessDocumentsInfoResponse.h"

using namespace Tiny;

GetBusinessDocumentsInfoResponse::GetBusinessDocumentsInfoResponse()
{
	status = ApiResponseStatusType();
	result = OrderBusinessDocumentsDTO();
}

GetBusinessDocumentsInfoResponse::GetBusinessDocumentsInfoResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBusinessDocumentsInfoResponse::~GetBusinessDocumentsInfoResponse()
{

}

void
GetBusinessDocumentsInfoResponse::fromJson(std::string jsonObj)
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




        OrderBusinessDocumentsDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetBusinessDocumentsInfoResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetBusinessDocumentsInfoResponse::getStatus()
{
	return status;
}

void
GetBusinessDocumentsInfoResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OrderBusinessDocumentsDTO
GetBusinessDocumentsInfoResponse::getResult()
{
	return result;
}

void
GetBusinessDocumentsInfoResponse::setResult(OrderBusinessDocumentsDTO  result)
{
	this->result = result;
}



