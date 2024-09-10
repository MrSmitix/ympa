

#include "RejectedPromoOfferDeleteReasonType.h"

using namespace Tiny;

RejectedPromoOfferDeleteReasonType::RejectedPromoOfferDeleteReasonType()
{
}

RejectedPromoOfferDeleteReasonType::RejectedPromoOfferDeleteReasonType(std::string jsonString)
{
	this->fromJson(jsonString);
}

RejectedPromoOfferDeleteReasonType::~RejectedPromoOfferDeleteReasonType()
{

}

void
RejectedPromoOfferDeleteReasonType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
RejectedPromoOfferDeleteReasonType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



