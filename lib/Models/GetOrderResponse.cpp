

#include "GetOrderResponse.h"

using namespace Tiny;

GetOrderResponse::GetOrderResponse()
{
	order = OrderDTO();
}

GetOrderResponse::GetOrderResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOrderResponse::~GetOrderResponse()
{

}

void
GetOrderResponse::fromJson(std::string jsonObj)
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
GetOrderResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["order"] = getOrder().toJson();


    return object;

}

OrderDTO
GetOrderResponse::getOrder()
{
	return order;
}

void
GetOrderResponse::setOrder(OrderDTO  order)
{
	this->order = order;
}



