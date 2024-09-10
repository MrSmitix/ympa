#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PromoOfferDiscountParamsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PromoOfferDiscountParamsDTO::PromoOfferDiscountParamsDTO()
{
	//__init();
}

PromoOfferDiscountParamsDTO::~PromoOfferDiscountParamsDTO()
{
	//__cleanup();
}

void
PromoOfferDiscountParamsDTO::__init()
{
	//price = long(0);
	//promoPrice = long(0);
	//maxPromoPrice = long(0);
}

void
PromoOfferDiscountParamsDTO::__cleanup()
{
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(promoPrice != NULL) {
	//
	//delete promoPrice;
	//promoPrice = NULL;
	//}
	//if(maxPromoPrice != NULL) {
	//
	//delete maxPromoPrice;
	//maxPromoPrice = NULL;
	//}
	//
}

void
PromoOfferDiscountParamsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&price, node, "long long", "");
		} else {
			
		}
	}
	const gchar *promoPriceKey = "promoPrice";
	node = json_object_get_member(pJsonObject, promoPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&promoPrice, node, "long long", "");
		} else {
			
		}
	}
	const gchar *maxPromoPriceKey = "maxPromoPrice";
	node = json_object_get_member(pJsonObject, maxPromoPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&maxPromoPrice, node, "long long", "");
		} else {
			
		}
	}
}

PromoOfferDiscountParamsDTO::PromoOfferDiscountParamsDTO(char* json)
{
	this->fromJson(json);
}

char*
PromoOfferDiscountParamsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	if (isprimitive("long long")) {
		long long obj = getPromoPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *promoPriceKey = "promoPrice";
	json_object_set_member(pJsonObject, promoPriceKey, node);
	if (isprimitive("long long")) {
		long long obj = getMaxPromoPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *maxPromoPriceKey = "maxPromoPrice";
	json_object_set_member(pJsonObject, maxPromoPriceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
PromoOfferDiscountParamsDTO::getPrice()
{
	return price;
}

void
PromoOfferDiscountParamsDTO::setPrice(long long  price)
{
	this->price = price;
}

long long
PromoOfferDiscountParamsDTO::getPromoPrice()
{
	return promoPrice;
}

void
PromoOfferDiscountParamsDTO::setPromoPrice(long long  promoPrice)
{
	this->promoPrice = promoPrice;
}

long long
PromoOfferDiscountParamsDTO::getMaxPromoPrice()
{
	return maxPromoPrice;
}

void
PromoOfferDiscountParamsDTO::setMaxPromoPrice(long long  maxPromoPrice)
{
	this->maxPromoPrice = maxPromoPrice;
}


