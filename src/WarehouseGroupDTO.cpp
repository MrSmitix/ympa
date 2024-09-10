#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "WarehouseGroupDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

WarehouseGroupDTO::WarehouseGroupDTO()
{
	//__init();
}

WarehouseGroupDTO::~WarehouseGroupDTO()
{
	//__cleanup();
}

void
WarehouseGroupDTO::__init()
{
	//name = std::string();
	//mainWarehouse = new WarehouseDTO();
	//new std::list()std::list> warehouses;
}

void
WarehouseGroupDTO::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(mainWarehouse != NULL) {
	//
	//delete mainWarehouse;
	//mainWarehouse = NULL;
	//}
	//if(warehouses != NULL) {
	//warehouses.RemoveAll(true);
	//delete warehouses;
	//warehouses = NULL;
	//}
	//
}

void
WarehouseGroupDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *mainWarehouseKey = "mainWarehouse";
	node = json_object_get_member(pJsonObject, mainWarehouseKey);
	if (node !=NULL) {
	

		if (isprimitive("WarehouseDTO")) {
			jsonToValue(&mainWarehouse, node, "WarehouseDTO", "WarehouseDTO");
		} else {
			
			WarehouseDTO* obj = static_cast<WarehouseDTO*> (&mainWarehouse);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *warehousesKey = "warehouses";
	node = json_object_get_member(pJsonObject, warehousesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<WarehouseDTO> new_list;
			WarehouseDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("WarehouseDTO")) {
					jsonToValue(&inst, temp_json, "WarehouseDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warehouses = new_list;
		}
		
	}
}

WarehouseGroupDTO::WarehouseGroupDTO(char* json)
{
	this->fromJson(json);
}

char*
WarehouseGroupDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("WarehouseDTO")) {
		WarehouseDTO obj = getMainWarehouse();
		node = converttoJson(&obj, "WarehouseDTO", "");
	}
	else {
		
		WarehouseDTO obj = static_cast<WarehouseDTO> (getMainWarehouse());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mainWarehouseKey = "mainWarehouse";
	json_object_set_member(pJsonObject, mainWarehouseKey, node);
	if (isprimitive("WarehouseDTO")) {
		list<WarehouseDTO> new_list = static_cast<list <WarehouseDTO> > (getWarehouses());
		node = converttoJson(&new_list, "WarehouseDTO", "array");
	} else {
		node = json_node_alloc();
		list<WarehouseDTO> new_list = static_cast<list <WarehouseDTO> > (getWarehouses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<WarehouseDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			WarehouseDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *warehousesKey = "warehouses";
	json_object_set_member(pJsonObject, warehousesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
WarehouseGroupDTO::getName()
{
	return name;
}

void
WarehouseGroupDTO::setName(std::string  name)
{
	this->name = name;
}

WarehouseDTO
WarehouseGroupDTO::getMainWarehouse()
{
	return mainWarehouse;
}

void
WarehouseGroupDTO::setMainWarehouse(WarehouseDTO  mainWarehouse)
{
	this->mainWarehouse = mainWarehouse;
}

std::list<WarehouseDTO>
WarehouseGroupDTO::getWarehouses()
{
	return warehouses;
}

void
WarehouseGroupDTO::setWarehouses(std::list <WarehouseDTO> warehouses)
{
	this->warehouses = warehouses;
}


