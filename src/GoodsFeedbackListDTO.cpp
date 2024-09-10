#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsFeedbackListDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsFeedbackListDTO::GoodsFeedbackListDTO()
{
	//__init();
}

GoodsFeedbackListDTO::~GoodsFeedbackListDTO()
{
	//__cleanup();
}

void
GoodsFeedbackListDTO::__init()
{
	//new std::list()std::list> feedbacks;
	//paging = new ForwardScrollingPagerDTO();
}

void
GoodsFeedbackListDTO::__cleanup()
{
	//if(feedbacks != NULL) {
	//feedbacks.RemoveAll(true);
	//delete feedbacks;
	//feedbacks = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//
}

void
GoodsFeedbackListDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *feedbacksKey = "feedbacks";
	node = json_object_get_member(pJsonObject, feedbacksKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GoodsFeedbackDTO> new_list;
			GoodsFeedbackDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GoodsFeedbackDTO")) {
					jsonToValue(&inst, temp_json, "GoodsFeedbackDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			feedbacks = new_list;
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

GoodsFeedbackListDTO::GoodsFeedbackListDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsFeedbackListDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("GoodsFeedbackDTO")) {
		list<GoodsFeedbackDTO> new_list = static_cast<list <GoodsFeedbackDTO> > (getFeedbacks());
		node = converttoJson(&new_list, "GoodsFeedbackDTO", "array");
	} else {
		node = json_node_alloc();
		list<GoodsFeedbackDTO> new_list = static_cast<list <GoodsFeedbackDTO> > (getFeedbacks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GoodsFeedbackDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GoodsFeedbackDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *feedbacksKey = "feedbacks";
	json_object_set_member(pJsonObject, feedbacksKey, node);
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

std::list<GoodsFeedbackDTO>
GoodsFeedbackListDTO::getFeedbacks()
{
	return feedbacks;
}

void
GoodsFeedbackListDTO::setFeedbacks(std::list <GoodsFeedbackDTO> feedbacks)
{
	this->feedbacks = feedbacks;
}

ForwardScrollingPagerDTO
GoodsFeedbackListDTO::getPaging()
{
	return paging;
}

void
GoodsFeedbackListDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}


