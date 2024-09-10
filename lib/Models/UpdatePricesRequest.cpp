

#include "UpdatePricesRequest.h"

using namespace Tiny;

UpdatePricesRequest::UpdatePricesRequest()
{
	offers = std::list<OfferPriceDTO>();
}

UpdatePricesRequest::UpdatePricesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePricesRequest::~UpdatePricesRequest()
{

}

void
UpdatePricesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<OfferPriceDTO> offers_list;
        OfferPriceDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
UpdatePricesRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OfferPriceDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        OfferPriceDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<OfferPriceDTO>
UpdatePricesRequest::getOffers()
{
	return offers;
}

void
UpdatePricesRequest::setOffers(std::list <OfferPriceDTO> offers)
{
	this->offers = offers;
}



