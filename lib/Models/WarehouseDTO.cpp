

#include "WarehouseDTO.h"

using namespace Tiny;

WarehouseDTO::WarehouseDTO()
{
	id = long(0);
	name = std::string();
	campaignId = long(0);
	express = bool(false);
	address = WarehouseAddressDTO();
}

WarehouseDTO::WarehouseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

WarehouseDTO::~WarehouseDTO()
{

}

void
WarehouseDTO::fromJson(std::string jsonObj)
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

    const char *campaignIdKey = "campaignId";

    if(object.has_key(campaignIdKey))
    {
        bourne::json value = object[campaignIdKey];



        jsonToValue(&campaignId, value, "long");


    }

    const char *expressKey = "express";

    if(object.has_key(expressKey))
    {
        bourne::json value = object[expressKey];



        jsonToValue(&express, value, "bool");


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
WarehouseDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["campaignId"] = getCampaignId();






    object["express"] = isExpress();







	object["address"] = getAddress().toJson();


    return object;

}

long
WarehouseDTO::getId()
{
	return id;
}

void
WarehouseDTO::setId(long  id)
{
	this->id = id;
}

std::string
WarehouseDTO::getName()
{
	return name;
}

void
WarehouseDTO::setName(std::string  name)
{
	this->name = name;
}

long
WarehouseDTO::getCampaignId()
{
	return campaignId;
}

void
WarehouseDTO::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

bool
WarehouseDTO::isExpress()
{
	return express;
}

void
WarehouseDTO::setExpress(bool  express)
{
	this->express = express;
}

WarehouseAddressDTO
WarehouseDTO::getAddress()
{
	return address;
}

void
WarehouseDTO::setAddress(WarehouseAddressDTO  address)
{
	this->address = address;
}



