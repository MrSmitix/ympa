#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignQualityRatingDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignQualityRatingDTO::CampaignQualityRatingDTO()
{
	//__init();
}

CampaignQualityRatingDTO::~CampaignQualityRatingDTO()
{
	//__cleanup();
}

void
CampaignQualityRatingDTO::__init()
{
	//campaignId = long(0);
	//new std::list()std::list> ratings;
}

void
CampaignQualityRatingDTO::__cleanup()
{
	//if(campaignId != NULL) {
	//
	//delete campaignId;
	//campaignId = NULL;
	//}
	//if(ratings != NULL) {
	//ratings.RemoveAll(true);
	//delete ratings;
	//ratings = NULL;
	//}
	//
}

void
CampaignQualityRatingDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaignIdKey = "campaignId";
	node = json_object_get_member(pJsonObject, campaignIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&campaignId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *ratingsKey = "ratings";
	node = json_object_get_member(pJsonObject, ratingsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<QualityRatingDTO> new_list;
			QualityRatingDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("QualityRatingDTO")) {
					jsonToValue(&inst, temp_json, "QualityRatingDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			ratings = new_list;
		}
		
	}
}

CampaignQualityRatingDTO::CampaignQualityRatingDTO(char* json)
{
	this->fromJson(json);
}

char*
CampaignQualityRatingDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCampaignId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *campaignIdKey = "campaignId";
	json_object_set_member(pJsonObject, campaignIdKey, node);
	if (isprimitive("QualityRatingDTO")) {
		list<QualityRatingDTO> new_list = static_cast<list <QualityRatingDTO> > (getRatings());
		node = converttoJson(&new_list, "QualityRatingDTO", "array");
	} else {
		node = json_node_alloc();
		list<QualityRatingDTO> new_list = static_cast<list <QualityRatingDTO> > (getRatings());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<QualityRatingDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			QualityRatingDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ratingsKey = "ratings";
	json_object_set_member(pJsonObject, ratingsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CampaignQualityRatingDTO::getCampaignId()
{
	return campaignId;
}

void
CampaignQualityRatingDTO::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

std::list<QualityRatingDTO>
CampaignQualityRatingDTO::getRatings()
{
	return ratings;
}

void
CampaignQualityRatingDTO::setRatings(std::list <QualityRatingDTO> ratings)
{
	this->ratings = ratings;
}


