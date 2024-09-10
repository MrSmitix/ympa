

#include "GetQualityRatingResponse.h"

using namespace Tiny;

GetQualityRatingResponse::GetQualityRatingResponse()
{
	status = ApiResponseStatusType();
	result = CampaignsQualityRatingDTO();
}

GetQualityRatingResponse::GetQualityRatingResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetQualityRatingResponse::~GetQualityRatingResponse()
{

}

void
GetQualityRatingResponse::fromJson(std::string jsonObj)
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




        CampaignsQualityRatingDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetQualityRatingResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetQualityRatingResponse::getStatus()
{
	return status;
}

void
GetQualityRatingResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

CampaignsQualityRatingDTO
GetQualityRatingResponse::getResult()
{
	return result;
}

void
GetQualityRatingResponse::setResult(CampaignsQualityRatingDTO  result)
{
	this->result = result;
}



