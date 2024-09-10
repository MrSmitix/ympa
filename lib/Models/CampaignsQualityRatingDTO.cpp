

#include "CampaignsQualityRatingDTO.h"

using namespace Tiny;

CampaignsQualityRatingDTO::CampaignsQualityRatingDTO()
{
	campaignRatings = std::list<CampaignQualityRatingDTO>();
}

CampaignsQualityRatingDTO::CampaignsQualityRatingDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignsQualityRatingDTO::~CampaignsQualityRatingDTO()
{

}

void
CampaignsQualityRatingDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignRatingsKey = "campaignRatings";

    if(object.has_key(campaignRatingsKey))
    {
        bourne::json value = object[campaignRatingsKey];


        std::list<CampaignQualityRatingDTO> campaignRatings_list;
        CampaignQualityRatingDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            campaignRatings_list.push_back(element);
        }
        campaignRatings = campaignRatings_list;


    }


}

bourne::json
CampaignsQualityRatingDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CampaignQualityRatingDTO> campaignRatings_list = getCampaignRatings();
    bourne::json campaignRatings_arr = bourne::json::array();

    for(auto& var : campaignRatings_list)
    {
        CampaignQualityRatingDTO obj = var;
        campaignRatings_arr.append(obj.toJson());
    }
    object["campaignRatings"] = campaignRatings_arr;




    return object;

}

std::list<CampaignQualityRatingDTO>
CampaignsQualityRatingDTO::getCampaignRatings()
{
	return campaignRatings;
}

void
CampaignsQualityRatingDTO::setCampaignRatings(std::list <CampaignQualityRatingDTO> campaignRatings)
{
	this->campaignRatings = campaignRatings;
}



