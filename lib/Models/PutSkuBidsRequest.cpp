

#include "PutSkuBidsRequest.h"

using namespace Tiny;

PutSkuBidsRequest::PutSkuBidsRequest()
{
	bids = std::list<SkuBidItemDTO>();
}

PutSkuBidsRequest::PutSkuBidsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

PutSkuBidsRequest::~PutSkuBidsRequest()
{

}

void
PutSkuBidsRequest::fromJson(std::string jsonObj)
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


}

bourne::json
PutSkuBidsRequest::toJson()
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




    return object;

}

std::list<SkuBidItemDTO>
PutSkuBidsRequest::getBids()
{
	return bids;
}

void
PutSkuBidsRequest::setBids(std::list <SkuBidItemDTO> bids)
{
	this->bids = bids;
}



