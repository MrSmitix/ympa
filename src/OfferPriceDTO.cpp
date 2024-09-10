#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferPriceDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferPriceDTO::OfferPriceDTO()
{
	//__init();
}

OfferPriceDTO::~OfferPriceDTO()
{
	//__cleanup();
}

void
OfferPriceDTO::__init()
{
	//offerId = std::string();
	//price = new PriceDTO();
}

void
OfferPriceDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//
}

void
OfferPriceDTO::fromJson(char* jsonStr)
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
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("PriceDTO")) {
			jsonToValue(&price, node, "PriceDTO", "PriceDTO");
		} else {
			
			PriceDTO* obj = static_cast<PriceDTO*> (&price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OfferPriceDTO::OfferPriceDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferPriceDTO::toJson()
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
	if (isprimitive("PriceDTO")) {
		PriceDTO obj = getPrice();
		node = converttoJson(&obj, "PriceDTO", "");
	}
	else {
		
		PriceDTO obj = static_cast<PriceDTO> (getPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OfferPriceDTO::getOfferId()
{
	return offerId;
}

void
OfferPriceDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

PriceDTO
OfferPriceDTO::getPrice()
{
	return price;
}

void
OfferPriceDTO::setPrice(PriceDTO  price)
{
	this->price = price;
}


