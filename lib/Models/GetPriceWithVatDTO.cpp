

#include "GetPriceWithVatDTO.h"

using namespace Tiny;

GetPriceWithVatDTO::GetPriceWithVatDTO()
{
	value = float(0);
	discountBase = float(0);
	currencyId = CurrencyType();
	vat = int(0);
	updatedAt = std::string();
}

GetPriceWithVatDTO::GetPriceWithVatDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPriceWithVatDTO::~GetPriceWithVatDTO()
{

}

void
GetPriceWithVatDTO::fromJson(std::string jsonObj)
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

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }


}

bourne::json
GetPriceWithVatDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();






    object["discountBase"] = getDiscountBase();







	object["currencyId"] = getCurrencyId().toJson();





    object["vat"] = getVat();






    object["updatedAt"] = getUpdatedAt();



    return object;

}

long
GetPriceWithVatDTO::getValue()
{
	return value;
}

void
GetPriceWithVatDTO::setValue(long  value)
{
	this->value = value;
}

long
GetPriceWithVatDTO::getDiscountBase()
{
	return discountBase;
}

void
GetPriceWithVatDTO::setDiscountBase(long  discountBase)
{
	this->discountBase = discountBase;
}

CurrencyType
GetPriceWithVatDTO::getCurrencyId()
{
	return currencyId;
}

void
GetPriceWithVatDTO::setCurrencyId(CurrencyType  currencyId)
{
	this->currencyId = currencyId;
}

int
GetPriceWithVatDTO::getVat()
{
	return vat;
}

void
GetPriceWithVatDTO::setVat(int  vat)
{
	this->vat = vat;
}

std::string
GetPriceWithVatDTO::getUpdatedAt()
{
	return updatedAt;
}

void
GetPriceWithVatDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}



