

#include "PartnerShipmentWarehouseDTO.h"

using namespace Tiny;

PartnerShipmentWarehouseDTO::PartnerShipmentWarehouseDTO()
{
	id = long(0);
	name = std::string();
	address = std::string();
}

PartnerShipmentWarehouseDTO::PartnerShipmentWarehouseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PartnerShipmentWarehouseDTO::~PartnerShipmentWarehouseDTO()
{

}

void
PartnerShipmentWarehouseDTO::fromJson(std::string jsonObj)
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

    const char *addressKey = "address";

    if(object.has_key(addressKey))
    {
        bourne::json value = object[addressKey];



        jsonToValue(&address, value, "std::string");


    }


}

bourne::json
PartnerShipmentWarehouseDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["address"] = getAddress();



    return object;

}

long
PartnerShipmentWarehouseDTO::getId()
{
	return id;
}

void
PartnerShipmentWarehouseDTO::setId(long  id)
{
	this->id = id;
}

std::string
PartnerShipmentWarehouseDTO::getName()
{
	return name;
}

void
PartnerShipmentWarehouseDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
PartnerShipmentWarehouseDTO::getAddress()
{
	return address;
}

void
PartnerShipmentWarehouseDTO::setAddress(std::string  address)
{
	this->address = address;
}



