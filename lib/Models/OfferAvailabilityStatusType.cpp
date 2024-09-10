

#include "OfferAvailabilityStatusType.h"

using namespace Tiny;

OfferAvailabilityStatusType::OfferAvailabilityStatusType()
{
}

OfferAvailabilityStatusType::OfferAvailabilityStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferAvailabilityStatusType::~OfferAvailabilityStatusType()
{

}

void
OfferAvailabilityStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferAvailabilityStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



