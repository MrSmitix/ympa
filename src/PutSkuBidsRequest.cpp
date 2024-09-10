#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PutSkuBidsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PutSkuBidsRequest::PutSkuBidsRequest()
{
	//__init();
}

PutSkuBidsRequest::~PutSkuBidsRequest()
{
	//__cleanup();
}

void
PutSkuBidsRequest::__init()
{
	//new std::list()std::list> bids;
}

void
PutSkuBidsRequest::__cleanup()
{
	//if(bids != NULL) {
	//bids.RemoveAll(true);
	//delete bids;
	//bids = NULL;
	//}
	//
}

void
PutSkuBidsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bidsKey = "bids";
	node = json_object_get_member(pJsonObject, bidsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SkuBidItemDTO> new_list;
			SkuBidItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SkuBidItemDTO")) {
					jsonToValue(&inst, temp_json, "SkuBidItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			bids = new_list;
		}
		
	}
}

PutSkuBidsRequest::PutSkuBidsRequest(char* json)
{
	this->fromJson(json);
}

char*
PutSkuBidsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SkuBidItemDTO")) {
		list<SkuBidItemDTO> new_list = static_cast<list <SkuBidItemDTO> > (getBids());
		node = converttoJson(&new_list, "SkuBidItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<SkuBidItemDTO> new_list = static_cast<list <SkuBidItemDTO> > (getBids());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SkuBidItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SkuBidItemDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *bidsKey = "bids";
	json_object_set_member(pJsonObject, bidsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<SkuBidItemDTO>
PutSkuBidsRequest::getBids()
{
	return bids;
}

void
PutSkuBidsRequest::setBids(std::list <SkuBidItemDTO> bids)
{
	this->bids = bids;
}


