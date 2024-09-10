

#include "OfferPriceDTO.h"

using namespace Tiny;

OfferPriceDTO::OfferPriceDTO()
{
	offerId = std::string();
	price = PriceDTO();
}

OfferPriceDTO::OfferPriceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferPriceDTO::~OfferPriceDTO()
{

}

void
OfferPriceDTO::fromJson(std::string jsonObj)
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




        PriceDTO* obj = &price;
		obj->fromJson(value.dump());

    }


}

bourne::json
OfferPriceDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["price"] = getPrice().toJson();


    return object;

}

std::string
OfferPriceDTO::getOfferId()
{
	return offerId;
}

void
OfferPriceDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

PriceDTO
OfferPriceDTO::getPrice()
{
	return price;
}

void
OfferPriceDTO::setPrice(PriceDTO  price)
{
	this->price = price;
}



