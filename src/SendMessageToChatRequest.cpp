#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SendMessageToChatRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SendMessageToChatRequest::SendMessageToChatRequest()
{
	//__init();
}

SendMessageToChatRequest::~SendMessageToChatRequest()
{
	//__cleanup();
}

void
SendMessageToChatRequest::__init()
{
	//message = std::string();
}

void
SendMessageToChatRequest::__cleanup()
{
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
SendMessageToChatRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

SendMessageToChatRequest::SendMessageToChatRequest(char* json)
{
	this->fromJson(json);
}

char*
SendMessageToChatRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SendMessageToChatRequest::getMessage()
{
	return message;
}

void
SendMessageToChatRequest::setMessage(std::string  message)
{
	this->message = message;
}


