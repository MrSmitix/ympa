#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOutletsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOutletsResponse::GetOutletsResponse()
{
	//__init();
}

GetOutletsResponse::~GetOutletsResponse()
{
	//__cleanup();
}

void
GetOutletsResponse::__init()
{
	//new std::list()std::list> outlets;
	//paging = new ScrollingPagerDTO();
	//pager = new FlippingPagerDTO();
}

void
GetOutletsResponse::__cleanup()
{
	//if(outlets != NULL) {
	//outlets.RemoveAll(true);
	//delete outlets;
	//outlets = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//if(pager != NULL) {
	//
	//delete pager;
	//pager = NULL;
	//}
	//
}

void
GetOutletsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *outletsKey = "outlets";
	node = json_object_get_member(pJsonObject, outletsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FullOutletDTO> new_list;
			FullOutletDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FullOutletDTO")) {
					jsonToValue(&inst, temp_json, "FullOutletDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			outlets = new_list;
		}
		
	}
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
	const gchar *pagerKey = "pager";
	node = json_object_get_member(pJsonObject, pagerKey);
	if (node !=NULL) {
	

		if (isprimitive("FlippingPagerDTO")) {
			jsonToValue(&pager, node, "FlippingPagerDTO", "FlippingPagerDTO");
		} else {
			
			FlippingPagerDTO* obj = static_cast<FlippingPagerDTO*> (&pager);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetOutletsResponse::GetOutletsResponse(char* json)
{
	this->fromJson(json);
}

char*
GetOutletsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FullOutletDTO")) {
		list<FullOutletDTO> new_list = static_cast<list <FullOutletDTO> > (getOutlets());
		node = converttoJson(&new_list, "FullOutletDTO", "array");
	} else {
		node = json_node_alloc();
		list<FullOutletDTO> new_list = static_cast<list <FullOutletDTO> > (getOutlets());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FullOutletDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FullOutletDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *outletsKey = "outlets";
	json_object_set_member(pJsonObject, outletsKey, node);
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
	if (isprimitive("FlippingPagerDTO")) {
		FlippingPagerDTO obj = getPager();
		node = converttoJson(&obj, "FlippingPagerDTO", "");
	}
	else {
		
		FlippingPagerDTO obj = static_cast<FlippingPagerDTO> (getPager());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagerKey = "pager";
	json_object_set_member(pJsonObject, pagerKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<FullOutletDTO>
GetOutletsResponse::getOutlets()
{
	return outlets;
}

void
GetOutletsResponse::setOutlets(std::list <FullOutletDTO> outlets)
{
	this->outlets = outlets;
}

ScrollingPagerDTO
GetOutletsResponse::getPaging()
{
	return paging;
}

void
GetOutletsResponse::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

FlippingPagerDTO
GetOutletsResponse::getPager()
{
	return pager;
}

void
GetOutletsResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}


