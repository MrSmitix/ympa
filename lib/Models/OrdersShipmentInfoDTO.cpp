

#include "OrdersShipmentInfoDTO.h"

using namespace Tiny;

OrdersShipmentInfoDTO::OrdersShipmentInfoDTO()
{
	orderIdsWithLabels = std::list<long>();
	orderIdsWithoutLabels = std::list<long>();
}

OrdersShipmentInfoDTO::OrdersShipmentInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersShipmentInfoDTO::~OrdersShipmentInfoDTO()
{

}

void
OrdersShipmentInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orderIdsWithLabelsKey = "orderIdsWithLabels";

    if(object.has_key(orderIdsWithLabelsKey))
    {
        bourne::json value = object[orderIdsWithLabelsKey];


        std::list<long> orderIdsWithLabels_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            orderIdsWithLabels_list.push_back(element);
        }
        orderIdsWithLabels = orderIdsWithLabels_list;


    }

    const char *orderIdsWithoutLabelsKey = "orderIdsWithoutLabels";

    if(object.has_key(orderIdsWithoutLabelsKey))
    {
        bourne::json value = object[orderIdsWithoutLabelsKey];


        std::list<long> orderIdsWithoutLabels_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            orderIdsWithoutLabels_list.push_back(element);
        }
        orderIdsWithoutLabels = orderIdsWithoutLabels_list;


    }


}

bourne::json
OrdersShipmentInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<long> orderIdsWithLabels_list = getOrderIdsWithLabels();
    bourne::json orderIdsWithLabels_arr = bourne::json::array();

    for(auto& var : orderIdsWithLabels_list)
    {
        orderIdsWithLabels_arr.append(var);
    }
    object["orderIdsWithLabels"] = orderIdsWithLabels_arr;








    std::list<long> orderIdsWithoutLabels_list = getOrderIdsWithoutLabels();
    bourne::json orderIdsWithoutLabels_arr = bourne::json::array();

    for(auto& var : orderIdsWithoutLabels_list)
    {
        orderIdsWithoutLabels_arr.append(var);
    }
    object["orderIdsWithoutLabels"] = orderIdsWithoutLabels_arr;






    return object;

}

Set<long>
OrdersShipmentInfoDTO::getOrderIdsWithLabels()
{
	return orderIdsWithLabels;
}

void
OrdersShipmentInfoDTO::setOrderIdsWithLabels(Set <long> orderIdsWithLabels)
{
	this->orderIdsWithLabels = orderIdsWithLabels;
}

Set<long>
OrdersShipmentInfoDTO::getOrderIdsWithoutLabels()
{
	return orderIdsWithoutLabels;
}

void
OrdersShipmentInfoDTO::setOrderIdsWithoutLabels(Set <long> orderIdsWithoutLabels)
{
	this->orderIdsWithoutLabels = orderIdsWithoutLabels;
}



