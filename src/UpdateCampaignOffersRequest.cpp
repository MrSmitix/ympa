#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateCampaignOffersRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateCampaignOffersRequest::UpdateCampaignOffersRequest()
{
	//__init();
}

UpdateCampaignOffersRequest::~UpdateCampaignOffersRequest()
{
	//__cleanup();
}

void
UpdateCampaignOffersRequest::__init()
{
	//new std::list()std::list> offers;
}

void
UpdateCampaignOffersRequest::__cleanup()
{
	//if(offers != NULL) {
	//offers.RemoveAll(true);
	//delete offers;
	//offers = NULL;
	//}
	//
}

void
UpdateCampaignOffersRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateCampaignOfferDTO> new_list;
			UpdateCampaignOfferDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateCampaignOfferDTO")) {
					jsonToValue(&inst, temp_json, "UpdateCampaignOfferDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offers = new_list;
		}
		
	}
}

UpdateCampaignOffersRequest::UpdateCampaignOffersRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateCampaignOffersRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdateCampaignOfferDTO")) {
		list<UpdateCampaignOfferDTO> new_list = static_cast<list <UpdateCampaignOfferDTO> > (getOffers());
		node = converttoJson(&new_list, "UpdateCampaignOfferDTO", "array");
	} else {
		node = json_node_alloc();
		list<UpdateCampaignOfferDTO> new_list = static_cast<list <UpdateCampaignOfferDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateCampaignOfferDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateCampaignOfferDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offersKey = "offers";
	json_object_set_member(pJsonObject, offersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<UpdateCampaignOfferDTO>
UpdateCampaignOffersRequest::getOffers()
{
	return offers;
}

void
UpdateCampaignOffersRequest::setOffers(std::list <UpdateCampaignOfferDTO> offers)
{
	this->offers = offers;
}


