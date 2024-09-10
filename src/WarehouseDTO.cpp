#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "WarehouseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

WarehouseDTO::WarehouseDTO()
{
	//__init();
}

WarehouseDTO::~WarehouseDTO()
{
	//__cleanup();
}

void
WarehouseDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//campaignId = long(0);
	//express = bool(false);
	//address = new WarehouseAddressDTO();
}

void
WarehouseDTO::__cleanup()
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
	//if(campaignId != NULL) {
	//
	//delete campaignId;
	//campaignId = NULL;
	//}
	//if(express != NULL) {
	//
	//delete express;
	//express = NULL;
	//}
	//if(address != NULL) {
	//
	//delete address;
	//address = NULL;
	//}
	//
}

void
WarehouseDTO::fromJson(char* jsonStr)
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
	const gchar *campaignIdKey = "campaignId";
	node = json_object_get_member(pJsonObject, campaignIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&campaignId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *expressKey = "express";
	node = json_object_get_member(pJsonObject, expressKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&express, node, "bool", "");
		} else {
			
		}
	}
	const gchar *addressKey = "address";
	node = json_object_get_member(pJsonObject, addressKey);
	if (node !=NULL) {
	

		if (isprimitive("WarehouseAddressDTO")) {
			jsonToValue(&address, node, "WarehouseAddressDTO", "WarehouseAddressDTO");
		} else {
			
			WarehouseAddressDTO* obj = static_cast<WarehouseAddressDTO*> (&address);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

WarehouseDTO::WarehouseDTO(char* json)
{
	this->fromJson(json);
}

char*
WarehouseDTO::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getCampaignId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *campaignIdKey = "campaignId";
	json_object_set_member(pJsonObject, campaignIdKey, node);
	if (isprimitive("bool")) {
		bool obj = getExpress();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *expressKey = "express";
	json_object_set_member(pJsonObject, expressKey, node);
	if (isprimitive("WarehouseAddressDTO")) {
		WarehouseAddressDTO obj = getAddress();
		node = converttoJson(&obj, "WarehouseAddressDTO", "");
	}
	else {
		
		WarehouseAddressDTO obj = static_cast<WarehouseAddressDTO> (getAddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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
WarehouseDTO::getId()
{
	return id;
}

void
WarehouseDTO::setId(long long  id)
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

long long
WarehouseDTO::getCampaignId()
{
	return campaignId;
}

void
WarehouseDTO::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

bool
WarehouseDTO::getExpress()
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


