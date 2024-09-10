

#include "OfferConditionQualityType.h"

using namespace Tiny;

OfferConditionQualityType::OfferConditionQualityType()
{
}

OfferConditionQualityType::OfferConditionQualityType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferConditionQualityType::~OfferConditionQualityType()
{

}

void
OfferConditionQualityType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferConditionQualityType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



