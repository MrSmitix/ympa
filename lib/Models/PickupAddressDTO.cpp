

#include "PickupAddressDTO.h"

using namespace Tiny;

PickupAddressDTO::PickupAddressDTO()
{
	country = std::string();
	city = std::string();
	street = std::string();
	house = std::string();
	postcode = std::string();
}

PickupAddressDTO::PickupAddressDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PickupAddressDTO::~PickupAddressDTO()
{

}

void
PickupAddressDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];



        jsonToValue(&country, value, "std::string");


    }

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

    const char *houseKey = "house";

    if(object.has_key(houseKey))
    {
        bourne::json value = object[houseKey];



        jsonToValue(&house, value, "std::string");


    }

    const char *postcodeKey = "postcode";

    if(object.has_key(postcodeKey))
    {
        bourne::json value = object[postcodeKey];



        jsonToValue(&postcode, value, "std::string");


    }


}

bourne::json
PickupAddressDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["country"] = getCountry();






    object["city"] = getCity();






    object["street"] = getStreet();






    object["house"] = getHouse();






    object["postcode"] = getPostcode();



    return object;

}

std::string
PickupAddressDTO::getCountry()
{
	return country;
}

void
PickupAddressDTO::setCountry(std::string  country)
{
	this->country = country;
}

std::string
PickupAddressDTO::getCity()
{
	return city;
}

void
PickupAddressDTO::setCity(std::string  city)
{
	this->city = city;
}

std::string
PickupAddressDTO::getStreet()
{
	return street;
}

void
PickupAddressDTO::setStreet(std::string  street)
{
	this->street = street;
}

std::string
PickupAddressDTO::getHouse()
{
	return house;
}

void
PickupAddressDTO::setHouse(std::string  house)
{
	this->house = house;
}

std::string
PickupAddressDTO::getPostcode()
{
	return postcode;
}

void
PickupAddressDTO::setPostcode(std::string  postcode)
{
	this->postcode = postcode;
}



