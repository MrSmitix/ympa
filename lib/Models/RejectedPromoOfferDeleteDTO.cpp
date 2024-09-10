

#include "RejectedPromoOfferDeleteDTO.h"

using namespace Tiny;

RejectedPromoOfferDeleteDTO::RejectedPromoOfferDeleteDTO()
{
	offerId = std::string();
	reason = RejectedPromoOfferDeleteReasonType();
}

RejectedPromoOfferDeleteDTO::RejectedPromoOfferDeleteDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

RejectedPromoOfferDeleteDTO::~RejectedPromoOfferDeleteDTO()
{

}

void
RejectedPromoOfferDeleteDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *reasonKey = "reason";

    if(object.has_key(reasonKey))
    {
        bourne::json value = object[reasonKey];




        RejectedPromoOfferDeleteReasonType* obj = &reason;
		obj->fromJson(value.dump());

    }


}

bourne::json
RejectedPromoOfferDeleteDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["reason"] = getReason().toJson();


    return object;

}

std::string
RejectedPromoOfferDeleteDTO::getOfferId()
{
	return offerId;
}

void
RejectedPromoOfferDeleteDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

RejectedPromoOfferDeleteReasonType
RejectedPromoOfferDeleteDTO::getReason()
{
	return reason;
}

void
RejectedPromoOfferDeleteDTO::setReason(RejectedPromoOfferDeleteReasonType  reason)
{
	this->reason = reason;
}



