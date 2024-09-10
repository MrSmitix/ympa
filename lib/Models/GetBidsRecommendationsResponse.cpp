

#include "GetBidsRecommendationsResponse.h"

using namespace Tiny;

GetBidsRecommendationsResponse::GetBidsRecommendationsResponse()
{
	status = ApiResponseStatusType();
	result = GetBidsRecommendationsResponseDTO();
}

GetBidsRecommendationsResponse::GetBidsRecommendationsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBidsRecommendationsResponse::~GetBidsRecommendationsResponse()
{

}

void
GetBidsRecommendationsResponse::fromJson(std::string jsonObj)
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




        GetBidsRecommendationsResponseDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetBidsRecommendationsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetBidsRecommendationsResponse::getStatus()
{
	return status;
}

void
GetBidsRecommendationsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetBidsRecommendationsResponseDTO
GetBidsRecommendationsResponse::getResult()
{
	return result;
}

void
GetBidsRecommendationsResponse::setResult(GetBidsRecommendationsResponseDTO  result)
{
	this->result = result;
}



