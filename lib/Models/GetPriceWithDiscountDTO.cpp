

#include "GetPriceWithDiscountDTO.h"

using namespace Tiny;

GetPriceWithDiscountDTO::GetPriceWithDiscountDTO()
{
	value = float(0);
	currencyId = CurrencyType();
	discountBase = float(0);
	updatedAt = std::string();
}

GetPriceWithDiscountDTO::GetPriceWithDiscountDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPriceWithDiscountDTO::~GetPriceWithDiscountDTO()
{

}

void
GetPriceWithDiscountDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "long");


    }

    const char *currencyIdKey = "currencyId";

    if(object.has_key(currencyIdKey))
    {
        bourne::json value = object[currencyIdKey];




        CurrencyType* obj = &currencyId;
		obj->fromJson(value.dump());

    }

    const char *discountBaseKey = "discountBase";

    if(object.has_key(discountBaseKey))
    {
        bourne::json value = object[discountBaseKey];



        jsonToValue(&discountBase, value, "long");


    }

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }


}

bourne::json
GetPriceWithDiscountDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();







	object["currencyId"] = getCurrencyId().toJson();





    object["discountBase"] = getDiscountBase();






    object["updatedAt"] = getUpdatedAt();



    return object;

}

long
GetPriceWithDiscountDTO::getValue()
{
	return value;
}

void
GetPriceWithDiscountDTO::setValue(long  value)
{
	this->value = value;
}

CurrencyType
GetPriceWithDiscountDTO::getCurrencyId()
{
	return currencyId;
}

void
GetPriceWithDiscountDTO::setCurrencyId(CurrencyType  currencyId)
{
	this->currencyId = currencyId;
}

long
GetPriceWithDiscountDTO::getDiscountBase()
{
	return discountBase;
}

void
GetPriceWithDiscountDTO::setDiscountBase(long  discountBase)
{
	this->discountBase = discountBase;
}

std::string
GetPriceWithDiscountDTO::getUpdatedAt()
{
	return updatedAt;
}

void
GetPriceWithDiscountDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}



