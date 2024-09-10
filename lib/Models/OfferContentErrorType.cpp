

#include "OfferContentErrorType.h"

using namespace Tiny;

OfferContentErrorType::OfferContentErrorType()
{
}

OfferContentErrorType::OfferContentErrorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferContentErrorType::~OfferContentErrorType()
{

}

void
OfferContentErrorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OfferContentErrorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



