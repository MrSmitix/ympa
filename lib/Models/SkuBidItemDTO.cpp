

#include "SkuBidItemDTO.h"

using namespace Tiny;

SkuBidItemDTO::SkuBidItemDTO()
{
	sku = std::string();
	bid = int(0);
}

SkuBidItemDTO::SkuBidItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

SkuBidItemDTO::~SkuBidItemDTO()
{

}

void
SkuBidItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *skuKey = "sku";

    if(object.has_key(skuKey))
    {
        bourne::json value = object[skuKey];



        jsonToValue(&sku, value, "std::string");


    }

    const char *bidKey = "bid";

    if(object.has_key(bidKey))
    {
        bourne::json value = object[bidKey];



        jsonToValue(&bid, value, "int");


    }


}

bourne::json
SkuBidItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["sku"] = getSku();






    object["bid"] = getBid();



    return object;

}

std::string
SkuBidItemDTO::getSku()
{
	return sku;
}

void
SkuBidItemDTO::setSku(std::string  sku)
{
	this->sku = sku;
}

int
SkuBidItemDTO::getBid()
{
	return bid;
}

void
SkuBidItemDTO::setBid(int  bid)
{
	this->bid = bid;
}



