

#include "GetBidsInfoResponse.h"

using namespace Tiny;

GetBidsInfoResponse::GetBidsInfoResponse()
{
	status = ApiResponseStatusType();
	result = GetBidsInfoResponseDTO();
}

GetBidsInfoResponse::GetBidsInfoResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBidsInfoResponse::~GetBidsInfoResponse()
{

}

void
GetBidsInfoResponse::fromJson(std::string jsonObj)
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




        GetBidsInfoResponseDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetBidsInfoResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetBidsInfoResponse::getStatus()
{
	return status;
}

void
GetBidsInfoResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetBidsInfoResponseDTO
GetBidsInfoResponse::getResult()
{
	return result;
}

void
GetBidsInfoResponse::setResult(GetBidsInfoResponseDTO  result)
{
	this->result = result;
}



