

#include "PriceSuggestDTO.h"

using namespace Tiny;

PriceSuggestDTO::PriceSuggestDTO()
{
	type = PriceSuggestType();
	price = float(0);
}

PriceSuggestDTO::PriceSuggestDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceSuggestDTO::~PriceSuggestDTO()
{

}

void
PriceSuggestDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        PriceSuggestType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }


}

bourne::json
PriceSuggestDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["price"] = getPrice();



    return object;

}

PriceSuggestType
PriceSuggestDTO::getType()
{
	return type;
}

void
PriceSuggestDTO::setType(PriceSuggestType  type)
{
	this->type = type;
}

long
PriceSuggestDTO::getPrice()
{
	return price;
}

void
PriceSuggestDTO::setPrice(long  price)
{
	this->price = price;
}



