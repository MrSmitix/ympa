#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrdersStatsOrderDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrdersStatsOrderDTO::OrdersStatsOrderDTO()
{
	//__init();
}

OrdersStatsOrderDTO::~OrdersStatsOrderDTO()
{
	//__cleanup();
}

void
OrdersStatsOrderDTO::__init()
{
	//id = long(0);
	//creationDate = null;
	//statusUpdateDate = null;
	//status = new OrderStatsStatusType();
	//partnerOrderId = std::string();
	//paymentType = new OrdersStatsOrderPaymentType();
	//fake = bool(false);
	//deliveryRegion = new OrdersStatsDeliveryRegionDTO();
	//new std::list()std::list> items;
	//new std::list()std::list> initialItems;
	//new std::list()std::list> payments;
	//new std::list()std::list> commissions;
}

void
OrdersStatsOrderDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(creationDate != NULL) {
	//
	//delete creationDate;
	//creationDate = NULL;
	//}
	//if(statusUpdateDate != NULL) {
	//
	//delete statusUpdateDate;
	//statusUpdateDate = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(partnerOrderId != NULL) {
	//
	//delete partnerOrderId;
	//partnerOrderId = NULL;
	//}
	//if(paymentType != NULL) {
	//
	//delete paymentType;
	//paymentType = NULL;
	//}
	//if(fake != NULL) {
	//
	//delete fake;
	//fake = NULL;
	//}
	//if(deliveryRegion != NULL) {
	//
	//delete deliveryRegion;
	//deliveryRegion = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//if(initialItems != NULL) {
	//initialItems.RemoveAll(true);
	//delete initialItems;
	//initialItems = NULL;
	//}
	//if(payments != NULL) {
	//payments.RemoveAll(true);
	//delete payments;
	//payments = NULL;
	//}
	//if(commissions != NULL) {
	//commissions.RemoveAll(true);
	//delete commissions;
	//commissions = NULL;
	//}
	//
}

