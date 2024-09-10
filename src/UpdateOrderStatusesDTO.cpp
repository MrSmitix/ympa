#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOrderStatusesDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOrderStatusesDTO::UpdateOrderStatusesDTO()
{
	//__init();
}

UpdateOrderStatusesDTO::~UpdateOrderStatusesDTO()
{
	//__cleanup();
}

void
UpdateOrderStatusesDTO::__init()
{
	//new std::list()std::list> orders;
}

void
UpdateOrderStatusesDTO::__cleanup()
{
	//if(orders != NULL) {
	//orders.RemoveAll(true);
	//delete orders;
	//orders = NULL;
	//}
	//
}

void
UpdateOrderStatusesDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ordersKey = "orders";
	node = json_object_get_member(pJsonObject, ordersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateOrderStatusDTO> new_list;
			UpdateOrderStatusDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateOrderStatusDTO")) {
					jsonToValue(&inst, temp_json, "UpdateOrderStatusDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			orders = new_list;
		}
		
	}
}

UpdateOrderStatusesDTO::UpdateOrderStatusesDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateOrderStatusesDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdateOrderStatusDTO")) {
		list<UpdateOrderStatusDTO> new_list = static_cast<list <UpdateOrderStatusDTO> > (getOrders());
		node = converttoJson(&new_list, "UpdateOrderStatusDTO", "array");
	} else {
		node = json_node_alloc();
		list<UpdateOrderStatusDTO> new_list = static_cast<list <UpdateOrderStatusDTO> > (getOrders());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateOrderStatusDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateOrderStatusDTO obj = *it;
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

std::list<UpdateOrderStatusDTO>
UpdateOrderStatusesDTO::getOrders()
{
	return orders;
}

void
UpdateOrderStatusesDTO::setOrders(std::list <UpdateOrderStatusDTO> orders)
{
	this->orders = orders;
}


