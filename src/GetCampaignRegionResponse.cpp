#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCampaignRegionResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCampaignRegionResponse::GetCampaignRegionResponse()
{
	//__init();
}

GetCampaignRegionResponse::~GetCampaignRegionResponse()
{
	//__cleanup();
}

void
GetCampaignRegionResponse::__init()
{
	//region = new RegionDTO();
}

void
GetCampaignRegionResponse::__cleanup()
{
	//if(region != NULL) {
	//
	//delete region;
	//region = NULL;
	//}
	//
}

void
GetCampaignRegionResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *regionKey = "region";
	node = json_object_get_member(pJsonObject, regionKey);
	if (node !=NULL) {
	

		if (isprimitive("RegionDTO")) {
			jsonToValue(&region, node, "RegionDTO", "RegionDTO");
		} else {
			
			RegionDTO* obj = static_cast<RegionDTO*> (&region);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetCampaignRegionResponse::GetCampaignRegionResponse(char* json)
{
	this->fromJson(json);
}

char*
GetCampaignRegionResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("RegionDTO")) {
		RegionDTO obj = getRegion();
		node = converttoJson(&obj, "RegionDTO", "");
	}
	else {
		
		RegionDTO obj = static_cast<RegionDTO> (getRegion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *regionKey = "region";
	json_object_set_member(pJsonObject, regionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

RegionDTO
GetCampaignRegionResponse::getRegion()
{
	return region;
}

void
GetCampaignRegionResponse::setRegion(RegionDTO  region)
{
	this->region = region;
}


