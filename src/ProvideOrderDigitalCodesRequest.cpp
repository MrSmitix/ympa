#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProvideOrderDigitalCodesRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProvideOrderDigitalCodesRequest::ProvideOrderDigitalCodesRequest()
{
	//__init();
}

ProvideOrderDigitalCodesRequest::~ProvideOrderDigitalCodesRequest()
{
	//__cleanup();
}

void
ProvideOrderDigitalCodesRequest::__init()
{
	//new std::list()std::list> items;
}

void
ProvideOrderDigitalCodesRequest::__cleanup()
{
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
ProvideOrderDigitalCodesRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderDigitalItemDTO> new_list;
			OrderDigitalItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderDigitalItemDTO")) {
					jsonToValue(&inst, temp_json, "OrderDigitalItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

ProvideOrderDigitalCodesRequest::ProvideOrderDigitalCodesRequest(char* json)
{
	this->fromJson(json);
}

char*
ProvideOrderDigitalCodesRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderDigitalItemDTO")) {
		list<OrderDigitalItemDTO> new_list = static_cast<list <OrderDigitalItemDTO> > (getItems());
		node = converttoJson(&new_list, "OrderDigitalItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderDigitalItemDTO> new_list = static_cast<list <OrderDigitalItemDTO> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderDigitalItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderDigitalItemDTO obj = *it;
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

std::list<OrderDigitalItemDTO>
ProvideOrderDigitalCodesRequest::getItems()
{
	return items;
}

void
ProvideOrderDigitalCodesRequest::setItems(std::list <OrderDigitalItemDTO> items)
{
	this->items = items;
}


