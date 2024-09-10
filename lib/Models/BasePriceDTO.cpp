

#include "BasePriceDTO.h"

using namespace Tiny;

BasePriceDTO::BasePriceDTO()
{
	value = float(0);
	currencyId = CurrencyType();
}

BasePriceDTO::BasePriceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

BasePriceDTO::~BasePriceDTO()
{

}

void
BasePriceDTO::fromJson(std::string jsonObj)
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


}

bourne::json
BasePriceDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();







	object["currencyId"] = getCurrencyId().toJson();


    return object;

}

long
BasePriceDTO::getValue()
{
	return value;
}

void
BasePriceDTO::setValue(long  value)
{
	this->value = value;
}

CurrencyType
BasePriceDTO::getCurrencyId()
{
	return currencyId;
}

void
BasePriceDTO::setCurrencyId(CurrencyType  currencyId)
{
	this->currencyId = currencyId;
}



