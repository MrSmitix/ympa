#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedPublicationFullDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedPublicationFullDTO::FeedPublicationFullDTO()
{
	//__init();
}

FeedPublicationFullDTO::~FeedPublicationFullDTO()
{
	//__cleanup();
}

void
FeedPublicationFullDTO::__init()
{
	//fileTime = null;
	//publishedTime = null;
}

void
FeedPublicationFullDTO::__cleanup()
{
	//if(fileTime != NULL) {
	//
	//delete fileTime;
	//fileTime = NULL;
	//}
	//if(publishedTime != NULL) {
	//
	//delete publishedTime;
	//publishedTime = NULL;
	//}
	//
}

void
FeedPublicationFullDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fileTimeKey = "fileTime";
	node = json_object_get_member(pJsonObject, fileTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fileTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *publishedTimeKey = "publishedTime";
	node = json_object_get_member(pJsonObject, publishedTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&publishedTime, node, "std::string", "");
		} else {
			
		}
	}
}

FeedPublicationFullDTO::FeedPublicationFullDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedPublicationFullDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFileTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fileTimeKey = "fileTime";
	json_object_set_member(pJsonObject, fileTimeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPublishedTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *publishedTimeKey = "publishedTime";
	json_object_set_member(pJsonObject, publishedTimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FeedPublicationFullDTO::getFileTime()
{
	return fileTime;
}

void
FeedPublicationFullDTO::setFileTime(std::string  fileTime)
{
	this->fileTime = fileTime;
}

std::string
FeedPublicationFullDTO::getPublishedTime()
{
	return publishedTime;
}

void
FeedPublicationFullDTO::setPublishedTime(std::string  publishedTime)
{
	this->publishedTime = publishedTime;
}


