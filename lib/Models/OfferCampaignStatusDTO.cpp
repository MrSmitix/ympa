

#include "OfferCampaignStatusDTO.h"

using namespace Tiny;

OfferCampaignStatusDTO::OfferCampaignStatusDTO()
{
	campaignId = long(0);
	status = OfferCampaignStatusType();
}

OfferCampaignStatusDTO::OfferCampaignStatusDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferCampaignStatusDTO::~OfferCampaignStatusDTO()
{

}

void
OfferCampaignStatusDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignIdKey = "campaignId";

    if(object.has_key(campaignIdKey))
    {
        bourne::json value = object[campaignIdKey];



        jsonToValue(&campaignId, value, "long");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OfferCampaignStatusType* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
OfferCampaignStatusDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["campaignId"] = getCampaignId();







	object["status"] = getStatus().toJson();


    return object;

}

long
OfferCampaignStatusDTO::getCampaignId()
{
	return campaignId;
}

void
OfferCampaignStatusDTO::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

OfferCampaignStatusType
OfferCampaignStatusDTO::getStatus()
{
	return status;
}

void
OfferCampaignStatusDTO::setStatus(OfferCampaignStatusType  status)
{
	this->status = status;
}



