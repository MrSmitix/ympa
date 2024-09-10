

#include "BaseCampaignOfferDTO.h"

using namespace Tiny;

BaseCampaignOfferDTO::BaseCampaignOfferDTO()
{
	offerId = std::string();
	quantum = QuantumDTO();
	available = bool(false);
}

BaseCampaignOfferDTO::BaseCampaignOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

BaseCampaignOfferDTO::~BaseCampaignOfferDTO()
{

}

void
BaseCampaignOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *quantumKey = "quantum";

    if(object.has_key(quantumKey))
    {
        bourne::json value = object[quantumKey];




        QuantumDTO* obj = &quantum;
		obj->fromJson(value.dump());

    }

    const char *availableKey = "available";

    if(object.has_key(availableKey))
    {
        bourne::json value = object[availableKey];



        jsonToValue(&available, value, "bool");


    }


}

bourne::json
BaseCampaignOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["quantum"] = getQuantum().toJson();





    object["available"] = isAvailable();



    return object;

}

std::string
BaseCampaignOfferDTO::getOfferId()
{
	return offerId;
}

void
BaseCampaignOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

QuantumDTO
BaseCampaignOfferDTO::getQuantum()
{
	return quantum;
}

void
BaseCampaignOfferDTO::setQuantum(QuantumDTO  quantum)
{
	this->quantum = quantum;
}

bool
BaseCampaignOfferDTO::isAvailable()
{
	return available;
}

void
BaseCampaignOfferDTO::setAvailable(bool  available)
{
	this->available = available;
}



