#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetChatsInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetChatsInfoDTO::GetChatsInfoDTO()
{
	//__init();
}

GetChatsInfoDTO::~GetChatsInfoDTO()
{
	//__cleanup();
}

void
GetChatsInfoDTO::__init()
{
	//new std::list()std::list> chats;
	//paging = new ForwardScrollingPagerDTO();
}

void
GetChatsInfoDTO::__cleanup()
{
	//if(chats != NULL) {
	//chats.RemoveAll(true);
	//delete chats;
	//chats = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//
}

void
GetChatsInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *chatsKey = "chats";
	node = json_object_get_member(pJsonObject, chatsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GetChatInfoDTO> new_list;
			GetChatInfoDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GetChatInfoDTO")) {
					jsonToValue(&inst, temp_json, "GetChatInfoDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			chats = new_list;
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

GetChatsInfoDTO::GetChatsInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
GetChatsInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("GetChatInfoDTO")) {
		list<GetChatInfoDTO> new_list = static_cast<list <GetChatInfoDTO> > (getChats());
		node = converttoJson(&new_list, "GetChatInfoDTO", "array");
	} else {
		node = json_node_alloc();
		list<GetChatInfoDTO> new_list = static_cast<list <GetChatInfoDTO> > (getChats());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GetChatInfoDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GetChatInfoDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *chatsKey = "chats";
	json_object_set_member(pJsonObject, chatsKey, node);
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

std::list<GetChatInfoDTO>
GetChatsInfoDTO::getChats()
{
	return chats;
}

void
GetChatsInfoDTO::setChats(std::list <GetChatInfoDTO> chats)
{
	this->chats = chats;
}

ForwardScrollingPagerDTO
GetChatsInfoDTO::getPaging()
{
	return paging;
}

void
GetChatsInfoDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}


