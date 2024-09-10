#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedbackOrderDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedbackOrderDTO::FeedbackOrderDTO()
{
	//__init();
}

FeedbackOrderDTO::~FeedbackOrderDTO()
{
	//__cleanup();
}

void
FeedbackOrderDTO::__init()
{
	//shopOrderId = std::string();
	//delivery = new FeedbackDeliveryType();
}

void
FeedbackOrderDTO::__cleanup()
{
	//if(shopOrderId != NULL) {
	//
	//delete shopOrderId;
	//shopOrderId = NULL;
	//}
	//if(delivery != NULL) {
	//
	//delete delivery;
	//delivery = NULL;
	//}
	//
}

void
FeedbackOrderDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *shopOrderIdKey = "shopOrderId";
	node = json_object_get_member(pJsonObject, shopOrderIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopOrderId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *deliveryKey = "delivery";
	node = json_object_get_member(pJsonObject, deliveryKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedbackDeliveryType")) {
			jsonToValue(&delivery, node, "FeedbackDeliveryType", "FeedbackDeliveryType");
		} else {
			
			FeedbackDeliveryType* obj = static_cast<FeedbackDeliveryType*> (&delivery);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FeedbackOrderDTO::FeedbackOrderDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedbackOrderDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getShopOrderId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopOrderIdKey = "shopOrderId";
	json_object_set_member(pJsonObject, shopOrderIdKey, node);
	if (isprimitive("FeedbackDeliveryType")) {
		FeedbackDeliveryType obj = getDelivery();
		node = converttoJson(&obj, "FeedbackDeliveryType", "");
	}
	else {
		
		FeedbackDeliveryType obj = static_cast<FeedbackDeliveryType> (getDelivery());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deliveryKey = "delivery";
	json_object_set_member(pJsonObject, deliveryKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FeedbackOrderDTO::getShopOrderId()
{
	return shopOrderId;
}

void
FeedbackOrderDTO::setShopOrderId(std::string  shopOrderId)
{
	this->shopOrderId = shopOrderId;
}

FeedbackDeliveryType
FeedbackOrderDTO::getDelivery()
{
	return delivery;
}

void
FeedbackOrderDTO::setDelivery(FeedbackDeliveryType  delivery)
{
	this->delivery = delivery;
}


