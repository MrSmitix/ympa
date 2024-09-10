

#include "OrderBoxLayoutDTO.h"

using namespace Tiny;

OrderBoxLayoutDTO::OrderBoxLayoutDTO()
{
	items = std::list<OrderBoxLayoutItemDTO>();
}

OrderBoxLayoutDTO::OrderBoxLayoutDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderBoxLayoutDTO::~OrderBoxLayoutDTO()
{

}

void
OrderBoxLayoutDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<OrderBoxLayoutItemDTO> items_list;
        OrderBoxLayoutItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
OrderBoxLayoutDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OrderBoxLayoutItemDTO> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        OrderBoxLayoutItemDTO obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<OrderBoxLayoutItemDTO>
OrderBoxLayoutDTO::getItems()
{
	return items;
}

void
OrderBoxLayoutDTO::setItems(std::list <OrderBoxLayoutItemDTO> items)
{
	this->items = items;
}



