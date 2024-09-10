

#include "OrderItemPromoDTO.h"

using namespace Tiny;

OrderItemPromoDTO::OrderItemPromoDTO()
{
	type = OrderPromoType();
	discount = float(0);
	subsidy = float(0);
	shopPromoId = std::string();
	marketPromoId = std::string();
}

OrderItemPromoDTO::OrderItemPromoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemPromoDTO::~OrderItemPromoDTO()
{

}

void
OrderItemPromoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OrderPromoType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *discountKey = "discount";

    if(object.has_key(discountKey))
    {
        bourne::json value = object[discountKey];



        jsonToValue(&discount, value, "long");


    }

    const char *subsidyKey = "subsidy";

    if(object.has_key(subsidyKey))
    {
        bourne::json value = object[subsidyKey];



        jsonToValue(&subsidy, value, "long");


    }

    const char *shopPromoIdKey = "shopPromoId";

    if(object.has_key(shopPromoIdKey))
    {
        bourne::json value = object[shopPromoIdKey];



        jsonToValue(&shopPromoId, value, "std::string");


    }

    const char *marketPromoIdKey = "marketPromoId";

    if(object.has_key(marketPromoIdKey))
    {
        bourne::json value = object[marketPromoIdKey];



        jsonToValue(&marketPromoId, value, "std::string");


    }


}

bourne::json
OrderItemPromoDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["discount"] = getDiscount();






    object["subsidy"] = getSubsidy();






    object["shopPromoId"] = getShopPromoId();






    object["marketPromoId"] = getMarketPromoId();



    return object;

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

long
OrderItemPromoDTO::getDiscount()
{
	return discount;
}

void
OrderItemPromoDTO::setDiscount(long  discount)
{
	this->discount = discount;
}

long
OrderItemPromoDTO::getSubsidy()
{
	return subsidy;
}

void
OrderItemPromoDTO::setSubsidy(long  subsidy)
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



