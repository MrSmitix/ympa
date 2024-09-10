

#include "UpdateStockDTO.h"

using namespace Tiny;

UpdateStockDTO::UpdateStockDTO()
{
	sku = std::string();
	items = std::list<UpdateStockItemDTO>();
}

UpdateStockDTO::UpdateStockDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateStockDTO::~UpdateStockDTO()
{

}

void
UpdateStockDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *skuKey = "sku";

    if(object.has_key(skuKey))
    {
        bourne::json value = object[skuKey];



        jsonToValue(&sku, value, "std::string");


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<UpdateStockItemDTO> items_list;
        UpdateStockItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
UpdateStockDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["sku"] = getSku();





    std::list<UpdateStockItemDTO> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        UpdateStockItemDTO obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::string
UpdateStockDTO::getSku()
{
	return sku;
}

void
UpdateStockDTO::setSku(std::string  sku)
{
	this->sku = sku;
}

std::list<UpdateStockItemDTO>
UpdateStockDTO::getItems()
{
	return items;
}

void
UpdateStockDTO::setItems(std::list <UpdateStockItemDTO> items)
{
	this->items = items;
}



