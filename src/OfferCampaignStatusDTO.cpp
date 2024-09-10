#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferCampaignStatusDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferCampaignStatusDTO::OfferCampaignStatusDTO()
{
	//__init();
}

OfferCampaignStatusDTO::~OfferCampaignStatusDTO()
{
	//__cleanup();
}

void
OfferCampaignStatusDTO::__init()
{
	//campaignId = long(0);
	//status = new OfferCampaignStatusType();
}

void
OfferCampaignStatusDTO::__cleanup()
{
	//if(campaignId != NULL) {
	//
	//delete campaignId;
	//campaignId = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
OfferCampaignStatusDTO::fromJson(char* jsonStr)
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferCampaignStatusType")) {
			jsonToValue(&status, node, "OfferCampaignStatusType", "OfferCampaignStatusType");
		} else {
			
			OfferCampaignStatusType* obj = static_cast<OfferCampaignStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OfferCampaignStatusDTO::OfferCampaignStatusDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferCampaignStatusDTO::toJson()
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
	if (isprimitive("OfferCampaignStatusType")) {
		OfferCampaignStatusType obj = getStatus();
		node = converttoJson(&obj, "OfferCampaignStatusType", "");
	}
	else {
		
		OfferCampaignStatusType obj = static_cast<OfferCampaignStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OfferCampaignStatusDTO::getCampaignId()
{
	return campaignId;
}

void
OfferCampaignStatusDTO::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

OfferCampaignStatusType
OfferCampaignStatusDTO::getStatus()
{
	return status;
}

void
OfferCampaignStatusDTO::setStatus(OfferCampaignStatusType  status)
{
	this->status = status;
}


