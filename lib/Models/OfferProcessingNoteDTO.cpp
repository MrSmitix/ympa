

#include "OfferProcessingNoteDTO.h"

using namespace Tiny;

OfferProcessingNoteDTO::OfferProcessingNoteDTO()
{
	type = OfferProcessingNoteType();
	payload = std::string();
}

OfferProcessingNoteDTO::OfferProcessingNoteDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferProcessingNoteDTO::~OfferProcessingNoteDTO()
{

}

void
OfferProcessingNoteDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OfferProcessingNoteType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *payloadKey = "payload";

    if(object.has_key(payloadKey))
    {
        bourne::json value = object[payloadKey];



        jsonToValue(&payload, value, "std::string");


    }


}

bourne::json
OfferProcessingNoteDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["payload"] = getPayload();



    return object;

}

OfferProcessingNoteType
OfferProcessingNoteDTO::getType()
{
	return type;
}

void
OfferProcessingNoteDTO::setType(OfferProcessingNoteType  type)
{
	this->type = type;
}

std::string
OfferProcessingNoteDTO::getPayload()
{
	return payload;
}

void
OfferProcessingNoteDTO::setPayload(std::string  payload)
{
	this->payload = payload;
}



