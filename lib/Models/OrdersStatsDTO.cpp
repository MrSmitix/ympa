

#include "OrdersStatsDTO.h"

using namespace Tiny;

OrdersStatsDTO::OrdersStatsDTO()
{
	orders = std::list<OrdersStatsOrderDTO>();
	paging = ForwardScrollingPagerDTO();
}

OrdersStatsDTO::OrdersStatsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsDTO::~OrdersStatsDTO()
{

}

void
OrdersStatsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ordersKey = "orders";

    if(object.has_key(ordersKey))
    {
        bourne::json value = object[ordersKey];


        std::list<OrdersStatsOrderDTO> orders_list;
        OrdersStatsOrderDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            orders_list.push_back(element);
        }
        orders = orders_list;


    }

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ForwardScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrdersStatsDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OrdersStatsOrderDTO> orders_list = getOrders();
    bourne::json orders_arr = bourne::json::array();

    for(auto& var : orders_list)
    {
        OrdersStatsOrderDTO obj = var;
        orders_arr.append(obj.toJson());
    }
    object["orders"] = orders_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

std::list<OrdersStatsOrderDTO>
OrdersStatsDTO::getOrders()
{
	return orders;
}

void
OrdersStatsDTO::setOrders(std::list <OrdersStatsOrderDTO> orders)
{
	this->orders = orders;
}

ForwardScrollingPagerDTO
OrdersStatsDTO::getPaging()
{
	return paging;
}

void
OrdersStatsDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



