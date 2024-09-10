#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeletePromoOffersResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeletePromoOffersResultDTO::DeletePromoOffersResultDTO()
{
	//__init();
}

DeletePromoOffersResultDTO::~DeletePromoOffersResultDTO()
{
	//__cleanup();
}

void
DeletePromoOffersResultDTO::__init()
{
	//new std::list()std::list> rejectedOffers;
}

void
DeletePromoOffersResultDTO::__cleanup()
{
	//if(rejectedOffers != NULL) {
	//rejectedOffers.RemoveAll(true);
	//delete rejectedOffers;
	//rejectedOffers = NULL;
	//}
	//
}

void
DeletePromoOffersResultDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rejectedOffersKey = "rejectedOffers";
	node = json_object_get_member(pJsonObject, rejectedOffersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RejectedPromoOfferDeleteDTO> new_list;
			RejectedPromoOfferDeleteDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RejectedPromoOfferDeleteDTO")) {
					jsonToValue(&inst, temp_json, "RejectedPromoOfferDeleteDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			rejectedOffers = new_list;
		}
		
	}
}

DeletePromoOffersResultDTO::DeletePromoOffersResultDTO(char* json)
{
	this->fromJson(json);
}

char*
DeletePromoOffersResultDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("RejectedPromoOfferDeleteDTO")) {
		list<RejectedPromoOfferDeleteDTO> new_list = static_cast<list <RejectedPromoOfferDeleteDTO> > (getRejectedOffers());
		node = converttoJson(&new_list, "RejectedPromoOfferDeleteDTO", "array");
	} else {
		node = json_node_alloc();
		list<RejectedPromoOfferDeleteDTO> new_list = static_cast<list <RejectedPromoOfferDeleteDTO> > (getRejectedOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RejectedPromoOfferDeleteDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RejectedPromoOfferDeleteDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *rejectedOffersKey = "rejectedOffers";
	json_object_set_member(pJsonObject, rejectedOffersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<RejectedPromoOfferDeleteDTO>
DeletePromoOffersResultDTO::getRejectedOffers()
{
	return rejectedOffers;
}

void
DeletePromoOffersResultDTO::setRejectedOffers(std::list <RejectedPromoOfferDeleteDTO> rejectedOffers)
{
	this->rejectedOffers = rejectedOffers;
}


