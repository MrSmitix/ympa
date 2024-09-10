

#include "GetBidsInfoResponseDTO.h"

using namespace Tiny;

GetBidsInfoResponseDTO::GetBidsInfoResponseDTO()
{
	bids = std::list<SkuBidItemDTO>();
	paging = ForwardScrollingPagerDTO();
}

GetBidsInfoResponseDTO::GetBidsInfoResponseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBidsInfoResponseDTO::~GetBidsInfoResponseDTO()
{

}

void
GetBidsInfoResponseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bidsKey = "bids";

    if(object.has_key(bidsKey))
    {
        bourne::json value = object[bidsKey];


        std::list<SkuBidItemDTO> bids_list;
        SkuBidItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            bids_list.push_back(element);
        }
        bids = bids_list;


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
GetBidsInfoResponseDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<SkuBidItemDTO> bids_list = getBids();
    bourne::json bids_arr = bourne::json::array();

    for(auto& var : bids_list)
    {
        SkuBidItemDTO obj = var;
        bids_arr.append(obj.toJson());
    }
    object["bids"] = bids_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

std::list<SkuBidItemDTO>
GetBidsInfoResponseDTO::getBids()
{
	return bids;
}

void
GetBidsInfoResponseDTO::setBids(std::list <SkuBidItemDTO> bids)
{
	this->bids = bids;
}

ForwardScrollingPagerDTO
GetBidsInfoResponseDTO::getPaging()
{
	return paging;
}

void
GetBidsInfoResponseDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



