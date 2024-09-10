#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AcceptOrderCancellationRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AcceptOrderCancellationRequest::AcceptOrderCancellationRequest()
{
	//__init();
}

AcceptOrderCancellationRequest::~AcceptOrderCancellationRequest()
{
	//__cleanup();
}

void
AcceptOrderCancellationRequest::__init()
{
	//accepted = bool(false);
	//reason = new OrderCancellationReasonType();
}

void
AcceptOrderCancellationRequest::__cleanup()
{
	//if(accepted != NULL) {
	//
	//delete accepted;
	//accepted = NULL;
	//}
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//
}

void
AcceptOrderCancellationRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *acceptedKey = "accepted";
	node = json_object_get_member(pJsonObject, acceptedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&accepted, node, "bool", "");
		} else {
			
		}
	}
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderCancellationReasonType")) {
			jsonToValue(&reason, node, "OrderCancellationReasonType", "OrderCancellationReasonType");
		} else {
			
			OrderCancellationReasonType* obj = static_cast<OrderCancellationReasonType*> (&reason);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AcceptOrderCancellationRequest::AcceptOrderCancellationRequest(char* json)
{
	this->fromJson(json);
}

char*
AcceptOrderCancellationRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getAccepted();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *acceptedKey = "accepted";
	json_object_set_member(pJsonObject, acceptedKey, node);
	if (isprimitive("OrderCancellationReasonType")) {
		OrderCancellationReasonType obj = getReason();
		node = converttoJson(&obj, "OrderCancellationReasonType", "");
	}
	else {
		
		OrderCancellationReasonType obj = static_cast<OrderCancellationReasonType> (getReason());
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

bool
AcceptOrderCancellationRequest::getAccepted()
{
	return accepted;
}

void
AcceptOrderCancellationRequest::setAccepted(bool  accepted)
{
	this->accepted = accepted;
}

OrderCancellationReasonType
AcceptOrderCancellationRequest::getReason()
{
	return reason;
}

void
AcceptOrderCancellationRequest::setReason(OrderCancellationReasonType  reason)
{
	this->reason = reason;
}


