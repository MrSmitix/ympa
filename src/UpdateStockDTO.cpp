#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateStockDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateStockDTO::UpdateStockDTO()
{
	//__init();
}

UpdateStockDTO::~UpdateStockDTO()
{
	//__cleanup();
}

void
UpdateStockDTO::__init()
{
	//sku = std::string();
	//new std::list()std::list> items;
}

void
UpdateStockDTO::__cleanup()
{
	//if(sku != NULL) {
	//
	//delete sku;
	//sku = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
UpdateStockDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *skuKey = "sku";
	node = json_object_get_member(pJsonObject, skuKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sku, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateStockItemDTO> new_list;
			UpdateStockItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateStockItemDTO")) {
					jsonToValue(&inst, temp_json, "UpdateStockItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

UpdateStockDTO::UpdateStockDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateStockDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSku();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *skuKey = "sku";
	json_object_set_member(pJsonObject, skuKey, node);
	if (isprimitive("UpdateStockItemDTO")) {
		list<UpdateStockItemDTO> new_list = static_cast<list <UpdateStockItemDTO> > (getItems());
		node = converttoJson(&new_list, "UpdateStockItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<UpdateStockItemDTO> new_list = static_cast<list <UpdateStockItemDTO> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateStockItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateStockItemDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UpdateStockDTO::getSku()
{
	return sku;
}

void
UpdateStockDTO::setSku(std::string  sku)
{
	this->sku = sku;
}

std::list<UpdateStockItemDTO>
UpdateStockDTO::getItems()
{
	return items;
}

void
UpdateStockDTO::setItems(std::list <UpdateStockItemDTO> items)
{
	this->items = items;
}


