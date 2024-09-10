#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BaseCampaignOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BaseCampaignOfferDTO::BaseCampaignOfferDTO()
{
	//__init();
}

BaseCampaignOfferDTO::~BaseCampaignOfferDTO()
{
	//__cleanup();
}

void
BaseCampaignOfferDTO::__init()
{
	//offerId = std::string();
	//quantum = new QuantumDTO();
	//available = bool(false);
}

void
BaseCampaignOfferDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(quantum != NULL) {
	//
	//delete quantum;
	//quantum = NULL;
	//}
	//if(available != NULL) {
	//
	//delete available;
	//available = NULL;
	//}
	//
}

void
BaseCampaignOfferDTO::fromJson(char* jsonStr)
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
	const gchar *quantumKey = "quantum";
	node = json_object_get_member(pJsonObject, quantumKey);
	if (node !=NULL) {
	

		if (isprimitive("QuantumDTO")) {
			jsonToValue(&quantum, node, "QuantumDTO", "QuantumDTO");
		} else {
			
			QuantumDTO* obj = static_cast<QuantumDTO*> (&quantum);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *availableKey = "available";
	node = json_object_get_member(pJsonObject, availableKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&available, node, "bool", "");
		} else {
			
		}
	}
}

BaseCampaignOfferDTO::BaseCampaignOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
BaseCampaignOfferDTO::toJson()
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
	if (isprimitive("QuantumDTO")) {
		QuantumDTO obj = getQuantum();
		node = converttoJson(&obj, "QuantumDTO", "");
	}
	else {
		
		QuantumDTO obj = static_cast<QuantumDTO> (getQuantum());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *quantumKey = "quantum";
	json_object_set_member(pJsonObject, quantumKey, node);
	if (isprimitive("bool")) {
		bool obj = getAvailable();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *availableKey = "available";
	json_object_set_member(pJsonObject, availableKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BaseCampaignOfferDTO::getOfferId()
{
	return offerId;
}

void
BaseCampaignOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

QuantumDTO
BaseCampaignOfferDTO::getQuantum()
{
	return quantum;
}

void
BaseCampaignOfferDTO::setQuantum(QuantumDTO  quantum)
{
	this->quantum = quantum;
}

bool
BaseCampaignOfferDTO::getAvailable()
{
	return available;
}

void
BaseCampaignOfferDTO::setAvailable(bool  available)
{
	this->available = available;
}


