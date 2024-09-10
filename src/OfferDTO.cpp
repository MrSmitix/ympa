#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferDTO::OfferDTO()
{
	//__init();
}

OfferDTO::~OfferDTO()
{
	//__cleanup();
}

void
OfferDTO::__init()
{
	//price = double(0);
	//feedId = long(0);
	//id = std::string();
	//shopCategoryId = std::string();
	//marketCategoryId = int(0);
	//preDiscountPrice = double(0);
	//discount = int(0);
	//cutPrice = bool(false);
	//url = std::string();
	//modelId = long(0);
	//name = std::string();
	//currency = new CurrencyType();
	//bid = double(0);
	//cbid = double(0);
	//fee = double(0);
	//blocked = bool(false);
}

void
OfferDTO::__cleanup()
{
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(feedId != NULL) {
	//
	//delete feedId;
	//feedId = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(shopCategoryId != NULL) {
	//
	//delete shopCategoryId;
	//shopCategoryId = NULL;
	//}
	//if(marketCategoryId != NULL) {
	//
	//delete marketCategoryId;
	//marketCategoryId = NULL;
	//}
	//if(preDiscountPrice != NULL) {
	//
	//delete preDiscountPrice;
	//preDiscountPrice = NULL;
	//}
	//if(discount != NULL) {
	//
	//delete discount;
	//discount = NULL;
	//}
	//if(cutPrice != NULL) {
	//
	//delete cutPrice;
	//cutPrice = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(modelId != NULL) {
	//
	//delete modelId;
	//modelId = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(bid != NULL) {
	//
	//delete bid;
	//bid = NULL;
	//}
	//if(cbid != NULL) {
	//
	//delete cbid;
	//cbid = NULL;
	//}
	//if(fee != NULL) {
	//
	//delete fee;
	//fee = NULL;
	//}
	//if(blocked != NULL) {
	//
	//delete blocked;
	//blocked = NULL;
	//}
	//
}

void
OfferDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *feedIdKey = "feedId";
	node = json_object_get_member(pJsonObject, feedIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&feedId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *shopCategoryIdKey = "shopCategoryId";
	node = json_object_get_member(pJsonObject, shopCategoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopCategoryId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *marketCategoryIdKey = "marketCategoryId";
	node = json_object_get_member(pJsonObject, marketCategoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&marketCategoryId, node, "int", "");
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
	const gchar *discountKey = "discount";
	node = json_object_get_member(pJsonObject, discountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&discount, node, "int", "");
		} else {
			
		}
	}
	const gchar *cutPriceKey = "cutPrice";
	node = json_object_get_member(pJsonObject, cutPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&cutPrice, node, "bool", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *modelIdKey = "modelId";
	node = json_object_get_member(pJsonObject, modelIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&modelId, node, "long long", "");
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
	const gchar *bidKey = "bid";
	node = json_object_get_member(pJsonObject, bidKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&bid, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&bid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cbidKey = "cbid";
	node = json_object_get_member(pJsonObject, cbidKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&cbid, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&cbid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *feeKey = "fee";
	node = json_object_get_member(pJsonObject, feeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&fee, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&fee);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *blockedKey = "blocked";
	node = json_object_get_member(pJsonObject, blockedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&blocked, node, "bool", "");
		} else {
			
		}
	}
}

OfferDTO::OfferDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
		long long obj = getFeedId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *feedIdKey = "feedId";
	json_object_set_member(pJsonObject, feedIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShopCategoryId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopCategoryIdKey = "shopCategoryId";
	json_object_set_member(pJsonObject, shopCategoryIdKey, node);
	if (isprimitive("int")) {
		int obj = getMarketCategoryId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *marketCategoryIdKey = "marketCategoryId";
	json_object_set_member(pJsonObject, marketCategoryIdKey, node);
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
	if (isprimitive("int")) {
		int obj = getDiscount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *discountKey = "discount";
	json_object_set_member(pJsonObject, discountKey, node);
	if (isprimitive("bool")) {
		bool obj = getCutPrice();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *cutPriceKey = "cutPrice";
	json_object_set_member(pJsonObject, cutPriceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("long long")) {
		long long obj = getModelId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *modelIdKey = "modelId";
	json_object_set_member(pJsonObject, modelIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
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
		long long obj = getBid();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bidKey = "bid";
	json_object_set_member(pJsonObject, bidKey, node);
	if (isprimitive("long long")) {
		long long obj = getCbid();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getCbid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cbidKey = "cbid";
	json_object_set_member(pJsonObject, cbidKey, node);
	if (isprimitive("long long")) {
		long long obj = getFee();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getFee());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *feeKey = "fee";
	json_object_set_member(pJsonObject, feeKey, node);
	if (isprimitive("bool")) {
		bool obj = getBlocked();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *blockedKey = "blocked";
	json_object_set_member(pJsonObject, blockedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OfferDTO::getPrice()
{
	return price;
}

void
OfferDTO::setPrice(long long  price)
{
	this->price = price;
}

long long
OfferDTO::getFeedId()
{
	return feedId;
}

void
OfferDTO::setFeedId(long long  feedId)
{
	this->feedId = feedId;
}

std::string
OfferDTO::getId()
{
	return id;
}

void
OfferDTO::setId(std::string  id)
{
	this->id = id;
}

std::string
OfferDTO::getShopCategoryId()
{
	return shopCategoryId;
}

void
OfferDTO::setShopCategoryId(std::string  shopCategoryId)
{
	this->shopCategoryId = shopCategoryId;
}

int
OfferDTO::getMarketCategoryId()
{
	return marketCategoryId;
}

void
OfferDTO::setMarketCategoryId(int  marketCategoryId)
{
	this->marketCategoryId = marketCategoryId;
}

long long
OfferDTO::getPreDiscountPrice()
{
	return preDiscountPrice;
}

void
OfferDTO::setPreDiscountPrice(long long  preDiscountPrice)
{
	this->preDiscountPrice = preDiscountPrice;
}

int
OfferDTO::getDiscount()
{
	return discount;
}

void
OfferDTO::setDiscount(int  discount)
{
	this->discount = discount;
}

bool
OfferDTO::getCutPrice()
{
	return cutPrice;
}

void
OfferDTO::setCutPrice(bool  cutPrice)
{
	this->cutPrice = cutPrice;
}

std::string
OfferDTO::getUrl()
{
	return url;
}

void
OfferDTO::setUrl(std::string  url)
{
	this->url = url;
}

long long
OfferDTO::getModelId()
{
	return modelId;
}

void
OfferDTO::setModelId(long long  modelId)
{
	this->modelId = modelId;
}

std::string
OfferDTO::getName()
{
	return name;
}

void
OfferDTO::setName(std::string  name)
{
	this->name = name;
}

CurrencyType
OfferDTO::getCurrency()
{
	return currency;
}

void
OfferDTO::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}

long long
OfferDTO::getBid()
{
	return bid;
}

void
OfferDTO::setBid(long long  bid)
{
	this->bid = bid;
}

long long
OfferDTO::getCbid()
{
	return cbid;
}

void
OfferDTO::setCbid(long long  cbid)
{
	this->cbid = cbid;
}

long long
OfferDTO::getFee()
{
	return fee;
}

void
OfferDTO::setFee(long long  fee)
{
	this->fee = fee;
}

bool
OfferDTO::getBlocked()
{
	return blocked;
}

void
OfferDTO::setBlocked(bool  blocked)
{
	this->blocked = blocked;
}


