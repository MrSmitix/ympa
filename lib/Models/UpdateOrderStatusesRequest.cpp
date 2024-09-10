

#include "UpdateOrderStatusesRequest.h"

using namespace Tiny;

UpdateOrderStatusesRequest::UpdateOrderStatusesRequest()
{
	orders = std::list<OrderStateDTO>();
}

UpdateOrderStatusesRequest::UpdateOrderStatusesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOrderStatusesRequest::~UpdateOrderStatusesRequest()
{

}

void
UpdateOrderStatusesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ordersKey = "orders";

    if(object.has_key(ordersKey))
    {
        bourne::json value = object[ordersKey];


        std::list<OrderStateDTO> orders_list;
        OrderStateDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            orders_list.push_back(element);
        }
        orders = orders_list;


    }


}

bourne::json
UpdateOrderStatusesRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OrderStateDTO> orders_list = getOrders();
    bourne::json orders_arr = bourne::json::array();

    for(auto& var : orders_list)
    {
        OrderStateDTO obj = var;
        orders_arr.append(obj.toJson());
    }
    object["orders"] = orders_arr;




    return object;

}

std::list<OrderStateDTO>
UpdateOrderStatusesRequest::getOrders()
{
	return orders;
}

void
UpdateOrderStatusesRequest::setOrders(std::list <OrderStateDTO> orders)
{
	this->orders = orders;
}



