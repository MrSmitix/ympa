#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FulfillmentWarehousesDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FulfillmentWarehousesDTO::FulfillmentWarehousesDTO()
{
	//__init();
}

FulfillmentWarehousesDTO::~FulfillmentWarehousesDTO()
{
	//__cleanup();
}

void
FulfillmentWarehousesDTO::__init()
{
	//new std::list()std::list> warehouses;
}

void
FulfillmentWarehousesDTO::__cleanup()
{
	//if(warehouses != NULL) {
	//warehouses.RemoveAll(true);
	//delete warehouses;
	//warehouses = NULL;
	//}
	//
}

void
FulfillmentWarehousesDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *warehousesKey = "warehouses";
	node = json_object_get_member(pJsonObject, warehousesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FulfillmentWarehouseDTO> new_list;
			FulfillmentWarehouseDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FulfillmentWarehouseDTO")) {
					jsonToValue(&inst, temp_json, "FulfillmentWarehouseDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warehouses = new_list;
		}
		
	}
}

FulfillmentWarehousesDTO::FulfillmentWarehousesDTO(char* json)
{
	this->fromJson(json);
}

char*
FulfillmentWarehousesDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FulfillmentWarehouseDTO")) {
		list<FulfillmentWarehouseDTO> new_list = static_cast<list <FulfillmentWarehouseDTO> > (getWarehouses());
		node = converttoJson(&new_list, "FulfillmentWarehouseDTO", "array");
	} else {
		node = json_node_alloc();
		list<FulfillmentWarehouseDTO> new_list = static_cast<list <FulfillmentWarehouseDTO> > (getWarehouses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FulfillmentWarehouseDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FulfillmentWarehouseDTO obj = *it;
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

std::list<FulfillmentWarehouseDTO>
FulfillmentWarehousesDTO::getWarehouses()
{
	return warehouses;
}

void
FulfillmentWarehousesDTO::setWarehouses(std::list <FulfillmentWarehouseDTO> warehouses)
{
	this->warehouses = warehouses;
}


