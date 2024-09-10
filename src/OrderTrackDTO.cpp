#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderTrackDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderTrackDTO::OrderTrackDTO()
{
	//__init();
}

OrderTrackDTO::~OrderTrackDTO()
{
	//__cleanup();
}

void
OrderTrackDTO::__init()
{
	//trackCode = std::string();
	//deliveryServiceId = long(0);
}

void
OrderTrackDTO::__cleanup()
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
OrderTrackDTO::fromJson(char* jsonStr)
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

OrderTrackDTO::OrderTrackDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderTrackDTO::toJson()
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
OrderTrackDTO::getTrackCode()
{
	return trackCode;
}

void
OrderTrackDTO::setTrackCode(std::string  trackCode)
{
	this->trackCode = trackCode;
}

long long
OrderTrackDTO::getDeliveryServiceId()
{
	return deliveryServiceId;
}

void
OrderTrackDTO::setDeliveryServiceId(long long  deliveryServiceId)
{
	this->deliveryServiceId = deliveryServiceId;
}


