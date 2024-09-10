

#include "UpdateBusinessOfferPriceDTO.h"

using namespace Tiny;

UpdateBusinessOfferPriceDTO::UpdateBusinessOfferPriceDTO()
{
	offerId = std::string();
	price = UpdatePriceWithDiscountDTO();
}

UpdateBusinessOfferPriceDTO::UpdateBusinessOfferPriceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateBusinessOfferPriceDTO::~UpdateBusinessOfferPriceDTO()
{

}

void
UpdateBusinessOfferPriceDTO::fromJson(std::string jsonObj)
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




        UpdatePriceWithDiscountDTO* obj = &price;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateBusinessOfferPriceDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["price"] = getPrice().toJson();


    return object;

}

std::string
UpdateBusinessOfferPriceDTO::getOfferId()
{
	return offerId;
}

void
UpdateBusinessOfferPriceDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

UpdatePriceWithDiscountDTO
UpdateBusinessOfferPriceDTO::getPrice()
{
	return price;
}

void
UpdateBusinessOfferPriceDTO::setPrice(UpdatePriceWithDiscountDTO  price)
{
	this->price = price;
}



