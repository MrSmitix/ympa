

#include "GetOfferMappingEntriesResponse.h"

using namespace Tiny;

GetOfferMappingEntriesResponse::GetOfferMappingEntriesResponse()
{
	status = ApiResponseStatusType();
	result = OfferMappingEntriesDTO();
}

GetOfferMappingEntriesResponse::GetOfferMappingEntriesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOfferMappingEntriesResponse::~GetOfferMappingEntriesResponse()
{

}

void
GetOfferMappingEntriesResponse::fromJson(std::string jsonObj)
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




        OfferMappingEntriesDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetOfferMappingEntriesResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetOfferMappingEntriesResponse::getStatus()
{
	return status;
}

void
GetOfferMappingEntriesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OfferMappingEntriesDTO
GetOfferMappingEntriesResponse::getResult()
{
	return result;
}

void
GetOfferMappingEntriesResponse::setResult(OfferMappingEntriesDTO  result)
{
	this->result = result;
}



