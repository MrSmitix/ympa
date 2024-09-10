

#include "GetCampaignOffersResultDTO.h"

using namespace Tiny;

GetCampaignOffersResultDTO::GetCampaignOffersResultDTO()
{
	paging = ScrollingPagerDTO();
	offers = std::list<GetCampaignOfferDTO>();
}

GetCampaignOffersResultDTO::GetCampaignOffersResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCampaignOffersResultDTO::~GetCampaignOffersResultDTO()
{

}

void
GetCampaignOffersResultDTO::fromJson(std::string jsonObj)
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


        std::list<GetCampaignOfferDTO> offers_list;
        GetCampaignOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
GetCampaignOffersResultDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["paging"] = getPaging().toJson();




    std::list<GetCampaignOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        GetCampaignOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

ScrollingPagerDTO
GetCampaignOffersResultDTO::getPaging()
{
	return paging;
}

void
GetCampaignOffersResultDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<GetCampaignOfferDTO>
GetCampaignOffersResultDTO::getOffers()
{
	return offers;
}

void
GetCampaignOffersResultDTO::setOffers(std::list <GetCampaignOfferDTO> offers)
{
	this->offers = offers;
}



