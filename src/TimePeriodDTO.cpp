#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TimePeriodDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TimePeriodDTO::TimePeriodDTO()
{
	//__init();
}

TimePeriodDTO::~TimePeriodDTO()
{
	//__cleanup();
}

void
TimePeriodDTO::__init()
{
	//timePeriod = int(0);
	//timeUnit = new TimeUnitType();
	//comment = std::string();
}

void
TimePeriodDTO::__cleanup()
{
	//if(timePeriod != NULL) {
	//
	//delete timePeriod;
	//timePeriod = NULL;
	//}
	//if(timeUnit != NULL) {
	//
	//delete timeUnit;
	//timeUnit = NULL;
	//}
	//if(comment != NULL) {
	//
	//delete comment;
	//comment = NULL;
	//}
	//
}

void
TimePeriodDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *timePeriodKey = "timePeriod";
	node = json_object_get_member(pJsonObject, timePeriodKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&timePeriod, node, "int", "");
		} else {
			
		}
	}
	const gchar *timeUnitKey = "timeUnit";
	node = json_object_get_member(pJsonObject, timeUnitKey);
	if (node !=NULL) {
	

		if (isprimitive("TimeUnitType")) {
			jsonToValue(&timeUnit, node, "TimeUnitType", "TimeUnitType");
		} else {
			
			TimeUnitType* obj = static_cast<TimeUnitType*> (&timeUnit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *commentKey = "comment";
	node = json_object_get_member(pJsonObject, commentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&comment, node, "std::string", "");
		} else {
			
		}
	}
}

TimePeriodDTO::TimePeriodDTO(char* json)
{
	this->fromJson(json);
}

char*
TimePeriodDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getTimePeriod();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *timePeriodKey = "timePeriod";
	json_object_set_member(pJsonObject, timePeriodKey, node);
	if (isprimitive("TimeUnitType")) {
		TimeUnitType obj = getTimeUnit();
		node = converttoJson(&obj, "TimeUnitType", "");
	}
	else {
		
		TimeUnitType obj = static_cast<TimeUnitType> (getTimeUnit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timeUnitKey = "timeUnit";
	json_object_set_member(pJsonObject, timeUnitKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getComment();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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

int
TimePeriodDTO::getTimePeriod()
{
	return timePeriod;
}

void
TimePeriodDTO::setTimePeriod(int  timePeriod)
{
	this->timePeriod = timePeriod;
}

TimeUnitType
TimePeriodDTO::getTimeUnit()
{
	return timeUnit;
}

void
TimePeriodDTO::setTimeUnit(TimeUnitType  timeUnit)
{
	this->timeUnit = timeUnit;
}

std::string
TimePeriodDTO::getComment()
{
	return comment;
}

void
TimePeriodDTO::setComment(std::string  comment)
{
	this->comment = comment;
}


