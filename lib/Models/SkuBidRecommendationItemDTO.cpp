

#include "SkuBidRecommendationItemDTO.h"

using namespace Tiny;

SkuBidRecommendationItemDTO::SkuBidRecommendationItemDTO()
{
	sku = std::string();
	bid = int(0);
	bidRecommendations = std::list<BidRecommendationItemDTO>();
	priceRecommendations = std::list<PriceRecommendationItemDTO>();
}

SkuBidRecommendationItemDTO::SkuBidRecommendationItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

SkuBidRecommendationItemDTO::~SkuBidRecommendationItemDTO()
{

}

void
SkuBidRecommendationItemDTO::fromJson(std::string jsonObj)
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

    const char *bidRecommendationsKey = "bidRecommendations";

    if(object.has_key(bidRecommendationsKey))
    {
        bourne::json value = object[bidRecommendationsKey];


        std::list<BidRecommendationItemDTO> bidRecommendations_list;
        BidRecommendationItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            bidRecommendations_list.push_back(element);
        }
        bidRecommendations = bidRecommendations_list;


    }

    const char *priceRecommendationsKey = "priceRecommendations";

    if(object.has_key(priceRecommendationsKey))
    {
        bourne::json value = object[priceRecommendationsKey];


        std::list<PriceRecommendationItemDTO> priceRecommendations_list;
        PriceRecommendationItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            priceRecommendations_list.push_back(element);
        }
        priceRecommendations = priceRecommendations_list;


    }


}

bourne::json
SkuBidRecommendationItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["sku"] = getSku();






    object["bid"] = getBid();





    std::list<BidRecommendationItemDTO> bidRecommendations_list = getBidRecommendations();
    bourne::json bidRecommendations_arr = bourne::json::array();

    for(auto& var : bidRecommendations_list)
    {
        BidRecommendationItemDTO obj = var;
        bidRecommendations_arr.append(obj.toJson());
    }
    object["bidRecommendations"] = bidRecommendations_arr;






    std::list<PriceRecommendationItemDTO> priceRecommendations_list = getPriceRecommendations();
    bourne::json priceRecommendations_arr = bourne::json::array();

    for(auto& var : priceRecommendations_list)
    {
        PriceRecommendationItemDTO obj = var;
        priceRecommendations_arr.append(obj.toJson());
    }
    object["priceRecommendations"] = priceRecommendations_arr;




    return object;

}

std::string
SkuBidRecommendationItemDTO::getSku()
{
	return sku;
}

void
SkuBidRecommendationItemDTO::setSku(std::string  sku)
{
	this->sku = sku;
}

int
SkuBidRecommendationItemDTO::getBid()
{
	return bid;
}

void
SkuBidRecommendationItemDTO::setBid(int  bid)
{
	this->bid = bid;
}

std::list<BidRecommendationItemDTO>
SkuBidRecommendationItemDTO::getBidRecommendations()
{
	return bidRecommendations;
}

void
SkuBidRecommendationItemDTO::setBidRecommendations(std::list <BidRecommendationItemDTO> bidRecommendations)
{
	this->bidRecommendations = bidRecommendations;
}

std::list<PriceRecommendationItemDTO>
SkuBidRecommendationItemDTO::getPriceRecommendations()
{
	return priceRecommendations;
}

void
SkuBidRecommendationItemDTO::setPriceRecommendations(std::list <PriceRecommendationItemDTO> priceRecommendations)
{
	this->priceRecommendations = priceRecommendations;
}



