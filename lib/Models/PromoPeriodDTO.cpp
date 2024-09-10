

#include "PromoPeriodDTO.h"

using namespace Tiny;

PromoPeriodDTO::PromoPeriodDTO()
{
	dateTimeFrom = std::string();
	dateTimeTo = std::string();
}

PromoPeriodDTO::PromoPeriodDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromoPeriodDTO::~PromoPeriodDTO()
{

}

void
PromoPeriodDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dateTimeFromKey = "dateTimeFrom";

    if(object.has_key(dateTimeFromKey))
    {
        bourne::json value = object[dateTimeFromKey];



        jsonToValue(&dateTimeFrom, value, "std::string");


    }

    const char *dateTimeToKey = "dateTimeTo";

    if(object.has_key(dateTimeToKey))
    {
        bourne::json value = object[dateTimeToKey];



        jsonToValue(&dateTimeTo, value, "std::string");


    }


}

bourne::json
PromoPeriodDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["dateTimeFrom"] = getDateTimeFrom();






    object["dateTimeTo"] = getDateTimeTo();



    return object;

}

std::string
PromoPeriodDTO::getDateTimeFrom()
{
	return dateTimeFrom;
}

void
PromoPeriodDTO::setDateTimeFrom(std::string  dateTimeFrom)
{
	this->dateTimeFrom = dateTimeFrom;
}

std::string
PromoPeriodDTO::getDateTimeTo()
{
	return dateTimeTo;
}

void
PromoPeriodDTO::setDateTimeTo(std::string  dateTimeTo)
{
	this->dateTimeTo = dateTimeTo;
}



