

#include "GetOffersResponse.h"

using namespace Tiny;

GetOffersResponse::GetOffersResponse()
{
	offers = std::list<OfferDTO>();
	pager = FlippingPagerDTO();
}

GetOffersResponse::GetOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOffersResponse::~GetOffersResponse()
{

}

void
GetOffersResponse::fromJson(std::string jsonObj)
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

    const char *pagerKey = "pager";

    if(object.has_key(pagerKey))
    {
        bourne::json value = object[pagerKey];




        FlippingPagerDTO* obj = &pager;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetOffersResponse::toJson()
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








	object["pager"] = getPager().toJson();


    return object;

}

std::list<OfferDTO>
GetOffersResponse::getOffers()
{
	return offers;
}

void
GetOffersResponse::setOffers(std::list <OfferDTO> offers)
{
	this->offers = offers;
}

FlippingPagerDTO
GetOffersResponse::getPager()
{
	return pager;
}

void
GetOffersResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}



