#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ReturnItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ReturnItemDTO::ReturnItemDTO()
{
	//__init();
}

ReturnItemDTO::~ReturnItemDTO()
{
	//__cleanup();
}

void
ReturnItemDTO::__init()
{
	//marketSku = long(0);
	//shopSku = std::string();
	//count = long(0);
	//new std::list()std::list> decisions;
	//new std::list()std::list> instances;
	//new std::list()std::list> tracks;
}

void
ReturnItemDTO::__cleanup()
{
	//if(marketSku != NULL) {
	//
	//delete marketSku;
	//marketSku = NULL;
	//}
	//if(shopSku != NULL) {
	//
	//delete shopSku;
	//shopSku = NULL;
	//}
	//if(count != NULL) {
	//
	//delete count;
	//count = NULL;
	//}
	//if(decisions != NULL) {
	//decisions.RemoveAll(true);
	//delete decisions;
	//decisions = NULL;
	//}
	//if(instances != NULL) {
	//instances.RemoveAll(true);
	//delete instances;
	//instances = NULL;
	//}
	//if(tracks != NULL) {
	//tracks.RemoveAll(true);
	//delete tracks;
	//tracks = NULL;
	//}
	//
}

void
ReturnItemDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *marketSkuKey = "marketSku";
	node = json_object_get_member(pJsonObject, marketSkuKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&marketSku, node, "long long", "");
		} else {
			
		}
	}
	const gchar *shopSkuKey = "shopSku";
	node = json_object_get_member(pJsonObject, shopSkuKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopSku, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *countKey = "count";
	node = json_object_get_member(pJsonObject, countKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&count, node, "long long", "");
		} else {
			
		}
	}
	const gchar *decisionsKey = "decisions";
	node = json_object_get_member(pJsonObject, decisionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ReturnDecisionDTO> new_list;
			ReturnDecisionDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ReturnDecisionDTO")) {
					jsonToValue(&inst, temp_json, "ReturnDecisionDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			decisions = new_list;
		}
		
	}
	const gchar *instancesKey = "instances";
	node = json_object_get_member(pJsonObject, instancesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ReturnInstanceDTO> new_list;
			ReturnInstanceDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ReturnInstanceDTO")) {
					jsonToValue(&inst, temp_json, "ReturnInstanceDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			instances = new_list;
		}
		
	}
	const gchar *tracksKey = "tracks";
	node = json_object_get_member(pJsonObject, tracksKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TrackDTO> new_list;
			TrackDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TrackDTO")) {
					jsonToValue(&inst, temp_json, "TrackDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tracks = new_list;
		}
		
	}
}

ReturnItemDTO::ReturnItemDTO(char* json)
{
	this->fromJson(json);
}

char*
ReturnItemDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getMarketSku();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *marketSkuKey = "marketSku";
	json_object_set_member(pJsonObject, marketSkuKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShopSku();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopSkuKey = "shopSku";
	json_object_set_member(pJsonObject, shopSkuKey, node);
	if (isprimitive("long long")) {
		long long obj = getCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *countKey = "count";
	json_object_set_member(pJsonObject, countKey, node);
	if (isprimitive("ReturnDecisionDTO")) {
		list<ReturnDecisionDTO> new_list = static_cast<list <ReturnDecisionDTO> > (getDecisions());
		node = converttoJson(&new_list, "ReturnDecisionDTO", "array");
	} else {
		node = json_node_alloc();
		list<ReturnDecisionDTO> new_list = static_cast<list <ReturnDecisionDTO> > (getDecisions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ReturnDecisionDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ReturnDecisionDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *decisionsKey = "decisions";
	json_object_set_member(pJsonObject, decisionsKey, node);
	if (isprimitive("ReturnInstanceDTO")) {
		list<ReturnInstanceDTO> new_list = static_cast<list <ReturnInstanceDTO> > (getInstances());
		node = converttoJson(&new_list, "ReturnInstanceDTO", "array");
	} else {
		node = json_node_alloc();
		list<ReturnInstanceDTO> new_list = static_cast<list <ReturnInstanceDTO> > (getInstances());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ReturnInstanceDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ReturnInstanceDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *instancesKey = "instances";
	json_object_set_member(pJsonObject, instancesKey, node);
	if (isprimitive("TrackDTO")) {
		list<TrackDTO> new_list = static_cast<list <TrackDTO> > (getTracks());
		node = converttoJson(&new_list, "TrackDTO", "array");
	} else {
		node = json_node_alloc();
		list<TrackDTO> new_list = static_cast<list <TrackDTO> > (getTracks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TrackDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TrackDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tracksKey = "tracks";
	json_object_set_member(pJsonObject, tracksKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
ReturnItemDTO::getMarketSku()
{
	return marketSku;
}

void
ReturnItemDTO::setMarketSku(long long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
ReturnItemDTO::getShopSku()
{
	return shopSku;
}

void
ReturnItemDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

long long
ReturnItemDTO::getCount()
{
	return count;
}

void
ReturnItemDTO::setCount(long long  count)
{
	this->count = count;
}

std::list<ReturnDecisionDTO>
ReturnItemDTO::getDecisions()
{
	return decisions;
}

void
ReturnItemDTO::setDecisions(std::list <ReturnDecisionDTO> decisions)
{
	this->decisions = decisions;
}

std::list<ReturnInstanceDTO>
ReturnItemDTO::getInstances()
{
	return instances;
}

void
ReturnItemDTO::setInstances(std::list <ReturnInstanceDTO> instances)
{
	this->instances = instances;
}

std::list<TrackDTO>
ReturnItemDTO::getTracks()
{
	return tracks;
}

void
ReturnItemDTO::setTracks(std::list <TrackDTO> tracks)
{
	this->tracks = tracks;
}


