

#include "OrderItemInstanceModificationDTO.h"

using namespace Tiny;

OrderItemInstanceModificationDTO::OrderItemInstanceModificationDTO()
{
	id = long(0);
	instances = std::list<BriefOrderItemInstanceDTO>();
}

OrderItemInstanceModificationDTO::OrderItemInstanceModificationDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemInstanceModificationDTO::~OrderItemInstanceModificationDTO()
{

}

void
OrderItemInstanceModificationDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


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
OrderItemInstanceModificationDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();





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
OrderItemInstanceModificationDTO::getId()
{
	return id;
}

void
OrderItemInstanceModificationDTO::setId(long  id)
{
	this->id = id;
}

std::list<BriefOrderItemInstanceDTO>
OrderItemInstanceModificationDTO::getInstances()
{
	return instances;
}

void
OrderItemInstanceModificationDTO::setInstances(std::list <BriefOrderItemInstanceDTO> instances)
{
	this->instances = instances;
}



