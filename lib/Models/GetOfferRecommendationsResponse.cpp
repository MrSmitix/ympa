

#include "GetOfferRecommendationsResponse.h"

using namespace Tiny;

GetOfferRecommendationsResponse::GetOfferRecommendationsResponse()
{
	status = ApiResponseStatusType();
	result = OfferRecommendationsResultDTO();
}

GetOfferRecommendationsResponse::GetOfferRecommendationsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOfferRecommendationsResponse::~GetOfferRecommendationsResponse()
{

}

void
GetOfferRecommendationsResponse::fromJson(std::string jsonObj)
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




        OfferRecommendationsResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetOfferRecommendationsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetOfferRecommendationsResponse::getStatus()
{
	return status;
}

void
GetOfferRecommendationsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OfferRecommendationsResultDTO
GetOfferRecommendationsResponse::getResult()
{
	return result;
}

void
GetOfferRecommendationsResponse::setResult(OfferRecommendationsResultDTO  result)
{
	this->result = result;
}



