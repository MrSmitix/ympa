#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetFeedResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetFeedResponse::GetFeedResponse()
{
	//__init();
}

GetFeedResponse::~GetFeedResponse()
{
	//__cleanup();
}

void
GetFeedResponse::__init()
{
	//feed = new FeedDTO();
}

void
GetFeedResponse::__cleanup()
{
	//if(feed != NULL) {
	//
	//delete feed;
	//feed = NULL;
	//}
	//
}

void
GetFeedResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *feedKey = "feed";
	node = json_object_get_member(pJsonObject, feedKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedDTO")) {
			jsonToValue(&feed, node, "FeedDTO", "FeedDTO");
		} else {
			
			FeedDTO* obj = static_cast<FeedDTO*> (&feed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetFeedResponse::GetFeedResponse(char* json)
{
	this->fromJson(json);
}

char*
GetFeedResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FeedDTO")) {
		FeedDTO obj = getFeed();
		node = converttoJson(&obj, "FeedDTO", "");
	}
	else {
		
		FeedDTO obj = static_cast<FeedDTO> (getFeed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *feedKey = "feed";
	json_object_set_member(pJsonObject, feedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FeedDTO
GetFeedResponse::getFeed()
{
	return feed;
}

void
GetFeedResponse::setFeed(FeedDTO  feed)
{
	this->feed = feed;
}


