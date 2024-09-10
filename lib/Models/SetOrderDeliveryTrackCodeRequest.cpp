

#include "SetOrderDeliveryTrackCodeRequest.h"

using namespace Tiny;

SetOrderDeliveryTrackCodeRequest::SetOrderDeliveryTrackCodeRequest()
{
	trackCode = std::string();
	deliveryServiceId = long(0);
}

SetOrderDeliveryTrackCodeRequest::SetOrderDeliveryTrackCodeRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SetOrderDeliveryTrackCodeRequest::~SetOrderDeliveryTrackCodeRequest()
{

}

void
SetOrderDeliveryTrackCodeRequest::fromJson(std::string jsonObj)
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
SetOrderDeliveryTrackCodeRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["trackCode"] = getTrackCode();






    object["deliveryServiceId"] = getDeliveryServiceId();



    return object;

}

std::string
SetOrderDeliveryTrackCodeRequest::getTrackCode()
{
	return trackCode;
}

void
SetOrderDeliveryTrackCodeRequest::setTrackCode(std::string  trackCode)
{
	this->trackCode = trackCode;
}

long
SetOrderDeliveryTrackCodeRequest::getDeliveryServiceId()
{
	return deliveryServiceId;
}

void
SetOrderDeliveryTrackCodeRequest::setDeliveryServiceId(long  deliveryServiceId)
{
	this->deliveryServiceId = deliveryServiceId;
}



