

#include "WarehouseAddressDTO.h"

using namespace Tiny;

WarehouseAddressDTO::WarehouseAddressDTO()
{
	city = std::string();
	street = std::string();
	number = std::string();
	building = std::string();
	block = std::string();
	gps = GpsDTO();
}

WarehouseAddressDTO::WarehouseAddressDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

WarehouseAddressDTO::~WarehouseAddressDTO()
{

}

void
WarehouseAddressDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cityKey = "city";

    if(object.has_key(cityKey))
    {
        bourne::json value = object[cityKey];



        jsonToValue(&city, value, "std::string");


    }

    const char *streetKey = "street";

    if(object.has_key(streetKey))
    {
        bourne::json value = object[streetKey];



        jsonToValue(&street, value, "std::string");


    }

    const char *numberKey = "number";

    if(object.has_key(numberKey))
    {
        bourne::json value = object[numberKey];



        jsonToValue(&number, value, "std::string");


    }

    const char *buildingKey = "building";

    if(object.has_key(buildingKey))
    {
        bourne::json value = object[buildingKey];



        jsonToValue(&building, value, "std::string");


    }

    const char *blockKey = "block";

    if(object.has_key(blockKey))
    {
        bourne::json value = object[blockKey];



        jsonToValue(&block, value, "std::string");


    }

    const char *gpsKey = "gps";

    if(object.has_key(gpsKey))
    {
        bourne::json value = object[gpsKey];




        GpsDTO* obj = &gps;
		obj->fromJson(value.dump());

    }


}

bourne::json
WarehouseAddressDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["city"] = getCity();






    object["street"] = getStreet();






    object["number"] = getNumber();






    object["building"] = getBuilding();






    object["block"] = getBlock();







	object["gps"] = getGps().toJson();


    return object;

}

std::string
WarehouseAddressDTO::getCity()
{
	return city;
}

void
WarehouseAddressDTO::setCity(std::string  city)
{
	this->city = city;
}

std::string
WarehouseAddressDTO::getStreet()
{
	return street;
}

void
WarehouseAddressDTO::setStreet(std::string  street)
{
	this->street = street;
}

std::string
WarehouseAddressDTO::getNumber()
{
	return number;
}

void
WarehouseAddressDTO::setNumber(std::string  number)
{
	this->number = number;
}

std::string
WarehouseAddressDTO::getBuilding()
{
	return building;
}

void
WarehouseAddressDTO::setBuilding(std::string  building)
{
	this->building = building;
}

std::string
WarehouseAddressDTO::getBlock()
{
	return block;
}

void
WarehouseAddressDTO::setBlock(std::string  block)
{
	this->block = block;
}

GpsDTO
WarehouseAddressDTO::getGps()
{
	return gps;
}

void
WarehouseAddressDTO::setGps(GpsDTO  gps)
{
	this->gps = gps;
}



