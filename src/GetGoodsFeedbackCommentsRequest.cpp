#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetGoodsFeedbackCommentsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetGoodsFeedbackCommentsRequest::GetGoodsFeedbackCommentsRequest()
{
	//__init();
}

GetGoodsFeedbackCommentsRequest::~GetGoodsFeedbackCommentsRequest()
{
	//__cleanup();
}

void
GetGoodsFeedbackCommentsRequest::__init()
{
	//feedbackId = long(0);
}

void
GetGoodsFeedbackCommentsRequest::__cleanup()
{
	//if(feedbackId != NULL) {
	//
	//delete feedbackId;
	//feedbackId = NULL;
	//}
	//
}

void
GetGoodsFeedbackCommentsRequest::fromJson(char* jsonStr)
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
}

GetGoodsFeedbackCommentsRequest::GetGoodsFeedbackCommentsRequest(char* json)
{
	this->fromJson(json);
}

char*
GetGoodsFeedbackCommentsRequest::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GetGoodsFeedbackCommentsRequest::getFeedbackId()
{
	return feedbackId;
}

void
GetGoodsFeedbackCommentsRequest::setFeedbackId(long long  feedbackId)
{
	this->feedbackId = feedbackId;
}


