#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderDeliveryAddressDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderDeliveryAddressDTO::OrderDeliveryAddressDTO()
{
	//__init();
}

OrderDeliveryAddressDTO::~OrderDeliveryAddressDTO()
{
	//__cleanup();
}

void
OrderDeliveryAddressDTO::__init()
{
	//country = std::string();
	//postcode = std::string();
	//city = std::string();
	//district = std::string();
	//subway = std::string();
	//street = std::string();
	//house = std::string();
	//block = std::string();
	//entrance = std::string();
	//entryphone = std::string();
	//floor = std::string();
	//apartment = std::string();
	//phone = std::string();
	//recipient = std::string();
	//gps = new GpsDTO();
}

void
OrderDeliveryAddressDTO::__cleanup()
{
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(postcode != NULL) {
	//
	//delete postcode;
	//postcode = NULL;
	//}
	//if(city != NULL) {
	//
	//delete city;
	//city = NULL;
	//}
	//if(district != NULL) {
	//
	//delete district;
	//district = NULL;
	//}
	//if(subway != NULL) {
	//
	//delete subway;
	//subway = NULL;
	//}
	//if(street != NULL) {
	//
	//delete street;
	//street = NULL;
	//}
	//if(house != NULL) {
	//
	//delete house;
	//house = NULL;
	//}
	//if(block != NULL) {
	//
	//delete block;
	//block = NULL;
	//}
	//if(entrance != NULL) {
	//
	//delete entrance;
	//entrance = NULL;
	//}
	//if(entryphone != NULL) {
	//
	//delete entryphone;
	//entryphone = NULL;
	//}
	//if(floor != NULL) {
	//
	//delete floor;
	//floor = NULL;
	//}
	//if(apartment != NULL) {
	//
	//delete apartment;
	//apartment = NULL;
	//}
	//if(phone != NULL) {
	//
	//delete phone;
	//phone = NULL;
	//}
	//if(recipient != NULL) {
	//
	//delete recipient;
	//recipient = NULL;
	//}
	//if(gps != NULL) {
	//
	//delete gps;
	//gps = NULL;
	//}
	//
}

void
OrderDeliveryAddressDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *countryKey = "country";
	node = json_object_get_member(pJsonObject, countryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&country, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *postcodeKey = "postcode";
	node = json_object_get_member(pJsonObject, postcodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&postcode, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cityKey = "city";
	node = json_object_get_member(pJsonObject, cityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&city, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *districtKey = "district";
	node = json_object_get_member(pJsonObject, districtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&district, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *subwayKey = "subway";
	node = json_object_get_member(pJsonObject, subwayKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&subway, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *streetKey = "street";
	node = json_object_get_member(pJsonObject, streetKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&street, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *houseKey = "house";
	node = json_object_get_member(pJsonObject, houseKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&house, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *blockKey = "block";
	node = json_object_get_member(pJsonObject, blockKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&block, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *entranceKey = "entrance";
	node = json_object_get_member(pJsonObject, entranceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entrance, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *entryphoneKey = "entryphone";
	node = json_object_get_member(pJsonObject, entryphoneKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entryphone, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *floorKey = "floor";
	node = json_object_get_member(pJsonObject, floorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&floor, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *apartmentKey = "apartment";
	node = json_object_get_member(pJsonObject, apartmentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&apartment, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *phoneKey = "phone";
	node = json_object_get_member(pJsonObject, phoneKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&phone, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *recipientKey = "recipient";
	node = json_object_get_member(pJsonObject, recipientKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&recipient, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *gpsKey = "gps";
	node = json_object_get_member(pJsonObject, gpsKey);
	if (node !=NULL) {
	

		if (isprimitive("GpsDTO")) {
			jsonToValue(&gps, node, "GpsDTO", "GpsDTO");
		} else {
			
			GpsDTO* obj = static_cast<GpsDTO*> (&gps);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrderDeliveryAddressDTO::OrderDeliveryAddressDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderDeliveryAddressDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCountry();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPostcode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *postcodeKey = "postcode";
	json_object_set_member(pJsonObject, postcodeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cityKey = "city";
	json_object_set_member(pJsonObject, cityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDistrict();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *districtKey = "district";
	json_object_set_member(pJsonObject, districtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSubway();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *subwayKey = "subway";
	json_object_set_member(pJsonObject, subwayKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStreet();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *streetKey = "street";
	json_object_set_member(pJsonObject, streetKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHouse();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *houseKey = "house";
	json_object_set_member(pJsonObject, houseKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBlock();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *blockKey = "block";
	json_object_set_member(pJsonObject, blockKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEntrance();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entranceKey = "entrance";
	json_object_set_member(pJsonObject, entranceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEntryphone();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entryphoneKey = "entryphone";
	json_object_set_member(pJsonObject, entryphoneKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFloor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *floorKey = "floor";
	json_object_set_member(pJsonObject, floorKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getApartment();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *apartmentKey = "apartment";
	json_object_set_member(pJsonObject, apartmentKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPhone();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *phoneKey = "phone";
	json_object_set_member(pJsonObject, phoneKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRecipient();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *recipientKey = "recipient";
	json_object_set_member(pJsonObject, recipientKey, node);
	if (isprimitive("GpsDTO")) {
		GpsDTO obj = getGps();
		node = converttoJson(&obj, "GpsDTO", "");
	}
	else {
		
		GpsDTO obj = static_cast<GpsDTO> (getGps());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gpsKey = "gps";
	json_object_set_member(pJsonObject, gpsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


