

#include "SuggestOfferPriceDTO.h"

using namespace Tiny;

SuggestOfferPriceDTO::SuggestOfferPriceDTO()
{
	offerId = std::string();
	marketSku = long(0);
}

SuggestOfferPriceDTO::SuggestOfferPriceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

SuggestOfferPriceDTO::~SuggestOfferPriceDTO()
{

}

void
SuggestOfferPriceDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *marketSkuKey = "marketSku";

    if(object.has_key(marketSkuKey))
    {
        bourne::json value = object[marketSkuKey];



        jsonToValue(&marketSku, value, "long");


    }


}

bourne::json
SuggestOfferPriceDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();






    object["marketSku"] = getMarketSku();



    return object;

}

std::string
SuggestOfferPriceDTO::getOfferId()
{
	return offerId;
}

void
SuggestOfferPriceDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

long
SuggestOfferPriceDTO::getMarketSku()
{
	return marketSku;
}

void
SuggestOfferPriceDTO::setMarketSku(long  marketSku)
{
	this->marketSku = marketSku;
}



