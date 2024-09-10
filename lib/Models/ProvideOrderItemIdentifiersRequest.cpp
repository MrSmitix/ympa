

#include "ProvideOrderItemIdentifiersRequest.h"

using namespace Tiny;

ProvideOrderItemIdentifiersRequest::ProvideOrderItemIdentifiersRequest()
{
	items = std::list<OrderItemInstanceModificationDTO>();
}

ProvideOrderItemIdentifiersRequest::ProvideOrderItemIdentifiersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProvideOrderItemIdentifiersRequest::~ProvideOrderItemIdentifiersRequest()
{

}

void
ProvideOrderItemIdentifiersRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<OrderItemInstanceModificationDTO> items_list;
        OrderItemInstanceModificationDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
ProvideOrderItemIdentifiersRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OrderItemInstanceModificationDTO> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        OrderItemInstanceModificationDTO obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<OrderItemInstanceModificationDTO>
ProvideOrderItemIdentifiersRequest::getItems()
{
	return items;
}

void
ProvideOrderItemIdentifiersRequest::setItems(std::list <OrderItemInstanceModificationDTO> items)
{
	this->items = items;
}



