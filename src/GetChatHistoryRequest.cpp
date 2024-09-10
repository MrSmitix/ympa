#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetChatHistoryRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetChatHistoryRequest::GetChatHistoryRequest()
{
	//__init();
}

GetChatHistoryRequest::~GetChatHistoryRequest()
{
	//__cleanup();
}

void
GetChatHistoryRequest::__init()
{
	//messageIdFrom = long(0);
}

void
GetChatHistoryRequest::__cleanup()
{
	//if(messageIdFrom != NULL) {
	//
	//delete messageIdFrom;
	//messageIdFrom = NULL;
	//}
	//
}

void
GetChatHistoryRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messageIdFromKey = "messageIdFrom";
	node = json_object_get_member(pJsonObject, messageIdFromKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&messageIdFrom, node, "long long", "");
		} else {
			
		}
	}
}

GetChatHistoryRequest::GetChatHistoryRequest(char* json)
{
	this->fromJson(json);
}

char*
GetChatHistoryRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getMessageIdFrom();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *messageIdFromKey = "messageIdFrom";
	json_object_set_member(pJsonObject, messageIdFromKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GetChatHistoryRequest::getMessageIdFrom()
{
	return messageIdFrom;
}

void
GetChatHistoryRequest::setMessageIdFrom(long long  messageIdFrom)
{
	this->messageIdFrom = messageIdFrom;
}


