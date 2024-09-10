

#include "OrdersStatsPaymentDTO.h"

using namespace Tiny;

OrdersStatsPaymentDTO::OrdersStatsPaymentDTO()
{
	id = std::string();
	date = std::string();
	type = OrdersStatsPaymentType();
	source = OrdersStatsPaymentSourceType();
	total = float(0);
	paymentOrder = OrdersStatsPaymentOrderDTO();
}

OrdersStatsPaymentDTO::OrdersStatsPaymentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsPaymentDTO::~OrdersStatsPaymentDTO()
{

}

void
OrdersStatsPaymentDTO::fromJson(std::string jsonObj)
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

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OrdersStatsPaymentType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *sourceKey = "source";

    if(object.has_key(sourceKey))
    {
        bourne::json value = object[sourceKey];




        OrdersStatsPaymentSourceType* obj = &source;
		obj->fromJson(value.dump());

    }

    const char *totalKey = "total";

    if(object.has_key(totalKey))
    {
        bourne::json value = object[totalKey];



        jsonToValue(&total, value, "long");


    }

    const char *paymentOrderKey = "paymentOrder";

    if(object.has_key(paymentOrderKey))
    {
        bourne::json value = object[paymentOrderKey];




        OrdersStatsPaymentOrderDTO* obj = &paymentOrder;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrdersStatsPaymentDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["date"] = getDate().toJson();






	object["type"] = getType().toJson();






	object["source"] = getSource().toJson();





    object["total"] = getTotal();







	object["paymentOrder"] = getPaymentOrder().toJson();


    return object;

}

std::string
OrdersStatsPaymentDTO::getId()
{
	return id;
}

void
OrdersStatsPaymentDTO::setId(std::string  id)
{
	this->id = id;
}

Date
OrdersStatsPaymentDTO::getDate()
{
	return date;
}

void
OrdersStatsPaymentDTO::setDate(Date  date)
{
	this->date = date;
}

OrdersStatsPaymentType
OrdersStatsPaymentDTO::getType()
{
	return type;
}

void
OrdersStatsPaymentDTO::setType(OrdersStatsPaymentType  type)
{
	this->type = type;
}

OrdersStatsPaymentSourceType
OrdersStatsPaymentDTO::getSource()
{
	return source;
}

void
OrdersStatsPaymentDTO::setSource(OrdersStatsPaymentSourceType  source)
{
	this->source = source;
}

long
OrdersStatsPaymentDTO::getTotal()
{
	return total;
}

void
OrdersStatsPaymentDTO::setTotal(long  total)
{
	this->total = total;
}

OrdersStatsPaymentOrderDTO
OrdersStatsPaymentDTO::getPaymentOrder()
{
	return paymentOrder;
}

void
OrdersStatsPaymentDTO::setPaymentOrder(OrdersStatsPaymentOrderDTO  paymentOrder)
{
	this->paymentOrder = paymentOrder;
}



