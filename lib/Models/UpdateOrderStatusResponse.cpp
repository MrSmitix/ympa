

#include "UpdateOrderStatusResponse.h"

using namespace Tiny;

UpdateOrderStatusResponse::UpdateOrderStatusResponse()
{
	order = OrderDTO();
}

UpdateOrderStatusResponse::UpdateOrderStatusResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOrderStatusResponse::~UpdateOrderStatusResponse()
{

}

void
UpdateOrderStatusResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orderKey = "order";

    if(object.has_key(orderKey))
    {
        bourne::json value = object[orderKey];




        OrderDTO* obj = &order;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateOrderStatusResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["order"] = getOrder().toJson();


    return object;

}

OrderDTO
UpdateOrderStatusResponse::getOrder()
{
	return order;
}

void
UpdateOrderStatusResponse::setOrder(OrderDTO  order)
{
	this->order = order;
}



