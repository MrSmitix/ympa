

#include "OfferCardStatusType.h"

using namespace Tiny;

OfferCardStatusType::OfferCardStatusType()
{
}

OfferCardStatusType::OfferCardStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferCardStatusType::~OfferCardStatusType()
{

}

void
OfferCardStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferCardStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



