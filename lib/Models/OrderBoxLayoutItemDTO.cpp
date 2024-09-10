

#include "OrderBoxLayoutItemDTO.h"

using namespace Tiny;

OrderBoxLayoutItemDTO::OrderBoxLayoutItemDTO()
{
	id = long(0);
	fullCount = int(0);
	partialCount = OrderBoxLayoutPartialCountDTO();
	instances = std::list<BriefOrderItemInstanceDTO>();
}

OrderBoxLayoutItemDTO::OrderBoxLayoutItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderBoxLayoutItemDTO::~OrderBoxLayoutItemDTO()
{

}

void
OrderBoxLayoutItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *fullCountKey = "fullCount";

    if(object.has_key(fullCountKey))
    {
        bourne::json value = object[fullCountKey];



        jsonToValue(&fullCount, value, "int");


    }

    const char *partialCountKey = "partialCount";

    if(object.has_key(partialCountKey))
    {
        bourne::json value = object[partialCountKey];




        OrderBoxLayoutPartialCountDTO* obj = &partialCount;
		obj->fromJson(value.dump());

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
OrderBoxLayoutItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["fullCount"] = getFullCount();







	object["partialCount"] = getPartialCount().toJson();




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
OrderBoxLayoutItemDTO::getId()
{
	return id;
}

void
OrderBoxLayoutItemDTO::setId(long  id)
{
	this->id = id;
}

int
OrderBoxLayoutItemDTO::getFullCount()
{
	return fullCount;
}

void
OrderBoxLayoutItemDTO::setFullCount(int  fullCount)
{
	this->fullCount = fullCount;
}

OrderBoxLayoutPartialCountDTO
OrderBoxLayoutItemDTO::getPartialCount()
{
	return partialCount;
}

void
OrderBoxLayoutItemDTO::setPartialCount(OrderBoxLayoutPartialCountDTO  partialCount)
{
	this->partialCount = partialCount;
}

std::list<BriefOrderItemInstanceDTO>
OrderBoxLayoutItemDTO::getInstances()
{
	return instances;
}

void
OrderBoxLayoutItemDTO::setInstances(std::list <BriefOrderItemInstanceDTO> instances)
{
	this->instances = instances;
}



