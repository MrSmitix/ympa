

#include "SearchShipmentsRequest.h"

using namespace Tiny;

SearchShipmentsRequest::SearchShipmentsRequest()
{
	dateFrom = std::string();
	dateTo = std::string();
	statuses = std::list<ShipmentStatusType>();
	orderIds = std::list<long>();
	cancelledOrders = bool(false);
}

SearchShipmentsRequest::SearchShipmentsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SearchShipmentsRequest::~SearchShipmentsRequest()
{

}

void
SearchShipmentsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dateFromKey = "dateFrom";

    if(object.has_key(dateFromKey))
    {
        bourne::json value = object[dateFromKey];




        Date* obj = &dateFrom;
		obj->fromJson(value.dump());

    }

    const char *dateToKey = "dateTo";

    if(object.has_key(dateToKey))
    {
        bourne::json value = object[dateToKey];




        Date* obj = &dateTo;
		obj->fromJson(value.dump());

    }

    const char *statusesKey = "statuses";

    if(object.has_key(statusesKey))
    {
        bourne::json value = object[statusesKey];


        std::list<ShipmentStatusType> statuses_list;
        ShipmentStatusType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            statuses_list.push_back(element);
        }
        statuses = statuses_list;


    }

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

    const char *cancelledOrdersKey = "cancelledOrders";

    if(object.has_key(cancelledOrdersKey))
    {
        bourne::json value = object[cancelledOrdersKey];



        jsonToValue(&cancelledOrders, value, "bool");


    }


}

bourne::json
SearchShipmentsRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();




    std::list<ShipmentStatusType> statuses_list = getStatuses();
    bourne::json statuses_arr = bourne::json::array();

    for(auto& var : statuses_list)
    {
        ShipmentStatusType obj = var;
        statuses_arr.append(obj.toJson());
    }
    object["statuses"] = statuses_arr;






    std::list<long> orderIds_list = getOrderIds();
    bourne::json orderIds_arr = bourne::json::array();

    for(auto& var : orderIds_list)
    {
        orderIds_arr.append(var);
    }
    object["orderIds"] = orderIds_arr;









    object["cancelledOrders"] = isCancelledOrders();



    return object;

}

Date
SearchShipmentsRequest::getDateFrom()
{
	return dateFrom;
}

void
SearchShipmentsRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
SearchShipmentsRequest::getDateTo()
{
	return dateTo;
}

void
SearchShipmentsRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

Set<ShipmentStatusType>
SearchShipmentsRequest::getStatuses()
{
	return statuses;
}

void
SearchShipmentsRequest::setStatuses(Set <ShipmentStatusType> statuses)
{
	this->statuses = statuses;
}

Set<long>
SearchShipmentsRequest::getOrderIds()
{
	return orderIds;
}

void
SearchShipmentsRequest::setOrderIds(Set <long> orderIds)
{
	this->orderIds = orderIds;
}

bool
SearchShipmentsRequest::isCancelledOrders()
{
	return cancelledOrders;
}

void
SearchShipmentsRequest::setCancelledOrders(bool  cancelledOrders)
{
	this->cancelledOrders = cancelledOrders;
}



