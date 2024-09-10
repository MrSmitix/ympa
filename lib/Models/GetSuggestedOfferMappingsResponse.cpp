

#include "GetSuggestedOfferMappingsResponse.h"

using namespace Tiny;

GetSuggestedOfferMappingsResponse::GetSuggestedOfferMappingsResponse()
{
	status = ApiResponseStatusType();
	result = GetSuggestedOfferMappingsResultDTO();
}

GetSuggestedOfferMappingsResponse::GetSuggestedOfferMappingsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetSuggestedOfferMappingsResponse::~GetSuggestedOfferMappingsResponse()
{

}

void
GetSuggestedOfferMappingsResponse::fromJson(std::string jsonObj)
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




        GetSuggestedOfferMappingsResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetSuggestedOfferMappingsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetSuggestedOfferMappingsResponse::getStatus()
{
	return status;
}

void
GetSuggestedOfferMappingsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetSuggestedOfferMappingsResultDTO
GetSuggestedOfferMappingsResponse::getResult()
{
	return result;
}

void
GetSuggestedOfferMappingsResponse::setResult(GetSuggestedOfferMappingsResultDTO  result)
{
	this->result = result;
}



