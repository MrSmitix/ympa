#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EnrichedModelDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EnrichedModelDTO::EnrichedModelDTO()
{
	//__init();
}

EnrichedModelDTO::~EnrichedModelDTO()
{
	//__cleanup();
}

void
EnrichedModelDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//prices = new ModelPriceDTO();
	//new std::list()std::list> offers;
	//offlineOffers = int(0);
	//onlineOffers = int(0);
}

void
EnrichedModelDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(prices != NULL) {
	//
	//delete prices;
	//prices = NULL;
	//}
	//if(offers != NULL) {
	//offers.RemoveAll(true);
	//delete offers;
	//offers = NULL;
	//}
	//if(offlineOffers != NULL) {
	//
	//delete offlineOffers;
	//offlineOffers = NULL;
	//}
	//if(onlineOffers != NULL) {
	//
	//delete onlineOffers;
	//onlineOffers = NULL;
	//}
	//
}

void
EnrichedModelDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pricesKey = "prices";
	node = json_object_get_member(pJsonObject, pricesKey);
	if (node !=NULL) {
	

		if (isprimitive("ModelPriceDTO")) {
			jsonToValue(&prices, node, "ModelPriceDTO", "ModelPriceDTO");
		} else {
			
			ModelPriceDTO* obj = static_cast<ModelPriceDTO*> (&prices);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ModelOfferDTO> new_list;
			ModelOfferDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ModelOfferDTO")) {
					jsonToValue(&inst, temp_json, "ModelOfferDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offers = new_list;
		}
		
	}
	const gchar *offlineOffersKey = "offlineOffers";
	node = json_object_get_member(pJsonObject, offlineOffersKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&offlineOffers, node, "int", "");
		} else {
			
		}
	}
	const gchar *onlineOffersKey = "onlineOffers";
	node = json_object_get_member(pJsonObject, onlineOffersKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&onlineOffers, node, "int", "");
		} else {
			
		}
	}
}

EnrichedModelDTO::EnrichedModelDTO(char* json)
{
	this->fromJson(json);
}

char*
EnrichedModelDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ModelPriceDTO")) {
		ModelPriceDTO obj = getPrices();
		node = converttoJson(&obj, "ModelPriceDTO", "");
	}
	else {
		
		ModelPriceDTO obj = static_cast<ModelPriceDTO> (getPrices());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pricesKey = "prices";
	json_object_set_member(pJsonObject, pricesKey, node);
	if (isprimitive("ModelOfferDTO")) {
		list<ModelOfferDTO> new_list = static_cast<list <ModelOfferDTO> > (getOffers());
		node = converttoJson(&new_list, "ModelOfferDTO", "array");
	} else {
		node = json_node_alloc();
		list<ModelOfferDTO> new_list = static_cast<list <ModelOfferDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ModelOfferDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ModelOfferDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offersKey = "offers";
	json_object_set_member(pJsonObject, offersKey, node);
	if (isprimitive("int")) {
		int obj = getOfflineOffers();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *offlineOffersKey = "offlineOffers";
	json_object_set_member(pJsonObject, offlineOffersKey, node);
	if (isprimitive("int")) {
		int obj = getOnlineOffers();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *onlineOffersKey = "onlineOffers";
	json_object_set_member(pJsonObject, onlineOffersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
EnrichedModelDTO::getId()
{
	return id;
}

void
EnrichedModelDTO::setId(long long  id)
{
	this->id = id;
}

std::string
EnrichedModelDTO::getName()
{
	return name;
}

void
EnrichedModelDTO::setName(std::string  name)
{
	this->name = name;
}

ModelPriceDTO
EnrichedModelDTO::getPrices()
{
	return prices;
}

void
EnrichedModelDTO::setPrices(ModelPriceDTO  prices)
{
	this->prices = prices;
}

std::list<ModelOfferDTO>
EnrichedModelDTO::getOffers()
{
	return offers;
}

void
EnrichedModelDTO::setOffers(std::list <ModelOfferDTO> offers)
{
	this->offers = offers;
}

int
EnrichedModelDTO::getOfflineOffers()
{
	return offlineOffers;
}

void
EnrichedModelDTO::setOfflineOffers(int  offlineOffers)
{
	this->offlineOffers = offlineOffers;
}

int
EnrichedModelDTO::getOnlineOffers()
{
	return onlineOffers;
}

void
EnrichedModelDTO::setOnlineOffers(int  onlineOffers)
{
	this->onlineOffers = onlineOffers;
}


