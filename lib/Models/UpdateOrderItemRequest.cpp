

#include "UpdateOrderItemRequest.h"

using namespace Tiny;

UpdateOrderItemRequest::UpdateOrderItemRequest()
{
	items = std::list<OrderItemModificationDTO>();
	reason = OrderItemsModificationRequestReasonType();
}

UpdateOrderItemRequest::UpdateOrderItemRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOrderItemRequest::~UpdateOrderItemRequest()
{

}

void
UpdateOrderItemRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<OrderItemModificationDTO> items_list;
        OrderItemModificationDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *reasonKey = "reason";

    if(object.has_key(reasonKey))
    {
        bourne::json value = object[reasonKey];




        OrderItemsModificationRequestReasonType* obj = &reason;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateOrderItemRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OrderItemModificationDTO> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        OrderItemModificationDTO obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;








	object["reason"] = getReason().toJson();


    return object;

}

std::list<OrderItemModificationDTO>
UpdateOrderItemRequest::getItems()
{
	return items;
}

void
UpdateOrderItemRequest::setItems(std::list <OrderItemModificationDTO> items)
{
	this->items = items;
}

OrderItemsModificationRequestReasonType
UpdateOrderItemRequest::getReason()
{
	return reason;
}

void
UpdateOrderItemRequest::setReason(OrderItemsModificationRequestReasonType  reason)
{
	this->reason = reason;
}



