

#include "DocumentDTO.h"

using namespace Tiny;

DocumentDTO::DocumentDTO()
{
	status = OrderDocumentStatusType();
	number = std::string();
	date = std::string();
}

DocumentDTO::DocumentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

DocumentDTO::~DocumentDTO()
{

}

void
DocumentDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OrderDocumentStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *numberKey = "number";

    if(object.has_key(numberKey))
    {
        bourne::json value = object[numberKey];



        jsonToValue(&number, value, "std::string");


    }

    const char *dateKey = "date";

    if(object.has_key(dateKey))
    {
        bourne::json value = object[dateKey];




        Date* obj = &date;
		obj->fromJson(value.dump());

    }


}

bourne::json
DocumentDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();





    object["number"] = getNumber();







	object["date"] = getDate().toJson();


    return object;

}

OrderDocumentStatusType
DocumentDTO::getStatus()
{
	return status;
}

void
DocumentDTO::setStatus(OrderDocumentStatusType  status)
{
	this->status = status;
}

std::string
DocumentDTO::getNumber()
{
	return number;
}

void
DocumentDTO::setNumber(std::string  number)
{
	this->number = number;
}

Date
DocumentDTO::getDate()
{
	return date;
}

void
DocumentDTO::setDate(Date  date)
{
	this->date = date;
}



