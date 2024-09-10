#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SetOrderDeliveryTrackCodeRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SetOrderDeliveryTrackCodeRequest::SetOrderDeliveryTrackCodeRequest()
{
	//__init();
}

SetOrderDeliveryTrackCodeRequest::~SetOrderDeliveryTrackCodeRequest()
{
	//__cleanup();
}

void
SetOrderDeliveryTrackCodeRequest::__init()
{
	//trackCode = std::string();
	//deliveryServiceId = long(0);
}

void
SetOrderDeliveryTrackCodeRequest::__cleanup()
{
	//if(trackCode != NULL) {
	//
	//delete trackCode;
	//trackCode = NULL;
	//}
	//if(deliveryServiceId != NULL) {
	//
	//delete deliveryServiceId;
	//deliveryServiceId = NULL;
	//}
	//
}

void
SetOrderDeliveryTrackCodeRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *trackCodeKey = "trackCode";
	node = json_object_get_member(pJsonObject, trackCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&trackCode, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *deliveryServiceIdKey = "deliveryServiceId";
	node = json_object_get_member(pJsonObject, deliveryServiceIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&deliveryServiceId, node, "long long", "");
		} else {
			
		}
	}
}

SetOrderDeliveryTrackCodeRequest::SetOrderDeliveryTrackCodeRequest(char* json)
{
	this->fromJson(json);
}

char*
SetOrderDeliveryTrackCodeRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getTrackCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *trackCodeKey = "trackCode";
	json_object_set_member(pJsonObject, trackCodeKey, node);
	if (isprimitive("long long")) {
		long long obj = getDeliveryServiceId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *deliveryServiceIdKey = "deliveryServiceId";
	json_object_set_member(pJsonObject, deliveryServiceIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SetOrderDeliveryTrackCodeRequest::getTrackCode()
{
	return trackCode;
}

void
SetOrderDeliveryTrackCodeRequest::setTrackCode(std::string  trackCode)
{
	this->trackCode = trackCode;
}

long long
SetOrderDeliveryTrackCodeRequest::getDeliveryServiceId()
{
	return deliveryServiceId;
}

void
SetOrderDeliveryTrackCodeRequest::setDeliveryServiceId(long long  deliveryServiceId)
{
	this->deliveryServiceId = deliveryServiceId;
}


