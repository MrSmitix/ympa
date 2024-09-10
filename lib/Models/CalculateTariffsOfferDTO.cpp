

#include "CalculateTariffsOfferDTO.h"

using namespace Tiny;

CalculateTariffsOfferDTO::CalculateTariffsOfferDTO()
{
	categoryId = long(0);
	price = float(0);
	length = float(0);
	width = float(0);
	height = float(0);
	weight = float(0);
	quantity = int(0);
}

CalculateTariffsOfferDTO::CalculateTariffsOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CalculateTariffsOfferDTO::~CalculateTariffsOfferDTO()
{

}

void
CalculateTariffsOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *categoryIdKey = "categoryId";

    if(object.has_key(categoryIdKey))
    {
        bourne::json value = object[categoryIdKey];



        jsonToValue(&categoryId, value, "long");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }

    const char *lengthKey = "length";

    if(object.has_key(lengthKey))
    {
        bourne::json value = object[lengthKey];



        jsonToValue(&length, value, "long");


    }

    const char *widthKey = "width";

    if(object.has_key(widthKey))
    {
        bourne::json value = object[widthKey];



        jsonToValue(&width, value, "long");


    }

    const char *heightKey = "height";

    if(object.has_key(heightKey))
    {
        bourne::json value = object[heightKey];



        jsonToValue(&height, value, "long");


    }

    const char *weightKey = "weight";

    if(object.has_key(weightKey))
    {
        bourne::json value = object[weightKey];



        jsonToValue(&weight, value, "long");


    }

    const char *quantityKey = "quantity";

    if(object.has_key(quantityKey))
    {
        bourne::json value = object[quantityKey];



        jsonToValue(&quantity, value, "int");


    }


}

bourne::json
CalculateTariffsOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["categoryId"] = getCategoryId();






    object["price"] = getPrice();






    object["length"] = getLength();






    object["width"] = getWidth();






    object["height"] = getHeight();






    object["weight"] = getWeight();






    object["quantity"] = getQuantity();



    return object;

}

long
CalculateTariffsOfferDTO::getCategoryId()
{
	return categoryId;
}

void
CalculateTariffsOfferDTO::setCategoryId(long  categoryId)
{
	this->categoryId = categoryId;
}

long
CalculateTariffsOfferDTO::getPrice()
{
	return price;
}

void
CalculateTariffsOfferDTO::setPrice(long  price)
{
	this->price = price;
}

long
CalculateTariffsOfferDTO::getLength()
{
	return length;
}

void
CalculateTariffsOfferDTO::setLength(long  length)
{
	this->length = length;
}

long
CalculateTariffsOfferDTO::getWidth()
{
	return width;
}

void
CalculateTariffsOfferDTO::setWidth(long  width)
{
	this->width = width;
}

long
CalculateTariffsOfferDTO::getHeight()
{
	return height;
}

void
CalculateTariffsOfferDTO::setHeight(long  height)
{
	this->height = height;
}

long
CalculateTariffsOfferDTO::getWeight()
{
	return weight;
}

void
CalculateTariffsOfferDTO::setWeight(long  weight)
{
	this->weight = weight;
}

int
CalculateTariffsOfferDTO::getQuantity()
{
	return quantity;
}

void
CalculateTariffsOfferDTO::setQuantity(int  quantity)
{
	this->quantity = quantity;
}



