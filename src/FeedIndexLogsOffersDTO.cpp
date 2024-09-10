#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedIndexLogsOffersDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedIndexLogsOffersDTO::FeedIndexLogsOffersDTO()
{
	//__init();
}

FeedIndexLogsOffersDTO::~FeedIndexLogsOffersDTO()
{
	//__cleanup();
}

void
FeedIndexLogsOffersDTO::__init()
{
	//rejectedCount = long(0);
	//totalCount = long(0);
}

void
FeedIndexLogsOffersDTO::__cleanup()
{
	//if(rejectedCount != NULL) {
	//
	//delete rejectedCount;
	//rejectedCount = NULL;
	//}
	//if(totalCount != NULL) {
	//
	//delete totalCount;
	//totalCount = NULL;
	//}
	//
}

void
FeedIndexLogsOffersDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rejectedCountKey = "rejectedCount";
	node = json_object_get_member(pJsonObject, rejectedCountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&rejectedCount, node, "long long", "");
		} else {
			
		}
	}
	const gchar *totalCountKey = "totalCount";
	node = json_object_get_member(pJsonObject, totalCountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&totalCount, node, "long long", "");
		} else {
			
		}
	}
}

FeedIndexLogsOffersDTO::FeedIndexLogsOffersDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedIndexLogsOffersDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getRejectedCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *rejectedCountKey = "rejectedCount";
	json_object_set_member(pJsonObject, rejectedCountKey, node);
	if (isprimitive("long long")) {
		long long obj = getTotalCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *totalCountKey = "totalCount";
	json_object_set_member(pJsonObject, totalCountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
FeedIndexLogsOffersDTO::getRejectedCount()
{
	return rejectedCount;
}

void
FeedIndexLogsOffersDTO::setRejectedCount(long long  rejectedCount)
{
	this->rejectedCount = rejectedCount;
}

long long
FeedIndexLogsOffersDTO::getTotalCount()
{
	return totalCount;
}

void
FeedIndexLogsOffersDTO::setTotalCount(long long  totalCount)
{
	this->totalCount = totalCount;
}


