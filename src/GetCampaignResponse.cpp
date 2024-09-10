#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCampaignResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCampaignResponse::GetCampaignResponse()
{
	//__init();
}

GetCampaignResponse::~GetCampaignResponse()
{
	//__cleanup();
}

void
GetCampaignResponse::__init()
{
	//campaign = new CampaignDTO();
}

void
GetCampaignResponse::__cleanup()
{
	//if(campaign != NULL) {
	//
	//delete campaign;
	//campaign = NULL;
	//}
	//
}

void
GetCampaignResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaignKey = "campaign";
	node = json_object_get_member(pJsonObject, campaignKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignDTO")) {
			jsonToValue(&campaign, node, "CampaignDTO", "CampaignDTO");
		} else {
			
			CampaignDTO* obj = static_cast<CampaignDTO*> (&campaign);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetCampaignResponse::GetCampaignResponse(char* json)
{
	this->fromJson(json);
}

char*
GetCampaignResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignDTO")) {
		CampaignDTO obj = getCampaign();
		node = converttoJson(&obj, "CampaignDTO", "");
	}
	else {
		
		CampaignDTO obj = static_cast<CampaignDTO> (getCampaign());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *campaignKey = "campaign";
	json_object_set_member(pJsonObject, campaignKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CampaignDTO
GetCampaignResponse::getCampaign()
{
	return campaign;
}

void
GetCampaignResponse::setCampaign(CampaignDTO  campaign)
{
	this->campaign = campaign;
}


