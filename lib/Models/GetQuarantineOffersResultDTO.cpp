

#include "GetQuarantineOffersResultDTO.h"

using namespace Tiny;

GetQuarantineOffersResultDTO::GetQuarantineOffersResultDTO()
{
	paging = ScrollingPagerDTO();
	offers = std::list<QuarantineOfferDTO>();
}

GetQuarantineOffersResultDTO::GetQuarantineOffersResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetQuarantineOffersResultDTO::~GetQuarantineOffersResultDTO()
{

}

void
GetQuarantineOffersResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<QuarantineOfferDTO> offers_list;
        QuarantineOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
GetQuarantineOffersResultDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["paging"] = getPaging().toJson();




    std::list<QuarantineOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        QuarantineOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

ScrollingPagerDTO
GetQuarantineOffersResultDTO::getPaging()
{
	return paging;
}

void
GetQuarantineOffersResultDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<QuarantineOfferDTO>
GetQuarantineOffersResultDTO::getOffers()
{
	return offers;
}

void
GetQuarantineOffersResultDTO::setOffers(std::list <QuarantineOfferDTO> offers)
{
	this->offers = offers;
}



