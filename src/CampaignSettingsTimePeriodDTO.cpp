#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignSettingsTimePeriodDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignSettingsTimePeriodDTO::CampaignSettingsTimePeriodDTO()
{
	//__init();
}

CampaignSettingsTimePeriodDTO::~CampaignSettingsTimePeriodDTO()
{
	//__cleanup();
}

void
CampaignSettingsTimePeriodDTO::__init()
{
	//fromDate = std::string();
	//toDate = std::string();
}

void
CampaignSettingsTimePeriodDTO::__cleanup()
{
	//if(fromDate != NULL) {
	//
	//delete fromDate;
	//fromDate = NULL;
	//}
	//if(toDate != NULL) {
	//
	//delete toDate;
	//toDate = NULL;
	//}
	//
}

void
CampaignSettingsTimePeriodDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fromDateKey = "fromDate";
	node = json_object_get_member(pJsonObject, fromDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fromDate, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *toDateKey = "toDate";
	node = json_object_get_member(pJsonObject, toDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&toDate, node, "std::string", "");
		} else {
			
		}
	}
}

CampaignSettingsTimePeriodDTO::CampaignSettingsTimePeriodDTO(char* json)
{
	this->fromJson(json);
}

char*
CampaignSettingsTimePeriodDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFromDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fromDateKey = "fromDate";
	json_object_set_member(pJsonObject, fromDateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getToDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *toDateKey = "toDate";
	json_object_set_member(pJsonObject, toDateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CampaignSettingsTimePeriodDTO::getFromDate()
{
	return fromDate;
}

void
CampaignSettingsTimePeriodDTO::setFromDate(std::string  fromDate)
{
	this->fromDate = fromDate;
}

std::string
CampaignSettingsTimePeriodDTO::getToDate()
{
	return toDate;
}

void
CampaignSettingsTimePeriodDTO::setToDate(std::string  toDate)
{
	this->toDate = toDate;
}


