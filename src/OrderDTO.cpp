#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderDTO::OrderDTO()
{
	//__init();
}

OrderDTO::~OrderDTO()
{
	//__cleanup();
}

void
OrderDTO::__init()
{
	//id = long(0);
	//status = new OrderStatusType();
	//substatus = new OrderSubstatusType();
	//creationDate = std::string();
	//updatedAt = std::string();
	//currency = new CurrencyType();
	//itemsTotal = double(0);
	//deliveryTotal = double(0);
	//buyerItemsTotal = double(0);
	//buyerTotal = double(0);
	//buyerItemsTotalBeforeDiscount = double(0);
	//buyerTotalBeforeDiscount = double(0);
	//paymentType = new OrderPaymentType();
	//paymentMethod = new OrderPaymentMethodType();
	//fake = bool(false);
	//new std::list()std::list> items;
	//new std::list()std::list> subsidies;
	//delivery = new OrderDeliveryDTO();
	//buyer = new OrderBuyerDTO();
	//notes = std::string();
	//taxSystem = new OrderTaxSystemType();
	//cancelRequested = bool(false);
	//expiryDate = std::string();
}

void
OrderDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(substatus != NULL) {
	//
	//delete substatus;
	//substatus = NULL;
	//}
	//if(creationDate != NULL) {
	//
	//delete creationDate;
	//creationDate = NULL;
	//}
	//if(updatedAt != NULL) {
	//
	//delete updatedAt;
	//updatedAt = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(itemsTotal != NULL) {
	//
	//delete itemsTotal;
	//itemsTotal = NULL;
	//}
	//if(deliveryTotal != NULL) {
	//
	//delete deliveryTotal;
	//deliveryTotal = NULL;
	//}
	//if(buyerItemsTotal != NULL) {
	//
	//delete buyerItemsTotal;
	//buyerItemsTotal = NULL;
	//}
	//if(buyerTotal != NULL) {
	//
	//delete buyerTotal;
	//buyerTotal = NULL;
	//}
	//if(buyerItemsTotalBeforeDiscount != NULL) {
	//
	//delete buyerItemsTotalBeforeDiscount;
	//buyerItemsTotalBeforeDiscount = NULL;
	//}
	//if(buyerTotalBeforeDiscount != NULL) {
	//
	//delete buyerTotalBeforeDiscount;
	//buyerTotalBeforeDiscount = NULL;
	//}
	//if(paymentType != NULL) {
	//
	//delete paymentType;
	//paymentType = NULL;
	//}
	//if(paymentMethod != NULL) {
	//
	//delete paymentMethod;
	//paymentMethod = NULL;
	//}
	//if(fake != NULL) {
	//
	//delete fake;
	//fake = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//if(subsidies != NULL) {
	//subsidies.RemoveAll(true);
	//delete subsidies;
	//subsidies = NULL;
	//}
	//if(delivery != NULL) {
	//
	//delete delivery;
	//delivery = NULL;
	//}
	//if(buyer != NULL) {
	//
	//delete buyer;
	//buyer = NULL;
	//}
	//if(notes != NULL) {
	//
	//delete notes;
	//notes = NULL;
	//}
	//if(taxSystem != NULL) {
	//
	//delete taxSystem;
	//taxSystem = NULL;
	//}
	//if(cancelRequested != NULL) {
	//
	//delete cancelRequested;
	//cancelRequested = NULL;
	//}
	//if(expiryDate != NULL) {
	//
	//delete expiryDate;
	//expiryDate = NULL;
	//}
	//
}

