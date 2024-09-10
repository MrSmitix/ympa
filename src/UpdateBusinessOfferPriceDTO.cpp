#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateBusinessOfferPriceDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateBusinessOfferPriceDTO::UpdateBusinessOfferPriceDTO()
{
	//__init();
}

UpdateBusinessOfferPriceDTO::~UpdateBusinessOfferPriceDTO()
{
	//__cleanup();
}

void
UpdateBusinessOfferPriceDTO::__init()
{
	//offerId = std::string();
	//price = new UpdatePriceWithDiscountDTO();
}

void
UpdateBusinessOfferPriceDTO::__cleanup()
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
UpdateBusinessOfferPriceDTO::fromJson(char* jsonStr)
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
	

		if (isprimitive("UpdatePriceWithDiscountDTO")) {
			jsonToValue(&price, node, "UpdatePriceWithDiscountDTO", "UpdatePriceWithDiscountDTO");
		} else {
			
			UpdatePriceWithDiscountDTO* obj = static_cast<UpdatePriceWithDiscountDTO*> (&price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdateBusinessOfferPriceDTO::UpdateBusinessOfferPriceDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateBusinessOfferPriceDTO::toJson()
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
	if (isprimitive("UpdatePriceWithDiscountDTO")) {
		UpdatePriceWithDiscountDTO obj = getPrice();
		node = converttoJson(&obj, "UpdatePriceWithDiscountDTO", "");
	}
	else {
		
		UpdatePriceWithDiscountDTO obj = static_cast<UpdatePriceWithDiscountDTO> (getPrice());
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
UpdateBusinessOfferPriceDTO::getOfferId()
{
	return offerId;
}

void
UpdateBusinessOfferPriceDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

UpdatePriceWithDiscountDTO
UpdateBusinessOfferPriceDTO::getPrice()
{
	return price;
}

void
UpdateBusinessOfferPriceDTO::setPrice(UpdatePriceWithDiscountDTO  price)
{
	this->price = price;
}


