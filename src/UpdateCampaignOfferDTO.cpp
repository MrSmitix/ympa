#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateCampaignOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateCampaignOfferDTO::UpdateCampaignOfferDTO()
{
	//__init();
}

UpdateCampaignOfferDTO::~UpdateCampaignOfferDTO()
{
	//__cleanup();
}

void
UpdateCampaignOfferDTO::__init()
{
	//offerId = std::string();
	//quantum = new QuantumDTO();
	//available = bool(false);
	//vat = int(0);
}

void
UpdateCampaignOfferDTO::__cleanup()
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
	//if(vat != NULL) {
	//
	//delete vat;
	//vat = NULL;
	//}
	//
}

void
UpdateCampaignOfferDTO::fromJson(char* jsonStr)
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
	const gchar *vatKey = "vat";
	node = json_object_get_member(pJsonObject, vatKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vat, node, "int", "");
		} else {
			
		}
	}
}

UpdateCampaignOfferDTO::UpdateCampaignOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateCampaignOfferDTO::toJson()
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
	if (isprimitive("int")) {
		int obj = getVat();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vatKey = "vat";
	json_object_set_member(pJsonObject, vatKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UpdateCampaignOfferDTO::getOfferId()
{
	return offerId;
}

void
UpdateCampaignOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

QuantumDTO
UpdateCampaignOfferDTO::getQuantum()
{
	return quantum;
}

void
UpdateCampaignOfferDTO::setQuantum(QuantumDTO  quantum)
{
	this->quantum = quantum;
}

bool
UpdateCampaignOfferDTO::getAvailable()
{
	return available;
}

void
UpdateCampaignOfferDTO::setAvailable(bool  available)
{
	this->available = available;
}

int
UpdateCampaignOfferDTO::getVat()
{
	return vat;
}

void
UpdateCampaignOfferDTO::setVat(int  vat)
{
	this->vat = vat;
}


