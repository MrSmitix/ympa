

#include "GetAllOffersResponse.h"

using namespace Tiny;

GetAllOffersResponse::GetAllOffersResponse()
{
	offers = std::list<OfferDTO>();
}

GetAllOffersResponse::GetAllOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetAllOffersResponse::~GetAllOffersResponse()
{

}

void
GetAllOffersResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<OfferDTO> offers_list;
        OfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
GetAllOffersResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        OfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<OfferDTO>
GetAllOffersResponse::getOffers()
{
	return offers;
}

void
GetAllOffersResponse::setOffers(std::list <OfferDTO> offers)
{
	this->offers = offers;
}



