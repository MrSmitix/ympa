

#include "OfferSellingProgramStatusType.h"

using namespace Tiny;

OfferSellingProgramStatusType::OfferSellingProgramStatusType()
{
}

OfferSellingProgramStatusType::OfferSellingProgramStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferSellingProgramStatusType::~OfferSellingProgramStatusType()
{

}

void
OfferSellingProgramStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferSellingProgramStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



