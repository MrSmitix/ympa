

#include "OrderStatusChangeDTO.h"

using namespace Tiny;

OrderStatusChangeDTO::OrderStatusChangeDTO()
{
	status = OrderStatusType();
	substatus = OrderSubstatusType();
	delivery = OrderStatusChangeDeliveryDTO();
}

OrderStatusChangeDTO::OrderStatusChangeDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderStatusChangeDTO::~OrderStatusChangeDTO()
{

}

void
OrderStatusChangeDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OrderStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *substatusKey = "substatus";

    if(object.has_key(substatusKey))
    {
        bourne::json value = object[substatusKey];




        OrderSubstatusType* obj = &substatus;
		obj->fromJson(value.dump());

    }

    const char *deliveryKey = "delivery";

    if(object.has_key(deliveryKey))
    {
        bourne::json value = object[deliveryKey];




        OrderStatusChangeDeliveryDTO* obj = &delivery;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrderStatusChangeDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["substatus"] = getSubstatus().toJson();






	object["delivery"] = getDelivery().toJson();


    return object;

}

OrderStatusType
OrderStatusChangeDTO::getStatus()
{
	return status;
}

void
OrderStatusChangeDTO::setStatus(OrderStatusType  status)
{
	this->status = status;
}

OrderSubstatusType
OrderStatusChangeDTO::getSubstatus()
{
	return substatus;
}

void
OrderStatusChangeDTO::setSubstatus(OrderSubstatusType  substatus)
{
	this->substatus = substatus;
}

OrderStatusChangeDeliveryDTO
OrderStatusChangeDTO::getDelivery()
{
	return delivery;
}

void
OrderStatusChangeDTO::setDelivery(OrderStatusChangeDeliveryDTO  delivery)
{
	this->delivery = delivery;
}



