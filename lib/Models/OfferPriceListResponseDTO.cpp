

#include "OfferPriceListResponseDTO.h"

using namespace Tiny;

OfferPriceListResponseDTO::OfferPriceListResponseDTO()
{
	offers = std::list<OfferPriceResponseDTO>();
	paging = ScrollingPagerDTO();
	total = int(0);
}

OfferPriceListResponseDTO::OfferPriceListResponseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferPriceListResponseDTO::~OfferPriceListResponseDTO()
{

}

void
OfferPriceListResponseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<OfferPriceResponseDTO> offers_list;
        OfferPriceResponseDTO element;
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

    const char *totalKey = "total";

    if(object.has_key(totalKey))
    {
        bourne::json value = object[totalKey];



        jsonToValue(&total, value, "int");


    }


}

bourne::json
OfferPriceListResponseDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OfferPriceResponseDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        OfferPriceResponseDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;








	object["paging"] = getPaging().toJson();





    object["total"] = getTotal();



    return object;

}

std::list<OfferPriceResponseDTO>
OfferPriceListResponseDTO::getOffers()
{
	return offers;
}

void
OfferPriceListResponseDTO::setOffers(std::list <OfferPriceResponseDTO> offers)
{
	this->offers = offers;
}

ScrollingPagerDTO
OfferPriceListResponseDTO::getPaging()
{
	return paging;
}

void
OfferPriceListResponseDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

int
OfferPriceListResponseDTO::getTotal()
{
	return total;
}

void
OfferPriceListResponseDTO::setTotal(int  total)
{
	this->total = total;
}



