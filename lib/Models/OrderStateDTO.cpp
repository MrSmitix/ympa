

#include "OrderStateDTO.h"

using namespace Tiny;

OrderStateDTO::OrderStateDTO()
{
	id = long(0);
	status = OrderStatusType();
	substatus = OrderSubstatusType();
}

OrderStateDTO::OrderStateDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderStateDTO::~OrderStateDTO()
{

}

void
OrderStateDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

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


}

bourne::json
OrderStateDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["status"] = getStatus().toJson();






	object["substatus"] = getSubstatus().toJson();


    return object;

}

long
OrderStateDTO::getId()
{
	return id;
}

void
OrderStateDTO::setId(long  id)
{
	this->id = id;
}

OrderStatusType
OrderStateDTO::getStatus()
{
	return status;
}

void
OrderStateDTO::setStatus(OrderStatusType  status)
{
	this->status = status;
}

OrderSubstatusType
OrderStateDTO::getSubstatus()
{
	return substatus;
}

void
OrderStateDTO::setSubstatus(OrderSubstatusType  substatus)
{
	this->substatus = substatus;
}



