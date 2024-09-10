

#include "PromoOfferDiscountParamsDTO.h"

using namespace Tiny;

PromoOfferDiscountParamsDTO::PromoOfferDiscountParamsDTO()
{
	price = long(0);
	promoPrice = long(0);
	maxPromoPrice = long(0);
}

PromoOfferDiscountParamsDTO::PromoOfferDiscountParamsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromoOfferDiscountParamsDTO::~PromoOfferDiscountParamsDTO()
{

}

void
PromoOfferDiscountParamsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }

    const char *promoPriceKey = "promoPrice";

    if(object.has_key(promoPriceKey))
    {
        bourne::json value = object[promoPriceKey];



        jsonToValue(&promoPrice, value, "long");


    }

    const char *maxPromoPriceKey = "maxPromoPrice";

    if(object.has_key(maxPromoPriceKey))
    {
        bourne::json value = object[maxPromoPriceKey];



        jsonToValue(&maxPromoPrice, value, "long");


    }


}

bourne::json
PromoOfferDiscountParamsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["price"] = getPrice();






    object["promoPrice"] = getPromoPrice();






    object["maxPromoPrice"] = getMaxPromoPrice();



    return object;

}

long
PromoOfferDiscountParamsDTO::getPrice()
{
	return price;
}

void
PromoOfferDiscountParamsDTO::setPrice(long  price)
{
	this->price = price;
}

long
PromoOfferDiscountParamsDTO::getPromoPrice()
{
	return promoPrice;
}

void
PromoOfferDiscountParamsDTO::setPromoPrice(long  promoPrice)
{
	this->promoPrice = promoPrice;
}

long
PromoOfferDiscountParamsDTO::getMaxPromoPrice()
{
	return maxPromoPrice;
}

void
PromoOfferDiscountParamsDTO::setMaxPromoPrice(long  maxPromoPrice)
{
	this->maxPromoPrice = maxPromoPrice;
}



