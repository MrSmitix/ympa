

#include "PriceRecommendationItemDTO.h"

using namespace Tiny;

PriceRecommendationItemDTO::PriceRecommendationItemDTO()
{
	campaignId = long(0);
	price = float(0);
}

PriceRecommendationItemDTO::PriceRecommendationItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceRecommendationItemDTO::~PriceRecommendationItemDTO()
{

}

void
PriceRecommendationItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignIdKey = "campaignId";

    if(object.has_key(campaignIdKey))
    {
        bourne::json value = object[campaignIdKey];



        jsonToValue(&campaignId, value, "long");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }


}

bourne::json
PriceRecommendationItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["campaignId"] = getCampaignId();






    object["price"] = getPrice();



    return object;

}

long
PriceRecommendationItemDTO::getCampaignId()
{
	return campaignId;
}

void
PriceRecommendationItemDTO::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

long
PriceRecommendationItemDTO::getPrice()
{
	return price;
}

void
PriceRecommendationItemDTO::setPrice(long  price)
{
	this->price = price;
}



