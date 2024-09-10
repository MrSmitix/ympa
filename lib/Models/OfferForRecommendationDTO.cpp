

#include "OfferForRecommendationDTO.h"

using namespace Tiny;

OfferForRecommendationDTO::OfferForRecommendationDTO()
{
	offerId = std::string();
	price = BasePriceDTO();
	cofinancePrice = GetPriceDTO();
	competitiveness = PriceCompetitivenessType();
	shows = long(0);
}

OfferForRecommendationDTO::OfferForRecommendationDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferForRecommendationDTO::~OfferForRecommendationDTO()
{

}

void
OfferForRecommendationDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];




        BasePriceDTO* obj = &price;
		obj->fromJson(value.dump());

    }

    const char *cofinancePriceKey = "cofinancePrice";

    if(object.has_key(cofinancePriceKey))
    {
        bourne::json value = object[cofinancePriceKey];




        GetPriceDTO* obj = &cofinancePrice;
		obj->fromJson(value.dump());

    }

    const char *competitivenessKey = "competitiveness";

    if(object.has_key(competitivenessKey))
    {
        bourne::json value = object[competitivenessKey];




        PriceCompetitivenessType* obj = &competitiveness;
		obj->fromJson(value.dump());

    }

    const char *showsKey = "shows";

    if(object.has_key(showsKey))
    {
        bourne::json value = object[showsKey];



        jsonToValue(&shows, value, "long");


    }


}

bourne::json
OfferForRecommendationDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["price"] = getPrice().toJson();






	object["cofinancePrice"] = getCofinancePrice().toJson();






	object["competitiveness"] = getCompetitiveness().toJson();





    object["shows"] = getShows();



    return object;

}

std::string
OfferForRecommendationDTO::getOfferId()
{
	return offerId;
}

void
OfferForRecommendationDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

BasePriceDTO
OfferForRecommendationDTO::getPrice()
{
	return price;
}

void
OfferForRecommendationDTO::setPrice(BasePriceDTO  price)
{
	this->price = price;
}

GetPriceDTO
OfferForRecommendationDTO::getCofinancePrice()
{
	return cofinancePrice;
}

void
OfferForRecommendationDTO::setCofinancePrice(GetPriceDTO  cofinancePrice)
{
	this->cofinancePrice = cofinancePrice;
}

PriceCompetitivenessType
OfferForRecommendationDTO::getCompetitiveness()
{
	return competitiveness;
}

void
OfferForRecommendationDTO::setCompetitiveness(PriceCompetitivenessType  competitiveness)
{
	this->competitiveness = competitiveness;
}

long
OfferForRecommendationDTO::getShows()
{
	return shows;
}

void
OfferForRecommendationDTO::setShows(long  shows)
{
	this->shows = shows;
}



