

#include "GetChatsRequest.h"

using namespace Tiny;

GetChatsRequest::GetChatsRequest()
{
	orderIds = std::list<long>();
	types = std::list<ChatType>();
	statuses = std::list<ChatStatusType>();
}

GetChatsRequest::GetChatsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetChatsRequest::~GetChatsRequest()
{

}

void
GetChatsRequest::fromJson(std::string jsonObj)
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

    const char *typesKey = "types";

    if(object.has_key(typesKey))
    {
        bourne::json value = object[typesKey];


        std::list<ChatType> types_list;
        ChatType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            types_list.push_back(element);
        }
        types = types_list;


    }

    const char *statusesKey = "statuses";

    if(object.has_key(statusesKey))
    {
        bourne::json value = object[statusesKey];


        std::list<ChatStatusType> statuses_list;
        ChatStatusType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            statuses_list.push_back(element);
        }
        statuses = statuses_list;


    }


}

bourne::json
GetChatsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<long> orderIds_list = getOrderIds();
    bourne::json orderIds_arr = bourne::json::array();

    for(auto& var : orderIds_list)
    {
        orderIds_arr.append(var);
    }
    object["orderIds"] = orderIds_arr;








    std::list<ChatType> types_list = getTypes();
    bourne::json types_arr = bourne::json::array();

    for(auto& var : types_list)
    {
        ChatType obj = var;
        types_arr.append(obj.toJson());
    }
    object["types"] = types_arr;






    std::list<ChatStatusType> statuses_list = getStatuses();
    bourne::json statuses_arr = bourne::json::array();

    for(auto& var : statuses_list)
    {
        ChatStatusType obj = var;
        statuses_arr.append(obj.toJson());
    }
    object["statuses"] = statuses_arr;




    return object;

}

std::list<long>
GetChatsRequest::getOrderIds()
{
	return orderIds;
}

void
GetChatsRequest::setOrderIds(std::list <long> orderIds)
{
	this->orderIds = orderIds;
}

std::list<ChatType>
GetChatsRequest::getTypes()
{
	return types;
}

void
GetChatsRequest::setTypes(std::list <ChatType> types)
{
	this->types = types;
}

std::list<ChatStatusType>
GetChatsRequest::getStatuses()
{
	return statuses;
}

void
GetChatsRequest::setStatuses(std::list <ChatStatusType> statuses)
{
	this->statuses = statuses;
}



