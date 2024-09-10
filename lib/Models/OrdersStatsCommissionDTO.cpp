

#include "OrdersStatsCommissionDTO.h"

using namespace Tiny;

OrdersStatsCommissionDTO::OrdersStatsCommissionDTO()
{
	type = OrdersStatsCommissionType();
	actual = float(0);
}

OrdersStatsCommissionDTO::OrdersStatsCommissionDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsCommissionDTO::~OrdersStatsCommissionDTO()
{

}

void
OrdersStatsCommissionDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OrdersStatsCommissionType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *actualKey = "actual";

    if(object.has_key(actualKey))
    {
        bourne::json value = object[actualKey];



        jsonToValue(&actual, value, "long");


    }


}

bourne::json
OrdersStatsCommissionDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["actual"] = getActual();



    return object;

}

OrdersStatsCommissionType
OrdersStatsCommissionDTO::getType()
{
	return type;
}

void
OrdersStatsCommissionDTO::setType(OrdersStatsCommissionType  type)
{
	this->type = type;
}

long
OrdersStatsCommissionDTO::getActual()
{
	return actual;
}

void
OrdersStatsCommissionDTO::setActual(long  actual)
{
	this->actual = actual;
}



