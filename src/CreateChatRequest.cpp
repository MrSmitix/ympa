#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatRequest::CreateChatRequest()
{
	//__init();
}

CreateChatRequest::~CreateChatRequest()
{
	//__cleanup();
}

void
CreateChatRequest::__init()
{
	//orderId = long(0);
}

void
CreateChatRequest::__cleanup()
{
	//if(orderId != NULL) {
	//
	//delete orderId;
	//orderId = NULL;
	//}
	//
}

void
CreateChatRequest::fromJson(char* jsonStr)
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
}

CreateChatRequest::CreateChatRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateChatRequest::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CreateChatRequest::getOrderId()
{
	return orderId;
}

void
CreateChatRequest::setOrderId(long long  orderId)
{
	this->orderId = orderId;
}


