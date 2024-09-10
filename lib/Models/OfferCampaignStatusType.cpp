

#include "OfferCampaignStatusType.h"

using namespace Tiny;

OfferCampaignStatusType::OfferCampaignStatusType()
{
}

OfferCampaignStatusType::OfferCampaignStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferCampaignStatusType::~OfferCampaignStatusType()
{

}

void
OfferCampaignStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferCampaignStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



