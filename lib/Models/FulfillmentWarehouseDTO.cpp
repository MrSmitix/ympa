

#include "FulfillmentWarehouseDTO.h"

using namespace Tiny;

FulfillmentWarehouseDTO::FulfillmentWarehouseDTO()
{
	id = long(0);
	name = std::string();
	address = WarehouseAddressDTO();
}

FulfillmentWarehouseDTO::FulfillmentWarehouseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FulfillmentWarehouseDTO::~FulfillmentWarehouseDTO()
{

}

void
FulfillmentWarehouseDTO::fromJson(std::string jsonObj)
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




        WarehouseAddressDTO* obj = &address;
		obj->fromJson(value.dump());

    }


}

bourne::json
FulfillmentWarehouseDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["address"] = getAddress().toJson();


    return object;

}

long
FulfillmentWarehouseDTO::getId()
{
	return id;
}

void
FulfillmentWarehouseDTO::setId(long  id)
{
	this->id = id;
}

std::string
FulfillmentWarehouseDTO::getName()
{
	return name;
}

void
FulfillmentWarehouseDTO::setName(std::string  name)
{
	this->name = name;
}

WarehouseAddressDTO
FulfillmentWarehouseDTO::getAddress()
{
	return address;
}

void
FulfillmentWarehouseDTO::setAddress(WarehouseAddressDTO  address)
{
	this->address = address;
}



