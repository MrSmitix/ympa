#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignSettingsDeliveryDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignSettingsDeliveryDTO::CampaignSettingsDeliveryDTO()
{
	//__init();
}

CampaignSettingsDeliveryDTO::~CampaignSettingsDeliveryDTO()
{
	//__cleanup();
}

void
CampaignSettingsDeliveryDTO::__init()
{
	//schedule = new CampaignSettingsScheduleDTO();
}

void
CampaignSettingsDeliveryDTO::__cleanup()
{
	//if(schedule != NULL) {
	//
	//delete schedule;
	//schedule = NULL;
	//}
	//
}

void
CampaignSettingsDeliveryDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *scheduleKey = "schedule";
	node = json_object_get_member(pJsonObject, scheduleKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignSettingsScheduleDTO")) {
			jsonToValue(&schedule, node, "CampaignSettingsScheduleDTO", "CampaignSettingsScheduleDTO");
		} else {
			
			CampaignSettingsScheduleDTO* obj = static_cast<CampaignSettingsScheduleDTO*> (&schedule);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CampaignSettingsDeliveryDTO::CampaignSettingsDeliveryDTO(char* json)
{
	this->fromJson(json);
}

char*
CampaignSettingsDeliveryDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignSettingsScheduleDTO")) {
		CampaignSettingsScheduleDTO obj = getSchedule();
		node = converttoJson(&obj, "CampaignSettingsScheduleDTO", "");
	}
	else {
		
		CampaignSettingsScheduleDTO obj = static_cast<CampaignSettingsScheduleDTO> (getSchedule());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduleKey = "schedule";
	json_object_set_member(pJsonObject, scheduleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CampaignSettingsScheduleDTO
CampaignSettingsDeliveryDTO::getSchedule()
{
	return schedule;
}

void
CampaignSettingsDeliveryDTO::setSchedule(CampaignSettingsScheduleDTO  schedule)
{
	this->schedule = schedule;
}


