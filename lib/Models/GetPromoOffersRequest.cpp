

#include "GetPromoOffersRequest.h"

using namespace Tiny;

GetPromoOffersRequest::GetPromoOffersRequest()
{
	promoId = std::string();
	statusType = PromoOfferParticipationStatusFilterType();
}

GetPromoOffersRequest::GetPromoOffersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromoOffersRequest::~GetPromoOffersRequest()
{

}

void
GetPromoOffersRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *promoIdKey = "promoId";

    if(object.has_key(promoIdKey))
    {
        bourne::json value = object[promoIdKey];



        jsonToValue(&promoId, value, "std::string");


    }

    const char *statusTypeKey = "statusType";

    if(object.has_key(statusTypeKey))
    {
        bourne::json value = object[statusTypeKey];




        PromoOfferParticipationStatusFilterType* obj = &statusType;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetPromoOffersRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["promoId"] = getPromoId();







	object["statusType"] = getStatusType().toJson();


    return object;

}

std::string
GetPromoOffersRequest::getPromoId()
{
	return promoId;
}

void
GetPromoOffersRequest::setPromoId(std::string  promoId)
{
	this->promoId = promoId;
}

PromoOfferParticipationStatusFilterType
GetPromoOffersRequest::getStatusType()
{
	return statusType;
}

void
GetPromoOffersRequest::setStatusType(PromoOfferParticipationStatusFilterType  statusType)
{
	this->statusType = statusType;
}



