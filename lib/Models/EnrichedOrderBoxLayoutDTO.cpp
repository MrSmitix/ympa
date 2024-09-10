

#include "EnrichedOrderBoxLayoutDTO.h"

using namespace Tiny;

EnrichedOrderBoxLayoutDTO::EnrichedOrderBoxLayoutDTO()
{
	items = std::list<OrderBoxLayoutItemDTO>();
	boxId = long(0);
}

EnrichedOrderBoxLayoutDTO::EnrichedOrderBoxLayoutDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

EnrichedOrderBoxLayoutDTO::~EnrichedOrderBoxLayoutDTO()
{

}

void
EnrichedOrderBoxLayoutDTO::fromJson(std::string jsonObj)
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

    const char *boxIdKey = "boxId";

    if(object.has_key(boxIdKey))
    {
        bourne::json value = object[boxIdKey];



        jsonToValue(&boxId, value, "long");


    }


}

bourne::json
EnrichedOrderBoxLayoutDTO::toJson()
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







    object["boxId"] = getBoxId();



    return object;

}

std::list<OrderBoxLayoutItemDTO>
EnrichedOrderBoxLayoutDTO::getItems()
{
	return items;
}

void
EnrichedOrderBoxLayoutDTO::setItems(std::list <OrderBoxLayoutItemDTO> items)
{
	this->items = items;
}

long
EnrichedOrderBoxLayoutDTO::getBoxId()
{
	return boxId;
}

void
EnrichedOrderBoxLayoutDTO::setBoxId(long  boxId)
{
	this->boxId = boxId;
}



