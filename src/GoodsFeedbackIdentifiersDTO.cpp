#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsFeedbackIdentifiersDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsFeedbackIdentifiersDTO::GoodsFeedbackIdentifiersDTO()
{
	//__init();
}

GoodsFeedbackIdentifiersDTO::~GoodsFeedbackIdentifiersDTO()
{
	//__cleanup();
}

void
GoodsFeedbackIdentifiersDTO::__init()
{
	//orderId = long(0);
	//modelId = long(0);
}

void
GoodsFeedbackIdentifiersDTO::__cleanup()
{
	//if(orderId != NULL) {
	//
	//delete orderId;
	//orderId = NULL;
	//}
	//if(modelId != NULL) {
	//
	//delete modelId;
	//modelId = NULL;
	//}
	//
}

void
GoodsFeedbackIdentifiersDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orderIdKey = "orderId";
	node = json_object_get_member(pJsonObject, orderIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&orderId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *modelIdKey = "modelId";
	node = json_object_get_member(pJsonObject, modelIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&modelId, node, "long long", "");
		} else {
			
		}
	}
}

GoodsFeedbackIdentifiersDTO::GoodsFeedbackIdentifiersDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsFeedbackIdentifiersDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getOrderId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *orderIdKey = "orderId";
	json_object_set_member(pJsonObject, orderIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getModelId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *modelIdKey = "modelId";
	json_object_set_member(pJsonObject, modelIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GoodsFeedbackIdentifiersDTO::getOrderId()
{
	return orderId;
}

void
GoodsFeedbackIdentifiersDTO::setOrderId(long long  orderId)
{
	this->orderId = orderId;
}

long long
GoodsFeedbackIdentifiersDTO::getModelId()
{
	return modelId;
}

void
GoodsFeedbackIdentifiersDTO::setModelId(long long  modelId)
{
	this->modelId = modelId;
}


