

#include "GetPromoOffersResultDTO.h"

using namespace Tiny;

GetPromoOffersResultDTO::GetPromoOffersResultDTO()
{
	offers = std::list<GetPromoOfferDTO>();
	paging = ForwardScrollingPagerDTO();
}

GetPromoOffersResultDTO::GetPromoOffersResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromoOffersResultDTO::~GetPromoOffersResultDTO()
{

}

void
GetPromoOffersResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<GetPromoOfferDTO> offers_list;
        GetPromoOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ForwardScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetPromoOffersResultDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<GetPromoOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        GetPromoOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

std::list<GetPromoOfferDTO>
GetPromoOffersResultDTO::getOffers()
{
	return offers;
}

void
GetPromoOffersResultDTO::setOffers(std::list <GetPromoOfferDTO> offers)
{
	this->offers = offers;
}

ForwardScrollingPagerDTO
GetPromoOffersResultDTO::getPaging()
{
	return paging;
}

void
GetPromoOffersResultDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



