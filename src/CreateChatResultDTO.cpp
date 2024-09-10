#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatResultDTO::CreateChatResultDTO()
{
	//__init();
}

CreateChatResultDTO::~CreateChatResultDTO()
{
	//__cleanup();
}

void
CreateChatResultDTO::__init()
{
	//chatId = long(0);
}

void
CreateChatResultDTO::__cleanup()
{
	//if(chatId != NULL) {
	//
	//delete chatId;
	//chatId = NULL;
	//}
	//
}

void
CreateChatResultDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *chatIdKey = "chatId";
	node = json_object_get_member(pJsonObject, chatIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&chatId, node, "long long", "");
		} else {
			
		}
	}
}

CreateChatResultDTO::CreateChatResultDTO(char* json)
{
	this->fromJson(json);
}

char*
CreateChatResultDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getChatId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *chatIdKey = "chatId";
	json_object_set_member(pJsonObject, chatIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CreateChatResultDTO::getChatId()
{
	return chatId;
}

void
CreateChatResultDTO::setChatId(long long  chatId)
{
	this->chatId = chatId;
}


