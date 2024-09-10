

#include "OrderStatusChangeDeliveryDTO.h"

using namespace Tiny;

OrderStatusChangeDeliveryDTO::OrderStatusChangeDeliveryDTO()
{
	dates = OrderStatusChangeDeliveryDatesDTO();
}

OrderStatusChangeDeliveryDTO::OrderStatusChangeDeliveryDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderStatusChangeDeliveryDTO::~OrderStatusChangeDeliveryDTO()
{

}

void
OrderStatusChangeDeliveryDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *datesKey = "dates";

    if(object.has_key(datesKey))
    {
        bourne::json value = object[datesKey];




        OrderStatusChangeDeliveryDatesDTO* obj = &dates;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrderStatusChangeDeliveryDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["dates"] = getDates().toJson();


    return object;

}

OrderStatusChangeDeliveryDatesDTO
OrderStatusChangeDeliveryDTO::getDates()
{
	return dates;
}

void
OrderStatusChangeDeliveryDTO::setDates(OrderStatusChangeDeliveryDatesDTO  dates)
{
	this->dates = dates;
}



