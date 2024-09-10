#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetBidsInfoResponseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetBidsInfoResponseDTO::GetBidsInfoResponseDTO()
{
	//__init();
}

GetBidsInfoResponseDTO::~GetBidsInfoResponseDTO()
{
	//__cleanup();
}

void
GetBidsInfoResponseDTO::__init()
{
	//new std::list()std::list> bids;
	//paging = new ForwardScrollingPagerDTO();
}

void
GetBidsInfoResponseDTO::__cleanup()
{
	//if(bids != NULL) {
	//bids.RemoveAll(true);
	//delete bids;
	//bids = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//
}

void
GetBidsInfoResponseDTO::fromJson(char* jsonStr)
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
	const gchar *pagingKey = "paging";
	node = json_object_get_member(pJsonObject, pagingKey);
	if (node !=NULL) {
	

		if (isprimitive("ForwardScrollingPagerDTO")) {
			jsonToValue(&paging, node, "ForwardScrollingPagerDTO", "ForwardScrollingPagerDTO");
		} else {
			
			ForwardScrollingPagerDTO* obj = static_cast<ForwardScrollingPagerDTO*> (&paging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetBidsInfoResponseDTO::GetBidsInfoResponseDTO(char* json)
{
	this->fromJson(json);
}

char*
GetBidsInfoResponseDTO::toJson()
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
	if (isprimitive("ForwardScrollingPagerDTO")) {
		ForwardScrollingPagerDTO obj = getPaging();
		node = converttoJson(&obj, "ForwardScrollingPagerDTO", "");
	}
	else {
		
		ForwardScrollingPagerDTO obj = static_cast<ForwardScrollingPagerDTO> (getPaging());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagingKey = "paging";
	json_object_set_member(pJsonObject, pagingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<SkuBidItemDTO>
GetBidsInfoResponseDTO::getBids()
{
	return bids;
}

void
GetBidsInfoResponseDTO::setBids(std::list <SkuBidItemDTO> bids)
{
	this->bids = bids;
}

ForwardScrollingPagerDTO
GetBidsInfoResponseDTO::getPaging()
{
	return paging;
}

void
GetBidsInfoResponseDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}


