

#include "OrdersStatsPaymentOrderDTO.h"

using namespace Tiny;

OrdersStatsPaymentOrderDTO::OrdersStatsPaymentOrderDTO()
{
	id = std::string();
	date = std::string();
}

OrdersStatsPaymentOrderDTO::OrdersStatsPaymentOrderDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsPaymentOrderDTO::~OrdersStatsPaymentOrderDTO()
{

}

void
OrdersStatsPaymentOrderDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


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
OrdersStatsPaymentOrderDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["date"] = getDate().toJson();


    return object;

}

std::string
OrdersStatsPaymentOrderDTO::getId()
{
	return id;
}

void
OrdersStatsPaymentOrderDTO::setId(std::string  id)
{
	this->id = id;
}

Date
OrdersStatsPaymentOrderDTO::getDate()
{
	return date;
}

void
OrdersStatsPaymentOrderDTO::setDate(Date  date)
{
	this->date = date;
}



