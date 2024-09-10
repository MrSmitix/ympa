

#include "BidRecommendationItemDTO.h"

using namespace Tiny;

BidRecommendationItemDTO::BidRecommendationItemDTO()
{
	bid = int(0);
	showPercent = long(0);
}

BidRecommendationItemDTO::BidRecommendationItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidRecommendationItemDTO::~BidRecommendationItemDTO()
{

}

void
BidRecommendationItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bidKey = "bid";

    if(object.has_key(bidKey))
    {
        bourne::json value = object[bidKey];



        jsonToValue(&bid, value, "int");


    }

    const char *showPercentKey = "showPercent";

    if(object.has_key(showPercentKey))
    {
        bourne::json value = object[showPercentKey];



        jsonToValue(&showPercent, value, "long");


    }


}

bourne::json
BidRecommendationItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["bid"] = getBid();






    object["showPercent"] = getShowPercent();



    return object;

}

int
BidRecommendationItemDTO::getBid()
{
	return bid;
}

void
BidRecommendationItemDTO::setBid(int  bid)
{
	this->bid = bid;
}

long
BidRecommendationItemDTO::getShowPercent()
{
	return showPercent;
}

void
BidRecommendationItemDTO::setShowPercent(long  showPercent)
{
	this->showPercent = showPercent;
}



