

#include "GetOrdersStatsRequest.h"

using namespace Tiny;

GetOrdersStatsRequest::GetOrdersStatsRequest()
{
	dateFrom = std::string();
	dateTo = std::string();
	updateFrom = std::string();
	updateTo = std::string();
	orders = std::list<long>();
	statuses = std::list<OrderStatsStatusType>();
	hasCis = bool(false);
}

GetOrdersStatsRequest::GetOrdersStatsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOrdersStatsRequest::~GetOrdersStatsRequest()
{

}

void
GetOrdersStatsRequest::fromJson(std::string jsonObj)
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

    const char *updateFromKey = "updateFrom";

    if(object.has_key(updateFromKey))
    {
        bourne::json value = object[updateFromKey];




        Date* obj = &updateFrom;
		obj->fromJson(value.dump());

    }

    const char *updateToKey = "updateTo";

    if(object.has_key(updateToKey))
    {
        bourne::json value = object[updateToKey];




        Date* obj = &updateTo;
		obj->fromJson(value.dump());

    }

    const char *ordersKey = "orders";

    if(object.has_key(ordersKey))
    {
        bourne::json value = object[ordersKey];


        std::list<long> orders_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            orders_list.push_back(element);
        }
        orders = orders_list;


    }

    const char *statusesKey = "statuses";

    if(object.has_key(statusesKey))
    {
        bourne::json value = object[statusesKey];


        std::list<OrderStatsStatusType> statuses_list;
        OrderStatsStatusType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            statuses_list.push_back(element);
        }
        statuses = statuses_list;


    }

    const char *hasCisKey = "hasCis";

    if(object.has_key(hasCisKey))
    {
        bourne::json value = object[hasCisKey];



        jsonToValue(&hasCis, value, "bool");


    }


}

bourne::json
GetOrdersStatsRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();






	object["updateFrom"] = getUpdateFrom().toJson();






	object["updateTo"] = getUpdateTo().toJson();




    std::list<long> orders_list = getOrders();
    bourne::json orders_arr = bourne::json::array();

    for(auto& var : orders_list)
    {
        orders_arr.append(var);
    }
    object["orders"] = orders_arr;








    std::list<OrderStatsStatusType> statuses_list = getStatuses();
    bourne::json statuses_arr = bourne::json::array();

    for(auto& var : statuses_list)
    {
        OrderStatsStatusType obj = var;
        statuses_arr.append(obj.toJson());
    }
    object["statuses"] = statuses_arr;







    object["hasCis"] = isHasCis();



    return object;

}

Date
GetOrdersStatsRequest::getDateFrom()
{
	return dateFrom;
}

void
GetOrdersStatsRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GetOrdersStatsRequest::getDateTo()
{
	return dateTo;
}

void
GetOrdersStatsRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

Date
GetOrdersStatsRequest::getUpdateFrom()
{
	return updateFrom;
}

void
GetOrdersStatsRequest::setUpdateFrom(Date  updateFrom)
{
	this->updateFrom = updateFrom;
}

Date
GetOrdersStatsRequest::getUpdateTo()
{
	return updateTo;
}

void
GetOrdersStatsRequest::setUpdateTo(Date  updateTo)
{
	this->updateTo = updateTo;
}

std::list<long>
GetOrdersStatsRequest::getOrders()
{
	return orders;
}

void
GetOrdersStatsRequest::setOrders(std::list <long> orders)
{
	this->orders = orders;
}

std::list<OrderStatsStatusType>
GetOrdersStatsRequest::getStatuses()
{
	return statuses;
}

void
GetOrdersStatsRequest::setStatuses(std::list <OrderStatsStatusType> statuses)
{
	this->statuses = statuses;
}

bool
GetOrdersStatsRequest::isHasCis()
{
	return hasCis;
}

void
GetOrdersStatsRequest::setHasCis(bool  hasCis)
{
	this->hasCis = hasCis;
}



