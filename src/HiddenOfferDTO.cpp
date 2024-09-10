#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HiddenOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HiddenOfferDTO::HiddenOfferDTO()
{
	//__init();
}

HiddenOfferDTO::~HiddenOfferDTO()
{
	//__cleanup();
}

void
HiddenOfferDTO::__init()
{
	//offerId = std::string();
}

void
HiddenOfferDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//
}

void
HiddenOfferDTO::fromJson(char* jsonStr)
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
}

HiddenOfferDTO::HiddenOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
HiddenOfferDTO::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
HiddenOfferDTO::getOfferId()
{
	return offerId;
}

void
HiddenOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}


