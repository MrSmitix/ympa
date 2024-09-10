#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PromoOfferAutoParticipatingDetailsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PromoOfferAutoParticipatingDetailsDTO::PromoOfferAutoParticipatingDetailsDTO()
{
	//__init();
}

PromoOfferAutoParticipatingDetailsDTO::~PromoOfferAutoParticipatingDetailsDTO()
{
	//__cleanup();
}

void
PromoOfferAutoParticipatingDetailsDTO::__init()
{
	//new std::list()std::list> campaignIds;
}

void
PromoOfferAutoParticipatingDetailsDTO::__cleanup()
{
	//if(campaignIds != NULL) {
	//campaignIds.RemoveAll(true);
	//delete campaignIds;
	//campaignIds = NULL;
	//}
	//
}

void
PromoOfferAutoParticipatingDetailsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaignIdsKey = "campaignIds";
	node = json_object_get_member(pJsonObject, campaignIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			campaignIds = new_list;
		}
		
	}
}

PromoOfferAutoParticipatingDetailsDTO::PromoOfferAutoParticipatingDetailsDTO(char* json)
{
	this->fromJson(json);
}

char*
PromoOfferAutoParticipatingDetailsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getCampaignIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getCampaignIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *campaignIdsKey = "campaignIds";
	json_object_set_member(pJsonObject, campaignIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<long long>
PromoOfferAutoParticipatingDetailsDTO::getCampaignIds()
{
	return campaignIds;
}

void
PromoOfferAutoParticipatingDetailsDTO::setCampaignIds(std::list <long long> campaignIds)
{
	this->campaignIds = campaignIds;
}


