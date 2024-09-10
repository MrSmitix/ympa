

#include "PromoOfferAutoParticipatingDetailsDTO.h"

using namespace Tiny;

PromoOfferAutoParticipatingDetailsDTO::PromoOfferAutoParticipatingDetailsDTO()
{
	campaignIds = std::list<long>();
}

PromoOfferAutoParticipatingDetailsDTO::PromoOfferAutoParticipatingDetailsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromoOfferAutoParticipatingDetailsDTO::~PromoOfferAutoParticipatingDetailsDTO()
{

}

void
PromoOfferAutoParticipatingDetailsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignIdsKey = "campaignIds";

    if(object.has_key(campaignIdsKey))
    {
        bourne::json value = object[campaignIdsKey];


        std::list<long> campaignIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            campaignIds_list.push_back(element);
        }
        campaignIds = campaignIds_list;


    }


}

bourne::json
PromoOfferAutoParticipatingDetailsDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<long> campaignIds_list = getCampaignIds();
    bourne::json campaignIds_arr = bourne::json::array();

    for(auto& var : campaignIds_list)
    {
        campaignIds_arr.append(var);
    }
    object["campaignIds"] = campaignIds_arr;






    return object;

}

std::list<long>
PromoOfferAutoParticipatingDetailsDTO::getCampaignIds()
{
	return campaignIds;
}

void
PromoOfferAutoParticipatingDetailsDTO::setCampaignIds(std::list <long> campaignIds)
{
	this->campaignIds = campaignIds;
}



