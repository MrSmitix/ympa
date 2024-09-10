#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PartnerShipmentWarehouseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PartnerShipmentWarehouseDTO::PartnerShipmentWarehouseDTO()
{
	//__init();
}

PartnerShipmentWarehouseDTO::~PartnerShipmentWarehouseDTO()
{
	//__cleanup();
}

void
PartnerShipmentWarehouseDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//address = std::string();
}

void
PartnerShipmentWarehouseDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(address != NULL) {
	//
	//delete address;
	//address = NULL;
	//}
	//
}

void
PartnerShipmentWarehouseDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *addressKey = "address";
	node = json_object_get_member(pJsonObject, addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&address, node, "std::string", "");
		} else {
			
		}
	}
}

PartnerShipmentWarehouseDTO::PartnerShipmentWarehouseDTO(char* json)
{
	this->fromJson(json);
}

char*
PartnerShipmentWarehouseDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *addressKey = "address";
	json_object_set_member(pJsonObject, addressKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
PartnerShipmentWarehouseDTO::getId()
{
	return id;
}

void
PartnerShipmentWarehouseDTO::setId(long long  id)
{
	this->id = id;
}

std::string
PartnerShipmentWarehouseDTO::getName()
{
	return name;
}

void
PartnerShipmentWarehouseDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
PartnerShipmentWarehouseDTO::getAddress()
{
	return address;
}

void
PartnerShipmentWarehouseDTO::setAddress(std::string  address)
{
	this->address = address;
}


