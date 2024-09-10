#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "WarehouseAddressDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

WarehouseAddressDTO::WarehouseAddressDTO()
{
	//__init();
}

WarehouseAddressDTO::~WarehouseAddressDTO()
{
	//__cleanup();
}

void
WarehouseAddressDTO::__init()
{
	//city = std::string();
	//street = std::string();
	//number = std::string();
	//building = std::string();
	//block = std::string();
	//gps = new GpsDTO();
}

void
WarehouseAddressDTO::__cleanup()
{
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
	//if(block != NULL) {
	//
	//delete block;
	//block = NULL;
	//}
	//if(gps != NULL) {
	//
	//delete gps;
	//gps = NULL;
	//}
	//
}

void
WarehouseAddressDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *blockKey = "block";
	node = json_object_get_member(pJsonObject, blockKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&block, node, "std::string", "");
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

WarehouseAddressDTO::WarehouseAddressDTO(char* json)
{
	this->fromJson(json);
}

char*
WarehouseAddressDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
		std::string obj = getBlock();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *blockKey = "block";
	json_object_set_member(pJsonObject, blockKey, node);
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


