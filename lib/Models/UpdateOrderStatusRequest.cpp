

#include "UpdateOrderStatusRequest.h"

using namespace Tiny;

UpdateOrderStatusRequest::UpdateOrderStatusRequest()
{
	order = OrderStatusChangeDTO();
}

UpdateOrderStatusRequest::UpdateOrderStatusRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOrderStatusRequest::~UpdateOrderStatusRequest()
{

}

void
UpdateOrderStatusRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orderKey = "order";

    if(object.has_key(orderKey))
    {
        bourne::json value = object[orderKey];




        OrderStatusChangeDTO* obj = &order;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateOrderStatusRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["order"] = getOrder().toJson();


    return object;

}

OrderStatusChangeDTO
UpdateOrderStatusRequest::getOrder()
{
	return order;
}

void
UpdateOrderStatusRequest::setOrder(OrderStatusChangeDTO  order)
{
	this->order = order;
}



