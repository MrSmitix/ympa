

#include "OfferDTO.h"

using namespace Tiny;

OfferDTO::OfferDTO()
{
	price = float(0);
	feedId = long(0);
	id = std::string();
	shopCategoryId = std::string();
	marketCategoryId = int(0);
	preDiscountPrice = float(0);
	discount = int(0);
	cutPrice = bool(false);
	url = std::string();
	modelId = long(0);
	name = std::string();
	currency = CurrencyType();
	bid = float(0);
	cbid = float(0);
	fee = float(0);
	blocked = bool(false);
}

OfferDTO::OfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferDTO::~OfferDTO()
{

}

void
OfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }

    const char *feedIdKey = "feedId";

    if(object.has_key(feedIdKey))
    {
        bourne::json value = object[feedIdKey];



        jsonToValue(&feedId, value, "long");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *shopCategoryIdKey = "shopCategoryId";

    if(object.has_key(shopCategoryIdKey))
    {
        bourne::json value = object[shopCategoryIdKey];



        jsonToValue(&shopCategoryId, value, "std::string");


    }

    const char *marketCategoryIdKey = "marketCategoryId";

    if(object.has_key(marketCategoryIdKey))
    {
        bourne::json value = object[marketCategoryIdKey];



        jsonToValue(&marketCategoryId, value, "int");


    }

    const char *preDiscountPriceKey = "preDiscountPrice";

    if(object.has_key(preDiscountPriceKey))
    {
        bourne::json value = object[preDiscountPriceKey];



        jsonToValue(&preDiscountPrice, value, "long");


    }

    const char *discountKey = "discount";

    if(object.has_key(discountKey))
    {
        bourne::json value = object[discountKey];



        jsonToValue(&discount, value, "int");


    }

    const char *cutPriceKey = "cutPrice";

    if(object.has_key(cutPriceKey))
    {
        bourne::json value = object[cutPriceKey];



        jsonToValue(&cutPrice, value, "bool");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *modelIdKey = "modelId";

    if(object.has_key(modelIdKey))
    {
        bourne::json value = object[modelIdKey];



        jsonToValue(&modelId, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        CurrencyType* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *bidKey = "bid";

    if(object.has_key(bidKey))
    {
        bourne::json value = object[bidKey];



        jsonToValue(&bid, value, "long");


    }

    const char *cbidKey = "cbid";

    if(object.has_key(cbidKey))
    {
        bourne::json value = object[cbidKey];



        jsonToValue(&cbid, value, "long");


    }

    const char *feeKey = "fee";

    if(object.has_key(feeKey))
    {
        bourne::json value = object[feeKey];



        jsonToValue(&fee, value, "long");


    }

    const char *blockedKey = "blocked";

    if(object.has_key(blockedKey))
    {
        bourne::json value = object[blockedKey];



        jsonToValue(&blocked, value, "bool");


    }


}

bourne::json
OfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["price"] = getPrice();






    object["feedId"] = getFeedId();






    object["id"] = getId();






    object["shopCategoryId"] = getShopCategoryId();






    object["marketCategoryId"] = getMarketCategoryId();






    object["preDiscountPrice"] = getPreDiscountPrice();






    object["discount"] = getDiscount();






    object["cutPrice"] = isCutPrice();






    object["url"] = getUrl();






    object["modelId"] = getModelId();






    object["name"] = getName();







	object["currency"] = getCurrency().toJson();





    object["bid"] = getBid();






    object["cbid"] = getCbid();






    object["fee"] = getFee();






    object["blocked"] = isBlocked();



    return object;

}

long
OfferDTO::getPrice()
{
	return price;
}

void
OfferDTO::setPrice(long  price)
{
	this->price = price;
}

long
OfferDTO::getFeedId()
{
	return feedId;
}

void
OfferDTO::setFeedId(long  feedId)
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

long
OfferDTO::getPreDiscountPrice()
{
	return preDiscountPrice;
}

void
OfferDTO::setPreDiscountPrice(long  preDiscountPrice)
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
OfferDTO::isCutPrice()
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

long
OfferDTO::getModelId()
{
	return modelId;
}

void
OfferDTO::setModelId(long  modelId)
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

long
OfferDTO::getBid()
{
	return bid;
}

void
OfferDTO::setBid(long  bid)
{
	this->bid = bid;
}

long
OfferDTO::getCbid()
{
	return cbid;
}

void
OfferDTO::setCbid(long  cbid)
{
	this->cbid = cbid;
}

long
OfferDTO::getFee()
{
	return fee;
}

void
OfferDTO::setFee(long  fee)
{
	this->fee = fee;
}

bool
OfferDTO::isBlocked()
{
	return blocked;
}

void
OfferDTO::setBlocked(bool  blocked)
{
	this->blocked = blocked;
}



