

#include "PromoOfferPromocodeParamsDTO.h"

using namespace Tiny;

PromoOfferPromocodeParamsDTO::PromoOfferPromocodeParamsDTO()
{
	maxPrice = long(0);
}

PromoOfferPromocodeParamsDTO::PromoOfferPromocodeParamsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromoOfferPromocodeParamsDTO::~PromoOfferPromocodeParamsDTO()
{

}

void
PromoOfferPromocodeParamsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxPriceKey = "maxPrice";

    if(object.has_key(maxPriceKey))
    {
        bourne::json value = object[maxPriceKey];



        jsonToValue(&maxPrice, value, "long");


    }


}

bourne::json
PromoOfferPromocodeParamsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["maxPrice"] = getMaxPrice();



    return object;

}

long
PromoOfferPromocodeParamsDTO::getMaxPrice()
{
	return maxPrice;
}

void
PromoOfferPromocodeParamsDTO::setMaxPrice(long  maxPrice)
{
	this->maxPrice = maxPrice;
}



