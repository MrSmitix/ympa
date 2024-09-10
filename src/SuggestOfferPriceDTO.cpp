#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SuggestOfferPriceDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SuggestOfferPriceDTO::SuggestOfferPriceDTO()
{
	//__init();
}

SuggestOfferPriceDTO::~SuggestOfferPriceDTO()
{
	//__cleanup();
}

void
SuggestOfferPriceDTO::__init()
{
	//offerId = std::string();
	//marketSku = long(0);
}

void
SuggestOfferPriceDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(marketSku != NULL) {
	//
	//delete marketSku;
	//marketSku = NULL;
	//}
	//
}

void
SuggestOfferPriceDTO::fromJson(char* jsonStr)
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
	const gchar *marketSkuKey = "marketSku";
	node = json_object_get_member(pJsonObject, marketSkuKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&marketSku, node, "long long", "");
		} else {
			
		}
	}
}

SuggestOfferPriceDTO::SuggestOfferPriceDTO(char* json)
{
	this->fromJson(json);
}

char*
SuggestOfferPriceDTO::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getMarketSku();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *marketSkuKey = "marketSku";
	json_object_set_member(pJsonObject, marketSkuKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SuggestOfferPriceDTO::getOfferId()
{
	return offerId;
}

void
SuggestOfferPriceDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

long long
SuggestOfferPriceDTO::getMarketSku()
{
	return marketSku;
}

void
SuggestOfferPriceDTO::setMarketSku(long long  marketSku)
{
	this->marketSku = marketSku;
}


