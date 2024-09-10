#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ModelOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ModelOfferDTO::ModelOfferDTO()
{
	//__init();
}

ModelOfferDTO::~ModelOfferDTO()
{
	//__cleanup();
}

void
ModelOfferDTO::__init()
{
	//discount = int(0);
	//name = std::string();
	//pos = int(0);
	//preDiscountPrice = double(0);
	//price = double(0);
	//regionId = long(0);
	//shippingCost = double(0);
	//shopName = std::string();
	//shopRating = int(0);
	//inStock = int(0);
}

void
ModelOfferDTO::__cleanup()
{
	//if(discount != NULL) {
	//
	//delete discount;
	//discount = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(pos != NULL) {
	//
	//delete pos;
	//pos = NULL;
	//}
	//if(preDiscountPrice != NULL) {
	//
	//delete preDiscountPrice;
	//preDiscountPrice = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(regionId != NULL) {
	//
	//delete regionId;
	//regionId = NULL;
	//}
	//if(shippingCost != NULL) {
	//
	//delete shippingCost;
	//shippingCost = NULL;
	//}
	//if(shopName != NULL) {
	//
	//delete shopName;
	//shopName = NULL;
	//}
	//if(shopRating != NULL) {
	//
	//delete shopRating;
	//shopRating = NULL;
	//}
	//if(inStock != NULL) {
	//
	//delete inStock;
	//inStock = NULL;
	//}
	//
}

void
ModelOfferDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *discountKey = "discount";
	node = json_object_get_member(pJsonObject, discountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&discount, node, "int", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *posKey = "pos";
	node = json_object_get_member(pJsonObject, posKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pos, node, "int", "");
		} else {
			
		}
	}
	const gchar *preDiscountPriceKey = "preDiscountPrice";
	node = json_object_get_member(pJsonObject, preDiscountPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&preDiscountPrice, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&preDiscountPrice);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *regionIdKey = "regionId";
	node = json_object_get_member(pJsonObject, regionIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&regionId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *shippingCostKey = "shippingCost";
	node = json_object_get_member(pJsonObject, shippingCostKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&shippingCost, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&shippingCost);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *shopNameKey = "shopName";
	node = json_object_get_member(pJsonObject, shopNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *shopRatingKey = "shopRating";
	node = json_object_get_member(pJsonObject, shopRatingKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&shopRating, node, "int", "");
		} else {
			
		}
	}
	const gchar *inStockKey = "inStock";
	node = json_object_get_member(pJsonObject, inStockKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&inStock, node, "int", "");
		} else {
			
		}
	}
}

ModelOfferDTO::ModelOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
ModelOfferDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getDiscount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *discountKey = "discount";
	json_object_set_member(pJsonObject, discountKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getPos();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *posKey = "pos";
	json_object_set_member(pJsonObject, posKey, node);
	if (isprimitive("long long")) {
		long long obj = getPreDiscountPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPreDiscountPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preDiscountPriceKey = "preDiscountPrice";
	json_object_set_member(pJsonObject, preDiscountPriceKey, node);
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
	if (isprimitive("long long")) {
		long long obj = getRegionId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *regionIdKey = "regionId";
	json_object_set_member(pJsonObject, regionIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getShippingCost();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getShippingCost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *shippingCostKey = "shippingCost";
	json_object_set_member(pJsonObject, shippingCostKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShopName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopNameKey = "shopName";
	json_object_set_member(pJsonObject, shopNameKey, node);
	if (isprimitive("int")) {
		int obj = getShopRating();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *shopRatingKey = "shopRating";
	json_object_set_member(pJsonObject, shopRatingKey, node);
	if (isprimitive("int")) {
		int obj = getInStock();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *inStockKey = "inStock";
	json_object_set_member(pJsonObject, inStockKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
ModelOfferDTO::getDiscount()
{
	return discount;
}

void
ModelOfferDTO::setDiscount(int  discount)
{
	this->discount = discount;
}

std::string
ModelOfferDTO::getName()
{
	return name;
}

void
ModelOfferDTO::setName(std::string  name)
{
	this->name = name;
}

int
ModelOfferDTO::getPos()
{
	return pos;
}

void
ModelOfferDTO::setPos(int  pos)
{
	this->pos = pos;
}

long long
ModelOfferDTO::getPreDiscountPrice()
{
	return preDiscountPrice;
}

void
ModelOfferDTO::setPreDiscountPrice(long long  preDiscountPrice)
{
	this->preDiscountPrice = preDiscountPrice;
}

long long
ModelOfferDTO::getPrice()
{
	return price;
}

void
ModelOfferDTO::setPrice(long long  price)
{
	this->price = price;
}

long long
ModelOfferDTO::getRegionId()
{
	return regionId;
}

void
ModelOfferDTO::setRegionId(long long  regionId)
{
	this->regionId = regionId;
}

long long
ModelOfferDTO::getShippingCost()
{
	return shippingCost;
}

void
ModelOfferDTO::setShippingCost(long long  shippingCost)
{
	this->shippingCost = shippingCost;
}

std::string
ModelOfferDTO::getShopName()
{
	return shopName;
}

void
ModelOfferDTO::setShopName(std::string  shopName)
{
	this->shopName = shopName;
}

int
ModelOfferDTO::getShopRating()
{
	return shopRating;
}

void
ModelOfferDTO::setShopRating(int  shopRating)
{
	this->shopRating = shopRating;
}

int
ModelOfferDTO::getInStock()
{
	return inStock;
}

void
ModelOfferDTO::setInStock(int  inStock)
{
	this->inStock = inStock;
}


