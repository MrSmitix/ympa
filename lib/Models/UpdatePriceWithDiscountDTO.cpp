

#include "UpdatePriceWithDiscountDTO.h"

using namespace Tiny;

UpdatePriceWithDiscountDTO::UpdatePriceWithDiscountDTO()
{
	value = float(0);
	currencyId = CurrencyType();
	discountBase = float(0);
}

UpdatePriceWithDiscountDTO::UpdatePriceWithDiscountDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePriceWithDiscountDTO::~UpdatePriceWithDiscountDTO()
{

}

void
UpdatePriceWithDiscountDTO::fromJson(std::string jsonObj)
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


}

bourne::json
UpdatePriceWithDiscountDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();







	object["currencyId"] = getCurrencyId().toJson();





    object["discountBase"] = getDiscountBase();



    return object;

}

long
UpdatePriceWithDiscountDTO::getValue()
{
	return value;
}

void
UpdatePriceWithDiscountDTO::setValue(long  value)
{
	this->value = value;
}

CurrencyType
UpdatePriceWithDiscountDTO::getCurrencyId()
{
	return currencyId;
}

void
UpdatePriceWithDiscountDTO::setCurrencyId(CurrencyType  currencyId)
{
	this->currencyId = currencyId;
}

long
UpdatePriceWithDiscountDTO::getDiscountBase()
{
	return discountBase;
}

void
UpdatePriceWithDiscountDTO::setDiscountBase(long  discountBase)
{
	this->discountBase = discountBase;
}



