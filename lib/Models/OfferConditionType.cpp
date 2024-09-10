

#include "OfferConditionType.h"

using namespace Tiny;

OfferConditionType::OfferConditionType()
{
}

OfferConditionType::OfferConditionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferConditionType::~OfferConditionType()
{

}

void
OfferConditionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferConditionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



