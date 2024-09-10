#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsStatsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsStatsDTO::GoodsStatsDTO()
{
	//__init();
}

GoodsStatsDTO::~GoodsStatsDTO()
{
	//__cleanup();
}

void
GoodsStatsDTO::__init()
{
	//new std::list()std::list> shopSkus;
}

void
GoodsStatsDTO::__cleanup()
{
	//if(shopSkus != NULL) {
	//shopSkus.RemoveAll(true);
	//delete shopSkus;
	//shopSkus = NULL;
	//}
	//
}

void
GoodsStatsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *shopSkusKey = "shopSkus";
	node = json_object_get_member(pJsonObject, shopSkusKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GoodsStatsGoodsDTO> new_list;
			GoodsStatsGoodsDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GoodsStatsGoodsDTO")) {
					jsonToValue(&inst, temp_json, "GoodsStatsGoodsDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			shopSkus = new_list;
		}
		
	}
}

GoodsStatsDTO::GoodsStatsDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsStatsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("GoodsStatsGoodsDTO")) {
		list<GoodsStatsGoodsDTO> new_list = static_cast<list <GoodsStatsGoodsDTO> > (getShopSkus());
		node = converttoJson(&new_list, "GoodsStatsGoodsDTO", "array");
	} else {
		node = json_node_alloc();
		list<GoodsStatsGoodsDTO> new_list = static_cast<list <GoodsStatsGoodsDTO> > (getShopSkus());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GoodsStatsGoodsDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GoodsStatsGoodsDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
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

std::list<GoodsStatsGoodsDTO>
GoodsStatsDTO::getShopSkus()
{
	return shopSkus;
}

void
GoodsStatsDTO::setShopSkus(std::list <GoodsStatsGoodsDTO> shopSkus)
{
	this->shopSkus = shopSkus;
}


