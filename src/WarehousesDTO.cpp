#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "WarehousesDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

WarehousesDTO::WarehousesDTO()
{
	//__init();
}

WarehousesDTO::~WarehousesDTO()
{
	//__cleanup();
}

void
WarehousesDTO::__init()
{
	//new std::list()std::list> warehouses;
	//new std::list()std::list> warehouseGroups;
}

void
WarehousesDTO::__cleanup()
{
	//if(warehouses != NULL) {
	//warehouses.RemoveAll(true);
	//delete warehouses;
	//warehouses = NULL;
	//}
	//if(warehouseGroups != NULL) {
	//warehouseGroups.RemoveAll(true);
	//delete warehouseGroups;
	//warehouseGroups = NULL;
	//}
	//
}

void
WarehousesDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *warehouseGroupsKey = "warehouseGroups";
	node = json_object_get_member(pJsonObject, warehouseGroupsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<WarehouseGroupDTO> new_list;
			WarehouseGroupDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("WarehouseGroupDTO")) {
					jsonToValue(&inst, temp_json, "WarehouseGroupDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warehouseGroups = new_list;
		}
		
	}
}

WarehousesDTO::WarehousesDTO(char* json)
{
	this->fromJson(json);
}

char*
WarehousesDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("WarehouseGroupDTO")) {
		list<WarehouseGroupDTO> new_list = static_cast<list <WarehouseGroupDTO> > (getWarehouseGroups());
		node = converttoJson(&new_list, "WarehouseGroupDTO", "array");
	} else {
		node = json_node_alloc();
		list<WarehouseGroupDTO> new_list = static_cast<list <WarehouseGroupDTO> > (getWarehouseGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<WarehouseGroupDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			WarehouseGroupDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *warehouseGroupsKey = "warehouseGroups";
	json_object_set_member(pJsonObject, warehouseGroupsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<WarehouseDTO>
WarehousesDTO::getWarehouses()
{
	return warehouses;
}

void
WarehousesDTO::setWarehouses(std::list <WarehouseDTO> warehouses)
{
	this->warehouses = warehouses;
}

std::list<WarehouseGroupDTO>
WarehousesDTO::getWarehouseGroups()
{
	return warehouseGroups;
}

void
WarehousesDTO::setWarehouseGroups(std::list <WarehouseGroupDTO> warehouseGroups)
{
	this->warehouseGroups = warehouseGroups;
}


