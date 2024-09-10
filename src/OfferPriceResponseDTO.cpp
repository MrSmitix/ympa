#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferPriceResponseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferPriceResponseDTO::OfferPriceResponseDTO()
{
	//__init();
}

OfferPriceResponseDTO::~OfferPriceResponseDTO()
{
	//__cleanup();
}

void
OfferPriceResponseDTO::__init()
{
	//id = std::string();
	//price = new PriceDTO();
	//marketSku = long(0);
	//updatedAt = null;
}

void
OfferPriceResponseDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(marketSku != NULL) {
	//
	//delete marketSku;
	//marketSku = NULL;
	//}
	//if(updatedAt != NULL) {
	//
	//delete updatedAt;
	//updatedAt = NULL;
	//}
	//
}

void
OfferPriceResponseDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *marketSkuKey = "marketSku";
	node = json_object_get_member(pJsonObject, marketSkuKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&marketSku, node, "long long", "");
		} else {
			
		}
	}
	const gchar *updatedAtKey = "updatedAt";
	node = json_object_get_member(pJsonObject, updatedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updatedAt, node, "std::string", "");
		} else {
			
		}
	}
}

OfferPriceResponseDTO::OfferPriceResponseDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferPriceResponseDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	if (isprimitive("long long")) {
		long long obj = getMarketSku();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *marketSkuKey = "marketSku";
	json_object_set_member(pJsonObject, marketSkuKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updatedAtKey = "updatedAt";
	json_object_set_member(pJsonObject, updatedAtKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OfferPriceResponseDTO::getId()
{
	return id;
}

void
OfferPriceResponseDTO::setId(std::string  id)
{
	this->id = id;
}

PriceDTO
OfferPriceResponseDTO::getPrice()
{
	return price;
}

void
OfferPriceResponseDTO::setPrice(PriceDTO  price)
{
	this->price = price;
}

long long
OfferPriceResponseDTO::getMarketSku()
{
	return marketSku;
}

void
OfferPriceResponseDTO::setMarketSku(long long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
OfferPriceResponseDTO::getUpdatedAt()
{
	return updatedAt;
}

void
OfferPriceResponseDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}


