

#include "UpdateOrderStatusesDTO.h"

using namespace Tiny;

UpdateOrderStatusesDTO::UpdateOrderStatusesDTO()
{
	orders = std::list<UpdateOrderStatusDTO>();
}

UpdateOrderStatusesDTO::UpdateOrderStatusesDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOrderStatusesDTO::~UpdateOrderStatusesDTO()
{

}

void
UpdateOrderStatusesDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ordersKey = "orders";

    if(object.has_key(ordersKey))
    {
        bourne::json value = object[ordersKey];


        std::list<UpdateOrderStatusDTO> orders_list;
        UpdateOrderStatusDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            orders_list.push_back(element);
        }
        orders = orders_list;


    }


}

bourne::json
UpdateOrderStatusesDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateOrderStatusDTO> orders_list = getOrders();
    bourne::json orders_arr = bourne::json::array();

    for(auto& var : orders_list)
    {
        UpdateOrderStatusDTO obj = var;
        orders_arr.append(obj.toJson());
    }
    object["orders"] = orders_arr;




    return object;

}

std::list<UpdateOrderStatusDTO>
UpdateOrderStatusesDTO::getOrders()
{
	return orders;
}

void
UpdateOrderStatusesDTO::setOrders(std::list <UpdateOrderStatusDTO> orders)
{
	this->orders = orders;
}



