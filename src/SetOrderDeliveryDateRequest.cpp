#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SetOrderDeliveryDateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SetOrderDeliveryDateRequest::SetOrderDeliveryDateRequest()
{
	//__init();
}

SetOrderDeliveryDateRequest::~SetOrderDeliveryDateRequest()
{
	//__cleanup();
}

void
SetOrderDeliveryDateRequest::__init()
{
	//dates = new OrderDeliveryDateDTO();
	//reason = new OrderDeliveryDateReasonType();
}

void
SetOrderDeliveryDateRequest::__cleanup()
{
	//if(dates != NULL) {
	//
	//delete dates;
	//dates = NULL;
	//}
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//
}

void
SetOrderDeliveryDateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *datesKey = "dates";
	node = json_object_get_member(pJsonObject, datesKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDeliveryDateDTO")) {
			jsonToValue(&dates, node, "OrderDeliveryDateDTO", "OrderDeliveryDateDTO");
		} else {
			
			OrderDeliveryDateDTO* obj = static_cast<OrderDeliveryDateDTO*> (&dates);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDeliveryDateReasonType")) {
			jsonToValue(&reason, node, "OrderDeliveryDateReasonType", "OrderDeliveryDateReasonType");
		} else {
			
			OrderDeliveryDateReasonType* obj = static_cast<OrderDeliveryDateReasonType*> (&reason);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

SetOrderDeliveryDateRequest::SetOrderDeliveryDateRequest(char* json)
{
	this->fromJson(json);
}

char*
SetOrderDeliveryDateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderDeliveryDateDTO")) {
		OrderDeliveryDateDTO obj = getDates();
		node = converttoJson(&obj, "OrderDeliveryDateDTO", "");
	}
	else {
		
		OrderDeliveryDateDTO obj = static_cast<OrderDeliveryDateDTO> (getDates());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *datesKey = "dates";
	json_object_set_member(pJsonObject, datesKey, node);
	if (isprimitive("OrderDeliveryDateReasonType")) {
		OrderDeliveryDateReasonType obj = getReason();
		node = converttoJson(&obj, "OrderDeliveryDateReasonType", "");
	}
	else {
		
		OrderDeliveryDateReasonType obj = static_cast<OrderDeliveryDateReasonType> (getReason());
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

OrderDeliveryDateDTO
SetOrderDeliveryDateRequest::getDates()
{
	return dates;
}

void
SetOrderDeliveryDateRequest::setDates(OrderDeliveryDateDTO  dates)
{
	this->dates = dates;
}

OrderDeliveryDateReasonType
SetOrderDeliveryDateRequest::getReason()
{
	return reason;
}

void
SetOrderDeliveryDateRequest::setReason(OrderDeliveryDateReasonType  reason)
{
	this->reason = reason;
}


