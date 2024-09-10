#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PriceSuggestOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PriceSuggestOfferDTO::PriceSuggestOfferDTO()
{
	//__init();
}

PriceSuggestOfferDTO::~PriceSuggestOfferDTO()
{
	//__cleanup();
}

void
PriceSuggestOfferDTO::__init()
{
	//marketSku = long(0);
	//offerId = std::string();
	//new std::list()std::list> priceSuggestion;
}

void
PriceSuggestOfferDTO::__cleanup()
{
	//if(marketSku != NULL) {
	//
	//delete marketSku;
	//marketSku = NULL;
	//}
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(priceSuggestion != NULL) {
	//priceSuggestion.RemoveAll(true);
	//delete priceSuggestion;
	//priceSuggestion = NULL;
	//}
	//
}

void
PriceSuggestOfferDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *marketSkuKey = "marketSku";
	node = json_object_get_member(pJsonObject, marketSkuKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&marketSku, node, "long long", "");
		} else {
			
		}
	}
	const gchar *offerIdKey = "offerId";
	node = json_object_get_member(pJsonObject, offerIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *priceSuggestionKey = "priceSuggestion";
	node = json_object_get_member(pJsonObject, priceSuggestionKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PriceSuggestDTO> new_list;
			PriceSuggestDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PriceSuggestDTO")) {
					jsonToValue(&inst, temp_json, "PriceSuggestDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			priceSuggestion = new_list;
		}
		
	}
}

PriceSuggestOfferDTO::PriceSuggestOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
PriceSuggestOfferDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getMarketSku();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *marketSkuKey = "marketSku";
	json_object_set_member(pJsonObject, marketSkuKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOfferId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerIdKey = "offerId";
	json_object_set_member(pJsonObject, offerIdKey, node);
	if (isprimitive("PriceSuggestDTO")) {
		list<PriceSuggestDTO> new_list = static_cast<list <PriceSuggestDTO> > (getPriceSuggestion());
		node = converttoJson(&new_list, "PriceSuggestDTO", "array");
	} else {
		node = json_node_alloc();
		list<PriceSuggestDTO> new_list = static_cast<list <PriceSuggestDTO> > (getPriceSuggestion());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PriceSuggestDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PriceSuggestDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *priceSuggestionKey = "priceSuggestion";
	json_object_set_member(pJsonObject, priceSuggestionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
PriceSuggestOfferDTO::getMarketSku()
{
	return marketSku;
}

void
PriceSuggestOfferDTO::setMarketSku(long long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
PriceSuggestOfferDTO::getOfferId()
{
	return offerId;
}

void
PriceSuggestOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::list<PriceSuggestDTO>
PriceSuggestOfferDTO::getPriceSuggestion()
{
	return priceSuggestion;
}

void
PriceSuggestOfferDTO::setPriceSuggestion(std::list <PriceSuggestDTO> priceSuggestion)
{
	this->priceSuggestion = priceSuggestion;
}


