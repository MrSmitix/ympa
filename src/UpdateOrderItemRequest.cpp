#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOrderItemRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOrderItemRequest::UpdateOrderItemRequest()
{
	//__init();
}

UpdateOrderItemRequest::~UpdateOrderItemRequest()
{
	//__cleanup();
}

void
UpdateOrderItemRequest::__init()
{
	//new std::list()std::list> items;
	//reason = new OrderItemsModificationRequestReasonType();
}

void
UpdateOrderItemRequest::__cleanup()
{
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//
}

void
UpdateOrderItemRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderItemModificationDTO> new_list;
			OrderItemModificationDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderItemModificationDTO")) {
					jsonToValue(&inst, temp_json, "OrderItemModificationDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderItemsModificationRequestReasonType")) {
			jsonToValue(&reason, node, "OrderItemsModificationRequestReasonType", "OrderItemsModificationRequestReasonType");
		} else {
			
			OrderItemsModificationRequestReasonType* obj = static_cast<OrderItemsModificationRequestReasonType*> (&reason);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdateOrderItemRequest::UpdateOrderItemRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateOrderItemRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderItemModificationDTO")) {
		list<OrderItemModificationDTO> new_list = static_cast<list <OrderItemModificationDTO> > (getItems());
		node = converttoJson(&new_list, "OrderItemModificationDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderItemModificationDTO> new_list = static_cast<list <OrderItemModificationDTO> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderItemModificationDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderItemModificationDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	if (isprimitive("OrderItemsModificationRequestReasonType")) {
		OrderItemsModificationRequestReasonType obj = getReason();
		node = converttoJson(&obj, "OrderItemsModificationRequestReasonType", "");
	}
	else {
		
		OrderItemsModificationRequestReasonType obj = static_cast<OrderItemsModificationRequestReasonType> (getReason());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reasonKey = "reason";
	json_object_set_member(pJsonObject, reasonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OrderItemModificationDTO>
UpdateOrderItemRequest::getItems()
{
	return items;
}

void
UpdateOrderItemRequest::setItems(std::list <OrderItemModificationDTO> items)
{
	this->items = items;
}

OrderItemsModificationRequestReasonType
UpdateOrderItemRequest::getReason()
{
	return reason;
}

void
UpdateOrderItemRequest::setReason(OrderItemsModificationRequestReasonType  reason)
{
	this->reason = reason;
}


