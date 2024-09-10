

#include "UpdateCampaignOfferDTO.h"

using namespace Tiny;

UpdateCampaignOfferDTO::UpdateCampaignOfferDTO()
{
	offerId = std::string();
	quantum = QuantumDTO();
	available = bool(false);
	vat = int(0);
}

UpdateCampaignOfferDTO::UpdateCampaignOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateCampaignOfferDTO::~UpdateCampaignOfferDTO()
{

}

void
UpdateCampaignOfferDTO::fromJson(std::string jsonObj)
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

    const char *vatKey = "vat";

    if(object.has_key(vatKey))
    {
        bourne::json value = object[vatKey];



        jsonToValue(&vat, value, "int");


    }


}

bourne::json
UpdateCampaignOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["quantum"] = getQuantum().toJson();





    object["available"] = isAvailable();






    object["vat"] = getVat();



    return object;

}

std::string
UpdateCampaignOfferDTO::getOfferId()
{
	return offerId;
}

void
UpdateCampaignOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

QuantumDTO
UpdateCampaignOfferDTO::getQuantum()
{
	return quantum;
}

void
UpdateCampaignOfferDTO::setQuantum(QuantumDTO  quantum)
{
	this->quantum = quantum;
}

bool
UpdateCampaignOfferDTO::isAvailable()
{
	return available;
}

void
UpdateCampaignOfferDTO::setAvailable(bool  available)
{
	this->available = available;
}

int
UpdateCampaignOfferDTO::getVat()
{
	return vat;
}

void
UpdateCampaignOfferDTO::setVat(int  vat)
{
	this->vat = vat;
}



