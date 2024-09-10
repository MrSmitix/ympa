

#include "UpdatePromoOfferDiscountParamsDTO.h"

using namespace Tiny;

UpdatePromoOfferDiscountParamsDTO::UpdatePromoOfferDiscountParamsDTO()
{
	price = long(0);
	promoPrice = long(0);
}

UpdatePromoOfferDiscountParamsDTO::UpdatePromoOfferDiscountParamsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePromoOfferDiscountParamsDTO::~UpdatePromoOfferDiscountParamsDTO()
{

}

void
UpdatePromoOfferDiscountParamsDTO::fromJson(std::string jsonObj)
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


}

bourne::json
UpdatePromoOfferDiscountParamsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["price"] = getPrice();






    object["promoPrice"] = getPromoPrice();



    return object;

}

long
UpdatePromoOfferDiscountParamsDTO::getPrice()
{
	return price;
}

void
UpdatePromoOfferDiscountParamsDTO::setPrice(long  price)
{
	this->price = price;
}

long
UpdatePromoOfferDiscountParamsDTO::getPromoPrice()
{
	return promoPrice;
}

void
UpdatePromoOfferDiscountParamsDTO::setPromoPrice(long  promoPrice)
{
	this->promoPrice = promoPrice;
}



