

#include "GetPriceDTO.h"

using namespace Tiny;

GetPriceDTO::GetPriceDTO()
{
	value = float(0);
	currencyId = CurrencyType();
	updatedAt = std::string();
}

GetPriceDTO::GetPriceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPriceDTO::~GetPriceDTO()
{

}

void
GetPriceDTO::fromJson(std::string jsonObj)
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

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }


}

bourne::json
GetPriceDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();







	object["currencyId"] = getCurrencyId().toJson();





    object["updatedAt"] = getUpdatedAt();



    return object;

}

long
GetPriceDTO::getValue()
{
	return value;
}

void
GetPriceDTO::setValue(long  value)
{
	this->value = value;
}

CurrencyType
GetPriceDTO::getCurrencyId()
{
	return currencyId;
}

void
GetPriceDTO::setCurrencyId(CurrencyType  currencyId)
{
	this->currencyId = currencyId;
}

std::string
GetPriceDTO::getUpdatedAt()
{
	return updatedAt;
}

void
GetPriceDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}



