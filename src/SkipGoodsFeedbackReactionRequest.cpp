#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SkipGoodsFeedbackReactionRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SkipGoodsFeedbackReactionRequest::SkipGoodsFeedbackReactionRequest()
{
	//__init();
}

SkipGoodsFeedbackReactionRequest::~SkipGoodsFeedbackReactionRequest()
{
	//__cleanup();
}

void
SkipGoodsFeedbackReactionRequest::__init()
{
	//new std::list()Set> feedbackIds;
}

void
SkipGoodsFeedbackReactionRequest::__cleanup()
{
	//if(feedbackIds != NULL) {
	//feedbackIds.RemoveAll(true);
	//delete feedbackIds;
	//feedbackIds = NULL;
	//}
	//
}

void
SkipGoodsFeedbackReactionRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *feedbackIdsKey = "feedbackIds";
	node = json_object_get_member(pJsonObject, feedbackIdsKey);
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
			feedbackIds = new_list;
		}
		
	}
}

SkipGoodsFeedbackReactionRequest::SkipGoodsFeedbackReactionRequest(char* json)
{
	this->fromJson(json);
}

char*
SkipGoodsFeedbackReactionRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getFeedbackIds());
		node = converttoJson(&new_list, "long long", "set");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getFeedbackIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *feedbackIdsKey = "feedbackIds";
	json_object_set_member(pJsonObject, feedbackIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Set<long long>
SkipGoodsFeedbackReactionRequest::getFeedbackIds()
{
	return feedbackIds;
}

void
SkipGoodsFeedbackReactionRequest::setFeedbackIds(Set <long long> feedbackIds)
{
	this->feedbackIds = feedbackIds;
}


