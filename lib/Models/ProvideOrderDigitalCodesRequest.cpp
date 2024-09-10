

#include "ProvideOrderDigitalCodesRequest.h"

using namespace Tiny;

ProvideOrderDigitalCodesRequest::ProvideOrderDigitalCodesRequest()
{
	items = std::list<OrderDigitalItemDTO>();
}

ProvideOrderDigitalCodesRequest::ProvideOrderDigitalCodesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProvideOrderDigitalCodesRequest::~ProvideOrderDigitalCodesRequest()
{

}

void
ProvideOrderDigitalCodesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<OrderDigitalItemDTO> items_list;
        OrderDigitalItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
ProvideOrderDigitalCodesRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OrderDigitalItemDTO> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        OrderDigitalItemDTO obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<OrderDigitalItemDTO>
ProvideOrderDigitalCodesRequest::getItems()
{
	return items;
}

void
ProvideOrderDigitalCodesRequest::setItems(std::list <OrderDigitalItemDTO> items)
{
	this->items = items;
}



