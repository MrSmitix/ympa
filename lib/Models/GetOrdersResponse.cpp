

#include "GetOrdersResponse.h"

using namespace Tiny;

GetOrdersResponse::GetOrdersResponse()
{
	pager = FlippingPagerDTO();
	orders = std::list<OrderDTO>();
	paging = ForwardScrollingPagerDTO();
}

GetOrdersResponse::GetOrdersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOrdersResponse::~GetOrdersResponse()
{

}

void
GetOrdersResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pagerKey = "pager";

    if(object.has_key(pagerKey))
    {
        bourne::json value = object[pagerKey];




        FlippingPagerDTO* obj = &pager;
		obj->fromJson(value.dump());

    }

    const char *ordersKey = "orders";

    if(object.has_key(ordersKey))
    {
        bourne::json value = object[ordersKey];


        std::list<OrderDTO> orders_list;
        OrderDTO element;
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
GetOrdersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["pager"] = getPager().toJson();




    std::list<OrderDTO> orders_list = getOrders();
    bourne::json orders_arr = bourne::json::array();

    for(auto& var : orders_list)
    {
        OrderDTO obj = var;
        orders_arr.append(obj.toJson());
    }
    object["orders"] = orders_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

FlippingPagerDTO
GetOrdersResponse::getPager()
{
	return pager;
}

void
GetOrdersResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}

std::list<OrderDTO>
GetOrdersResponse::getOrders()
{
	return orders;
}

void
GetOrdersResponse::setOrders(std::list <OrderDTO> orders)
{
	this->orders = orders;
}

ForwardScrollingPagerDTO
GetOrdersResponse::getPaging()
{
	return paging;
}

void
GetOrdersResponse::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



