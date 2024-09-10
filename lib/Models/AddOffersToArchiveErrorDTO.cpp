

#include "AddOffersToArchiveErrorDTO.h"

using namespace Tiny;

AddOffersToArchiveErrorDTO::AddOffersToArchiveErrorDTO()
{
	offerId = std::string();
	error = AddOffersToArchiveErrorType();
}

AddOffersToArchiveErrorDTO::AddOffersToArchiveErrorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

AddOffersToArchiveErrorDTO::~AddOffersToArchiveErrorDTO()
{

}

void
AddOffersToArchiveErrorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        AddOffersToArchiveErrorType* obj = &error;
		obj->fromJson(value.dump());

    }


}

bourne::json
AddOffersToArchiveErrorDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["error"] = getError().toJson();


    return object;

}

std::string
AddOffersToArchiveErrorDTO::getOfferId()
{
	return offerId;
}

void
AddOffersToArchiveErrorDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

AddOffersToArchiveErrorType
AddOffersToArchiveErrorDTO::getError()
{
	return error;
}

void
AddOffersToArchiveErrorDTO::setError(AddOffersToArchiveErrorType  error)
{
	this->error = error;
}



