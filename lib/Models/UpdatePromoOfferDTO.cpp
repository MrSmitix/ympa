

#include "UpdatePromoOfferDTO.h"

using namespace Tiny;

UpdatePromoOfferDTO::UpdatePromoOfferDTO()
{
	offerId = std::string();
	params = UpdatePromoOfferParamsDTO();
}

UpdatePromoOfferDTO::UpdatePromoOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePromoOfferDTO::~UpdatePromoOfferDTO()
{

}

void
UpdatePromoOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *paramsKey = "params";

    if(object.has_key(paramsKey))
    {
        bourne::json value = object[paramsKey];




        UpdatePromoOfferParamsDTO* obj = &params;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdatePromoOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["params"] = getParams().toJson();


    return object;

}

std::string
UpdatePromoOfferDTO::getOfferId()
{
	return offerId;
}

void
UpdatePromoOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

UpdatePromoOfferParamsDTO
UpdatePromoOfferDTO::getParams()
{
	return params;
}

void
UpdatePromoOfferDTO::setParams(UpdatePromoOfferParamsDTO  params)
{
	this->params = params;
}



