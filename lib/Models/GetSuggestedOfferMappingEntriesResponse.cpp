

#include "GetSuggestedOfferMappingEntriesResponse.h"

using namespace Tiny;

GetSuggestedOfferMappingEntriesResponse::GetSuggestedOfferMappingEntriesResponse()
{
	status = ApiResponseStatusType();
	result = OfferMappingSuggestionsListDTO();
}

GetSuggestedOfferMappingEntriesResponse::GetSuggestedOfferMappingEntriesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetSuggestedOfferMappingEntriesResponse::~GetSuggestedOfferMappingEntriesResponse()
{

}

void
GetSuggestedOfferMappingEntriesResponse::fromJson(std::string jsonObj)
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




        OfferMappingSuggestionsListDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetSuggestedOfferMappingEntriesResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetSuggestedOfferMappingEntriesResponse::getStatus()
{
	return status;
}

void
GetSuggestedOfferMappingEntriesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OfferMappingSuggestionsListDTO
GetSuggestedOfferMappingEntriesResponse::getResult()
{
	return result;
}

void
GetSuggestedOfferMappingEntriesResponse::setResult(OfferMappingSuggestionsListDTO  result)
{
	this->result = result;
}



