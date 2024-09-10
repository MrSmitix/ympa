

#include "RegionalModelInfoDTO.h"

using namespace Tiny;

RegionalModelInfoDTO::RegionalModelInfoDTO()
{
	currency = CurrencyType();
	regionId = long(0);
}

RegionalModelInfoDTO::RegionalModelInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

RegionalModelInfoDTO::~RegionalModelInfoDTO()
{

}

void
RegionalModelInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        CurrencyType* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *regionIdKey = "regionId";

    if(object.has_key(regionIdKey))
    {
        bourne::json value = object[regionIdKey];



        jsonToValue(&regionId, value, "long");


    }


}

bourne::json
RegionalModelInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["currency"] = getCurrency().toJson();





    object["regionId"] = getRegionId();



    return object;

}

CurrencyType
RegionalModelInfoDTO::getCurrency()
{
	return currency;
}

void
RegionalModelInfoDTO::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}

long
RegionalModelInfoDTO::getRegionId()
{
	return regionId;
}

void
RegionalModelInfoDTO::setRegionId(long  regionId)
{
	this->regionId = regionId;
}



