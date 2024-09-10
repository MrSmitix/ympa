

#include "OrderTrackDTO.h"

using namespace Tiny;

OrderTrackDTO::OrderTrackDTO()
{
	trackCode = std::string();
	deliveryServiceId = long(0);
}

OrderTrackDTO::OrderTrackDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderTrackDTO::~OrderTrackDTO()
{

}

void
OrderTrackDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *trackCodeKey = "trackCode";

    if(object.has_key(trackCodeKey))
    {
        bourne::json value = object[trackCodeKey];



        jsonToValue(&trackCode, value, "std::string");


    }

    const char *deliveryServiceIdKey = "deliveryServiceId";

    if(object.has_key(deliveryServiceIdKey))
    {
        bourne::json value = object[deliveryServiceIdKey];



        jsonToValue(&deliveryServiceId, value, "long");


    }


}

bourne::json
OrderTrackDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["trackCode"] = getTrackCode();






    object["deliveryServiceId"] = getDeliveryServiceId();



    return object;

}

std::string
OrderTrackDTO::getTrackCode()
{
	return trackCode;
}

void
OrderTrackDTO::setTrackCode(std::string  trackCode)
{
	this->trackCode = trackCode;
}

long
OrderTrackDTO::getDeliveryServiceId()
{
	return deliveryServiceId;
}

void
OrderTrackDTO::setDeliveryServiceId(long  deliveryServiceId)
{
	this->deliveryServiceId = deliveryServiceId;
}



