

#include "GetReturnsResponse.h"

using namespace Tiny;

GetReturnsResponse::GetReturnsResponse()
{
	status = ApiResponseStatusType();
	result = PagedReturnsDTO();
}

GetReturnsResponse::GetReturnsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetReturnsResponse::~GetReturnsResponse()
{

}

void
GetReturnsResponse::fromJson(std::string jsonObj)
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




        PagedReturnsDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetReturnsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetReturnsResponse::getStatus()
{
	return status;
}

void
GetReturnsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

PagedReturnsDTO
GetReturnsResponse::getResult()
{
	return result;
}

void
GetReturnsResponse::setResult(PagedReturnsDTO  result)
{
	this->result = result;
}



