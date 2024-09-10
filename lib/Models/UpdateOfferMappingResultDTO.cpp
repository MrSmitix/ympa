

#include "UpdateOfferMappingResultDTO.h"

using namespace Tiny;

UpdateOfferMappingResultDTO::UpdateOfferMappingResultDTO()
{
	offerId = std::string();
	errors = std::list<OfferMappingErrorDTO>();
	warnings = std::list<OfferMappingErrorDTO>();
}

UpdateOfferMappingResultDTO::UpdateOfferMappingResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOfferMappingResultDTO::~UpdateOfferMappingResultDTO()
{

}

void
UpdateOfferMappingResultDTO::fromJson(std::string jsonObj)
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


        std::list<OfferMappingErrorDTO> errors_list;
        OfferMappingErrorDTO element;
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


        std::list<OfferMappingErrorDTO> warnings_list;
        OfferMappingErrorDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warnings_list.push_back(element);
        }
        warnings = warnings_list;


    }


}

bourne::json
UpdateOfferMappingResultDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();





    std::list<OfferMappingErrorDTO> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        OfferMappingErrorDTO obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;






    std::list<OfferMappingErrorDTO> warnings_list = getWarnings();
    bourne::json warnings_arr = bourne::json::array();

    for(auto& var : warnings_list)
    {
        OfferMappingErrorDTO obj = var;
        warnings_arr.append(obj.toJson());
    }
    object["warnings"] = warnings_arr;




    return object;

}

std::string
UpdateOfferMappingResultDTO::getOfferId()
{
	return offerId;
}

void
UpdateOfferMappingResultDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::list<OfferMappingErrorDTO>
UpdateOfferMappingResultDTO::getErrors()
{
	return errors;
}

void
UpdateOfferMappingResultDTO::setErrors(std::list <OfferMappingErrorDTO> errors)
{
	this->errors = errors;
}

std::list<OfferMappingErrorDTO>
UpdateOfferMappingResultDTO::getWarnings()
{
	return warnings;
}

void
UpdateOfferMappingResultDTO::setWarnings(std::list <OfferMappingErrorDTO> warnings)
{
	this->warnings = warnings;
}



