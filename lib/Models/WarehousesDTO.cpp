

#include "WarehousesDTO.h"

using namespace Tiny;

WarehousesDTO::WarehousesDTO()
{
	warehouses = std::list<WarehouseDTO>();
	warehouseGroups = std::list<WarehouseGroupDTO>();
}

WarehousesDTO::WarehousesDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

WarehousesDTO::~WarehousesDTO()
{

}

void
WarehousesDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *warehouseGroupsKey = "warehouseGroups";

    if(object.has_key(warehouseGroupsKey))
    {
        bourne::json value = object[warehouseGroupsKey];


        std::list<WarehouseGroupDTO> warehouseGroups_list;
        WarehouseGroupDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warehouseGroups_list.push_back(element);
        }
        warehouseGroups = warehouseGroups_list;


    }


}

bourne::json
WarehousesDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<WarehouseDTO> warehouses_list = getWarehouses();
    bourne::json warehouses_arr = bourne::json::array();

    for(auto& var : warehouses_list)
    {
        WarehouseDTO obj = var;
        warehouses_arr.append(obj.toJson());
    }
    object["warehouses"] = warehouses_arr;






    std::list<WarehouseGroupDTO> warehouseGroups_list = getWarehouseGroups();
    bourne::json warehouseGroups_arr = bourne::json::array();

    for(auto& var : warehouseGroups_list)
    {
        WarehouseGroupDTO obj = var;
        warehouseGroups_arr.append(obj.toJson());
    }
    object["warehouseGroups"] = warehouseGroups_arr;




    return object;

}

std::list<WarehouseDTO>
WarehousesDTO::getWarehouses()
{
	return warehouses;
}

void
WarehousesDTO::setWarehouses(std::list <WarehouseDTO> warehouses)
{
	this->warehouses = warehouses;
}

std::list<WarehouseGroupDTO>
WarehousesDTO::getWarehouseGroups()
{
	return warehouseGroups;
}

void
WarehousesDTO::setWarehouseGroups(std::list <WarehouseGroupDTO> warehouseGroups)
{
	this->warehouseGroups = warehouseGroups;
}



