

#include "OfferMappingErrorType.h"

using namespace Tiny;

OfferMappingErrorType::OfferMappingErrorType()
{
}

OfferMappingErrorType::OfferMappingErrorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferMappingErrorType::~OfferMappingErrorType()
{

}

void
OfferMappingErrorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferMappingErrorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



