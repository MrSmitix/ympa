

#include "BusinessSettingsDTO.h"

using namespace Tiny;

BusinessSettingsDTO::BusinessSettingsDTO()
{
	onlyDefaultPrice = bool(false);
	currency = CurrencyType();
}

BusinessSettingsDTO::BusinessSettingsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessSettingsDTO::~BusinessSettingsDTO()
{

}

void
BusinessSettingsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *onlyDefaultPriceKey = "onlyDefaultPrice";

    if(object.has_key(onlyDefaultPriceKey))
    {
        bourne::json value = object[onlyDefaultPriceKey];



        jsonToValue(&onlyDefaultPrice, value, "bool");


    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        CurrencyType* obj = &currency;
		obj->fromJson(value.dump());

    }


}

bourne::json
BusinessSettingsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["onlyDefaultPrice"] = isOnlyDefaultPrice();







	object["currency"] = getCurrency().toJson();


    return object;

}

bool
BusinessSettingsDTO::isOnlyDefaultPrice()
{
	return onlyDefaultPrice;
}

void
BusinessSettingsDTO::setOnlyDefaultPrice(bool  onlyDefaultPrice)
{
	this->onlyDefaultPrice = onlyDefaultPrice;
}

CurrencyType
BusinessSettingsDTO::getCurrency()
{
	return currency;
}

void
BusinessSettingsDTO::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}



