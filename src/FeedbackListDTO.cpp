#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedbackListDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedbackListDTO::FeedbackListDTO()
{
	//__init();
}

FeedbackListDTO::~FeedbackListDTO()
{
	//__cleanup();
}

void
FeedbackListDTO::__init()
{
	//paging = new ScrollingPagerDTO();
	//new std::list()std::list> feedbackList;
}

void
FeedbackListDTO::__cleanup()
{
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//if(feedbackList != NULL) {
	//feedbackList.RemoveAll(true);
	//delete feedbackList;
	//feedbackList = NULL;
	//}
	//
}

void
FeedbackListDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pagingKey = "paging";
	node = json_object_get_member(pJsonObject, pagingKey);
	if (node !=NULL) {
	

		if (isprimitive("ScrollingPagerDTO")) {
			jsonToValue(&paging, node, "ScrollingPagerDTO", "ScrollingPagerDTO");
		} else {
			
			ScrollingPagerDTO* obj = static_cast<ScrollingPagerDTO*> (&paging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *feedbackListKey = "feedbackList";
	node = json_object_get_member(pJsonObject, feedbackListKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FeedbackDTO> new_list;
			FeedbackDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FeedbackDTO")) {
					jsonToValue(&inst, temp_json, "FeedbackDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			feedbackList = new_list;
		}
		
	}
}

FeedbackListDTO::FeedbackListDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedbackListDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ScrollingPagerDTO")) {
		ScrollingPagerDTO obj = getPaging();
		node = converttoJson(&obj, "ScrollingPagerDTO", "");
	}
	else {
		
		ScrollingPagerDTO obj = static_cast<ScrollingPagerDTO> (getPaging());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagingKey = "paging";
	json_object_set_member(pJsonObject, pagingKey, node);
	if (isprimitive("FeedbackDTO")) {
		list<FeedbackDTO> new_list = static_cast<list <FeedbackDTO> > (getFeedbackList());
		node = converttoJson(&new_list, "FeedbackDTO", "array");
	} else {
		node = json_node_alloc();
		list<FeedbackDTO> new_list = static_cast<list <FeedbackDTO> > (getFeedbackList());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FeedbackDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FeedbackDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *feedbackListKey = "feedbackList";
	json_object_set_member(pJsonObject, feedbackListKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ScrollingPagerDTO
FeedbackListDTO::getPaging()
{
	return paging;
}

void
FeedbackListDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<FeedbackDTO>
FeedbackListDTO::getFeedbackList()
{
	return feedbackList;
}

void
FeedbackListDTO::setFeedbackList(std::list <FeedbackDTO> feedbackList)
{
	this->feedbackList = feedbackList;
}


