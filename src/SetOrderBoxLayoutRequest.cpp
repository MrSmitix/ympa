#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SetOrderBoxLayoutRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SetOrderBoxLayoutRequest::SetOrderBoxLayoutRequest()
{
	//__init();
}

SetOrderBoxLayoutRequest::~SetOrderBoxLayoutRequest()
{
	//__cleanup();
}

void
SetOrderBoxLayoutRequest::__init()
{
	//new std::list()std::list> boxes;
	//allowRemove = bool(false);
}

void
SetOrderBoxLayoutRequest::__cleanup()
{
	//if(boxes != NULL) {
	//boxes.RemoveAll(true);
	//delete boxes;
	//boxes = NULL;
	//}
	//if(allowRemove != NULL) {
	//
	//delete allowRemove;
	//allowRemove = NULL;
	//}
	//
}

void
SetOrderBoxLayoutRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *boxesKey = "boxes";
	node = json_object_get_member(pJsonObject, boxesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderBoxLayoutDTO> new_list;
			OrderBoxLayoutDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderBoxLayoutDTO")) {
					jsonToValue(&inst, temp_json, "OrderBoxLayoutDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			boxes = new_list;
		}
		
	}
	const gchar *allowRemoveKey = "allowRemove";
	node = json_object_get_member(pJsonObject, allowRemoveKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&allowRemove, node, "bool", "");
		} else {
			
		}
	}
}

SetOrderBoxLayoutRequest::SetOrderBoxLayoutRequest(char* json)
{
	this->fromJson(json);
}

char*
SetOrderBoxLayoutRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderBoxLayoutDTO")) {
		list<OrderBoxLayoutDTO> new_list = static_cast<list <OrderBoxLayoutDTO> > (getBoxes());
		node = converttoJson(&new_list, "OrderBoxLayoutDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderBoxLayoutDTO> new_list = static_cast<list <OrderBoxLayoutDTO> > (getBoxes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderBoxLayoutDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderBoxLayoutDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *boxesKey = "boxes";
	json_object_set_member(pJsonObject, boxesKey, node);
	if (isprimitive("bool")) {
		bool obj = getAllowRemove();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *allowRemoveKey = "allowRemove";
	json_object_set_member(pJsonObject, allowRemoveKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OrderBoxLayoutDTO>
SetOrderBoxLayoutRequest::getBoxes()
{
	return boxes;
}

void
SetOrderBoxLayoutRequest::setBoxes(std::list <OrderBoxLayoutDTO> boxes)
{
	this->boxes = boxes;
}

bool
SetOrderBoxLayoutRequest::getAllowRemove()
{
	return allowRemove;
}

void
SetOrderBoxLayoutRequest::setAllowRemove(bool  allowRemove)
{
	this->allowRemove = allowRemove;
}


