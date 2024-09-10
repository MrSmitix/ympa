#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BriefOrderItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BriefOrderItemDTO::BriefOrderItemDTO()
{
	//__init();
}

BriefOrderItemDTO::~BriefOrderItemDTO()
{
	//__cleanup();
}

void
BriefOrderItemDTO::__init()
{
	//id = long(0);
	//vat = new OrderVatType();
	//count = int(0);
	//price = double(0);
	//offerName = std::string();
	//offerId = std::string();
	//new std::list()std::list> instances;
}

void
BriefOrderItemDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(vat != NULL) {
	//
	//delete vat;
	//vat = NULL;
	//}
	//if(count != NULL) {
	//
	//delete count;
	//count = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(offerName != NULL) {
	//
	//delete offerName;
	//offerName = NULL;
	//}
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(instances != NULL) {
	//instances.RemoveAll(true);
	//delete instances;
	//instances = NULL;
	//}
	//
}

void
BriefOrderItemDTO::fromJson(char* jsonStr)
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
	const gchar *vatKey = "vat";
	node = json_object_get_member(pJsonObject, vatKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderVatType")) {
			jsonToValue(&vat, node, "OrderVatType", "OrderVatType");
		} else {
			
			OrderVatType* obj = static_cast<OrderVatType*> (&vat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *countKey = "count";
	node = json_object_get_member(pJsonObject, countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&count, node, "int", "");
		} else {
			
		}
	}
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&price, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *offerNameKey = "offerName";
	node = json_object_get_member(pJsonObject, offerNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *offerIdKey = "offerId";
	node = json_object_get_member(pJsonObject, offerIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *instancesKey = "instances";
	node = json_object_get_member(pJsonObject, instancesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderItemInstanceDTO> new_list;
			OrderItemInstanceDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderItemInstanceDTO")) {
					jsonToValue(&inst, temp_json, "OrderItemInstanceDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			instances = new_list;
		}
		
	}
}

BriefOrderItemDTO::BriefOrderItemDTO(char* json)
{
	this->fromJson(json);
}

char*
BriefOrderItemDTO::toJson()
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
	if (isprimitive("OrderVatType")) {
		OrderVatType obj = getVat();
		node = converttoJson(&obj, "OrderVatType", "");
	}
	else {
		
		OrderVatType obj = static_cast<OrderVatType> (getVat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *vatKey = "vat";
	json_object_set_member(pJsonObject, vatKey, node);
	if (isprimitive("int")) {
		int obj = getCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *countKey = "count";
	json_object_set_member(pJsonObject, countKey, node);
	if (isprimitive("long long")) {
		long long obj = getPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOfferName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerNameKey = "offerName";
	json_object_set_member(pJsonObject, offerNameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOfferId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerIdKey = "offerId";
	json_object_set_member(pJsonObject, offerIdKey, node);
	if (isprimitive("OrderItemInstanceDTO")) {
		list<OrderItemInstanceDTO> new_list = static_cast<list <OrderItemInstanceDTO> > (getInstances());
		node = converttoJson(&new_list, "OrderItemInstanceDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderItemInstanceDTO> new_list = static_cast<list <OrderItemInstanceDTO> > (getInstances());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderItemInstanceDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderItemInstanceDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *instancesKey = "instances";
	json_object_set_member(pJsonObject, instancesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
BriefOrderItemDTO::getId()
{
	return id;
}

void
BriefOrderItemDTO::setId(long long  id)
{
	this->id = id;
}

OrderVatType
BriefOrderItemDTO::getVat()
{
	return vat;
}

void
BriefOrderItemDTO::setVat(OrderVatType  vat)
{
	this->vat = vat;
}

int
BriefOrderItemDTO::getCount()
{
	return count;
}

void
BriefOrderItemDTO::setCount(int  count)
{
	this->count = count;
}

long long
BriefOrderItemDTO::getPrice()
{
	return price;
}

void
BriefOrderItemDTO::setPrice(long long  price)
{
	this->price = price;
}

std::string
BriefOrderItemDTO::getOfferName()
{
	return offerName;
}

void
BriefOrderItemDTO::setOfferName(std::string  offerName)
{
	this->offerName = offerName;
}

std::string
BriefOrderItemDTO::getOfferId()
{
	return offerId;
}

void
BriefOrderItemDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::list<OrderItemInstanceDTO>
BriefOrderItemDTO::getInstances()
{
	return instances;
}

void
BriefOrderItemDTO::setInstances(std::list <OrderItemInstanceDTO> instances)
{
	this->instances = instances;
}


