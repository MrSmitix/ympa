

#include "GetPromoAssortmentInfoDTO.h"

using namespace Tiny;

GetPromoAssortmentInfoDTO::GetPromoAssortmentInfoDTO()
{
	activeOffers = int(0);
	potentialOffers = int(0);
	processing = bool(false);
}

GetPromoAssortmentInfoDTO::GetPromoAssortmentInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromoAssortmentInfoDTO::~GetPromoAssortmentInfoDTO()
{

}

void
GetPromoAssortmentInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *activeOffersKey = "activeOffers";

    if(object.has_key(activeOffersKey))
    {
        bourne::json value = object[activeOffersKey];



        jsonToValue(&activeOffers, value, "int");


    }

    const char *potentialOffersKey = "potentialOffers";

    if(object.has_key(potentialOffersKey))
    {
        bourne::json value = object[potentialOffersKey];



        jsonToValue(&potentialOffers, value, "int");


    }

    const char *processingKey = "processing";

    if(object.has_key(processingKey))
    {
        bourne::json value = object[processingKey];



        jsonToValue(&processing, value, "bool");


    }


}

bourne::json
GetPromoAssortmentInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["activeOffers"] = getActiveOffers();






    object["potentialOffers"] = getPotentialOffers();






    object["processing"] = isProcessing();



    return object;

}

int
GetPromoAssortmentInfoDTO::getActiveOffers()
{
	return activeOffers;
}

void
GetPromoAssortmentInfoDTO::setActiveOffers(int  activeOffers)
{
	this->activeOffers = activeOffers;
}

int
GetPromoAssortmentInfoDTO::getPotentialOffers()
{
	return potentialOffers;
}

void
GetPromoAssortmentInfoDTO::setPotentialOffers(int  potentialOffers)
{
	this->potentialOffers = potentialOffers;
}

bool
GetPromoAssortmentInfoDTO::isProcessing()
{
	return processing;
}

void
GetPromoAssortmentInfoDTO::setProcessing(bool  processing)
{
	this->processing = processing;
}



