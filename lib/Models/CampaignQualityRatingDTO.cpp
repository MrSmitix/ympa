

#include "CampaignQualityRatingDTO.h"

using namespace Tiny;

CampaignQualityRatingDTO::CampaignQualityRatingDTO()
{
	campaignId = long(0);
	ratings = std::list<QualityRatingDTO>();
}

CampaignQualityRatingDTO::CampaignQualityRatingDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignQualityRatingDTO::~CampaignQualityRatingDTO()
{

}

void
CampaignQualityRatingDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignIdKey = "campaignId";

    if(object.has_key(campaignIdKey))
    {
        bourne::json value = object[campaignIdKey];



        jsonToValue(&campaignId, value, "long");


    }

    const char *ratingsKey = "ratings";

    if(object.has_key(ratingsKey))
    {
        bourne::json value = object[ratingsKey];


        std::list<QualityRatingDTO> ratings_list;
        QualityRatingDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            ratings_list.push_back(element);
        }
        ratings = ratings_list;


    }


}

bourne::json
CampaignQualityRatingDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["campaignId"] = getCampaignId();





    std::list<QualityRatingDTO> ratings_list = getRatings();
    bourne::json ratings_arr = bourne::json::array();

    for(auto& var : ratings_list)
    {
        QualityRatingDTO obj = var;
        ratings_arr.append(obj.toJson());
    }
    object["ratings"] = ratings_arr;




    return object;

}

long
CampaignQualityRatingDTO::getCampaignId()
{
	return campaignId;
}

void
CampaignQualityRatingDTO::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

std::list<QualityRatingDTO>
CampaignQualityRatingDTO::getRatings()
{
	return ratings;
}

void
CampaignQualityRatingDTO::setRatings(std::list <QualityRatingDTO> ratings)
{
	this->ratings = ratings;
}



