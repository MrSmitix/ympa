#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromoAssortmentInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromoAssortmentInfoDTO::GetPromoAssortmentInfoDTO()
{
	//__init();
}

GetPromoAssortmentInfoDTO::~GetPromoAssortmentInfoDTO()
{
	//__cleanup();
}

void
GetPromoAssortmentInfoDTO::__init()
{
	//activeOffers = int(0);
	//potentialOffers = int(0);
	//processing = bool(false);
}

void
GetPromoAssortmentInfoDTO::__cleanup()
{
	//if(activeOffers != NULL) {
	//
	//delete activeOffers;
	//activeOffers = NULL;
	//}
	//if(potentialOffers != NULL) {
	//
	//delete potentialOffers;
	//potentialOffers = NULL;
	//}
	//if(processing != NULL) {
	//
	//delete processing;
	//processing = NULL;
	//}
	//
}

void
GetPromoAssortmentInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *activeOffersKey = "activeOffers";
	node = json_object_get_member(pJsonObject, activeOffersKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&activeOffers, node, "int", "");
		} else {
			
		}
	}
	const gchar *potentialOffersKey = "potentialOffers";
	node = json_object_get_member(pJsonObject, potentialOffersKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&potentialOffers, node, "int", "");
		} else {
			
		}
	}
	const gchar *processingKey = "processing";
	node = json_object_get_member(pJsonObject, processingKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&processing, node, "bool", "");
		} else {
			
		}
	}
}

GetPromoAssortmentInfoDTO::GetPromoAssortmentInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
GetPromoAssortmentInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getActiveOffers();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *activeOffersKey = "activeOffers";
	json_object_set_member(pJsonObject, activeOffersKey, node);
	if (isprimitive("int")) {
		int obj = getPotentialOffers();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *potentialOffersKey = "potentialOffers";
	json_object_set_member(pJsonObject, potentialOffersKey, node);
	if (isprimitive("bool")) {
		bool obj = getProcessing();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *processingKey = "processing";
	json_object_set_member(pJsonObject, processingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
GetPromoAssortmentInfoDTO::getActiveOffers()
{
	return activeOffers;
}

void
GetPromoAssortmentInfoDTO::setActiveOffers(int  activeOffers)
{
	this->activeOffers = activeOffers;
}

int
GetPromoAssortmentInfoDTO::getPotentialOffers()
{
	return potentialOffers;
}

void
GetPromoAssortmentInfoDTO::setPotentialOffers(int  potentialOffers)
{
	this->potentialOffers = potentialOffers;
}

bool
GetPromoAssortmentInfoDTO::getProcessing()
{
	return processing;
}

void
GetPromoAssortmentInfoDTO::setProcessing(bool  processing)
{
	this->processing = processing;
}


