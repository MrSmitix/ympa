

#include "OfferRecommendationDTO.h"

using namespace Tiny;

OfferRecommendationDTO::OfferRecommendationDTO()
{
	offer = OfferForRecommendationDTO();
	recommendation = OfferRecommendationInfoDTO();
}

OfferRecommendationDTO::OfferRecommendationDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferRecommendationDTO::~OfferRecommendationDTO()
{

}

void
OfferRecommendationDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerKey = "offer";

    if(object.has_key(offerKey))
    {
        bourne::json value = object[offerKey];




        OfferForRecommendationDTO* obj = &offer;
		obj->fromJson(value.dump());

    }

    const char *recommendationKey = "recommendation";

    if(object.has_key(recommendationKey))
    {
        bourne::json value = object[recommendationKey];




        OfferRecommendationInfoDTO* obj = &recommendation;
		obj->fromJson(value.dump());

    }


}

bourne::json
OfferRecommendationDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["offer"] = getOffer().toJson();






	object["recommendation"] = getRecommendation().toJson();


    return object;

}

OfferForRecommendationDTO
OfferRecommendationDTO::getOffer()
{
	return offer;
}

void
OfferRecommendationDTO::setOffer(OfferForRecommendationDTO  offer)
{
	this->offer = offer;
}

OfferRecommendationInfoDTO
OfferRecommendationDTO::getRecommendation()
{
	return recommendation;
}

void
OfferRecommendationDTO::setRecommendation(OfferRecommendationInfoDTO  recommendation)
{
	this->recommendation = recommendation;
}



