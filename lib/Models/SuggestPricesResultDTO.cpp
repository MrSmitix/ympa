

#include "SuggestPricesResultDTO.h"

using namespace Tiny;

SuggestPricesResultDTO::SuggestPricesResultDTO()
{
	offers = std::list<PriceSuggestOfferDTO>();
}

SuggestPricesResultDTO::SuggestPricesResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

SuggestPricesResultDTO::~SuggestPricesResultDTO()
{

}

void
SuggestPricesResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<PriceSuggestOfferDTO> offers_list;
        PriceSuggestOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
SuggestPricesResultDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<PriceSuggestOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        PriceSuggestOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<PriceSuggestOfferDTO>
SuggestPricesResultDTO::getOffers()
{
	return offers;
}

void
SuggestPricesResultDTO::setOffers(std::list <PriceSuggestOfferDTO> offers)
{
	this->offers = offers;
}



