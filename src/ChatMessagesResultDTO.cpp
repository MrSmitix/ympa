#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatMessagesResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatMessagesResultDTO::ChatMessagesResultDTO()
{
	//__init();
}

ChatMessagesResultDTO::~ChatMessagesResultDTO()
{
	//__cleanup();
}

void
ChatMessagesResultDTO::__init()
{
	//orderId = long(0);
	//new std::list()std::list> messages;
	//paging = new ForwardScrollingPagerDTO();
}

void
ChatMessagesResultDTO::__cleanup()
{
	//if(orderId != NULL) {
	//
	//delete orderId;
	//orderId = NULL;
	//}
	//if(messages != NULL) {
	//messages.RemoveAll(true);
	//delete messages;
	//messages = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//
}

void
ChatMessagesResultDTO::fromJson(char* jsonStr)
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
	const gchar *messagesKey = "messages";
	node = json_object_get_member(pJsonObject, messagesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatMessageDTO> new_list;
			ChatMessageDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatMessageDTO")) {
					jsonToValue(&inst, temp_json, "ChatMessageDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			messages = new_list;
		}
		
	}
	const gchar *pagingKey = "paging";
	node = json_object_get_member(pJsonObject, pagingKey);
	if (node !=NULL) {
	

		if (isprimitive("ForwardScrollingPagerDTO")) {
			jsonToValue(&paging, node, "ForwardScrollingPagerDTO", "ForwardScrollingPagerDTO");
		} else {
			
			ForwardScrollingPagerDTO* obj = static_cast<ForwardScrollingPagerDTO*> (&paging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ChatMessagesResultDTO::ChatMessagesResultDTO(char* json)
{
	this->fromJson(json);
}

char*
ChatMessagesResultDTO::toJson()
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
	if (isprimitive("ChatMessageDTO")) {
		list<ChatMessageDTO> new_list = static_cast<list <ChatMessageDTO> > (getMessages());
		node = converttoJson(&new_list, "ChatMessageDTO", "array");
	} else {
		node = json_node_alloc();
		list<ChatMessageDTO> new_list = static_cast<list <ChatMessageDTO> > (getMessages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatMessageDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatMessageDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *messagesKey = "messages";
	json_object_set_member(pJsonObject, messagesKey, node);
	if (isprimitive("ForwardScrollingPagerDTO")) {
		ForwardScrollingPagerDTO obj = getPaging();
		node = converttoJson(&obj, "ForwardScrollingPagerDTO", "");
	}
	else {
		
		ForwardScrollingPagerDTO obj = static_cast<ForwardScrollingPagerDTO> (getPaging());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagingKey = "paging";
	json_object_set_member(pJsonObject, pagingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
ChatMessagesResultDTO::getOrderId()
{
	return orderId;
}

void
ChatMessagesResultDTO::setOrderId(long long  orderId)
{
	this->orderId = orderId;
}

std::list<ChatMessageDTO>
ChatMessagesResultDTO::getMessages()
{
	return messages;
}

void
ChatMessagesResultDTO::setMessages(std::list <ChatMessageDTO> messages)
{
	this->messages = messages;
}

ForwardScrollingPagerDTO
ChatMessagesResultDTO::getPaging()
{
	return paging;
}

void
ChatMessagesResultDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}


