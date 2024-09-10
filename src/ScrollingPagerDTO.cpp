#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ScrollingPagerDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ScrollingPagerDTO::ScrollingPagerDTO()
{
	//__init();
}

ScrollingPagerDTO::~ScrollingPagerDTO()
{
	//__cleanup();
}

void
ScrollingPagerDTO::__init()
{
	//nextPageToken = std::string();
	//prevPageToken = std::string();
}

void
ScrollingPagerDTO::__cleanup()
{
	//if(nextPageToken != NULL) {
	//
	//delete nextPageToken;
	//nextPageToken = NULL;
	//}
	//if(prevPageToken != NULL) {
	//
	//delete prevPageToken;
	//prevPageToken = NULL;
	//}
	//
}

void
ScrollingPagerDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nextPageTokenKey = "nextPageToken";
	node = json_object_get_member(pJsonObject, nextPageTokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&nextPageToken, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *prevPageTokenKey = "prevPageToken";
	node = json_object_get_member(pJsonObject, prevPageTokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&prevPageToken, node, "std::string", "");
		} else {
			
		}
	}
}

ScrollingPagerDTO::ScrollingPagerDTO(char* json)
{
	this->fromJson(json);
}

char*
ScrollingPagerDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getNextPageToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nextPageTokenKey = "nextPageToken";
	json_object_set_member(pJsonObject, nextPageTokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPrevPageToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *prevPageTokenKey = "prevPageToken";
	json_object_set_member(pJsonObject, prevPageTokenKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ScrollingPagerDTO::getNextPageToken()
{
	return nextPageToken;
}

void
ScrollingPagerDTO::setNextPageToken(std::string  nextPageToken)
{
	this->nextPageToken = nextPageToken;
}

std::string
ScrollingPagerDTO::getPrevPageToken()
{
	return prevPageToken;
}

void
ScrollingPagerDTO::setPrevPageToken(std::string  prevPageToken)
{
	this->prevPageToken = prevPageToken;
}


