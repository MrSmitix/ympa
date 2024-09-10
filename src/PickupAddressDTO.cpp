#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PickupAddressDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PickupAddressDTO::PickupAddressDTO()
{
	//__init();
}

PickupAddressDTO::~PickupAddressDTO()
{
	//__cleanup();
}

void
PickupAddressDTO::__init()
{
	//country = std::string();
	//city = std::string();
	//street = std::string();
	//house = std::string();
	//postcode = std::string();
}

void
PickupAddressDTO::__cleanup()
{
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(city != NULL) {
	//
	//delete city;
	//city = NULL;
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
	//if(postcode != NULL) {
	//
	//delete postcode;
	//postcode = NULL;
	//}
	//
}

void
PickupAddressDTO::fromJson(char* jsonStr)
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
	const gchar *cityKey = "city";
	node = json_object_get_member(pJsonObject, cityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&city, node, "std::string", "");
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
	const gchar *postcodeKey = "postcode";
	node = json_object_get_member(pJsonObject, postcodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&postcode, node, "std::string", "");
		} else {
			
		}
	}
}

PickupAddressDTO::PickupAddressDTO(char* json)
{
	this->fromJson(json);
}

char*
PickupAddressDTO::toJson()
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
		std::string obj = getCity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cityKey = "city";
	json_object_set_member(pJsonObject, cityKey, node);
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
		std::string obj = getPostcode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *postcodeKey = "postcode";
	json_object_set_member(pJsonObject, postcodeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


