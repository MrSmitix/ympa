

#include "OfferMappingErrorDTO.h"

using namespace Tiny;

OfferMappingErrorDTO::OfferMappingErrorDTO()
{
	type = OfferMappingErrorType();
	parameterId = long(0);
	message = std::string();
}

OfferMappingErrorDTO::OfferMappingErrorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferMappingErrorDTO::~OfferMappingErrorDTO()
{

}

void
OfferMappingErrorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OfferMappingErrorType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *parameterIdKey = "parameterId";

    if(object.has_key(parameterIdKey))
    {
        bourne::json value = object[parameterIdKey];



        jsonToValue(&parameterId, value, "long");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
OfferMappingErrorDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["parameterId"] = getParameterId();






    object["message"] = getMessage();



    return object;

}

OfferMappingErrorType
OfferMappingErrorDTO::getType()
{
	return type;
}

void
OfferMappingErrorDTO::setType(OfferMappingErrorType  type)
{
	this->type = type;
}

long
OfferMappingErrorDTO::getParameterId()
{
	return parameterId;
}

void
OfferMappingErrorDTO::setParameterId(long  parameterId)
{
	this->parameterId = parameterId;
}

std::string
OfferMappingErrorDTO::getMessage()
{
	return message;
}

void
OfferMappingErrorDTO::setMessage(std::string  message)
{
	this->message = message;
}



