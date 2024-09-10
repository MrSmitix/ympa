#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ParcelBoxLabelDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ParcelBoxLabelDTO::ParcelBoxLabelDTO()
{
	//__init();
}

ParcelBoxLabelDTO::~ParcelBoxLabelDTO()
{
	//__cleanup();
}

void
ParcelBoxLabelDTO::__init()
{
	//url = std::string();
	//supplierName = std::string();
	//deliveryServiceName = std::string();
	//orderId = long(0);
	//orderNum = std::string();
	//recipientName = std::string();
	//boxId = long(0);
	//fulfilmentId = std::string();
	//place = std::string();
	//weight = std::string();
	//deliveryServiceId = std::string();
	//deliveryAddress = std::string();
	//shipmentDate = std::string();
}

void
ParcelBoxLabelDTO::__cleanup()
{
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(supplierName != NULL) {
	//
	//delete supplierName;
	//supplierName = NULL;
	//}
	//if(deliveryServiceName != NULL) {
	//
	//delete deliveryServiceName;
	//deliveryServiceName = NULL;
	//}
	//if(orderId != NULL) {
	//
	//delete orderId;
	//orderId = NULL;
	//}
	//if(orderNum != NULL) {
	//
	//delete orderNum;
	//orderNum = NULL;
	//}
	//if(recipientName != NULL) {
	//
	//delete recipientName;
	//recipientName = NULL;
	//}
	//if(boxId != NULL) {
	//
	//delete boxId;
	//boxId = NULL;
	//}
	//if(fulfilmentId != NULL) {
	//
	//delete fulfilmentId;
	//fulfilmentId = NULL;
	//}
	//if(place != NULL) {
	//
	//delete place;
	//place = NULL;
	//}
	//if(weight != NULL) {
	//
	//delete weight;
	//weight = NULL;
	//}
	//if(deliveryServiceId != NULL) {
	//
	//delete deliveryServiceId;
	//deliveryServiceId = NULL;
	//}
	//if(deliveryAddress != NULL) {
	//
	//delete deliveryAddress;
	//deliveryAddress = NULL;
	//}
	//if(shipmentDate != NULL) {
	//
	//delete shipmentDate;
	//shipmentDate = NULL;
	//}
	//
}

void
ParcelBoxLabelDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *supplierNameKey = "supplierName";
	node = json_object_get_member(pJsonObject, supplierNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&supplierName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *deliveryServiceNameKey = "deliveryServiceName";
	node = json_object_get_member(pJsonObject, deliveryServiceNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&deliveryServiceName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *orderIdKey = "orderId";
	node = json_object_get_member(pJsonObject, orderIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&orderId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *orderNumKey = "orderNum";
	node = json_object_get_member(pJsonObject, orderNumKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&orderNum, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *recipientNameKey = "recipientName";
	node = json_object_get_member(pJsonObject, recipientNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&recipientName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *boxIdKey = "boxId";
	node = json_object_get_member(pJsonObject, boxIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&boxId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *fulfilmentIdKey = "fulfilmentId";
	node = json_object_get_member(pJsonObject, fulfilmentIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fulfilmentId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *placeKey = "place";
	node = json_object_get_member(pJsonObject, placeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&place, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *weightKey = "weight";
	node = json_object_get_member(pJsonObject, weightKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&weight, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *deliveryServiceIdKey = "deliveryServiceId";
	node = json_object_get_member(pJsonObject, deliveryServiceIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&deliveryServiceId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *deliveryAddressKey = "deliveryAddress";
	node = json_object_get_member(pJsonObject, deliveryAddressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&deliveryAddress, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *shipmentDateKey = "shipmentDate";
	node = json_object_get_member(pJsonObject, shipmentDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shipmentDate, node, "std::string", "");
		} else {
			
		}
	}
}

ParcelBoxLabelDTO::ParcelBoxLabelDTO(char* json)
{
	this->fromJson(json);
}

char*
ParcelBoxLabelDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSupplierName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *supplierNameKey = "supplierName";
	json_object_set_member(pJsonObject, supplierNameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDeliveryServiceName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *deliveryServiceNameKey = "deliveryServiceName";
	json_object_set_member(pJsonObject, deliveryServiceNameKey, node);
	if (isprimitive("long long")) {
		long long obj = getOrderId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *orderIdKey = "orderId";
	json_object_set_member(pJsonObject, orderIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrderNum();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *orderNumKey = "orderNum";
	json_object_set_member(pJsonObject, orderNumKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRecipientName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *recipientNameKey = "recipientName";
	json_object_set_member(pJsonObject, recipientNameKey, node);
	if (isprimitive("long long")) {
		long long obj = getBoxId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *boxIdKey = "boxId";
	json_object_set_member(pJsonObject, boxIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFulfilmentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fulfilmentIdKey = "fulfilmentId";
	json_object_set_member(pJsonObject, fulfilmentIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPlace();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *placeKey = "place";
	json_object_set_member(pJsonObject, placeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getWeight();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *weightKey = "weight";
	json_object_set_member(pJsonObject, weightKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDeliveryServiceId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *deliveryServiceIdKey = "deliveryServiceId";
	json_object_set_member(pJsonObject, deliveryServiceIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDeliveryAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *deliveryAddressKey = "deliveryAddress";
	json_object_set_member(pJsonObject, deliveryAddressKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShipmentDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shipmentDateKey = "shipmentDate";
	json_object_set_member(pJsonObject, shipmentDateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ParcelBoxLabelDTO::getUrl()
{
	return url;
}

void
ParcelBoxLabelDTO::setUrl(std::string  url)
{
	this->url = url;
}

std::string
ParcelBoxLabelDTO::getSupplierName()
{
	return supplierName;
}

void
ParcelBoxLabelDTO::setSupplierName(std::string  supplierName)
{
	this->supplierName = supplierName;
}

std::string
ParcelBoxLabelDTO::getDeliveryServiceName()
{
	return deliveryServiceName;
}

void
ParcelBoxLabelDTO::setDeliveryServiceName(std::string  deliveryServiceName)
{
	this->deliveryServiceName = deliveryServiceName;
}

long long
ParcelBoxLabelDTO::getOrderId()
{
	return orderId;
}

void
ParcelBoxLabelDTO::setOrderId(long long  orderId)
{
	this->orderId = orderId;
}

std::string
ParcelBoxLabelDTO::getOrderNum()
{
	return orderNum;
}

void
ParcelBoxLabelDTO::setOrderNum(std::string  orderNum)
{
	this->orderNum = orderNum;
}

std::string
ParcelBoxLabelDTO::getRecipientName()
{
	return recipientName;
}

void
ParcelBoxLabelDTO::setRecipientName(std::string  recipientName)
{
	this->recipientName = recipientName;
}

long long
ParcelBoxLabelDTO::getBoxId()
{
	return boxId;
}

void
ParcelBoxLabelDTO::setBoxId(long long  boxId)
{
	this->boxId = boxId;
}

std::string
ParcelBoxLabelDTO::getFulfilmentId()
{
	return fulfilmentId;
}

void
ParcelBoxLabelDTO::setFulfilmentId(std::string  fulfilmentId)
{
	this->fulfilmentId = fulfilmentId;
}

std::string
ParcelBoxLabelDTO::getPlace()
{
	return place;
}

void
ParcelBoxLabelDTO::setPlace(std::string  place)
{
	this->place = place;
}

std::string
ParcelBoxLabelDTO::getWeight()
{
	return weight;
}

void
ParcelBoxLabelDTO::setWeight(std::string  weight)
{
	this->weight = weight;
}

std::string
ParcelBoxLabelDTO::getDeliveryServiceId()
{
	return deliveryServiceId;
}

void
ParcelBoxLabelDTO::setDeliveryServiceId(std::string  deliveryServiceId)
{
	this->deliveryServiceId = deliveryServiceId;
}

std::string
ParcelBoxLabelDTO::getDeliveryAddress()
{
	return deliveryAddress;
}

void
ParcelBoxLabelDTO::setDeliveryAddress(std::string  deliveryAddress)
{
	this->deliveryAddress = deliveryAddress;
}

std::string
ParcelBoxLabelDTO::getShipmentDate()
{
	return shipmentDate;
}

void
ParcelBoxLabelDTO::setShipmentDate(std::string  shipmentDate)
{
	this->shipmentDate = shipmentDate;
}


