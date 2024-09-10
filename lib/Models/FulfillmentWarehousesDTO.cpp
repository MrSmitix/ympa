

#include "FulfillmentWarehousesDTO.h"

using namespace Tiny;

FulfillmentWarehousesDTO::FulfillmentWarehousesDTO()
{
	warehouses = std::list<FulfillmentWarehouseDTO>();
}

FulfillmentWarehousesDTO::FulfillmentWarehousesDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FulfillmentWarehousesDTO::~FulfillmentWarehousesDTO()
{

}

void
FulfillmentWarehousesDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *warehousesKey = "warehouses";

    if(object.has_key(warehousesKey))
    {
        bourne::json value = object[warehousesKey];


        std::list<FulfillmentWarehouseDTO> warehouses_list;
        FulfillmentWarehouseDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warehouses_list.push_back(element);
        }
        warehouses = warehouses_list;


    }


}

bourne::json
FulfillmentWarehousesDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<FulfillmentWarehouseDTO> warehouses_list = getWarehouses();
    bourne::json warehouses_arr = bourne::json::array();

    for(auto& var : warehouses_list)
    {
        FulfillmentWarehouseDTO obj = var;
        warehouses_arr.append(obj.toJson());
    }
    object["warehouses"] = warehouses_arr;




    return object;

}

std::list<FulfillmentWarehouseDTO>
FulfillmentWarehousesDTO::getWarehouses()
{
	return warehouses;
}

void
FulfillmentWarehousesDTO::setWarehouses(std::list <FulfillmentWarehouseDTO> warehouses)
{
	this->warehouses = warehouses;
}



