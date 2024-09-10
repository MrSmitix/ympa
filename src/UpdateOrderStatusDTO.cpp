#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOrderStatusDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOrderStatusDTO::UpdateOrderStatusDTO()
{
	//__init();
}

UpdateOrderStatusDTO::~UpdateOrderStatusDTO()
{
	//__cleanup();
}

void
UpdateOrderStatusDTO::__init()
{
	//id = long(0);
	//status = new OrderStatusType();
	//substatus = new OrderSubstatusType();
	//updateStatus = new OrderUpdateStatusType();
	//errorDetails = std::string();
}

void
UpdateOrderStatusDTO::__cleanup()
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
	//if(updateStatus != NULL) {
	//
	//delete updateStatus;
	//updateStatus = NULL;
	//}
	//if(errorDetails != NULL) {
	//
	//delete errorDetails;
	//errorDetails = NULL;
	//}
	//
}

void
UpdateOrderStatusDTO::fromJson(char* jsonStr)
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
	const gchar *updateStatusKey = "updateStatus";
	node = json_object_get_member(pJsonObject, updateStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderUpdateStatusType")) {
			jsonToValue(&updateStatus, node, "OrderUpdateStatusType", "OrderUpdateStatusType");
		} else {
			
			OrderUpdateStatusType* obj = static_cast<OrderUpdateStatusType*> (&updateStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *errorDetailsKey = "errorDetails";
	node = json_object_get_member(pJsonObject, errorDetailsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&errorDetails, node, "std::string", "");
		} else {
			
		}
	}
}

UpdateOrderStatusDTO::UpdateOrderStatusDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateOrderStatusDTO::toJson()
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
	if (isprimitive("OrderUpdateStatusType")) {
		OrderUpdateStatusType obj = getUpdateStatus();
		node = converttoJson(&obj, "OrderUpdateStatusType", "");
	}
	else {
		
		OrderUpdateStatusType obj = static_cast<OrderUpdateStatusType> (getUpdateStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *updateStatusKey = "updateStatus";
	json_object_set_member(pJsonObject, updateStatusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getErrorDetails();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *errorDetailsKey = "errorDetails";
	json_object_set_member(pJsonObject, errorDetailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
UpdateOrderStatusDTO::getId()
{
	return id;
}

void
UpdateOrderStatusDTO::setId(long long  id)
{
	this->id = id;
}

OrderStatusType
UpdateOrderStatusDTO::getStatus()
{
	return status;
}

void
UpdateOrderStatusDTO::setStatus(OrderStatusType  status)
{
	this->status = status;
}

OrderSubstatusType
UpdateOrderStatusDTO::getSubstatus()
{
	return substatus;
}

void
UpdateOrderStatusDTO::setSubstatus(OrderSubstatusType  substatus)
{
	this->substatus = substatus;
}

OrderUpdateStatusType
UpdateOrderStatusDTO::getUpdateStatus()
{
	return updateStatus;
}

void
UpdateOrderStatusDTO::setUpdateStatus(OrderUpdateStatusType  updateStatus)
{
	this->updateStatus = updateStatus;
}

std::string
UpdateOrderStatusDTO::getErrorDetails()
{
	return errorDetails;
}

void
UpdateOrderStatusDTO::setErrorDetails(std::string  errorDetails)
{
	this->errorDetails = errorDetails;
}


