#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCampaignSettingsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCampaignSettingsResponse::GetCampaignSettingsResponse()
{
	//__init();
}

GetCampaignSettingsResponse::~GetCampaignSettingsResponse()
{
	//__cleanup();
}

void
GetCampaignSettingsResponse::__init()
{
	//settings = new CampaignSettingsDTO();
}

void
GetCampaignSettingsResponse::__cleanup()
{
	//if(settings != NULL) {
	//
	//delete settings;
	//settings = NULL;
	//}
	//
}

void
GetCampaignSettingsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *settingsKey = "settings";
	node = json_object_get_member(pJsonObject, settingsKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignSettingsDTO")) {
			jsonToValue(&settings, node, "CampaignSettingsDTO", "CampaignSettingsDTO");
		} else {
			
			CampaignSettingsDTO* obj = static_cast<CampaignSettingsDTO*> (&settings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetCampaignSettingsResponse::GetCampaignSettingsResponse(char* json)
{
	this->fromJson(json);
}

char*
GetCampaignSettingsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignSettingsDTO")) {
		CampaignSettingsDTO obj = getSettings();
		node = converttoJson(&obj, "CampaignSettingsDTO", "");
	}
	else {
		
		CampaignSettingsDTO obj = static_cast<CampaignSettingsDTO> (getSettings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *settingsKey = "settings";
	json_object_set_member(pJsonObject, settingsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CampaignSettingsDTO
GetCampaignSettingsResponse::getSettings()
{
	return settings;
}

void
GetCampaignSettingsResponse::setSettings(CampaignSettingsDTO  settings)
{
	this->settings = settings;
}


