

#include "OfferPriceByOfferIdsListResponseDTO.h"

using namespace Tiny;

OfferPriceByOfferIdsListResponseDTO::OfferPriceByOfferIdsListResponseDTO()
{
	offers = std::list<OfferPriceByOfferIdsResponseDTO>();
	paging = ScrollingPagerDTO();
}

OfferPriceByOfferIdsListResponseDTO::OfferPriceByOfferIdsListResponseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferPriceByOfferIdsListResponseDTO::~OfferPriceByOfferIdsListResponseDTO()
{

}

void
OfferPriceByOfferIdsListResponseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<OfferPriceByOfferIdsResponseDTO> offers_list;
        OfferPriceByOfferIdsResponseDTO element;
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




        ScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }


}

bourne::json
OfferPriceByOfferIdsListResponseDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OfferPriceByOfferIdsResponseDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        OfferPriceByOfferIdsResponseDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

std::list<OfferPriceByOfferIdsResponseDTO>
OfferPriceByOfferIdsListResponseDTO::getOffers()
{
	return offers;
}

void
OfferPriceByOfferIdsListResponseDTO::setOffers(std::list <OfferPriceByOfferIdsResponseDTO> offers)
{
	this->offers = offers;
}

ScrollingPagerDTO
OfferPriceByOfferIdsListResponseDTO::getPaging()
{
	return paging;
}

void
OfferPriceByOfferIdsListResponseDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}



