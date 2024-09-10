#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOrderStatusesRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOrderStatusesRequest::UpdateOrderStatusesRequest()
{
	//__init();
}

UpdateOrderStatusesRequest::~UpdateOrderStatusesRequest()
{
	//__cleanup();
}

void
UpdateOrderStatusesRequest::__init()
{
	//new std::list()std::list> orders;
}

void
UpdateOrderStatusesRequest::__cleanup()
{
	//if(orders != NULL) {
	//orders.RemoveAll(true);
	//delete orders;
	//orders = NULL;
	//}
	//
}

void
UpdateOrderStatusesRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ordersKey = "orders";
	node = json_object_get_member(pJsonObject, ordersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderStateDTO> new_list;
			OrderStateDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderStateDTO")) {
					jsonToValue(&inst, temp_json, "OrderStateDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			orders = new_list;
		}
		
	}
}

UpdateOrderStatusesRequest::UpdateOrderStatusesRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateOrderStatusesRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderStateDTO")) {
		list<OrderStateDTO> new_list = static_cast<list <OrderStateDTO> > (getOrders());
		node = converttoJson(&new_list, "OrderStateDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderStateDTO> new_list = static_cast<list <OrderStateDTO> > (getOrders());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderStateDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderStateDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ordersKey = "orders";
	json_object_set_member(pJsonObject, ordersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OrderStateDTO>
UpdateOrderStatusesRequest::getOrders()
{
	return orders;
}

void
UpdateOrderStatusesRequest::setOrders(std::list <OrderStateDTO> orders)
{
	this->orders = orders;
}


