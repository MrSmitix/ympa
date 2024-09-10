#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsFeedbackCommentListDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsFeedbackCommentListDTO::GoodsFeedbackCommentListDTO()
{
	//__init();
}

GoodsFeedbackCommentListDTO::~GoodsFeedbackCommentListDTO()
{
	//__cleanup();
}

void
GoodsFeedbackCommentListDTO::__init()
{
	//new std::list()std::list> comments;
	//paging = new ForwardScrollingPagerDTO();
}

void
GoodsFeedbackCommentListDTO::__cleanup()
{
	//if(comments != NULL) {
	//comments.RemoveAll(true);
	//delete comments;
	//comments = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//
}

void
GoodsFeedbackCommentListDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *commentsKey = "comments";
	node = json_object_get_member(pJsonObject, commentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GoodsFeedbackCommentDTO> new_list;
			GoodsFeedbackCommentDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GoodsFeedbackCommentDTO")) {
					jsonToValue(&inst, temp_json, "GoodsFeedbackCommentDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			comments = new_list;
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

GoodsFeedbackCommentListDTO::GoodsFeedbackCommentListDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsFeedbackCommentListDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("GoodsFeedbackCommentDTO")) {
		list<GoodsFeedbackCommentDTO> new_list = static_cast<list <GoodsFeedbackCommentDTO> > (getComments());
		node = converttoJson(&new_list, "GoodsFeedbackCommentDTO", "array");
	} else {
		node = json_node_alloc();
		list<GoodsFeedbackCommentDTO> new_list = static_cast<list <GoodsFeedbackCommentDTO> > (getComments());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GoodsFeedbackCommentDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GoodsFeedbackCommentDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *commentsKey = "comments";
	json_object_set_member(pJsonObject, commentsKey, node);
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

std::list<GoodsFeedbackCommentDTO>
GoodsFeedbackCommentListDTO::getComments()
{
	return comments;
}

void
GoodsFeedbackCommentListDTO::setComments(std::list <GoodsFeedbackCommentDTO> comments)
{
	this->comments = comments;
}

ForwardScrollingPagerDTO
GoodsFeedbackCommentListDTO::getPaging()
{
	return paging;
}

void
GoodsFeedbackCommentListDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}