void
OrdersStatsOrderDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *creationDateKey = "creationDate";
	node = json_object_get_member(pJsonObject, creationDateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&creationDate, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *statusUpdateDateKey = "statusUpdateDate";
	node = json_object_get_member(pJsonObject, statusUpdateDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&statusUpdateDate, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderStatsStatusType")) {
			jsonToValue(&status, node, "OrderStatsStatusType", "OrderStatsStatusType");
		} else {
			
			OrderStatsStatusType* obj = static_cast<OrderStatsStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *partnerOrderIdKey = "partnerOrderId";
	node = json_object_get_member(pJsonObject, partnerOrderIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partnerOrderId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *paymentTypeKey = "paymentType";
	node = json_object_get_member(pJsonObject, paymentTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrdersStatsOrderPaymentType")) {
			jsonToValue(&paymentType, node, "OrdersStatsOrderPaymentType", "OrdersStatsOrderPaymentType");
		} else {
			
			OrdersStatsOrderPaymentType* obj = static_cast<OrdersStatsOrderPaymentType*> (&paymentType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fakeKey = "fake";
	node = json_object_get_member(pJsonObject, fakeKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&fake, node, "bool", "");
		} else {
			
		}
	}
	const gchar *deliveryRegionKey = "deliveryRegion";
	node = json_object_get_member(pJsonObject, deliveryRegionKey);
	if (node !=NULL) {
	

		if (isprimitive("OrdersStatsDeliveryRegionDTO")) {
			jsonToValue(&deliveryRegion, node, "OrdersStatsDeliveryRegionDTO", "OrdersStatsDeliveryRegionDTO");
		} else {
			
			OrdersStatsDeliveryRegionDTO* obj = static_cast<OrdersStatsDeliveryRegionDTO*> (&deliveryRegion);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrdersStatsItemDTO> new_list;
			OrdersStatsItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrdersStatsItemDTO")) {
					jsonToValue(&inst, temp_json, "OrdersStatsItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
	const gchar *initialItemsKey = "initialItems";
	node = json_object_get_member(pJsonObject, initialItemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrdersStatsItemDTO> new_list;
			OrdersStatsItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrdersStatsItemDTO")) {
					jsonToValue(&inst, temp_json, "OrdersStatsItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			initialItems = new_list;
		}
		
	}
	const gchar *paymentsKey = "payments";
	node = json_object_get_member(pJsonObject, paymentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrdersStatsPaymentDTO> new_list;
			OrdersStatsPaymentDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrdersStatsPaymentDTO")) {
					jsonToValue(&inst, temp_json, "OrdersStatsPaymentDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			payments = new_list;
		}
		
	}
	const gchar *commissionsKey = "commissions";
	node = json_object_get_member(pJsonObject, commissionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrdersStatsCommissionDTO> new_list;
			OrdersStatsCommissionDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrdersStatsCommissionDTO")) {
					jsonToValue(&inst, temp_json, "OrdersStatsCommissionDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			commissions = new_list;
		}
		
	}
}

OrdersStatsOrderDTO::OrdersStatsOrderDTO(char* json)
{
	this->fromJson(json);
}

char*
OrdersStatsOrderDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("Date")) {
		Date obj = getCreationDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *creationDateKey = "creationDate";
	json_object_set_member(pJsonObject, creationDateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatusUpdateDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusUpdateDateKey = "statusUpdateDate";
	json_object_set_member(pJsonObject, statusUpdateDateKey, node);
	if (isprimitive("OrderStatsStatusType")) {
		OrderStatsStatusType obj = getStatus();
		node = converttoJson(&obj, "OrderStatsStatusType", "");
	}
	else {
		
		OrderStatsStatusType obj = static_cast<OrderStatsStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerOrderId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partnerOrderIdKey = "partnerOrderId";
	json_object_set_member(pJsonObject, partnerOrderIdKey, node);
	if (isprimitive("OrdersStatsOrderPaymentType")) {
		OrdersStatsOrderPaymentType obj = getPaymentType();
		node = converttoJson(&obj, "OrdersStatsOrderPaymentType", "");
	}
	else {
		
		OrdersStatsOrderPaymentType obj = static_cast<OrdersStatsOrderPaymentType> (getPaymentType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *paymentTypeKey = "paymentType";
	json_object_set_member(pJsonObject, paymentTypeKey, node);
	if (isprimitive("bool")) {
		bool obj = getFake();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *fakeKey = "fake";
	json_object_set_member(pJsonObject, fakeKey, node);
	if (isprimitive("OrdersStatsDeliveryRegionDTO")) {
		OrdersStatsDeliveryRegionDTO obj = getDeliveryRegion();
		node = converttoJson(&obj, "OrdersStatsDeliveryRegionDTO", "");
	}
	else {
		
		OrdersStatsDeliveryRegionDTO obj = static_cast<OrdersStatsDeliveryRegionDTO> (getDeliveryRegion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deliveryRegionKey = "deliveryRegion";
	json_object_set_member(pJsonObject, deliveryRegionKey, node);
	if (isprimitive("OrdersStatsItemDTO")) {
		list<OrdersStatsItemDTO> new_list = static_cast<list <OrdersStatsItemDTO> > (getItems());
		node = converttoJson(&new_list, "OrdersStatsItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrdersStatsItemDTO> new_list = static_cast<list <OrdersStatsItemDTO> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrdersStatsItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrdersStatsItemDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	if (isprimitive("OrdersStatsItemDTO")) {
		list<OrdersStatsItemDTO> new_list = static_cast<list <OrdersStatsItemDTO> > (getInitialItems());
		node = converttoJson(&new_list, "OrdersStatsItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrdersStatsItemDTO> new_list = static_cast<list <OrdersStatsItemDTO> > (getInitialItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrdersStatsItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrdersStatsItemDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *initialItemsKey = "initialItems";
	json_object_set_member(pJsonObject, initialItemsKey, node);
	if (isprimitive("OrdersStatsPaymentDTO")) {
		list<OrdersStatsPaymentDTO> new_list = static_cast<list <OrdersStatsPaymentDTO> > (getPayments());
		node = converttoJson(&new_list, "OrdersStatsPaymentDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrdersStatsPaymentDTO> new_list = static_cast<list <OrdersStatsPaymentDTO> > (getPayments());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrdersStatsPaymentDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrdersStatsPaymentDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *paymentsKey = "payments";
	json_object_set_member(pJsonObject, paymentsKey, node);
	if (isprimitive("OrdersStatsCommissionDTO")) {
		list<OrdersStatsCommissionDTO> new_list = static_cast<list <OrdersStatsCommissionDTO> > (getCommissions());
		node = converttoJson(&new_list, "OrdersStatsCommissionDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrdersStatsCommissionDTO> new_list = static_cast<list <OrdersStatsCommissionDTO> > (getCommissions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrdersStatsCommissionDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrdersStatsCommissionDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *commissionsKey = "commissions";
	json_object_set_member(pJsonObject, commissionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrdersStatsOrderDTO::getId()
{
	return id;
}

void
OrdersStatsOrderDTO::setId(long long  id)
{
	this->id = id;
}

Date
OrdersStatsOrderDTO::getCreationDate()
{
	return creationDate;
}

void
OrdersStatsOrderDTO::setCreationDate(Date  creationDate)
{
	this->creationDate = creationDate;
}

std::string
OrdersStatsOrderDTO::getStatusUpdateDate()
{
	return statusUpdateDate;
}

void
OrdersStatsOrderDTO::setStatusUpdateDate(std::string  statusUpdateDate)
{
	this->statusUpdateDate = statusUpdateDate;
}

OrderStatsStatusType
OrdersStatsOrderDTO::getStatus()
{
	return status;
}

void
OrdersStatsOrderDTO::setStatus(OrderStatsStatusType  status)
{
	this->status = status;
}

std::string
OrdersStatsOrderDTO::getPartnerOrderId()
{
	return partnerOrderId;
}

void
OrdersStatsOrderDTO::setPartnerOrderId(std::string  partnerOrderId)
{
	this->partnerOrderId = partnerOrderId;
}

OrdersStatsOrderPaymentType
OrdersStatsOrderDTO::getPaymentType()
{
	return paymentType;
}

void
OrdersStatsOrderDTO::setPaymentType(OrdersStatsOrderPaymentType  paymentType)
{
	this->paymentType = paymentType;
}

bool
OrdersStatsOrderDTO::getFake()
{
	return fake;
}

void
OrdersStatsOrderDTO::setFake(bool  fake)
{
	this->fake = fake;
}

OrdersStatsDeliveryRegionDTO
OrdersStatsOrderDTO::getDeliveryRegion()
{
	return deliveryRegion;
}

void
OrdersStatsOrderDTO::setDeliveryRegion(OrdersStatsDeliveryRegionDTO  deliveryRegion)
{
	this->deliveryRegion = deliveryRegion;
}

std::list<OrdersStatsItemDTO>
OrdersStatsOrderDTO::getItems()
{
	return items;
}

void
OrdersStatsOrderDTO::setItems(std::list <OrdersStatsItemDTO> items)
{
	this->items = items;
}

std::list<OrdersStatsItemDTO>
OrdersStatsOrderDTO::getInitialItems()
{
	return initialItems;
}

void
OrdersStatsOrderDTO::setInitialItems(std::list <OrdersStatsItemDTO> initialItems)
{
	this->initialItems = initialItems;
}

std::list<OrdersStatsPaymentDTO>
OrdersStatsOrderDTO::getPayments()
{
	return payments;
}

void
OrdersStatsOrderDTO::setPayments(std::list <OrdersStatsPaymentDTO> payments)
{
	this->payments = payments;
}

std::list<OrdersStatsCommissionDTO>
OrdersStatsOrderDTO::getCommissions()
{
	return commissions;
}

void
OrdersStatsOrderDTO::setCommissions(std::list <OrdersStatsCommissionDTO> commissions)
{
	this->commissions = commissions;
}


