

#include "OrdersStatsWarehouseDTO.h"

using namespace Tiny;

OrdersStatsWarehouseDTO::OrdersStatsWarehouseDTO()
{
	id = long(0);
	name = std::string();
}

OrdersStatsWarehouseDTO::OrdersStatsWarehouseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsWarehouseDTO::~OrdersStatsWarehouseDTO()
{

}

void
OrdersStatsWarehouseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
OrdersStatsWarehouseDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();



    return object;

}

long
OrdersStatsWarehouseDTO::getId()
{
	return id;
}

void
OrdersStatsWarehouseDTO::setId(long  id)
{
	this->id = id;
}

std::string
OrdersStatsWarehouseDTO::getName()
{
	return name;
}

void
OrdersStatsWarehouseDTO::setName(std::string  name)
{
	this->name = name;
}



