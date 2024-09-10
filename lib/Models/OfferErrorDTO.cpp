

#include "OfferErrorDTO.h"

using namespace Tiny;

OfferErrorDTO::OfferErrorDTO()
{
	message = std::string();
	comment = std::string();
}

OfferErrorDTO::OfferErrorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferErrorDTO::~OfferErrorDTO()
{

}

void
OfferErrorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *commentKey = "comment";

    if(object.has_key(commentKey))
    {
        bourne::json value = object[commentKey];



        jsonToValue(&comment, value, "std::string");


    }


}

bourne::json
OfferErrorDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["message"] = getMessage();






    object["comment"] = getComment();



    return object;

}

std::string
OfferErrorDTO::getMessage()
{
	return message;
}

void
OfferErrorDTO::setMessage(std::string  message)
{
	this->message = message;
}

std::string
OfferErrorDTO::getComment()
{
	return comment;
}

void
OfferErrorDTO::setComment(std::string  comment)
{
	this->comment = comment;
}



