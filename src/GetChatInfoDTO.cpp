#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetChatInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetChatInfoDTO::GetChatInfoDTO()
{
	//__init();
}

GetChatInfoDTO::~GetChatInfoDTO()
{
	//__cleanup();
}

void
GetChatInfoDTO::__init()
{
	//chatId = long(0);
	//orderId = long(0);
	//type = new ChatType();
	//status = new ChatStatusType();
	//createdAt = null;
	//updatedAt = null;
}

void
GetChatInfoDTO::__cleanup()
{
	//if(chatId != NULL) {
	//
	//delete chatId;
	//chatId = NULL;
	//}
	//if(orderId != NULL) {
	//
	//delete orderId;
	//orderId = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(createdAt != NULL) {
	//
	//delete createdAt;
	//createdAt = NULL;
	//}
	//if(updatedAt != NULL) {
	//
	//delete updatedAt;
	//updatedAt = NULL;
	//}
	//
}

void
GetChatInfoDTO::fromJson(char* jsonStr)
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
	const gchar *orderIdKey = "orderId";
	node = json_object_get_member(pJsonObject, orderIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&orderId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatType")) {
			jsonToValue(&type, node, "ChatType", "ChatType");
		} else {
			
			ChatType* obj = static_cast<ChatType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatStatusType")) {
			jsonToValue(&status, node, "ChatStatusType", "ChatStatusType");
		} else {
			
			ChatStatusType* obj = static_cast<ChatStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *updatedAtKey = "updatedAt";
	node = json_object_get_member(pJsonObject, updatedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updatedAt, node, "std::string", "");
		} else {
			
		}
	}
}

GetChatInfoDTO::GetChatInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
GetChatInfoDTO::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getOrderId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *orderIdKey = "orderId";
	json_object_set_member(pJsonObject, orderIdKey, node);
	if (isprimitive("ChatType")) {
		ChatType obj = getType();
		node = converttoJson(&obj, "ChatType", "");
	}
	else {
		
		ChatType obj = static_cast<ChatType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("ChatStatusType")) {
		ChatStatusType obj = getStatus();
		node = converttoJson(&obj, "ChatStatusType", "");
	}
	else {
		
		ChatStatusType obj = static_cast<ChatStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *createdAtKey = "createdAt";
	json_object_set_member(pJsonObject, createdAtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updatedAtKey = "updatedAt";
	json_object_set_member(pJsonObject, updatedAtKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GetChatInfoDTO::getChatId()
{
	return chatId;
}

void
GetChatInfoDTO::setChatId(long long  chatId)
{
	this->chatId = chatId;
}

long long
GetChatInfoDTO::getOrderId()
{
	return orderId;
}

void
GetChatInfoDTO::setOrderId(long long  orderId)
{
	this->orderId = orderId;
}

ChatType
GetChatInfoDTO::getType()
{
	return type;
}

void
GetChatInfoDTO::setType(ChatType  type)
{
	this->type = type;
}

ChatStatusType
GetChatInfoDTO::getStatus()
{
	return status;
}

void
GetChatInfoDTO::setStatus(ChatStatusType  status)
{
	this->status = status;
}

std::string
GetChatInfoDTO::getCreatedAt()
{
	return createdAt;
}

void
GetChatInfoDTO::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

std::string
GetChatInfoDTO::getUpdatedAt()
{
	return updatedAt;
}

void
GetChatInfoDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}


