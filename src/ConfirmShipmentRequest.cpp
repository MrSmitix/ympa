#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConfirmShipmentRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConfirmShipmentRequest::ConfirmShipmentRequest()
{
	//__init();
}

ConfirmShipmentRequest::~ConfirmShipmentRequest()
{
	//__cleanup();
}

void
ConfirmShipmentRequest::__init()
{
	//externalShipmentId = std::string();
}

void
ConfirmShipmentRequest::__cleanup()
{
	//if(externalShipmentId != NULL) {
	//
	//delete externalShipmentId;
	//externalShipmentId = NULL;
	//}
	//
}

void
ConfirmShipmentRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *externalShipmentIdKey = "externalShipmentId";
	node = json_object_get_member(pJsonObject, externalShipmentIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&externalShipmentId, node, "std::string", "");
		} else {
			
		}
	}
}

ConfirmShipmentRequest::ConfirmShipmentRequest(char* json)
{
	this->fromJson(json);
}

char*
ConfirmShipmentRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getExternalShipmentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *externalShipmentIdKey = "externalShipmentId";
	json_object_set_member(pJsonObject, externalShipmentIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConfirmShipmentRequest::getExternalShipmentId()
{
	return externalShipmentId;
}

void
ConfirmShipmentRequest::setExternalShipmentId(std::string  externalShipmentId)
{
	this->externalShipmentId = externalShipmentId;
}


