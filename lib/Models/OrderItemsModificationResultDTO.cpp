

#include "OrderItemsModificationResultDTO.h"

using namespace Tiny;

OrderItemsModificationResultDTO::OrderItemsModificationResultDTO()
{
	items = std::list<BriefOrderItemDTO>();
}

OrderItemsModificationResultDTO::OrderItemsModificationResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemsModificationResultDTO::~OrderItemsModificationResultDTO()
{

}

void
OrderItemsModificationResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<BriefOrderItemDTO> items_list;
        BriefOrderItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
OrderItemsModificationResultDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<BriefOrderItemDTO> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        BriefOrderItemDTO obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<BriefOrderItemDTO>
OrderItemsModificationResultDTO::getItems()
{
	return items;
}

void
OrderItemsModificationResultDTO::setItems(std::list <BriefOrderItemDTO> items)
{
	this->items = items;
}



