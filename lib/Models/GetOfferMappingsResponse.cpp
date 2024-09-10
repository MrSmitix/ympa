

#include "GetOfferMappingsResponse.h"

using namespace Tiny;

GetOfferMappingsResponse::GetOfferMappingsResponse()
{
	status = ApiResponseStatusType();
	result = GetOfferMappingsResultDTO();
}

GetOfferMappingsResponse::GetOfferMappingsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOfferMappingsResponse::~GetOfferMappingsResponse()
{

}

void
GetOfferMappingsResponse::fromJson(std::string jsonObj)
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




        GetOfferMappingsResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetOfferMappingsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetOfferMappingsResponse::getStatus()
{
	return status;
}

void
GetOfferMappingsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetOfferMappingsResultDTO
GetOfferMappingsResponse::getResult()
{
	return result;
}

void
GetOfferMappingsResponse::setResult(GetOfferMappingsResultDTO  result)
{
	this->result = result;
}



