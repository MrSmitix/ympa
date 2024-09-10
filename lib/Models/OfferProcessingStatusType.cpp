

#include "OfferProcessingStatusType.h"

using namespace Tiny;

OfferProcessingStatusType::OfferProcessingStatusType()
{
}

OfferProcessingStatusType::OfferProcessingStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferProcessingStatusType::~OfferProcessingStatusType()
{

}

void
OfferProcessingStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferProcessingStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



