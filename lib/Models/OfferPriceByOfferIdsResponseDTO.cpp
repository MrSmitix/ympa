

#include "OfferPriceByOfferIdsResponseDTO.h"

using namespace Tiny;

OfferPriceByOfferIdsResponseDTO::OfferPriceByOfferIdsResponseDTO()
{
	offerId = std::string();
	price = PriceDTO();
	updatedAt = std::string();
}

OfferPriceByOfferIdsResponseDTO::OfferPriceByOfferIdsResponseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferPriceByOfferIdsResponseDTO::~OfferPriceByOfferIdsResponseDTO()
{

}

void
OfferPriceByOfferIdsResponseDTO::fromJson(std::string jsonObj)
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

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }


}

bourne::json
OfferPriceByOfferIdsResponseDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["price"] = getPrice().toJson();





    object["updatedAt"] = getUpdatedAt();



    return object;

}

std::string
OfferPriceByOfferIdsResponseDTO::getOfferId()
{
	return offerId;
}

void
OfferPriceByOfferIdsResponseDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

PriceDTO
OfferPriceByOfferIdsResponseDTO::getPrice()
{
	return price;
}

void
OfferPriceByOfferIdsResponseDTO::setPrice(PriceDTO  price)
{
	this->price = price;
}

std::string
OfferPriceByOfferIdsResponseDTO::getUpdatedAt()
{
	return updatedAt;
}

void
OfferPriceByOfferIdsResponseDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}