void
OrderDTO::fromJson(char* jsonStr)
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderStatusType")) {
			jsonToValue(&status, node, "OrderStatusType", "OrderStatusType");
		} else {
			
			OrderStatusType* obj = static_cast<OrderStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *substatusKey = "substatus";
	node = json_object_get_member(pJsonObject, substatusKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderSubstatusType")) {
			jsonToValue(&substatus, node, "OrderSubstatusType", "OrderSubstatusType");
		} else {
			
			OrderSubstatusType* obj = static_cast<OrderSubstatusType*> (&substatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *creationDateKey = "creationDate";
	node = json_object_get_member(pJsonObject, creationDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&creationDate, node, "std::string", "");
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
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("CurrencyType")) {
			jsonToValue(&currency, node, "CurrencyType", "CurrencyType");
		} else {
			
			CurrencyType* obj = static_cast<CurrencyType*> (&currency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *itemsTotalKey = "itemsTotal";
	node = json_object_get_member(pJsonObject, itemsTotalKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&itemsTotal, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&itemsTotal);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deliveryTotalKey = "deliveryTotal";
	node = json_object_get_member(pJsonObject, deliveryTotalKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&deliveryTotal, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&deliveryTotal);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *buyerItemsTotalKey = "buyerItemsTotal";
	node = json_object_get_member(pJsonObject, buyerItemsTotalKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&buyerItemsTotal, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&buyerItemsTotal);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *buyerTotalKey = "buyerTotal";
	node = json_object_get_member(pJsonObject, buyerTotalKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&buyerTotal, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&buyerTotal);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *buyerItemsTotalBeforeDiscountKey = "buyerItemsTotalBeforeDiscount";
	node = json_object_get_member(pJsonObject, buyerItemsTotalBeforeDiscountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&buyerItemsTotalBeforeDiscount, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&buyerItemsTotalBeforeDiscount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *buyerTotalBeforeDiscountKey = "buyerTotalBeforeDiscount";
	node = json_object_get_member(pJsonObject, buyerTotalBeforeDiscountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&buyerTotalBeforeDiscount, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&buyerTotalBeforeDiscount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *paymentTypeKey = "paymentType";
	node = json_object_get_member(pJsonObject, paymentTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderPaymentType")) {
			jsonToValue(&paymentType, node, "OrderPaymentType", "OrderPaymentType");
		} else {
			
			OrderPaymentType* obj = static_cast<OrderPaymentType*> (&paymentType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *paymentMethodKey = "paymentMethod";
	node = json_object_get_member(pJsonObject, paymentMethodKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderPaymentMethodType")) {
			jsonToValue(&paymentMethod, node, "OrderPaymentMethodType", "OrderPaymentMethodType");
		} else {
			
			OrderPaymentMethodType* obj = static_cast<OrderPaymentMethodType*> (&paymentMethod);
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
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderItemDTO> new_list;
			OrderItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderItemDTO")) {
					jsonToValue(&inst, temp_json, "OrderItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
	const gchar *subsidiesKey = "subsidies";
	node = json_object_get_member(pJsonObject, subsidiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderSubsidyDTO> new_list;
			OrderSubsidyDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderSubsidyDTO")) {
					jsonToValue(&inst, temp_json, "OrderSubsidyDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			subsidies = new_list;
		}
		
	}
	const gchar *deliveryKey = "delivery";
	node = json_object_get_member(pJsonObject, deliveryKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDeliveryDTO")) {
			jsonToValue(&delivery, node, "OrderDeliveryDTO", "OrderDeliveryDTO");
		} else {
			
			OrderDeliveryDTO* obj = static_cast<OrderDeliveryDTO*> (&delivery);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *buyerKey = "buyer";
	node = json_object_get_member(pJsonObject, buyerKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderBuyerDTO")) {
			jsonToValue(&buyer, node, "OrderBuyerDTO", "OrderBuyerDTO");
		} else {
			
			OrderBuyerDTO* obj = static_cast<OrderBuyerDTO*> (&buyer);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *notesKey = "notes";
	node = json_object_get_member(pJsonObject, notesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&notes, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *taxSystemKey = "taxSystem";
	node = json_object_get_member(pJsonObject, taxSystemKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderTaxSystemType")) {
			jsonToValue(&taxSystem, node, "OrderTaxSystemType", "OrderTaxSystemType");
		} else {
			
			OrderTaxSystemType* obj = static_cast<OrderTaxSystemType*> (&taxSystem);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cancelRequestedKey = "cancelRequested";
	node = json_object_get_member(pJsonObject, cancelRequestedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&cancelRequested, node, "bool", "");
		} else {
			
		}
	}
	const gchar *expiryDateKey = "expiryDate";
	node = json_object_get_member(pJsonObject, expiryDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&expiryDate, node, "std::string", "");
		} else {
			
		}
	}
}

OrderDTO::OrderDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderDTO::toJson()
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
	if (isprimitive("OrderStatusType")) {
		OrderStatusType obj = getStatus();
		node = converttoJson(&obj, "OrderStatusType", "");
	}
	else {
		
		OrderStatusType obj = static_cast<OrderStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("OrderSubstatusType")) {
		OrderSubstatusType obj = getSubstatus();
		node = converttoJson(&obj, "OrderSubstatusType", "");
	}
	else {
		
		OrderSubstatusType obj = static_cast<OrderSubstatusType> (getSubstatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *substatusKey = "substatus";
	json_object_set_member(pJsonObject, substatusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreationDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *creationDateKey = "creationDate";
	json_object_set_member(pJsonObject, creationDateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updatedAtKey = "updatedAt";
	json_object_set_member(pJsonObject, updatedAtKey, node);
	if (isprimitive("CurrencyType")) {
		CurrencyType obj = getCurrency();
		node = converttoJson(&obj, "CurrencyType", "");
	}
	else {
		
		CurrencyType obj = static_cast<CurrencyType> (getCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("long long")) {
		long long obj = getItemsTotal();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getItemsTotal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemsTotalKey = "itemsTotal";
	json_object_set_member(pJsonObject, itemsTotalKey, node);
	if (isprimitive("long long")) {
		long long obj = getDeliveryTotal();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getDeliveryTotal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deliveryTotalKey = "deliveryTotal";
	json_object_set_member(pJsonObject, deliveryTotalKey, node);
	if (isprimitive("long long")) {
		long long obj = getBuyerItemsTotal();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBuyerItemsTotal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *buyerItemsTotalKey = "buyerItemsTotal";
	json_object_set_member(pJsonObject, buyerItemsTotalKey, node);
	if (isprimitive("long long")) {
		long long obj = getBuyerTotal();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBuyerTotal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *buyerTotalKey = "buyerTotal";
	json_object_set_member(pJsonObject, buyerTotalKey, node);
	if (isprimitive("long long")) {
		long long obj = getBuyerItemsTotalBeforeDiscount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBuyerItemsTotalBeforeDiscount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *buyerItemsTotalBeforeDiscountKey = "buyerItemsTotalBeforeDiscount";
	json_object_set_member(pJsonObject, buyerItemsTotalBeforeDiscountKey, node);
	if (isprimitive("long long")) {
		long long obj = getBuyerTotalBeforeDiscount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBuyerTotalBeforeDiscount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *buyerTotalBeforeDiscountKey = "buyerTotalBeforeDiscount";
	json_object_set_member(pJsonObject, buyerTotalBeforeDiscountKey, node);
	if (isprimitive("OrderPaymentType")) {
		OrderPaymentType obj = getPaymentType();
		node = converttoJson(&obj, "OrderPaymentType", "");
	}
	else {
		
		OrderPaymentType obj = static_cast<OrderPaymentType> (getPaymentType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *paymentTypeKey = "paymentType";
	json_object_set_member(pJsonObject, paymentTypeKey, node);
	if (isprimitive("OrderPaymentMethodType")) {
		OrderPaymentMethodType obj = getPaymentMethod();
		node = converttoJson(&obj, "OrderPaymentMethodType", "");
	}
	else {
		
		OrderPaymentMethodType obj = static_cast<OrderPaymentMethodType> (getPaymentMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *paymentMethodKey = "paymentMethod";
	json_object_set_member(pJsonObject, paymentMethodKey, node);
	if (isprimitive("bool")) {
		bool obj = getFake();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *fakeKey = "fake";
	json_object_set_member(pJsonObject, fakeKey, node);
	if (isprimitive("OrderItemDTO")) {
		list<OrderItemDTO> new_list = static_cast<list <OrderItemDTO> > (getItems());
		node = converttoJson(&new_list, "OrderItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderItemDTO> new_list = static_cast<list <OrderItemDTO> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderItemDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	if (isprimitive("OrderSubsidyDTO")) {
		list<OrderSubsidyDTO> new_list = static_cast<list <OrderSubsidyDTO> > (getSubsidies());
		node = converttoJson(&new_list, "OrderSubsidyDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderSubsidyDTO> new_list = static_cast<list <OrderSubsidyDTO> > (getSubsidies());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderSubsidyDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderSubsidyDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *subsidiesKey = "subsidies";
	json_object_set_member(pJsonObject, subsidiesKey, node);
	if (isprimitive("OrderDeliveryDTO")) {
		OrderDeliveryDTO obj = getDelivery();
		node = converttoJson(&obj, "OrderDeliveryDTO", "");
	}
	else {
		
		OrderDeliveryDTO obj = static_cast<OrderDeliveryDTO> (getDelivery());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deliveryKey = "delivery";
	json_object_set_member(pJsonObject, deliveryKey, node);
	if (isprimitive("OrderBuyerDTO")) {
		OrderBuyerDTO obj = getBuyer();
		node = converttoJson(&obj, "OrderBuyerDTO", "");
	}
	else {
		
		OrderBuyerDTO obj = static_cast<OrderBuyerDTO> (getBuyer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *buyerKey = "buyer";
	json_object_set_member(pJsonObject, buyerKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNotes();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *notesKey = "notes";
	json_object_set_member(pJsonObject, notesKey, node);
	if (isprimitive("OrderTaxSystemType")) {
		OrderTaxSystemType obj = getTaxSystem();
		node = converttoJson(&obj, "OrderTaxSystemType", "");
	}
	else {
		
		OrderTaxSystemType obj = static_cast<OrderTaxSystemType> (getTaxSystem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *taxSystemKey = "taxSystem";
	json_object_set_member(pJsonObject, taxSystemKey, node);
	if (isprimitive("bool")) {
		bool obj = getCancelRequested();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *cancelRequestedKey = "cancelRequested";
	json_object_set_member(pJsonObject, cancelRequestedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExpiryDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *expiryDateKey = "expiryDate";
	json_object_set_member(pJsonObject, expiryDateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrderDTO::getId()
{
	return id;
}

void
OrderDTO::setId(long long  id)
{
	this->id = id;
}

OrderStatusType
OrderDTO::getStatus()
{
	return status;
}

void
OrderDTO::setStatus(OrderStatusType  status)
{
	this->status = status;
}

OrderSubstatusType
OrderDTO::getSubstatus()
{
	return substatus;
}

void
OrderDTO::setSubstatus(OrderSubstatusType  substatus)
{
	this->substatus = substatus;
}

std::string
OrderDTO::getCreationDate()
{
	return creationDate;
}

void
OrderDTO::setCreationDate(std::string  creationDate)
{
	this->creationDate = creationDate;
}

std::string
OrderDTO::getUpdatedAt()
{
	return updatedAt;
}

void
OrderDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}

CurrencyType
OrderDTO::getCurrency()
{
	return currency;
}

void
OrderDTO::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}

long long
OrderDTO::getItemsTotal()
{
	return itemsTotal;
}

void
OrderDTO::setItemsTotal(long long  itemsTotal)
{
	this->itemsTotal = itemsTotal;
}

long long
OrderDTO::getDeliveryTotal()
{
	return deliveryTotal;
}

void
OrderDTO::setDeliveryTotal(long long  deliveryTotal)
{
	this->deliveryTotal = deliveryTotal;
}

long long
OrderDTO::getBuyerItemsTotal()
{
	return buyerItemsTotal;
}

void
OrderDTO::setBuyerItemsTotal(long long  buyerItemsTotal)
{
	this->buyerItemsTotal = buyerItemsTotal;
}

long long
OrderDTO::getBuyerTotal()
{
	return buyerTotal;
}

void
OrderDTO::setBuyerTotal(long long  buyerTotal)
{
	this->buyerTotal = buyerTotal;
}

long long
OrderDTO::getBuyerItemsTotalBeforeDiscount()
{
	return buyerItemsTotalBeforeDiscount;
}

void
OrderDTO::setBuyerItemsTotalBeforeDiscount(long long  buyerItemsTotalBeforeDiscount)
{
	this->buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
}

long long
OrderDTO::getBuyerTotalBeforeDiscount()
{
	return buyerTotalBeforeDiscount;
}

void
OrderDTO::setBuyerTotalBeforeDiscount(long long  buyerTotalBeforeDiscount)
{
	this->buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
}

OrderPaymentType
OrderDTO::getPaymentType()
{
	return paymentType;
}

void
OrderDTO::setPaymentType(OrderPaymentType  paymentType)
{
	this->paymentType = paymentType;
}

OrderPaymentMethodType
OrderDTO::getPaymentMethod()
{
	return paymentMethod;
}

void
OrderDTO::setPaymentMethod(OrderPaymentMethodType  paymentMethod)
{
	this->paymentMethod = paymentMethod;
}

bool
OrderDTO::getFake()
{
	return fake;
}

void
OrderDTO::setFake(bool  fake)
{
	this->fake = fake;
}

std::list<OrderItemDTO>
OrderDTO::getItems()
{
	return items;
}

void
OrderDTO::setItems(std::list <OrderItemDTO> items)
{
	this->items = items;
}

std::list<OrderSubsidyDTO>
OrderDTO::getSubsidies()
{
	return subsidies;
}

void
OrderDTO::setSubsidies(std::list <OrderSubsidyDTO> subsidies)
{
	this->subsidies = subsidies;
}

OrderDeliveryDTO
OrderDTO::getDelivery()
{
	return delivery;
}

void
OrderDTO::setDelivery(OrderDeliveryDTO  delivery)
{
	this->delivery = delivery;
}

OrderBuyerDTO
OrderDTO::getBuyer()
{
	return buyer;
}

void
OrderDTO::setBuyer(OrderBuyerDTO  buyer)
{
	this->buyer = buyer;
}

std::string
OrderDTO::getNotes()
{
	return notes;
}

void
OrderDTO::setNotes(std::string  notes)
{
	this->notes = notes;
}

OrderTaxSystemType
OrderDTO::getTaxSystem()
{
	return taxSystem;
}

void
OrderDTO::setTaxSystem(OrderTaxSystemType  taxSystem)
{
	this->taxSystem = taxSystem;
}

bool
OrderDTO::getCancelRequested()
{
	return cancelRequested;
}

void
OrderDTO::setCancelRequested(bool  cancelRequested)
{
	this->cancelRequested = cancelRequested;
}

std::string
OrderDTO::getExpiryDate()
{
	return expiryDate;
}

void
OrderDTO::setExpiryDate(std::string  expiryDate)
{
	this->expiryDate = expiryDate;
}


