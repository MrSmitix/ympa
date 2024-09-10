

#include "GetCampaignOffersResponse.h"

using namespace Tiny;

GetCampaignOffersResponse::GetCampaignOffersResponse()
{
	status = ApiResponseStatusType();
	result = GetCampaignOffersResultDTO();
}

GetCampaignOffersResponse::GetCampaignOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCampaignOffersResponse::~GetCampaignOffersResponse()
{

}

void
GetCampaignOffersResponse::fromJson(std::string jsonObj)
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




        GetCampaignOffersResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetCampaignOffersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetCampaignOffersResponse::getStatus()
{
	return status;
}

void
GetCampaignOffersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetCampaignOffersResultDTO
GetCampaignOffersResponse::getResult()
{
	return result;
}

void
GetCampaignOffersResponse::setResult(GetCampaignOffersResultDTO  result)
{
	this->result = result;
}



