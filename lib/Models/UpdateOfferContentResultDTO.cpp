

#include "UpdateOfferContentResultDTO.h"

using namespace Tiny;

UpdateOfferContentResultDTO::UpdateOfferContentResultDTO()
{
	offerId = std::string();
	errors = std::list<OfferContentErrorDTO>();
	warnings = std::list<OfferContentErrorDTO>();
}

UpdateOfferContentResultDTO::UpdateOfferContentResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOfferContentResultDTO::~UpdateOfferContentResultDTO()
{

}

void
UpdateOfferContentResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<OfferContentErrorDTO> errors_list;
        OfferContentErrorDTO element;
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


        std::list<OfferContentErrorDTO> warnings_list;
        OfferContentErrorDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warnings_list.push_back(element);
        }
        warnings = warnings_list;


    }


}

bourne::json
UpdateOfferContentResultDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();





    std::list<OfferContentErrorDTO> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        OfferContentErrorDTO obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;






    std::list<OfferContentErrorDTO> warnings_list = getWarnings();
    bourne::json warnings_arr = bourne::json::array();

    for(auto& var : warnings_list)
    {
        OfferContentErrorDTO obj = var;
        warnings_arr.append(obj.toJson());
    }
    object["warnings"] = warnings_arr;




    return object;

}

std::string
UpdateOfferContentResultDTO::getOfferId()
{
	return offerId;
}

void
UpdateOfferContentResultDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::list<OfferContentErrorDTO>
UpdateOfferContentResultDTO::getErrors()
{
	return errors;
}

void
UpdateOfferContentResultDTO::setErrors(std::list <OfferContentErrorDTO> errors)
{
	this->errors = errors;
}

std::list<OfferContentErrorDTO>
UpdateOfferContentResultDTO::getWarnings()
{
	return warnings;
}

void
UpdateOfferContentResultDTO::setWarnings(std::list <OfferContentErrorDTO> warnings)
{
	this->warnings = warnings;
}



