

#include "GetCampaignOfferDTO.h"

using namespace Tiny;

GetCampaignOfferDTO::GetCampaignOfferDTO()
{
	offerId = std::string();
	quantum = QuantumDTO();
	available = bool(false);
	basicPrice = GetPriceWithDiscountDTO();
	campaignPrice = GetPriceWithVatDTO();
	status = OfferCampaignStatusType();
	errors = std::list<OfferErrorDTO>();
	warnings = std::list<OfferErrorDTO>();
}

GetCampaignOfferDTO::GetCampaignOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCampaignOfferDTO::~GetCampaignOfferDTO()
{

}

void
GetCampaignOfferDTO::fromJson(std::string jsonObj)
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

    const char *basicPriceKey = "basicPrice";

    if(object.has_key(basicPriceKey))
    {
        bourne::json value = object[basicPriceKey];




        GetPriceWithDiscountDTO* obj = &basicPrice;
		obj->fromJson(value.dump());

    }

    const char *campaignPriceKey = "campaignPrice";

    if(object.has_key(campaignPriceKey))
    {
        bourne::json value = object[campaignPriceKey];




        GetPriceWithVatDTO* obj = &campaignPrice;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OfferCampaignStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<OfferErrorDTO> errors_list;
        OfferErrorDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }

    const char *warningsKey = "warnings";

    if(object.has_key(warningsKey))
    {
        bourne::json value = object[warningsKey];


        std::list<OfferErrorDTO> warnings_list;
        OfferErrorDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warnings_list.push_back(element);
        }
        warnings = warnings_list;


    }


}

bourne::json
GetCampaignOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["quantum"] = getQuantum().toJson();





    object["available"] = isAvailable();







	object["basicPrice"] = getBasicPrice().toJson();






	object["campaignPrice"] = getCampaignPrice().toJson();






	object["status"] = getStatus().toJson();




    std::list<OfferErrorDTO> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        OfferErrorDTO obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;






    std::list<OfferErrorDTO> warnings_list = getWarnings();
    bourne::json warnings_arr = bourne::json::array();

    for(auto& var : warnings_list)
    {
        OfferErrorDTO obj = var;
        warnings_arr.append(obj.toJson());
    }
    object["warnings"] = warnings_arr;




    return object;

}

std::string
GetCampaignOfferDTO::getOfferId()
{
	return offerId;
}

void
GetCampaignOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

QuantumDTO
GetCampaignOfferDTO::getQuantum()
{
	return quantum;
}

void
GetCampaignOfferDTO::setQuantum(QuantumDTO  quantum)
{
	this->quantum = quantum;
}

bool
GetCampaignOfferDTO::isAvailable()
{
	return available;
}

void
GetCampaignOfferDTO::setAvailable(bool  available)
{
	this->available = available;
}

GetPriceWithDiscountDTO
GetCampaignOfferDTO::getBasicPrice()
{
	return basicPrice;
}

void
GetCampaignOfferDTO::setBasicPrice(GetPriceWithDiscountDTO  basicPrice)
{
	this->basicPrice = basicPrice;
}

GetPriceWithVatDTO
GetCampaignOfferDTO::getCampaignPrice()
{
	return campaignPrice;
}

void
GetCampaignOfferDTO::setCampaignPrice(GetPriceWithVatDTO  campaignPrice)
{
	this->campaignPrice = campaignPrice;
}

OfferCampaignStatusType
GetCampaignOfferDTO::getStatus()
{
	return status;
}

void
GetCampaignOfferDTO::setStatus(OfferCampaignStatusType  status)
{
	this->status = status;
}

std::list<OfferErrorDTO>
GetCampaignOfferDTO::getErrors()
{
	return errors;
}

void
GetCampaignOfferDTO::setErrors(std::list <OfferErrorDTO> errors)
{
	this->errors = errors;
}

std::list<OfferErrorDTO>
GetCampaignOfferDTO::getWarnings()
{
	return warnings;
}

void
GetCampaignOfferDTO::setWarnings(std::list <OfferErrorDTO> warnings)
{
	this->warnings = warnings;
}



