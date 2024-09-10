#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetWarehouseStocksDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetWarehouseStocksDTO::GetWarehouseStocksDTO()
{
	//__init();
}

GetWarehouseStocksDTO::~GetWarehouseStocksDTO()
{
	//__cleanup();
}

void
GetWarehouseStocksDTO::__init()
{
	//paging = new ScrollingPagerDTO();
	//new std::list()std::list> warehouses;
}

void
GetWarehouseStocksDTO::__cleanup()
{
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//if(warehouses != NULL) {
	//warehouses.RemoveAll(true);
	//delete warehouses;
	//warehouses = NULL;
	//}
	//
}

void
GetWarehouseStocksDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pagingKey = "paging";
	node = json_object_get_member(pJsonObject, pagingKey);
	if (node !=NULL) {
	

		if (isprimitive("ScrollingPagerDTO")) {
			jsonToValue(&paging, node, "ScrollingPagerDTO", "ScrollingPagerDTO");
		} else {
			
			ScrollingPagerDTO* obj = static_cast<ScrollingPagerDTO*> (&paging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *warehousesKey = "warehouses";
	node = json_object_get_member(pJsonObject, warehousesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<WarehouseOffersDTO> new_list;
			WarehouseOffersDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("WarehouseOffersDTO")) {
					jsonToValue(&inst, temp_json, "WarehouseOffersDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warehouses = new_list;
		}
		
	}
}

GetWarehouseStocksDTO::GetWarehouseStocksDTO(char* json)
{
	this->fromJson(json);
}

char*
GetWarehouseStocksDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ScrollingPagerDTO")) {
		ScrollingPagerDTO obj = getPaging();
		node = converttoJson(&obj, "ScrollingPagerDTO", "");
	}
	else {
		
		ScrollingPagerDTO obj = static_cast<ScrollingPagerDTO> (getPaging());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagingKey = "paging";
	json_object_set_member(pJsonObject, pagingKey, node);
	if (isprimitive("WarehouseOffersDTO")) {
		list<WarehouseOffersDTO> new_list = static_cast<list <WarehouseOffersDTO> > (getWarehouses());
		node = converttoJson(&new_list, "WarehouseOffersDTO", "array");
	} else {
		node = json_node_alloc();
		list<WarehouseOffersDTO> new_list = static_cast<list <WarehouseOffersDTO> > (getWarehouses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<WarehouseOffersDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			WarehouseOffersDTO obj = *it;
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

ScrollingPagerDTO
GetWarehouseStocksDTO::getPaging()
{
	return paging;
}

void
GetWarehouseStocksDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<WarehouseOffersDTO>
GetWarehouseStocksDTO::getWarehouses()
{
	return warehouses;
}

void
GetWarehouseStocksDTO::setWarehouses(std::list <WarehouseOffersDTO> warehouses)
{
	this->warehouses = warehouses;
}


