#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOrderStatusRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOrderStatusRequest::UpdateOrderStatusRequest()
{
	//__init();
}

UpdateOrderStatusRequest::~UpdateOrderStatusRequest()
{
	//__cleanup();
}

void
UpdateOrderStatusRequest::__init()
{
	//order = new OrderStatusChangeDTO();
}

void
UpdateOrderStatusRequest::__cleanup()
{
	//if(order != NULL) {
	//
	//delete order;
	//order = NULL;
	//}
	//
}

void
UpdateOrderStatusRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orderKey = "order";
	node = json_object_get_member(pJsonObject, orderKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderStatusChangeDTO")) {
			jsonToValue(&order, node, "OrderStatusChangeDTO", "OrderStatusChangeDTO");
		} else {
			
			OrderStatusChangeDTO* obj = static_cast<OrderStatusChangeDTO*> (&order);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdateOrderStatusRequest::UpdateOrderStatusRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateOrderStatusRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderStatusChangeDTO")) {
		OrderStatusChangeDTO obj = getOrder();
		node = converttoJson(&obj, "OrderStatusChangeDTO", "");
	}
	else {
		
		OrderStatusChangeDTO obj = static_cast<OrderStatusChangeDTO> (getOrder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orderKey = "order";
	json_object_set_member(pJsonObject, orderKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrderStatusChangeDTO
UpdateOrderStatusRequest::getOrder()
{
	return order;
}

void
UpdateOrderStatusRequest::setOrder(OrderStatusChangeDTO  order)
{
	this->order = order;
}


