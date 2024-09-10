

#include "OrderItemModificationDTO.h"

using namespace Tiny;

OrderItemModificationDTO::OrderItemModificationDTO()
{
	id = long(0);
	count = int(0);
	instances = std::list<BriefOrderItemInstanceDTO>();
}

OrderItemModificationDTO::OrderItemModificationDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemModificationDTO::~OrderItemModificationDTO()
{

}

void
OrderItemModificationDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *instancesKey = "instances";

    if(object.has_key(instancesKey))
    {
        bourne::json value = object[instancesKey];


        std::list<BriefOrderItemInstanceDTO> instances_list;
        BriefOrderItemInstanceDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            instances_list.push_back(element);
        }
        instances = instances_list;


    }


}

bourne::json
OrderItemModificationDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["count"] = getCount();





    std::list<BriefOrderItemInstanceDTO> instances_list = getInstances();
    bourne::json instances_arr = bourne::json::array();

    for(auto& var : instances_list)
    {
        BriefOrderItemInstanceDTO obj = var;
        instances_arr.append(obj.toJson());
    }
    object["instances"] = instances_arr;




    return object;

}

long
OrderItemModificationDTO::getId()
{
	return id;
}

void
OrderItemModificationDTO::setId(long  id)
{
	this->id = id;
}

int
OrderItemModificationDTO::getCount()
{
	return count;
}

void
OrderItemModificationDTO::setCount(int  count)
{
	this->count = count;
}

std::list<BriefOrderItemInstanceDTO>
OrderItemModificationDTO::getInstances()
{
	return instances;
}

void
OrderItemModificationDTO::setInstances(std::list <BriefOrderItemInstanceDTO> instances)
{
	this->instances = instances;
}



