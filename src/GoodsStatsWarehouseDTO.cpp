#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsStatsWarehouseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsStatsWarehouseDTO::GoodsStatsWarehouseDTO()
{
	//__init();
}

GoodsStatsWarehouseDTO::~GoodsStatsWarehouseDTO()
{
	//__cleanup();
}

void
GoodsStatsWarehouseDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//new std::list()std::list> stocks;
}

void
GoodsStatsWarehouseDTO::__cleanup()
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
	//if(stocks != NULL) {
	//stocks.RemoveAll(true);
	//delete stocks;
	//stocks = NULL;
	//}
	//
}

void
GoodsStatsWarehouseDTO::fromJson(char* jsonStr)
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
	const gchar *stocksKey = "stocks";
	node = json_object_get_member(pJsonObject, stocksKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<WarehouseStockDTO> new_list;
			WarehouseStockDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("WarehouseStockDTO")) {
					jsonToValue(&inst, temp_json, "WarehouseStockDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			stocks = new_list;
		}
		
	}
}

GoodsStatsWarehouseDTO::GoodsStatsWarehouseDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsStatsWarehouseDTO::toJson()
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
	if (isprimitive("WarehouseStockDTO")) {
		list<WarehouseStockDTO> new_list = static_cast<list <WarehouseStockDTO> > (getStocks());
		node = converttoJson(&new_list, "WarehouseStockDTO", "array");
	} else {
		node = json_node_alloc();
		list<WarehouseStockDTO> new_list = static_cast<list <WarehouseStockDTO> > (getStocks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<WarehouseStockDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			WarehouseStockDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *stocksKey = "stocks";
	json_object_set_member(pJsonObject, stocksKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GoodsStatsWarehouseDTO::getId()
{
	return id;
}

void
GoodsStatsWarehouseDTO::setId(long long  id)
{
	this->id = id;
}

std::string
GoodsStatsWarehouseDTO::getName()
{
	return name;
}

void
GoodsStatsWarehouseDTO::setName(std::string  name)
{
	this->name = name;
}

std::list<WarehouseStockDTO>
GoodsStatsWarehouseDTO::getStocks()
{
	return stocks;
}

void
GoodsStatsWarehouseDTO::setStocks(std::list <WarehouseStockDTO> stocks)
{
	this->stocks = stocks;
}


