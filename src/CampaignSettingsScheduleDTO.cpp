#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignSettingsScheduleDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignSettingsScheduleDTO::CampaignSettingsScheduleDTO()
{
	//__init();
}

CampaignSettingsScheduleDTO::~CampaignSettingsScheduleDTO()
{
	//__cleanup();
}

void
CampaignSettingsScheduleDTO::__init()
{
	//availableOnHolidays = bool(false);
	//new std::list()std::list> customHolidays;
	//new std::list()std::list> customWorkingDays;
	//period = new CampaignSettingsTimePeriodDTO();
	//new std::list()std::list> totalHolidays;
	//new std::list()std::list> weeklyHolidays;
}

void
CampaignSettingsScheduleDTO::__cleanup()
{
	//if(availableOnHolidays != NULL) {
	//
	//delete availableOnHolidays;
	//availableOnHolidays = NULL;
	//}
	//if(customHolidays != NULL) {
	//customHolidays.RemoveAll(true);
	//delete customHolidays;
	//customHolidays = NULL;
	//}
	//if(customWorkingDays != NULL) {
	//customWorkingDays.RemoveAll(true);
	//delete customWorkingDays;
	//customWorkingDays = NULL;
	//}
	//if(period != NULL) {
	//
	//delete period;
	//period = NULL;
	//}
	//if(totalHolidays != NULL) {
	//totalHolidays.RemoveAll(true);
	//delete totalHolidays;
	//totalHolidays = NULL;
	//}
	//if(weeklyHolidays != NULL) {
	//weeklyHolidays.RemoveAll(true);
	//delete weeklyHolidays;
	//weeklyHolidays = NULL;
	//}
	//
}

void
CampaignSettingsScheduleDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *availableOnHolidaysKey = "availableOnHolidays";
	node = json_object_get_member(pJsonObject, availableOnHolidaysKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&availableOnHolidays, node, "bool", "");
		} else {
			
		}
	}
	const gchar *customHolidaysKey = "customHolidays";
	node = json_object_get_member(pJsonObject, customHolidaysKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			customHolidays = new_list;
		}
		
	}
	const gchar *customWorkingDaysKey = "customWorkingDays";
	node = json_object_get_member(pJsonObject, customWorkingDaysKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			customWorkingDays = new_list;
		}
		
	}
	const gchar *periodKey = "period";
	node = json_object_get_member(pJsonObject, periodKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignSettingsTimePeriodDTO")) {
			jsonToValue(&period, node, "CampaignSettingsTimePeriodDTO", "CampaignSettingsTimePeriodDTO");
		} else {
			
			CampaignSettingsTimePeriodDTO* obj = static_cast<CampaignSettingsTimePeriodDTO*> (&period);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *totalHolidaysKey = "totalHolidays";
	node = json_object_get_member(pJsonObject, totalHolidaysKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			totalHolidays = new_list;
		}
		
	}
	const gchar *weeklyHolidaysKey = "weeklyHolidays";
	node = json_object_get_member(pJsonObject, weeklyHolidaysKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			weeklyHolidays = new_list;
		}
		
	}
}

CampaignSettingsScheduleDTO::CampaignSettingsScheduleDTO(char* json)
{
	this->fromJson(json);
}

char*
CampaignSettingsScheduleDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getAvailableOnHolidays();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *availableOnHolidaysKey = "availableOnHolidays";
	json_object_set_member(pJsonObject, availableOnHolidaysKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomHolidays());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomHolidays());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *customHolidaysKey = "customHolidays";
	json_object_set_member(pJsonObject, customHolidaysKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomWorkingDays());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomWorkingDays());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *customWorkingDaysKey = "customWorkingDays";
	json_object_set_member(pJsonObject, customWorkingDaysKey, node);
	if (isprimitive("CampaignSettingsTimePeriodDTO")) {
		CampaignSettingsTimePeriodDTO obj = getPeriod();
		node = converttoJson(&obj, "CampaignSettingsTimePeriodDTO", "");
	}
	else {
		
		CampaignSettingsTimePeriodDTO obj = static_cast<CampaignSettingsTimePeriodDTO> (getPeriod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *periodKey = "period";
	json_object_set_member(pJsonObject, periodKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getTotalHolidays());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getTotalHolidays());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *totalHolidaysKey = "totalHolidays";
	json_object_set_member(pJsonObject, totalHolidaysKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getWeeklyHolidays());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getWeeklyHolidays());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *weeklyHolidaysKey = "weeklyHolidays";
	json_object_set_member(pJsonObject, weeklyHolidaysKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
CampaignSettingsScheduleDTO::getAvailableOnHolidays()
{
	return availableOnHolidays;
}

void
CampaignSettingsScheduleDTO::setAvailableOnHolidays(bool  availableOnHolidays)
{
	this->availableOnHolidays = availableOnHolidays;
}

std::list<std::string>
CampaignSettingsScheduleDTO::getCustomHolidays()
{
	return customHolidays;
}

void
CampaignSettingsScheduleDTO::setCustomHolidays(std::list <std::string> customHolidays)
{
	this->customHolidays = customHolidays;
}

std::list<std::string>
CampaignSettingsScheduleDTO::getCustomWorkingDays()
{
	return customWorkingDays;
}

void
CampaignSettingsScheduleDTO::setCustomWorkingDays(std::list <std::string> customWorkingDays)
{
	this->customWorkingDays = customWorkingDays;
}

CampaignSettingsTimePeriodDTO
CampaignSettingsScheduleDTO::getPeriod()
{
	return period;
}

void
CampaignSettingsScheduleDTO::setPeriod(CampaignSettingsTimePeriodDTO  period)
{
	this->period = period;
}

std::list<std::string>
CampaignSettingsScheduleDTO::getTotalHolidays()
{
	return totalHolidays;
}

void
CampaignSettingsScheduleDTO::setTotalHolidays(std::list <std::string> totalHolidays)
{
	this->totalHolidays = totalHolidays;
}

std::list<int>
CampaignSettingsScheduleDTO::getWeeklyHolidays()
{
	return weeklyHolidays;
}

void
CampaignSettingsScheduleDTO::setWeeklyHolidays(std::list <int> weeklyHolidays)
{
	this->weeklyHolidays = weeklyHolidays;
}


