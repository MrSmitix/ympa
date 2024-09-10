#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetGoodsStatsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetGoodsStatsRequest::GetGoodsStatsRequest()
{
	//__init();
}

GetGoodsStatsRequest::~GetGoodsStatsRequest()
{
	//__cleanup();
}

void
GetGoodsStatsRequest::__init()
{
	//new std::list()Set> shopSkus;
}

void
GetGoodsStatsRequest::__cleanup()
{
	//if(shopSkus != NULL) {
	//shopSkus.RemoveAll(true);
	//delete shopSkus;
	//shopSkus = NULL;
	//}
	//
}

void
GetGoodsStatsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *shopSkusKey = "shopSkus";
	node = json_object_get_member(pJsonObject, shopSkusKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			shopSkus = new_list;
		}
		
	}
}

GetGoodsStatsRequest::GetGoodsStatsRequest(char* json)
{
	this->fromJson(json);
}

char*
GetGoodsStatsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getShopSkus());
		node = converttoJson(&new_list, "std::string", "set");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getShopSkus());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *shopSkusKey = "shopSkus";
	json_object_set_member(pJsonObject, shopSkusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Set<std::string>
GetGoodsStatsRequest::getShopSkus()
{
	return shopSkus;
}

void
GetGoodsStatsRequest::setShopSkus(Set <std::string> shopSkus)
{
	this->shopSkus = shopSkus;
}


