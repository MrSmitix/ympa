

#include "WarehouseGroupDTO.h"

using namespace Tiny;

WarehouseGroupDTO::WarehouseGroupDTO()
{
	name = std::string();
	mainWarehouse = WarehouseDTO();
	warehouses = std::list<WarehouseDTO>();
}

WarehouseGroupDTO::WarehouseGroupDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

WarehouseGroupDTO::~WarehouseGroupDTO()
{

}

void
WarehouseGroupDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *mainWarehouseKey = "mainWarehouse";

    if(object.has_key(mainWarehouseKey))
    {
        bourne::json value = object[mainWarehouseKey];




        WarehouseDTO* obj = &mainWarehouse;
		obj->fromJson(value.dump());

    }

    const char *warehousesKey = "warehouses";

    if(object.has_key(warehousesKey))
    {
        bourne::json value = object[warehousesKey];


        std::list<WarehouseDTO> warehouses_list;
        WarehouseDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warehouses_list.push_back(element);
        }
        warehouses = warehouses_list;


    }


}

bourne::json
WarehouseGroupDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["mainWarehouse"] = getMainWarehouse().toJson();




    std::list<WarehouseDTO> warehouses_list = getWarehouses();
    bourne::json warehouses_arr = bourne::json::array();

    for(auto& var : warehouses_list)
    {
        WarehouseDTO obj = var;
        warehouses_arr.append(obj.toJson());
    }
    object["warehouses"] = warehouses_arr;




    return object;

}

std::string
WarehouseGroupDTO::getName()
{
	return name;
}

void
WarehouseGroupDTO::setName(std::string  name)
{
	this->name = name;
}

WarehouseDTO
WarehouseGroupDTO::getMainWarehouse()
{
	return mainWarehouse;
}

void
WarehouseGroupDTO::setMainWarehouse(WarehouseDTO  mainWarehouse)
{
	this->mainWarehouse = mainWarehouse;
}

std::list<WarehouseDTO>
WarehouseGroupDTO::getWarehouses()
{
	return warehouses;
}

void
WarehouseGroupDTO::setWarehouses(std::list <WarehouseDTO> warehouses)
{
	this->warehouses = warehouses;
}



