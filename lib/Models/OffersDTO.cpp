

#include "OffersDTO.h"

using namespace Tiny;

OffersDTO::OffersDTO()
{
	offers = std::list<OfferDTO>();
}

OffersDTO::OffersDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OffersDTO::~OffersDTO()
{

}

void
OffersDTO::fromJson(std::string jsonObj)
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
OffersDTO::toJson()
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
OffersDTO::getOffers()
{
	return offers;
}

void
OffersDTO::setOffers(std::list <OfferDTO> offers)
{
	this->offers = offers;
}



