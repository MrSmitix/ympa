

#include "OfferPriceResponseDTO.h"

using namespace Tiny;

OfferPriceResponseDTO::OfferPriceResponseDTO()
{
	id = std::string();
	price = PriceDTO();
	marketSku = long(0);
	updatedAt = std::string();
}

OfferPriceResponseDTO::OfferPriceResponseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferPriceResponseDTO::~OfferPriceResponseDTO()
{

}

void
OfferPriceResponseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];




        PriceDTO* obj = &price;
		obj->fromJson(value.dump());

    }

    const char *marketSkuKey = "marketSku";

    if(object.has_key(marketSkuKey))
    {
        bourne::json value = object[marketSkuKey];



        jsonToValue(&marketSku, value, "long");


    }

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }


}

bourne::json
OfferPriceResponseDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["price"] = getPrice().toJson();





    object["marketSku"] = getMarketSku();






    object["updatedAt"] = getUpdatedAt();



    return object;

}

std::string
OfferPriceResponseDTO::getId()
{
	return id;
}

void
OfferPriceResponseDTO::setId(std::string  id)
{
	this->id = id;
}

PriceDTO
OfferPriceResponseDTO::getPrice()
{
	return price;
}

void
OfferPriceResponseDTO::setPrice(PriceDTO  price)
{
	this->price = price;
}

long
OfferPriceResponseDTO::getMarketSku()
{
	return marketSku;
}

void
OfferPriceResponseDTO::setMarketSku(long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
OfferPriceResponseDTO::getUpdatedAt()
{
	return updatedAt;
}

void
OfferPriceResponseDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}



