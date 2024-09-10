#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OutletWorkingScheduleDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OutletWorkingScheduleDTO::OutletWorkingScheduleDTO()
{
	//__init();
}

OutletWorkingScheduleDTO::~OutletWorkingScheduleDTO()
{
	//__cleanup();
}

void
OutletWorkingScheduleDTO::__init()
{
	//workInHoliday = bool(false);
	//new std::list()std::list> scheduleItems;
}

void
OutletWorkingScheduleDTO::__cleanup()
{
	//if(workInHoliday != NULL) {
	//
	//delete workInHoliday;
	//workInHoliday = NULL;
	//}
	//if(scheduleItems != NULL) {
	//scheduleItems.RemoveAll(true);
	//delete scheduleItems;
	//scheduleItems = NULL;
	//}
	//
}

void
OutletWorkingScheduleDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *workInHolidayKey = "workInHoliday";
	node = json_object_get_member(pJsonObject, workInHolidayKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&workInHoliday, node, "bool", "");
		} else {
			
		}
	}
	const gchar *scheduleItemsKey = "scheduleItems";
	node = json_object_get_member(pJsonObject, scheduleItemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OutletWorkingScheduleItemDTO> new_list;
			OutletWorkingScheduleItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OutletWorkingScheduleItemDTO")) {
					jsonToValue(&inst, temp_json, "OutletWorkingScheduleItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			scheduleItems = new_list;
		}
		
	}
}

OutletWorkingScheduleDTO::OutletWorkingScheduleDTO(char* json)
{
	this->fromJson(json);
}

char*
OutletWorkingScheduleDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getWorkInHoliday();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *workInHolidayKey = "workInHoliday";
	json_object_set_member(pJsonObject, workInHolidayKey, node);
	if (isprimitive("OutletWorkingScheduleItemDTO")) {
		list<OutletWorkingScheduleItemDTO> new_list = static_cast<list <OutletWorkingScheduleItemDTO> > (getScheduleItems());
		node = converttoJson(&new_list, "OutletWorkingScheduleItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<OutletWorkingScheduleItemDTO> new_list = static_cast<list <OutletWorkingScheduleItemDTO> > (getScheduleItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OutletWorkingScheduleItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OutletWorkingScheduleItemDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *scheduleItemsKey = "scheduleItems";
	json_object_set_member(pJsonObject, scheduleItemsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
OutletWorkingScheduleDTO::getWorkInHoliday()
{
	return workInHoliday;
}

void
OutletWorkingScheduleDTO::setWorkInHoliday(bool  workInHoliday)
{
	this->workInHoliday = workInHoliday;
}

std::list<OutletWorkingScheduleItemDTO>
OutletWorkingScheduleDTO::getScheduleItems()
{
	return scheduleItems;
}

void
OutletWorkingScheduleDTO::setScheduleItems(std::list <OutletWorkingScheduleItemDTO> scheduleItems)
{
	this->scheduleItems = scheduleItems;
}


