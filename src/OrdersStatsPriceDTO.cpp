#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrdersStatsPriceDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrdersStatsPriceDTO::OrdersStatsPriceDTO()
{
	//__init();
}

OrdersStatsPriceDTO::~OrdersStatsPriceDTO()
{
	//__cleanup();
}

void
OrdersStatsPriceDTO::__init()
{
	//type = new OrdersStatsPriceType();
	//costPerItem = double(0);
	//total = double(0);
}

void
OrdersStatsPriceDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(costPerItem != NULL) {
	//
	//delete costPerItem;
	//costPerItem = NULL;
	//}
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//
}

void
OrdersStatsPriceDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrdersStatsPriceType")) {
			jsonToValue(&type, node, "OrdersStatsPriceType", "OrdersStatsPriceType");
		} else {
			
			OrdersStatsPriceType* obj = static_cast<OrdersStatsPriceType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *costPerItemKey = "costPerItem";
	node = json_object_get_member(pJsonObject, costPerItemKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&costPerItem, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&costPerItem);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&total, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&total);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrdersStatsPriceDTO::OrdersStatsPriceDTO(char* json)
{
	this->fromJson(json);
}

char*
OrdersStatsPriceDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrdersStatsPriceType")) {
		OrdersStatsPriceType obj = getType();
		node = converttoJson(&obj, "OrdersStatsPriceType", "");
	}
	else {
		
		OrdersStatsPriceType obj = static_cast<OrdersStatsPriceType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getCostPerItem();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getCostPerItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *costPerItemKey = "costPerItem";
	json_object_set_member(pJsonObject, costPerItemKey, node);
	if (isprimitive("long long")) {
		long long obj = getTotal();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTotal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrdersStatsPriceType
OrdersStatsPriceDTO::getType()
{
	return type;
}

void
OrdersStatsPriceDTO::setType(OrdersStatsPriceType  type)
{
	this->type = type;
}

long long
OrdersStatsPriceDTO::getCostPerItem()
{
	return costPerItem;
}

void
OrdersStatsPriceDTO::setCostPerItem(long long  costPerItem)
{
	this->costPerItem = costPerItem;
}

long long
OrdersStatsPriceDTO::getTotal()
{
	return total;
}

void
OrdersStatsPriceDTO::setTotal(long long  total)
{
	this->total = total;
}


