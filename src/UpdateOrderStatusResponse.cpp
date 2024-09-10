#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOrderStatusResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOrderStatusResponse::UpdateOrderStatusResponse()
{
	//__init();
}

UpdateOrderStatusResponse::~UpdateOrderStatusResponse()
{
	//__cleanup();
}

void
UpdateOrderStatusResponse::__init()
{
	//order = new OrderDTO();
}

void
UpdateOrderStatusResponse::__cleanup()
{
	//if(order != NULL) {
	//
	//delete order;
	//order = NULL;
	//}
	//
}

void
UpdateOrderStatusResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orderKey = "order";
	node = json_object_get_member(pJsonObject, orderKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDTO")) {
			jsonToValue(&order, node, "OrderDTO", "OrderDTO");
		} else {
			
			OrderDTO* obj = static_cast<OrderDTO*> (&order);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdateOrderStatusResponse::UpdateOrderStatusResponse(char* json)
{
	this->fromJson(json);
}

char*
UpdateOrderStatusResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderDTO")) {
		OrderDTO obj = getOrder();
		node = converttoJson(&obj, "OrderDTO", "");
	}
	else {
		
		OrderDTO obj = static_cast<OrderDTO> (getOrder());
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

OrderDTO
UpdateOrderStatusResponse::getOrder()
{
	return order;
}

void
UpdateOrderStatusResponse::setOrder(OrderDTO  order)
{
	this->order = order;
}


