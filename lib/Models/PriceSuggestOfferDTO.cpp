

#include "PriceSuggestOfferDTO.h"

using namespace Tiny;

PriceSuggestOfferDTO::PriceSuggestOfferDTO()
{
	marketSku = long(0);
	offerId = std::string();
	priceSuggestion = std::list<PriceSuggestDTO>();
}

PriceSuggestOfferDTO::PriceSuggestOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceSuggestOfferDTO::~PriceSuggestOfferDTO()
{

}

void
PriceSuggestOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *marketSkuKey = "marketSku";

    if(object.has_key(marketSkuKey))
    {
        bourne::json value = object[marketSkuKey];



        jsonToValue(&marketSku, value, "long");


    }

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *priceSuggestionKey = "priceSuggestion";

    if(object.has_key(priceSuggestionKey))
    {
        bourne::json value = object[priceSuggestionKey];


        std::list<PriceSuggestDTO> priceSuggestion_list;
        PriceSuggestDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            priceSuggestion_list.push_back(element);
        }
        priceSuggestion = priceSuggestion_list;


    }


}

bourne::json
PriceSuggestOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["marketSku"] = getMarketSku();






    object["offerId"] = getOfferId();





    std::list<PriceSuggestDTO> priceSuggestion_list = getPriceSuggestion();
    bourne::json priceSuggestion_arr = bourne::json::array();

    for(auto& var : priceSuggestion_list)
    {
        PriceSuggestDTO obj = var;
        priceSuggestion_arr.append(obj.toJson());
    }
    object["priceSuggestion"] = priceSuggestion_arr;




    return object;

}

long
PriceSuggestOfferDTO::getMarketSku()
{
	return marketSku;
}

void
PriceSuggestOfferDTO::setMarketSku(long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
PriceSuggestOfferDTO::getOfferId()
{
	return offerId;
}

void
PriceSuggestOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::list<PriceSuggestDTO>
PriceSuggestOfferDTO::getPriceSuggestion()
{
	return priceSuggestion;
}

void
PriceSuggestOfferDTO::setPriceSuggestion(std::list <PriceSuggestDTO> priceSuggestion)
{
	this->priceSuggestion = priceSuggestion;
}



