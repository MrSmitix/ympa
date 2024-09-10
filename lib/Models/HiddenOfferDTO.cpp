

#include "HiddenOfferDTO.h"

using namespace Tiny;

HiddenOfferDTO::HiddenOfferDTO()
{
	offerId = std::string();
}

HiddenOfferDTO::HiddenOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

HiddenOfferDTO::~HiddenOfferDTO()
{

}

void
HiddenOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }


}

bourne::json
HiddenOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();



    return object;

}

std::string
HiddenOfferDTO::getOfferId()
{
	return offerId;
}

void
HiddenOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}



