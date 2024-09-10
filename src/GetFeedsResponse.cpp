#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetFeedsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetFeedsResponse::GetFeedsResponse()
{
	//__init();
}

GetFeedsResponse::~GetFeedsResponse()
{
	//__cleanup();
}

void
GetFeedsResponse::__init()
{
	//new std::list()std::list> feeds;
}

void
GetFeedsResponse::__cleanup()
{
	//if(feeds != NULL) {
	//feeds.RemoveAll(true);
	//delete feeds;
	//feeds = NULL;
	//}
	//
}

void
GetFeedsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *feedsKey = "feeds";
	node = json_object_get_member(pJsonObject, feedsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FeedDTO> new_list;
			FeedDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FeedDTO")) {
					jsonToValue(&inst, temp_json, "FeedDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			feeds = new_list;
		}
		
	}
}

GetFeedsResponse::GetFeedsResponse(char* json)
{
	this->fromJson(json);
}

char*
GetFeedsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FeedDTO")) {
		list<FeedDTO> new_list = static_cast<list <FeedDTO> > (getFeeds());
		node = converttoJson(&new_list, "FeedDTO", "array");
	} else {
		node = json_node_alloc();
		list<FeedDTO> new_list = static_cast<list <FeedDTO> > (getFeeds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FeedDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FeedDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *feedsKey = "feeds";
	json_object_set_member(pJsonObject, feedsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<FeedDTO>
GetFeedsResponse::getFeeds()
{
	return feeds;
}

void
GetFeedsResponse::setFeeds(std::list <FeedDTO> feeds)
{
	this->feeds = feeds;
}


