

#include "FeedbackOrderDTO.h"

using namespace Tiny;

FeedbackOrderDTO::FeedbackOrderDTO()
{
	shopOrderId = std::string();
	delivery = FeedbackDeliveryType();
}

FeedbackOrderDTO::FeedbackOrderDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackOrderDTO::~FeedbackOrderDTO()
{

}

void
FeedbackOrderDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *shopOrderIdKey = "shopOrderId";

    if(object.has_key(shopOrderIdKey))
    {
        bourne::json value = object[shopOrderIdKey];



        jsonToValue(&shopOrderId, value, "std::string");


    }

    const char *deliveryKey = "delivery";

    if(object.has_key(deliveryKey))
    {
        bourne::json value = object[deliveryKey];




        FeedbackDeliveryType* obj = &delivery;
		obj->fromJson(value.dump());

    }


}

bourne::json
FeedbackOrderDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["shopOrderId"] = getShopOrderId();







	object["delivery"] = getDelivery().toJson();


    return object;

}

std::string
FeedbackOrderDTO::getShopOrderId()
{
	return shopOrderId;
}

void
FeedbackOrderDTO::setShopOrderId(std::string  shopOrderId)
{
	this->shopOrderId = shopOrderId;
}

FeedbackDeliveryType
FeedbackOrderDTO::getDelivery()
{
	return delivery;
}

void
FeedbackOrderDTO::setDelivery(FeedbackDeliveryType  delivery)
{
	this->delivery = delivery;
}



