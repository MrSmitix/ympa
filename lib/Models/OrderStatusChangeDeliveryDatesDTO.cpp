

#include "OrderStatusChangeDeliveryDatesDTO.h"

using namespace Tiny;

OrderStatusChangeDeliveryDatesDTO::OrderStatusChangeDeliveryDatesDTO()
{
	realDeliveryDate = std::string();
}

OrderStatusChangeDeliveryDatesDTO::OrderStatusChangeDeliveryDatesDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderStatusChangeDeliveryDatesDTO::~OrderStatusChangeDeliveryDatesDTO()
{

}

void
OrderStatusChangeDeliveryDatesDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *realDeliveryDateKey = "realDeliveryDate";

    if(object.has_key(realDeliveryDateKey))
    {
        bourne::json value = object[realDeliveryDateKey];




        Date* obj = &realDeliveryDate;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrderStatusChangeDeliveryDatesDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["realDeliveryDate"] = getRealDeliveryDate().toJson();


    return object;

}

Date
OrderStatusChangeDeliveryDatesDTO::getRealDeliveryDate()
{
	return realDeliveryDate;
}

void
OrderStatusChangeDeliveryDatesDTO::setRealDeliveryDate(Date  realDeliveryDate)
{
	this->realDeliveryDate = realDeliveryDate;
}



