#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetBusinessSettingsInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetBusinessSettingsInfoDTO::GetBusinessSettingsInfoDTO()
{
	//__init();
}

GetBusinessSettingsInfoDTO::~GetBusinessSettingsInfoDTO()
{
	//__cleanup();
}

void
GetBusinessSettingsInfoDTO::__init()
{
	//info = new BusinessDTO();
	//settings = new BusinessSettingsDTO();
}

void
GetBusinessSettingsInfoDTO::__cleanup()
{
	//if(info != NULL) {
	//
	//delete info;
	//info = NULL;
	//}
	//if(settings != NULL) {
	//
	//delete settings;
	//settings = NULL;
	//}
	//
}

void
GetBusinessSettingsInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *infoKey = "info";
	node = json_object_get_member(pJsonObject, infoKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessDTO")) {
			jsonToValue(&info, node, "BusinessDTO", "BusinessDTO");
		} else {
			
			BusinessDTO* obj = static_cast<BusinessDTO*> (&info);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *settingsKey = "settings";
	node = json_object_get_member(pJsonObject, settingsKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessSettingsDTO")) {
			jsonToValue(&settings, node, "BusinessSettingsDTO", "BusinessSettingsDTO");
		} else {
			
			BusinessSettingsDTO* obj = static_cast<BusinessSettingsDTO*> (&settings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetBusinessSettingsInfoDTO::GetBusinessSettingsInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
GetBusinessSettingsInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BusinessDTO")) {
		BusinessDTO obj = getInfo();
		node = converttoJson(&obj, "BusinessDTO", "");
	}
	else {
		
		BusinessDTO obj = static_cast<BusinessDTO> (getInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *infoKey = "info";
	json_object_set_member(pJsonObject, infoKey, node);
	if (isprimitive("BusinessSettingsDTO")) {
		BusinessSettingsDTO obj = getSettings();
		node = converttoJson(&obj, "BusinessSettingsDTO", "");
	}
	else {
		
		BusinessSettingsDTO obj = static_cast<BusinessSettingsDTO> (getSettings());
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

BusinessDTO
GetBusinessSettingsInfoDTO::getInfo()
{
	return info;
}

void
GetBusinessSettingsInfoDTO::setInfo(BusinessDTO  info)
{
	this->info = info;
}

BusinessSettingsDTO
GetBusinessSettingsInfoDTO::getSettings()
{
	return settings;
}

void
GetBusinessSettingsInfoDTO::setSettings(BusinessSettingsDTO  settings)
{
	this->settings = settings;
}


