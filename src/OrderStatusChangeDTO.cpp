#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderStatusChangeDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderStatusChangeDTO::OrderStatusChangeDTO()
{
	//__init();
}

OrderStatusChangeDTO::~OrderStatusChangeDTO()
{
	//__cleanup();
}

void
OrderStatusChangeDTO::__init()
{
	//status = new OrderStatusType();
	//substatus = new OrderSubstatusType();
	//delivery = new OrderStatusChangeDeliveryDTO();
}

void
OrderStatusChangeDTO::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(substatus != NULL) {
	//
	//delete substatus;
	//substatus = NULL;
	//}
	//if(delivery != NULL) {
	//
	//delete delivery;
	//delivery = NULL;
	//}
	//
}

void
OrderStatusChangeDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderStatusType")) {
			jsonToValue(&status, node, "OrderStatusType", "OrderStatusType");
		} else {
			
			OrderStatusType* obj = static_cast<OrderStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *substatusKey = "substatus";
	node = json_object_get_member(pJsonObject, substatusKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderSubstatusType")) {
			jsonToValue(&substatus, node, "OrderSubstatusType", "OrderSubstatusType");
		} else {
			
			OrderSubstatusType* obj = static_cast<OrderSubstatusType*> (&substatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deliveryKey = "delivery";
	node = json_object_get_member(pJsonObject, deliveryKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderStatusChangeDeliveryDTO")) {
			jsonToValue(&delivery, node, "OrderStatusChangeDeliveryDTO", "OrderStatusChangeDeliveryDTO");
		} else {
			
			OrderStatusChangeDeliveryDTO* obj = static_cast<OrderStatusChangeDeliveryDTO*> (&delivery);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrderStatusChangeDTO::OrderStatusChangeDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderStatusChangeDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderStatusType")) {
		OrderStatusType obj = getStatus();
		node = converttoJson(&obj, "OrderStatusType", "");
	}
	else {
		
		OrderStatusType obj = static_cast<OrderStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("OrderSubstatusType")) {
		OrderSubstatusType obj = getSubstatus();
		node = converttoJson(&obj, "OrderSubstatusType", "");
	}
	else {
		
		OrderSubstatusType obj = static_cast<OrderSubstatusType> (getSubstatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *substatusKey = "substatus";
	json_object_set_member(pJsonObject, substatusKey, node);
	if (isprimitive("OrderStatusChangeDeliveryDTO")) {
		OrderStatusChangeDeliveryDTO obj = getDelivery();
		node = converttoJson(&obj, "OrderStatusChangeDeliveryDTO", "");
	}
	else {
		
		OrderStatusChangeDeliveryDTO obj = static_cast<OrderStatusChangeDeliveryDTO> (getDelivery());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deliveryKey = "delivery";
	json_object_set_member(pJsonObject, deliveryKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrderStatusType
OrderStatusChangeDTO::getStatus()
{
	return status;
}

void
OrderStatusChangeDTO::setStatus(OrderStatusType  status)
{
	this->status = status;
}

OrderSubstatusType
OrderStatusChangeDTO::getSubstatus()
{
	return substatus;
}

void
OrderStatusChangeDTO::setSubstatus(OrderSubstatusType  substatus)
{
	this->substatus = substatus;
}

OrderStatusChangeDeliveryDTO
OrderStatusChangeDTO::getDelivery()
{
	return delivery;
}

void
OrderStatusChangeDTO::setDelivery(OrderStatusChangeDeliveryDTO  delivery)
{
	this->delivery = delivery;
}


