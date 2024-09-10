

#include "GetCampaignResponse.h"

using namespace Tiny;

GetCampaignResponse::GetCampaignResponse()
{
	campaign = CampaignDTO();
}

GetCampaignResponse::GetCampaignResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCampaignResponse::~GetCampaignResponse()
{

}

void
GetCampaignResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignKey = "campaign";

    if(object.has_key(campaignKey))
    {
        bourne::json value = object[campaignKey];




        CampaignDTO* obj = &campaign;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetCampaignResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["campaign"] = getCampaign().toJson();


    return object;

}

CampaignDTO
GetCampaignResponse::getCampaign()
{
	return campaign;
}

void
GetCampaignResponse::setCampaign(CampaignDTO  campaign)
{
	this->campaign = campaign;
}



