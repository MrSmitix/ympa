

#include "GetQuarantineOffersResponse.h"

using namespace Tiny;

GetQuarantineOffersResponse::GetQuarantineOffersResponse()
{
	status = ApiResponseStatusType();
	result = GetQuarantineOffersResultDTO();
}

GetQuarantineOffersResponse::GetQuarantineOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetQuarantineOffersResponse::~GetQuarantineOffersResponse()
{

}

void
GetQuarantineOffersResponse::fromJson(std::string jsonObj)
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




        GetQuarantineOffersResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetQuarantineOffersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetQuarantineOffersResponse::getStatus()
{
	return status;
}

void
GetQuarantineOffersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetQuarantineOffersResultDTO
GetQuarantineOffersResponse::getResult()
{
	return result;
}

void
GetQuarantineOffersResponse::setResult(GetQuarantineOffersResultDTO  result)
{
	this->result = result;
}



