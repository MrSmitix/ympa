

#include "OutletDeliveryRuleDTO.h"

using namespace Tiny;

OutletDeliveryRuleDTO::OutletDeliveryRuleDTO()
{
	minDeliveryDays = int(0);
	maxDeliveryDays = int(0);
	deliveryServiceId = long(0);
	orderBefore = int(0);
	priceFreePickup = float(0);
	unspecifiedDeliveryInterval = bool(false);
}

OutletDeliveryRuleDTO::OutletDeliveryRuleDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletDeliveryRuleDTO::~OutletDeliveryRuleDTO()
{

}

void
OutletDeliveryRuleDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *minDeliveryDaysKey = "minDeliveryDays";

    if(object.has_key(minDeliveryDaysKey))
    {
        bourne::json value = object[minDeliveryDaysKey];



        jsonToValue(&minDeliveryDays, value, "int");


    }

    const char *maxDeliveryDaysKey = "maxDeliveryDays";

    if(object.has_key(maxDeliveryDaysKey))
    {
        bourne::json value = object[maxDeliveryDaysKey];



        jsonToValue(&maxDeliveryDays, value, "int");


    }

    const char *deliveryServiceIdKey = "deliveryServiceId";

    if(object.has_key(deliveryServiceIdKey))
    {
        bourne::json value = object[deliveryServiceIdKey];



        jsonToValue(&deliveryServiceId, value, "long");


    }

    const char *orderBeforeKey = "orderBefore";

    if(object.has_key(orderBeforeKey))
    {
        bourne::json value = object[orderBeforeKey];



        jsonToValue(&orderBefore, value, "int");


    }

    const char *priceFreePickupKey = "priceFreePickup";

    if(object.has_key(priceFreePickupKey))
    {
        bourne::json value = object[priceFreePickupKey];



        jsonToValue(&priceFreePickup, value, "long");


    }

    const char *unspecifiedDeliveryIntervalKey = "unspecifiedDeliveryInterval";

    if(object.has_key(unspecifiedDeliveryIntervalKey))
    {
        bourne::json value = object[unspecifiedDeliveryIntervalKey];



        jsonToValue(&unspecifiedDeliveryInterval, value, "bool");


    }


}

bourne::json
OutletDeliveryRuleDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["minDeliveryDays"] = getMinDeliveryDays();






    object["maxDeliveryDays"] = getMaxDeliveryDays();






    object["deliveryServiceId"] = getDeliveryServiceId();






    object["orderBefore"] = getOrderBefore();






    object["priceFreePickup"] = getPriceFreePickup();






    object["unspecifiedDeliveryInterval"] = isUnspecifiedDeliveryInterval();



    return object;

}

int
OutletDeliveryRuleDTO::getMinDeliveryDays()
{
	return minDeliveryDays;
}

void
OutletDeliveryRuleDTO::setMinDeliveryDays(int  minDeliveryDays)
{
	this->minDeliveryDays = minDeliveryDays;
}

int
OutletDeliveryRuleDTO::getMaxDeliveryDays()
{
	return maxDeliveryDays;
}

void
OutletDeliveryRuleDTO::setMaxDeliveryDays(int  maxDeliveryDays)
{
	this->maxDeliveryDays = maxDeliveryDays;
}

long
OutletDeliveryRuleDTO::getDeliveryServiceId()
{
	return deliveryServiceId;
}

void
OutletDeliveryRuleDTO::setDeliveryServiceId(long  deliveryServiceId)
{
	this->deliveryServiceId = deliveryServiceId;
}

int
OutletDeliveryRuleDTO::getOrderBefore()
{
	return orderBefore;
}

void
OutletDeliveryRuleDTO::setOrderBefore(int  orderBefore)
{
	this->orderBefore = orderBefore;
}

long
OutletDeliveryRuleDTO::getPriceFreePickup()
{
	return priceFreePickup;
}

void
OutletDeliveryRuleDTO::setPriceFreePickup(long  priceFreePickup)
{
	this->priceFreePickup = priceFreePickup;
}

bool
OutletDeliveryRuleDTO::isUnspecifiedDeliveryInterval()
{
	return unspecifiedDeliveryInterval;
}

void
OutletDeliveryRuleDTO::setUnspecifiedDeliveryInterval(bool  unspecifiedDeliveryInterval)
{
	this->unspecifiedDeliveryInterval = unspecifiedDeliveryInterval;
}



