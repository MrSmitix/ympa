

#include "GetHiddenOffersResponse.h"

using namespace Tiny;

GetHiddenOffersResponse::GetHiddenOffersResponse()
{
	status = ApiResponseStatusType();
	result = GetHiddenOffersResultDTO();
}

GetHiddenOffersResponse::GetHiddenOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetHiddenOffersResponse::~GetHiddenOffersResponse()
{

}

void
GetHiddenOffersResponse::fromJson(std::string jsonObj)
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




        GetHiddenOffersResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetHiddenOffersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetHiddenOffersResponse::getStatus()
{
	return status;
}

void
GetHiddenOffersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetHiddenOffersResultDTO
GetHiddenOffersResponse::getResult()
{
	return result;
}

void
GetHiddenOffersResponse::setResult(GetHiddenOffersResultDTO  result)
{
	this->result = result;
}



