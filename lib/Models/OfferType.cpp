

#include "OfferType.h"

using namespace Tiny;

OfferType::OfferType()
{
}

OfferType::OfferType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferType::~OfferType()
{

}

void
OfferType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



