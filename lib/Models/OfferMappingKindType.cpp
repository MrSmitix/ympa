

#include "OfferMappingKindType.h"

using namespace Tiny;

OfferMappingKindType::OfferMappingKindType()
{
}

OfferMappingKindType::OfferMappingKindType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferMappingKindType::~OfferMappingKindType()
{

}

void
OfferMappingKindType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferMappingKindType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



