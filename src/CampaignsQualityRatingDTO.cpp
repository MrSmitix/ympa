#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignsQualityRatingDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignsQualityRatingDTO::CampaignsQualityRatingDTO()
{
	//__init();
}

CampaignsQualityRatingDTO::~CampaignsQualityRatingDTO()
{
	//__cleanup();
}

void
CampaignsQualityRatingDTO::__init()
{
	//new std::list()std::list> campaignRatings;
}

void
CampaignsQualityRatingDTO::__cleanup()
{
	//if(campaignRatings != NULL) {
	//campaignRatings.RemoveAll(true);
	//delete campaignRatings;
	//campaignRatings = NULL;
	//}
	//
}

void
CampaignsQualityRatingDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaignRatingsKey = "campaignRatings";
	node = json_object_get_member(pJsonObject, campaignRatingsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignQualityRatingDTO> new_list;
			CampaignQualityRatingDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignQualityRatingDTO")) {
					jsonToValue(&inst, temp_json, "CampaignQualityRatingDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			campaignRatings = new_list;
		}
		
	}
}

CampaignsQualityRatingDTO::CampaignsQualityRatingDTO(char* json)
{
	this->fromJson(json);
}

char*
CampaignsQualityRatingDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignQualityRatingDTO")) {
		list<CampaignQualityRatingDTO> new_list = static_cast<list <CampaignQualityRatingDTO> > (getCampaignRatings());
		node = converttoJson(&new_list, "CampaignQualityRatingDTO", "array");
	} else {
		node = json_node_alloc();
		list<CampaignQualityRatingDTO> new_list = static_cast<list <CampaignQualityRatingDTO> > (getCampaignRatings());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignQualityRatingDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignQualityRatingDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *campaignRatingsKey = "campaignRatings";
	json_object_set_member(pJsonObject, campaignRatingsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<CampaignQualityRatingDTO>
CampaignsQualityRatingDTO::getCampaignRatings()
{
	return campaignRatings;
}

void
CampaignsQualityRatingDTO::setCampaignRatings(std::list <CampaignQualityRatingDTO> campaignRatings)
{
	this->campaignRatings = campaignRatings;
}


