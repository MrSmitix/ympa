

#include "GetHiddenOffersResultDTO.h"

using namespace Tiny;

GetHiddenOffersResultDTO::GetHiddenOffersResultDTO()
{
	paging = ScrollingPagerDTO();
	hiddenOffers = std::list<HiddenOfferDTO>();
}

GetHiddenOffersResultDTO::GetHiddenOffersResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetHiddenOffersResultDTO::~GetHiddenOffersResultDTO()
{

}

void
GetHiddenOffersResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }

    const char *hiddenOffersKey = "hiddenOffers";

    if(object.has_key(hiddenOffersKey))
    {
        bourne::json value = object[hiddenOffersKey];


        std::list<HiddenOfferDTO> hiddenOffers_list;
        HiddenOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            hiddenOffers_list.push_back(element);
        }
        hiddenOffers = hiddenOffers_list;


    }


}

bourne::json
GetHiddenOffersResultDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["paging"] = getPaging().toJson();




    std::list<HiddenOfferDTO> hiddenOffers_list = getHiddenOffers();
    bourne::json hiddenOffers_arr = bourne::json::array();

    for(auto& var : hiddenOffers_list)
    {
        HiddenOfferDTO obj = var;
        hiddenOffers_arr.append(obj.toJson());
    }
    object["hiddenOffers"] = hiddenOffers_arr;




    return object;

}

ScrollingPagerDTO
GetHiddenOffersResultDTO::getPaging()
{
	return paging;
}

void
GetHiddenOffersResultDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<HiddenOfferDTO>
GetHiddenOffersResultDTO::getHiddenOffers()
{
	return hiddenOffers;
}

void
GetHiddenOffersResultDTO::setHiddenOffers(std::list <HiddenOfferDTO> hiddenOffers)
{
	this->hiddenOffers = hiddenOffers;
}



