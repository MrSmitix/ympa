

#include "OrderDeliveryAddressDTO.h"

using namespace Tiny;

OrderDeliveryAddressDTO::OrderDeliveryAddressDTO()
{
	country = std::string();
	postcode = std::string();
	city = std::string();
	district = std::string();
	subway = std::string();
	street = std::string();
	house = std::string();
	block = std::string();
	entrance = std::string();
	entryphone = std::string();
	floor = std::string();
	apartment = std::string();
	phone = std::string();
	recipient = std::string();
	gps = GpsDTO();
}

OrderDeliveryAddressDTO::OrderDeliveryAddressDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDeliveryAddressDTO::~OrderDeliveryAddressDTO()
{

}

void
OrderDeliveryAddressDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];



        jsonToValue(&country, value, "std::string");


    }

    const char *postcodeKey = "postcode";

    if(object.has_key(postcodeKey))
    {
        bourne::json value = object[postcodeKey];



        jsonToValue(&postcode, value, "std::string");


    }

    const char *cityKey = "city";

    if(object.has_key(cityKey))
    {
        bourne::json value = object[cityKey];



        jsonToValue(&city, value, "std::string");


    }

    const char *districtKey = "district";

    if(object.has_key(districtKey))
    {
        bourne::json value = object[districtKey];



        jsonToValue(&district, value, "std::string");


    }

    const char *subwayKey = "subway";

    if(object.has_key(subwayKey))
    {
        bourne::json value = object[subwayKey];



        jsonToValue(&subway, value, "std::string");


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

    const char *blockKey = "block";

    if(object.has_key(blockKey))
    {
        bourne::json value = object[blockKey];



        jsonToValue(&block, value, "std::string");


    }

    const char *entranceKey = "entrance";

    if(object.has_key(entranceKey))
    {
        bourne::json value = object[entranceKey];



        jsonToValue(&entrance, value, "std::string");


    }

    const char *entryphoneKey = "entryphone";

    if(object.has_key(entryphoneKey))
    {
        bourne::json value = object[entryphoneKey];



        jsonToValue(&entryphone, value, "std::string");


    }

    const char *floorKey = "floor";

    if(object.has_key(floorKey))
    {
        bourne::json value = object[floorKey];



        jsonToValue(&floor, value, "std::string");


    }

    const char *apartmentKey = "apartment";

    if(object.has_key(apartmentKey))
    {
        bourne::json value = object[apartmentKey];



        jsonToValue(&apartment, value, "std::string");


    }

    const char *phoneKey = "phone";

    if(object.has_key(phoneKey))
    {
        bourne::json value = object[phoneKey];



        jsonToValue(&phone, value, "std::string");


    }

    const char *recipientKey = "recipient";

    if(object.has_key(recipientKey))
    {
        bourne::json value = object[recipientKey];



        jsonToValue(&recipient, value, "std::string");


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
OrderDeliveryAddressDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["country"] = getCountry();






    object["postcode"] = getPostcode();






    object["city"] = getCity();






    object["district"] = getDistrict();






    object["subway"] = getSubway();






    object["street"] = getStreet();






    object["house"] = getHouse();






    object["block"] = getBlock();






    object["entrance"] = getEntrance();






    object["entryphone"] = getEntryphone();






    object["floor"] = getFloor();






    object["apartment"] = getApartment();






    object["phone"] = getPhone();






    object["recipient"] = getRecipient();







	object["gps"] = getGps().toJson();


    return object;

}

std::string
OrderDeliveryAddressDTO::getCountry()
{
	return country;
}

void
OrderDeliveryAddressDTO::setCountry(std::string  country)
{
	this->country = country;
}

std::string
OrderDeliveryAddressDTO::getPostcode()
{
	return postcode;
}

void
OrderDeliveryAddressDTO::setPostcode(std::string  postcode)
{
	this->postcode = postcode;
}

std::string
OrderDeliveryAddressDTO::getCity()
{
	return city;
}

void
OrderDeliveryAddressDTO::setCity(std::string  city)
{
	this->city = city;
}

std::string
OrderDeliveryAddressDTO::getDistrict()
{
	return district;
}

void
OrderDeliveryAddressDTO::setDistrict(std::string  district)
{
	this->district = district;
}

std::string
OrderDeliveryAddressDTO::getSubway()
{
	return subway;
}

void
OrderDeliveryAddressDTO::setSubway(std::string  subway)
{
	this->subway = subway;
}

std::string
OrderDeliveryAddressDTO::getStreet()
{
	return street;
}

void
OrderDeliveryAddressDTO::setStreet(std::string  street)
{
	this->street = street;
}

std::string
OrderDeliveryAddressDTO::getHouse()
{
	return house;
}

void
OrderDeliveryAddressDTO::setHouse(std::string  house)
{
	this->house = house;
}

std::string
OrderDeliveryAddressDTO::getBlock()
{
	return block;
}

void
OrderDeliveryAddressDTO::setBlock(std::string  block)
{
	this->block = block;
}

std::string
OrderDeliveryAddressDTO::getEntrance()
{
	return entrance;
}

void
OrderDeliveryAddressDTO::setEntrance(std::string  entrance)
{
	this->entrance = entrance;
}

std::string
OrderDeliveryAddressDTO::getEntryphone()
{
	return entryphone;
}

void
OrderDeliveryAddressDTO::setEntryphone(std::string  entryphone)
{
	this->entryphone = entryphone;
}

std::string
OrderDeliveryAddressDTO::getFloor()
{
	return floor;
}

void
OrderDeliveryAddressDTO::setFloor(std::string  floor)
{
	this->floor = floor;
}

std::string
OrderDeliveryAddressDTO::getApartment()
{
	return apartment;
}

void
OrderDeliveryAddressDTO::setApartment(std::string  apartment)
{
	this->apartment = apartment;
}

std::string
OrderDeliveryAddressDTO::getPhone()
{
	return phone;
}

void
OrderDeliveryAddressDTO::setPhone(std::string  phone)
{
	this->phone = phone;
}

std::string
OrderDeliveryAddressDTO::getRecipient()
{
	return recipient;
}

void
OrderDeliveryAddressDTO::setRecipient(std::string  recipient)
{
	this->recipient = recipient;
}

GpsDTO
OrderDeliveryAddressDTO::getGps()
{
	return gps;
}

void
OrderDeliveryAddressDTO::setGps(GpsDTO  gps)
{
	this->gps = gps;
}



