#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OutletDeliveryRuleDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OutletDeliveryRuleDTO::OutletDeliveryRuleDTO()
{
	//__init();
}

OutletDeliveryRuleDTO::~OutletDeliveryRuleDTO()
{
	//__cleanup();
}

void
OutletDeliveryRuleDTO::__init()
{
	//minDeliveryDays = int(0);
	//maxDeliveryDays = int(0);
	//deliveryServiceId = long(0);
	//orderBefore = int(0);
	//priceFreePickup = double(0);
	//unspecifiedDeliveryInterval = bool(false);
}

void
OutletDeliveryRuleDTO::__cleanup()
{
	//if(minDeliveryDays != NULL) {
	//
	//delete minDeliveryDays;
	//minDeliveryDays = NULL;
	//}
	//if(maxDeliveryDays != NULL) {
	//
	//delete maxDeliveryDays;
	//maxDeliveryDays = NULL;
	//}
	//if(deliveryServiceId != NULL) {
	//
	//delete deliveryServiceId;
	//deliveryServiceId = NULL;
	//}
	//if(orderBefore != NULL) {
	//
	//delete orderBefore;
	//orderBefore = NULL;
	//}
	//if(priceFreePickup != NULL) {
	//
	//delete priceFreePickup;
	//priceFreePickup = NULL;
	//}
	//if(unspecifiedDeliveryInterval != NULL) {
	//
	//delete unspecifiedDeliveryInterval;
	//unspecifiedDeliveryInterval = NULL;
	//}
	//
}

void
OutletDeliveryRuleDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *minDeliveryDaysKey = "minDeliveryDays";
	node = json_object_get_member(pJsonObject, minDeliveryDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&minDeliveryDays, node, "int", "");
		} else {
			
		}
	}
	const gchar *maxDeliveryDaysKey = "maxDeliveryDays";
	node = json_object_get_member(pJsonObject, maxDeliveryDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&maxDeliveryDays, node, "int", "");
		} else {
			
		}
	}
	const gchar *deliveryServiceIdKey = "deliveryServiceId";
	node = json_object_get_member(pJsonObject, deliveryServiceIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&deliveryServiceId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *orderBeforeKey = "orderBefore";
	node = json_object_get_member(pJsonObject, orderBeforeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&orderBefore, node, "int", "");
		} else {
			
		}
	}
	const gchar *priceFreePickupKey = "priceFreePickup";
	node = json_object_get_member(pJsonObject, priceFreePickupKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&priceFreePickup, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&priceFreePickup);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *unspecifiedDeliveryIntervalKey = "unspecifiedDeliveryInterval";
	node = json_object_get_member(pJsonObject, unspecifiedDeliveryIntervalKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&unspecifiedDeliveryInterval, node, "bool", "");
		} else {
			
		}
	}
}

OutletDeliveryRuleDTO::OutletDeliveryRuleDTO(char* json)
{
	this->fromJson(json);
}

char*
OutletDeliveryRuleDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getMinDeliveryDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *minDeliveryDaysKey = "minDeliveryDays";
	json_object_set_member(pJsonObject, minDeliveryDaysKey, node);
	if (isprimitive("int")) {
		int obj = getMaxDeliveryDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *maxDeliveryDaysKey = "maxDeliveryDays";
	json_object_set_member(pJsonObject, maxDeliveryDaysKey, node);
	if (isprimitive("long long")) {
		long long obj = getDeliveryServiceId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *deliveryServiceIdKey = "deliveryServiceId";
	json_object_set_member(pJsonObject, deliveryServiceIdKey, node);
	if (isprimitive("int")) {
		int obj = getOrderBefore();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *orderBeforeKey = "orderBefore";
	json_object_set_member(pJsonObject, orderBeforeKey, node);
	if (isprimitive("long long")) {
		long long obj = getPriceFreePickup();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPriceFreePickup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceFreePickupKey = "priceFreePickup";
	json_object_set_member(pJsonObject, priceFreePickupKey, node);
	if (isprimitive("bool")) {
		bool obj = getUnspecifiedDeliveryInterval();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *unspecifiedDeliveryIntervalKey = "unspecifiedDeliveryInterval";
	json_object_set_member(pJsonObject, unspecifiedDeliveryIntervalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
OutletDeliveryRuleDTO::getMinDeliveryDays()
{
	return minDeliveryDays;
}

void
OutletDeliveryRuleDTO::setMinDeliveryDays(int  minDeliveryDays)
{
	this->minDeliveryDays = minDeliveryDays;
}

int
OutletDeliveryRuleDTO::getMaxDeliveryDays()
{
	return maxDeliveryDays;
}

void
OutletDeliveryRuleDTO::setMaxDeliveryDays(int  maxDeliveryDays)
{
	this->maxDeliveryDays = maxDeliveryDays;
}

long long
OutletDeliveryRuleDTO::getDeliveryServiceId()
{
	return deliveryServiceId;
}

void
OutletDeliveryRuleDTO::setDeliveryServiceId(long long  deliveryServiceId)
{
	this->deliveryServiceId = deliveryServiceId;
}

int
OutletDeliveryRuleDTO::getOrderBefore()
{
	return orderBefore;
}

void
OutletDeliveryRuleDTO::setOrderBefore(int  orderBefore)
{
	this->orderBefore = orderBefore;
}

long long
OutletDeliveryRuleDTO::getPriceFreePickup()
{
	return priceFreePickup;
}

void
OutletDeliveryRuleDTO::setPriceFreePickup(long long  priceFreePickup)
{
	this->priceFreePickup = priceFreePickup;
}

bool
OutletDeliveryRuleDTO::getUnspecifiedDeliveryInterval()
{
	return unspecifiedDeliveryInterval;
}

void
OutletDeliveryRuleDTO::setUnspecifiedDeliveryInterval(bool  unspecifiedDeliveryInterval)
{
	this->unspecifiedDeliveryInterval = unspecifiedDeliveryInterval;
}


