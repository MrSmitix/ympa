

#include "TransferOrdersFromShipmentRequest.h"

using namespace Tiny;

TransferOrdersFromShipmentRequest::TransferOrdersFromShipmentRequest()
{
	orderIds = std::list<long>();
}

TransferOrdersFromShipmentRequest::TransferOrdersFromShipmentRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

TransferOrdersFromShipmentRequest::~TransferOrdersFromShipmentRequest()
{

}

void
TransferOrdersFromShipmentRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orderIdsKey = "orderIds";

    if(object.has_key(orderIdsKey))
    {
        bourne::json value = object[orderIdsKey];


        std::list<long> orderIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            orderIds_list.push_back(element);
        }
        orderIds = orderIds_list;


    }


}

bourne::json
TransferOrdersFromShipmentRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<long> orderIds_list = getOrderIds();
    bourne::json orderIds_arr = bourne::json::array();

    for(auto& var : orderIds_list)
    {
        orderIds_arr.append(var);
    }
    object["orderIds"] = orderIds_arr;






    return object;

}

std::list<long>
TransferOrdersFromShipmentRequest::getOrderIds()
{
	return orderIds;
}

void
TransferOrdersFromShipmentRequest::setOrderIds(std::list <long> orderIds)
{
	this->orderIds = orderIds;
}



