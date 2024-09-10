#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SetShipmentPalletsCountRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SetShipmentPalletsCountRequest::SetShipmentPalletsCountRequest()
{
	//__init();
}

SetShipmentPalletsCountRequest::~SetShipmentPalletsCountRequest()
{
	//__cleanup();
}

void
SetShipmentPalletsCountRequest::__init()
{
	//placesCount = int(0);
}

void
SetShipmentPalletsCountRequest::__cleanup()
{
	//if(placesCount != NULL) {
	//
	//delete placesCount;
	//placesCount = NULL;
	//}
	//
}

void
SetShipmentPalletsCountRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *placesCountKey = "placesCount";
	node = json_object_get_member(pJsonObject, placesCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&placesCount, node, "int", "");
		} else {
			
		}
	}
}

SetShipmentPalletsCountRequest::SetShipmentPalletsCountRequest(char* json)
{
	this->fromJson(json);
}

char*
SetShipmentPalletsCountRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getPlacesCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *placesCountKey = "placesCount";
	json_object_set_member(pJsonObject, placesCountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
SetShipmentPalletsCountRequest::getPlacesCount()
{
	return placesCount;
}

void
SetShipmentPalletsCountRequest::setPlacesCount(int  placesCount)
{
	this->placesCount = placesCount;
}


