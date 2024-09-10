#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatMessageDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatMessageDTO::ChatMessageDTO()
{
	//__init();
}

ChatMessageDTO::~ChatMessageDTO()
{
	//__cleanup();
}

void
ChatMessageDTO::__init()
{
	//messageId = long(0);
	//createdAt = null;
	//sender = new ChatMessageSenderType();
	//message = std::string();
	//new std::list()std::list> payload;
}

void
ChatMessageDTO::__cleanup()
{
	//if(messageId != NULL) {
	//
	//delete messageId;
	//messageId = NULL;
	//}
	//if(createdAt != NULL) {
	//
	//delete createdAt;
	//createdAt = NULL;
	//}
	//if(sender != NULL) {
	//
	//delete sender;
	//sender = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//if(payload != NULL) {
	//payload.RemoveAll(true);
	//delete payload;
	//payload = NULL;
	//}
	//
}

void
ChatMessageDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messageIdKey = "messageId";
	node = json_object_get_member(pJsonObject, messageIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&messageId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *createdAtKey = "createdAt";
	node = json_object_get_member(pJsonObject, createdAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&createdAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *senderKey = "sender";
	node = json_object_get_member(pJsonObject, senderKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatMessageSenderType")) {
			jsonToValue(&sender, node, "ChatMessageSenderType", "ChatMessageSenderType");
		} else {
			
			ChatMessageSenderType* obj = static_cast<ChatMessageSenderType*> (&sender);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *payloadKey = "payload";
	node = json_object_get_member(pJsonObject, payloadKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatMessagePayloadDTO> new_list;
			ChatMessagePayloadDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatMessagePayloadDTO")) {
					jsonToValue(&inst, temp_json, "ChatMessagePayloadDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			payload = new_list;
		}
		
	}
}

ChatMessageDTO::ChatMessageDTO(char* json)
{
	this->fromJson(json);
}

char*
ChatMessageDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getMessageId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *messageIdKey = "messageId";
	json_object_set_member(pJsonObject, messageIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *createdAtKey = "createdAt";
	json_object_set_member(pJsonObject, createdAtKey, node);
	if (isprimitive("ChatMessageSenderType")) {
		ChatMessageSenderType obj = getSender();
		node = converttoJson(&obj, "ChatMessageSenderType", "");
	}
	else {
		
		ChatMessageSenderType obj = static_cast<ChatMessageSenderType> (getSender());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *senderKey = "sender";
	json_object_set_member(pJsonObject, senderKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	if (isprimitive("ChatMessagePayloadDTO")) {
		list<ChatMessagePayloadDTO> new_list = static_cast<list <ChatMessagePayloadDTO> > (getPayload());
		node = converttoJson(&new_list, "ChatMessagePayloadDTO", "array");
	} else {
		node = json_node_alloc();
		list<ChatMessagePayloadDTO> new_list = static_cast<list <ChatMessagePayloadDTO> > (getPayload());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatMessagePayloadDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatMessagePayloadDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *payloadKey = "payload";
	json_object_set_member(pJsonObject, payloadKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
ChatMessageDTO::getMessageId()
{
	return messageId;
}

void
ChatMessageDTO::setMessageId(long long  messageId)
{
	this->messageId = messageId;
}

std::string
ChatMessageDTO::getCreatedAt()
{
	return createdAt;
}

void
ChatMessageDTO::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

ChatMessageSenderType
ChatMessageDTO::getSender()
{
	return sender;
}

void
ChatMessageDTO::setSender(ChatMessageSenderType  sender)
{
	this->sender = sender;
}

std::string
ChatMessageDTO::getMessage()
{
	return message;
}

void
ChatMessageDTO::setMessage(std::string  message)
{
	this->message = message;
}

std::list<ChatMessagePayloadDTO>
ChatMessageDTO::getPayload()
{
	return payload;
}

void
ChatMessageDTO::setPayload(std::list <ChatMessagePayloadDTO> payload)
{
	this->payload = payload;
}


