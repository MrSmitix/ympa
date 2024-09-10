#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdatePromoOffersRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdatePromoOffersRequest::UpdatePromoOffersRequest()
{
	//__init();
}

UpdatePromoOffersRequest::~UpdatePromoOffersRequest()
{
	//__cleanup();
}

void
UpdatePromoOffersRequest::__init()
{
	//promoId = std::string();
	//new std::list()std::list> offers;
}

void
UpdatePromoOffersRequest::__cleanup()
{
	//if(promoId != NULL) {
	//
	//delete promoId;
	//promoId = NULL;
	//}
	//if(offers != NULL) {
	//offers.RemoveAll(true);
	//delete offers;
	//offers = NULL;
	//}
	//
}

void
UpdatePromoOffersRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *promoIdKey = "promoId";
	node = json_object_get_member(pJsonObject, promoIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promoId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdatePromoOfferDTO> new_list;
			UpdatePromoOfferDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdatePromoOfferDTO")) {
					jsonToValue(&inst, temp_json, "UpdatePromoOfferDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offers = new_list;
		}
		
	}
}

UpdatePromoOffersRequest::UpdatePromoOffersRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdatePromoOffersRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPromoId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promoIdKey = "promoId";
	json_object_set_member(pJsonObject, promoIdKey, node);
	if (isprimitive("UpdatePromoOfferDTO")) {
		list<UpdatePromoOfferDTO> new_list = static_cast<list <UpdatePromoOfferDTO> > (getOffers());
		node = converttoJson(&new_list, "UpdatePromoOfferDTO", "array");
	} else {
		node = json_node_alloc();
		list<UpdatePromoOfferDTO> new_list = static_cast<list <UpdatePromoOfferDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdatePromoOfferDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdatePromoOfferDTO obj = *it;
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

std::string
UpdatePromoOffersRequest::getPromoId()
{
	return promoId;
}

void
UpdatePromoOffersRequest::setPromoId(std::string  promoId)
{
	this->promoId = promoId;
}

std::list<UpdatePromoOfferDTO>
UpdatePromoOffersRequest::getOffers()
{
	return offers;
}

void
UpdatePromoOffersRequest::setOffers(std::list <UpdatePromoOfferDTO> offers)
{
	this->offers = offers;
}


