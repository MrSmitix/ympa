

#include "DeleteCampaignOffersResponse.h"

using namespace Tiny;

DeleteCampaignOffersResponse::DeleteCampaignOffersResponse()
{
	status = ApiResponseStatusType();
	result = DeleteCampaignOffersDTO();
}

DeleteCampaignOffersResponse::DeleteCampaignOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteCampaignOffersResponse::~DeleteCampaignOffersResponse()
{

}

void
DeleteCampaignOffersResponse::fromJson(std::string jsonObj)
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




        DeleteCampaignOffersDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
DeleteCampaignOffersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
DeleteCampaignOffersResponse::getStatus()
{
	return status;
}

void
DeleteCampaignOffersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

DeleteCampaignOffersDTO
DeleteCampaignOffersResponse::getResult()
{
	return result;
}

void
DeleteCampaignOffersResponse::setResult(DeleteCampaignOffersDTO  result)
{
	this->result = result;
}



