#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OutletAddressDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OutletAddressDTO::OutletAddressDTO()
{
	//__init();
}

OutletAddressDTO::~OutletAddressDTO()
{
	//__cleanup();
}

void
OutletAddressDTO::__init()
{
	//regionId = long(0);
	//street = std::string();
	//number = std::string();
	//building = std::string();
	//estate = std::string();
	//block = std::string();
	//additional = std::string();
	//km = int(0);
	//city = std::string();
}

void
OutletAddressDTO::__cleanup()
{
	//if(regionId != NULL) {
	//
	//delete regionId;
	//regionId = NULL;
	//}
	//if(street != NULL) {
	//
	//delete street;
	//street = NULL;
	//}
	//if(number != NULL) {
	//
	//delete number;
	//number = NULL;
	//}
	//if(building != NULL) {
	//
	//delete building;
	//building = NULL;
	//}
	//if(estate != NULL) {
	//
	//delete estate;
	//estate = NULL;
	//}
	//if(block != NULL) {
	//
	//delete block;
	//block = NULL;
	//}
	//if(additional != NULL) {
	//
	//delete additional;
	//additional = NULL;
	//}
	//if(km != NULL) {
	//
	//delete km;
	//km = NULL;
	//}
	//if(city != NULL) {
	//
	//delete city;
	//city = NULL;
	//}
	//
}

void
OutletAddressDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *regionIdKey = "regionId";
	node = json_object_get_member(pJsonObject, regionIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&regionId, node, "long long", "");
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
	const gchar *numberKey = "number";
	node = json_object_get_member(pJsonObject, numberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&number, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *buildingKey = "building";
	node = json_object_get_member(pJsonObject, buildingKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&building, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *estateKey = "estate";
	node = json_object_get_member(pJsonObject, estateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&estate, node, "std::string", "");
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
	const gchar *additionalKey = "additional";
	node = json_object_get_member(pJsonObject, additionalKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&additional, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *kmKey = "km";
	node = json_object_get_member(pJsonObject, kmKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&km, node, "int", "");
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
}

OutletAddressDTO::OutletAddressDTO(char* json)
{
	this->fromJson(json);
}

char*
OutletAddressDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getRegionId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *regionIdKey = "regionId";
	json_object_set_member(pJsonObject, regionIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStreet();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *streetKey = "street";
	json_object_set_member(pJsonObject, streetKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *numberKey = "number";
	json_object_set_member(pJsonObject, numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBuilding();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *buildingKey = "building";
	json_object_set_member(pJsonObject, buildingKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEstate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *estateKey = "estate";
	json_object_set_member(pJsonObject, estateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBlock();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *blockKey = "block";
	json_object_set_member(pJsonObject, blockKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdditional();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *additionalKey = "additional";
	json_object_set_member(pJsonObject, additionalKey, node);
	if (isprimitive("int")) {
		int obj = getKm();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *kmKey = "km";
	json_object_set_member(pJsonObject, kmKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cityKey = "city";
	json_object_set_member(pJsonObject, cityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OutletAddressDTO::getRegionId()
{
	return regionId;
}

void
OutletAddressDTO::setRegionId(long long  regionId)
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


