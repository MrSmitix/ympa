#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteCampaignOffersDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteCampaignOffersDTO::DeleteCampaignOffersDTO()
{
	//__init();
}

DeleteCampaignOffersDTO::~DeleteCampaignOffersDTO()
{
	//__cleanup();
}

void
DeleteCampaignOffersDTO::__init()
{
	//new std::list()std::list> notDeletedOfferIds;
}

void
DeleteCampaignOffersDTO::__cleanup()
{
	//if(notDeletedOfferIds != NULL) {
	//notDeletedOfferIds.RemoveAll(true);
	//delete notDeletedOfferIds;
	//notDeletedOfferIds = NULL;
	//}
	//
}

void
DeleteCampaignOffersDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *notDeletedOfferIdsKey = "notDeletedOfferIds";
	node = json_object_get_member(pJsonObject, notDeletedOfferIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			notDeletedOfferIds = new_list;
		}
		
	}
}

DeleteCampaignOffersDTO::DeleteCampaignOffersDTO(char* json)
{
	this->fromJson(json);
}

char*
DeleteCampaignOffersDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getNotDeletedOfferIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getNotDeletedOfferIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *notDeletedOfferIdsKey = "notDeletedOfferIds";
	json_object_set_member(pJsonObject, notDeletedOfferIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
DeleteCampaignOffersDTO::getNotDeletedOfferIds()
{
	return notDeletedOfferIds;
}

void
DeleteCampaignOffersDTO::setNotDeletedOfferIds(std::list <std::string> notDeletedOfferIds)
{
	this->notDeletedOfferIds = notDeletedOfferIds;
}


