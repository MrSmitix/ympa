#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOrderStorageLimitRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOrderStorageLimitRequest::UpdateOrderStorageLimitRequest()
{
	//__init();
}

UpdateOrderStorageLimitRequest::~UpdateOrderStorageLimitRequest()
{
	//__cleanup();
}

void
UpdateOrderStorageLimitRequest::__init()
{
	//newDate = null;
}

void
UpdateOrderStorageLimitRequest::__cleanup()
{
	//if(newDate != NULL) {
	//
	//delete newDate;
	//newDate = NULL;
	//}
	//
}

void
UpdateOrderStorageLimitRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *newDateKey = "newDate";
	node = json_object_get_member(pJsonObject, newDateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&newDate, node, "Date", "Date");
		} else {
			
		}
	}
}

UpdateOrderStorageLimitRequest::UpdateOrderStorageLimitRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateOrderStorageLimitRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Date")) {
		Date obj = getNewDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *newDateKey = "newDate";
	json_object_set_member(pJsonObject, newDateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Date
UpdateOrderStorageLimitRequest::getNewDate()
{
	return newDate;
}

void
UpdateOrderStorageLimitRequest::setNewDate(Date  newDate)
{
	this->newDate = newDate;
}


