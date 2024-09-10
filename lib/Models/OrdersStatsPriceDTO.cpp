

#include "OrdersStatsPriceDTO.h"

using namespace Tiny;

OrdersStatsPriceDTO::OrdersStatsPriceDTO()
{
	type = OrdersStatsPriceType();
	costPerItem = float(0);
	total = float(0);
}

OrdersStatsPriceDTO::OrdersStatsPriceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsPriceDTO::~OrdersStatsPriceDTO()
{

}

void
OrdersStatsPriceDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OrdersStatsPriceType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *costPerItemKey = "costPerItem";

    if(object.has_key(costPerItemKey))
    {
        bourne::json value = object[costPerItemKey];



        jsonToValue(&costPerItem, value, "long");


    }

    const char *totalKey = "total";

    if(object.has_key(totalKey))
    {
        bourne::json value = object[totalKey];



        jsonToValue(&total, value, "long");


    }


}

bourne::json
OrdersStatsPriceDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["costPerItem"] = getCostPerItem();






    object["total"] = getTotal();



    return object;

}

OrdersStatsPriceType
OrdersStatsPriceDTO::getType()
{
	return type;
}

void
OrdersStatsPriceDTO::setType(OrdersStatsPriceType  type)
{
	this->type = type;
}

long
OrdersStatsPriceDTO::getCostPerItem()
{
	return costPerItem;
}

void
OrdersStatsPriceDTO::setCostPerItem(long  costPerItem)
{
	this->costPerItem = costPerItem;
}

long
OrdersStatsPriceDTO::getTotal()
{
	return total;
}

void
OrdersStatsPriceDTO::setTotal(long  total)
{
	this->total = total;
}



