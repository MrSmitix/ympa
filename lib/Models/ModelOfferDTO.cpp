

#include "ModelOfferDTO.h"

using namespace Tiny;

ModelOfferDTO::ModelOfferDTO()
{
	discount = int(0);
	name = std::string();
	pos = int(0);
	preDiscountPrice = float(0);
	price = float(0);
	regionId = long(0);
	shippingCost = float(0);
	shopName = std::string();
	shopRating = int(0);
	inStock = int(0);
}

ModelOfferDTO::ModelOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ModelOfferDTO::~ModelOfferDTO()
{

}

void
ModelOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *discountKey = "discount";

    if(object.has_key(discountKey))
    {
        bourne::json value = object[discountKey];



        jsonToValue(&discount, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *posKey = "pos";

    if(object.has_key(posKey))
    {
        bourne::json value = object[posKey];



        jsonToValue(&pos, value, "int");


    }

    const char *preDiscountPriceKey = "preDiscountPrice";

    if(object.has_key(preDiscountPriceKey))
    {
        bourne::json value = object[preDiscountPriceKey];



        jsonToValue(&preDiscountPrice, value, "long");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }

    const char *regionIdKey = "regionId";

    if(object.has_key(regionIdKey))
    {
        bourne::json value = object[regionIdKey];



        jsonToValue(&regionId, value, "long");


    }

    const char *shippingCostKey = "shippingCost";

    if(object.has_key(shippingCostKey))
    {
        bourne::json value = object[shippingCostKey];



        jsonToValue(&shippingCost, value, "long");


    }

    const char *shopNameKey = "shopName";

    if(object.has_key(shopNameKey))
    {
        bourne::json value = object[shopNameKey];



        jsonToValue(&shopName, value, "std::string");


    }

    const char *shopRatingKey = "shopRating";

    if(object.has_key(shopRatingKey))
    {
        bourne::json value = object[shopRatingKey];



        jsonToValue(&shopRating, value, "int");


    }

    const char *inStockKey = "inStock";

    if(object.has_key(inStockKey))
    {
        bourne::json value = object[inStockKey];



        jsonToValue(&inStock, value, "int");


    }


}

bourne::json
ModelOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["discount"] = getDiscount();






    object["name"] = getName();






    object["pos"] = getPos();






    object["preDiscountPrice"] = getPreDiscountPrice();






    object["price"] = getPrice();






    object["regionId"] = getRegionId();






    object["shippingCost"] = getShippingCost();






    object["shopName"] = getShopName();






    object["shopRating"] = getShopRating();






    object["inStock"] = getInStock();



    return object;

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

long
ModelOfferDTO::getPreDiscountPrice()
{
	return preDiscountPrice;
}

void
ModelOfferDTO::setPreDiscountPrice(long  preDiscountPrice)
{
	this->preDiscountPrice = preDiscountPrice;
}

long
ModelOfferDTO::getPrice()
{
	return price;
}

void
ModelOfferDTO::setPrice(long  price)
{
	this->price = price;
}

long
ModelOfferDTO::getRegionId()
{
	return regionId;
}

void
ModelOfferDTO::setRegionId(long  regionId)
{
	this->regionId = regionId;
}

long
ModelOfferDTO::getShippingCost()
{
	return shippingCost;
}

void
ModelOfferDTO::setShippingCost(long  shippingCost)
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



