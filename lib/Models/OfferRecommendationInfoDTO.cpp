

#include "OfferRecommendationInfoDTO.h"

using namespace Tiny;

OfferRecommendationInfoDTO::OfferRecommendationInfoDTO()
{
	offerId = std::string();
	recommendedCofinancePrice = BasePriceDTO();
	competitivenessThresholds = PriceCompetitivenessThresholdsDTO();
}

OfferRecommendationInfoDTO::OfferRecommendationInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferRecommendationInfoDTO::~OfferRecommendationInfoDTO()
{

}

void
OfferRecommendationInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *recommendedCofinancePriceKey = "recommendedCofinancePrice";

    if(object.has_key(recommendedCofinancePriceKey))
    {
        bourne::json value = object[recommendedCofinancePriceKey];




        BasePriceDTO* obj = &recommendedCofinancePrice;
		obj->fromJson(value.dump());

    }

    const char *competitivenessThresholdsKey = "competitivenessThresholds";

    if(object.has_key(competitivenessThresholdsKey))
    {
        bourne::json value = object[competitivenessThresholdsKey];




        PriceCompetitivenessThresholdsDTO* obj = &competitivenessThresholds;
		obj->fromJson(value.dump());

    }


}

bourne::json
OfferRecommendationInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["recommendedCofinancePrice"] = getRecommendedCofinancePrice().toJson();






	object["competitivenessThresholds"] = getCompetitivenessThresholds().toJson();


    return object;

}

std::string
OfferRecommendationInfoDTO::getOfferId()
{
	return offerId;
}

void
OfferRecommendationInfoDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

BasePriceDTO
OfferRecommendationInfoDTO::getRecommendedCofinancePrice()
{
	return recommendedCofinancePrice;
}

void
OfferRecommendationInfoDTO::setRecommendedCofinancePrice(BasePriceDTO  recommendedCofinancePrice)
{
	this->recommendedCofinancePrice = recommendedCofinancePrice;
}

PriceCompetitivenessThresholdsDTO
OfferRecommendationInfoDTO::getCompetitivenessThresholds()
{
	return competitivenessThresholds;
}

void
OfferRecommendationInfoDTO::setCompetitivenessThresholds(PriceCompetitivenessThresholdsDTO  competitivenessThresholds)
{
	this->competitivenessThresholds = competitivenessThresholds;
}



