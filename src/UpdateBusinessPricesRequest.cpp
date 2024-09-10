#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateBusinessPricesRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateBusinessPricesRequest::UpdateBusinessPricesRequest()
{
	//__init();
}

UpdateBusinessPricesRequest::~UpdateBusinessPricesRequest()
{
	//__cleanup();
}

void
UpdateBusinessPricesRequest::__init()
{
	//new std::list()std::list> offers;
}

void
UpdateBusinessPricesRequest::__cleanup()
{
	//if(offers != NULL) {
	//offers.RemoveAll(true);
	//delete offers;
	//offers = NULL;
	//}
	//
}

void
UpdateBusinessPricesRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateBusinessOfferPriceDTO> new_list;
			UpdateBusinessOfferPriceDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateBusinessOfferPriceDTO")) {
					jsonToValue(&inst, temp_json, "UpdateBusinessOfferPriceDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offers = new_list;
		}
		
	}
}

UpdateBusinessPricesRequest::UpdateBusinessPricesRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateBusinessPricesRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdateBusinessOfferPriceDTO")) {
		list<UpdateBusinessOfferPriceDTO> new_list = static_cast<list <UpdateBusinessOfferPriceDTO> > (getOffers());
		node = converttoJson(&new_list, "UpdateBusinessOfferPriceDTO", "array");
	} else {
		node = json_node_alloc();
		list<UpdateBusinessOfferPriceDTO> new_list = static_cast<list <UpdateBusinessOfferPriceDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateBusinessOfferPriceDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateBusinessOfferPriceDTO obj = *it;
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

std::list<UpdateBusinessOfferPriceDTO>
UpdateBusinessPricesRequest::getOffers()
{
	return offers;
}

void
UpdateBusinessPricesRequest::setOffers(std::list <UpdateBusinessOfferPriceDTO> offers)
{
	this->offers = offers;
}


