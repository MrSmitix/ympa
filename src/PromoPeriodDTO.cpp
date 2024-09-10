#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PromoPeriodDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PromoPeriodDTO::PromoPeriodDTO()
{
	//__init();
}

PromoPeriodDTO::~PromoPeriodDTO()
{
	//__cleanup();
}

void
PromoPeriodDTO::__init()
{
	//dateTimeFrom = null;
	//dateTimeTo = null;
}

void
PromoPeriodDTO::__cleanup()
{
	//if(dateTimeFrom != NULL) {
	//
	//delete dateTimeFrom;
	//dateTimeFrom = NULL;
	//}
	//if(dateTimeTo != NULL) {
	//
	//delete dateTimeTo;
	//dateTimeTo = NULL;
	//}
	//
}

void
PromoPeriodDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dateTimeFromKey = "dateTimeFrom";
	node = json_object_get_member(pJsonObject, dateTimeFromKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dateTimeFrom, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dateTimeToKey = "dateTimeTo";
	node = json_object_get_member(pJsonObject, dateTimeToKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dateTimeTo, node, "std::string", "");
		} else {
			
		}
	}
}

PromoPeriodDTO::PromoPeriodDTO(char* json)
{
	this->fromJson(json);
}

char*
PromoPeriodDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDateTimeFrom();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dateTimeFromKey = "dateTimeFrom";
	json_object_set_member(pJsonObject, dateTimeFromKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDateTimeTo();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dateTimeToKey = "dateTimeTo";
	json_object_set_member(pJsonObject, dateTimeToKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PromoPeriodDTO::getDateTimeFrom()
{
	return dateTimeFrom;
}

void
PromoPeriodDTO::setDateTimeFrom(std::string  dateTimeFrom)
{
	this->dateTimeFrom = dateTimeFrom;
}

std::string
PromoPeriodDTO::getDateTimeTo()
{
	return dateTimeTo;
}

void
PromoPeriodDTO::setDateTimeTo(std::string  dateTimeTo)
{
	this->dateTimeTo = dateTimeTo;
}


