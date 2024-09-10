#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderStateDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderStateDTO::OrderStateDTO()
{
	//__init();
}

OrderStateDTO::~OrderStateDTO()
{
	//__cleanup();
}

void
OrderStateDTO::__init()
{
	//id = long(0);
	//status = new OrderStatusType();
	//substatus = new OrderSubstatusType();
}

void
OrderStateDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
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
	//
}

void
OrderStateDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
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
}

OrderStateDTO::OrderStateDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderStateDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrderStateDTO::getId()
{
	return id;
}

void
OrderStateDTO::setId(long long  id)
{
	this->id = id;
}

OrderStatusType
OrderStateDTO::getStatus()
{
	return status;
}

void
OrderStateDTO::setStatus(OrderStatusType  status)
{
	this->status = status;
}

OrderSubstatusType
OrderStateDTO::getSubstatus()
{
	return substatus;
}

void
OrderStateDTO::setSubstatus(OrderSubstatusType  substatus)
{
	this->substatus = substatus;
}


