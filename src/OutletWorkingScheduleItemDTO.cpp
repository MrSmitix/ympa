#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OutletWorkingScheduleItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OutletWorkingScheduleItemDTO::OutletWorkingScheduleItemDTO()
{
	//__init();
}

OutletWorkingScheduleItemDTO::~OutletWorkingScheduleItemDTO()
{
	//__cleanup();
}

void
OutletWorkingScheduleItemDTO::__init()
{
	//startDay = new DayOfWeekType();
	//endDay = new DayOfWeekType();
	//startTime = std::string();
	//endTime = std::string();
}

void
OutletWorkingScheduleItemDTO::__cleanup()
{
	//if(startDay != NULL) {
	//
	//delete startDay;
	//startDay = NULL;
	//}
	//if(endDay != NULL) {
	//
	//delete endDay;
	//endDay = NULL;
	//}
	//if(startTime != NULL) {
	//
	//delete startTime;
	//startTime = NULL;
	//}
	//if(endTime != NULL) {
	//
	//delete endTime;
	//endTime = NULL;
	//}
	//
}

void
OutletWorkingScheduleItemDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *startDayKey = "startDay";
	node = json_object_get_member(pJsonObject, startDayKey);
	if (node !=NULL) {
	

		if (isprimitive("DayOfWeekType")) {
			jsonToValue(&startDay, node, "DayOfWeekType", "DayOfWeekType");
		} else {
			
			DayOfWeekType* obj = static_cast<DayOfWeekType*> (&startDay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *endDayKey = "endDay";
	node = json_object_get_member(pJsonObject, endDayKey);
	if (node !=NULL) {
	

		if (isprimitive("DayOfWeekType")) {
			jsonToValue(&endDay, node, "DayOfWeekType", "DayOfWeekType");
		} else {
			
			DayOfWeekType* obj = static_cast<DayOfWeekType*> (&endDay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *startTimeKey = "startTime";
	node = json_object_get_member(pJsonObject, startTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&startTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *endTimeKey = "endTime";
	node = json_object_get_member(pJsonObject, endTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&endTime, node, "std::string", "");
		} else {
			
		}
	}
}

OutletWorkingScheduleItemDTO::OutletWorkingScheduleItemDTO(char* json)
{
	this->fromJson(json);
}

char*
OutletWorkingScheduleItemDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DayOfWeekType")) {
		DayOfWeekType obj = getStartDay();
		node = converttoJson(&obj, "DayOfWeekType", "");
	}
	else {
		
		DayOfWeekType obj = static_cast<DayOfWeekType> (getStartDay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *startDayKey = "startDay";
	json_object_set_member(pJsonObject, startDayKey, node);
	if (isprimitive("DayOfWeekType")) {
		DayOfWeekType obj = getEndDay();
		node = converttoJson(&obj, "DayOfWeekType", "");
	}
	else {
		
		DayOfWeekType obj = static_cast<DayOfWeekType> (getEndDay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *endDayKey = "endDay";
	json_object_set_member(pJsonObject, endDayKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *startTimeKey = "startTime";
	json_object_set_member(pJsonObject, startTimeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *endTimeKey = "endTime";
	json_object_set_member(pJsonObject, endTimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

DayOfWeekType
OutletWorkingScheduleItemDTO::getStartDay()
{
	return startDay;
}

void
OutletWorkingScheduleItemDTO::setStartDay(DayOfWeekType  startDay)
{
	this->startDay = startDay;
}

DayOfWeekType
OutletWorkingScheduleItemDTO::getEndDay()
{
	return endDay;
}

void
OutletWorkingScheduleItemDTO::setEndDay(DayOfWeekType  endDay)
{
	this->endDay = endDay;
}

std::string
OutletWorkingScheduleItemDTO::getStartTime()
{
	return startTime;
}

void
OutletWorkingScheduleItemDTO::setStartTime(std::string  startTime)
{
	this->startTime = startTime;
}

std::string
OutletWorkingScheduleItemDTO::getEndTime()
{
	return endTime;
}

void
OutletWorkingScheduleItemDTO::setEndTime(std::string  endTime)
{
	this->endTime = endTime;
}


