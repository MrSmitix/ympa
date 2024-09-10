

#include "RejectedPromoOfferUpdateReasonType.h"

using namespace Tiny;

RejectedPromoOfferUpdateReasonType::RejectedPromoOfferUpdateReasonType()
{
}

RejectedPromoOfferUpdateReasonType::RejectedPromoOfferUpdateReasonType(std::string jsonString)
{
	this->fromJson(jsonString);
}

RejectedPromoOfferUpdateReasonType::~RejectedPromoOfferUpdateReasonType()
{

}

void
RejectedPromoOfferUpdateReasonType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
RejectedPromoOfferUpdateReasonType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



