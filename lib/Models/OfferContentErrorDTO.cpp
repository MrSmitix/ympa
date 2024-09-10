

#include "OfferContentErrorDTO.h"

using namespace Tiny;

OfferContentErrorDTO::OfferContentErrorDTO()
{
	type = OfferContentErrorType();
	parameterId = long(0);
	message = std::string();
}

OfferContentErrorDTO::OfferContentErrorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferContentErrorDTO::~OfferContentErrorDTO()
{

}

void
OfferContentErrorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OfferContentErrorType* obj = &type;
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
OfferContentErrorDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["parameterId"] = getParameterId();






    object["message"] = getMessage();



    return object;

}

OfferContentErrorType
OfferContentErrorDTO::getType()
{
	return type;
}

void
OfferContentErrorDTO::setType(OfferContentErrorType  type)
{
	this->type = type;
}

long
OfferContentErrorDTO::getParameterId()
{
	return parameterId;
}

void
OfferContentErrorDTO::setParameterId(long  parameterId)
{
	this->parameterId = parameterId;
}

std::string
OfferContentErrorDTO::getMessage()
{
	return message;
}

void
OfferContentErrorDTO::setMessage(std::string  message)
{
	this->message = message;
}



