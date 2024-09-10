#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QuarantineOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QuarantineOfferDTO::QuarantineOfferDTO()
{
	//__init();
}

QuarantineOfferDTO::~QuarantineOfferDTO()
{
	//__cleanup();
}

void
QuarantineOfferDTO::__init()
{
	//offerId = std::string();
	//currentPrice = new BasePriceDTO();
	//lastValidPrice = new BasePriceDTO();
	//new std::list()std::list> verdicts;
}

void
QuarantineOfferDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(currentPrice != NULL) {
	//
	//delete currentPrice;
	//currentPrice = NULL;
	//}
	//if(lastValidPrice != NULL) {
	//
	//delete lastValidPrice;
	//lastValidPrice = NULL;
	//}
	//if(verdicts != NULL) {
	//verdicts.RemoveAll(true);
	//delete verdicts;
	//verdicts = NULL;
	//}
	//
}

void
QuarantineOfferDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerIdKey = "offerId";
	node = json_object_get_member(pJsonObject, offerIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *currentPriceKey = "currentPrice";
	node = json_object_get_member(pJsonObject, currentPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("BasePriceDTO")) {
			jsonToValue(&currentPrice, node, "BasePriceDTO", "BasePriceDTO");
		} else {
			
			BasePriceDTO* obj = static_cast<BasePriceDTO*> (&currentPrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *lastValidPriceKey = "lastValidPrice";
	node = json_object_get_member(pJsonObject, lastValidPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("BasePriceDTO")) {
			jsonToValue(&lastValidPrice, node, "BasePriceDTO", "BasePriceDTO");
		} else {
			
			BasePriceDTO* obj = static_cast<BasePriceDTO*> (&lastValidPrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *verdictsKey = "verdicts";
	node = json_object_get_member(pJsonObject, verdictsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PriceQuarantineVerdictDTO> new_list;
			PriceQuarantineVerdictDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PriceQuarantineVerdictDTO")) {
					jsonToValue(&inst, temp_json, "PriceQuarantineVerdictDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			verdicts = new_list;
		}
		
	}
}

QuarantineOfferDTO::QuarantineOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
QuarantineOfferDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getOfferId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerIdKey = "offerId";
	json_object_set_member(pJsonObject, offerIdKey, node);
	if (isprimitive("BasePriceDTO")) {
		BasePriceDTO obj = getCurrentPrice();
		node = converttoJson(&obj, "BasePriceDTO", "");
	}
	else {
		
		BasePriceDTO obj = static_cast<BasePriceDTO> (getCurrentPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currentPriceKey = "currentPrice";
	json_object_set_member(pJsonObject, currentPriceKey, node);
	if (isprimitive("BasePriceDTO")) {
		BasePriceDTO obj = getLastValidPrice();
		node = converttoJson(&obj, "BasePriceDTO", "");
	}
	else {
		
		BasePriceDTO obj = static_cast<BasePriceDTO> (getLastValidPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *lastValidPriceKey = "lastValidPrice";
	json_object_set_member(pJsonObject, lastValidPriceKey, node);
	if (isprimitive("PriceQuarantineVerdictDTO")) {
		list<PriceQuarantineVerdictDTO> new_list = static_cast<list <PriceQuarantineVerdictDTO> > (getVerdicts());
		node = converttoJson(&new_list, "PriceQuarantineVerdictDTO", "array");
	} else {
		node = json_node_alloc();
		list<PriceQuarantineVerdictDTO> new_list = static_cast<list <PriceQuarantineVerdictDTO> > (getVerdicts());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PriceQuarantineVerdictDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PriceQuarantineVerdictDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *verdictsKey = "verdicts";
	json_object_set_member(pJsonObject, verdictsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
QuarantineOfferDTO::getOfferId()
{
	return offerId;
}

void
QuarantineOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

BasePriceDTO
QuarantineOfferDTO::getCurrentPrice()
{
	return currentPrice;
}

void
QuarantineOfferDTO::setCurrentPrice(BasePriceDTO  currentPrice)
{
	this->currentPrice = currentPrice;
}

BasePriceDTO
QuarantineOfferDTO::getLastValidPrice()
{
	return lastValidPrice;
}

void
QuarantineOfferDTO::setLastValidPrice(BasePriceDTO  lastValidPrice)
{
	this->lastValidPrice = lastValidPrice;
}

std::list<PriceQuarantineVerdictDTO>
QuarantineOfferDTO::getVerdicts()
{
	return verdicts;
}

void
QuarantineOfferDTO::setVerdicts(std::list <PriceQuarantineVerdictDTO> verdicts)
{
	this->verdicts = verdicts;
}


