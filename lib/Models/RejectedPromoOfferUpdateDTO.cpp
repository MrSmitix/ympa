

#include "RejectedPromoOfferUpdateDTO.h"

using namespace Tiny;

RejectedPromoOfferUpdateDTO::RejectedPromoOfferUpdateDTO()
{
	offerId = std::string();
	reason = RejectedPromoOfferUpdateReasonType();
}

RejectedPromoOfferUpdateDTO::RejectedPromoOfferUpdateDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

RejectedPromoOfferUpdateDTO::~RejectedPromoOfferUpdateDTO()
{

}

void
RejectedPromoOfferUpdateDTO::fromJson(std::string jsonObj)
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




        RejectedPromoOfferUpdateReasonType* obj = &reason;
		obj->fromJson(value.dump());

    }


}

bourne::json
RejectedPromoOfferUpdateDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["reason"] = getReason().toJson();


    return object;

}

std::string
RejectedPromoOfferUpdateDTO::getOfferId()
{
	return offerId;
}

void
RejectedPromoOfferUpdateDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

RejectedPromoOfferUpdateReasonType
RejectedPromoOfferUpdateDTO::getReason()
{
	return reason;
}

void
RejectedPromoOfferUpdateDTO::setReason(RejectedPromoOfferUpdateReasonType  reason)
{
	this->reason = reason;
}



