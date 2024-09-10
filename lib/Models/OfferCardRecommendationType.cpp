

#include "OfferCardRecommendationType.h"

using namespace Tiny;

OfferCardRecommendationType::OfferCardRecommendationType()
{
}

OfferCardRecommendationType::OfferCardRecommendationType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferCardRecommendationType::~OfferCardRecommendationType()
{

}

void
OfferCardRecommendationType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferCardRecommendationType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



