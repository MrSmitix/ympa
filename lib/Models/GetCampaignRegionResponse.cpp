

#include "GetCampaignRegionResponse.h"

using namespace Tiny;

GetCampaignRegionResponse::GetCampaignRegionResponse()
{
	region = RegionDTO();
}

GetCampaignRegionResponse::GetCampaignRegionResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCampaignRegionResponse::~GetCampaignRegionResponse()
{

}

void
GetCampaignRegionResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *regionKey = "region";

    if(object.has_key(regionKey))
    {
        bourne::json value = object[regionKey];




        RegionDTO* obj = &region;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetCampaignRegionResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["region"] = getRegion().toJson();


    return object;

}

RegionDTO
GetCampaignRegionResponse::getRegion()
{
	return region;
}

void
GetCampaignRegionResponse::setRegion(RegionDTO  region)
{
	this->region = region;
}



