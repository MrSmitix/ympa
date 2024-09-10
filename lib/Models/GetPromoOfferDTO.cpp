

#include "GetPromoOfferDTO.h"

using namespace Tiny;

GetPromoOfferDTO::GetPromoOfferDTO()
{
	offerId = std::string();
	status = PromoOfferParticipationStatusType();
	params = PromoOfferParamsDTO();
	autoParticipatingDetails = PromoOfferAutoParticipatingDetailsDTO();
}

GetPromoOfferDTO::GetPromoOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromoOfferDTO::~GetPromoOfferDTO()
{

}

void
GetPromoOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        PromoOfferParticipationStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *paramsKey = "params";

    if(object.has_key(paramsKey))
    {
        bourne::json value = object[paramsKey];




        PromoOfferParamsDTO* obj = &params;
		obj->fromJson(value.dump());

    }

    const char *autoParticipatingDetailsKey = "autoParticipatingDetails";

    if(object.has_key(autoParticipatingDetailsKey))
    {
        bourne::json value = object[autoParticipatingDetailsKey];




        PromoOfferAutoParticipatingDetailsDTO* obj = &autoParticipatingDetails;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetPromoOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["status"] = getStatus().toJson();






	object["params"] = getParams().toJson();






	object["autoParticipatingDetails"] = getAutoParticipatingDetails().toJson();


    return object;

}

std::string
GetPromoOfferDTO::getOfferId()
{
	return offerId;
}

void
GetPromoOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

PromoOfferParticipationStatusType
GetPromoOfferDTO::getStatus()
{
	return status;
}

void
GetPromoOfferDTO::setStatus(PromoOfferParticipationStatusType  status)
{
	this->status = status;
}

PromoOfferParamsDTO
GetPromoOfferDTO::getParams()
{
	return params;
}

void
GetPromoOfferDTO::setParams(PromoOfferParamsDTO  params)
{
	this->params = params;
}

PromoOfferAutoParticipatingDetailsDTO
GetPromoOfferDTO::getAutoParticipatingDetails()
{
	return autoParticipatingDetails;
}

void
GetPromoOfferDTO::setAutoParticipatingDetails(PromoOfferAutoParticipatingDetailsDTO  autoParticipatingDetails)
{
	this->autoParticipatingDetails = autoParticipatingDetails;
}



