

#include "OrderDeliveryDatesDTO.h"

using namespace Tiny;

OrderDeliveryDatesDTO::OrderDeliveryDatesDTO()
{
	fromDate = std::string();
	toDate = std::string();
	fromTime = std::string();
	toTime = std::string();
	realDeliveryDate = std::string();
}

OrderDeliveryDatesDTO::OrderDeliveryDatesDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDeliveryDatesDTO::~OrderDeliveryDatesDTO()
{

}

void
OrderDeliveryDatesDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fromDateKey = "fromDate";

    if(object.has_key(fromDateKey))
    {
        bourne::json value = object[fromDateKey];



        jsonToValue(&fromDate, value, "std::string");


    }

    const char *toDateKey = "toDate";

    if(object.has_key(toDateKey))
    {
        bourne::json value = object[toDateKey];



        jsonToValue(&toDate, value, "std::string");


    }

    const char *fromTimeKey = "fromTime";

    if(object.has_key(fromTimeKey))
    {
        bourne::json value = object[fromTimeKey];



        jsonToValue(&fromTime, value, "std::string");


    }

    const char *toTimeKey = "toTime";

    if(object.has_key(toTimeKey))
    {
        bourne::json value = object[toTimeKey];



        jsonToValue(&toTime, value, "std::string");


    }

    const char *realDeliveryDateKey = "realDeliveryDate";

    if(object.has_key(realDeliveryDateKey))
    {
        bourne::json value = object[realDeliveryDateKey];



        jsonToValue(&realDeliveryDate, value, "std::string");


    }


}

bourne::json
OrderDeliveryDatesDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["fromDate"] = getFromDate();






    object["toDate"] = getToDate();






    object["fromTime"] = getFromTime();






    object["toTime"] = getToTime();






    object["realDeliveryDate"] = getRealDeliveryDate();



    return object;

}

std::string
OrderDeliveryDatesDTO::getFromDate()
{
	return fromDate;
}

void
OrderDeliveryDatesDTO::setFromDate(std::string  fromDate)
{
	this->fromDate = fromDate;
}

std::string
OrderDeliveryDatesDTO::getToDate()
{
	return toDate;
}

void
OrderDeliveryDatesDTO::setToDate(std::string  toDate)
{
	this->toDate = toDate;
}

std::string
OrderDeliveryDatesDTO::getFromTime()
{
	return fromTime;
}

void
OrderDeliveryDatesDTO::setFromTime(std::string  fromTime)
{
	this->fromTime = fromTime;
}

std::string
OrderDeliveryDatesDTO::getToTime()
{
	return toTime;
}

void
OrderDeliveryDatesDTO::setToTime(std::string  toTime)
{
	this->toTime = toTime;
}

std::string
OrderDeliveryDatesDTO::getRealDeliveryDate()
{
	return realDeliveryDate;
}

void
OrderDeliveryDatesDTO::setRealDeliveryDate(std::string  realDeliveryDate)
{
	this->realDeliveryDate = realDeliveryDate;
}



