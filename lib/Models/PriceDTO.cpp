

#include "PriceDTO.h"

using namespace Tiny;

PriceDTO::PriceDTO()
{
	value = float(0);
	discountBase = float(0);
	currencyId = CurrencyType();
	vat = int(0);
}

PriceDTO::PriceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceDTO::~PriceDTO()
{

}

void
PriceDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "long");


    }

    const char *discountBaseKey = "discountBase";

    if(object.has_key(discountBaseKey))
    {
        bourne::json value = object[discountBaseKey];



        jsonToValue(&discountBase, value, "long");


    }

    const char *currencyIdKey = "currencyId";

    if(object.has_key(currencyIdKey))
    {
        bourne::json value = object[currencyIdKey];




        CurrencyType* obj = &currencyId;
		obj->fromJson(value.dump());

    }

    const char *vatKey = "vat";

    if(object.has_key(vatKey))
    {
        bourne::json value = object[vatKey];



        jsonToValue(&vat, value, "int");


    }


}

bourne::json
PriceDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();






    object["discountBase"] = getDiscountBase();







	object["currencyId"] = getCurrencyId().toJson();





    object["vat"] = getVat();



    return object;

}

long
PriceDTO::getValue()
{
	return value;
}

void
PriceDTO::setValue(long  value)
{
	this->value = value;
}

long
PriceDTO::getDiscountBase()
{
	return discountBase;
}

void
PriceDTO::setDiscountBase(long  discountBase)
{
	this->discountBase = discountBase;
}

CurrencyType
PriceDTO::getCurrencyId()
{
	return currencyId;
}

void
PriceDTO::setCurrencyId(CurrencyType  currencyId)
{
	this->currencyId = currencyId;
}

int
PriceDTO::getVat()
{
	return vat;
}

void
PriceDTO::setVat(int  vat)
{
	this->vat = vat;
}



