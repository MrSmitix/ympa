

#include "OutletAddressDTO.h"

using namespace Tiny;

OutletAddressDTO::OutletAddressDTO()
{
	regionId = long(0);
	street = std::string();
	number = std::string();
	building = std::string();
	estate = std::string();
	block = std::string();
	additional = std::string();
	km = int(0);
	city = std::string();
}

OutletAddressDTO::OutletAddressDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletAddressDTO::~OutletAddressDTO()
{

}

void
OutletAddressDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *regionIdKey = "regionId";

    if(object.has_key(regionIdKey))
    {
        bourne::json value = object[regionIdKey];



        jsonToValue(&regionId, value, "long");


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

    const char *estateKey = "estate";

    if(object.has_key(estateKey))
    {
        bourne::json value = object[estateKey];



        jsonToValue(&estate, value, "std::string");


    }

    const char *blockKey = "block";

    if(object.has_key(blockKey))
    {
        bourne::json value = object[blockKey];



        jsonToValue(&block, value, "std::string");


    }

    const char *additionalKey = "additional";

    if(object.has_key(additionalKey))
    {
        bourne::json value = object[additionalKey];



        jsonToValue(&additional, value, "std::string");


    }

    const char *kmKey = "km";

    if(object.has_key(kmKey))
    {
        bourne::json value = object[kmKey];



        jsonToValue(&km, value, "int");


    }

    const char *cityKey = "city";

    if(object.has_key(cityKey))
    {
        bourne::json value = object[cityKey];



        jsonToValue(&city, value, "std::string");


    }


}

bourne::json
OutletAddressDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["regionId"] = getRegionId();






    object["street"] = getStreet();






    object["number"] = getNumber();






    object["building"] = getBuilding();






    object["estate"] = getEstate();






    object["block"] = getBlock();






    object["additional"] = getAdditional();






    object["km"] = getKm();






    object["city"] = getCity();



    return object;

}

long
OutletAddressDTO::getRegionId()
{
	return regionId;
}

void
OutletAddressDTO::setRegionId(long  regionId)
{
	this->regionId = regionId;
}

std::string
OutletAddressDTO::getStreet()
{
	return street;
}

void
OutletAddressDTO::setStreet(std::string  street)
{
	this->street = street;
}

std::string
OutletAddressDTO::getNumber()
{
	return number;
}

void
OutletAddressDTO::setNumber(std::string  number)
{
	this->number = number;
}

std::string
OutletAddressDTO::getBuilding()
{
	return building;
}

void
OutletAddressDTO::setBuilding(std::string  building)
{
	this->building = building;
}

std::string
OutletAddressDTO::getEstate()
{
	return estate;
}

void
OutletAddressDTO::setEstate(std::string  estate)
{
	this->estate = estate;
}

std::string
OutletAddressDTO::getBlock()
{
	return block;
}

void
OutletAddressDTO::setBlock(std::string  block)
{
	this->block = block;
}

std::string
OutletAddressDTO::getAdditional()
{
	return additional;
}

void
OutletAddressDTO::setAdditional(std::string  additional)
{
	this->additional = additional;
}

int
OutletAddressDTO::getKm()
{
	return km;
}

void
OutletAddressDTO::setKm(int  km)
{
	this->km = km;
}

std::string
OutletAddressDTO::getCity()
{
	return city;
}

void
OutletAddressDTO::setCity(std::string  city)
{
	this->city = city;
}



