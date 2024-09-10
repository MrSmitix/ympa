#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdatePromoOfferDiscountParamsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdatePromoOfferDiscountParamsDTO::UpdatePromoOfferDiscountParamsDTO()
{
	//__init();
}

UpdatePromoOfferDiscountParamsDTO::~UpdatePromoOfferDiscountParamsDTO()
{
	//__cleanup();
}

void
UpdatePromoOfferDiscountParamsDTO::__init()
{
	//price = long(0);
	//promoPrice = long(0);
}

void
UpdatePromoOfferDiscountParamsDTO::__cleanup()
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
	//
}

void
UpdatePromoOfferDiscountParamsDTO::fromJson(char* jsonStr)
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
}

UpdatePromoOfferDiscountParamsDTO::UpdatePromoOfferDiscountParamsDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdatePromoOfferDiscountParamsDTO::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
UpdatePromoOfferDiscountParamsDTO::getPrice()
{
	return price;
}

void
UpdatePromoOfferDiscountParamsDTO::setPrice(long long  price)
{
	this->price = price;
}

long long
UpdatePromoOfferDiscountParamsDTO::getPromoPrice()
{
	return promoPrice;
}

void
UpdatePromoOfferDiscountParamsDTO::setPromoPrice(long long  promoPrice)
{
	this->promoPrice = promoPrice;
}


