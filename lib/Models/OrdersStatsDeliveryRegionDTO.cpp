

#include "OrdersStatsDeliveryRegionDTO.h"

using namespace Tiny;

OrdersStatsDeliveryRegionDTO::OrdersStatsDeliveryRegionDTO()
{
	id = long(0);
	name = std::string();
}

OrdersStatsDeliveryRegionDTO::OrdersStatsDeliveryRegionDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsDeliveryRegionDTO::~OrdersStatsDeliveryRegionDTO()
{

}

void
OrdersStatsDeliveryRegionDTO::fromJson(std::string jsonObj)
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
OrdersStatsDeliveryRegionDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();



    return object;

}

long
OrdersStatsDeliveryRegionDTO::getId()
{
	return id;
}

void
OrdersStatsDeliveryRegionDTO::setId(long  id)
{
	this->id = id;
}

std::string
OrdersStatsDeliveryRegionDTO::getName()
{
	return name;
}

void
OrdersStatsDeliveryRegionDTO::setName(std::string  name)
{
	this->name = name;
}



