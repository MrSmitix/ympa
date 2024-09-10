#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetChatsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetChatsRequest::GetChatsRequest()
{
	//__init();
}

GetChatsRequest::~GetChatsRequest()
{
	//__cleanup();
}

void
GetChatsRequest::__init()
{
	//new std::list()std::list> orderIds;
	//new std::list()std::list> types;
	//new std::list()std::list> statuses;
}

void
GetChatsRequest::__cleanup()
{
	//if(orderIds != NULL) {
	//orderIds.RemoveAll(true);
	//delete orderIds;
	//orderIds = NULL;
	//}
	//if(types != NULL) {
	//types.RemoveAll(true);
	//delete types;
	//types = NULL;
	//}
	//if(statuses != NULL) {
	//statuses.RemoveAll(true);
	//delete statuses;
	//statuses = NULL;
	//}
	//
}

void
GetChatsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orderIdsKey = "orderIds";
	node = json_object_get_member(pJsonObject, orderIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			orderIds = new_list;
		}
		
	}
	const gchar *typesKey = "types";
	node = json_object_get_member(pJsonObject, typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatType> new_list;
			ChatType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatType")) {
					jsonToValue(&inst, temp_json, "ChatType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			types = new_list;
		}
		
	}
	const gchar *statusesKey = "statuses";
	node = json_object_get_member(pJsonObject, statusesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatStatusType> new_list;
			ChatStatusType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatStatusType")) {
					jsonToValue(&inst, temp_json, "ChatStatusType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			statuses = new_list;
		}
		
	}
}

GetChatsRequest::GetChatsRequest(char* json)
{
	this->fromJson(json);
}

char*
GetChatsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getOrderIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getOrderIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *orderIdsKey = "orderIds";
	json_object_set_member(pJsonObject, orderIdsKey, node);
	if (isprimitive("ChatType")) {
		list<ChatType> new_list = static_cast<list <ChatType> > (getTypes());
		node = converttoJson(&new_list, "ChatType", "array");
	} else {
		node = json_node_alloc();
		list<ChatType> new_list = static_cast<list <ChatType> > (getTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *typesKey = "types";
	json_object_set_member(pJsonObject, typesKey, node);
	if (isprimitive("ChatStatusType")) {
		list<ChatStatusType> new_list = static_cast<list <ChatStatusType> > (getStatuses());
		node = converttoJson(&new_list, "ChatStatusType", "array");
	} else {
		node = json_node_alloc();
		list<ChatStatusType> new_list = static_cast<list <ChatStatusType> > (getStatuses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatStatusType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatStatusType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *statusesKey = "statuses";
	json_object_set_member(pJsonObject, statusesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<long long>
GetChatsRequest::getOrderIds()
{
	return orderIds;
}

void
GetChatsRequest::setOrderIds(std::list <long long> orderIds)
{
	this->orderIds = orderIds;
}

std::list<ChatType>
GetChatsRequest::getTypes()
{
	return types;
}

void
GetChatsRequest::setTypes(std::list <ChatType> types)
{
	this->types = types;
}

std::list<ChatStatusType>
GetChatsRequest::getStatuses()
{
	return statuses;
}

void
GetChatsRequest::setStatuses(std::list <ChatStatusType> statuses)
{
	this->statuses = statuses;
}


