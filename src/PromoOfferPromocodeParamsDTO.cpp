#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PromoOfferPromocodeParamsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PromoOfferPromocodeParamsDTO::PromoOfferPromocodeParamsDTO()
{
	//__init();
}

PromoOfferPromocodeParamsDTO::~PromoOfferPromocodeParamsDTO()
{
	//__cleanup();
}

void
PromoOfferPromocodeParamsDTO::__init()
{
	//maxPrice = long(0);
}

void
PromoOfferPromocodeParamsDTO::__cleanup()
{
	//if(maxPrice != NULL) {
	//
	//delete maxPrice;
	//maxPrice = NULL;
	//}
	//
}

void
PromoOfferPromocodeParamsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxPriceKey = "maxPrice";
	node = json_object_get_member(pJsonObject, maxPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&maxPrice, node, "long long", "");
		} else {
			
		}
	}
}

PromoOfferPromocodeParamsDTO::PromoOfferPromocodeParamsDTO(char* json)
{
	this->fromJson(json);
}

char*
PromoOfferPromocodeParamsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getMaxPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *maxPriceKey = "maxPrice";
	json_object_set_member(pJsonObject, maxPriceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
PromoOfferPromocodeParamsDTO::getMaxPrice()
{
	return maxPrice;
}

void
PromoOfferPromocodeParamsDTO::setMaxPrice(long long  maxPrice)
{
	this->maxPrice = maxPrice;
}


