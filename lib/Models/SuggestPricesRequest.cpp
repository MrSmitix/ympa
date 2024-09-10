

#include "SuggestPricesRequest.h"

using namespace Tiny;

SuggestPricesRequest::SuggestPricesRequest()
{
	offers = std::list<SuggestOfferPriceDTO>();
}

SuggestPricesRequest::SuggestPricesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SuggestPricesRequest::~SuggestPricesRequest()
{

}

void
SuggestPricesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<SuggestOfferPriceDTO> offers_list;
        SuggestOfferPriceDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
SuggestPricesRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<SuggestOfferPriceDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        SuggestOfferPriceDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<SuggestOfferPriceDTO>
SuggestPricesRequest::getOffers()
{
	return offers;
}

void
SuggestPricesRequest::setOffers(std::list <SuggestOfferPriceDTO> offers)
{
	this->offers = offers;
}



