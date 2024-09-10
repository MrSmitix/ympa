#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderItemPromoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderItemPromoDTO::OrderItemPromoDTO()
{
	//__init();
}

OrderItemPromoDTO::~OrderItemPromoDTO()
{
	//__cleanup();
}

void
OrderItemPromoDTO::__init()
{
	//type = new OrderPromoType();
	//discount = double(0);
	//subsidy = double(0);
	//shopPromoId = std::string();
	//marketPromoId = std::string();
}

void
OrderItemPromoDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(discount != NULL) {
	//
	//delete discount;
	//discount = NULL;
	//}
	//if(subsidy != NULL) {
	//
	//delete subsidy;
	//subsidy = NULL;
	//}
	//if(shopPromoId != NULL) {
	//
	//delete shopPromoId;
	//shopPromoId = NULL;
	//}
	//if(marketPromoId != NULL) {
	//
	//delete marketPromoId;
	//marketPromoId = NULL;
	//}
	//
}

void
OrderItemPromoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderPromoType")) {
			jsonToValue(&type, node, "OrderPromoType", "OrderPromoType");
		} else {
			
			OrderPromoType* obj = static_cast<OrderPromoType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *discountKey = "discount";
	node = json_object_get_member(pJsonObject, discountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&discount, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&discount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *subsidyKey = "subsidy";
	node = json_object_get_member(pJsonObject, subsidyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&subsidy, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&subsidy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *shopPromoIdKey = "shopPromoId";
	node = json_object_get_member(pJsonObject, shopPromoIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopPromoId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *marketPromoIdKey = "marketPromoId";
	node = json_object_get_member(pJsonObject, marketPromoIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&marketPromoId, node, "std::string", "");
		} else {
			
		}
	}
}

OrderItemPromoDTO::OrderItemPromoDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderItemPromoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderPromoType")) {
		OrderPromoType obj = getType();
		node = converttoJson(&obj, "OrderPromoType", "");
	}
	else {
		
		OrderPromoType obj = static_cast<OrderPromoType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getDiscount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getDiscount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *discountKey = "discount";
	json_object_set_member(pJsonObject, discountKey, node);
	if (isprimitive("long long")) {
		long long obj = getSubsidy();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSubsidy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *subsidyKey = "subsidy";
	json_object_set_member(pJsonObject, subsidyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShopPromoId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopPromoIdKey = "shopPromoId";
	json_object_set_member(pJsonObject, shopPromoIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMarketPromoId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *marketPromoIdKey = "marketPromoId";
	json_object_set_member(pJsonObject, marketPromoIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrderPromoType
OrderItemPromoDTO::getType()
{
	return type;
}

void
OrderItemPromoDTO::setType(OrderPromoType  type)
{
	this->type = type;
}

long long
OrderItemPromoDTO::getDiscount()
{
	return discount;
}

void
OrderItemPromoDTO::setDiscount(long long  discount)
{
	this->discount = discount;
}

long long
OrderItemPromoDTO::getSubsidy()
{
	return subsidy;
}

void
OrderItemPromoDTO::setSubsidy(long long  subsidy)
{
	this->subsidy = subsidy;
}

std::string
OrderItemPromoDTO::getShopPromoId()
{
	return shopPromoId;
}

void
OrderItemPromoDTO::setShopPromoId(std::string  shopPromoId)
{
	this->shopPromoId = shopPromoId;
}

std::string
OrderItemPromoDTO::getMarketPromoId()
{
	return marketPromoId;
}

void
OrderItemPromoDTO::setMarketPromoId(std::string  marketPromoId)
{
	this->marketPromoId = marketPromoId;
}


