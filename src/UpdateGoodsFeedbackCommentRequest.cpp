#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateGoodsFeedbackCommentRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateGoodsFeedbackCommentRequest::UpdateGoodsFeedbackCommentRequest()
{
	//__init();
}

UpdateGoodsFeedbackCommentRequest::~UpdateGoodsFeedbackCommentRequest()
{
	//__cleanup();
}

void
UpdateGoodsFeedbackCommentRequest::__init()
{
	//feedbackId = long(0);
	//comment = new UpdateGoodsFeedbackCommentDTO();
}

void
UpdateGoodsFeedbackCommentRequest::__cleanup()
{
	//if(feedbackId != NULL) {
	//
	//delete feedbackId;
	//feedbackId = NULL;
	//}
	//if(comment != NULL) {
	//
	//delete comment;
	//comment = NULL;
	//}
	//
}

void
UpdateGoodsFeedbackCommentRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *feedbackIdKey = "feedbackId";
	node = json_object_get_member(pJsonObject, feedbackIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&feedbackId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *commentKey = "comment";
	node = json_object_get_member(pJsonObject, commentKey);
	if (node !=NULL) {
	

		if (isprimitive("UpdateGoodsFeedbackCommentDTO")) {
			jsonToValue(&comment, node, "UpdateGoodsFeedbackCommentDTO", "UpdateGoodsFeedbackCommentDTO");
		} else {
			
			UpdateGoodsFeedbackCommentDTO* obj = static_cast<UpdateGoodsFeedbackCommentDTO*> (&comment);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdateGoodsFeedbackCommentRequest::UpdateGoodsFeedbackCommentRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateGoodsFeedbackCommentRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getFeedbackId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *feedbackIdKey = "feedbackId";
	json_object_set_member(pJsonObject, feedbackIdKey, node);
	if (isprimitive("UpdateGoodsFeedbackCommentDTO")) {
		UpdateGoodsFeedbackCommentDTO obj = getComment();
		node = converttoJson(&obj, "UpdateGoodsFeedbackCommentDTO", "");
	}
	else {
		
		UpdateGoodsFeedbackCommentDTO obj = static_cast<UpdateGoodsFeedbackCommentDTO> (getComment());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *commentKey = "comment";
	json_object_set_member(pJsonObject, commentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
UpdateGoodsFeedbackCommentRequest::getFeedbackId()
{
	return feedbackId;
}

void
UpdateGoodsFeedbackCommentRequest::setFeedbackId(long long  feedbackId)
{
	this->feedbackId = feedbackId;
}

UpdateGoodsFeedbackCommentDTO
UpdateGoodsFeedbackCommentRequest::getComment()
{
	return comment;
}

void
UpdateGoodsFeedbackCommentRequest::setComment(UpdateGoodsFeedbackCommentDTO  comment)
{
	this->comment = comment;
}


